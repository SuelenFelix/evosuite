package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IntArrays_union_129069043417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9136;

    public IntArrays_union_129069043417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9136 = (Object[]) newArray("[I", 5);
        int[] term9137 = (int[]) newIntArray(4);
        int[] term9142 = (int[]) newIntArray(4);
        int[] term9147 = (int[]) newIntArray(4);
        int[] term9152 = (int[]) newIntArray(5);
        int[] term9158 = (int[]) newIntArray(5);
        setIntElement(term9137, 0, 583343799);
        setIntElement(term9137, 1, 1831635466);
        setIntElement(term9137, 2, -981606069);
        setIntElement(term9137, 3, 548729456);
        setElement(term9136, 0, term9137);
        setIntElement(term9142, 0, 482026097);
        setIntElement(term9142, 1, -528954009);
        setIntElement(term9142, 2, -918570985);
        setIntElement(term9142, 3, 242181753);
        setElement(term9136, 1, term9142);
        setIntElement(term9147, 0, -1356117545);
        setIntElement(term9147, 1, -1539896141);
        setIntElement(term9147, 2, 798480099);
        setIntElement(term9147, 3, -1624038595);
        setElement(term9136, 2, term9147);
        setIntElement(term9152, 0, 1593619323);
        setIntElement(term9152, 1, -232601868);
        setIntElement(term9152, 2, -1743056588);
        setIntElement(term9152, 3, 576646846);
        setIntElement(term9152, 4, 916507296);
        setElement(term9136, 3, term9152);
        setIntElement(term9158, 0, 1307887729);
        setIntElement(term9158, 1, 1628336669);
        setIntElement(term9158, 2, 466807421);
        setIntElement(term9158, 3, -407675703);
        setIntElement(term9158, 4, -429960516);
        setElement(term9136, 4, term9158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9136;
        callMethod(klass, "union", argTypes, null, args);
    }

};


