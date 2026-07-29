public class CountFrequency {
    public static void main(String[] args) {
        String str = "PneumonoUltraMicroScopicSilicoVolcanoConiosis";
        System.out.println("Characters Frequencies are: ");
        int[] freq = freqArray(str);
        for(int i=0; i<freq.length; i++) {
            if(freq[i]>0) 
                System.out.println((char)i + " -> " + freq[i]);
        }
    }

    public static int[] freqArray(String s){
        int[] freq = new int[128];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            freq[c]++ ;
        }
        return freq;
    }
}
