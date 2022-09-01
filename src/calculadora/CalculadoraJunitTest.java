package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class CalculadoraJunitTest {
		
				
			
			
			//Aqui estamos fazendo uma soma com 2 n�meros inteiros e positivos, com o resultado esperado = 15
			@SuppressWarnings("deprecation")
			@Test
			void SomarDoisNumerosPositivos() {
			Somar soma = new Somar();
			int somar = soma.somar(10, 5);
			Assert.assertEquals(15, somar);
			}
			
			//Aqui estamos fazendo uma soma com um n�mero inteiro e o outro neutro, com o resultado esperado = 10
			@SuppressWarnings("deprecation")
			@Test
			void SomarUmInteiroComNeutro() {
			Somar soma2 = new Somar();
			int somar2 = soma2.somar(10, 0);
			Assert.assertEquals(10, somar2);
		    }
			
			//Aqui estamos fazendo uma soma com dois n�meros neutros, com o resultado esperado = 0
			@SuppressWarnings("deprecation")
			@Test
			void SomarDoisNeutros() {
		    Somar soma3 = new Somar();
			int somar3 = soma3.somar(0, 0);
			Assert.assertEquals(0, somar3);
		    }
			
			//Aqui estamos fazendo uma soma com dois numeros inteiros e o segundo n�mero negativo, com o resultado esperado = 5
			@SuppressWarnings("deprecation")
			@Test
			void SomarUmIntPositivoComIntNegativo() {
			Somar soma4 = new Somar();
			int somar4 = soma4.somar(10, -5);
			Assert.assertEquals(5, somar4);
			}
			
			//Aqui estamos fazendo uma soma com dois numeros inteiros e negativos, com o resultado esperado = -15
			@SuppressWarnings("deprecation")
			@Test
			void SomarUmIntNegativoComIntNegativo() {
			Somar soma5 = new Somar();
			int somar5 = soma5.somar(-10, -5);
			Assert.assertEquals(-15, somar5);
			}
			
			//Aqui estamos fazendo uma soma com dois numeros inteiros e o primeiro negativo, com o resultado esperado = 5
			@SuppressWarnings("deprecation")
			@Test
			void SomarUmIntNegativoComIntPositivo() {
			Somar soma6 = new Somar();
			int somar6 = soma6.somar(-10, 5);
			Assert.assertEquals(5, somar6);
			}
			
			//********************************************************
			
			//Aqui estamos fazendo uma multiplica��o com dois n�meros inteiros, com resultado esperado = 50
			@SuppressWarnings("deprecation")
			@Test
			void MultiplicarUmIntPositivoComIntPositivo() {
			Multiplicacao mult = new Multiplicacao();
			int multiplicar = mult.multiplicao(10, 5);
			Assert.assertEquals(50, multiplicar);
			}
			
			//Aqui estamos fazendo uma multiplica��o com um n�mero inteiro e o outro neutro, com o resultado esperado = 0
			@SuppressWarnings("deprecation")
			@Test
			void MultiplicarUmIntPositivoComNeutro() {
			Multiplicacao mult2 = new Multiplicacao();
			int multiplicar1 = mult2.multiplicao(10, 0);
			Assert.assertEquals(0, multiplicar1);
			}
			
			//Aqui estamos fazendo uma multiplica��o com dois n�meros inteiros e o segundo negativo, com o resultado esperado = -50
			@SuppressWarnings("deprecation")
			@Test
			void MultiplicarUmIntPositivoComIntNegativo() {
			Multiplicacao mult3 = new Multiplicacao();
			int multiplicar3 = mult3.multiplicao(10, -5);
			Assert.assertEquals(-50, multiplicar3);
			}
			
			//Aqui estamos fazendo uma multiplica��o com dois n�meros neutros , com o resultado esperado = 0
			@SuppressWarnings("deprecation")
			@Test
			void MultiplicarUmNeutroComNeutro() {
			Multiplicacao mult4 = new Multiplicacao();
			int multiplicar4 = mult4.multiplicao(0, 0);
			Assert.assertEquals(0, multiplicar4);
			}

			
			//Aqui estamos fazendo uma multiplica��o com dois n�meros inteiros e negativos , com o resultado esperado = -25
			@SuppressWarnings("deprecation")
			@Test
			void MultiplicarUmIntNegativoComIntNegativo() {
			Multiplicacao mult5 = new Multiplicacao();
			int multiplicar5 = mult5.multiplicao(-5, -5);
			Assert.assertEquals(25, multiplicar5);
			}
			
			
			//Aqui estamos fazendo uma multiplica��o com dois n�meros inteiros e o primeiro negativo , com o resultado esperado = 25
			@SuppressWarnings("deprecation")
			@Test
			void MultiplicarUmIntNegativoComIntPositivo() {
			Multiplicacao mult6 = new Multiplicacao();
			int multiplicar6 = mult6.multiplicao(-5, 5);
			Assert.assertEquals(-25, multiplicar6);
			}
			
			//**************************************************
			
			
			//Aqui estamos fazendo uma subtra��o com dois n�metos inteiros, com o resultado esperado = 5
			@SuppressWarnings("deprecation")
			@Test
			void SubtrairUmIntPositivoComIntPositivo() {
			Subtracao sub = new Subtracao();
			int subtracao = sub.subtracao(10, 5);
			Assert.assertEquals(5, subtracao);
			}
			
			//Aqui estamos fazendo uma subtra��o com um n�mero inteiro e o outro neutro, com o resultado esperado = 10
			@SuppressWarnings("deprecation")
			@Test
			void SubtrairUmIntPositivoComNeutro() {
			Subtracao sub2 = new Subtracao();
			int subtracao2 = sub2.subtracao(10, 0);
			Assert.assertEquals(10, subtracao2);
			}
			
			//Aqui estamos fazendo uma subtra��o com dois n�meros inteiros e o segundo negativo, com o resultado esperado = 5
			@SuppressWarnings("deprecation")
			@Test
			void SubtrairUmIntPositivoComIntNegativo() {
			Subtracao sub3 = new Subtracao();
			int subtracao3 = sub3.subtracao(10, -5);
			Assert.assertEquals(5, subtracao3);
			}
			
			//Aqui estamos fazendo uma subtra��o com dois n�meros neutros, com o resultado esperado = 0
			@SuppressWarnings("deprecation")
			@Test
			void SubtrairUmNeutroComNeutro() {
			Subtracao sub4 = new Subtracao();
			int subtracao4 = sub4.subtracao(0, 0);
			Assert.assertEquals(0, subtracao4);
			}
			
			//Aqui estamos fazendo uma subtra��o com dois n�meros inteiros e o primeiro negativo, com o resultado esperado = -15
			@SuppressWarnings("deprecation")
			@Test
			void SubtrairUmIntNegativoComIntPositivo() {
			Subtracao sub5 = new Subtracao();
			int subtracao5 = sub5.subtracao(-10, 5);
			Assert.assertEquals(-15, subtracao5);
			}
			
			//*********************************************
			
			
			//Aqui estamos fazendo uma divis�o com dois n�meros inteiros, com o resultado esperado = 2
			@SuppressWarnings("deprecation")
			@Test
			void DividirUmIntPositivoComIntPositivo() {
			Dividir div = new Dividir();
			int dividir = div.dividir(10, 5);
			Assert.assertEquals(-15, dividir);
			}
			
			//Aqui estamos fazendo uma divis�o com dois n�meros inteiros e o segundo negativo, com o resultado esperado = -2
			@SuppressWarnings("deprecation")
			@Test
			void DividirUmIntPositivoComIntNegativo() {
			Dividir div2 = new Dividir();
			int dividir2 = div2.dividir(10, -5);
			Assert.assertEquals(-2, dividir2);
			}
			
			//Aqui estamos fazendo uma divis�o com dois n�meros inteiros e negatibos, com o resultado esperado = 2
			@SuppressWarnings("deprecation")
			@Test
			void DividirUmIntNegativoComIntNegativo() {
			Dividir div3 = new Dividir();
			int dividir3 = div3.dividir(-10, -5);
			Assert.assertEquals(2, dividir3);
			}
			
			/*Aqui estamos fazendo uma divis�o com os n�meros 5 / 3 com o resultado esperado = 1,66, Mas temos o resultado inesperado = O
			 Para solu��o o programador poderia mudar o tipo da vari�vel resultado para float.*/
			@SuppressWarnings("deprecation")
			@Test
			void DividirUmIntPositivoImparComIntPositivoImpar() {
			Dividir div4 = new Dividir();
			int dividir4 = div4.dividir(5, 3);
			Assert.assertEquals(-1.6, dividir4);
			}
			
			////Aqui estamos fazendo uma divis�o com dois n�meros inteiros e o primeiro � negativo, com o resultado esperado = -1
			@SuppressWarnings("deprecation")
			@Test
			void DividirUmIntNegativoComIntPositivo() {
			Dividir div6 = new Dividir();
			int dividir6 = div6.dividir(-5, 5);
			Assert.assertEquals(-1, dividir6);
			}
			
			//Aqui estamos fazendo uma divis�o com dois n�mero inteiros, com o resultado esperado de um erro, pois o divisor n�o pode ser maior que o dividendo
			@SuppressWarnings("deprecation")
			@Test
			void DividirUmIntPositvoComIntPositivo() {
			Dividir div7 = new Dividir();
			int dividir7 = div7.dividir(10, 10);
			Assert.assertEquals(1, dividir7);
			}
			
			//Aqui estamos fazendo uma divis�o com um n�mero inteiro e o outro neutro, com o resultado esperado de um erro, pois nenhum n�mero pode ser dividido por 0
			@SuppressWarnings("deprecation")
			@Test
			void DividirUmIntPositivoComNeutro() {
			Dividir div5 = new Dividir();
			int dividir5 = div5.dividir(1, 0);
			Assert.assertEquals(null, dividir5);
			}
			
			
			
		}
		

