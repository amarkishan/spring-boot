package com.testemployee.testemployee;

public class employee 
{
      private int id;
      private String name;
      private String dep;
      private int sal;
      
      public employee(int id,String name,String dep,int sal)
      {
        super();
        this.id = id;
        this.name= name;
        this.dep=dep;
        this.sal=sal;

      }
      public int getId()
      {
        return id;
      }
      
      public String getName()
      {
        return name;
      }
      public String getdep()
      {
        return dep;
      }
      public int sal()
      {
         return sal;
      }
      @Override 
      public String toString()
      {
        return "employee [id=" + id + ", name=" + name + ", dep=" + dep + ",sal="+ sal+"]";
      }

}
