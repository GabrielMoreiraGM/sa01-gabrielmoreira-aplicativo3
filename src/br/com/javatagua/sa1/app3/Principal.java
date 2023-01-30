package br.com.javatagua.sa1.app3;//pacote
import br.com.javatagua.sa1.bo.AssentoBO;

import javax.swing.JOptionPane;

public class Principal {//classe

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pega a resposta em string (texto)
		String resp = JOptionPane.showInputDialog("Digite a qtde de aviões:");
		//Converte a resposta para inteiro
		int qtdeAvioes = Integer.parseInt(resp);
		
		//Criar o objeto
		AssentoBO abo = new AssentoBO ();
		
		JOptionPane.showMessageDialog(null,"Qtde Geral de Assentos: "+abo.calcularAssentos(qtdeAvioes));
		

	}

}
