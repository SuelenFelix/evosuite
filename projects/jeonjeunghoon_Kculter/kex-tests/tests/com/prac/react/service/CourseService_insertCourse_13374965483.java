package com.prac.react.service;

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
import static com.prac.react.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CourseService_insertCourse_13374965483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5371;
     Object term5372;

    public CourseService_insertCourse_13374965483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5371 = newInstance(Class.forName("com.prac.react.service.CourseService"));
        setField(term5371, term5371.getClass(), "logger", null);
        setField(term5371, term5371.getClass(), "cd", null);
        term5372 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term5372, term5372.getClass(), "courseNum", 1328271830);
        setField(term5372, term5372.getClass(), "courseHash", "AWRooQKkdW");
        setField(term5372, term5372.getClass(), "courseName", "vjxIhXHxGR");
        setField(term5372, term5372.getClass(), "places", "QXzGXbEXMu");
        setIntField(term5372, term5372.getClass(), "memberNum", 1596070772);
        setField(term5372, term5372.getClass(), "memberHash", "qxSDVejjiY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.CourseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Course");
        Object[] args = new Object[1];
        args[0] = term5372;
        callMethod(klass, "insertCourse", argTypes, term5371, args);
    }

};


