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

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void addMunicipio(Municipio municipio){
        municipios.add(municipio);
    }

    public int calcularNumeroDehabitantesDeMunicipio(){
        int numeroDeHabitantes = 0;
        for (int i = 0; i < municipios.size(); i++){
            numeroDeHabitantes =  municipios.get(i).calcularNumeroDeHabitantesDeLocalidad();
        }
        return numeroDeHabitantes;
    }

    public String toString(){
        String datos = "El nombre de la provincia es " + nombre + " con " +
                calcularNumeroDehabitantesDeMunicipio() + " habitantes, ";
        for (int i = 0; i < municipios.size(); i++){
            datos += municipios.get(i);
        }
        return datos;
    }
}
