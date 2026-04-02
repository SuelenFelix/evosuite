package com.sachett.samosa.samosac.codegen.function;

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
import static com.sachett.samosa.samosac.codegen.function.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class FunctionGenerationContext_FrameStackMap_init_8512812460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1434;
     Object term1436;
     Object term1443;
     Object term1445;

    public FunctionGenerationContext_FrameStackMap_init_8512812460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1434 = new Integer(-523949691);
        term1436 = (Object[]) newArray("java.lang.Object", 6);
        Object term1437 = newInstance(Class.forName("java.lang.Object"));
        Object term1438 = newInstance(Class.forName("java.lang.Object"));
        Object term1439 = newInstance(Class.forName("java.lang.Object"));
        Object term1440 = newInstance(Class.forName("java.lang.Object"));
        Object term1441 = newInstance(Class.forName("java.lang.Object"));
        Object term1442 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1436, 0, term1437);
        setElement(term1436, 1, term1438);
        setElement(term1436, 2, term1439);
        setElement(term1436, 3, term1440);
        setElement(term1436, 4, term1441);
        setElement(term1436, 5, term1442);
        term1443 = new Integer(1398204340);
        term1445 = (Object[]) newArray("java.lang.Object", 2);
        Object term1446 = newInstance(Class.forName("java.lang.Object"));
        Object term1447 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1445, 0, term1446);
        setElement(term1445, 1, term1447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.codegen.function.FunctionGenerationContext$FrameStackMap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = term1434;
        args[1] = term1436;
        args[2] = term1443;
        args[3] = term1445;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


