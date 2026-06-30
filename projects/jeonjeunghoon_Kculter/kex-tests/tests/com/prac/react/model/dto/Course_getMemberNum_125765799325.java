package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Course_getMemberNum_125765799325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26872;

    public Course_getMemberNum_125765799325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26872 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term26872, term26872.getClass(), "courseNum", 0);
        setField(term26872, term26872.getClass(), "courseHash", null);
        setField(term26872, term26872.getClass(), "courseName", null);
        setField(term26872, term26872.getClass(), "places", null);
        setIntField(term26872, term26872.getClass(), "memberNum", 0);
        setField(term26872, term26872.getClass(), "memberHash", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemberNum", argTypes, term26872, args);
    }

};


