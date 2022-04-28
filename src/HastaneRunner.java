import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HastaneRunner implements Method {

    private static Hastane hastane1 = new Hastane();

    static Durum obj = new Durum();
    static Map<String, String> doktorListesi = new HashMap<>();
    static Map<Integer, String> hastaListesi = new HashMap<>();
    static String hastaDurumu;
   static  String unvan;
    static Scanner scan =new Scanner(System.in);


    public static void main(String[] args) {



        doktorListesi.put("Allergist", "Nilson, Avery ");
        doktorListesi.put("Norolog", "John, Abel ");
        doktorListesi.put("Genel cerrah", "Robert, Erik ");
        doktorListesi.put("Cocuk doktoru", "Marry, Jacob ");
        doktorListesi.put("Dahiliye", "Alan, Pedro ");
        doktorListesi.put("Kardiyalog", "Mahesh, Tristen ");


        hastaListesi.put(111, "Warren, Traven, Allerji");
        hastaListesi.put(222, "Petanow, William, Bas Agrisi");
        hastaListesi.put(333, "Sophia, George, Diabet");
        hastaListesi.put(444, "Emma, Tristen, Sogukalginligi");
        hastaListesi.put(555, "Darian, Luis, Migren");
        hastaListesi.put(666, "Peter, Cole, Kalphastaliklari");



    }

    @Override
    public  void doktorUnvani() {
        Doktor doktor = new Doktor();
        System.out.println(" lutfen gitmek istediginiz bolum yaziniz ");
        String bolum= scan.nextLine().toUpperCase();

        for (Map.Entry<String, String> each : doktorListesi.entrySet()) {
            if(doktorListesi.containsKey(bolum)) {

                System.out.println(" istediginiz bolumde doktor bulunmaktadir");

            }else{
                System.out.println(" istediginiz bolumde doktor bulunmamakladir");
            }
        }



    }

    @Override
    public void hastaBul() {

    }

    @Override
    public void doktorBul() {


    }

    @Override
    public void hastaDurumu() {

    }
}

