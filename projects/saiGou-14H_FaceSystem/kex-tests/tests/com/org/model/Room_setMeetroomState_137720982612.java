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

public class Room_setMeetroomState_137720982612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5359;
     Object term5400;

    public Room_setMeetroomState_137720982612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5360 = new Integer(1691516034);
        Integer term5386 = new Integer(335681723);
        Integer term5388 = new Integer(-773707674);
        Integer term5393 = new Integer(383244929);
        Object term5392 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5397 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5392, term5392.getClass(), "id", term5393);
        setField(term5392, term5392.getClass(), "facilityName", "");
        setField(term5392, term5392.getClass(), "facilityState", "");
        setField(term5397, term5397.getClass(), "date", null);
        setField(term5397, term5397.getClass(), "time", null);
        setField(term5392, term5392.getClass(), "buyTime", term5397);
        ArrayList term5390 = new ArrayList();
        ((ArrayList) term5390).add(term5392);
        term5359 = newInstance(Class.forName("com.org.model.Room"));
        setField(term5359, term5359.getClass(), "id", term5360);
        setField(term5359, term5359.getClass(), "roomName", "mYUsMDfwJF");
        setField(term5359, term5359.getClass(), "roomAddr", "IYNumeLuJm");
        setField(term5359, term5359.getClass(), "peoples", term5386);
        setField(term5359, term5359.getClass(), "meetroomState", term5388);
        setField(term5359, term5359.getClass(), "facilities", term5390);
        term5400 = new Integer(-2114034003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5400;
        callMethod(klass, "setMeetroomState", argTypes, term5359, args);
    }

};


