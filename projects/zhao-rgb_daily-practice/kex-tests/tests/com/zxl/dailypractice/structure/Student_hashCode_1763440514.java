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

public class Student_hashCode_1763440514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2109;

    public Student_hashCode_1763440514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2109 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term2109, term2109.getClass(), "id", "DfISiziTgG");
        setField(term2109, term2109.getClass(), "name", "XqgfKFvPSD");
        setField(term2109, term2109.getClass(), "gender", "JiVRgTZvKc");
        setField(term2109, term2109.getClass(), "age", "XPKmummaqg");
        setField(term2109, term2109.getClass(), "zy", "BKLfkLiZTH");
        setField(term2109, term2109.getClass(), "score", "SPpkrGcPRr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.structure.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2109, args);
    }

};


