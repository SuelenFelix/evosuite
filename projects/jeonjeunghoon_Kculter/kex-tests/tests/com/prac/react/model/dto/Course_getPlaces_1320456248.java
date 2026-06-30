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

public class Course_getPlaces_1320456248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26159;

    public Course_getPlaces_1320456248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26159 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term26159, term26159.getClass(), "courseNum", -1538936030);
        setField(term26159, term26159.getClass(), "courseHash", "DyUuIDzZPG");
        setField(term26159, term26159.getClass(), "courseName", "EGQLusEtRN");
        setField(term26159, term26159.getClass(), "places", "GwGUMPdvZq");
        setIntField(term26159, term26159.getClass(), "memberNum", -752870423);
        setField(term26159, term26159.getClass(), "memberHash", "iXRAYcFyfS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaces", argTypes, term26159, args);
    }

};


