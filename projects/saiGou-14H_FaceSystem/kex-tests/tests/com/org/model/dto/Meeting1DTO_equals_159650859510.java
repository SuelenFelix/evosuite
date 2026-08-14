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

public class Meeting1DTO_equals_159650859510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4164;
     Object term4203;

    public Meeting1DTO_equals_159650859510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4165 = new Integer(1133116994);
        term4164 = newInstance(Class.forName("com.org.model.dto.Meeting1DTO"));
        setField(term4164, term4164.getClass(), "userid", term4165);
        setField(term4164, term4164.getClass(), "host", "vXmDfMgmHu");
        setField(term4164, term4164.getClass(), "meetingname", "fyRJvzWMpe");
        setField(term4164, term4164.getClass(), "meetingroom", "KMDtTdvTCJ");
        term4203 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.Meeting1DTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4203;
        callMethod(klass, "equals", argTypes, term4164, args);
    }

};


