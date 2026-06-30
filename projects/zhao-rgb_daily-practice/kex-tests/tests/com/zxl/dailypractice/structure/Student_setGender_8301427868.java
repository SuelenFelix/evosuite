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

public class Student_setGender_8301427868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1221;

    public Student_setGender_8301427868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1221 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term1221, term1221.getClass(), "id", "YRHGsAkhxb");
        setField(term1221, term1221.getClass(), "name", "ffYhPOzlUs");
        setField(term1221, term1221.getClass(), "gender", "MLqYREekMl");
        setField(term1221, term1221.getClass(), "age", "ytSBIKXogI");
        setField(term1221, term1221.getClass(), "zy", "nHXjMycHlU");
        setField(term1221, term1221.getClass(), "score", "ieCtQFdkii");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.structure.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dEnhdmILtU";
        callMethod(klass, "setGender", argTypes, term1221, args);
    }

};


