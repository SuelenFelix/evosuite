package com.zxl.dailypractice.lambda;

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
import static com.zxl.dailypractice.lambda.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PredicateDemo_main_12270162371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623;

    public PredicateDemo_main_12270162371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term623 = (Object[]) newArray("java.lang.String", 9);
        setElement(term623, 0, "OclPbYPkcH");
        setElement(term623, 1, "IoAlmYsBwc");
        setElement(term623, 2, "TEParAifyi");
        setElement(term623, 3, "OWDIEULEFu");
        setElement(term623, 4, "dWRymuLBtr");
        setElement(term623, 5, "AijpHYOFuy");
        setElement(term623, 6, "SbAoxhfrkn");
        setElement(term623, 7, "kuTXqwMtDB");
        setElement(term623, 8, "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.lambda.PredicateDemo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term623;
        callMethod(klass, "main", argTypes, null, args);
    }

};


