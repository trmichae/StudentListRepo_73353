package listofstudents;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 */
public class Student {
  private String name;
  private int id;
  private String DoB;
  private int id2;

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }
  
  
  
  public Student()
  {
       this.id =0;
       this.name = "Not Set";
  }
  
  public Student(String givenName, int givenId)
  {
      this.name = givenName;
      this.id = givenId;
  }
  
  public void setName (String givenName)
  {
      this.name = givenName;
  }
  public String getName()
  {     
      return name;
  }
  
  public void setId(int givenId)
  {
      id = givenId;
  }
  public int getId()
  {
      return id;
  }

    /**
     * @return the DoB
     */
    public String getDoB() {
        return DoB;
    }

    /**
     * @param DoB the DoB to set
     */
    public void setDoB(String DoB) {
        this.DoB = DoB;
    }
  
    
    
}
