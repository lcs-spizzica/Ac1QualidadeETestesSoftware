package calculadora;

public class CalculadoraTestes{
	
	public static void main (String [] args) {
		System.out.println("Somar\n");
		//Aqui estamos fazendo uma soma com 2 números inteiros e positivos, com o resultado esperado = 15
	    Somar soma = new Somar();
		int somar = soma.somar(10, 5);
		System.out.println("Soma1: " + somar);
		
		//Aqui estamos fazendo uma soma com um número inteiro e o outro neutro, com o resultado esperado = 10
	    Somar soma2 = new Somar();
		int somar2 = soma.somar(10, 0);
		System.out.println("Soma2: " + somar2);
		
		//Aqui estamos fazendo uma soma com dois números neutros, com o resultado esperado = 0
	    Somar soma3 = new Somar();
		int somar3 = soma.somar(0, 0);
		System.out.println("Soma3: " + somar3);
		
		//Aqui estamos fazendo uma soma com dois numeros inteiros e o segundo número negativo, com o resultado esperado = 5
	    Somar soma4 = new Somar();
		int somar4 = soma.somar(10, -5);
		System.out.println("Soma4: " + somar4);
		
		//Aqui estamos fazendo uma soma com dois numeros inteiros e negativos, com o resultado esperado = -15
	    Somar soma5 = new Somar();
		int somar5 = soma.somar(-10, -5);
		System.out.println("Soma5: " + somar5);
		
		//Aqui estamos fazendo uma soma com dois numeros inteiros e o primeiro negativo, com o resultado esperado = 5
	    Somar soma6 = new Somar();
		int somar6 = soma.somar(-10, 5);
		System.out.println("Soma6: " + somar5);
		//********************************************************
		
		System.out.println("\nMultiplicar\n");
		//Aqui estamos fazendo uma multiplicação com dois números inteiros, com resultado esperado = 50
		Multiplicacao mult = new Multiplicacao();
		int multiplicar = mult.multiplicao(10, 5);
		System.out.println("Multiplicação1: " +multiplicar);
		
		
		//Aqui estamos fazendo uma multiplicação com um número inteiro e o outro neutro, com o resultado esperado = 0
		Multiplicacao mult2 = new Multiplicacao();
		int multiplicar1 = mult2.multiplicao(10, 0);
		System.out.println("Multiplicação2: " +multiplicar1);
		
		//Aqui estamos fazendo uma multiplicação com dois números inteiros e o segundo negativo, com o resultado esperado = -50
		Multiplicacao mult3 = new Multiplicacao();
		int multiplicar3 = mult3.multiplicao(10, -5);
		System.out.println("Multiplicação3: " + multiplicar3);
		
		//Aqui estamos fazendo uma multiplicação com dois números neutros , com o resultado esperado = 0
		Multiplicacao mult4 = new Multiplicacao();
		int multiplicar4 = mult4.multiplicao(0, 0);
		System.out.println("Multiplicação4: " + multiplicar4);
		
		//Aqui estamos fazendo uma multiplicação com dois números inteiros e negativos , com o resultado esperado = -25
		Multiplicacao mult5 = new Multiplicacao();
		int multiplicar5 = mult5.multiplicao(-5, -5);
		System.out.println("Multiplicação5: " + multiplicar5);
		
		//Aqui estamos fazendo uma multiplicação com dois números inteiros e o primeiro negativo , com o resultado esperado = 25
		Multiplicacao mult6 = new Multiplicacao();
		int multiplicar6 = mult6.multiplicao(-5, 5);
		System.out.println("Multiplicação6: " + multiplicar6);
		//**************************************************
		
		System.out.println("\nSubtrair\n");
		//Aqui estamos fazendo uma subtração com dois númetos inteiros, com o resultado esperado = 5
		Subtracao sub = new Subtracao();
		int subtracao = sub.subtracao(10, 5);
		System.out.println("Subtração1: " + subtracao);
		
		//Aqui estamos fazendo uma subtração com um número inteiro e o outro neutro, com o resultado esperado = 10
		Subtracao sub2 = new Subtracao();
		int subtracao2 = sub2.subtracao(10, 0);
		System.out.println("Subtração2: " + subtracao2);
		
		//Aqui estamos fazendo uma subtração com dois números inteiros e o segundo negativo, com o resultado esperado = 5
		Subtracao sub3 = new Subtracao();
		int subtracao3 = sub3.subtracao(10, -5);
		System.out.println("Subtração3: " + subtracao3);
		
		//Aqui estamos fazendo uma subtração com dois números neutros, com o resultado esperado = 0
		Subtracao sub4 = new Subtracao();
		int subtracao4 = sub4.subtracao(0, 0);
		System.out.println("Subtração4: " + subtracao4);
		
		
		//Aqui estamos fazendo uma subtração com dois números inteiros e o primeiro negativo, com o resultado esperado = -15
		Subtracao sub5 = new Subtracao();
		int subtracao5 = sub.subtracao(-10, 5);
		System.out.println("Subtração5: " + subtracao5);
		//*********************************************
		
		System.out.println("\nDividir\n");
		//Aqui estamos fazendo uma divisão com dois números inteiros, com o resultado esperado = 2
		Dividir div = new Dividir();
		int dividir = div.dividir(10, 5);
		System.out.println("Dividir1: " + dividir);
		
		//Aqui estamos fazendo uma divisão com dois números inteiros e o segundo negativo, com o resultado esperado = -2
		Dividir div2 = new Dividir();
		int dividir2 = div2.dividir(10, -5);
		System.out.println("Dividir2: " +dividir2);
		
		//Aqui estamos fazendo uma divisão com dois números inteiros e negatibos, com o resultado esperado = 2
		Dividir div3 = new Dividir();
		int dividir3 = div3.dividir(-10, -5);
		System.out.println("Dividir3: " +dividir3);
		
		/*Aqui estamos fazendo uma divisão com os números 5 / 3 com o resultado esperado = 1,66, Mas temos o resultado inesperado = O
		 Para solução o programador poderia mudar o tipo da variável resultado para float.*/
		Dividir div4 = new Dividir();
		int dividir4 = div4.dividir(5, 3);
		System.out.println("Dividir4: " +dividir4);
		
		////Aqui estamos fazendo uma divisão com dois números inteiros e o primeiro é negativo, com o resultado esperado = -1
		Dividir div6 = new Dividir();
		int dividir6 = div4.dividir(-5, 5);
		System.out.println("Dividir5: " +dividir6);
		
		//Aqui estamos fazendo uma divisão com dois número inteiros, com o resultado esperado de um erro, pois o divisor não pode ser maior que o dividendo
		Dividir div7 = new Dividir();
		int dividir7 = div7.dividir(5, 10);
		System.out.println("Dividir6: " +dividir7);
		
		//Aqui estamos fazendo uma divisão com um número inteiro e o outro neutro, com o resultado esperado de um erro, pois nenhum número pode ser dividido por 0
		Dividir div5 = new Dividir();
		int dividir5 = div5.dividir(1, 0);
		System.out.println("Dividir6: " +dividir5);
		
		
		
	}
	}

