package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KingGraphGenerator_create_14769569941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2143;

    public KingGraphGenerator_create_14769569941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2143 = newInstance(Class.forName("org.graph4j.generators.KingGraphGenerator"));
        int[] term2146 = (int[]) newIntArray(1);
        setIntField(term2143, term2143.getClass(), "rows", -246967963);
        setIntField(term2143, term2143.getClass(), "cols", -1777140369);
        setIntElement(term2146, 0, 993627098);
        setField(term2143, term2143.getClass(), "vertices", term2146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.KingGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "create", argTypes, term2143, args);
    }

};


