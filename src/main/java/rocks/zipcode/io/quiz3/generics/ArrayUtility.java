package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<T> {
    private final T[] array;

    public ArrayUtility(T[] array) {
        this.array = array;
    }

    public T findOddOccurringValue() {
        Integer count = 0;
        for (T value : array) {
            count = getNumberOfOccurrences(value);
            if (count % 2 != 0) return value;
        }
        return null;
    }

    public T findEvenOccurringValue() {
        Integer count = 0;
        for (T value : array) {
            count = getNumberOfOccurrences(value);
            if (count % 2 == 0) return value;
        }
        return null;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        return (int) Arrays.stream(array)
                .filter(val -> val == valueToEvaluate)
                .count();
    }

    public T[] filter(Function<T, Boolean> predicate) {
        ArrayList<T> list = (ArrayList<T>) Arrays.stream(array).filter(val -> predicate.apply(val)).collect(Collectors.toList());
        return list.toArray(Arrays.copyOf(array, list.size()));
    }
}
