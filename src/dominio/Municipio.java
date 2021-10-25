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

import java.util.ArrayList;

public class Municipio {
    private String nombre;
    private ArrayList<Localidad> localidades = new ArrayList<>();

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public ArrayList<Localidad> getLocalidad(){
        return localidades;
    }

    public void setLocalidad(ArrayList<Localidad> localidades){
        this.localidades = localidades;
    }

    public void addLocalidad(Localidad localidad){
        localidades.add(localidad);
    }

    public int calcularNumeroDeHabitantesDeLocalidad(){
        int numeroDehabitantes = 0;
        for (int i =0; i < localidades.size(); i++){
            numeroDehabitantes += localidades.get(i).getNumeroDeHabitantes();
        }
        return numeroDehabitantes;
    }

    public String toString(){
        String datos = "El nombre del municipio es " + nombre + " con " + calcularNumeroDeHabitantesDeLocalidad() +
                " habitantes y tiene estas localidades: " + "\n";
        for (int i = 0; i < localidades.size(); i++){
            datos += localidades.get(i);
        }
        return datos;
    }
}
