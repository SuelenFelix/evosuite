package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class MeetingVO_setSignNumber_186041346228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12122;
     Object term12237;

    public MeetingVO_setSignNumber_186041346228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12123 = new Integer(-15712667);
        Integer term12161 = new Integer(1964967720);
        Integer term12221 = new Integer(1351900243);
        Integer term12233 = new Integer(-330897705);
        Integer term12235 = new Integer(1065595802);
        term12122 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term12163 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12168 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12228 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12122, term12122.getClass(), "id", term12123);
        setField(term12122, term12122.getClass(), "name", "OuyHNwADel");
        setField(term12122, term12122.getClass(), "host", "shazlRAQrB");
        setField(term12122, term12122.getClass(), "roomName", "PNJdNWkxgW");
        setField(term12122, term12122.getClass(), "online", term12161);
        setIntField(term12164, term12164.getClass(), "year", 2026);
        setShortField(term12164, term12164.getClass(), "month", (short) 10);
        setShortField(term12164, term12164.getClass(), "day", (short) 31);
        setField(term12163, term12163.getClass(), "date", term12164);
        setByteField(term12168, term12168.getClass(), "hour", (byte) 17);
        setByteField(term12168, term12168.getClass(), "minute", (byte) 6);
        setByteField(term12168, term12168.getClass(), "second", (byte) 30);
        setIntField(term12168, term12168.getClass(), "nano", 785931660);
        setField(term12163, term12163.getClass(), "time", term12168);
        setField(term12122, term12122.getClass(), "createTime", term12163);
        setField(term12122, term12122.getClass(), "link", "aCTJvzQZSQ");
        setField(term12122, term12122.getClass(), "meetingTime", "hcvedmWnmW");
        setField(term12122, term12122.getClass(), "signTime", "rBZaHWidIS");
        setField(term12122, term12122.getClass(), "introduce", "xneQCADwGB");
        setField(term12122, term12122.getClass(), "state", term12221);
        setIntField(term12224, term12224.getClass(), "year", 2022);
        setShortField(term12224, term12224.getClass(), "month", (short) 11);
        setShortField(term12224, term12224.getClass(), "day", (short) 10);
        setField(term12223, term12223.getClass(), "date", term12224);
        setByteField(term12228, term12228.getClass(), "hour", (byte) 20);
        setByteField(term12228, term12228.getClass(), "minute", (byte) 8);
        setByteField(term12228, term12228.getClass(), "second", (byte) 35);
        setIntField(term12228, term12228.getClass(), "nano", 658416570);
        setField(term12223, term12223.getClass(), "time", term12228);
        setField(term12122, term12122.getClass(), "updateTime", term12223);
        setField(term12122, term12122.getClass(), "userNumber", term12233);
        setField(term12122, term12122.getClass(), "signNumber", term12235);
        term12237 = new Integer(21031843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term12237;
        callMethod(klass, "setSignNumber", argTypes, term12122, args);
    }

};


