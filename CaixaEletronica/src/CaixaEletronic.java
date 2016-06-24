import java.util.Scanner;

public class CaixaEletronic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int saque; 
		int temporario; 
		
		int cem = 0, cinquenta = 0, dez = 0, cinco = 0, um = 0;
	
		int temp; 
		
		
		saque=784; 
		
	
	System.out.print("Informe o valor do saque (valor inteiro): ");
	
	//Hallo
	
	 
	  saque = Integer.parseInt(entrada.nextLine());

	 
	  temp = saque;


	  if(temp >= 100){
	    cem = saque / 100;
	    temp = saque % 100;
	  }
	  
	  if(temp >= 50){
	    cinquenta = temp / 50;
	    temp = temp % 50;
	  }
	
	  if(temp >= 10){
	    dez = temp / 10;
	    temp = temp % 10;
	  }
	  
	  if(temp >= 5){
	    cinco = temp / 5;
	    temp = temp % 5;
	  }
	  
	  if(temp >= 1){
	    um = temp / 1;
	  }

	  
	  System.out.println("O valor do saque pode ser expresso em:");
	  System.out.printf("%d notas de 100\n", cem);
	  System.out.printf("%d notas de 50\n", cinquenta);
	  System.out.printf("%d notas de 10\n", dez);
	  System.out.printf("%d notas de 5\n", cinco);
	  System.out.printf("%d notas de 1\n", um);
	}

	}

