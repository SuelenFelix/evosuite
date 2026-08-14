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
     Object term6409;
     Object term6410;

    public MinimumMovesToEqualArrayElements_minMoves_17126820041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6409 = newInstance(Class.forName("leetcode.MinimumMovesToEqualArrayElements"));
        term6410 = (int[]) newIntArray(6);
        setIntElement(term6410, 0, -1362132929);
        setIntElement(term6410, 1, 1267740164);
        setIntElement(term6410, 2, 1363887997);
        setIntElement(term6410, 3, -1744763945);
        setIntElement(term6410, 4, 852281447);
        setIntElement(term6410, 5, 1248430530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MinimumMovesToEqualArrayElements");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term6410;
        callMethod(klass, "minMoves", argTypes, term6409, args);
    }

};


