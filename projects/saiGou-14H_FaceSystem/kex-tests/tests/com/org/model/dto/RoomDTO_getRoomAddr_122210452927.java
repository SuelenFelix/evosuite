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

public class RoomDTO_getRoomAddr_122210452927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2954;

    public RoomDTO_getRoomAddr_122210452927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2954 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term2954, term2954.getClass(), "id", null);
        setField(term2954, term2954.getClass(), "facilityid", null);
        setField(term2954, term2954.getClass(), "roomName", null);
        setField(term2954, term2954.getClass(), "oldMeetingTime", null);
        setField(term2954, term2954.getClass(), "meetingTime", null);
        setField(term2954, term2954.getClass(), "roomAddr", null);
        setField(term2954, term2954.getClass(), "peoples", null);
        setField(term2954, term2954.getClass(), "meetroomState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoomAddr", argTypes, term2954, args);
    }

};


