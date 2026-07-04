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

public class MeetingMessage_setAllTime_1909825670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public MeetingMessage_setAllTime_1909825670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38 = new Integer(568599855);
        Integer term40 = new Integer(1162663216);
        term1 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term42 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "username", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "nickname", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "sex", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "umPower", term38);
        setField(term1, term1.getClass(), "state", term40);
        setIntField(term43, term43.getClass(), "year", 2012);
        setShortField(term43, term43.getClass(), "month", (short) 8);
        setShortField(term43, term43.getClass(), "day", (short) 25);
        setField(term42, term42.getClass(), "date", term43);
        setByteField(term47, term47.getClass(), "hour", (byte) 5);
        setByteField(term47, term47.getClass(), "minute", (byte) 20);
        setByteField(term47, term47.getClass(), "second", (byte) 50);
        setIntField(term47, term47.getClass(), "nano", 345595912);
        setField(term42, term42.getClass(), "time", term47);
        setField(term1, term1.getClass(), "startTime", term42);
        setIntField(term53, term53.getClass(), "year", 2021);
        setShortField(term53, term53.getClass(), "month", (short) 1);
        setShortField(term53, term53.getClass(), "day", (short) 18);
        setField(term52, term52.getClass(), "date", term53);
        setByteField(term57, term57.getClass(), "hour", (byte) 13);
        setByteField(term57, term57.getClass(), "minute", (byte) 38);
        setByteField(term57, term57.getClass(), "second", (byte) 26);
        setIntField(term57, term57.getClass(), "nano", 544608644);
        setField(term52, term52.getClass(), "time", term57);
        setField(term1, term1.getClass(), "endTime", term52);
        setField(term1, term1.getClass(), "allTime", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "setAllTime", argTypes, term1, args);
    }

};


