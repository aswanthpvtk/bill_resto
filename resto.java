import java.util.ArrayList;
import java.util.Scanner;

public class resto {

    int ntea;
    int ncoffee;
    int nsnacks;
    int nidli;
    int ndosa;
    String name;
    String ph;


    public resto(int ntea, int ncoffee, int nsnacks, int nidli, int ndosa, String name, String ph) {
        this.ntea = ntea;
        this.ncoffee = ncoffee;
        this.nsnacks = nsnacks;
        this.nidli = nidli;
        this.ndosa = ndosa;
        this.name = name;
        this.ph = ph;


    }

    public int getNtea() {
        return ntea;
    }

    public int getNcoffee() {
        return ncoffee;
    }

    public int getNsnacks() {
        return nsnacks;
    }

    public int getNidli() {
        return nidli;
    }

    public int getNdosa() {
        return ndosa;
    }

    public String getName() {
        return name;
    }

    public String getPh() {
        return ph;
    }


    //    static int tea=10;
//    static int coffee=15;
//    static int snacks=10;
//    static int idli=8;

    public static void main(String[] args) {

        int op;
        boolean flag;
        int billno=1;
        while (flag = true)
        {
        ArrayList<resto> arr = new ArrayList<resto>();


            System.out.println("Enter the option:");
        while (true) {
            System.out.println("--------------------------------------------");
            System.out.println("Tea=10\nCoffee=15\nSnacks=10\nIdli=8\nDosa=6");
            System.out.println("--------------------------------------------");
            System.out.println("1.add items\n2.Generate bill\n3.view\n4.exit");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Enter the customer name:");
                    String name = sc.next();
                    System.out.println("Enter the phone number:");
                    String ph = sc.next();
                    System.out.println("Enter the no of tea:");
                    int ntea = sc.nextInt();
                    System.out.println("Enter the number of coffee");
                    int ncoffee = sc.nextInt();
                    System.out.println("enter the no of snacks");
                    int nsnacks = sc.nextInt();
                    System.out.println("enter the no of idli");
                    int nidli = sc.nextInt();
                    System.out.println("enter the no of dosa");
                    int ndosa = sc.nextInt();
                    resto e = new resto(ntea, ncoffee, nsnacks, nidli, ndosa, name, ph);
                    arr.add(e);
                    billno++;
                    break;


                case 2:
                    System.out.println("The bill is:");

                    for (int i = 0; i < arr.size(); i++) {
                        System.out.println("The customer name:" + arr.get(i).name);
                        System.out.println("phone number:" + arr.get(i).ph);
                        System.out.println("The no of tea is:" + arr.get(i).ntea);
                        System.out.println("The no of coffee is:" + arr.get(i).ncoffee);
                        System.out.println("The no of snacks is:" + arr.get(i).nsnacks);
                        System.out.println("The no of idli is:" + arr.get(i).nidli);
                        System.out.println("The no of dosa is:" + arr.get(i).ndosa);

                        int bill = ((arr.get(i).ntea * 10) + (arr.get(i).ncoffee * 15) + (arr.get(i).nsnacks * 10) + (arr.get(i).nidli * 8) + (arr.get(i).ndosa * 6));
                        System.out.println("the final bill is :" + bill);

                    }


                case 3:
                    System.out.println("The all transactions are:");
                    for (int i = 0; i < arr.size(); i++) {
                        System.out.println("________________________________");
                        System.out.println("bill no:"+billno++);
                        System.out.println("name:" + arr.get(i).name);
                        System.out.println("phone:" + arr.get(i).ph);
                        int bill = ((arr.get(i).ntea * 10) + (arr.get(i).ncoffee * 15) + (arr.get(i).nsnacks * 10) + (arr.get(i).nidli * 8) + (arr.get(i).ndosa * 6));
                        System.out.println("the final bill is :" + bill);

                    }
                    break;

                case 4:
                    flag = false;
                    break;


            }
//         break;
        }
    }}


}
