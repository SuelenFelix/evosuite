package hackerrank.algorithms.sorting;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static hackerrank.algorithms.sorting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class InsertionSortPartOne_main_12895222382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;

    public InsertionSortPartOne_main_12895222382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12 = (Object[]) newArray("java.lang.String", 4);
        setElement(term12, 0, "PAEBtnZtTD");
        setElement(term12, 1, "sjlJAEtRrb");
        setElement(term12, 2, "MuLcgQHgqz");
        setElement(term12, 3, "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.algorithms.sorting.InsertionSortPartOne");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term12;
        callMethod(klass, "main", argTypes, null, args);
    }

};


