/**11/01/2021
 * @author wiamh
 * m08- : Gestionar videos, siguientes objetivos:
 *       			h1- Crear el domini con 2 clases: Video + Usuario
 *                  h2- Aplicar un estado enumerable (Uploading:< 1min, Verifying: >1min y Public: >3min).
 *                  h3- Agragar la variable "status", para poder reproducir y parar.
 */
package com.videos.proyecto;

import java.util.regex.Pattern;

public class DataValidation {

    public DataValidation() {
        super();

    }

    public boolean emptyData(String option) {
        boolean replyEmpty = false;
        if (option.equals("")) {
            try {
                replyEmpty = true;
                throw new EmptyFieldException();
            } catch (EmptyFieldException efe) {
                efe.printStackTrace();
            }
        }
        return replyEmpty;
    }

    public boolean tryNumber(String option) {
        boolean replyValid = true;
        try {
            Integer.parseInt(option);
            replyValid = true;
        } catch (NumberFormatException e) {
            replyValid = false;
        }
        return replyValid;
    }

    public boolean verifyData(String textUser) {
        boolean replyEmpty;
        if (emptyData(textUser)) {
            replyEmpty = false;
        } else {
            if (tryNumber(textUser)) {
                replyEmpty = false;
                System.out.println("Numbers are not allowed");
            } else {
                if ((textUser.length() < 3) || (textUser.length() > 150)) {
                    replyEmpty = false;
                    System.out.println("You must enter a valid text, minimum of 3 characters and maximum of 150");
                } else {
                    replyEmpty = true;
                }
            }
        }
        return replyEmpty;
    }

    public boolean verifyText(String textUser) {
        boolean replyEmpty;
        String patText = "[a-zA-Z ñÑ]+";
        if (emptyData(textUser)) {
            replyEmpty = false;
        } else {
            if (!Pattern.matches(patText, textUser)) {
                replyEmpty = false;
                System.out.println("Numbers are not allowed");
            } else {
                if ((textUser.length() < 3) || (textUser.length() > 150)) {
                    replyEmpty = false;
                    System.out.println("You must enter a valid text, minimum of 3 characters and maximum of 150");
                } else {
                    replyEmpty = true;
                }
            }
        }
        return replyEmpty;
    }

    public boolean validatePassword(String textUser) {
        boolean validPassword = true;

        if (emptyData(textUser)) {
            validPassword = false;
        } else {
            if (textUser.length() < 8 || textUser.length() > 8) {
                System.out.println("Please, write a valid password, 8 characters long");
                validPassword = false;
            } else {
                validPassword = true;
            }
        }
        return validPassword;
    }

    public boolean verifyAnswer(String textUser) {

        boolean answerV = true;
        String patText = "[a-zA-Z ñÑ]+";

        if (!emptyData(textUser)) {

            if (Pattern.matches(patText, textUser)) {

                if ((textUser.contentEquals("yes")) || (textUser.contentEquals("no"))) {
                    answerV = true;
                } else {
                    answerV = false;
                    System.out.println("Wrong answer, write yes or no");
                }
            } else {
                answerV = false;
                System.out.println("Wrong answer, write yes or no");
            }
        } else {
            answerV = false;
        }
        return answerV;
    }
}
