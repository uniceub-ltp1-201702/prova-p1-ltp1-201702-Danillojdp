//Jorge Danillo 21603818

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BDSimulado bds = new BDSimulado();

		 
		System.out.println("2a");
			System.out.println(bds.getInfoCliente("Otaviano Neves"));

		
		
		
				System.out.println("\n 2c");
				System.out.println("ligações por UF: " + bds.ligacoesPorUF("DF"));
		
		System.out.println("2b");
			ArrayList<Ligacao> ligacoesPorCliente = bds.ligacoesPorCliente("Otaviano Neves");
		for (int i = 0; i < ligacoesPorCliente.size(); i++) {
			System.out.println(ligacoesPorCliente.get(i));
		}

		

		
		System.out.println("2d ");
		ArrayList<Integer> ligacoesUFDiferente = bds.ligacoesUFDiferente();
			for (int i = 0; i < ligacoesUFDiferente.size(); i++) {
				System.out.println(ligacoesUFDiferente.get(i));
		}

		
		
		System.out.println("3a");
			ArrayList<Ligacao> contaCliente = bds.contaCliente("Otaviano Neves");
				for (int i = 0; i < contaCliente.size(); i++) {
					System.out.println(contaCliente.get(i));

		}

	}	



}
