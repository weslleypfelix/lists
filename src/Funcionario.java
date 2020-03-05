
public class Funcionario {

	private int Id;
	private String nome;
	private double salario;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	private void setSalario(double salario) {
		this.salario = salario;
	}

	
	public void increaseSalary(double percentage) {
		salario += salario * percentage / 100.0;
	}
	
	
	public Funcionario(int id, String nome, double salario) {
		Id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

}
