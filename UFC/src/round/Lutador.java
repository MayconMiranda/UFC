package round;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		this.setNome(no);
		this.setNacionalidade(na);
		this.setIdade(id);
		this.setAltura(al);
		this.setPeso(pe);
		this.setVitorias(vi);
		this.setDerrotas(de);
		this.setEmpates(em);
	}
	
	public void apresentar() {
		System.out.println("CHEGOU A HORA VAMOS APRESENTAR O LUTADOR "+this.getNome());
		System.out.println("diretamente de "+this.getNacionalidade());
		System.out.println("com "+this.getIdade()+" anos de idade");
		System.out.println(" e "+this.getAltura()+" m de altura");
		System.out.println("pesando: "+this.getPeso()+"kg");
		System.out.println("ganhou: "+this.getVitorias()+" vezes ");
		System.out.println("perdeu: "+this.getDerrotas()+" vezes");
		System.out.println("empatou: "+this.getEmpates()+" vezes");
	}
	
	public void status() {
		System.out.println(this.getNome()+" é um peso "+this.getCategoria());
		System.out.println("com "+this.getVitorias()+" vitórias");
		System.out.println("e "+this.getDerrotas()+" derrotas");
		System.out.println("mais "+this.getEmpates()+" empates");
		
	}
	
	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);;
	}
	
	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String no) {
		this.nome = no;
	}

	private String getNacionalidade() {
		return nacionalidade;
	}

	private void setNacionalidade(String na) {
		this.nacionalidade = na;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int id) {
		this.idade = id;
	}

	private float getAltura() {
		return altura;
	}

	private void setAltura(float al) {
		this.altura = al;
	}

	private float getPeso() {
		return peso;
	}

	private void setPeso(float pe) {
		this.peso = pe;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(peso<52.2) {
			this.categoria = "invalido";
		}else if(peso<=70.3) {
			this.categoria ="leve";
		}else if(peso<=83.9) {
			this.categoria ="médio";
		}else if(peso<=120.2) {
			this.categoria="pesado";
		}else {
			this.categoria="invalido";
		}
	}

	private int getVitorias() {
		return vitorias;
	}

	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	private int getDerrotas() {
		return derrotas;
	}

	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	private int getEmpates() {
		return empates;
	}

	private void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
}
