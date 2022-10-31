"# aula" 

import java.util.Scanner;
public class ATIVIDADE {
 public static void main (String[]args) {
	 Scanner entrada = new Scanner (System.in);
	 
	 double salario, decimo, novoSalario=0.0,ferias=0.0;
	 int contador=1, opcao, meses;
	 
	     while(contador!=0) {
		 System.out.print("\n\nDigite a opção desejada: \n1(Novo Salário)\n2(Férias)\n3(Décimo Terceiro)\n4(Sair)");
		 opcao=entrada.nextInt();
		 
		 if(opcao==1) {
			 System.out.print("\nDigite seu salário: ");
			 salario=entrada.nextDouble();
			 
			 if(salario<=350) {
				 novoSalario=salario+(salario*0.15);
			 }if(salario>350 && salario<=600) {
			     novoSalario=salario+(salario*0.10);
			 }if(salario>600) {
				 novoSalario=salario+(salario*0.05);
			 } System.out.print("\nSeu novo salario é de: "+novoSalario);
		     }
		     
		 if(opcao==2) {
			 System.out.print("\nDigite seu salário: ");
			 salario=entrada.nextDouble();
			 
			 ferias=salario+(salario/3);
			 
			 System.out.print("\nO valor de suas ferias é de: "+ferias);
		 }
		 
		 if(opcao==3) {
			 System.out.print("\nDigite seu salário: ");
			 salario=entrada.nextDouble();
			 
			 System.out.print("\nDigite seus meses trabalhados: ");
			 meses=entrada.nextInt();
			 
			 decimo=(salario*meses)/12;
			 
			 System.out.print("\nO seu décimo terceiro é: "+decimo);
		 }
		 
		 if(opcao==4) {
			 contador--;
			 System.out.print("\nPrograma encerrado");
		 }
	 }
 }
}

