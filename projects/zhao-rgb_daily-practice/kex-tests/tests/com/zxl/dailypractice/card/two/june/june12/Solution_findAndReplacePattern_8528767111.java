package com.zxl.dailypractice.card.two.june.june12;

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
import static com.zxl.dailypractice.card.two.june.june12.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_findAndReplacePattern_8528767111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public Solution_findAndReplacePattern_8528767111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.june.june12.Solution"));
        term2 = (Object[]) newArray("java.lang.String", 5);
        setElement(term2, 0, "PAEBtnZtTD");
        setElement(term2, 1, "sjlJAEtRrb");
        setElement(term2, 2, "MuLcgQHgqz");
        setElement(term2, 3, "xxtlPwDYFs");
        setElement(term2, 4, "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.june.june12.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = "EGtDIRbSSb";
        callMethod(klass, "findAndReplacePattern", argTypes, term1, args);
    }

};


