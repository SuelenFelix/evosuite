package com.zxl.dailypractice.card.two.november.november8;

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
import static com.zxl.dailypractice.card.two.november.november8.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_countConsistentStrings_15948525692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;
     Object term125;

    public Solution_countConsistentStrings_15948525692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112 = newInstance(Class.forName("com.zxl.dailypractice.card.two.november.november8.Solution"));
        term125 = (Object[]) newArray("java.lang.String", 4);
        setElement(term125, 0, "SzjVpOQTyS");
        setElement(term125, 1, "MjGYSRKTNF");
        setElement(term125, 2, "hRNSzYYIrc");
        setElement(term125, 3, "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.november.november8.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "EGtDIRbSSb";
        args[1] = term125;
        callMethod(klass, "countConsistentStrings", argTypes, term112, args);
    }

};


