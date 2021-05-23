package main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class QueryRentalTime {
    public static int queryPeriod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String tipMessage = Chinese.rentalPeriodSelection;
        String errorMessage = "Please enter A - E";
        Method method = QueryRentalTime.class.getMethod("queryPeriod");
        InputNormalization.regularize(method, "int", tipMessage, errorMessage);
        return InputNormalization.digital;
    }

    public static int queryLeaseTerm() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String tipMessage = Chinese.rentalDurationSelection;
        String errorMessage = "Please key in digital.";
        Method method = QueryRentalTime.class.getMethod("queryLeaseTerm");
        InputNormalization.regularize(method, "int", tipMessage, errorMessage);
        return InputNormalization.digital;
    }
}
