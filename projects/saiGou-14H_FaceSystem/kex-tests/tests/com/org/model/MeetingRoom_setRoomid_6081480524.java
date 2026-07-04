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

public class MeetingRoom_setRoomid_6081480524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36345;
     Object term36350;

    public MeetingRoom_setRoomid_6081480524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term36346 = new Integer(720355914);
        Integer term36348 = new Integer(-775874930);
        term36345 = newInstance(Class.forName("com.org.model.MeetingRoom"));
        setField(term36345, term36345.getClass(), "meetingid", term36346);
        setField(term36345, term36345.getClass(), "roomid", term36348);
        term36350 = new Integer(1404363846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.MeetingRoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term36350;
        callMethod(klass, "setRoomid", argTypes, term36345, args);
    }

};


