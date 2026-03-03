/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

/**
 *
 * @author longquan
 */
public class student {
    private String ID;
    private String Name;
    private Double GPA;
 
public student( String ID , String Name, Double GPA ){
 this.ID = ID;
 this.Name = Name;
 this.GPA = GPA;
}

public String getID(){
    return ID;
            }
public void setID(String ID){ 
    this.ID = ID;
}
public String getName(){
    return Name;
}
public void setName (String Name){
    this.Name = Name; 
}
public double getGPA (){
    return GPA; 
}
public void setGPA (double GPA){
    this.GPA =GPA;
}
    @Override
    public String toString(){
    return "Student{" + "ID='" + ID + '\'' + ", Name='" + Name + '\'' + ", GPA=" + GPA + '}';
    
}
}