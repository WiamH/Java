/**11/01/2021
 * @author wiamh
 * m08- : Gestionar videos, siguientes objetivos:
 *       			h1- Crear el domini con 2 clases: Video + Usuario
 *                  h2- Aplicar un estado enumerable (Uploading:< 1min, Verifying: >1min y Public: >3min).
 *                  h3- Agragar la variable "status", para poder reproducir y parar.
 */
package com.videos;

import com.videos.proyecto.DataValidation;
import com.videos.proyecto.ServiceUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        ServiceUser userV = new ServiceUser();
        DataValidation validObj= new DataValidation();
        String option = "";
        int choice = 0;
        boolean go = false;

        while (!go) {

            showMenu();


            option = lector.nextLine();

            if (!validObj.emptyData(option)) {

                if (validObj.tryNumber(option)) {

                    choice = Integer.parseInt(option);

                    if (choice >= 1 || choice <= 4) {

                        switch (choice) {

                            case 1:
                                userV.registerUser();
                                break;
                            case 2:
                                userV.loginUser();
                                break;
                            case 3:
                                userV.showUsersList();
                                break;
                            case 4:
                                go = true;
                                System.out.println("Exercise ended");
                                break;
                            default:
                                System.out.println("Type a valid option between 1 and 4. ");
                        }
                    } else {
                        System.out.println("Write a valid option between 1 and 4");
                    }
                } else {
                    System.out.println("Write a valid option between 1 and 4");
                    go = false;
                }
            } else {
                go = false;
            }
        }
        lector.close();
    }

    public static void showMenu() {

        System.out.println("-*--*--VIDEOS--*--*-");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Show Users");
        System.out.println("4. Exit");
        System.out.println(">>>> CHOOSE AN OPTION:  ");
    }
}
