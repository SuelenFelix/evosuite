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

public class CourseWrapper_setMemberNum_60918573822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15897;
     Object term15900;

    public CourseWrapper_setMemberNum_60918573822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15897 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term15897, term15897.getClass(), "course", null);
        setField(term15897, term15897.getClass(), "courseName", null);
        setIntField(term15897, term15897.getClass(), "memberNum", 0);
        setField(term15897, term15897.getClass(), "memberHash", null);
        setIntField(term15897, term15897.getClass(), "courseNum", 0);
        setField(term15897, term15897.getClass(), "courseHash", null);
        term15900 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15900;
        callMethod(klass, "setMemberNum", argTypes, term15897, args);
    }

};


