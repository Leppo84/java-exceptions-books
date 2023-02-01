package exceptions.books;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
//			int n = 1;

			Book[]myCollection = new Book[1];
			
			Scanner s= new Scanner(System.in);
			
			String titolo = "";
			String autore, editore;
			int pagine;
			
//			eccezione title
			try {
				
				System.out.println("Inserire titolo");
				titolo=(s.nextLine());
				
			} catch (Exception e) {

				System.out.println("Titolo non corretto");
				
			}
			
			
			System.out.println("Inserire autore");
			autore=(s.nextLine());
			
//			eccezione author		
			
			System.out.println("Inserire editore");
			editore=(s.nextLine());
			
//			eccezione editor

			System.out.println("Inserire numero pagine");
			pagine=(s.nextInt());
			
//			eccezione pagine
			try {
			Book libro = new Book(titolo,autore,editore,pagine); 
			
			myCollection[0] = libro;

			System.out.println("Il libro è stato inserito nella collezione");
			} catch (Exception e) {

				System.out.println("Titolo non corretto");
				e.getMessage();
			}

//			System.out.println(libro.toString());
//			devo cercare l'output giusto;
			
			s.close();

			
	}
	
}
