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

public class CourseWrapper_setCourseName_9596520995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14545;

    public CourseWrapper_setCourseName_9596520995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14548 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term14548, term14548.getClass(), "placeNum", -130649791);
        setField(term14548, term14548.getClass(), "keyHash", "");
        setIntField(term14548, term14548.getClass(), "placeType", 534834644);
        setField(term14548, term14548.getClass(), "culture", "");
        setField(term14548, term14548.getClass(), "kpop", "");
        setDoubleField(term14548, term14548.getClass(), "lat", 0.9123572866833729);
        setDoubleField(term14548, term14548.getClass(), "lng", 0.40635376375558196);
        setIntField(term14548, term14548.getClass(), "status", 1959097203);
        setField(term14548, term14548.getClass(), "name", "");
        setField(term14548, term14548.getClass(), "explain", "");
        setField(term14548, term14548.getClass(), "address", "");
        setField(term14548, term14548.getClass(), "fileUrl", "");
        ArrayList term14546 = new ArrayList();
        ((ArrayList) term14546).add(term14548);
        term14545 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term14545, term14545.getClass(), "course", term14546);
        setField(term14545, term14545.getClass(), "courseName", "BMMonTIZgJ");
        setIntField(term14545, term14545.getClass(), "memberNum", -209654048);
        setField(term14545, term14545.getClass(), "memberHash", "QXyFXBjFde");
        setIntField(term14545, term14545.getClass(), "courseNum", 477625804);
        setField(term14545, term14545.getClass(), "courseHash", "xVFgeyYxZS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iQiGTulJiH";
        callMethod(klass, "setCourseName", argTypes, term14545, args);
    }

};


