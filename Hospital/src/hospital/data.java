/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package hospital;

 class Hospital 
{
    String name;
    String location;

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public String getName()
    {
        return name;
    }
}

class Doctor 
{
    int id;
    String name;
    String phone;
    String specialization;

    public Doctor(int id, String name, String phone, String specialization) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }
    public String getSpecialization(){
        return specialization;
    }
    
}

class Patient 
{
    int id;
    String name;
    String phone;
    int age;

    public Patient(int id, String name, String phone, int age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public int getId()
    {
        return id;
    }
}