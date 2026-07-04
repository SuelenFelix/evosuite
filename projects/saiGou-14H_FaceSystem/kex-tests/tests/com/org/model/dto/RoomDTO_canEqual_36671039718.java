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

public class RoomDTO_canEqual_36671039718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2657;
     Object term2714;

    public RoomDTO_canEqual_36671039718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2658 = new Integer(1090617576);
        Integer term2660 = new Integer(-1547384488);
        Integer term2710 = new Integer(1442160736);
        Integer term2712 = new Integer(1114000454);
        term2657 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term2657, term2657.getClass(), "id", term2658);
        setField(term2657, term2657.getClass(), "facilityid", term2660);
        setField(term2657, term2657.getClass(), "roomName", "SJiQaLvSKv");
        setField(term2657, term2657.getClass(), "oldMeetingTime", "OEXDRUKcFl");
        setField(term2657, term2657.getClass(), "meetingTime", "RYdKCNNMBR");
        setField(term2657, term2657.getClass(), "roomAddr", "yGtHPyvYiQ");
        setField(term2657, term2657.getClass(), "peoples", term2710);
        setField(term2657, term2657.getClass(), "meetroomState", term2712);
        term2714 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2714;
        callMethod(klass, "canEqual", argTypes, term2657, args);
    }

};


