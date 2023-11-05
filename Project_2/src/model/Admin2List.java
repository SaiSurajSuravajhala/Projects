/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Admin2List {

   
    private ArrayList<Admin1Add> personList;

    public Admin2List() {
       // ArrayList<Admin1Add>Admin2List;
        this.personList = new ArrayList<Admin1Add>();
    }   
    
    public ArrayList<Admin1Add> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Admin1Add> personList) {
        this.personList = personList;
    }
    
    public Admin1Add addPerson()
    {
        Admin1Add admin1add = new Admin1Add();
        personList.add(admin1add);
        return admin1add;
    }
    public void deletePerson(Admin1Add admin1add)
    {
     personList.remove(admin1add)  ; 
    }
    public Admin1Add searchAccount(String nuId)
    {
        for(Admin1Add admin1add:personList)
        {
            if (admin1add.getNuId().equals(nuId))
            {
                return admin1add;
            }
        }
        return null;
    }
}
