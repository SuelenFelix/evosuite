package com.prac.react.thread;

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
import static com.prac.react.thread.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class CourseThread_init_11365042270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term52;

    public CourseThread_init_11365042270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term1, term1.getClass(), "courseNum", 568599855);
        setField(term1, term1.getClass(), "courseHash", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "courseName", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "places", "MuLcgQHgqz");
        setIntField(term1, term1.getClass(), "memberNum", 1162663216);
        setField(term1, term1.getClass(), "memberHash", "xxtlPwDYFs");
        term52 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.thread.CourseThread");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Course");
        argTypes[1] = Class.forName("java.nio.channels.CompletionHandler");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = null;
        args[2] = term52;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


