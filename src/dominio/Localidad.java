/*Copyright [2021] [Juan Cordero]
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

/**
 * Es la clase
 *
 * @author Juan Cordero
 * @version 1.0 22/10/21
 */
package dominio;

public class Localidad {
    private String nombre;
    private int numeroDeHabitantes;

    /**
     * Método para obtener el nombre de la Localidad
     * @return nombre de la localidad
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Método para establecer el nombre de la localidad
     * @param nombre Nombre de la localidad
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método para obtener el numero de habitantes
     * @return numero de habitantes que hay
     */
    public int getNumeroDeHabitantes(){
        return numeroDeHabitantes;
    }

    /**
     * Método para establecer el numero de habitantes
     * @param numeroDeHabitantes Número de habitantes
     */
    public void setNumeroDeHabitantes(int numeroDeHabitantes){
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    /**
     * Método para devolver la información de la clase en formato String
     * @return Informacion en formato String
     */
    public String toString() {
        return "Nombre: " + nombre + " y tiene " +numeroDeHabitantes + " habitantes" + "\n";
    }
}
