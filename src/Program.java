import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Tania");
		list.add("Luiz");
		list.add("Andrey");
		list.add("Weslley");
		list.add("Yuri");
		list.add("Yago");
		list.add(2, "Israel"); //*Deste modo, adc ele. a partir da pos.2 */
		list.add("Pluto");
		list.remove("Pluto");
		
		System.out.println(list.size());
		System.out.println();
		
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("=====================a");
		/* O que fora feito aqui ? Eu utilizei conceitos para remover nomes que começam com a letra Y
		Indicando pela posição 1
		list.removeIf(x -> x.charAt(0) == 'L');
		for(String x : list) {
			System.out.println(x);
		}
		
		Acaso eu queira filtrar minha lista inteira, de maneira que fique apenas os nomes que começam com a letra '	w' 
		Eu simplesmente crio uma nova lista
		
		
		list.removeIf(x -> x.charAt(0) != 'Y');
		for(String x : list) {
			System.out.println(x);
		}
		*/
		
		
		
		
		
		
		
		
		//System.out.println("Index of Weslley: " + list.indexOf("Weslley"));
		System.out.println("=====================");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("=====================");
		
		
		//list.removeIf(x -> x.charAt(0) != 'Y');
		String name = list.stream().filter(x -> x.charAt(0) == 'Y').findFirst().orElse(null);
		System.out.println(name);
		
		
		
	}

}
