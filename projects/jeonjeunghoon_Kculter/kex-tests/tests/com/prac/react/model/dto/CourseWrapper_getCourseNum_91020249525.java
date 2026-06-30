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

public class CourseWrapper_getCourseNum_91020249525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15908;

    public CourseWrapper_getCourseNum_91020249525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15908 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term15908, term15908.getClass(), "course", null);
        setField(term15908, term15908.getClass(), "courseName", null);
        setIntField(term15908, term15908.getClass(), "memberNum", 0);
        setField(term15908, term15908.getClass(), "memberHash", null);
        setIntField(term15908, term15908.getClass(), "courseNum", 0);
        setField(term15908, term15908.getClass(), "courseHash", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseNum", argTypes, term15908, args);
    }

};


