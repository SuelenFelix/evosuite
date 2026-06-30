package com.zxl.dailypractice.card.two.october.october10;

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
import static com.zxl.dailypractice.card.two.october.october10.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Student_getSeq_198403045013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563;

    public Student_getSeq_198403045013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563 = newInstance(Class.forName("com.zxl.dailypractice.card.two.october.october10.Student"));
        setField(term563, term563.getClass(), "taskid", null);
        setField(term563, term563.getClass(), "seq", null);
        setField(term563, term563.getClass(), "originalFileName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.october.october10.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeq", argTypes, term563, args);
    }

};


