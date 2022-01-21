package collections;

import java.util.HashSet;
import java.util.Set;

public class SetConjuntoheterogeneo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('a');		
		System.out.println("tamanho é " + conjunto.size()); //tamanho é 5
		
		conjunto.remove('a');
		System.out.println("tamanho é " + conjunto.size()); //tamanho é 4

		System.out.println(conjunto.contains(1.2)); //true
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums); // [1, 2, 3]
		
		//unir 2 conjuntos
		conjunto.addAll(nums);
		System.out.println(conjunto); //[1.2, teste, 1, 2, 3, true]
		
		//reter apenas o valor em comum.
		conjunto.retainAll(nums);
		System.out.println(conjunto); // 1
		
		//deletar tudo
		conjunto.clear();
		System.out.println(conjunto); //[]
	}

}
