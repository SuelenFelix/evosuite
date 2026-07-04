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

public class MeetingVO_setHost_67171647717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9929;

    public MeetingVO_setHost_67171647717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9930 = new Integer(464181937);
        Integer term9968 = new Integer(-1455526612);
        Integer term10028 = new Integer(-941356098);
        Integer term10040 = new Integer(-201517446);
        Integer term10042 = new Integer(-97742366);
        term9929 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term9970 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9971 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9975 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10030 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10031 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10035 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9929, term9929.getClass(), "id", term9930);
        setField(term9929, term9929.getClass(), "name", "hFvoVHxToy");
        setField(term9929, term9929.getClass(), "host", "ZybsWgYCUR");
        setField(term9929, term9929.getClass(), "roomName", "YZNLZnNFNI");
        setField(term9929, term9929.getClass(), "online", term9968);
        setIntField(term9971, term9971.getClass(), "year", 2013);
        setShortField(term9971, term9971.getClass(), "month", (short) 5);
        setShortField(term9971, term9971.getClass(), "day", (short) 26);
        setField(term9970, term9970.getClass(), "date", term9971);
        setByteField(term9975, term9975.getClass(), "hour", (byte) 4);
        setByteField(term9975, term9975.getClass(), "minute", (byte) 39);
        setByteField(term9975, term9975.getClass(), "second", (byte) 5);
        setIntField(term9975, term9975.getClass(), "nano", 392869354);
        setField(term9970, term9970.getClass(), "time", term9975);
        setField(term9929, term9929.getClass(), "createTime", term9970);
        setField(term9929, term9929.getClass(), "link", "uHcUlIseio");
        setField(term9929, term9929.getClass(), "meetingTime", "bsmWXOcLZJ");
        setField(term9929, term9929.getClass(), "signTime", "ltTwdndtbe");
        setField(term9929, term9929.getClass(), "introduce", "XaldiIeyMi");
        setField(term9929, term9929.getClass(), "state", term10028);
        setIntField(term10031, term10031.getClass(), "year", 2012);
        setShortField(term10031, term10031.getClass(), "month", (short) 4);
        setShortField(term10031, term10031.getClass(), "day", (short) 25);
        setField(term10030, term10030.getClass(), "date", term10031);
        setByteField(term10035, term10035.getClass(), "hour", (byte) 21);
        setByteField(term10035, term10035.getClass(), "minute", (byte) 14);
        setByteField(term10035, term10035.getClass(), "second", (byte) 15);
        setIntField(term10035, term10035.getClass(), "nano", 561700934);
        setField(term10030, term10030.getClass(), "time", term10035);
        setField(term9929, term9929.getClass(), "updateTime", term10030);
        setField(term9929, term9929.getClass(), "userNumber", term10040);
        setField(term9929, term9929.getClass(), "signNumber", term10042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lkujDCFpdm";
        callMethod(klass, "setHost", argTypes, term9929, args);
    }

};


