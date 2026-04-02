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

public class ZombieClusters_zombieClusterDFS_8258881601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9498;
     Object term9512;

    public ZombieClusters_zombieClusterDFS_8258881601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9498 = newInstance(Class.forName("leetcode.ZombieClusters"));
        Object[] term9499 = (Object[]) newArray("[I", 4);
        int[] term9500 = (int[]) newIntArray(2);
        int[] term9503 = (int[]) newIntArray(2);
        int[] term9506 = (int[]) newIntArray(2);
        int[] term9509 = (int[]) newIntArray(2);
        setIntElement(term9500, 0, 1);
        setElement(term9499, 0, term9500);
        setIntElement(term9503, 0, -1);
        setElement(term9499, 1, term9503);
        setIntElement(term9506, 1, 1);
        setElement(term9499, 2, term9506);
        setIntElement(term9509, 1, -1);
        setElement(term9499, 3, term9509);
        setField(term9498, term9498.getClass(), "distance", term9499);
        term9512 = (Object[]) newArray("java.lang.String", 3);
        setElement(term9512, 0, "GrqozDKFOk");
        setElement(term9512, 1, "CFyoseFGLF");
        setElement(term9512, 2, "SFqCrhEWLm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ZombieClusters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9512;
        callMethod(klass, "zombieClusterDFS", argTypes, term9498, args);
    }

};


