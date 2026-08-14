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

public class RoomDTO_setMeetingTime_157063414514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10248;

    public RoomDTO_setMeetingTime_157063414514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10249 = new Integer(1428598210);
        Integer term10251 = new Integer(1071776561);
        Integer term10301 = new Integer(1846399918);
        Integer term10303 = new Integer(35388821);
        term10248 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term10248, term10248.getClass(), "id", term10249);
        setField(term10248, term10248.getClass(), "facilityid", term10251);
        setField(term10248, term10248.getClass(), "roomName", "FXnVCgcJAm");
        setField(term10248, term10248.getClass(), "oldMeetingTime", "noOpWudfzV");
        setField(term10248, term10248.getClass(), "meetingTime", "OWORKBHHIN");
        setField(term10248, term10248.getClass(), "roomAddr", "sbvPxiaOoC");
        setField(term10248, term10248.getClass(), "peoples", term10301);
        setField(term10248, term10248.getClass(), "meetroomState", term10303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rrCIslqAVq";
        callMethod(klass, "setMeetingTime", argTypes, term10248, args);
    }

};


