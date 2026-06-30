package com.zxl.dailypractice.card.two.march.march14;

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
import static com.zxl.dailypractice.card.two.march.march14.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_findRestaurant_11106052281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term63;

    public Solution_findRestaurant_11106052281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.march.march14.Solution"));
        term2 = (Object[]) newArray("java.lang.String", 5);
        setElement(term2, 0, "PAEBtnZtTD");
        setElement(term2, 1, "sjlJAEtRrb");
        setElement(term2, 2, "MuLcgQHgqz");
        setElement(term2, 3, "xxtlPwDYFs");
        setElement(term2, 4, "jJCZpVmanW");
        term63 = (Object[]) newArray("java.lang.String", 4);
        setElement(term63, 0, "EGtDIRbSSb");
        setElement(term63, 1, "SzjVpOQTyS");
        setElement(term63, 2, "MjGYSRKTNF");
        setElement(term63, 3, "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.march.march14.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term63;
        callMethod(klass, "findRestaurant", argTypes, term1, args);
    }

};


