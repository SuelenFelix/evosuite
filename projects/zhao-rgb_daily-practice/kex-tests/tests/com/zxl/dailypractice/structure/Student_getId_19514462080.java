package com.zxl.dailypractice.structure;

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
import static com.zxl.dailypractice.structure.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Student_getId_19514462080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;

    public Student_getId_19514462080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term113, term113.getClass(), "id", "EGtDIRbSSb");
        setField(term113, term113.getClass(), "name", "SzjVpOQTyS");
        setField(term113, term113.getClass(), "gender", "MjGYSRKTNF");
        setField(term113, term113.getClass(), "age", "hRNSzYYIrc");
        setField(term113, term113.getClass(), "zy", "RMFIsYGgne");
        setField(term113, term113.getClass(), "score", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.structure.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term113, args);
    }

};


