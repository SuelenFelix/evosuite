package com.org.model.dto;

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
import static com.org.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Meeting1DTO_getUserid_21450944532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3544;

    public Meeting1DTO_getUserid_21450944532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3545 = new Integer(539095138);
        term3544 = newInstance(Class.forName("com.org.model.dto.Meeting1DTO"));
        setField(term3544, term3544.getClass(), "userid", term3545);
        setField(term3544, term3544.getClass(), "host", "pZsKceaypG");
        setField(term3544, term3544.getClass(), "meetingname", "XZfWiBghln");
        setField(term3544, term3544.getClass(), "meetingroom", "mzCiczKZrz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.Meeting1DTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserid", argTypes, term3544, args);
    }

};


