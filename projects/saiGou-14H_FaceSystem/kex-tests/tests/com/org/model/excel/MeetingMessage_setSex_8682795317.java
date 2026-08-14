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

public class MeetingMessage_setSex_8682795317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38215;

    public MeetingMessage_setSex_8682795317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38252 = new Integer(-396456847);
        Integer term38254 = new Integer(1826615515);
        term38215 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term38256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38261 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38271 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term38215, term38215.getClass(), "username", "VytBIaPeoV");
        setField(term38215, term38215.getClass(), "nickname", "eVeQiooIie");
        setField(term38215, term38215.getClass(), "sex", "tBvyiKlvwt");
        setField(term38215, term38215.getClass(), "umPower", term38252);
        setField(term38215, term38215.getClass(), "state", term38254);
        setIntField(term38257, term38257.getClass(), "year", 2011);
        setShortField(term38257, term38257.getClass(), "month", (short) 12);
        setShortField(term38257, term38257.getClass(), "day", (short) 6);
        setField(term38256, term38256.getClass(), "date", term38257);
        setByteField(term38261, term38261.getClass(), "hour", (byte) 21);
        setByteField(term38261, term38261.getClass(), "minute", (byte) 3);
        setByteField(term38261, term38261.getClass(), "second", (byte) 28);
        setIntField(term38261, term38261.getClass(), "nano", 650612376);
        setField(term38256, term38256.getClass(), "time", term38261);
        setField(term38215, term38215.getClass(), "startTime", term38256);
        setIntField(term38267, term38267.getClass(), "year", 2025);
        setShortField(term38267, term38267.getClass(), "month", (short) 1);
        setShortField(term38267, term38267.getClass(), "day", (short) 2);
        setField(term38266, term38266.getClass(), "date", term38267);
        setByteField(term38271, term38271.getClass(), "hour", (byte) 12);
        setByteField(term38271, term38271.getClass(), "minute", (byte) 18);
        setByteField(term38271, term38271.getClass(), "second", (byte) 4);
        setIntField(term38271, term38271.getClass(), "nano", 249732001);
        setField(term38266, term38266.getClass(), "time", term38271);
        setField(term38215, term38215.getClass(), "endTime", term38266);
        setField(term38215, term38215.getClass(), "allTime", "cbrJBcmzzA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MQEpjCONzM";
        callMethod(klass, "setSex", argTypes, term38215, args);
    }

};


