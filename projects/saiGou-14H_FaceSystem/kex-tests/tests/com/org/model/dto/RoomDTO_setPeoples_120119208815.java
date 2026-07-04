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

public class RoomDTO_setPeoples_120119208815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2361;
     Object term2418;

    public RoomDTO_setPeoples_120119208815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2362 = new Integer(962840079);
        Integer term2364 = new Integer(1540719661);
        Integer term2414 = new Integer(1265463001);
        Integer term2416 = new Integer(335112684);
        term2361 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term2361, term2361.getClass(), "id", term2362);
        setField(term2361, term2361.getClass(), "facilityid", term2364);
        setField(term2361, term2361.getClass(), "roomName", "BKLfkLiZTH");
        setField(term2361, term2361.getClass(), "oldMeetingTime", "SPpkrGcPRr");
        setField(term2361, term2361.getClass(), "meetingTime", "sEccwbJKYE");
        setField(term2361, term2361.getClass(), "roomAddr", "AWRooQKkdW");
        setField(term2361, term2361.getClass(), "peoples", term2414);
        setField(term2361, term2361.getClass(), "meetroomState", term2416);
        term2418 = new Integer(1551099402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2418;
        callMethod(klass, "setPeoples", argTypes, term2361, args);
    }

};


