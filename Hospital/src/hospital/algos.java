/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Nour
 */
public class algos
{

        
  // Search for a patient by ID manually
    public static Patient searchPatientById(Patient[] patients, int id) 
    {
        for (int i = 0; i < patients.length; i++)
        {
            if (patients[i].getId() == id) 
            {
                return patients[i];
                
            }
        }
        return null;
        
    }
    public static void searchDoctorsBySpecialization(Doctor[] doctors, String specialization) {
        boolean found = false;
        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i].getSpecialization().equals(specialization)) {
                found = true;
                System.out.println("Doctor ID: " + doctors[i].getId() + ", Name: " + doctors[i].name +
                        ", Phone: " + doctors[i].phone + ", Specialization: " + doctors[i].getSpecialization());
            }
        }
    }
    public static void sortHospitalsByName(Hospital[] hospitals) {
    int n = hospitals.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (hospitals[j].getName().compareTo(hospitals[j + 1].getName()) > 0) {
                // Swap with bigger
                Hospital temp = hospitals[j];
                hospitals[j] = hospitals[j + 1];
                hospitals[j + 1] = temp;
            }
        }
    }
}
}