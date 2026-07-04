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

public class Meeting_setFileUrl_120989861925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31069;

    public Meeting_setFileUrl_120989861925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31070 = new Integer(630174216);
        Integer term31152 = new Integer(-1081282297);
        Integer term31154 = new Integer(1331103887);
        Integer term31169 = new Integer(637911543);
        term31069 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term31072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31077 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31118 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31119 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31123 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31069, term31069.getClass(), "id", term31070);
        setIntField(term31073, term31073.getClass(), "year", 2016);
        setShortField(term31073, term31073.getClass(), "month", (short) 4);
        setShortField(term31073, term31073.getClass(), "day", (short) 16);
        setField(term31072, term31072.getClass(), "date", term31073);
        setByteField(term31077, term31077.getClass(), "hour", (byte) 16);
        setByteField(term31077, term31077.getClass(), "minute", (byte) 43);
        setByteField(term31077, term31077.getClass(), "second", (byte) 51);
        setIntField(term31077, term31077.getClass(), "nano", 40671521);
        setField(term31072, term31072.getClass(), "time", term31077);
        setField(term31069, term31069.getClass(), "createTime", term31072);
        setField(term31069, term31069.getClass(), "name", "hqufcWbQWl");
        setField(term31069, term31069.getClass(), "link", "QTsNLbRMRj");
        setField(term31069, term31069.getClass(), "introduce", "xpyCHBkNpU");
        setIntField(term31119, term31119.getClass(), "year", 2028);
        setShortField(term31119, term31119.getClass(), "month", (short) 7);
        setShortField(term31119, term31119.getClass(), "day", (short) 13);
        setField(term31118, term31118.getClass(), "date", term31119);
        setByteField(term31123, term31123.getClass(), "hour", (byte) 9);
        setByteField(term31123, term31123.getClass(), "minute", (byte) 46);
        setByteField(term31123, term31123.getClass(), "second", (byte) 40);
        setIntField(term31123, term31123.getClass(), "nano", 919051236);
        setField(term31118, term31118.getClass(), "time", term31123);
        setField(term31069, term31069.getClass(), "updateTime", term31118);
        setField(term31069, term31069.getClass(), "meetingTime", "PyaqPUUlJN");
        setField(term31069, term31069.getClass(), "signTime", "LvnrPakeWs");
        setField(term31069, term31069.getClass(), "signNumber", term31152);
        setField(term31069, term31069.getClass(), "userNumber", term31154);
        setField(term31069, term31069.getClass(), "fileUrl", "URueWxydQv");
        setBooleanField(term31069, term31069.getClass(), "online", true);
        setField(term31069, term31069.getClass(), "deleted", term31169);
        setField(term31069, term31069.getClass(), "host", "TjjpnchLTB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nEKWQEesJO";
        callMethod(klass, "setFileUrl", argTypes, term31069, args);
    }

};


