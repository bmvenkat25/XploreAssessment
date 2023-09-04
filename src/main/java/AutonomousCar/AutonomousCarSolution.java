package AutonomousCar;

import java.util.*;
import java.util.Objects;
import java.util.stream.Collectors;

public class AutonomousCarSolution {

    public static Object findTestPassedByEnv(List<AutonomousCar> carList, String environment) {
        int res = carList.stream()
                .filter(x -> x.getEnvironment().equalsIgnoreCase(environment))
                .map(AutonomousCar::getNoOfTestsPassed)
                .reduce(Integer::sum)
                .orElse(0);
        return res>0?res:"There are no tests passed in this particular environment";
    }

    public static String updateCarGrade(List<AutonomousCar> carList, String brand) {
        List<AutonomousCar> newList = carList.stream()
                .filter(x -> x.getBrand().equalsIgnoreCase(brand))
                .peek(x -> {
                    int temp = (x.getNoOfTestsPassed()*100)/x.noOfTestCaseConducted;
                    x.setGrade(temp>=80?"A1":"B2");
                })
                .collect(Collectors.toList());
        String res = "";
        for (AutonomousCar a : newList)
            res += (a.getBrand()+"::"+a.getGrade());
        return res != "" ? res:"No Car is available with the specified brand";
    }

}
