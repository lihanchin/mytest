package drink;

import java.util.Scanner;

class DrinkList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int count = scanner.nextInt();
        int price = scanner.nextInt();
        /*float alco = scanner.nextInt();*/

        Drink drink = new Drink(name,count,price);
        Drink.printTitle();
        drink.printOder();

        /*Alcohol alcohol = new Alcohol(name,alco ,count,price);
        alcohol.printTitle();
        alcohol.printalco();*/
        System.out.println("總額：\t"+drink.printTotal());
    }
}

class Drink{
    String name;
    int price;
    int count;

    Drink( String name , int count , int price ){
        this.name=name;
        this.price=price;
        this.count=count;
    }
    static void printTitle(){
        System.out.println( "商品名稱\t\t\t單價\t數量\t總價" );
    }
    int printTotal(){
        return count*price;
    }
    void printOder(){
        System.out.println( name + "\t\t\t" + price + "\t" + count + "\t" + printTotal());
    }
}

/*
class Alcohol extends Drink {
    float alco;

    Alcohol(String n, float a, int c, int p) {
        super(n, c, p);
        this.alco = a;
    }
    void printTitle() {
        System.out.println("商品名稱(濃度[％])\t單價\t數量\t總價");
    }
    void printalco() {
        System.out.println(name + "(" + alco + "%)" + "\t\t" + price + "\t" + count + "\t" + printTotal());
    }
}*/

