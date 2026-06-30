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

public class CourseWrapper_setCourse_74906963318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15885;

    public CourseWrapper_setCourse_74906963318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15885 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term15885, term15885.getClass(), "course", null);
        setField(term15885, term15885.getClass(), "courseName", null);
        setIntField(term15885, term15885.getClass(), "memberNum", 0);
        setField(term15885, term15885.getClass(), "memberHash", null);
        setIntField(term15885, term15885.getClass(), "courseNum", 0);
        setField(term15885, term15885.getClass(), "courseHash", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCourse", argTypes, term15885, args);
    }

};


