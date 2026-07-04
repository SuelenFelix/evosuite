package com.org.model.excel;

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
import static com.org.model.excel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class MeetingMessage_getSex_12865532318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816;

    public MeetingMessage_getSex_12865532318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term853 = new Integer(1585847225);
        Integer term855 = new Integer(597278769);
        term816 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term857 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term858 = newInstance(Class.forName("java.time.LocalDate"));
        Object term862 = newInstance(Class.forName("java.time.LocalTime"));
        Object term867 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term868 = newInstance(Class.forName("java.time.LocalDate"));
        Object term872 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term816, term816.getClass(), "username", "TEParAifyi");
        setField(term816, term816.getClass(), "nickname", "OWDIEULEFu");
        setField(term816, term816.getClass(), "sex", "dWRymuLBtr");
        setField(term816, term816.getClass(), "umPower", term853);
        setField(term816, term816.getClass(), "state", term855);
        setIntField(term858, term858.getClass(), "year", 2012);
        setShortField(term858, term858.getClass(), "month", (short) 2);
        setShortField(term858, term858.getClass(), "day", (short) 19);
        setField(term857, term857.getClass(), "date", term858);
        setByteField(term862, term862.getClass(), "hour", (byte) 8);
        setByteField(term862, term862.getClass(), "minute", (byte) 4);
        setByteField(term862, term862.getClass(), "second", (byte) 43);
        setIntField(term862, term862.getClass(), "nano", 114930008);
        setField(term857, term857.getClass(), "time", term862);
        setField(term816, term816.getClass(), "startTime", term857);
        setIntField(term868, term868.getClass(), "year", 2017);
        setShortField(term868, term868.getClass(), "month", (short) 6);
        setShortField(term868, term868.getClass(), "day", (short) 8);
        setField(term867, term867.getClass(), "date", term868);
        setByteField(term872, term872.getClass(), "hour", (byte) 0);
        setByteField(term872, term872.getClass(), "minute", (byte) 18);
        setByteField(term872, term872.getClass(), "second", (byte) 55);
        setIntField(term872, term872.getClass(), "nano", 680586717);
        setField(term867, term867.getClass(), "time", term872);
        setField(term816, term816.getClass(), "endTime", term867);
        setField(term816, term816.getClass(), "allTime", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSex", argTypes, term816, args);
    }

};


