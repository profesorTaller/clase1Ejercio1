import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double area = 0.0;
        int opcion = 0;
        System.out.println("Seleccione a la figura que desea calcular su área");

        System.out.println("Triangulo : Opción[1]");
        System.out.println("Cuadrado : Opción[2]");
        System.out.print("ingrese opcion: ");

        Scanner leerOpcion = new Scanner(System.in);

        opcion = leerOpcion.nextInt();

        if (opcion == 1) {

            double basse = 0.0;
            double altura = 0.0;
            System.out.print("Ingrese base: ");
            basse = leerOpcion.nextDouble();
            System.out.print("Ingrese altura: ");
            altura = leerOpcion.nextDouble();

            area = basse * altura;
            System.out.print("El área del triángulo es  : " + area);
        } else {
            double lado = 0.0;
            System.out.print("Ingrese Lado: ");
            lado = leerOpcion.nextDouble();

            area = lado * lado;
            System.out.print("El área del triángulo es  : " + area);
        }

        leerOpcion.close();

    }
}
