/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *@author  JHON FAREZ
 * @author Adolfo
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
     * Metodo constructor  controladorTexto hace la instancia de el
     * abecedario, diccionario y otro para crear un dicionario. este metodo
     * especial de la clase es invocada siempre que se crea un objeto de esta
     * clase
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
        /**
         * Almacenamiento de el valor en la posision especifiacada y la
         * asosiacion con la clave especificada en el map
         */
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

        if (fichero.exists()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * El metodo concatena el nombre con el "txt", o "TXT" y comprueba que el fichero
     * despues de instanciarla exista en la ruta y el separator representa el
     * separador de directorios dependiendo el sistema operativo en el que
     * estemos trabajando
     *
     * @param ruta Es de tipo String y hace que compruebe si el fichero
     * instanceado.
     * @param nombre de tipo String y con esos datos podemos darle un formato
     * @return Boolean true o false si el fichero existe dentro del la ruta
     */
    public boolean comprobar(String ruta, String nombre) {
        nombre = nombre.concat(".txt");
        fichero = new File(ruta + File.separator + nombre);

        if (fichero.exists()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * El metodo crear fichero, estamos creando ficheros gracias al metodo
     * createNewFile y ademas de eso el metodo crearFichero controla las
     * exepciones lanzando y capturando con el try and catch
     *
     * @param ruta En este parametro de entrada nos da de tipo String una
     * direccion para poder crear un nuevo dichero
     * @param nombre el nombre que se va asignar al nuevo fuchero ingresado para
     * desepues ser manipulado
     * @return Retorna un tipo de dato String que es la ruta absoluta de un
     * arhivo o directorio
     */
    public String crearFichero(String ruta, String nombre) {

        nombre = nombre.concat(".txt");
        fichero = new File(ruta + File.separator + nombre);

        try {
            fichero.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return fichero.getAbsolutePath();
    }

    /**
     * El metodo encripar tieneuna variable vacia auxiliar que nos ayudara para
     * que los con cindiciales planteados podamos asignar a nuevos datos de tipo
     * String y en si este metodo hace la encriptacion del codigo y con la ayuda
     * de la clase File que se estan usando los mtodos para leer y esribir
     * archivos
     *
     * @param rutaAbsoluta Dato de tipo String
     * @param texto Dato de tipo String
     * @throws Error de archivos no encontrados, error general y el error de
     * escritura
     */
    
    public void encriptar(String rutaAbsoluta, String texto) {
        //fichero = new File(rutaAbsoluta);
        //texto = texto.toLowerCase();
        String aux = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            String le = String.valueOf(letra);
            for (Map.Entry<Character, Character> letra2 : diccionario.entrySet()) {
                String le2 = String.valueOf(letra2.getKey());

                if (le.equalsIgnoreCase(le2)) {
                    // si la varibale le asignida el dato de tipo String letra es mayuscula nos devolvera un true
                    if (Character.isUpperCase(letra)) {
                        aux = aux.concat(String.valueOf(letra2.getValue()).toUpperCase());
                        System.out.println(aux);
                    } else {
                        aux = aux.concat(String.valueOf(letra2.getValue()));
                        System.out.println(aux);
                    }
                }
            }
        }

        try {

            /**
             * Incializacion del objeto archIvoEscritura con el FileWritter que
             * nos permite escribir archivos
             *
             */
            FileWriter archivoEscritura = new FileWriter(rutaAbsoluta, false);
            /**
             * Incializacion del objeto escritura con el BufferedWriter que es
             * como un lector temporados que hace que podamos leer de linea en
             * linea
             */

            BufferedWriter escritura = new BufferedWriter(archivoEscritura);

            escritura.append(aux);

            escritura.close();
            archivoEscritura.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Ruta del archivo no encontrada");
        } catch (IOException ex2) {
            System.out.println("Error de escritura");
        } catch (Exception ex3) {
            System.out.println("Error General");
        }
    }

    
    
}
