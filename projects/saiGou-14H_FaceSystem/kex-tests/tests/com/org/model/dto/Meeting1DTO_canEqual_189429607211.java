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

public class Meeting1DTO_canEqual_189429607211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4234;
     Object term4273;

    public Meeting1DTO_canEqual_189429607211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4235 = new Integer(-1195191239);
        term4234 = newInstance(Class.forName("com.org.model.dto.Meeting1DTO"));
        setField(term4234, term4234.getClass(), "userid", term4235);
        setField(term4234, term4234.getClass(), "host", "EGFHrFOTWy");
        setField(term4234, term4234.getClass(), "meetingname", "VQLNXTwXTJ");
        setField(term4234, term4234.getClass(), "meetingroom", "GZygAttIuk");
        term4273 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.Meeting1DTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4273;
        callMethod(klass, "canEqual", argTypes, term4234, args);
    }

};


