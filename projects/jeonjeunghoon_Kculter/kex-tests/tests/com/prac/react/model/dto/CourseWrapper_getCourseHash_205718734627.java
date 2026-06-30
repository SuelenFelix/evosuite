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

public class CourseWrapper_getCourseHash_205718734627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15916;

    public CourseWrapper_getCourseHash_205718734627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15916 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term15916, term15916.getClass(), "course", null);
        setField(term15916, term15916.getClass(), "courseName", null);
        setIntField(term15916, term15916.getClass(), "memberNum", 0);
        setField(term15916, term15916.getClass(), "memberHash", null);
        setIntField(term15916, term15916.getClass(), "courseNum", 0);
        setField(term15916, term15916.getClass(), "courseHash", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseHash", argTypes, term15916, args);
    }

};


