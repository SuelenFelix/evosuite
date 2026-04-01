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
import java.lang.Integer;

public class MycielskiGenerator_createFrom_8884418892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2236;
     Object term2242;

    public MycielskiGenerator_createFrom_8884418892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2236 = newInstance(Class.forName("org.graph4j.generators.MycielskiGenerator"));
        int[] term2237 = (int[]) newIntArray(4);
        setIntElement(term2237, 0, 924127883);
        setIntElement(term2237, 1, -751079123);
        setIntElement(term2237, 2, -110837188);
        setIntElement(term2237, 3, -271094506);
        setField(term2236, term2236.getClass(), "vertices", term2237);
        term2242 = new Integer(455632030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.MycielskiGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2242;
        callMethod(klass, "createFrom", argTypes, term2236, args);
    }

};


