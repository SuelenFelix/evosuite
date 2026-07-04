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

public class RoomDTO_setMeetroomState_49822915516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2460;
     Object term2517;

    public RoomDTO_setMeetroomState_49822915516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2461 = new Integer(-2027534003);
        Integer term2463 = new Integer(1063420942);
        Integer term2513 = new Integer(1375330971);
        Integer term2515 = new Integer(-478195677);
        term2460 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term2460, term2460.getClass(), "id", term2461);
        setField(term2460, term2460.getClass(), "facilityid", term2463);
        setField(term2460, term2460.getClass(), "roomName", "vjxIhXHxGR");
        setField(term2460, term2460.getClass(), "oldMeetingTime", "QXzGXbEXMu");
        setField(term2460, term2460.getClass(), "meetingTime", "qxSDVejjiY");
        setField(term2460, term2460.getClass(), "roomAddr", "xBsXSDjXYK");
        setField(term2460, term2460.getClass(), "peoples", term2513);
        setField(term2460, term2460.getClass(), "meetroomState", term2515);
        term2517 = new Integer(972867650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2517;
        callMethod(klass, "setMeetroomState", argTypes, term2460, args);
    }

};


