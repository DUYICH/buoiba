import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gia tri cua a la :");
        a = sc.nextInt();
        System.out.println("nhap gia tri cua b la :");
        b = sc.nextInt();

        if (a==0){
            if(b==0){
                System.out.println("phuong trinh co vo so nghiem");
            }else {
                System.out.println("phuong trinh da cho vo nghiem");
            }
        }else {
            float x = (float) -b/a;
            System.out.println("phuong trinh co nghiem duy nhat x = :" +x);
        }

        String chuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("chuoi can nhap la :");
        chuoi = scanner.nextLine();
        char c ;
        System.out.println(" ky tu can nhap la :");
        c = scanner.next().charAt(0);
        int count = 0;
        for (int i=0; i < chuoi.length(); i++){
            if (chuoi.charAt(i) == c){
                count++ ;
            }
        }
        System.out.println("so lan xua hien cua " + c+ " la : " + count);

        System.out.println(chuoi.length());
        int doDai = chuoi.length();
        for (int i =0; i < doDai; i++){
            System.out.println("vi tri " + i + " la : " + chuoi.charAt(i));
        }

    }
}

