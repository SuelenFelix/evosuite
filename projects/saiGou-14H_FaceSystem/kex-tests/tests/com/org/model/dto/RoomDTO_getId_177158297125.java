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

public class RoomDTO_getId_177158297125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11076;

    public RoomDTO_getId_177158297125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11076 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term11076, term11076.getClass(), "id", null);
        setField(term11076, term11076.getClass(), "facilityid", null);
        setField(term11076, term11076.getClass(), "roomName", null);
        setField(term11076, term11076.getClass(), "oldMeetingTime", null);
        setField(term11076, term11076.getClass(), "meetingTime", null);
        setField(term11076, term11076.getClass(), "roomAddr", null);
        setField(term11076, term11076.getClass(), "peoples", null);
        setField(term11076, term11076.getClass(), "meetroomState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term11076, args);
    }

};


