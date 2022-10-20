package BasicJavaConstructsImproved;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Stock a = new Stock(10,100);
        Stock b = new Stock(15,50);
        a.CompareGoods(a,b);

        CreateArr();
        ShowArr();
        CountQuantity();


    }
    private int quantity;
    private int price;
    static int  size;
    private static Stock arr[];
    public Stock(){}
    public Stock(int quantity, int price){
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice() {
        System.out.println("введите цену - ");
        Scanner sc = new Scanner(System.in);
        price = sc.nextInt();
    }

    public void setQuantity() {
        System.out.println("введите количество - ");
        Scanner sc = new Scanner(System.in);
        quantity = sc.nextInt();    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public static void ShowGoods(Stock a){
        System.out.println( a.getPrice());
        System.out.println( a.getQuantity());

    }
  public int CountPrice(Stock s){
        int res;
        res = s.quantity *s.price;
      System.out.println("Price - "+res);
      return res;
  }
  public void CompareGoods(Stock a, Stock b){
        if (a.CountPrice(a) > b.CountPrice(b)){
            System.out.print("goods one is more expensive");
        }else System.out.println("goods two is more expensive");
  }
  public static void CreateGoods(Stock s){
        s.setPrice();
        s.setQuantity();
  }
  public static void CreateArr(){

      Scanner sc = new Scanner(System.in);
      System.out.println();
      System.out.println("Введите кол во товаров - ");
      size = sc.nextInt();
      arr = new Stock[size];
      for (int i = 0; i < arr.length; i++) {
          arr[i] = new Stock();
          CreateGoods(arr[i]);
      }
  }
  public static void ShowArr(){
      for (int i = 0; i <arr.length ; i++) {
          ShowGoods(arr[i]);
          System.out.println("------------------");
      }
  }
  public static void CountQuantity(){
        int res = 0;
      for (int i = 0; i < arr.length; i++) {
          res += arr[i].getQuantity();
      }
      System.out.println("total quantity - "+res);
  }
}
