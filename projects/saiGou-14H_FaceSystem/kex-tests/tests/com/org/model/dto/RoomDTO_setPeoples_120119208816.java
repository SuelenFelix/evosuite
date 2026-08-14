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

public class RoomDTO_setPeoples_120119208816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10486;
     Object term10543;

    public RoomDTO_setPeoples_120119208816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10487 = new Integer(1866941633);
        Integer term10489 = new Integer(1697296048);
        Integer term10539 = new Integer(1302075623);
        Integer term10541 = new Integer(1238707613);
        term10486 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term10486, term10486.getClass(), "id", term10487);
        setField(term10486, term10486.getClass(), "facilityid", term10489);
        setField(term10486, term10486.getClass(), "roomName", "YwgBBLYGUf");
        setField(term10486, term10486.getClass(), "oldMeetingTime", "GmUcxwDIHd");
        setField(term10486, term10486.getClass(), "meetingTime", "DONVlTbOjd");
        setField(term10486, term10486.getClass(), "roomAddr", "fLWpUJgZWD");
        setField(term10486, term10486.getClass(), "peoples", term10539);
        setField(term10486, term10486.getClass(), "meetroomState", term10541);
        term10543 = new Integer(1961351136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term10543;
        callMethod(klass, "setPeoples", argTypes, term10486, args);
    }

};


