/**11/01/2021
 * @author wiamh
 * m08- : Gestionar videos, siguientes objetivos:
 *       			h1- Crear el domini con 2 clases: Video + Usuario
 *                  h2- Aplicar un estado enumerable (Uploading:< 1min, Verifying: >1min y Public: >3min).
 *                  h3- Agragar la variable "status", para poder reproducir y parar.
 */
package com.videos.proyecto;

public class EmptyFieldException extends Throwable {

    private static final long serialVersionUID = 1L;

    public EmptyFieldException() {
    }

}
