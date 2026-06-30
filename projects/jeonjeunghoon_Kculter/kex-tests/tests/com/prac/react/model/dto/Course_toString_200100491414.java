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

public class Course_toString_200100491414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26751;

    public Course_toString_200100491414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26751 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term26751, term26751.getClass(), "courseNum", 1163761623);
        setField(term26751, term26751.getClass(), "courseHash", "ltWBKZaXwJ");
        setField(term26751, term26751.getClass(), "courseName", "FSQpgxQnsH");
        setField(term26751, term26751.getClass(), "places", "LBPwnVMEpP");
        setIntField(term26751, term26751.getClass(), "memberNum", 718742281);
        setField(term26751, term26751.getClass(), "memberHash", "cwALzyQVjH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term26751, args);
    }

};


