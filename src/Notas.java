import java.util.Scanner;
    public class Notas {
        static Scanner sc = new Scanner (System.in);
        public static void main(String[] args) {

            String nombre = leerNombre();
            System.out.println("Ingrese la primera nota");
            double nota1= sc.nextDouble();
            System.out.println("Ingrese la segunda nota");
            double nota2= sc.nextDouble();
            System.out.println("Ingrese la tercera nota");
            double nota3= sc.nextDouble();

        double promedio = calcularPromedio(nota1, nota2, nota3);

        System.out.printf("Estudiante: " + nombre + " y su" + " Promedio es: " + promedio);

        if (promedio >= 3.0) {
            System.out.println("Estado: Aprobado ");
        } else {
            System.out.println("Estado: Reprobado ");
        }

    }

    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

        public static double leerNota(Scanner sc, String mensaje) {
            double nota;
            do {
                System.out.println(mensaje);
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: ingrese un número válido.");
                    sc.next();
                }
                nota = sc.nextDouble();

                if (nota < 0 || nota > 5) {
                    System.out.println("La nota debe estar entre 0 y 5.");
                }
            } while (nota < 0 || nota > 5);

            return nota;
        }


        public static String leerNombre(){
            System.out.println ("Ingrese el nombre del estudiante");
            return sc.nextLine();
        }
    }



