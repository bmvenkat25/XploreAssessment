package Unique_Characters;

import java.util.Arrays;

import java.util.LinkedHashSet;

public class UniqueCharSolution {
    public static String getUniqueChars (String input) {
        LinkedHashSet<Character> sh = new LinkedHashSet<>();
        Arrays.asList(input.split("")).forEach(n -> sh.add(n.charAt(0)));
        return sh.toString();
    }
}
