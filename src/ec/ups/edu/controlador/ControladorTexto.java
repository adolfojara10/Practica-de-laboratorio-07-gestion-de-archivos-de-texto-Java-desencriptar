/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase contiene o almacena las funciones necesarias para el uso de este
 * programa sea eficaz, asi como los metodos para controlar textos, crear
 * diccionarios, comprobar rutas, conprobar y el metodo desencriptar, que son
 * nesesario para que depues el usuario pueda manipular el programa con siertas
 * restricciones que le ayudaran aque pueda manipular el mismo de una manera
 * correcta y que sea de su total satisfacccion
 *
 * @author Adolfo
 * @version 11.3
 * @author JHON FAREZ
 * @version 8.2
 */
public class ControladorTexto {

    /**
     * Declaracion de atributos que seran usados en los metodos Atributos de
     * diferentes datos;
     */
    private String ruta;
    private File fichero;
    private java.util.List<Character> abecedario;
    private Map<Character, Character> diccionario;

    /**
     * Metodo constructor controladorTexto hace la instancia de el abecedario,
     * diccionario y otro para crear un dicionario. este metodo especial de la
     * clase es invocada siempre que se crea un objeto de esta clase
     *
     */
    public ControladorTexto() {
        abecedario = new ArrayList<>();
        diccionario = new HashMap<>();
        diccionario = crearDiccionario();
    }

    /**
     * El metodo crear diccionarios no resive ningun tipo de parametro por ello
     * declaramos nuevas variables de tipo String eh int, dentro de bucles hace
     * que el metodo put almacena el valor especificado y lo asocia ala clave
     * especificada en este mapa
     *
     * @return diccionario
     */
    public Map<Character, Character> crearDiccionario() {
        //Declaracion de nuevas varibles
        String abe = "abcdefghijklmnñopqrstuvwxyz";
        String num = "0123456789";
        String caritas = "☺☻♥♦♣♠•◘○◙♀";
        String espacio = " ";
        int aux = (abe.length() - 1);

        for (int i = 0; i < abe.length(); i++) {
            diccionario.put(abe.charAt(i), abe.charAt(aux));
            aux--;
        }

        diccionario.put(espacio.charAt(0), caritas.charAt(10));

        diccionario.put(num.charAt(0), caritas.charAt(0));
        diccionario.put(num.charAt(1), caritas.charAt(1));
        diccionario.put(num.charAt(2), caritas.charAt(2));
        diccionario.put(num.charAt(3), caritas.charAt(3));
        diccionario.put(num.charAt(4), caritas.charAt(4));
        diccionario.put(num.charAt(5), caritas.charAt(5));
        diccionario.put(num.charAt(6), caritas.charAt(6));
        diccionario.put(num.charAt(7), caritas.charAt(7));
        diccionario.put(num.charAt(8), caritas.charAt(8));
        diccionario.put(num.charAt(9), caritas.charAt(9));

        return diccionario;
    }

    /**
     * Este metodo resibe como parametro un dato de tipo String ruta, y
     * comprueba que la ruta ingresada sea correcta y exista en el comutador
     * huesped
     *
     * @param ruta de tipo String ara que compruebe la existencia de la ruta
     * @return Boolean si la ruta existe nos retornara un true y caso contrario
     * false
     */
    public boolean comprobarRuta(String ruta) {
        fichero = new File(ruta);

        if (fichero.exists() && fichero.isFile()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Este metodo es el encargado de desencriptar un archivo .txt. Para eso,
     * primero lee el archivo y lo guarda en el String texto. luego ese String
     * encriptado, procede a ser desencriptado, para lo cual compara los values
     * del mapa diccionario con los valores del String texto. Y luego pongo los
     * keys del mapa en el String desencriptar. Por ultimo devolvemos el String
     * desencriptar.
     *
     * @param rutaAbsoluta el cual es la ruta del archivo a desencriptar
     * @return String que ya esta desencriptado y listo para poder leer
     * @throws IOException
     */
    public String desencriptar(String rutaAbsoluta) throws IOException {
        String texto = "";
        try {

            FileReader ficheroOrigen = new FileReader(rutaAbsoluta);
            BufferedReader archivoLectura = new BufferedReader(ficheroOrigen);

            int valor = archivoLectura.read();

            while (valor != -1) {
                char aux = (char) valor;
                texto = texto.concat(Character.toString(aux));
                valor = archivoLectura.read();
            }

            archivoLectura.close();

        } catch (FileNotFoundException ex2) {
            System.out.println("File noencontrado");
        }

        String desencriptar = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            String le = String.valueOf(letra);
            for (Map.Entry<Character, Character> letra2 : diccionario.entrySet()) {
                String le2 = String.valueOf(letra2.getValue());

                if (le.equalsIgnoreCase(le2)) {
                    // si la varibale le asignida el dato de tipo String letra es mayuscula nos devolvera un true
                    if (Character.isUpperCase(letra)) {
                        desencriptar = desencriptar.concat(String.valueOf(letra2.getKey()).toUpperCase());
                        System.out.println(desencriptar);
                    } else {
                        desencriptar = desencriptar.concat(String.valueOf(letra2.getKey()));
                        System.out.println(desencriptar);
                    }
                }
            }
        }

        return desencriptar;
    }

}
