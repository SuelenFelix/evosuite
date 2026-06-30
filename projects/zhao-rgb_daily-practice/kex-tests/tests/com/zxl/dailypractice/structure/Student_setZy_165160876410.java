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

public class Student_setZy_165160876410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1531;

    public Student_setZy_165160876410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1531 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term1531, term1531.getClass(), "id", "bLPjGVBhlX");
        setField(term1531, term1531.getClass(), "name", "whBvTVIIlC");
        setField(term1531, term1531.getClass(), "gender", "IgRJUzaCwW");
        setField(term1531, term1531.getClass(), "age", "JUmudUmaaV");
        setField(term1531, term1531.getClass(), "zy", "KoyGrUJeJW");
        setField(term1531, term1531.getClass(), "score", "HqBOwkVqjD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.structure.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MAcUBcBckh";
        callMethod(klass, "setZy", argTypes, term1531, args);
    }

};


