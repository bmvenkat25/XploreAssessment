package Vowels_Consonants_Count;

public class VowelConsonantCountSolution {
    public static String result(String input) {
        int vow=0,con=0;
        for(char ch:input.toLowerCase().toCharArray()) {
            if(Character.isLetter(ch)) {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    vow++;
                else
                    con++;
            }
        }
        return "Vowels count - "+vow+"\n" +
                "Consonants count - "+con;
    }
}
