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

public class Meeting_setUpdateTime_74787209620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30091;
     Object term30205;

    public Meeting_setUpdateTime_74787209620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30092 = new Integer(1492044959);
        Integer term30174 = new Integer(260483962);
        Integer term30176 = new Integer(1115251191);
        Integer term30191 = new Integer(1882224203);
        term30091 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term30094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30099 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30140 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30141 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30145 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30091, term30091.getClass(), "id", term30092);
        setIntField(term30095, term30095.getClass(), "year", 2017);
        setShortField(term30095, term30095.getClass(), "month", (short) 8);
        setShortField(term30095, term30095.getClass(), "day", (short) 15);
        setField(term30094, term30094.getClass(), "date", term30095);
        setByteField(term30099, term30099.getClass(), "hour", (byte) 7);
        setByteField(term30099, term30099.getClass(), "minute", (byte) 47);
        setByteField(term30099, term30099.getClass(), "second", (byte) 20);
        setIntField(term30099, term30099.getClass(), "nano", 749374038);
        setField(term30094, term30094.getClass(), "time", term30099);
        setField(term30091, term30091.getClass(), "createTime", term30094);
        setField(term30091, term30091.getClass(), "name", "UhsCkTQBvy");
        setField(term30091, term30091.getClass(), "link", "mwGthpwVPQ");
        setField(term30091, term30091.getClass(), "introduce", "OhRjLPjyEH");
        setIntField(term30141, term30141.getClass(), "year", 2026);
        setShortField(term30141, term30141.getClass(), "month", (short) 12);
        setShortField(term30141, term30141.getClass(), "day", (short) 13);
        setField(term30140, term30140.getClass(), "date", term30141);
        setByteField(term30145, term30145.getClass(), "hour", (byte) 12);
        setByteField(term30145, term30145.getClass(), "minute", (byte) 7);
        setByteField(term30145, term30145.getClass(), "second", (byte) 52);
        setIntField(term30145, term30145.getClass(), "nano", 158332280);
        setField(term30140, term30140.getClass(), "time", term30145);
        setField(term30091, term30091.getClass(), "updateTime", term30140);
        setField(term30091, term30091.getClass(), "meetingTime", "zjAqVIsnia");
        setField(term30091, term30091.getClass(), "signTime", "GiSvHqhwDV");
        setField(term30091, term30091.getClass(), "signNumber", term30174);
        setField(term30091, term30091.getClass(), "userNumber", term30176);
        setField(term30091, term30091.getClass(), "fileUrl", "pxJvqfUzir");
        setBooleanField(term30091, term30091.getClass(), "online", false);
        setField(term30091, term30091.getClass(), "deleted", term30191);
        setField(term30091, term30091.getClass(), "host", "WOUxkSgzno");
        term30205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30210 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30206, term30206.getClass(), "year", 2022);
        setShortField(term30206, term30206.getClass(), "month", (short) 4);
        setShortField(term30206, term30206.getClass(), "day", (short) 28);
        setField(term30205, term30205.getClass(), "date", term30206);
        setByteField(term30210, term30210.getClass(), "hour", (byte) 5);
        setByteField(term30210, term30210.getClass(), "minute", (byte) 17);
        setByteField(term30210, term30210.getClass(), "second", (byte) 39);
        setIntField(term30210, term30210.getClass(), "nano", 883798425);
        setField(term30205, term30205.getClass(), "time", term30210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term30205;
        callMethod(klass, "setUpdateTime", argTypes, term30091, args);
    }

};


