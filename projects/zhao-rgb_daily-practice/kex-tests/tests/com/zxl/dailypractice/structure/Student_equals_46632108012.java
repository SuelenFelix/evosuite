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

public class Student_equals_46632108012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1841;
     Object term1914;

    public Student_equals_46632108012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1841 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term1841, term1841.getClass(), "id", "bWWfajKbEX");
        setField(term1841, term1841.getClass(), "name", "cAPeiZHKGJ");
        setField(term1841, term1841.getClass(), "gender", "LvJFtLBaxj");
        setField(term1841, term1841.getClass(), "age", "PHvxnGHptP");
        setField(term1841, term1841.getClass(), "zy", "TimdotUuNC");
        setField(term1841, term1841.getClass(), "score", "PkWMRdJcBb");
        term1914 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.structure.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1914;
        callMethod(klass, "equals", argTypes, term1841, args);
    }

};


