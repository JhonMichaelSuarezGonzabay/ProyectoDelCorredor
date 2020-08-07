import java.util.Scanner;

public class Corredor {
	  int energia=100; 
	
	public void verificarEnergia() {
		if(energia>0 && energia<=100) {
			System.out.println("La energia actual es de " + energia + "%");
			 }else {
			energia=0;
			energiaAgotada();
		      } 
		menu();	
	}

	public void recargarEnergia() {
		if(energia<100) {
			   energia+=15;
			   energiaAgotada();
		}else {
				energia=100;
			    energiaAgotada();
		    }
			menu();
		}
	
	public  void Correr() {
		if(energia<=0) {
			energiaAgotada();
	} else if(energia>0){
		   energia-=10;
			}
			menu();
		}
		
	public void entrenar() {
		if(energia<100) {
      		 energia+=15;
             energiaAgotada();
		 }else {
			energia=100;
		    energiaAgotada();
		     }
		menu();
		}
		
	public void energiaAgotada() {
		if(energia>=100) {
			energia=100;
		System.out.println("----La energia ya esta al maximo,energia = " +energia+ "%----\n");
	   }else if(energia==0) {
			System.out.println("----La energia ya esta al minimo,energia = " +energia+ "%----\n");
		                    }
	}		

	public void menu() {
		System.out.println("Que desea hacer \n");

		System.out.println("1.Verificar la Energia");
		System.out.println("2.Correr");
		System.out.println("3.Recargar energia");
		System.out.println("4.Entrenar");
		
		System.out.println("DIGITE OPCION:");
		Scanner en = new Scanner(System.in);
		int opcion=en.nextInt();
		switch (opcion) {
		case 1:verificarEnergia();break;
		case 2:Correr();break;
		case 3:recargarEnergia();break;
		case 4:entrenar();break;
		
		}
		
	}

	public static void main(String[] args) {
		Corredor corredor1=new Corredor();
		corredor1.menu();
		}
	}