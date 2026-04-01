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

public class Course_getCourseHash_13971727314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25751;

    public Course_getCourseHash_13971727314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25751 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term25751, term25751.getClass(), "courseNum", -1244386281);
        setField(term25751, term25751.getClass(), "courseHash", "mmpgARMYFV");
        setField(term25751, term25751.getClass(), "courseName", "NUqhsZprdZ");
        setField(term25751, term25751.getClass(), "places", "jkzgCqWJrA");
        setIntField(term25751, term25751.getClass(), "memberNum", -885788574);
        setField(term25751, term25751.getClass(), "memberHash", "rawiXxuyRn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseHash", argTypes, term25751, args);
    }

};


