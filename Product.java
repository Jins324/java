class Product
{
    int pcode,price;
    String pname;
    Product(int c,String n,int p)
    {
        pcode=c;
        pname=n;
        price=p;
    }
void display(){

    System.out.println("Code: "+pcode);
    System.out.println("Name: "+pname);
    System.out.println("Price: "+price);
}
public static void main(String[]args){

    Product p1=new Product(101,"Laptop",59000);
    Product p2=new Product(102,"Smartphone",16000);
    Product p3=new Product(103,"Tablet",30000);
    Product lowest=(p1.price<p2.price)?(p1.price<p3.price?p1:p3):(p2.price<p3.price?p2:p3);
    System.out.println("produc with the lowest price:");
    lowest.display();
    }
}


    
    



