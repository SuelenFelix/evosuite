package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NumberOfLinesToWriteString_main_6136253192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8528;

    public NumberOfLinesToWriteString_main_6136253192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8528 = (Object[]) newArray("java.lang.String", 9);
        setElement(term8528, 0, "iljANwuEjk");
        setElement(term8528, 1, "kNqaJKIATy");
        setElement(term8528, 2, "vKQukfbJUd");
        setElement(term8528, 3, "lFRJFUMVbx");
        setElement(term8528, 4, "sZdUNdggUW");
        setElement(term8528, 5, "OqbwYQfvAe");
        setElement(term8528, 6, "tRxZafjqIx");
        setElement(term8528, 7, "DhjNLmRMCu");
        setElement(term8528, 8, "PgPzMSEjjX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.NumberOfLinesToWriteString");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8528;
        callMethod(klass, "main", argTypes, null, args);
    }

};


