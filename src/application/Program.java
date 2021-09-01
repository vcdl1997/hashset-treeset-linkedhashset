package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
	
		System.out.println("--------- HashSet ----------");
		// � extremamente r�pido por�m n�o garante a ordem dos elementos
		Set<String> set = new HashSet<String>(); 
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
		
		System.out.println("----------------------------");
		System.out.println("--------- TreeSet ----------");
		
		/*
		 * A diferen�a do TreeSet para o HashSet, 
		 * est� pelo fato do primeiro ordenar seus elementos por ordem alfab�tica
		*/ 
		set = new TreeSet<String>(); 
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
		
		System.out.println("----------------------------");
		System.out.println("------ LinkedHashSet -------");
		
		/*
		 * A diferen�a do LinkedHashSet para os demais, 
		 * est� pelo fato deste manter a ordem de inser��o dos elementos.		
		*/ 
		set = new LinkedHashSet<String>(); 
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		set.remove("Tablet");
		set.removeIf(x -> x.indexOf("book") > -1);

		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
		
		Set<Integer> a = new TreeSet<Integer>(Arrays.asList(0,2,4,5,6,8,10)); 
		Set<Integer> b = new TreeSet<Integer>(Arrays.asList(5,6,7,8,9,10));
		
		// Uni�o
		Set<Integer> c = new TreeSet<Integer>(a);
		c.addAll(b);
		System.out.println(c);
		
		// Intersec��o
		Set<Integer> d = new TreeSet<Integer>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// Diferen�a
		Set<Integer> e = new TreeSet<Integer>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
