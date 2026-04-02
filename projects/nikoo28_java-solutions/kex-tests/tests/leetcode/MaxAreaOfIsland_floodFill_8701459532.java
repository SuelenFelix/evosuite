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
import java.lang.Integer;

public class MaxAreaOfIsland_floodFill_8701459532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1938;
     Object term1963;
     Object term1965;
     Object term1967;
     Object term1969;

    public MaxAreaOfIsland_floodFill_8701459532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1938 = (Object[]) newArray("[I", 6);
        int[] term1939 = (int[]) newIntArray(5);
        int[] term1945 = (int[]) newIntArray(1);
        int[] term1947 = (int[]) newIntArray(0);
        int[] term1948 = (int[]) newIntArray(6);
        int[] term1955 = (int[]) newIntArray(5);
        int[] term1961 = (int[]) newIntArray(1);
        setIntElement(term1939, 0, 477625804);
        setIntElement(term1939, 1, 252575029);
        setIntElement(term1939, 2, 57189932);
        setIntElement(term1939, 3, 1460722225);
        setIntElement(term1939, 4, 1743224434);
        setElement(term1938, 0, term1939);
        setIntElement(term1945, 0, 842904495);
        setElement(term1938, 1, term1945);
        setElement(term1938, 2, term1947);
        setIntElement(term1948, 0, 1008080511);
        setIntElement(term1948, 1, 1935707624);
        setIntElement(term1948, 2, 1507074215);
        setIntElement(term1948, 3, -282881827);
        setIntElement(term1948, 4, -1183353915);
        setIntElement(term1948, 5, -420030135);
        setElement(term1938, 3, term1948);
        setIntElement(term1955, 0, 267763294);
        setIntElement(term1955, 1, -1497710478);
        setIntElement(term1955, 2, 49950830);
        setIntElement(term1955, 3, -525257914);
        setIntElement(term1955, 4, 147209682);
        setElement(term1938, 4, term1955);
        setIntElement(term1961, 0, 34470066);
        setElement(term1938, 5, term1961);
        term1963 = new Integer(2058711405);
        term1965 = new Integer(1743683601);
        term1967 = new Integer(-945116798);
        term1969 = new Integer(1593461795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MaxAreaOfIsland");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term1938;
        args[1] = term1963;
        args[2] = term1965;
        args[3] = term1967;
        args[4] = term1969;
        callMethod(klass, "floodFill", argTypes, null, args);
    }

};


