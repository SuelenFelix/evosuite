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

public class RoomDTO_setMeetingTime_157063414513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2123;

    public RoomDTO_setMeetingTime_157063414513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2124 = new Integer(-2095575670);
        Integer term2126 = new Integer(1225272962);
        Integer term2176 = new Integer(1324040357);
        Integer term2178 = new Integer(-1588772968);
        term2123 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term2123, term2123.getClass(), "id", term2124);
        setField(term2123, term2123.getClass(), "facilityid", term2126);
        setField(term2123, term2123.getClass(), "roomName", "jSpAteRute");
        setField(term2123, term2123.getClass(), "oldMeetingTime", "swZVeJAxjt");
        setField(term2123, term2123.getClass(), "meetingTime", "xOcJIiQQDu");
        setField(term2123, term2123.getClass(), "roomAddr", "GVizqqzXpy");
        setField(term2123, term2123.getClass(), "peoples", term2176);
        setField(term2123, term2123.getClass(), "meetroomState", term2178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JqXGgAhZPl";
        callMethod(klass, "setMeetingTime", argTypes, term2123, args);
    }

};


