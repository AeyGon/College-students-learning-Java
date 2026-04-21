package OOP;
//引用传递：对象，本质还是值传递

//对象，内存！
public class demo5 {
    public static void main(String[] args) {
Person person=new Person();
        System.out.println(person.name);

        demo5.change(person);

        System.out.println(person.name);
    }
    public  static  void  change(Person Person){
        //person是一个对象：指向的--->Person person=new person();这是一个具体的人，可以改变属性！
        Person.name="huge";
    }
}
//定义一个person类，有一个属性：name
class  Person{
    String name;
        }