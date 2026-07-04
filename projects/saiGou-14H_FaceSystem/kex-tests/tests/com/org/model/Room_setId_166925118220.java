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

public class Room_setId_166925118220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5622;

    public Room_setId_166925118220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5622 = newInstance(Class.forName("com.org.model.Room"));
        setField(term5622, term5622.getClass(), "id", null);
        setField(term5622, term5622.getClass(), "roomName", null);
        setField(term5622, term5622.getClass(), "roomAddr", null);
        setField(term5622, term5622.getClass(), "peoples", null);
        setField(term5622, term5622.getClass(), "meetroomState", null);
        setField(term5622, term5622.getClass(), "facilities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term5622, args);
    }

};


