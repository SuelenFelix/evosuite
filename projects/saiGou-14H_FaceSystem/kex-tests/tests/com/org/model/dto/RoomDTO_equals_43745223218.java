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

public class RoomDTO_equals_43745223218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10684;
     Object term10741;

    public RoomDTO_equals_43745223218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10685 = new Integer(-1457812682);
        Integer term10687 = new Integer(-161850441);
        Integer term10737 = new Integer(1486351894);
        Integer term10739 = new Integer(1352463113);
        term10684 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term10684, term10684.getClass(), "id", term10685);
        setField(term10684, term10684.getClass(), "facilityid", term10687);
        setField(term10684, term10684.getClass(), "roomName", "gyZHokNAZb");
        setField(term10684, term10684.getClass(), "oldMeetingTime", "BDiGllEiZb");
        setField(term10684, term10684.getClass(), "meetingTime", "EmYykcYSYU");
        setField(term10684, term10684.getClass(), "roomAddr", "tmkiHdXIso");
        setField(term10684, term10684.getClass(), "peoples", term10737);
        setField(term10684, term10684.getClass(), "meetroomState", term10739);
        term10741 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10741;
        callMethod(klass, "equals", argTypes, term10684, args);
    }

};


