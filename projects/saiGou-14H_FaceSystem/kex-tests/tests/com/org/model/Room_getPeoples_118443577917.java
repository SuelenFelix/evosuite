package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Room_getPeoples_118443577917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5619;

    public Room_getPeoples_118443577917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5619 = newInstance(Class.forName("com.org.model.Room"));
        setField(term5619, term5619.getClass(), "id", null);
        setField(term5619, term5619.getClass(), "roomName", null);
        setField(term5619, term5619.getClass(), "roomAddr", null);
        setField(term5619, term5619.getClass(), "peoples", null);
        setField(term5619, term5619.getClass(), "meetroomState", null);
        setField(term5619, term5619.getClass(), "facilities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPeoples", argTypes, term5619, args);
    }

};


