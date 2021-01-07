/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author azure Tran
 */
public abstract class  Person {
    protected  String hovaten;
    protected  String phonenumber;
    protected  String address;
      protected  String Email;
        protected  int age;

    @Override
    public String toString() {
        return "Person{" + "hovaten=" + hovaten + ", phonenumber=" + phonenumber + ", address=" + address + ", Email=" + Email + ", age=" + age + '}';
    }

    public Person(String hovaten, String phonenumber, String address, String Email, int age) {
        this.hovaten = hovaten;
        this.phonenumber = phonenumber;
        this.address = address;
        this.Email = Email;
        this.age = age;
    }

    public String getHovaten() {
        return hovaten;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return Email;
    }

    public int getAge() {
        return age;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAge(int age) {
        this.age = age;
    }
       
}
