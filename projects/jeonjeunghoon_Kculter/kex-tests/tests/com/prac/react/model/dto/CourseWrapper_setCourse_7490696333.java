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
import java.util.ArrayList;
import java.util.LinkedList;

public class CourseWrapper_setCourse_7490696333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14344;
     Object term14387;

    public CourseWrapper_setCourse_7490696333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14345 = new ArrayList();
        term14344 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term14344, term14344.getClass(), "course", term14345);
        setField(term14344, term14344.getClass(), "courseName", "BOvgwHfoHQ");
        setIntField(term14344, term14344.getClass(), "memberNum", -1747406163);
        setField(term14344, term14344.getClass(), "memberHash", "hPpFNeDBIb");
        setIntField(term14344, term14344.getClass(), "courseNum", 388157121);
        setField(term14344, term14344.getClass(), "courseHash", "DNOtiLPAIY");
        term14387 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term14387;
        callMethod(klass, "setCourse", argTypes, term14344, args);
    }

};


