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

public class Course_getCourseName_12255794546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25955;

    public Course_getCourseName_12255794546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25955 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term25955, term25955.getClass(), "courseNum", -1381970335);
        setField(term25955, term25955.getClass(), "courseHash", "NUUjAyqOva");
        setField(term25955, term25955.getClass(), "courseName", "EoAMIIUdDX");
        setField(term25955, term25955.getClass(), "places", "OATNwRncsv");
        setIntField(term25955, term25955.getClass(), "memberNum", 1213549815);
        setField(term25955, term25955.getClass(), "memberHash", "rACmzcmIPm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseName", argTypes, term25955, args);
    }

};


