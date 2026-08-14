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

public class RoomDTO_equals_43745223240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11091;

    public RoomDTO_equals_43745223240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11091 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term11091, term11091.getClass(), "id", null);
        setField(term11091, term11091.getClass(), "facilityid", null);
        setField(term11091, term11091.getClass(), "roomName", null);
        setField(term11091, term11091.getClass(), "oldMeetingTime", null);
        setField(term11091, term11091.getClass(), "meetingTime", null);
        setField(term11091, term11091.getClass(), "roomAddr", null);
        setField(term11091, term11091.getClass(), "peoples", null);
        setField(term11091, term11091.getClass(), "meetroomState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term11091, args);
    }

};


