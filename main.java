import  java.util.Scanner;
public class main {
    public static void main(String[] args){
        int n1,n2;
        Scanner imp=new Scanner(System.in);
        System.out.print("Lütfen Birinci Sayıyı Giriniz :");
        n1=imp.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Giriniz :");
        n2=imp.nextInt();
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("Lütfen Yapmak İsteğin İşlemi Belirten :");
        int select=imp.nextInt();
        switch (select){
            case 1:
                System.out.print("Toplama :"+(n1+n2));
                break;
            case 2:
                System.out.print("Çıkarma :"+(n1-n2));
                break;
            case 3:
                System.out.print("Çarpma :"+(n1*n2));
                break;
            case 4:
                if(n2!=0)
                    System.out.print("Bölme :"+(n1/n2));
                else
                    System.out.print("Bölme işlemi Başarsız , Bir sayı sıfıra bölnemez !");
                break;
            default:
                System.out.print("Yanlış Seçim Yaptınız ! ");

        }

    }
}
