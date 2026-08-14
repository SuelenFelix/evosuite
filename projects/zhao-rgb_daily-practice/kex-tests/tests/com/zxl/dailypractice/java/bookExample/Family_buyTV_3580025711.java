package com.zxl.dailypractice.java.bookExample;

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
import static com.zxl.dailypractice.java.bookExample.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Family_buyTV_3580025711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term4;

    public Family_buyTV_3580025711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.java.bookExample.Family"));
        Object term2 = newInstance(Class.forName("com.zxl.dailypractice.java.bookExample.TV"));
        setIntField(term2, term2.getClass(), "channel", 568599855);
        setField(term1, term1.getClass(), "homeTV", term2);
        term4 = newInstance(Class.forName("com.zxl.dailypractice.java.bookExample.TV"));
        setIntField(term4, term4.getClass(), "channel", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.java.bookExample.Family");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.java.bookExample.TV");
        Object[] args = new Object[1];
        args[0] = term4;
        callMethod(klass, "buyTV", argTypes, term1, args);
    }

};


