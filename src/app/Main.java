package app;
import model.instituto;
import model.persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        instituto instituto = new instituto();

        instituto.cargarDatosPrueba();

        Main main = new Main();
        int opc;

        do {

            opc = main.menu();

            switch (opc){

                case 1 -> instituto.nuevoAlumno();


                case 2 -> instituto.nuevoProfesor();


                case 3 -> System.out.println(instituto.mostrarAlumnos());


                case 4 -> System.out.println(instituto.mostrarProfesores());

                case 5 -> {
                    System.out.println("DNI a buscar: ");
                    String dni = scan.nextLine();
                    System.out.println(instituto.buscarAlumno(dni));
                }

                case 6 -> {
                    System.out.println("DNI a buscar: ");
                    String dni = scan.nextLine();
                    System.out.println(instituto.buscarProfesor(dni));
                }



                default -> System.out.println("Valor no valido");

            }
        } while (opc != 9);
    }


    public int menu(){
        Scanner scan = new Scanner(System.in);

        int opc;

        do {
            System.out.println("""
                    1. Nuevo Alumno
                    2. Nuevo Profesor
                    3. Mostrar Alumnos
                    4. Mostrar Profesores
                    5. Buscar Alumno
                    6. Buscar Profesor
                    9. Salir
                    """);
            opc = scan.nextInt();


        } while (opc < 1 || opc > 9);
        return opc;
    }

}
