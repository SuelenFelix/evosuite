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

public class Meeting1DTO_setHost_10665286086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348;

    public Meeting1DTO_setHost_10665286086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term349 = new Integer(-1955890973);
        term348 = newInstance(Class.forName("com.org.model.dto.Meeting1DTO"));
        setField(term348, term348.getClass(), "userid", term349);
        setField(term348, term348.getClass(), "host", "aJlieCFVtF");
        setField(term348, term348.getClass(), "meetingname", "ZiaGIbnzTs");
        setField(term348, term348.getClass(), "meetingroom", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.Meeting1DTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setHost", argTypes, term348, args);
    }

};


