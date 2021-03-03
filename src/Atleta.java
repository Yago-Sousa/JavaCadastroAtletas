
public class Atleta {
	private String nome;
	private int tipoOlimpiada;
	private int esportePraticado;
	private int qtdeMedalhasOuro; 
	private int qtdeMedalhasPrata;
	private int qtdeMedalhasBronze;

	public Atleta(){
		
	}
	
	public Atleta(String nome,
					int tipoOlimpiada, 
					int esportePraticado,
					int qtdeMedalhasOuro,
					int qtdeMedalhasPrata,
					int qtdeMedalhasBronze
					)		{
		this.nome = nome;
		this.tipoOlimpiada = tipoOlimpiada;
		this.esportePraticado = esportePraticado;
		this.qtdeMedalhasOuro = qtdeMedalhasOuro;
		this.qtdeMedalhasPrata = qtdeMedalhasPrata;
		this.qtdeMedalhasBronze = qtdeMedalhasBronze;
	}
	
	public void setQtdeMedalhasBronze(int qtdeMedalhasBronze){
		this.qtdeMedalhasBronze = qtdeMedalhasBronze;
	}
	public int getQtdeMedalhasBronze(){
		return this.qtdeMedalhasBronze;
	}
	
	
	public void setQtdeMedalhasPrata(int qtdeMedalhasPrata){
		this.qtdeMedalhasPrata = qtdeMedalhasPrata;
	}
	public int getQtdeMedalhasPrata(){
		return this.qtdeMedalhasPrata;
	}

	
	
	public void setQtdeMedalhasOuro(int qtdeMedalhasOuro){
		this.qtdeMedalhasOuro = qtdeMedalhasOuro;
	}
	public int getQtdeMedalhasOuro(){
		return this.qtdeMedalhasOuro;
	}
	
	
	public void setEsportePraticado(int esportePraticado){
		this.esportePraticado = esportePraticado;
	}
	public int getEsportePraticado(){
		return this.esportePraticado;
	}
	
	
	public void setTipoOlimpiada(int tipoOlimpiada){
		this.tipoOlimpiada = tipoOlimpiada;
	}
	public int getTipoOlimpiada(){
		return this.tipoOlimpiada;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	

}
