package main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class QueryNumOfPeople {
    public static int queryAll() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String tipMessage = "How many people are there altogether?";
        String errorMessage = "Please key in digital.";
        Method method = QueryNumOfPeople.class.getMethod("queryAll");
        InputNormalization.regularize(method, "int", tipMessage, errorMessage);
        return InputNormalization.digital;
    }

    public static int queryCoach() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String tipMessage = "How many of you are coaches?";
        String errorMessage = "Please key in digital.";
        Method method = QueryNumOfPeople.class.getMethod("queryCoach");
        InputNormalization.regularize(method, "int", tipMessage, errorMessage);
        return InputNormalization.digital;
    }

    public int checkNumOfCoach(int numOfPeople) {
        return 0;
    }
}
