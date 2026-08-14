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

public class RoomDTO_hashCode_88613890720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10880;

    public RoomDTO_hashCode_88613890720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10881 = new Integer(-1477091217);
        Integer term10883 = new Integer(2023226154);
        Integer term10933 = new Integer(2111611214);
        Integer term10935 = new Integer(-2031129784);
        term10880 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term10880, term10880.getClass(), "id", term10881);
        setField(term10880, term10880.getClass(), "facilityid", term10883);
        setField(term10880, term10880.getClass(), "roomName", "hefxCEhnuL");
        setField(term10880, term10880.getClass(), "oldMeetingTime", "nAZCgcAqKF");
        setField(term10880, term10880.getClass(), "meetingTime", "qEwUfGEixD");
        setField(term10880, term10880.getClass(), "roomAddr", "gzwdEqELlU");
        setField(term10880, term10880.getClass(), "peoples", term10933);
        setField(term10880, term10880.getClass(), "meetroomState", term10935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10880, args);
    }

};


