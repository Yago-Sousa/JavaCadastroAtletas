import java.util.Scanner;


public class Principal {
	public static void main(String[] args){
		System.out.println("Bem vindo ao COB");
		System.out.println("Quantos atletas deseja cadastrar?");
		Scanner sc = new Scanner(System.in);
		int qtdeAtletas = sc.nextInt();
		sc.nextLine();
		
		Atleta[] atletas = CadastroDeAtletas.cadastrarAtletas(qtdeAtletas);
		
		 //Apresentar todos os esportes que possuem atletas nas Olimpíadas;
		CadastroDeAtletas.apresentarEsportes(atletas, Olimpiada.OLIMPIADA);
		
		//Apresentar todos os esportes que possuem atletas nas Paralimpíadas;
		CadastroDeAtletas.apresentarEsportes(atletas, Olimpiada.PARALIMPIADA);
		
		//Apresentar o quadro geral de medalhas com quantidade de ouro, prata e bronze nas Olimpíadas;
		CadastroDeAtletas.apresentarQuadroDeMedalhas(atletas, Olimpiada.OLIMPIADA);
		
		//Apresentar o quadro geral de medalhas com quantidade de ouro, prata e bronze nas Paralimpíadas;
		CadastroDeAtletas.apresentarQuadroDeMedalhas(atletas, Olimpiada.PARALIMPIADA);

		//Listar o primeiro nome (em letra maiúscula, considere a primeira palavra de cada nome) de todos os atletas cadastrados;
		CadastroDeAtletas.apresentarPrimeirosNomes(atletas);
		
		 //Se o Brasil atingir a meta de 3 medalhas de ouro nas Olimpíadas ou 5 nas Paralimpíadas apresentar que a meta do COB foi alcançada.
		CadastroDeAtletas.apresentarMetaCob(atletas);
	}
}
