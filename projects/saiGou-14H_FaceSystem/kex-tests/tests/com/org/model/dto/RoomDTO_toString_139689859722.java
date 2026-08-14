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

public class RoomDTO_toString_139689859722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10978;

    public RoomDTO_toString_139689859722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10979 = new Integer(251039122);
        Integer term10981 = new Integer(459471826);
        Integer term11031 = new Integer(-1054011286);
        Integer term11033 = new Integer(-1640361091);
        term10978 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term10978, term10978.getClass(), "id", term10979);
        setField(term10978, term10978.getClass(), "facilityid", term10981);
        setField(term10978, term10978.getClass(), "roomName", "PVcLgfdPEf");
        setField(term10978, term10978.getClass(), "oldMeetingTime", "PEDTNvvicf");
        setField(term10978, term10978.getClass(), "meetingTime", "CoEwWlFbOr");
        setField(term10978, term10978.getClass(), "roomAddr", "oKzUOrAFFo");
        setField(term10978, term10978.getClass(), "peoples", term11031);
        setField(term10978, term10978.getClass(), "meetroomState", term11033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10978, args);
    }

};


