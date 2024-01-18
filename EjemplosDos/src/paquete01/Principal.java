/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete02.DatoTrabajo;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String acomulador = "";
        String nombreEmpresa;
        String direccion;

        double[] misNotas;
        double promedio;

        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        nombreEmpresa = DatoTrabajo.obtenerEmpresa();
        direccion = DatoTrabajo.obtenerDireccion();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);

        for (int i = 0; i < misNotas.length; i++) {
            acomulador = String.format("%s\nNota%d: %.2f\n", acomulador,
                    i + 1, misNotas[i]);
        }
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Nombre de la empresa: %s\n"
                + "Direccion de la empresa: %s\n"
                + "Ciudad: %s\n"
                + "notas: %s\n"
                + "Promedio: %.2f\n",
                nombre,
                apellidoRetornado,
                nombreEmpresa,
                direccion,
                ciudad,
                acomulador,
                promedio);

    }
}
