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

public class Meeting1DTO_equals_15965085959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621;
     Object term660;

    public Meeting1DTO_equals_15965085959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term622 = new Integer(-1339778481);
        term621 = newInstance(Class.forName("com.org.model.dto.Meeting1DTO"));
        setField(term621, term621.getClass(), "userid", term622);
        setField(term621, term621.getClass(), "host", "OclPbYPkcH");
        setField(term621, term621.getClass(), "meetingname", "IoAlmYsBwc");
        setField(term621, term621.getClass(), "meetingroom", "TEParAifyi");
        term660 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.Meeting1DTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term660;
        callMethod(klass, "equals", argTypes, term621, args);
    }

};


