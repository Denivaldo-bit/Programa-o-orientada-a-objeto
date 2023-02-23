/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	   String mensa = "ola mundo! acabou o carnaval " + (10+20);
	   System.out.println(mensa);
	   System.out.println("tamanho da mensagem " + mensa.length());
	   System.out.println("em maiucula = " + mensa.toUpperCase());
	   System.out.println("em miniscula = " + mensa.toLowerCase());
	   System.out.println("substitua mundo : " + mensa.replace("mundo","world"));
	   System.out.println("qual a posição da letra c = " + mensa.indexOf('c'));
	   System.out.println("na posição 10 temos : " + mensa.charAt(10));
	   System.out.println("extraindo uma parte : " + mensa.substring(3,10));
	   }
}
