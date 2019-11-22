/* 
 * Copyright 2019 Andrés Cosín Zamareño - Cousin183@gmail.com ..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrés Cosín Zamareño - Cousin183@gmail.com .
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Constantes
        String SI = "SI";
        String NO = "NO";

        //Variable
        String decision;
        int anyo;
        //Rotulo
        System.out.printf("Alternativa Bisiesta%n====================%n");

        try {

            //Scanner
            System.out.print("Análisis año ...: ");
            anyo = SCN.nextInt();

            if (anyo % 400 == 0) {
                decision = SI;

            } else if (anyo % 100 == 0) {
                decision = NO;
            } else if (anyo % 4 == 0) {
                decision = SI;
            } else {
                decision = NO;
            }

            //Separador
            System.out.println("---");

            //Mensaje
            System.out.printf("El año %d  ....: %s es bisiesto%n ", anyo, decision);
        } catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta");
        }
    }
}
