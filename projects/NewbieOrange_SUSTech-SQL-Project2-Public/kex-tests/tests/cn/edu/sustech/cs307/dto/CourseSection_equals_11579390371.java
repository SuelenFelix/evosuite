package cn.edu.sustech.cs307.dto;

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
import static cn.edu.sustech.cs307.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CourseSection_equals_11579390371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2338;
     Object term2354;

    public CourseSection_equals_11579390371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2338 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSection"));
        setIntField(term2338, term2338.getClass(), "id", 579005622);
        setField(term2338, term2338.getClass(), "name", "ieCtQFdkii");
        setIntField(term2338, term2338.getClass(), "totalCapacity", -14890619);
        setIntField(term2338, term2338.getClass(), "leftCapacity", 1632125673);
        term2354 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.CourseSection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2354;
        callMethod(klass, "equals", argTypes, term2338, args);
    }

};


