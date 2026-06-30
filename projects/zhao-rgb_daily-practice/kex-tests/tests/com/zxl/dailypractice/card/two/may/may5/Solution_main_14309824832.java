package com.zxl.dailypractice.card.two.may.may5;

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
import static com.zxl.dailypractice.card.two.may.may5.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_main_14309824832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;

    public Solution_main_14309824832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = (Object[]) newArray("java.lang.String", 4);
        setElement(term15, 0, "PAEBtnZtTD");
        setElement(term15, 1, "sjlJAEtRrb");
        setElement(term15, 2, "MuLcgQHgqz");
        setElement(term15, 3, "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.may.may5.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term15;
        callMethod(klass, "main", argTypes, null, args);
    }

};


