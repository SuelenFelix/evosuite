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

public class Member_toString_199193774724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13449;

    public Member_toString_199193774724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13449 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term13449, term13449.getClass(), "memberNum", -1885090354);
        setField(term13449, term13449.getClass(), "memberNumHash", "IVacFDAZcj");
        setField(term13449, term13449.getClass(), "email", "EEYmuwyVDP");
        setField(term13449, term13449.getClass(), "pwd", "EWFbEDAVrE");
        setField(term13449, term13449.getClass(), "nickName", "EMiMtYgfvr");
        setField(term13449, term13449.getClass(), "countryCode", "OyYyYYnJuF");
        setIntField(term13449, term13449.getClass(), "age", -2066804303);
        setField(term13449, term13449.getClass(), "gender", "aYLvcxZohT");
        setField(term13449, term13449.getClass(), "pfUrl", "mnHyQbMyld");
        setIntField(term13449, term13449.getClass(), "mg", -1731761810);
        setIntField(term13449, term13449.getClass(), "status", 197109649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13449, args);
    }

};


