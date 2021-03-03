import java.util.Scanner;


public class CadastroDeAtletas {
	private static final int META_COB_OLIMPIADA = 3;
	private static final int META_COB_PARALIMPIADA = 5;
	
	
	public static Atleta[] cadastrarAtletas(int qtdeAtletas){
		Atleta[] atletas = new Atleta[qtdeAtletas];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<atletas.length; i++){
			System.out.println("\nInforme o nome do atleta: ");
			String nome = sc.nextLine();
			
			System.out.println("Pertence a qual Olimpiada? (1-Olimpiada) (2-Paralimpiada): ");
			int tipoOlimpiada = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Pratica qual esporte? (1-Atletismo) (2-Natacao) (3-Ginastica): ");
			int esporte = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Quantas medalhas de ouro? ");
			int qtdMelhadasOuro = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Quantas medalhas de prata? ");
			int qtdMelhadasPrata = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Quantas medalhas de bronze? ");
			int qtdMelhadasBronze = sc.nextInt();
			sc.nextLine();
			
			atletas[i] = new Atleta(nome, tipoOlimpiada, esporte, qtdMelhadasOuro, qtdMelhadasPrata, qtdMelhadasBronze);
		}
		return atletas;
	}
	
	
	public static void apresentarEsportes(Atleta[] atletas, int tipoOlimpiada){
		System.out.println("\nEsportes da "+
			(tipoOlimpiada == Olimpiada.OLIMPIADA ? "Olimpiada" : "Paralimpiada"));
		
		boolean existeEsporteAtletismo = false;
		boolean existeEsporteNatacao = false;
		boolean existeEsporteGinastica = false;
		
		for(int i=0; i<atletas.length; i++){
			if(atletas[i].getTipoOlimpiada() == tipoOlimpiada){
				if(atletas[i].getEsportePraticado() == Esporte.ATLETISMO)
					existeEsporteAtletismo = true;
				if(atletas[i].getEsportePraticado() == Esporte.NATACAO)
					existeEsporteNatacao = true;
				if(atletas[i].getEsportePraticado() == Esporte.GINASTICA)
					existeEsporteGinastica = true;
			}
		}
		
		if(existeEsporteAtletismo)
			System.out.println("Atletismo");
		if(existeEsporteNatacao)
			System.out.println("Natacao");
		if(existeEsporteGinastica)
			System.out.println("Ginastica");
	}
	
	public static void apresentarQuadroDeMedalhas(Atleta[] atletas, int tipoOlimpiada){
		
		System.out.println("\nQuadro De Medalhas da "+
				(tipoOlimpiada == Olimpiada.OLIMPIADA ? "Olimpiada" : "Paralimpiada"));

		int somaOuro = 0;
		int somaPrata = 0;
		int somaBronze = 0;
		
		for(int i=0; i<atletas.length; i++){
			if(atletas[i].getTipoOlimpiada() == tipoOlimpiada){
				somaOuro+=atletas[i].getQtdeMedalhasOuro();
				somaPrata+=atletas[i].getQtdeMedalhasPrata();
				somaBronze+=atletas[i].getQtdeMedalhasBronze();
			}
		}
		
		System.out.println("\nOuro\tPrata\tBronze");
		System.out.println(somaOuro+"\t"+somaPrata+"\t"+somaBronze);
	}
	
	public static void apresentarPrimeirosNomes(Atleta[] atletas){
		System.out.println("\nAtletas Cadastrados:");
		for(Atleta atleta: atletas){
			System.out.println(atleta.getNome().split(" ")[0].toUpperCase().trim());
		}
	}
	
	public static void apresentarMetaCob(Atleta[] atletas){
		int somaTotalOuroOlimpiada = 0;
		int somaTotalOuroParalimpiada = 0;
		for(Atleta atleta: atletas){
			if(atleta.getTipoOlimpiada() == Olimpiada.OLIMPIADA){
				somaTotalOuroOlimpiada+=atleta.getQtdeMedalhasOuro();
			}
			else if(atleta.getTipoOlimpiada() == Olimpiada.PARALIMPIADA){
				somaTotalOuroParalimpiada+=atleta.getQtdeMedalhasOuro();
			}
		}
		if(somaTotalOuroOlimpiada >= META_COB_OLIMPIADA 
				|| somaTotalOuroParalimpiada >= META_COB_PARALIMPIADA){
			System.out.println("O COB atingiu a meta de medalhas =) ");
		}
		else
			System.out.println("O COB NAO atingiu a meta de medalhas =( ");
	}
	
}
