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

public class MeetingMessage_getEndTime_207974192112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1268;

    public MeetingMessage_getEndTime_207974192112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1305 = new Integer(-2068769794);
        Integer term1307 = new Integer(-117576464);
        term1268 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term1309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1314 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1324 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1268, term1268.getClass(), "username", "GzFkzHGYFt");
        setField(term1268, term1268.getClass(), "nickname", "tShwQLRGNe");
        setField(term1268, term1268.getClass(), "sex", "LvtrsXUliU");
        setField(term1268, term1268.getClass(), "umPower", term1305);
        setField(term1268, term1268.getClass(), "state", term1307);
        setIntField(term1310, term1310.getClass(), "year", 2015);
        setShortField(term1310, term1310.getClass(), "month", (short) 3);
        setShortField(term1310, term1310.getClass(), "day", (short) 10);
        setField(term1309, term1309.getClass(), "date", term1310);
        setByteField(term1314, term1314.getClass(), "hour", (byte) 23);
        setByteField(term1314, term1314.getClass(), "minute", (byte) 34);
        setByteField(term1314, term1314.getClass(), "second", (byte) 44);
        setIntField(term1314, term1314.getClass(), "nano", 587322824);
        setField(term1309, term1309.getClass(), "time", term1314);
        setField(term1268, term1268.getClass(), "startTime", term1309);
        setIntField(term1320, term1320.getClass(), "year", 2027);
        setShortField(term1320, term1320.getClass(), "month", (short) 8);
        setShortField(term1320, term1320.getClass(), "day", (short) 26);
        setField(term1319, term1319.getClass(), "date", term1320);
        setByteField(term1324, term1324.getClass(), "hour", (byte) 5);
        setByteField(term1324, term1324.getClass(), "minute", (byte) 11);
        setByteField(term1324, term1324.getClass(), "second", (byte) 9);
        setIntField(term1324, term1324.getClass(), "nano", 219245092);
        setField(term1319, term1319.getClass(), "time", term1324);
        setField(term1268, term1268.getClass(), "endTime", term1319);
        setField(term1268, term1268.getClass(), "allTime", "xLbjWUgOIL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndTime", argTypes, term1268, args);
    }

};


