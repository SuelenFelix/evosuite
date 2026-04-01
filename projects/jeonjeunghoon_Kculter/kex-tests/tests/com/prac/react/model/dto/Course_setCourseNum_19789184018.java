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

public class Course_setCourseNum_19789184018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26849;
     Object term26852;

    public Course_setCourseNum_19789184018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26849 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term26849, term26849.getClass(), "courseNum", 0);
        setField(term26849, term26849.getClass(), "courseHash", null);
        setField(term26849, term26849.getClass(), "courseName", null);
        setField(term26849, term26849.getClass(), "places", null);
        setIntField(term26849, term26849.getClass(), "memberNum", 0);
        setField(term26849, term26849.getClass(), "memberHash", null);
        term26852 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Course");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26852;
        callMethod(klass, "setCourseNum", argTypes, term26849, args);
    }

};


