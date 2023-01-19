public class Hamming {

    public static int distance(String s1, String s2) {
        if (s1.length() != s2.length()) throw new RuntimeException("strings have different length");
        int i = 0;
        int result = 0;
        String[] splitS1 = s1.split("");
        String[] splitS2 = s2.split("");
        while (s1.length() > i){
            if (!splitS1[i].equals(splitS2[i])) result += 1;
            i += 1;
        }
        return result;
    }
}
