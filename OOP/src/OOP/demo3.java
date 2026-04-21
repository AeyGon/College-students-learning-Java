package OOP;

public class demo3 {
    public static void main(String[] args) {
        //实际参数和形式参数的类型要对应！
    int add=new demo3().add(1,2);
        System.out.println(add);
    }
    public int add(int a,int b){
        return a+b;
    }
}
