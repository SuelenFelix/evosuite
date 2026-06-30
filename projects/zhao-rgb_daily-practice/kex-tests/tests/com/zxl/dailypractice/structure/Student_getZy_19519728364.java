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

public class Student_getZy_19519728364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term645;

    public Student_getZy_19519728364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term645 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term645, term645.getClass(), "id", "TEParAifyi");
        setField(term645, term645.getClass(), "name", "OWDIEULEFu");
        setField(term645, term645.getClass(), "gender", "dWRymuLBtr");
        setField(term645, term645.getClass(), "age", "AijpHYOFuy");
        setField(term645, term645.getClass(), "zy", "SbAoxhfrkn");
        setField(term645, term645.getClass(), "score", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.structure.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZy", argTypes, term645, args);
    }

};


