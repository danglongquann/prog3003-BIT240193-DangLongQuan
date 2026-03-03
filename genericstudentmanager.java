/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package studentmanagement;
import java.util.*;
import java.util.List;
/**
 *
 * @author longquan
 */
public class genericstudentmanager<T>{
  private List<T> data = new ArrayList <>();
  public void add(T item){
      data.add(item);
  }
  public List<T> getall(){
    return data;  
  }
}

