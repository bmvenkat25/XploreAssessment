package AutonomousCar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class AutonomousCarTest {
    @Test
    public void compareResults() {
        List<AutonomousCar> carList = Arrays.asList(
                new AutonomousCar(100,"Tesla",1000,500,"Hills",""),
                new AutonomousCar(200,"Ford",2000,1500,"Desert",""),
                new AutonomousCar(300,"Royce",3000,1700,"Hills",""),
                new AutonomousCar(400,"Mercedez",1000,400,"Desert","")
        );
        assertEquals(1900, AutonomousCarSolution.findTestPassedByEnv(carList,"Desert"));
        assertEquals("Mercedez::B2",AutonomousCarSolution.updateCarGrade(carList,"Mercedez"));
    }

}
