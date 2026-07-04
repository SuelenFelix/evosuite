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
import java.lang.Object;

public class Room_setMeetroomState_137720982611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5358;
     Object term5399;

    public Room_setMeetroomState_137720982611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5359 = new Integer(1691516034);
        Integer term5385 = new Integer(335681723);
        Integer term5387 = new Integer(-773707674);
        Integer term5392 = new Integer(383244929);
        Object term5391 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5396 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5391, term5391.getClass(), "id", term5392);
        setField(term5391, term5391.getClass(), "facilityName", "");
        setField(term5391, term5391.getClass(), "facilityState", "");
        setField(term5396, term5396.getClass(), "date", null);
        setField(term5396, term5396.getClass(), "time", null);
        setField(term5391, term5391.getClass(), "buyTime", term5396);
        ArrayList term5389 = new ArrayList();
        ((ArrayList) term5389).add(term5391);
        term5358 = newInstance(Class.forName("com.org.model.Room"));
        setField(term5358, term5358.getClass(), "id", term5359);
        setField(term5358, term5358.getClass(), "roomName", "mYUsMDfwJF");
        setField(term5358, term5358.getClass(), "roomAddr", "IYNumeLuJm");
        setField(term5358, term5358.getClass(), "peoples", term5385);
        setField(term5358, term5358.getClass(), "meetroomState", term5387);
        setField(term5358, term5358.getClass(), "facilities", term5389);
        term5399 = new Integer(-2114034003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5399;
        callMethod(klass, "setMeetroomState", argTypes, term5358, args);
    }

};


