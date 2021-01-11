/**11/01/2021
 * @author wiamh
 * m06- : Software para gestionar el sueldo de los trabajadores, siguientes objetivos:
 *       			F1.Diferenciar entre 4 tipos de trabajadores: Manager, Boss, Employee, Volunteer
 *       			F2.Añadir 3 tipos de nivel: Junior, Mid y Senyor.
 *       			F3.Restar el % d’IRPF del salario bruto
 */
package com.jobs;

import java.util.List;

import com.jobs.application.JobsController;
import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Volunteer;

public class Main {

    private static JobsController controller = new JobsController();

    public static void main(String[] args) throws Exception {

        controller.createBossEmployee("Alberto Boss", "Vive en su municipio 1", "698745993", 2500.0);
        controller.createEmployee("Carmen Manager", "Su casa 2", "678945213", 2000.0);
        controller.createEmployee("Carlos Employee", "Dirección calle su casa 3", "621459789", 1500.0);
        controller.createVolunteer("Carito Volunteer", "Dirección calle su casa 4", "7894561234");
        controller.createManagerEmployee("Carla Employee", "Dirección calle su casa 5", "698784598", 1080.0);

        controller.payAllEmployeers();

        List<AbsStaffMember> allEmployees = controller.getAllEmployees();

        for (AbsStaffMember a : allEmployees) {

            if (a instanceof Volunteer) {
                System.out.println("Rol: " + a.getId() + " | " + a.getName() + " | " + a.getAddress() + " | "
                        + a.getPhone() + " | " + ((Volunteer) a).getDescription() + " | ");
            } else {
                System.out.println("Rol: " + a.getId() + " | " + a.getName() + " | " + a.getAddress() + " | "
                        + a.getPhone() + " | " + a.getTotalPaid() + " | ");
            }
        }
    }
}
