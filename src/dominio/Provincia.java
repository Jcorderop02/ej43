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
 * @version 1.0 25/10/21
 */
package dominio;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Municipio> municipios = new ArrayList<>();

    /**
     * Método para obtener el nombre de la provincia
     * @return Nombre de la provincia
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Método para establecer el nombre de la provincia
     * @param nombre Nueva provincia
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método para obtener los municipios de la ArrayList
     * @return nombre del municipio
     */
    public ArrayList<Municipio> getMunicipios() {
        return municipios;
    }

    /**
     * Método para establecer los Municipios de la ArrayList
     * @param municipios nuevo municipio que se añade
     */
    public void setMunicipios(ArrayList<Municipio> municipios) {
        this.municipios = municipios;
    }

    /**
     * Método que añade un municipio a la ArrayList
     * @param municipio Nombre del municipio que se añade
     */
    public void addMunicipio(Municipio municipio){
        municipios.add(municipio);
    }

    /**
     * Método para calcular el número de habitantes del municipios
     * @return el número de habitantes que hay en los municipios
     */
    public int calcularNumeroDehabitantesDeMunicipio(){
        int numeroDeHabitantes = 0;
        for (int i = 0; i < municipios.size(); i++){
            numeroDeHabitantes =  municipios.get(i).calcularNumeroDeHabitantesDeLocalidad();
        }
        return numeroDeHabitantes;
    }

    /**
     * Método para devolver la información de la clase en formato String
     * @return Informacion en formato String
     */
    public String toString(){
        String datos = "El nombre de la provincia es " + nombre + " con " +
                calcularNumeroDehabitantesDeMunicipio() + " habitantes, ";
        for (int i = 0; i < municipios.size(); i++){
            datos += municipios.get(i);
        }
        return datos;
    }
}
