package firstcode;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterIsAcceptingJobs;

public class Menubasedtest {
			  
			  public static void main(String[] args) {
				PrimeExample primeExample = new PrimeExample();
			     FactorialE factorialE=new FactorialE();
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter your choice");
				System.out.println("1-->prime");
				System.out.println("2-->fact");
				System.out.println("3-->exit");
				System.out.println("Enter your choice");
				int choice=scanner.nextInt();
				if(choice==1)
				{
					primeExample.testPrime();
				}
				else if(choice==2) {
					factorialE.testFactorial();
				}   
			  }
}			class FactorialE{
				public void testFactorial() {
					int i,fact=1;  
					  int number=5;//It is the number to calculate factorial    
					  for(i=1;i<=number;i++){    
					      fact=fact*i;    
					  }    
					  System.out.println("Factorial of "+number+" is: "+fact);    
					 }
					}  
		 class PrimeExample {    
			 public void testPrime() {    
			  int i,m=0,flag=0;      
			  int n=3;//it is the number to be checked    
			  m=n/2;      
			  if(n==0||n==1){  
			   System.out.println(n+" is not prime number");      
			  }else{  
			   for(i=2;i<=m;i++){      
			    if(n%i==0){      
			     System.out.println(n+" is not prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  { System.out.println(n+" is prime number"); }  
			  }//end of else  
			}    
			}   
