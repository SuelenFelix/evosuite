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

public class RoomDTO_getPeoples_69100320231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11082;

    public RoomDTO_getPeoples_69100320231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11082 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term11082, term11082.getClass(), "id", null);
        setField(term11082, term11082.getClass(), "facilityid", null);
        setField(term11082, term11082.getClass(), "roomName", null);
        setField(term11082, term11082.getClass(), "oldMeetingTime", null);
        setField(term11082, term11082.getClass(), "meetingTime", null);
        setField(term11082, term11082.getClass(), "roomAddr", null);
        setField(term11082, term11082.getClass(), "peoples", null);
        setField(term11082, term11082.getClass(), "meetroomState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPeoples", argTypes, term11082, args);
    }

};


