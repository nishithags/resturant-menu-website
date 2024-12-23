//This project is about billing machine in HAV super market.
//This supermarket has 20 items.
//in this supermarket we have coupons namely hav50,hav100,hav300 and if we use them Rs:50,100,300 will be deducted from the total amount.
//in this code we will take the items code as input and we calculate the total amount and add the gst amount.
//if the buyer has coupon we will reduce the respective amounts from the total.
import java.util.*;
class assign{
    String item;
    int n=1;
    float []iarr= new float[20];
    String []sarr= new String[20];
    float []garr= new float[20];
    //assigning items,price and gst amount into the respective arrays
    void item1(){
        n++;
        sarr[n-1]="chips";
        iarr[n-1]= 20; 
        garr[n-1]=1;
    }
    void item2(){
        n++;
        sarr[n-1]= "pens";
        iarr[n-1]=40;
        garr[n-1]=2;
    }
    void item3(){
        n++;
        sarr[n-1]= "toffee";
        iarr[n-1]= 5;
        garr[n-1]=0.25f;
    }
    void item4(){
        n++;
        sarr[n-1]= "book";
        iarr[n-1]= 30;
        garr[n-1]=1.50f;
    }
    void item5(){
        n++;
        sarr[n-1]= "milk";
        iarr[n-1]= 22.5f;
        garr[n-1]=1.13f;
    }
    void item6(){
        n++;
        sarr[n-1]= "flour";
        iarr[n-1]= 35;
        garr[n-1]= 1.75f;
    }
    void item7(){
        n++;
        sarr[n-1]= "egg carton";
        iarr[n-1]= 100;
        garr[n-1]=5;
    }
    void item8(){
        n++;
        sarr[n-1]= "pan";
        iarr[n-1]= 300;
        garr[n-1]=15;
    }
    void item9(){
        n++;
        sarr[n-1]= "bread";
        iarr[n-1]= 35;
        garr[n-1]=1.75f;
    }
    void item10(){
        n++;
        sarr[n-1]= "box";
        iarr[n-1]= 65;
        garr[n-1]=3.25f;
    }
    void item11(){
        n++;
        sarr[n-1]= "vegetables";
        iarr[n-1]= 60;
        garr[n-1]=3;
    }
    void item12(){
        n++;
        sarr[n-1]= "kitchen tools";
        iarr[n-1]= 159.9f;
        garr[n-1]=8;
    }
    void item13(){
        n++;
        sarr[n-1]= "cleaner";
        iarr[n-1]= 210;
        garr[n-1]=10.5f;
    }
    void item14(){
        n++;
        sarr[n-1]= "soda";
        iarr[n-1]= 35;
        garr[n-1]=1.75f;
    }
    void item15(){
        n++;
        sarr[n-1]= "toothpaste";
        iarr[n-1]= 40;
        garr[n-1]=2;
    }
    void item16(){
        n++;
        sarr[n-1]= "soap";
        iarr[n-1]= 50;
        garr[n-1]=2.50f;
    }
    void item17(){
        n++;
        sarr[n-1]= "battery";
        iarr[n-1]= 20;
        garr[n-1]=1;
    }
    void item18(){
        n++;
        sarr[n-1]= "fruit platter";
        iarr[n-1]= 40;
        garr[n-1]=2;
    }
    void item19(){
        n++;
        sarr[n-1]= "toilet paper";
        iarr[n-1]= 25;
        garr[n-1]=1.25f;
    }
    void item20(){
        n++;
        sarr[n-1]= "water bottle";
        iarr[n-1]= 20;
        garr[n-1]=1;
    }
    //creating a function to print the bill
    void printbill(){
        float sum=0;
        float gst=0;
        float gtotal;
        String coupon;
        Scanner s=new Scanner(System.in);
        //taking the coupon code as input
        System.out.println("enter the coupon code:");
        coupon=s.nextLine();
        System.out.println();
        System.out.printf("%55s\n","HAV supermarket");
        //formatting the bill
        System.out.printf("%-15s %8s %20s %26s %38s\n","S.No","Item","Price","Gst","Total Amt(Inc. GST)");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        for(int i=1; i<n; i++){
            System.out.printf("%-15d %8s %18.2f %26.2f %32.2f\n",i,sarr[i],iarr[i],garr[i],(iarr[i]+garr[i]));
        }
        //calculating the sum and gst for the entered items
        for(int i=1; i<n; i++){
            sum = sum + iarr[i];
            gst = gst + garr[i];
        }
        gtotal=sum+gst;
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %27.2f %27.2f %33.2f\n","Total:",sum,gst,gtotal);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        //giving rupees 50 or 100 or 300 as discount depending on the coupon
        String coupon50= "hav50";
        String coupon100="hav100";
        String coupon300="hav300";
        //verifying the coupon codes and reducing the amount
        if(coupon.equals(coupon50)){
            System.out.println("Voucher Discount:  " +50);
            gtotal-=50;
        }
        if(coupon.equals(coupon100)){
            System.out.println("Voucher Discount:  " +100);
            gtotal-=100;
        }
        if(coupon.equals(coupon300)){
            System.out.println("Voucher Discount:  " +300);
            gtotal-=300;
        }
        else{
            System.out.printf("%-15s %5.3f\n","Grand Total:",gtotal);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%58s","Thank you.");
}
}
public class proj3{
    public static void main(String[] args) {
        Scanner code = new Scanner(System.in);
        assign r= new assign();
        //assigning the codes for the items
        String c1="asas123";
        String c2= "qwqw234";
        String c3= "zxzx345";
        String c4="sdsd456";
        String c5="erer567";
        String c6="rtrt678";
        String c7="tyty789";
        String c8="uiui890";
        String c9="ioio901";
        String c10="opop012";
        String c11="lklk123";
        String c12="kjkj234";
        String c13="jhjh345";
        String c14="hghg456";
        String c15="uyuy567";
        String c16="lklk768";
        String c17="ytyt123";
        String c18="hghg890";
        String c19="xzxz657";
        String c20="sasa234";
        String c21="stop";
        //checking if the entered code matches with the item code
        while(true){
            System.out.println("Write the code:");
            String code1= code.nextLine();
            if(!(code1.equals(c21))){
                if(code1.equals(c1)){
                    r.item1();
                }
                else if(code1.equals(c2)){
                    r.item2();
                }
                else if(code1.equals(c3)){
                    r.item3();
                }
                else if(code1.equals(c4)){
                    r.item4();
                }
                else if(code1.equals(c5)){
                    r.item5();
                }
                else if(code1.equals(c6)){
                    r.item6();
                }
                else if(code1.equals(c7)){
                    r.item7();
                }
                else if(code1.equals(c8)){
                    r.item8();
                }
                else if(code1.equals(c9)){
                    r.item9();
                }
                else if (code1.equals(c10)){
                    r.item10();
                }
                else if (code1.equals(c11)){
                    r.item11();
                }
                else if (code1.equals(c12)){
                    r.item12();
                }
                else if (code1.equals(c13)){
                    r.item13();
                }
                else if (code1.equals(c14)){
                    r.item14();
                }
                else if (code1.equals(c15)){
                    r.item15();
                }
                else if (code1.equals(c16)){
                    r.item16();
                }
                else if (code1.equals(c17)){
                    r.item17();
                }
                else if (code1.equals(c18)){
                    r.item18();
                }
                else if (code1.equals(c19)){
                    r.item19();
                }
                else if (code1.equals(c20)){
                    r.item20();
                }
                else{
                    System.out.println("error");
                }
            }
            else{
                break;
            }
        }
        //calling the function to print the bill
        r.printbill();             
    }
}

