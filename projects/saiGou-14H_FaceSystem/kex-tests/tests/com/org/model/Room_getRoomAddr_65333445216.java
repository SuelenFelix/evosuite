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

public class Room_getRoomAddr_65333445216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5618;

    public Room_getRoomAddr_65333445216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5618 = newInstance(Class.forName("com.org.model.Room"));
        setField(term5618, term5618.getClass(), "id", null);
        setField(term5618, term5618.getClass(), "roomName", null);
        setField(term5618, term5618.getClass(), "roomAddr", null);
        setField(term5618, term5618.getClass(), "peoples", null);
        setField(term5618, term5618.getClass(), "meetroomState", null);
        setField(term5618, term5618.getClass(), "facilities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoomAddr", argTypes, term5618, args);
    }

};


