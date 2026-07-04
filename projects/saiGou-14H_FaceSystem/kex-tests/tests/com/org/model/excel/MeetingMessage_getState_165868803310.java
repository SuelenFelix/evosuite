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

public class MeetingMessage_getState_165868803310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1042;

    public MeetingMessage_getState_165868803310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1079 = new Integer(1622346318);
        Integer term1081 = new Integer(1048535127);
        term1042 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term1083 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1088 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1093 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1094 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1098 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1042, term1042.getClass(), "username", "IDCWpPLRkE");
        setField(term1042, term1042.getClass(), "nickname", "nyiiPDVjAc");
        setField(term1042, term1042.getClass(), "sex", "aKnKipADSo");
        setField(term1042, term1042.getClass(), "umPower", term1079);
        setField(term1042, term1042.getClass(), "state", term1081);
        setIntField(term1084, term1084.getClass(), "year", 2017);
        setShortField(term1084, term1084.getClass(), "month", (short) 3);
        setShortField(term1084, term1084.getClass(), "day", (short) 5);
        setField(term1083, term1083.getClass(), "date", term1084);
        setByteField(term1088, term1088.getClass(), "hour", (byte) 20);
        setByteField(term1088, term1088.getClass(), "minute", (byte) 34);
        setByteField(term1088, term1088.getClass(), "second", (byte) 55);
        setIntField(term1088, term1088.getClass(), "nano", 78024496);
        setField(term1083, term1083.getClass(), "time", term1088);
        setField(term1042, term1042.getClass(), "startTime", term1083);
        setIntField(term1094, term1094.getClass(), "year", 2020);
        setShortField(term1094, term1094.getClass(), "month", (short) 7);
        setShortField(term1094, term1094.getClass(), "day", (short) 24);
        setField(term1093, term1093.getClass(), "date", term1094);
        setByteField(term1098, term1098.getClass(), "hour", (byte) 0);
        setByteField(term1098, term1098.getClass(), "minute", (byte) 59);
        setByteField(term1098, term1098.getClass(), "second", (byte) 56);
        setIntField(term1098, term1098.getClass(), "nano", 320219201);
        setField(term1093, term1093.getClass(), "time", term1098);
        setField(term1042, term1042.getClass(), "endTime", term1093);
        setField(term1042, term1042.getClass(), "allTime", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term1042, args);
    }

};


