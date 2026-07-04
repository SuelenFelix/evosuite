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

public class MeetingMessage_getStartTime_189079759411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1155;

    public MeetingMessage_getStartTime_189079759411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1192 = new Integer(-655067527);
        Integer term1194 = new Integer(-6029667);
        term1155 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term1196 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1201 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1211 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1155, term1155.getClass(), "username", "UlajhuVLaP");
        setField(term1155, term1155.getClass(), "nickname", "gGSMzuGICf");
        setField(term1155, term1155.getClass(), "sex", "hxCBltsObl");
        setField(term1155, term1155.getClass(), "umPower", term1192);
        setField(term1155, term1155.getClass(), "state", term1194);
        setIntField(term1197, term1197.getClass(), "year", 2014);
        setShortField(term1197, term1197.getClass(), "month", (short) 7);
        setShortField(term1197, term1197.getClass(), "day", (short) 13);
        setField(term1196, term1196.getClass(), "date", term1197);
        setByteField(term1201, term1201.getClass(), "hour", (byte) 21);
        setByteField(term1201, term1201.getClass(), "minute", (byte) 46);
        setByteField(term1201, term1201.getClass(), "second", (byte) 0);
        setIntField(term1201, term1201.getClass(), "nano", 887884128);
        setField(term1196, term1196.getClass(), "time", term1201);
        setField(term1155, term1155.getClass(), "startTime", term1196);
        setIntField(term1207, term1207.getClass(), "year", 2023);
        setShortField(term1207, term1207.getClass(), "month", (short) 3);
        setShortField(term1207, term1207.getClass(), "day", (short) 7);
        setField(term1206, term1206.getClass(), "date", term1207);
        setByteField(term1211, term1211.getClass(), "hour", (byte) 21);
        setByteField(term1211, term1211.getClass(), "minute", (byte) 15);
        setByteField(term1211, term1211.getClass(), "second", (byte) 43);
        setIntField(term1211, term1211.getClass(), "nano", 639721472);
        setField(term1206, term1206.getClass(), "time", term1211);
        setField(term1155, term1155.getClass(), "endTime", term1206);
        setField(term1155, term1155.getClass(), "allTime", "BndsHwAFMv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term1155, args);
    }

};


