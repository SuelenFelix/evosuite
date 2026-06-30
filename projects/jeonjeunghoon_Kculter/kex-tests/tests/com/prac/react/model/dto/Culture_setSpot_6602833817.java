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

public class Culture_setSpot_6602833817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32646;
     Object term32699;

    public Culture_setSpot_6602833817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32646 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term32646, term32646.getClass(), "keyNum", -466708718);
        setField(term32646, term32646.getClass(), "keyHash", "zzeaToyLmI");
        setField(term32646, term32646.getClass(), "name", "sKYWhmRMLx");
        setIntField(term32646, term32646.getClass(), "likeCount", 1038029515);
        setIntField(term32646, term32646.getClass(), "status", 1137154606);
        setField(term32646, term32646.getClass(), "explain", "SOJpgWUZCf");
        setField(term32646, term32646.getClass(), "fileUrl", "jgywFOzBDw");
        setIntField(term32646, term32646.getClass(), "spot", -100681578);
        term32699 = new Integer(296568835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32699;
        callMethod(klass, "setSpot", argTypes, term32646, args);
    }

};


