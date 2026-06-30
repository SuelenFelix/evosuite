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
import java.lang.Integer;

public class Course_setMemberNum_126920035311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26454;
     Object term26505;

    public Course_setMemberNum_126920035311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26454 = newInstance(Class.forName("com.prac.react.model.dto.Course"));
        setIntField(term26454, term26454.getClass(), "courseNum", -1385748168);
        setField(term26454, term26454.getClass(), "courseHash", "CwrsdYnHpH");
        setField(term26454, term26454.getClass(), "courseName", "jifjXNXluS");
        setField(term26454, term26454.getClass(), "places", "uDayZDXPOP");
        setIntField(term26454, term26454.getClass(), "memberNum", -270592367);
        setField(term26454, term26454.getClass(), "memberHash", "kbjWxMAIhY");
        term26505 = new Integer(178847646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Course");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26505;
        callMethod(klass, "setMemberNum", argTypes, term26454, args);
    }

};


