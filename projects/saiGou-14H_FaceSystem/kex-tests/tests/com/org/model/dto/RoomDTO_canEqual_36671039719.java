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

public class RoomDTO_canEqual_36671039719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10782;
     Object term10839;

    public RoomDTO_canEqual_36671039719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10783 = new Integer(897269648);
        Integer term10785 = new Integer(-1020664075);
        Integer term10835 = new Integer(-1412100145);
        Integer term10837 = new Integer(-1702355599);
        term10782 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term10782, term10782.getClass(), "id", term10783);
        setField(term10782, term10782.getClass(), "facilityid", term10785);
        setField(term10782, term10782.getClass(), "roomName", "iivsdaIdLe");
        setField(term10782, term10782.getClass(), "oldMeetingTime", "yNZErAgZDk");
        setField(term10782, term10782.getClass(), "meetingTime", "gyeAErvtXb");
        setField(term10782, term10782.getClass(), "roomAddr", "IEsZEVbFZG");
        setField(term10782, term10782.getClass(), "peoples", term10835);
        setField(term10782, term10782.getClass(), "meetroomState", term10837);
        term10839 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10839;
        callMethod(klass, "canEqual", argTypes, term10782, args);
    }

};


