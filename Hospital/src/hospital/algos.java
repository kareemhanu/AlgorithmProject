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

        
    //BinarySearch
    public static int searchPatientById(Patient[] patients, int id) 
    {
        int beg = 0;
        int end = patients.length -1;
        while (beg <= end)
        {
            int med = beg + (end - beg) / 2;
            if (id == patients[med].getId())
                return med;
            
            else if (id > patients[med].getId())
                beg = med + 1;
            
            else
                end = med - 1;
        }
        return -1;
        
    }
    
    // Linear Search
    public static void searchDoctorsBySpecialization(Doctor[] doctors, String specialization) 
    {
        boolean found = false;
        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i].getSpecialization().equals(specialization)) {
                found = true;
                System.out.println("Doctor ID: " + doctors[i].getId() + ", Name: " + doctors[i].name +
                        ", Phone: " + doctors[i].phone + ", Specialization: " + doctors[i].getSpecialization());
            }
        }
    }
    
    //Bubble Sort
    public static void sortHospitalsByName(Hospital[] hospitals) 
    {
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
    
    //Insertion Sort
    // lazm ttrag3!!
    public static void sortDoctorsById(Doctor[] doctors)
    {
        int n = doctors.length;
        for (int j=1 ; j<n ; j++)
        {
            int key = doctors[j].getId();
            Doctor keyDoctor = doctors[j];
            int i = j-1;
            
            while( (i>=0) && (doctors[i].getId() > key))
            {
                doctors[i+1] = doctors[i];
                i--;
            }
            

            doctors[i + 1] = keyDoctor; 
        }
    }
}