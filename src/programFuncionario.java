import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class programFuncionario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		List<Funcionario> funcionario1 = new ArrayList<>();
		System.out.println("Quantos funcionários serão registrados? ");
		int Qtd = scan.nextInt();

		for (int a = 1; a <= Qtd; a++) {
			System.out.println("Funcionário #" + a);
			System.out.println("Id: ");
			int Id = scan.nextInt();
			System.out.println("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.println("Salário: ");
			double salario = scan.nextDouble();
			funcionario1.add(new Funcionario(Id, nome, salario));

		}

		System.out.println();

		System.out.println("Entre com o ID que sofrerá um aumento de salário: ");
		int id = scan.nextInt();
		Funcionario emp = funcionario1.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = scan.nextDouble();
			emp.increaseSalary(percentage);
		}

		for (Funcionario obj : funcionario1) {
			System.out.println(obj.getSalario());
		}

		scan.close();

	}

}
