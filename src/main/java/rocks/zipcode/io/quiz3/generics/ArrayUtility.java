package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        Integer count = 0;
        for (SomeType value : array) {
            count = getNumberOfOccurrences(value);
            if (count % 2 != 0) return value;
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        Integer count = 0;
        for (SomeType value : array) {
            count = getNumberOfOccurrences(value);
            if (count % 2 == 0) return value;
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return (int) Arrays.stream(array)
                .filter(val -> val == valueToEvaluate)
                .count();
    }

    //TODO come vack to this one
    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
