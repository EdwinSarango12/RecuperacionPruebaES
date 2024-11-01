import FigurasGeometricas.Circulo;
import FigurasGeometricas.Cuadrado;
import FigurasGeometricas.Rectangulo;
import FigurasGeometricas.Triangulo;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cuadrado micuadrado = new Cuadrado(0);
        Circulo micirculo = new Circulo(0);
        Triangulo mitriangulo = new Triangulo((double) 0, (double) 0);
        Rectangulo mirectangulo = new Rectangulo((double) 0, (double) 0);



        int opcion;
        boolean continuar = true;
        while (continuar) {
            System.out.println("Bienvenido al sistema");
            System.out.println("\t\tMENÚ\t\t\n");
            System.out.println("-------Areas");
            System.out.println("1. Area y perimetro del circulo");
            System.out.println("2. Area y perimetro del triangulo");
            System.out.println("3. Area y perimetro del rectangulo");
            System.out.println("4. Area y perimetro del cuadrado");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un numero para el 'circulo': ");
                    Double n1 = sc.nextDouble();
                    micirculo.setN1(n1);
                    System.out.println("El área del circulo es: ");
                    System.out.println(micirculo.AreaCirculo());
                    System.out.println("El perimetro del circulo es: ");
                    System.out.println(micirculo.PerimetroCirculo());
                    break;
                case 2:
                    System.out.println("Ingrese una base para el 'triangulo': ");
                    Double base = sc.nextDouble();
                    mitriangulo.setBase(base);
                    System.out.println("Ingrese una altura para el 'triangulo': ");
                    Double altura = sc.nextDouble();
                    mitriangulo.setAltura(altura);
                    System.out.println("El área del triangulo es: ");
                    System.out.println(mitriangulo.AreaTriangulo());
                    System.out.println("El perimetro del triangulo es: ");
                    System.out.println(mitriangulo.PerimetroTriangulo());
                    break;
                case 3:
                    System.out.println("Ingrese una base para el 'rectangulo': ");
                    Double base2 = sc.nextDouble();
                    mirectangulo.setBase2(base2);
                    System.out.println("base: "+ base2);
                    System.out.println("Ingrese una altura para el 'rectangulo': ");
                    Double altura2 = sc.nextDouble();
                    mirectangulo.setAltura2(altura2);
                    System.out.println("altura: "+ altura2);
                    System.out.println("El area del rectangulo es: ");
                    System.out.println(mirectangulo.AreaRectangulo());
                    System.out.println("El perimetro del rectangulo es: ");
                    System.out.println(mirectangulo.PerimetroRectangulo());
                    break;
                case 4:
                    System.out.println("Ingrese un numero para el 'cuadrado': ");
                    Double lado1 = sc.nextDouble();
                    micuadrado.setLado1(lado1);
                    System.out.println("El área del cuadrado es: ");
                    System.out.println(micuadrado.AreaCuadrado());
                    System.out.println("El perimetro del cuadrado es: ");
                    System.out.println(micuadrado.PerimetroCuadrado());
                    break;
                case 5:
                    continuar = false;
                    System.out.println("\t\tSaliendo del Sistema\t\t");
                    break;
            }
        }
        sc.close();
    }
}