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
import java.lang.Boolean;

public class WheelGenerator_createDigraph_10132938103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1071;
     Object term1079;
     Object term1081;

    public WheelGenerator_createDigraph_10132938103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1071 = newInstance(Class.forName("org.graph4j.generators.WheelGenerator"));
        int[] term1073 = (int[]) newIntArray(5);
        setIntField(term1071, term1071.getClass(), "center", -310648604);
        setIntElement(term1073, 0, -648200466);
        setIntElement(term1073, 1, 2007134147);
        setIntElement(term1073, 2, 993388358);
        setIntElement(term1073, 3, -765191335);
        setIntElement(term1073, 4, -1697741155);
        setField(term1071, term1071.getClass(), "vertices", term1073);
        term1079 = new Boolean(false);
        term1081 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.WheelGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1079;
        args[1] = term1081;
        callMethod(klass, "createDigraph", argTypes, term1071, args);
    }

};


