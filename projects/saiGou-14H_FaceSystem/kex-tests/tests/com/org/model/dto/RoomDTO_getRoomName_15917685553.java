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

public class RoomDTO_getRoomName_15917685553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1105;

    public RoomDTO_getRoomName_15917685553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1106 = new Integer(-6029667);
        Integer term1108 = new Integer(-2068769794);
        Integer term1158 = new Integer(-117576464);
        Integer term1160 = new Integer(-1007160944);
        term1105 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term1105, term1105.getClass(), "id", term1106);
        setField(term1105, term1105.getClass(), "facilityid", term1108);
        setField(term1105, term1105.getClass(), "roomName", "LvtrsXUliU");
        setField(term1105, term1105.getClass(), "oldMeetingTime", "xLbjWUgOIL");
        setField(term1105, term1105.getClass(), "meetingTime", "jDtqGUpnZN");
        setField(term1105, term1105.getClass(), "roomAddr", "nGKItKLYNC");
        setField(term1105, term1105.getClass(), "peoples", term1158);
        setField(term1105, term1105.getClass(), "meetroomState", term1160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoomName", argTypes, term1105, args);
    }

};


