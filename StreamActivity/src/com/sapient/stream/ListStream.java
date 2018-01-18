package com.sapient.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class ListStream {


	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>();
		List<Integer> lst2=new ArrayList<>();
		lst.add(5);
		lst.add(15);
		lst.add(19);
		lst.add(25);
		lst.add(3);
		lst.add(4);
		lst.add(6);
		lst.add(31);
		lst2.add(10);
		lst2.add(18);
		lst2.add(54);
		lst2.add(39);
		lst2.add(30);
		lst2.add(70);
		Stream<List<Integer>> s=Stream.of(lst,lst2);
		
		lst.stream().filter((n)->n%5==0).forEach(System.out::println);
		System.out.println("------------");
		lst.stream().map((n)->n*n).forEach(System.out::println);
		System.out.println("-----------------");
		lst.stream().sorted((i,j)->i.compareTo(j)).forEach(System.out::println);
		System.out.println("---------------");
		s.flatMap((p)->p.stream()).forEach(System.out::println);
		System.out.println("---------------");
		OptionalInt opt1=lst.stream().mapToInt(i->i).min();
		System.out.println("minimum value"+opt1.getAsInt());
		OptionalInt opt2=lst.stream().mapToInt(i->i).max();
		System.out.println("maximum value"+opt2.getAsInt());
		int opt3=lst.stream().mapToInt(i->i).sum();
		System.out.println("total value"+opt3);
		OptionalDouble opt4=lst.stream().mapToInt(i->i).average();
		System.out.println("average value"+opt4.getAsDouble());
		Long size=lst.stream().filter((i)->i%5==0).count();
		System.out.println("no.of integers divisible by 5 is "+ size);
		long prod=lst.stream().map(i->i).reduce(1,(x,y)->x*y);
		System.out.println(prod);
		
		
		
		

	}

}
