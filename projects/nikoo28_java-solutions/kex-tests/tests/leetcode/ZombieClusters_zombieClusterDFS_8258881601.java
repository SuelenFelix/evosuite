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
     Object term9481;
     Object term9495;

    public ZombieClusters_zombieClusterDFS_8258881601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9481 = newInstance(Class.forName("leetcode.ZombieClusters"));
        Object[] term9482 = (Object[]) newArray("[I", 4);
        int[] term9483 = (int[]) newIntArray(2);
        int[] term9486 = (int[]) newIntArray(2);
        int[] term9489 = (int[]) newIntArray(2);
        int[] term9492 = (int[]) newIntArray(2);
        setIntElement(term9483, 0, 1);
        setElement(term9482, 0, term9483);
        setIntElement(term9486, 0, -1);
        setElement(term9482, 1, term9486);
        setIntElement(term9489, 1, 1);
        setElement(term9482, 2, term9489);
        setIntElement(term9492, 1, -1);
        setElement(term9482, 3, term9492);
        setField(term9481, term9481.getClass(), "distance", term9482);
        term9495 = (Object[]) newArray("java.lang.String", 8);
        setElement(term9495, 0, "CFyoseFGLF");
        setElement(term9495, 1, "SFqCrhEWLm");
        setElement(term9495, 2, "GZdcJyZntS");
        setElement(term9495, 3, "OIHoJeysUi");
        setElement(term9495, 4, "WXMWFDGcLB");
        setElement(term9495, 5, "wKWbJssZuG");
        setElement(term9495, 6, "NzBMMhkhpT");
        setElement(term9495, 7, "qCpEbQDHdF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ZombieClusters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9495;
        callMethod(klass, "zombieClusterDFS", argTypes, term9481, args);
    }

};


