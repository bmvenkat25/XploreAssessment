package Space_Character_Count;

import java.util.Arrays;

public class SpaceCharCountSolution {
    public static String charSolution (String input) {
        int chars=0,space=0;
        for(char x:input.toCharArray()) {
            if(Character.isLetter(x))
            {
                if(x == ' ')
                    space++;
                else
                    chars++;
            }
        }
        return "No of spaces : "+space+" and characters : "+chars;
    }
}
