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

public class NumberOfIslands_numIslands_3337944431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6424;
     Object term6425;

    public NumberOfIslands_numIslands_3337944431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6424 = newInstance(Class.forName("leetcode.NumberOfIslands"));
        term6425 = (Object[]) newArray("[C", 1);
        char[] term6426 = (char[]) newCharArray(5);
        setCharElement(term6426, 0, 'j');
        setCharElement(term6426, 1, 'G');
        setCharElement(term6426, 2, 'Y');
        setCharElement(term6426, 3, 'S');
        setCharElement(term6426, 4, 'R');
        setElement(term6425, 0, term6426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.NumberOfIslands");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term6425;
        callMethod(klass, "numIslands", argTypes, term6424, args);
    }

};


