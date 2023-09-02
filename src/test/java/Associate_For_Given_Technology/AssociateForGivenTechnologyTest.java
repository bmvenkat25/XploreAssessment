package Associate_For_Given_Technology;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class AssociateForGivenTechnologyTest {
    @Test
    public void compareResults() {
        List<Associate> associateList = Arrays.asList(
                new Associate(101,"Alex","Java",15),
                new Associate(102,"Albert","Unix",20),
                new Associate(103,"Alferd","Testing",13),
                new Associate(104,"Alfa","Java",15),
                new Associate(105,"Almas","Java",29)
        );
        assertEquals(Arrays.asList(101,104), AssociateSolution.associatesForGivenTechnology(associateList,"java"));
    }
}
