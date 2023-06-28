package a13_06;

import java.util.*;

class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getproductId(){
        return id;
    }

    @Override
    public String toString(){
        return id+" "+name+" "+price;
    }
}
public  class curd {


    public static void main(String[] args) {
        List<Product> lst =new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        Scanner sc1 =new Scanner(System.in);

        int ch;
        do{
            System.out.println("1. INSERT PRODUCT");
            System.out.println("2. DISPLAY PRODUCT");
            System.out.println("3. DELETE PRODUCT");
            System.out.println("4. UPDATE PRODUCT");
            System.out.println("0. Exit");

            System.out.println("Enter Your choice :- ");
            ch =sc.nextInt();

            switch(ch){
                case 1 -> {
                    System.out.println("Enter Product Id :- ");
                    int id =sc.nextInt();
                    System.out.println("Enter Product Name:- ");
                    String name =sc1.nextLine();
                    System.out.println("Enter Product Price :- ");
                    int price =sc.nextInt();

                    lst.add(new Product(id,name,price));
                }

                case 2 -> {
                    System.out.println("-----------------------------------------");
                    for (Product p: lst) {

                        System.out.println("PID | PNAME | PPRICE ");
                        System.out.println(p);
                    }
                    System.out.println("-----------------------------------------");
                }

                case 3 -> {
                    boolean found = false;
                    System.out.println("Enter Product  Id number to Delte");
                    int Pid =sc.nextInt();
                    System.out.println("-----------------------------------------");
                    Iterator<Product> i = lst.iterator();
                    while(i.hasNext()){
                        Product p =i.next();
                        if(p.getproductId()== Pid){
                            i.remove();
                            System.out.println(p);
                            found=true;
                        }

                    }
                    if(!found){
                        System.out.println("Product Doesn't Exit");
                    }
                    else{
                        System.out.println("Product  is Deleted Succesfully");
                    }
                    System.out.println("-----------------------------------------");
                }

                case 4 -> {
                    boolean found = false;
                    System.out.println("Enter Product  Id  to Update ");
                    int pid2 =sc.nextInt();
                    System.out.println("-----------------------------------------");
                    ListIterator<Product> li = lst.listIterator();
                    String pname1;
                    int pprice1;
                    while(li.hasNext()){
                        Product p=li.next();
                        if(p.getproductId()== pid2){
                            System.out.println("Enter The New Name ");
                            pname1 =sc1.nextLine();
                            System.out.println("Enter The New Price ");
                            pprice1 =sc.nextInt();
                            li.set(new Product(pid2,pname1,pprice1));

                            found=true;
                        }

                    }
                    if(!found){
                        System.out.println("Product Doesnt Exit");
                    }
                    else{
                        System.out.println("Product is updated Succesfully");
                    }
                    System.out.println("-----------------------------------------");
                }
            }

        }while(ch!=0);

    }
}
