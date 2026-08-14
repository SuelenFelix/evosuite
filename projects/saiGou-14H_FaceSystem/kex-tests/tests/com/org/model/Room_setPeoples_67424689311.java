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
import java.lang.Integer;
import java.util.ArrayList;

public class Room_setPeoples_67424689311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5302;
     Object term5337;

    public Room_setPeoples_67424689311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5303 = new Integer(-2072618022);
        Integer term5329 = new Integer(-269909549);
        Integer term5331 = new Integer(686286032);
        ArrayList term5333 = new ArrayList();
        term5302 = newInstance(Class.forName("com.org.model.Room"));
        setField(term5302, term5302.getClass(), "id", term5303);
        setField(term5302, term5302.getClass(), "roomName", "skbwTMoBkR");
        setField(term5302, term5302.getClass(), "roomAddr", "nyZemBzxeX");
        setField(term5302, term5302.getClass(), "peoples", term5329);
        setField(term5302, term5302.getClass(), "meetroomState", term5331);
        setField(term5302, term5302.getClass(), "facilities", term5333);
        term5337 = new Integer(-1277201854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5337;
        callMethod(klass, "setPeoples", argTypes, term5302, args);
    }

};


