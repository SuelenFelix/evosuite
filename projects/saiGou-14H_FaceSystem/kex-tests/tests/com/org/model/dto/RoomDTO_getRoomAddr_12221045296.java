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

public class RoomDTO_getRoomAddr_12221045296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1396;

    public RoomDTO_getRoomAddr_12221045296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1397 = new Integer(-226514366);
        Integer term1399 = new Integer(1193880199);
        Integer term1449 = new Integer(-1087774327);
        Integer term1451 = new Integer(-1530420153);
        term1396 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term1396, term1396.getClass(), "id", term1397);
        setField(term1396, term1396.getClass(), "facilityid", term1399);
        setField(term1396, term1396.getClass(), "roomName", "nHXjMycHlU");
        setField(term1396, term1396.getClass(), "oldMeetingTime", "ieCtQFdkii");
        setField(term1396, term1396.getClass(), "meetingTime", "dEnhdmILtU");
        setField(term1396, term1396.getClass(), "roomAddr", "hoicvmsovO");
        setField(term1396, term1396.getClass(), "peoples", term1449);
        setField(term1396, term1396.getClass(), "meetroomState", term1451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoomAddr", argTypes, term1396, args);
    }

};


