package Exercicio;

public class Main {

	public static void main(String[] args) {
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("Tabela && (and/e)");
		System.out.println("b1 && b3: " + (b1 && b3));
		System.out.println("b3 && b4: " + (b3 && b4));
		System.out.println("b2 && b3: " + (b2 && b3));
		System.out.println("b2 && b4: " + (b2 && b4));
		
		System.out.println("Tabela || (or/ou)");
		System.out.println("b1 || b3: " + (b1 || b3));
		System.out.println("b3 || b4: " + (b3 || b4));
		System.out.println("b2 || b3: " + (b2 || b3));
		System.out.println("b2 || b4: " + (b2 || b4));
		
		System.out.println("Tabela ^ (xor)");
		System.out.println("b1 ^ b3: " + (b1 ^ b3));
		System.out.println("b3 ^ b4: " + (b3 ^ b4));
		System.out.println("b2 ^ b3: " + (b2 ^ b3));
		System.out.println("b2 ^ b4: " + (b2 ^ b4));
		
		System.out.println("Tabela ! (invers?o)");
		System.out.println("Invers?o de b1: " + (!b1));
		System.out.println("Invers?o de b2: " + (!b2));
		
		int i1 = 10;
		int i2 = 5;
		float f1 = 20f;
		float f2 = 50f;
		System.out.println("((i1 * i2) < (f2 - f1)) && true: " + (((i1 * i2) < (f2 - f1)) && true));
		
		double salarioMensal = 11893.58d;
		double mediaSalarial = 10500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		System.out.println("Recebe auxilio? " + ((salarioMensal < mediaSalarial) && (quantidadeDependentes >= mediaDependentes)));
		
		boolean salarioBaixo = salarioMensal < mediaSalarial;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		System.out.println("Recebe auxilio? " + ((salarioBaixo) && (muitosDependentes)));
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		
		System.out.println("Recebe auxilio? " + recebeAuxilio);
		
		
		
		
		
				
		
		
	}

}
