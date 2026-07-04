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

public class MeetingRoom_setMeetingid_14245819443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36338;
     Object term36343;

    public MeetingRoom_setMeetingid_14245819443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term36339 = new Integer(108670537);
        Integer term36341 = new Integer(-94326012);
        term36338 = newInstance(Class.forName("com.org.model.MeetingRoom"));
        setField(term36338, term36338.getClass(), "meetingid", term36339);
        setField(term36338, term36338.getClass(), "roomid", term36341);
        term36343 = new Integer(-665192132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.MeetingRoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term36343;
        callMethod(klass, "setMeetingid", argTypes, term36338, args);
    }

};


