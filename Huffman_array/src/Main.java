import java.util.Arrays;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> Huffman = new HashMap<>();

        // add elements to hashmap
        Huffman.put("a", 2);
        Huffman.put("b", 5);
        Huffman.put("d", 15);
        Huffman.put("g", 23);
        System.out.println("HashMap: " + Huffman);

        Huffman.put("toplam1",Huffman.get("a")+Huffman.get("b"));
        Huffman.put("toplam2",Huffman.get("toplam1")+Huffman.get("d"));
        Huffman.put("toplam3",Huffman.get("toplam2")+Huffman.get("g"));
        Integer sd1 =Huffman.get("a");
        Integer sd2 =Huffman.get("b");
        Integer sd3 =Huffman.get("d");
        Integer sd4 =Huffman.get("g");
        Integer sd5 =Huffman.get("toplam1");
        Integer sd6 =Huffman.get("toplam2");
        Integer sd7 =Huffman.get("toplam3");

        int [] treedizihali = {sd1,sd2,sd3,sd4,sd5,sd6,sd7};
        int[] dizi;
        Arrays.sort(treedizihali);

        for(int i=0;i<treedizihali.length;i++) {
            System.out.print(treedizihali[i] + "\t");
        }

        HashMap<Integer, String> Huffman2 = new HashMap<>();

        Huffman2.put(treedizihali[0],"000");
        Huffman2.put(treedizihali[1],"001");
        Huffman2.put(treedizihali[2],"00");
        Huffman2.put(treedizihali[3],"01");
        Huffman2.put(treedizihali[4],"0");
        Huffman2.put(treedizihali[5],"1");
        System.out.println(Huffman2);



    }
}