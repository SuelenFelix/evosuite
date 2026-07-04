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

public class RoomDTO_equals_43745223217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2559;
     Object term2616;

    public RoomDTO_equals_43745223217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2560 = new Integer(1655935355);
        Integer term2562 = new Integer(-481533957);
        Integer term2612 = new Integer(1240914516);
        Integer term2614 = new Integer(-1465035361);
        term2559 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term2559, term2559.getClass(), "id", term2560);
        setField(term2559, term2559.getClass(), "facilityid", term2562);
        setField(term2559, term2559.getClass(), "roomName", "sEnIVFtZuQ");
        setField(term2559, term2559.getClass(), "oldMeetingTime", "ZVecLZMLHF");
        setField(term2559, term2559.getClass(), "meetingTime", "fztQhjqwdP");
        setField(term2559, term2559.getClass(), "roomAddr", "eVpkWxjuki");
        setField(term2559, term2559.getClass(), "peoples", term2612);
        setField(term2559, term2559.getClass(), "meetroomState", term2614);
        term2616 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2616;
        callMethod(klass, "equals", argTypes, term2559, args);
    }

};


