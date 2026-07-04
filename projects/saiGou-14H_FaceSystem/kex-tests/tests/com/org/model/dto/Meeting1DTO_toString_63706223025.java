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

public class Meeting1DTO_toString_63706223025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910;

    public Meeting1DTO_toString_63706223025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term910 = newInstance(Class.forName("com.org.model.dto.Meeting1DTO"));
        setField(term910, term910.getClass(), "userid", null);
        setField(term910, term910.getClass(), "host", null);
        setField(term910, term910.getClass(), "meetingname", null);
        setField(term910, term910.getClass(), "meetingroom", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.Meeting1DTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term910, args);
    }

};


