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

public class Meeting_getUpdateTime_11953973446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27437;

    public Meeting_getUpdateTime_11953973446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27438 = new Integer(634968709);
        Integer term27520 = new Integer(681482688);
        Integer term27522 = new Integer(-1435288604);
        Integer term27537 = new Integer(364335952);
        term27437 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term27440 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27441 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27445 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27491 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27437, term27437.getClass(), "id", term27438);
        setIntField(term27441, term27441.getClass(), "year", 2022);
        setShortField(term27441, term27441.getClass(), "month", (short) 11);
        setShortField(term27441, term27441.getClass(), "day", (short) 16);
        setField(term27440, term27440.getClass(), "date", term27441);
        setByteField(term27445, term27445.getClass(), "hour", (byte) 12);
        setByteField(term27445, term27445.getClass(), "minute", (byte) 41);
        setByteField(term27445, term27445.getClass(), "second", (byte) 8);
        setIntField(term27445, term27445.getClass(), "nano", 873900846);
        setField(term27440, term27440.getClass(), "time", term27445);
        setField(term27437, term27437.getClass(), "createTime", term27440);
        setField(term27437, term27437.getClass(), "name", "JvStduaHMS");
        setField(term27437, term27437.getClass(), "link", "zJwrZrBJEV");
        setField(term27437, term27437.getClass(), "introduce", "VZVBTcOgtj");
        setIntField(term27487, term27487.getClass(), "year", 2016);
        setShortField(term27487, term27487.getClass(), "month", (short) 8);
        setShortField(term27487, term27487.getClass(), "day", (short) 9);
        setField(term27486, term27486.getClass(), "date", term27487);
        setByteField(term27491, term27491.getClass(), "hour", (byte) 11);
        setByteField(term27491, term27491.getClass(), "minute", (byte) 35);
        setByteField(term27491, term27491.getClass(), "second", (byte) 27);
        setIntField(term27491, term27491.getClass(), "nano", 440006638);
        setField(term27486, term27486.getClass(), "time", term27491);
        setField(term27437, term27437.getClass(), "updateTime", term27486);
        setField(term27437, term27437.getClass(), "meetingTime", "NxwtNEqZwc");
        setField(term27437, term27437.getClass(), "signTime", "scXUGbWVgO");
        setField(term27437, term27437.getClass(), "signNumber", term27520);
        setField(term27437, term27437.getClass(), "userNumber", term27522);
        setField(term27437, term27437.getClass(), "fileUrl", "vZnHzZGaqo");
        setBooleanField(term27437, term27437.getClass(), "online", false);
        setField(term27437, term27437.getClass(), "deleted", term27537);
        setField(term27437, term27437.getClass(), "host", "DLxHFGRtHg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateTime", argTypes, term27437, args);
    }

};


