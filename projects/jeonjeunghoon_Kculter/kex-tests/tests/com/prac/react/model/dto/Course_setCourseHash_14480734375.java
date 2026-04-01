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

public class Course_setCourseHash_14480734375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25842;

    public Course_setCourseHash_14480734375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25842 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term25842, term25842.getClass(), "courseNum", -865722613);
        setField(term25842, term25842.getClass(), "courseHash", "ZyAecZGope");
        setField(term25842, term25842.getClass(), "courseName", "uYnmxkwLfB");
        setField(term25842, term25842.getClass(), "places", "RVZTQxYOUO");
        setIntField(term25842, term25842.getClass(), "memberNum", -1551355284);
        setField(term25842, term25842.getClass(), "memberHash", "tydPpKxAbv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Course");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CJxQpJUfLJ";
        callMethod(klass, "setCourseHash", argTypes, term25842, args);
    }

};


