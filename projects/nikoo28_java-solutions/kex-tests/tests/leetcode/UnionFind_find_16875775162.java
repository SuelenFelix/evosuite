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
import java.lang.Integer;

public class UnionFind_find_16875775162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14270;
     Object term14278;

    public UnionFind_find_16875775162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14270 = newInstance(Class.forName("leetcode.UnionFind"));
        int[] term14271 = (int[]) newIntArray(5);
        setIntElement(term14271, 0, 73847121);
        setIntElement(term14271, 1, 1721050745);
        setIntElement(term14271, 2, -1980981205);
        setIntElement(term14271, 3, -1530498856);
        setIntElement(term14271, 4, 1816257051);
        setField(term14270, term14270.getClass(), "father", term14271);
        setIntField(term14270, term14270.getClass(), "count", -541591725);
        term14278 = new Integer(498271385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.UnionFind");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14278;
        callMethod(klass, "find", argTypes, term14270, args);
    }

};


