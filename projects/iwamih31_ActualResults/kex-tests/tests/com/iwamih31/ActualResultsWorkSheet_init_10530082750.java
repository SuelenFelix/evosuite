package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ActualResultsWorkSheet_init_10530082750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3262;
     Object term3266;

    public ActualResultsWorkSheet_init_10530082750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3262 = (int[]) newIntArray(3);
        setIntElement(term3262, 0, -1685132342);
        setIntElement(term3262, 1, -1456670397);
        setIntElement(term3262, 2, 1622346318);
        term3266 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 4);
        Object[] term3267 = (Object[]) newArray("java.lang.String", 1);
        Object[] term3280 = (Object[]) newArray("java.lang.String", 6);
        Object[] term3353 = (Object[]) newArray("java.lang.String", 2);
        Object[] term3378 = (Object[]) newArray("java.lang.String", 6);
        setElement(term3267, 0, "OJJtVNPyKZ");
        setElement(term3266, 0, term3267);
        setElement(term3280, 0, "AKNapTAfmD");
        setElement(term3280, 1, "xJgPlLxpgC");
        setElement(term3280, 2, "EYtfuJaxiM");
        setElement(term3280, 3, "gCWtLVKVVe");
        setElement(term3280, 4, "fWKJoSoCwE");
        setElement(term3280, 5, "wfaXBpWAUH");
        setElement(term3266, 1, term3280);
        setElement(term3353, 0, "VMeAzAHwZj");
        setElement(term3353, 1, "PznxWXsZME");
        setElement(term3266, 2, term3353);
        setElement(term3378, 0, "ZzIujlwVsw");
        setElement(term3378, 1, "LWyEaeIyAo");
        setElement(term3378, 2, "yVMkkQhvmN");
        setElement(term3378, 3, "mvrkADEgpp");
        setElement(term3378, 4, "pXOkjyeIRb");
        setElement(term3378, 5, "GgZWSjxjyE");
        setElement(term3266, 3, term3378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.ActualResultsWorkSheet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "SdCKLMIYnX";
        args[1] = term3262;
        args[2] = term3266;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


