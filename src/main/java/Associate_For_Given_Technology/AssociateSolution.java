package Associate_For_Given_Technology;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AssociateSolution {
    public static List<Integer> associatesForGivenTechnology(List<Associate> associate, String searchTechnology) {
        return associate.stream()
                .filter(x -> x.getTechnology().equalsIgnoreCase(searchTechnology) && x.getExperienceInYears()%5 == 0)
                .map(Associate::getId)
                .collect(Collectors.toList());
    }
}
