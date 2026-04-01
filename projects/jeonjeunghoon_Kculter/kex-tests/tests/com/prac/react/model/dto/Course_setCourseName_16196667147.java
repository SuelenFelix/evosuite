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

public class Course_setCourseName_16196667147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26046;

    public Course_setCourseName_16196667147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26046 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term26046, term26046.getClass(), "courseNum", -1518419301);
        setField(term26046, term26046.getClass(), "courseHash", "OCtePrLDhe");
        setField(term26046, term26046.getClass(), "courseName", "yqEphNxUPZ");
        setField(term26046, term26046.getClass(), "places", "mJJxTuZuKO");
        setIntField(term26046, term26046.getClass(), "memberNum", 674879025);
        setField(term26046, term26046.getClass(), "memberHash", "anSZCikKpS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Course");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zvMQGbTtsV";
        callMethod(klass, "setCourseName", argTypes, term26046, args);
    }

};


