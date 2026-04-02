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

public class MinimumMovesToEqualArrayElements_minMoves_17126820041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6180;
     Object term6181;

    public MinimumMovesToEqualArrayElements_minMoves_17126820041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6180 = newInstance(Class.forName("leetcode.MinimumMovesToEqualArrayElements"));
        term6181 = (int[]) newIntArray(4);
        setIntElement(term6181, 0, -208314837);
        setIntElement(term6181, 1, 697841387);
        setIntElement(term6181, 2, -1749591213);
        setIntElement(term6181, 3, 1703093401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MinimumMovesToEqualArrayElements");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term6181;
        callMethod(klass, "minMoves", argTypes, term6180, args);
    }

};


