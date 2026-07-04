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

public class RoomDTO_getMeetroomState_6169992458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1590;

    public RoomDTO_getMeetroomState_6169992458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1591 = new Integer(767834723);
        Integer term1593 = new Integer(-602026508);
        Integer term1643 = new Integer(-157887805);
        Integer term1645 = new Integer(1876565163);
        term1590 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term1590, term1590.getClass(), "id", term1591);
        setField(term1590, term1590.getClass(), "facilityid", term1593);
        setField(term1590, term1590.getClass(), "roomName", "TJmVBGfTML");
        setField(term1590, term1590.getClass(), "oldMeetingTime", "tPlsykYBqO");
        setField(term1590, term1590.getClass(), "meetingTime", "bLPjGVBhlX");
        setField(term1590, term1590.getClass(), "roomAddr", "whBvTVIIlC");
        setField(term1590, term1590.getClass(), "peoples", term1643);
        setField(term1590, term1590.getClass(), "meetroomState", term1645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeetroomState", argTypes, term1590, args);
    }

};


