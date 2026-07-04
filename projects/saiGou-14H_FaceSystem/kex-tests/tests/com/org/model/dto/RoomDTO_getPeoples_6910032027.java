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

public class RoomDTO_getPeoples_6910032027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1493;

    public RoomDTO_getPeoples_6910032027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1494 = new Integer(-469968304);
        Integer term1496 = new Integer(-1145578966);
        Integer term1546 = new Integer(679763016);
        Integer term1548 = new Integer(1962444399);
        term1493 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term1493, term1493.getClass(), "id", term1494);
        setField(term1493, term1493.getClass(), "facilityid", term1496);
        setField(term1493, term1493.getClass(), "roomName", "eqJfYWRaEL");
        setField(term1493, term1493.getClass(), "oldMeetingTime", "fhkbdRViHi");
        setField(term1493, term1493.getClass(), "meetingTime", "uWHnvSvaPl");
        setField(term1493, term1493.getClass(), "roomAddr", "kBdSllIBVz");
        setField(term1493, term1493.getClass(), "peoples", term1546);
        setField(term1493, term1493.getClass(), "meetroomState", term1548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPeoples", argTypes, term1493, args);
    }

};


