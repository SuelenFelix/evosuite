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

public class RoomDTO_getId_17715829711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term911;

    public RoomDTO_getId_17715829711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term912 = new Integer(-883034806);
        Integer term914 = new Integer(1585847225);
        Integer term964 = new Integer(597278769);
        Integer term966 = new Integer(-1685132342);
        term911 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term911, term911.getClass(), "id", term912);
        setField(term911, term911.getClass(), "facilityid", term914);
        setField(term911, term911.getClass(), "roomName", "aKnKipADSo");
        setField(term911, term911.getClass(), "oldMeetingTime", "wSQxaModmm");
        setField(term911, term911.getClass(), "meetingTime", "UlajhuVLaP");
        setField(term911, term911.getClass(), "roomAddr", "gGSMzuGICf");
        setField(term911, term911.getClass(), "peoples", term964);
        setField(term911, term911.getClass(), "meetroomState", term966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term911, args);
    }

};


