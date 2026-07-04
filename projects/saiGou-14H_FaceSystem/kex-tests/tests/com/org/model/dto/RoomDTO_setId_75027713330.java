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

public class RoomDTO_setId_75027713330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2957;

    public RoomDTO_setId_75027713330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2957 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term2957, term2957.getClass(), "id", null);
        setField(term2957, term2957.getClass(), "facilityid", null);
        setField(term2957, term2957.getClass(), "roomName", null);
        setField(term2957, term2957.getClass(), "oldMeetingTime", null);
        setField(term2957, term2957.getClass(), "meetingTime", null);
        setField(term2957, term2957.getClass(), "roomAddr", null);
        setField(term2957, term2957.getClass(), "peoples", null);
        setField(term2957, term2957.getClass(), "meetroomState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term2957, args);
    }

};


