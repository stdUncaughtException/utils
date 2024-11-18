package utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Esta clase define algunos métodos para entrada de datos, de forma que se
 * capturen los errores de entrada sin abortar, en caso de que el usuario
 * introduzca datos no válidos. También incluye un par de métodos para
 * simpliciar la escritura de mensajes en pantalla, abreviando la escritura de
 * las sentencias System.out.println() y System.out.print(). Se hace uso también
 * de la sobrecarga de métodos, que es algo que se había visto con los
 * constructores, pero sin entrar en detalle. Así, podemos tener tres métodos
 * para lee enteros, que se llaman todos igual, pero que se diferencian en su
 * lista de parámetros.
 *
 * @author _________________________________________
 */
public class ES {

    /**
     * Este método sirve para leer desde teclado cualquier número entero en el
     * rango de números del tipo int. La lectura se estará repitiendo hasta que
     * el valor suministrado esté en ese rango.
     *
     * @return El número entero leído.
     */
    public static int leeEntero() {
        boolean leido = false;
        int numero = 0;
        Scanner teclado = null;
        do {
            try {
                teclado = new Scanner(System.in);
                numero = teclado.nextInt();
                leido = true;
            } catch (Exception e) {
                ES.msgln("Error: No es un número entero válido. ");
            }

        } while (!leido);
        return numero;
    }

    /**
     * Este método sirve para escribir el mensaje indicado para solicitar la
     * introducción de un dato desde teclado, y espera la introducción de
     * cualquier número entero en el rango de números del tipo int, que será el
     * dato leído. La lectura se estará repitiendo hasta que el valor
     * suministrado esté en ese rango.
     *
     * @param mensaje Es el mensaje que se muestra para solicitar la
     * introducción del número.
     * @return El número entero leído.
     */
    public static int leeEntero(String mensaje) {
        int numero = 0;
        boolean leido = false;
        Scanner teclado = null;
        do {
            ES.msgln(mensaje);
            try {
                teclado = new Scanner(System.in);
                numero = teclado.nextInt();
                leido = true;
            } catch (Exception e) {
                ES.msgln("Error: No es un número entero válido. ");
            }
        } while (!leido);
        return numero;
    }

    /**
     * Este método sirve para leer desde teclado cualquier número entero en el
     * rango de números del tipo int que además sea mayor o igual que el valor
     * mínimo indicado como parámetro. La lectura se estará repitiendo hasta que
     * el valor suministrado esté en ese rango.
     *
     * @param minimo Es el valor más pequeño dentro del rango de los números
     * enteros tipo int que se aceptará como válido.
     * @return El número entero leído.
     */
    public static int leeEntero(int minimo) {
        int numero = 0;
        boolean leido = false;
        Scanner teclado = null;
        do {
            try {
                teclado = new Scanner(System.in);
                numero = teclado.nextInt();
                if (numero >= minimo) {
                    leido = true;
                } else {
                    ES.msgln("Error: Debe ser un número entero mayor o igual que " + minimo + ". ");
                }
            } catch (Exception e) {
                ES.msgln("Error: No es un número entero válido. ");
            }
        } while (!leido);
        return numero;
    }

    /**
     * Este método sirve para escribir el mensaje indicado para solicitar la
     * introducción de un dato desde teclado, y espera la introducción de
     * cualquier número entero en el rango de números del tipo int que además
     * sea mayor o igual que el valor mínimo indicado como parámetro. La lectura
     * se estará repitiendo hasta que el valor suministrado esté en ese rango.
     *
     * @param mensaje Es el mensaje que se muestra para solicitar la
     * introducción del número.
     * @param minimo Es el valor más pequeño dentro del rango de los números
     * enteros tipo int que se aceptará como válido.
     * @return El número entero leído.
     */
    public static int leeEntero(String mensaje, int minimo) {
        int numero = 0;
        boolean leido = false;
        Scanner teclado = null;
        do {
            ES.msgln(mensaje);
            try {
                teclado = new Scanner(System.in);
                numero = teclado.nextInt();
                if (numero >= minimo) {
                    leido = true;
                } else {
                    ES.msgln("Error: Debe ser un número entero mayor o igual que " + minimo + ".");
                }
            } catch (Exception e) {
                ES.msgln("Error: No es un número entero válido. ");
            }

        } while (!leido);
        return numero;
    }

    /**
     * Este método sirve para leer desde teclado cualquier número entero en el
     * rango de números del tipo int que además sea mayor o igual que el valor
     * mínimo indicado como primer parámetro y menor o igual que el valor máximo
     * indicado como segundo parámetro. La lectura se estará repitiendo hasta
     * que el valor suministrado esté en ese rango.
     *
     * @param minimo Es el valor más pequeño dentro del rango de los números
     * enteros tipo int que se aceptará como válido.
     * @param maximo Es el valor más alto dentro del rango de los números
     * enteros tipo int que se aceptará como válido.
     * @return El número entero leído.
     */
    public static int leeEntero(int minimo, int maximo) throws IllegalArgumentException {
        int numero = 0;
        boolean leido = false;
        Scanner teclado = null;

        // Si el valor mínimo es mayor que el máximo, lanzamos una excepción
        if (minimo <= maximo) {
            do {
                try {
                    teclado = new Scanner(System.in);
                    numero = teclado.nextInt();
                    if (numero >= minimo && numero <= maximo) {
                        leido = true;
                    } else {
                        ES.msgln("Error: Debe ser un número entero mayor o igual que " + minimo + " y menor o igual que " + maximo + ". ");
                    }
                } catch (Exception e) {
                    ES.msgln("Error: No es un número entero válido. ");
                }
            } while (!leido);
        } else {
            throw new IllegalArgumentException("Rango imposible. El valor mínimo no puede ser mayor que el valor máximo");
        }
        return numero;
    }

    /**
     * Este método sirve para escribir el mensaje indicado para solicitar la
     * introducción de un dato desde teclado, y espera la introducción de
     * cualquier número entero en el rango de números del tipo int que además
     * sea mayor o igual que el valor mínimo indicado como primer parámetro y
     * menor o igual que el valor máximo indicado como segundo parámetro. La
     * lectura se estará repitiendo hasta que el valor suministrado esté en ese
     * rango.
     *
     * @param mensaje Es el mensaje que se muestra para solicitar la
     * introducción del número.
     * @param minimo Es el valor más pequeño dentro del rango de los números
     * enteros tipo int que se aceptará como válido.
     * @param maximo Es el valor más alto dentro del rango de los números.
     * enteros tipo int que se aceptará como válido.
     * @return El número entero leído.
     */
    public static int leeEntero(String mensaje, int minimo, int maximo) {
        int numero = 0;
        boolean leido = false;
        Scanner teclado = null;

        // Si el valor mínimo es mayor que el máximo, lanzamos una excepción
        if (minimo <= maximo) {
            do {
                ES.msgln(mensaje);
                try {
                    teclado = new Scanner(System.in);
                    numero = teclado.nextInt();
                    if (numero >= minimo && numero <= maximo) {
                        leido = true;
                    } else {
                        ES.msgln("Error: Debe ser un número entero mayor o igual que " + minimo + " y menor o igual que " + maximo + ". ");
                    }
                } catch (Exception e) {
                    ES.msgln("Error: No es un número entero válido. ");
                }
            } while (!leido);
        } else {
            throw new IllegalArgumentException("Rango imposible. El valor mínimo no puede ser mayor que el valor máximo");
        }
        return numero;
    }

    /**
     * Este método sirve para leer desde teclado cualquier número entero en el
     * rango de números del tipo short. La lectura se estará repitiendo hasta
     * que el valor suministrado esté en ese rango.
     *
     * @return El número entero corto leído.
     */
    public static short leeShort() {
        boolean leido = false;
        short numero = 0;
        Scanner teclado = null;
        do {
            try {
                teclado = new Scanner(System.in);
                numero = teclado.nextShort();
                leido = true;
            } catch (Exception e) {
                ES.msgln("Error: No es un número entero válido. ");
            }

        } while (!leido);
        return numero;
    }

    /**
     * Este método sirve para escribir el mensaje indicado para solicitar la
     * introducción de un dato desde teclado, y espera la introducción de
     * cualquier número entero en el rango de números del tipo int, que será el
     * dato leído. La lectura se estará repitiendo hasta que el valor
     * suministrado esté en ese rango.
     *
     * @param mensaje Es el mensaje que se muestra para solicitar la
     * introducción del número.
     * @return El número entero corto leído.
     */
    public static short leeShort(String mensaje) {
        short numero = 0;
        boolean leido = false;
        Scanner teclado = null;
        do {
            ES.msgln(mensaje);
            try {
                teclado = new Scanner(System.in);
                numero = teclado.nextShort();
                leido = true;
            } catch (Exception e) {
                ES.msgln("Error: No es un número entero válido. ");
            }
        } while (!leido);
        return numero;
    }

    /**
     * Este método sirve para leer desde teclado cualquier número entero en el
     * rango de números del tipo short que además sea mayor o igual que el valor
     * mínimo indicado como parámetro. La lectura se estará repitiendo hasta que
     * el valor suministrado esté en ese rango.
     *
     * @param minimo Es el valor más pequeño dentro del rango de los números
     * enteros tipo int que se aceptará como válido.
     * @return El número entero corto leído.
     */
    public static short leeShort(int minimo) {
        short numero = 0;
        boolean leido = false;
        Scanner teclado = null;
        do {
            try {
                teclado = new Scanner(System.in);
                numero = teclado.nextShort();
                if (numero >= minimo) {
                    leido = true;
                } else {
                    ES.msgln("Error: Debe ser un número entero mayor o igual que " + minimo + ". ");
                }
            } catch (Exception e) {
                ES.msgln("Error: No es un número entero válido. ");
            }
        } while (!leido);
        return numero;
    }

    /**
     * Este método sirve para escribir el mensaje indicado para solicitar la
     * introducción de un dato desde teclado, y espera la introducción de
     * cualquier número entero en el rango de números del tipo int que además
     * sea mayor o igual que el valor mínimo indicado como parámetro. La lectura
     * se estará repitiendo hasta que el valor suministrado esté en ese rango.
     *
     * @param mensaje Es el mensaje que se muestra para solicitar la
     * introducción del número.
     * @param minimo Es el valor más pequeño dentro del rango de los números
     * enteros tipo int que se aceptará como válido.
     * @return El número entero corto leído.
     */
    public static short leeShort(String mensaje, int minimo) {
        short numero = 0;
        boolean leido = false;
        Scanner teclado = null;
        do {
            ES.msgln(mensaje);
            try {
                teclado = new Scanner(System.in);
                numero = teclado.nextShort();
                if (numero >= minimo) {
                    leido = true;
                } else {
                    ES.msgln("Error: Debe ser un número entero mayor o igual que " + minimo + ".");
                }
            } catch (Exception e) {
                ES.msgln("Error: No es un número entero válido. ");
            }

        } while (!leido);
        return numero;
    }

    /**
     * Este método sirve para leer desde teclado cualquier número entero en el
     * rango de números del tipo int que además sea mayor o igual que el valor
     * mínimo indicado como primer parámetro y menor o igual que el valor máximo
     * indicado como segundo parámetro. La lectura se estará repitiendo hasta
     * que el valor suministrado esté en ese rango.
     *
     * @param minimo Es el valor más pequeño dentro del rango de los números
     * enteros tipo int que se aceptará como válido.
     * @param maximo Es el valor más alto dentro del rango de los números
     * enteros tipo int que se aceptará como válido.
     * @return El número entero corto leído.
     */
    public static short leeShort(int minimo, int maximo) throws IllegalArgumentException {
        short numero = 0;
        boolean leido = false;
        Scanner teclado = null;

        // Si el valor mínimo es mayor que el máximo, lanzamos una excepción
        if (minimo <= maximo) {
            do {
                try {
                    teclado = new Scanner(System.in);
                    numero = teclado.nextShort();
                    if (numero >= minimo && numero <= maximo) {
                        leido = true;
                    } else {
                        ES.msgln("Error: Debe ser un número entero mayor o igual que " + minimo + " y menor o igual que " + maximo + ". ");
                    }
                } catch (Exception e) {
                    ES.msgln("Error: No es un número entero válido. ");
                }
            } while (!leido);
        } else {
            throw new IllegalArgumentException("Rango imposible. El valor mínimo no puede ser mayor que el valor máximo");
        }
        return numero;
    }

    /**
     * Este método sirve para escribir el mensaje indicado para solicitar la
     * introducción de un dato desde teclado, y espera la introducción de
     * cualquier número entero en el rango de números del tipo int que además
     * sea mayor o igual que el valor mínimo indicado como primer parámetro y
     * menor o igual que el valor máximo indicado como segundo parámetro. La
     * lectura se estará repitiendo hasta que el valor suministrado esté en ese
     * rango.
     *
     * @param mensaje Es el mensaje que se muestra para solicitar la
     * introducción del número.
     * @param minimo Es el valor más pequeño dentro del rango de los números
     * enteros tipo int que se aceptará como válido.
     * @param maximo Es el valor más alto dentro del rango de los números.
     * enteros tipo int que se aceptará como válido.
     * @return El número entero leído.
     */
    public static short leeShort(String mensaje, int minimo, int maximo) {
        short numero = 0;
        boolean leido = false;
        Scanner teclado = null;

        // Si el valor mínimo es mayor que el máximo, lanzamos una excepción
        if (minimo <= maximo) {
            do {
                ES.msgln(mensaje);
                try {
                    teclado = new Scanner(System.in);
                    numero = teclado.nextShort();
                    if (numero >= minimo && numero <= maximo) {
                        leido = true;
                    } else {
                        ES.msgln("Error: Debe ser un número entero mayor o igual que " + minimo + " y menor o igual que " + maximo + ". ");
                    }
                } catch (Exception e) {
                    ES.msgln("Error: No es un número entero válido. ");
                }
            } while (!leido);
        } else {
            throw new IllegalArgumentException("Rango imposible. El valor mínimo no puede ser mayor que el valor máximo");
        }
        return numero;
    }

    /**
     * Este método sirve para leer desde teclado cualquier número real en el
     * rango de números del tipo float. La lectura se estará repitiendo hasta
     * que el valor suministrado esté en ese rango.
     *
     * @return El número real leído.
     */
    public static float leeReal() {
        float numero = 0;
        boolean leido = false;
        Scanner teclado = null;
        do {
            try {
                teclado = new Scanner(System.in);
                numero = teclado.nextFloat();
                leido = true;
            } catch (Exception e) {
                ES.msgln("Error: No es un número real válido. Introdúzcalo de nuevo: ");
            }
        } while (!leido);
        return numero;
    }

    /**
     * Este método sirve para escribir el mensaje indicado para solicitar la
     * introducción de un dato desde teclado, y espera la introducción de
     * cualquier número real en el rango de números del tipo float. La lectura
     * se estará repitiendo hasta que el valor suministrado esté en ese rango.
     *
     * @param mensaje Es el mensaje que se envía solicitando la introducción del
     * número.
     * @return El número real leído.
     */
    public static float leeReal(String mensaje) {
        float numero = 0;
        boolean leido = false;
        Scanner teclado = null;
        do {
            ES.msgln(mensaje);
            try {
                teclado = new Scanner(System.in);
                numero = teclado.nextFloat();
                leido = true;
            } catch (Exception e) {
                ES.msgln("Error: No es un número real válido. ");
            }
        } while (!leido);
        return numero;
    }

    /**
     * Este método sirve para leer desde teclado cualquier número real en el
     * rango de números del tipo float que además sea mayor o igual que el valor
     * mínimo indicado como parámetro. La lectura se estará repitiendo hasta que
     * el valor suministrado esté en ese rango.
     *
     * @param minimo Es el valor más pequeño dentro del rango de los números
     * reales tipo float que se aceptará como válido.
     * @return El número real leído.
     */
    public static float leeReal(float minimo) {
        float numero = 0;
        boolean leido = false;
        Scanner teclado = null;
        do {
            try {
                teclado = new Scanner(System.in);
                numero = teclado.nextFloat();
                if (numero >= minimo) {
                    leido = true;
                } else {
                    ES.msgln("Error: Debe ser un número real mayor o igual que " + minimo + ".");
                }
            } catch (Exception e) {
                ES.msgln("Error: No es un número real válido. ");
            }
        } while (!leido);
        return numero;
    }

    /**
     * Este método sirve para escribir el mensaje indicado para solicitar la
     * introducción de un dato desde teclado, y espera la introducción de
     * cualquier número real en el rango de números del tipo float que además
     * sea mayor o igual que el valor mínimo indicado como parámetro. La lectura
     * se estará repitiendo hasta que el valor suministrado esté en ese rango.
     *
     * @param mensaje Es el mensaje que se envía solicitando la introducción del
     * número.
     * @param minimo Es el valor más pequeño dentro del rango de los números
     * reales tipo float que se aceptará como válido.
     * @return El número real leído.
     */
    public static float leeReal(String mensaje, float minimo) {
        float numero = 0;
        boolean leido = false;
        Scanner teclado = null;
        do {
            ES.msgln(mensaje);
            try {
                teclado = new Scanner(System.in);
                numero = teclado.nextFloat();
                if (numero >= minimo) {
                    leido = true;
                } else {
                    ES.msgln("Error: Debe ser un número real mayor o igual que " + minimo + ".");
                }
            } catch (Exception e) {
                ES.msgln("Error: No es un número real válido. ");
            }
        } while (!leido);
        return numero;
    }

    /**
     * Este método sirve para leer desde teclado cualquier número real en el
     * rango de números del tipo floatt que además sea mayor o igual que el
     * valor mínimo indicado como primer parámetro y menor o igual que el valor
     * máximo indicado como segundo parámetro. La lectura se estará repitiendo
     * hasta que el valor suministrado esté en ese rango.
     *
     * @param minimo Es el valor más pequeño dentro del rango de los números
     * reales tipo float que se aceptará como válido.
     * @param maximo Es el valor más alto dentro del rango de los números reales
     * tipo float que se aceptará como válido.
     * @return El número real leído.
     */
    public static float leeReal(float minimo, float maximo) {
        float numero = 0;
        boolean leido = false;
        @SuppressWarnings("UnusedAssignment")
        Scanner teclado = null;
        // Si el valor mínimo es mayor que el máximo, lanzamos una excepción
        if (minimo <= maximo) {
            do {
                try {
                    teclado = new Scanner(System.in);
                    numero = teclado.nextFloat();
                    if (numero >= minimo && numero <= maximo) {
                        leido = true;
                    } else {
                        ES.msgln("Error: Debe ser un número real mayor o igual que " + minimo + " y menor o igual que " + maximo + ".");
                    }
                } catch (Exception e) {
                    ES.msgln("Error: No es un número real válido. ");
                }
            } while (!leido);
        } else {
            throw new IllegalArgumentException("Rango imposible.El valor mínimo no puede ser mayor que el valor máximo.");
        }
        return numero;
    }

    /**
     * Este método sirve para escribir el mensaje indicado para solicitar la
     * introducción de un dato desde teclado, y espera la introducción de
     * cualquier número real en el rango de números del tipo floatt que además
     * sea mayor o igual que el valor mínimo indicado como primer parámetro y
     * menor o igual que el valor máximo indicado como segundo parámetro. La
     * lectura se estará repitiendo hasta que el valor suministrado esté en ese
     * rango.
     *
     * @param mensaje Es el mensaje que se muestra para solicitar la
     * introducción del número.
     * @param minimo Es el valor más pequeño dentro del rango de los números
     * reales tipo float que se aceptará como válido.
     * @param maximo Es el valor más alto dentro del rango de los números reales
     * tipo float que se aceptará como válido.
     * @return El número real leído.
     */
    public static float leeReal(String mensaje, float minimo, float maximo) {
        float numero = 0;
        boolean leido = false;
        @SuppressWarnings("UnusedAssignment")
        Scanner teclado = null;
        // Si el valor mínimo es mayor que el máximo, lanzamos una excepción
        if (minimo <= maximo) {
            do {
                ES.msgln(mensaje);
                try {
                    teclado = new Scanner(System.in);
                    numero = teclado.nextFloat();
                    if (numero >= minimo && numero <= maximo) {
                        leido = true;
                    } else {
                        ES.msgln("Error: Debe ser un número real mayor o igual que " + minimo + " y menor o igual que " + maximo + ".");
                    }
                } catch (Exception e) {
                    ES.msgln("Error: No es un número real válido. ");
                }
            } while (!leido);
        } else {
            throw new IllegalArgumentException("Rango imposible.El valor mínimo no puede ser mayor que el valor máximo.");
        }
        return numero;
    }

    /**
     * Este método lee una cadena de caracteres desde teclado, y comprueba que
     * efectivamente la lectura se ha producido correctamente, mandando un
     * mensaje de error en caso de que haya fallado.
     *
     * @return La cadena de caracteres leída desde el teclado.
     */
    public static String leeCadena() {
        Scanner teclado = new Scanner(System.in);
        String cadena = "";
        try {
            cadena = teclado.nextLine();
        } catch (Exception e) {
            ES.msgln("Error: Ha fallado la entrada de datos.");
        }
        return cadena;
    }

    /**
     * Este método sirve para escribir el mensaje indicado para solicitar la
     * introducción de un dato desde teclado, espera la introducción de una
     * cadena de caracteres desde teclado, y comprueba que efectivamente la
     * lectura se ha producido correctamente, mandando un mensaje de error en
     * caso de que haya fallado.
     *
     * @param mensaje Es el mensaje que se envía solicitando la introducción de
     * la cadena de texto.
     * @return La cadena de caracteres leída desde el teclado.
     */
    public static String leeCadena(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String cadena = "";
        try {
            ES.msgln(mensaje);
            cadena = teclado.nextLine();
        } catch (Exception e) {
            ES.msgln("Error: Ha fallado la entrada de datos.");
        }
        return cadena;
    }

    /**
     * Este método hace exactamente lo mismo que el método System.out.print(),
     * pero tiene la ventaja de que su escritura es más corta y ahorra algo de
     * trabajo en programas donde la sentencia System.out.print() se use mucho.
     *
     * @param entero Es es el valor entero de tipo int a imprimir como texto.
     */
    public static void msg(int entero) {
        System.out.print(entero);
    }

    /**
     * Este método hace exactamente lo mismo que el método System.out.print(),
     * pero tiene la ventaja de que su escritura es más corta y ahorra algo de
     * trabajo en programas donde la sentencia System.out.print() se use mucho.
     *
     * @param enteroLargo Es es el valor entero de tipo long a imprimir como
     * texto.
     */
    public static void msg(long enteroLargo) {
        System.out.print(enteroLargo);
    }

    /**
     * Este método hace exactamente lo mismo que el método System.out.print(),
     * pero tiene la ventaja de que su escritura es más corta y ahorra algo de
     * trabajo en programas donde la sentencia System.out.print() se use mucho.
     *
     * @param real Es es el valor real de tipo float a imprimir como texto.
     */
    public static void msg(float real) {
        System.out.print(real);
    }

    /**
     * Este método hace exactamente lo mismo que el método System.out.print(),
     * pero tiene la ventaja de que su escritura es más corta y ahorra algo de
     * trabajo en programas donde la sentencia System.out.print() se use mucho.
     *
     * @param realLargo Es es el valor entero de tipo double a imprimir como
     * texto.
     */
    public static void msg(double realLargo) {
        System.out.print(realLargo);
    }

    /**
     * Este método hace exactamente lo mismo que el método System.out.print(),
     * pero tiene la ventaja de que su escritura es más corta y ahorra algo de
     * trabajo en programas donde la sentencia System.out.print() se use mucho.
     *
     * @param cadenaAImprimir Es la cadena de texto que hay que escribir en el
     * dispositivo de salida estándar.
     */
    public static void msg(String cadenaAImprimir) {
        System.out.print(cadenaAImprimir);
    }

    /**
     * Este método hace exactamente lo mismo que el método System.out.println(),
     * cuando se invoca sin parámetros, pero tiene la ventaja de que su
     * escritura es más corta y ahorra algo de trabajo en programas donde la
     * sentencia System.out.println() se use mucho.
     */
    public static void msgln() {
        System.out.println();
    }

    /**
     * Este método hace exactamente lo mismo que el método System.out.println(),
     * pero tiene la ventaja de que su escritura es más corta y ahorra algo de
     * trabajo en programas donde la sentencia System.out.println() se use
     * mucho.
     *
     * @param entero Es es el valor entero de tipo int a imprimir como texto.
     */
    public static void msgln(int entero) {
        System.out.println(entero);
    }

    /**
     * Este método hace exactamente lo mismo que el método System.out.println(),
     * pero tiene la ventaja de que su escritura es más corta y ahorra algo de
     * trabajo en programas donde la sentencia System.out.println() se use
     * mucho.
     *
     * @param enteroLargo Es es el valor entero de tipo long a imprimir como
     * texto.
     */
    public static void msgln(long enteroLargo) {
        System.out.println(enteroLargo);
    }

    /**
     * Este método hace exactamente lo mismo que el método System.out.println(),
     * pero tiene la ventaja de que su escritura es más corta y ahorra algo de
     * trabajo en programas donde la sentencia System.out.println() se use
     * mucho.
     *
     * @param real Es es el valor real de tipo float a imprimir como texto.
     */
    public static void msgln(float real) {
        System.out.println(real);
    }

    /**
     * Este método hace exactamente lo mismo que el método System.out.println(),
     * pero tiene la ventaja de que su escritura es más corta y ahorra algo de
     * trabajo en programas donde la sentencia System.out.println() se use
     * mucho.
     *
     * @param realLargo Es es el valor entero de tipo double a imprimir como
     * texto.
     */
    public static void msgln(double realLargo) {
        System.out.println(realLargo);
    }

    /**
     * Este método hace exactamente lo mismo que el método System.out.println(),
     * pero tiene la ventaja de que su escritura es más corta y ahorra algo de
     * trabajo en programas donde la sentencia System.out.println() se use
     * mucho.
     *
     * @param cadenaAImprimir Es la cadena de texto que hay que escribir en el
     * dispositivo de salida estándar.
     */
    public static void msgln(String cadenaAImprimir) {
        System.out.println(cadenaAImprimir);
    }

    /**
     * Lee una fecha de teclado, correctamente validada, mostrando un mensaje
     * por pantalla que la solicita.
     *
     * @param mensaje Es el mensaje que se envía solicitando la introducción de
     * la fecha.
     * @return Una fecha como String en formato dd-mm-aa, ya validada y
     * correcta.
     */
    public static String leeFecha(String mensaje) {
        boolean correcta = false;
        String laFecha;
        do {
            laFecha = ES.leeCadena(mensaje);
            if (Validar.isFechaValida(laFecha)) {
                correcta = true;
            } else {
                ES.msgln("Error: No es un fecha válida con formato dd/mm/aaaa.");
            }
        } while (!correcta);
        return laFecha;
    }

    /**
     * Lee desde teclado una respuesta para una pregunta de tipo Sí o No,
     * mostrando por pantalla la pregunta en cuestión. Sólo se admiten como
     * respuestas
     *
     * @param mensaje Es el mensaje que se envía con la pregunta cuya respuesta
     * se espera que sea Sí o No.
     * @return la cadena "S" si se ha respondido "S" o "s" y la cadena "N" si se
     * ha respondido "N" o "n".
     */
    @SuppressWarnings("null")
    public static String leeRespuesta(String mensaje) {
        boolean correcta = false;
        String cadena = "";
        @SuppressWarnings("UnusedAssignment")
        Scanner teclado = null;
        do {
            ES.msgln(mensaje);
            try {
                teclado = new Scanner(System.in);
                cadena = teclado.nextLine();
                if (cadena != null && cadena.length() == 1 && ((cadena.equalsIgnoreCase("S")) || (cadena.equalsIgnoreCase("N")))) {
                    correcta = true;
                } else {
                    ES.msgln("Error: Solo se admite como respuesta un único carácter, que debe ser 's', 'S', 'n' o 'N'.");
                }
            } catch (Exception e) {
                ES.msgln("Error: Ha fallado la entrada de datos.");
            }
        } while (!correcta);
        return cadena.toUpperCase();
    }

    /**
     * Este método se encarga de realizar un ciclo de preguntas al usuario y
     * recoger sus respuestas. Para cada pregunta, el método valida la entrada y
     * permite al usuario detener el proceso introduciendo la palabra "fin". Las
     * preguntas y los mensajes de error asociados se pasan como un array
     * bidimensional, donde cada subarray contiene una pregunta y un mensaje de
     * error.
     *
     * <p>
     * El método es modular y mantenible, ya que permite agregar o modificar
     * preguntas fácilmente sin la necesidad de crear múltiples condicionales.
     * Se detiene si el usuario introduce "fin" o al completar todas las
     * preguntas.</p>
     *
     * @param preguntasYErrores Un array bidimensional donde cada subarray tiene
     * dos elementos: el primero es la pregunta a hacer al usuario y el segundo
     * es el mensaje de error a mostrar si la respuesta es inválida (como una
     * cadena vacía).
     *
     * @return Un array de cadenas que contiene las respuestas del usuario en el
     * mismo orden de las preguntas. Si el usuario escribe "fin" en cualquier
     * momento, el método retorna {@code null}. Si todas las preguntas son
     * respondidas, devuelve el array completo con las respuestas.
     */
    public static String[] introducirDatos(String[][] preguntasYErrores) {
        /*
            //----{ HE MEJORADO EL MÉTODO DE INTRODUCCIÓN DE DATOS. }----//
        
            EL ANTERIOR MÉTODO POR CADA PREGUNTA DEBÍA HACER UN CONDICIONAL
            NUEVO, PERO ESTE POR CADA PREGUNTA SE PREGUNTARÁ UN NUEVO DATO.
            ESTE MÉTODO ES MÁS MANTENIBLE Y MODULAR QUE EL ANTERIOR,
            FACILITANDO LA TAREA DE AGREGAR NUEVAS PREGUNTAS AL USUARIO Y 
            RECOGER SUS RESPUESTAS.
         */

        // Se almacenarán tantas respuestas como preguntas se agreguen al
        // vector bidimensional.
        String[] data = new String[preguntasYErrores.length];

        // Se realizarán las preguntas solicitadas en el array.
        boolean continuar = true;
        for (int nivel = 0; nivel < preguntasYErrores.length && continuar; nivel++) {

            boolean respuestaValida = true;
            do {
                data[nivel] = ES.leeCadena(preguntasYErrores[nivel][0] + " (fin para salir)");
                if (!data[nivel].matches("((F|f)(I|i)(N|n))") && !data[nivel].isBlank()) {

                    respuestaValida = false;

                } else if (data[nivel].matches("((F|f)(I|i)(N|n))")) {

                    continuar = respuestaValida = false;

                } else if (data[nivel].isBlank()) {

                    System.out.println(preguntasYErrores[nivel][1]);
                }

            } while (respuestaValida);

        }

        // Se retornará el array con los datos introducidos si no se ha
        // parado la ejecución de la función con 'fin' o alguna de sus
        // variantes.
        return continuar ? data : null;
    }

    /**
     * Método que permite introducir datos en un arreglo bidimensional mediante
     * cuadros de diálogo.
     *
     * @param kV Un arreglo bidimensional de cadenas donde se almacenarán los
     * datos introducidos por el usuario. Se espera que cada fila tenga al menos
     * dos columnas: la primera columna contiene un identificador para el dato a
     * introducir, y la segunda columna se usará para almacenar el dato
     * ingresado por el usuario. Había pensado en hacerlo con Map, pero pienso
     * que es más rápido y fácil de usar con un arreglo bidimensional.
     *
     * @return El mismo arreglo bidimensional 'seses', pero con los datos
     * introducidos por el usuario en la segunda columna.
     */
    public static String[][] introducirDatosDialog(String[][] kV) {

        /*
        Se solicitarán tantos datos a introducir como el largo de la
        primera dimensión.
         */
        for (String[] kV1 : kV) {
            /*
            El dato solicitado se almacenará en la segunda posición del
            arreglo, de forma que el arreglo quedaría de manera muy
            similar a como funciona un diccionario K-V:
            ------------------------------------------------
            Ejemplo:
            seses[0][0] = "nombre"      |   seses[0][1] = "Zelmar"
            seses[1][0] = "apellidos"   |   seses[1][1] = "Ramilo"
            seses[2][0] = "sexo"        |   seses[2][1] = "Hombre"
            seses[3][0] = "ojos"        |   seses[3][1] = "2"
            Extra:
            Se puede establecer el valor inicial del input agregando
            en la segunda dimension del arreglo un valor. Este aparecerá
            en el cuadro de dialogo como input predeterminado.
             */
            kV1[1] = JOptionPane.showInputDialog("Insertar " + kV1[0], kV1[1]);
        }
        return kV; // Regreso el arreglo K-V
    }

    /**
     * Clase para contener métodos de validación.
     *
     * @author José Javier Bermúdez Hernández
     */
    public class Validar {

        /**
         * Comprueba si la fecha que se envía como parámetro es válida.
         *
         * @param fecha Fecha que se recibe como parámetro en formato cadena de
         * caracteres.
         * @return true si la fecha es válida o false sin no es válida.
         */
        public static boolean isFechaValida(String fecha) {
            try {
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy",
                        Locale.getDefault());
                formatoFecha.setLenient(false);
                formatoFecha.parse(fecha);
            } catch (ParseException e) {
                return false;
            }
            return true;
        }
    }
}//class ES
