package com.zxl.dailypractice.io;

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
import static com.zxl.dailypractice.io.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RandomFile_main_12674998511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term990;

    public RandomFile_main_12674998511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term990 = (Object[]) newArray("java.lang.String", 7);
        setElement(term990, 0, "xrwlQZdwCp");
        setElement(term990, 1, "IDCWpPLRkE");
        setElement(term990, 2, "nyiiPDVjAc");
        setElement(term990, 3, "aKnKipADSo");
        setElement(term990, 4, "wSQxaModmm");
        setElement(term990, 5, "UlajhuVLaP");
        setElement(term990, 6, "gGSMzuGICf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.io.RandomFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term990;
        callMethod(klass, "main", argTypes, null, args);
    }

};


