package com.inventario.app;
import java.util.Scanner;


public class calculadora {

    //Este método es para comprobar si al ingresar un número realmente esta ingresando un número o un texto

    public static boolean comprobarNumero(String texto) {
        if (texto == null) {//Comprueba si lo escrito esta vacio 
            return false;
        }
        try {//Se usa un try para pasar el numero a un float, si no se puede pasar a float devuelve falso
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nBienvinido/a a la claculadora de prueba");
        double resultadoAnterior = 0;
        while (true) {
            //Creacion de variables
            double uno = 0;
            double dos = 0;
            String cadena1 = null;
            String cadena2 = null;

            System.out.println(
                    "¿Qué quieres hacer?\nSumar(+)\nrestar(-)\nmultiplicar(x)\ndividir(/)\nhallar la potencia(^)");
            char operacion = in.next().charAt(0);

            boolean es = true;
            while (es) {
                //Esto es para cuando sea la segunda vez que utilizas el programa. Si tuviste un resultado se lo guarda en una variable pregunta al usuario si quieres usarlo para otra operación
                if (resultadoAnterior != 0 && (cadena1 == null && cadena2 == null)) {//Comprueba si no existe numero anterior
                    System.out.println("Quiere que el resultado anterior(" + resultadoAnterior
                            + ") este en el número uno, dos o ninguno?");
                    System.out.println(" 1, 2 o ninguno(0)");
                    int preguntaAnterior = in.nextInt();
                    switch (preguntaAnterior) {//
                        case 1:
                            cadena1 = String.valueOf(resultadoAnterior);
                            break;
                        case 2:
                            cadena2 = String.valueOf(resultadoAnterior);
                            break;
                        default:
                            break;
                    }
                }

                if (cadena1 == null) {
                    System.out.print("\nUsted elgió " + operacion + " Escriba el primer número: ");
                    cadena1 = in.next();
                } else if (cadena2 == null) {
                    System.out.println("\nUsted elgió " + operacion + " Escriba el segundo número: ");
                    cadena2 = in.next();
                } else {
                    if (!comprobarNumero(cadena1)  || !comprobarNumero(cadena2)) {
                        System.out.println("Uno de los valores no es un número, escriba de nuevo\n");
                        es = true;
                        cadena1 = null;
                        cadena2 = null;
                    } else {
                        uno = Double.parseDouble(cadena1);
                        dos = Double.parseDouble(cadena2);
                        es = false;
                    }
                }

            }

            switch (operacion) {
                case '+':
                    resultadoAnterior = uno + dos;
                    System.out.printf("El resultado es: %.2f", resultadoAnterior);
                    break;
                case '-':
                    resultadoAnterior = uno - dos;
                    System.out.printf("El resultado es: %.2f", resultadoAnterior);
                    break;
                case 'x':
                case '*':
                    resultadoAnterior = uno * dos;
                    System.out.printf("El resultado es: %.2f", resultadoAnterior);
                    break;
                case '/':
                    if (dos == 0) {
                        System.out.println("No se puede dividir entre cero");
                        break;
                    } else {
                        resultadoAnterior = uno / dos;
                        System.out.printf("El resultado es: %.2f", resultadoAnterior);
                        break;
                    }
                case '^':
                    resultadoAnterior = Math.pow(uno, dos);
                    System.out.printf("El resulado es: %.2f", resultadoAnterior);
                    System.out.println("\n" + uno + " Es la base y " + dos +
                            " es el exponente");
                    break;
                default:
                    System.out.println("no es una operación valida >:c");
                    break;
            }
            System.out.println("\nDesea continuar con la operación (si/no)");
            String pregunta = in.next().toLowerCase();
            while (true) {
                if (pregunta.equals("no")) {
                    System.out.println("Muchas gracias por participar :D");
                    System.exit(0);
                } else if (pregunta.equals("si")) {
                    System.out.println("Bien, continuemos entonces\n");
                    break;
                } else {
                    System.out.println("Operación no valida");
                    System.out.println("Desea continuar con la operación (si/no)");
                    pregunta = in.next().toLowerCase();
                }
            }
        }
    }

}
