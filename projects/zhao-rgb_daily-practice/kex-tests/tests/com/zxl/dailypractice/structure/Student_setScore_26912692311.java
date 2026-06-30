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

public class Student_setScore_26912692311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1686;

    public Student_setScore_26912692311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1686 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term1686, term1686.getClass(), "id", "oVgzLbrsFr");
        setField(term1686, term1686.getClass(), "name", "vQVyKLdtaz");
        setField(term1686, term1686.getClass(), "gender", "OWKQODBLzb");
        setField(term1686, term1686.getClass(), "age", "wGmYcqUkgE");
        setField(term1686, term1686.getClass(), "zy", "idgaQsnJpQ");
        setField(term1686, term1686.getClass(), "score", "VgZnGoIFwQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.structure.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jUbSRrkrYZ";
        callMethod(klass, "setScore", argTypes, term1686, args);
    }

};


