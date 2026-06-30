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
import java.lang.Integer;

public class CourseWrapper_setCourseNum_85790645526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15911;
     Object term15914;

    public CourseWrapper_setCourseNum_85790645526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15911 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term15911, term15911.getClass(), "course", null);
        setField(term15911, term15911.getClass(), "courseName", null);
        setIntField(term15911, term15911.getClass(), "memberNum", 0);
        setField(term15911, term15911.getClass(), "memberHash", null);
        setIntField(term15911, term15911.getClass(), "courseNum", 0);
        setField(term15911, term15911.getClass(), "courseHash", null);
        term15914 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15914;
        callMethod(klass, "setCourseNum", argTypes, term15911, args);
    }

};


