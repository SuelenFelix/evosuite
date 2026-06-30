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
import java.util.ArrayList;
import java.lang.Object;

public class CourseWrapper_getCourseNum_91020249510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15242;

    public CourseWrapper_getCourseNum_91020249510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15245 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term15245, term15245.getClass(), "placeNum", 954660603);
        setField(term15245, term15245.getClass(), "keyHash", "");
        setIntField(term15245, term15245.getClass(), "placeType", -1351605385);
        setField(term15245, term15245.getClass(), "culture", "");
        setField(term15245, term15245.getClass(), "kpop", "");
        setDoubleField(term15245, term15245.getClass(), "lat", 0.16755811343784477);
        setDoubleField(term15245, term15245.getClass(), "lng", 0.9090793968999221);
        setIntField(term15245, term15245.getClass(), "status", 278355793);
        setField(term15245, term15245.getClass(), "name", "");
        setField(term15245, term15245.getClass(), "explain", "");
        setField(term15245, term15245.getClass(), "address", "");
        setField(term15245, term15245.getClass(), "fileUrl", "");
        ArrayList term15243 = new ArrayList();
        ((ArrayList) term15243).add(term15245);
        term15242 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term15242, term15242.getClass(), "course", term15243);
        setField(term15242, term15242.getClass(), "courseName", "lzcwhvjdFg");
        setIntField(term15242, term15242.getClass(), "memberNum", -310648604);
        setField(term15242, term15242.getClass(), "memberHash", "dfzWTjcjnI");
        setIntField(term15242, term15242.getClass(), "courseNum", -648200466);
        setField(term15242, term15242.getClass(), "courseHash", "bsnZXGEvFv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseNum", argTypes, term15242, args);
    }

};


