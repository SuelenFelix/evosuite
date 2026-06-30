package com.meteergin.medium.stream;

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
import static com.meteergin.medium.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class User_setId_19000712755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346;
     Object term385;

    public User_setId_19000712755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term346, term346.getClass(), "id", 7411271909051562686L);
        setField(term346, term346.getClass(), "firstName", "aJlieCFVtF");
        setField(term346, term346.getClass(), "lastName", "ZiaGIbnzTs");
        setIntField(term346, term346.getClass(), "age", -616727354);
        setField(term346, term346.getClass(), "nationality", "tbcdzjIfER");
        term385 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term385;
        callMethod(klass, "setId", argTypes, term346, args);
    }

};


