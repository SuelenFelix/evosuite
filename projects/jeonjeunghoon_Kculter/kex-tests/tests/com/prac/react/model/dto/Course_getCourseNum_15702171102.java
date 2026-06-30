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

public class Course_getCourseNum_15702171102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25567;

    public Course_getCourseNum_15702171102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25567 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term25567, term25567.getClass(), "courseNum", -255317272);
        setField(term25567, term25567.getClass(), "courseHash", "WLaHlrYQyz");
        setField(term25567, term25567.getClass(), "courseName", "CaeIUTuUFo");
        setField(term25567, term25567.getClass(), "places", "rzoDGjHkzG");
        setIntField(term25567, term25567.getClass(), "memberNum", -706253892);
        setField(term25567, term25567.getClass(), "memberHash", "NsphHxYiuC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseNum", argTypes, term25567, args);
    }

};


