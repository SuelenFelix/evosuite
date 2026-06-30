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

public class Student_toString_49312528515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2242;

    public Student_toString_49312528515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2242 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term2242, term2242.getClass(), "id", "sEccwbJKYE");
        setField(term2242, term2242.getClass(), "name", "AWRooQKkdW");
        setField(term2242, term2242.getClass(), "gender", "vjxIhXHxGR");
        setField(term2242, term2242.getClass(), "age", "QXzGXbEXMu");
        setField(term2242, term2242.getClass(), "zy", "qxSDVejjiY");
        setField(term2242, term2242.getClass(), "score", "xBsXSDjXYK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.structure.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2242, args);
    }

};


