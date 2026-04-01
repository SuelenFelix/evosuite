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

public class CourseService_checkPlaceDb_16796225451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5049;
     Object term5050;

    public CourseService_checkPlaceDb_16796225451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5049 = newInstance(Class.forName("com.prac.react.service.CourseService"));
        setField(term5049, term5049.getClass(), "logger", null);
        setField(term5049, term5049.getClass(), "cd", null);
        term5050 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term5050, term5050.getClass(), "placeNum", 2055867847);
        setField(term5050, term5050.getClass(), "keyHash", "PkWMRdJcBb");
        setIntField(term5050, term5050.getClass(), "placeType", -1048298087);
        setField(term5050, term5050.getClass(), "culture", "jSpAteRute");
        setField(term5050, term5050.getClass(), "kpop", "swZVeJAxjt");
        setDoubleField(term5050, term5050.getClass(), "lat", 0.6076495596892013);
        setDoubleField(term5050, term5050.getClass(), "lng", 0.37773193782763337);
        setIntField(term5050, term5050.getClass(), "status", 292681826);
        setField(term5050, term5050.getClass(), "name", "xOcJIiQQDu");
        setField(term5050, term5050.getClass(), "explain", "GVizqqzXpy");
        setField(term5050, term5050.getClass(), "address", "JqXGgAhZPl");
        setField(term5050, term5050.getClass(), "fileUrl", "jiKYgYHqIS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.CourseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Place");
        Object[] args = new Object[1];
        args[0] = term5050;
        callMethod(klass, "checkPlaceDb", argTypes, term5049, args);
    }

};


