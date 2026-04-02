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
import java.lang.Object;

public class IslandPerimeter_calculateWaterBoundaries_5396521722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8196;
     Object term8197;
     Object term8199;
     Object term8201;

    public IslandPerimeter_calculateWaterBoundaries_5396521722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8196 = newInstance(Class.forName("leetcode.IslandPerimeter"));
        term8197 = new Integer(-1547322575);
        term8199 = new Integer(-61444233);
        term8201 = (Object[]) newArray("[I", 2);
        int[] term8202 = (int[]) newIntArray(5);
        int[] term8208 = (int[]) newIntArray(0);
        setIntElement(term8202, 0, -400720912);
        setIntElement(term8202, 1, 1266192397);
        setIntElement(term8202, 2, 218346781);
        setIntElement(term8202, 3, -984660976);
        setIntElement(term8202, 4, -1419341969);
        setElement(term8201, 0, term8202);
        setElement(term8201, 1, term8208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.IslandPerimeter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term8197;
        args[1] = term8199;
        args[2] = term8201;
        callMethod(klass, "calculateWaterBoundaries", argTypes, term8196, args);
    }

};


