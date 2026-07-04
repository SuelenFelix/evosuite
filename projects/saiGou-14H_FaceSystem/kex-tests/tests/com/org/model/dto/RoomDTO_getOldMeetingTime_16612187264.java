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

public class RoomDTO_getOldMeetingTime_16612187264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1202;

    public RoomDTO_getOldMeetingTime_16612187264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1203 = new Integer(1135664017);
        Integer term1205 = new Integer(590364439);
        Integer term1255 = new Integer(865208305);
        Integer term1257 = new Integer(-1275173084);
        term1202 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term1202, term1202.getClass(), "id", term1203);
        setField(term1202, term1202.getClass(), "facilityid", term1205);
        setField(term1202, term1202.getClass(), "roomName", "UiUYnPrcCi");
        setField(term1202, term1202.getClass(), "oldMeetingTime", "UoYtihxVaS");
        setField(term1202, term1202.getClass(), "meetingTime", "JDswTTCZHV");
        setField(term1202, term1202.getClass(), "roomAddr", "onpbIeEKoi");
        setField(term1202, term1202.getClass(), "peoples", term1255);
        setField(term1202, term1202.getClass(), "meetroomState", term1257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOldMeetingTime", argTypes, term1202, args);
    }

};


