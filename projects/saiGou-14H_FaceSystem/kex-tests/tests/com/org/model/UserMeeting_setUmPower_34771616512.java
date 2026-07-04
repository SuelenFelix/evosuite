package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class UserMeeting_setUmPower_34771616512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40498;
     Object term40551;

    public UserMeeting_setUmPower_34771616512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40499 = new Integer(-1242612066);
        Integer term40501 = new Integer(-1492896610);
        Integer term40513 = new Integer(1239212151);
        Integer term40515 = new Integer(1513817979);
        Integer term40537 = new Integer(222944981);
        Integer term40549 = new Integer(-1880135720);
        term40498 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40503 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40504 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40508 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40522 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40528 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40532 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40539 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40540 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40544 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40498, term40498.getClass(), "id", term40499);
        setField(term40498, term40498.getClass(), "umPower", term40501);
        setIntField(term40504, term40504.getClass(), "year", 2025);
        setShortField(term40504, term40504.getClass(), "month", (short) 9);
        setShortField(term40504, term40504.getClass(), "day", (short) 18);
        setField(term40503, term40503.getClass(), "date", term40504);
        setByteField(term40508, term40508.getClass(), "hour", (byte) 9);
        setByteField(term40508, term40508.getClass(), "minute", (byte) 14);
        setByteField(term40508, term40508.getClass(), "second", (byte) 26);
        setIntField(term40508, term40508.getClass(), "nano", 567071659);
        setField(term40503, term40503.getClass(), "time", term40508);
        setField(term40498, term40498.getClass(), "createTime", term40503);
        setField(term40498, term40498.getClass(), "userId", term40513);
        setField(term40498, term40498.getClass(), "meetingId", term40515);
        setIntField(term40518, term40518.getClass(), "year", 2017);
        setShortField(term40518, term40518.getClass(), "month", (short) 4);
        setShortField(term40518, term40518.getClass(), "day", (short) 16);
        setField(term40517, term40517.getClass(), "date", term40518);
        setByteField(term40522, term40522.getClass(), "hour", (byte) 4);
        setByteField(term40522, term40522.getClass(), "minute", (byte) 46);
        setByteField(term40522, term40522.getClass(), "second", (byte) 10);
        setIntField(term40522, term40522.getClass(), "nano", 543909144);
        setField(term40517, term40517.getClass(), "time", term40522);
        setField(term40498, term40498.getClass(), "updateTime", term40517);
        setIntField(term40528, term40528.getClass(), "year", 2025);
        setShortField(term40528, term40528.getClass(), "month", (short) 1);
        setShortField(term40528, term40528.getClass(), "day", (short) 18);
        setField(term40527, term40527.getClass(), "date", term40528);
        setByteField(term40532, term40532.getClass(), "hour", (byte) 6);
        setByteField(term40532, term40532.getClass(), "minute", (byte) 53);
        setByteField(term40532, term40532.getClass(), "second", (byte) 54);
        setIntField(term40532, term40532.getClass(), "nano", 781716212);
        setField(term40527, term40527.getClass(), "time", term40532);
        setField(term40498, term40498.getClass(), "startTime", term40527);
        setField(term40498, term40498.getClass(), "state", term40537);
        setIntField(term40540, term40540.getClass(), "year", 2013);
        setShortField(term40540, term40540.getClass(), "month", (short) 10);
        setShortField(term40540, term40540.getClass(), "day", (short) 4);
        setField(term40539, term40539.getClass(), "date", term40540);
        setByteField(term40544, term40544.getClass(), "hour", (byte) 13);
        setByteField(term40544, term40544.getClass(), "minute", (byte) 8);
        setByteField(term40544, term40544.getClass(), "second", (byte) 57);
        setIntField(term40544, term40544.getClass(), "nano", 285165765);
        setField(term40539, term40539.getClass(), "time", term40544);
        setField(term40498, term40498.getClass(), "endTime", term40539);
        setField(term40498, term40498.getClass(), "deleted", term40549);
        term40551 = new Integer(1065058113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term40551;
        callMethod(klass, "setUmPower", argTypes, term40498, args);
    }

};


