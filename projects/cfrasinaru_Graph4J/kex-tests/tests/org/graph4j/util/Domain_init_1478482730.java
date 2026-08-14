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

public class Domain_init_1478482730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9755;

    public Domain_init_1478482730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9755 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term9757 = (int[]) newIntArray(8);
        int[] term9766 = (int[]) newIntArray(8);
        setIntField(term9755, term9755.getClass(), "vertex", 1162356859);
        setIntElement(term9757, 0, 175338916);
        setIntElement(term9757, 1, -1484528924);
        setIntElement(term9757, 2, -557662858);
        setIntElement(term9757, 3, -477520795);
        setIntElement(term9757, 4, -480468995);
        setIntElement(term9757, 5, -2037695985);
        setIntElement(term9757, 6, -2044768479);
        setIntElement(term9757, 7, -2020209498);
        setField(term9755, term9755.getClass(), "values", term9757);
        setIntElement(term9766, 0, 754066823);
        setIntElement(term9766, 1, 306903225);
        setIntElement(term9766, 2, -1245754321);
        setIntElement(term9766, 3, 398727237);
        setIntElement(term9766, 4, -1741920202);
        setIntElement(term9766, 5, 1639977614);
        setIntElement(term9766, 6, -27270642);
        setIntElement(term9766, 7, -1419515823);
        setField(term9755, term9755.getClass(), "positions", term9766);
        setIntField(term9755, term9755.getClass(), "size", 1749999469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.Domain");
        Object[] args = new Object[1];
        args[0] = term9755;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


