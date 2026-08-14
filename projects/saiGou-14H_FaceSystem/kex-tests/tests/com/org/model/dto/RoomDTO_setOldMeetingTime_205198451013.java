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

public class RoomDTO_setOldMeetingTime_205198451013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10247;

    public RoomDTO_setOldMeetingTime_205198451013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10247 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term10247, term10247.getClass(), "id", null);
        setField(term10247, term10247.getClass(), "facilityid", null);
        setField(term10247, term10247.getClass(), "roomName", null);
        setField(term10247, term10247.getClass(), "oldMeetingTime", null);
        setField(term10247, term10247.getClass(), "meetingTime", null);
        setField(term10247, term10247.getClass(), "roomAddr", null);
        setField(term10247, term10247.getClass(), "peoples", null);
        setField(term10247, term10247.getClass(), "meetroomState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOldMeetingTime", argTypes, term10247, args);
    }

};


