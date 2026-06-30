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
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.Object;

public class CourseService_getMemberCourseWrapper_3557868685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5466;
     Object term5467;
     Object term5469;

    public CourseService_getMemberCourseWrapper_3557868685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5466 = newInstance(Class.forName("com.prac.react.service.CourseService"));
        setField(term5466, term5466.getClass(), "logger", null);
        setField(term5466, term5466.getClass(), "cd", null);
        term5467 = new Integer(-1371869594);
        Object term5472 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term5472, term5472.getClass(), "courseNum", -2095575670);
        setField(term5472, term5472.getClass(), "courseHash", "xBsXSDjXYK");
        setField(term5472, term5472.getClass(), "courseName", "sEnIVFtZuQ");
        setField(term5472, term5472.getClass(), "places", "ZVecLZMLHF");
        setIntField(term5472, term5472.getClass(), "memberNum", 1225272962);
        setField(term5472, term5472.getClass(), "memberHash", "fztQhjqwdP");
        Object term5524 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term5524, term5524.getClass(), "courseNum", 1324040357);
        setField(term5524, term5524.getClass(), "courseHash", "");
        setField(term5524, term5524.getClass(), "courseName", "");
        setField(term5524, term5524.getClass(), "places", "");
        setIntField(term5524, term5524.getClass(), "memberNum", -1588772968);
        setField(term5524, term5524.getClass(), "memberHash", "");
        Object term5532 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term5532, term5532.getClass(), "courseNum", -93135961);
        setField(term5532, term5532.getClass(), "courseHash", null);
        setField(term5532, term5532.getClass(), "courseName", null);
        setField(term5532, term5532.getClass(), "places", null);
        setIntField(term5532, term5532.getClass(), "memberNum", -112921587);
        setField(term5532, term5532.getClass(), "memberHash", null);
        term5469 = new LinkedList();
        ((LinkedList) term5469).add(term5472);
        ((LinkedList) term5469).add(term5524);
        ((LinkedList) term5469).add(term5532);
        ((LinkedList) term5469).add((Object)null);
        ((LinkedList) term5469).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.CourseService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term5467;
        args[1] = term5469;
        callMethod(klass, "getMemberCourseWrapper", argTypes, term5466, args);
    }

};


