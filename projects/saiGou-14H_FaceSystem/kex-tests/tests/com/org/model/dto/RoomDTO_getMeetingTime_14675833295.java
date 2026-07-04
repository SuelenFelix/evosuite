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

public class RoomDTO_getMeetingTime_14675833295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1299;

    public RoomDTO_getMeetingTime_14675833295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1300 = new Integer(-244121226);
        Integer term1302 = new Integer(-203030934);
        Integer term1352 = new Integer(-1179120542);
        Integer term1354 = new Integer(-73683645);
        term1299 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term1299, term1299.getClass(), "id", term1300);
        setField(term1299, term1299.getClass(), "facilityid", term1302);
        setField(term1299, term1299.getClass(), "roomName", "YRHGsAkhxb");
        setField(term1299, term1299.getClass(), "oldMeetingTime", "ffYhPOzlUs");
        setField(term1299, term1299.getClass(), "meetingTime", "MLqYREekMl");
        setField(term1299, term1299.getClass(), "roomAddr", "ytSBIKXogI");
        setField(term1299, term1299.getClass(), "peoples", term1352);
        setField(term1299, term1299.getClass(), "meetroomState", term1354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeetingTime", argTypes, term1299, args);
    }

};


