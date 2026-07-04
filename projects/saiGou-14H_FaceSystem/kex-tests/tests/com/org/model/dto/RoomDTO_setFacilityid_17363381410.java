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

public class RoomDTO_setFacilityid_17363381410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1786;
     Object term1843;

    public RoomDTO_setFacilityid_17363381410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1787 = new Integer(1632125673);
        Integer term1789 = new Integer(454281060);
        Integer term1839 = new Integer(-1786399638);
        Integer term1841 = new Integer(2055867847);
        term1786 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term1786, term1786.getClass(), "id", term1787);
        setField(term1786, term1786.getClass(), "facilityid", term1789);
        setField(term1786, term1786.getClass(), "roomName", "MAcUBcBckh");
        setField(term1786, term1786.getClass(), "oldMeetingTime", "oVgzLbrsFr");
        setField(term1786, term1786.getClass(), "meetingTime", "vQVyKLdtaz");
        setField(term1786, term1786.getClass(), "roomAddr", "OWKQODBLzb");
        setField(term1786, term1786.getClass(), "peoples", term1839);
        setField(term1786, term1786.getClass(), "meetroomState", term1841);
        term1843 = new Integer(-1048298087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1843;
        callMethod(klass, "setFacilityid", argTypes, term1786, args);
    }

};


