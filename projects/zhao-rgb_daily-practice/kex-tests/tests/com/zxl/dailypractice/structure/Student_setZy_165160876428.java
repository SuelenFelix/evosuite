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

public class Student_setZy_165160876428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2517;

    public Student_setZy_165160876428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2517 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term2517, term2517.getClass(), "id", null);
        setField(term2517, term2517.getClass(), "name", null);
        setField(term2517, term2517.getClass(), "gender", null);
        setField(term2517, term2517.getClass(), "age", null);
        setField(term2517, term2517.getClass(), "zy", null);
        setField(term2517, term2517.getClass(), "score", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.structure.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setZy", argTypes, term2517, args);
    }

};


