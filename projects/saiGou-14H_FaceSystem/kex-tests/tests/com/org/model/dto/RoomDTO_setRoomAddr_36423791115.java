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

public class RoomDTO_setRoomAddr_36423791115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10367;

    public RoomDTO_setRoomAddr_36423791115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10368 = new Integer(-598803400);
        Integer term10370 = new Integer(25560022);
        Integer term10420 = new Integer(-1090136985);
        Integer term10422 = new Integer(-355574894);
        term10367 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term10367, term10367.getClass(), "id", term10368);
        setField(term10367, term10367.getClass(), "facilityid", term10370);
        setField(term10367, term10367.getClass(), "roomName", "DneBWnIeDx");
        setField(term10367, term10367.getClass(), "oldMeetingTime", "pDqUZCoDIX");
        setField(term10367, term10367.getClass(), "meetingTime", "ErlJXmBNko");
        setField(term10367, term10367.getClass(), "roomAddr", "qyKAThLlxF");
        setField(term10367, term10367.getClass(), "peoples", term10420);
        setField(term10367, term10367.getClass(), "meetroomState", term10422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QASMnlCopd";
        callMethod(klass, "setRoomAddr", argTypes, term10367, args);
    }

};


