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

public class Meeting1DTO_canEqual_189429607210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691;
     Object term730;

    public Meeting1DTO_canEqual_189429607210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term692 = new Integer(1725571209);
        term691 = newInstance(Class.forName("com.org.model.dto.Meeting1DTO"));
        setField(term691, term691.getClass(), "userid", term692);
        setField(term691, term691.getClass(), "host", "OWDIEULEFu");
        setField(term691, term691.getClass(), "meetingname", "dWRymuLBtr");
        setField(term691, term691.getClass(), "meetingroom", "AijpHYOFuy");
        term730 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.Meeting1DTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term730;
        callMethod(klass, "canEqual", argTypes, term691, args);
    }

};


