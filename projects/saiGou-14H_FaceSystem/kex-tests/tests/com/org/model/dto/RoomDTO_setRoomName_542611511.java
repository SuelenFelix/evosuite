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

public class RoomDTO_setRoomName_542611511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1885;

    public RoomDTO_setRoomName_542611511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1886 = new Integer(292681826);
        Integer term1888 = new Integer(458147407);
        Integer term1938 = new Integer(-184153539);
        Integer term1940 = new Integer(493620644);
        term1885 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term1885, term1885.getClass(), "id", term1886);
        setField(term1885, term1885.getClass(), "facilityid", term1888);
        setField(term1885, term1885.getClass(), "roomName", "wGmYcqUkgE");
        setField(term1885, term1885.getClass(), "oldMeetingTime", "idgaQsnJpQ");
        setField(term1885, term1885.getClass(), "meetingTime", "VgZnGoIFwQ");
        setField(term1885, term1885.getClass(), "roomAddr", "jUbSRrkrYZ");
        setField(term1885, term1885.getClass(), "peoples", term1938);
        setField(term1885, term1885.getClass(), "meetroomState", term1940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bWWfajKbEX";
        callMethod(klass, "setRoomName", argTypes, term1885, args);
    }

};


