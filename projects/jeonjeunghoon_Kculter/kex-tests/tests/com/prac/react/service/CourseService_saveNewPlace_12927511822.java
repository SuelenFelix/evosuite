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

public class CourseService_saveNewPlace_12927511822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5210;
     Object term5211;

    public CourseService_saveNewPlace_12927511822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5210 = newInstance(Class.forName("com.prac.react.service.CourseService"));
        setField(term5210, term5210.getClass(), "logger", null);
        setField(term5210, term5210.getClass(), "cd", null);
        term5211 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term5211, term5211.getClass(), "placeNum", 458147407);
        setField(term5211, term5211.getClass(), "keyHash", "DfISiziTgG");
        setIntField(term5211, term5211.getClass(), "placeType", -184153539);
        setField(term5211, term5211.getClass(), "culture", "XqgfKFvPSD");
        setField(term5211, term5211.getClass(), "kpop", "JiVRgTZvKc");
        setDoubleField(term5211, term5211.getClass(), "lat", 0.8474802076607362);
        setDoubleField(term5211, term5211.getClass(), "lng", 0.5183269973490326);
        setIntField(term5211, term5211.getClass(), "status", 493620644);
        setField(term5211, term5211.getClass(), "name", "XPKmummaqg");
        setField(term5211, term5211.getClass(), "explain", "BKLfkLiZTH");
        setField(term5211, term5211.getClass(), "address", "SPpkrGcPRr");
        setField(term5211, term5211.getClass(), "fileUrl", "sEccwbJKYE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.CourseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Place");
        Object[] args = new Object[1];
        args[0] = term5211;
        callMethod(klass, "saveNewPlace", argTypes, term5210, args);
    }

};


