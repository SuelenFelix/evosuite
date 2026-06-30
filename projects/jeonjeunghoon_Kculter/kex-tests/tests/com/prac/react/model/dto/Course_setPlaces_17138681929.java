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

public class Course_setPlaces_17138681929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26250;

    public Course_setPlaces_17138681929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26250 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term26250, term26250.getClass(), "courseNum", -1698809299);
        setField(term26250, term26250.getClass(), "courseHash", "lokyclbLEz");
        setField(term26250, term26250.getClass(), "courseName", "hAPmQGaxkI");
        setField(term26250, term26250.getClass(), "places", "ojrnLnJZjT");
        setIntField(term26250, term26250.getClass(), "memberNum", 401512128);
        setField(term26250, term26250.getClass(), "memberHash", "rtvXSMjOdJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Course");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EDkfjuDpNv";
        callMethod(klass, "setPlaces", argTypes, term26250, args);
    }

};


