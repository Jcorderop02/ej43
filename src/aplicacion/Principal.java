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
 * Es la clase Principal del programa que procesará una petición
 *
 * @author Juan Cordero
 * @version 1.0 19/10/21
 */
package aplicacion;

import dominio.Localidad;
import dominio.Municipio;
import dominio.Provincia;

public class Principal {
    public static void main(String[] args){
        Localidad localidad1 = new Localidad();
        localidad1.setNombre("Aravaca");
        localidad1.setNumeroDeHabitantes(30000);

        Localidad localidad2 = new Localidad();
        localidad2.setNombre("Pozuelo");
        localidad2.setNumeroDeHabitantes(4000);

        Municipio municipio1 = new Municipio();
        municipio1.setNombre("Madrid");
        municipio1.addLocalidad(localidad1);
        municipio1.addLocalidad(localidad2);

        Provincia provincia1 = new Provincia();
        provincia1.setNombre("Madrid");
        provincia1.addMunicipio(municipio1);

        System.out.println(provincia1);
    }
}