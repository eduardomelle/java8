package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Teste {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Michelli", true, "123");
		Cliente c2 = new Cliente("Bruno", true, "456");
		
		MostraCliente mc = new MostraCliente();
		
		List<Cliente> clientes = Arrays.asList(c1, c2);
		clientes.forEach(mc);
		
		Spliterator<Cliente> spliterator = clientes.spliterator();
		System.out.println(spliterator);
	}

}
