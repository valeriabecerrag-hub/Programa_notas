import java.util.Scanner;
    public class Notas {

        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println ("Ingrese el nombre del estudiante");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la primera nota");
            double nota1= sc.nextDouble();
            System.out.println("Ingrese la segunda nota");
            double nota2= sc.nextDouble();
            System.out.println("Ingrese la tercera nota");
            double nota3= sc.nextDouble();

            double promedio=calcularPromedio(nota1,nota2,nota3);
            System.out.println("Estudiante: " + nombre + " y su " + " Promedio es: " + promedio);

            if (promedio >=3.0) {
                System.out.println("Estado: Aprobado");
            }else {
                System.out.println("Estado: Reprobado");
            }
        }
        public static double calcularPromedio (double nota1, double nota2, double nota3) {
            return (nota1+nota2+nota3)/3;
        }
    }


