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

public class Student_hashCode_1763440532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2521;

    public Student_hashCode_1763440532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2521 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term2521, term2521.getClass(), "id", null);
        setField(term2521, term2521.getClass(), "name", null);
        setField(term2521, term2521.getClass(), "gender", null);
        setField(term2521, term2521.getClass(), "age", null);
        setField(term2521, term2521.getClass(), "zy", null);
        setField(term2521, term2521.getClass(), "score", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.structure.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2521, args);
    }

};


