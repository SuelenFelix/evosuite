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

public class Meeting_setLink_104498107218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29679;

    public Meeting_setLink_104498107218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29680 = new Integer(1414603242);
        Integer term29762 = new Integer(18596324);
        Integer term29764 = new Integer(907968883);
        Integer term29779 = new Integer(-1191329679);
        term29679 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term29682 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29683 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29687 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29728 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29729 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29733 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29679, term29679.getClass(), "id", term29680);
        setIntField(term29683, term29683.getClass(), "year", 2011);
        setShortField(term29683, term29683.getClass(), "month", (short) 7);
        setShortField(term29683, term29683.getClass(), "day", (short) 19);
        setField(term29682, term29682.getClass(), "date", term29683);
        setByteField(term29687, term29687.getClass(), "hour", (byte) 13);
        setByteField(term29687, term29687.getClass(), "minute", (byte) 52);
        setByteField(term29687, term29687.getClass(), "second", (byte) 13);
        setIntField(term29687, term29687.getClass(), "nano", 952032021);
        setField(term29682, term29682.getClass(), "time", term29687);
        setField(term29679, term29679.getClass(), "createTime", term29682);
        setField(term29679, term29679.getClass(), "name", "IsEKnDPoFO");
        setField(term29679, term29679.getClass(), "link", "LwUrUwnvds");
        setField(term29679, term29679.getClass(), "introduce", "sRQPBAZKAb");
        setIntField(term29729, term29729.getClass(), "year", 2015);
        setShortField(term29729, term29729.getClass(), "month", (short) 6);
        setShortField(term29729, term29729.getClass(), "day", (short) 29);
        setField(term29728, term29728.getClass(), "date", term29729);
        setByteField(term29733, term29733.getClass(), "hour", (byte) 15);
        setByteField(term29733, term29733.getClass(), "minute", (byte) 4);
        setByteField(term29733, term29733.getClass(), "second", (byte) 16);
        setIntField(term29733, term29733.getClass(), "nano", 322383816);
        setField(term29728, term29728.getClass(), "time", term29733);
        setField(term29679, term29679.getClass(), "updateTime", term29728);
        setField(term29679, term29679.getClass(), "meetingTime", "KgmTgRsDwa");
        setField(term29679, term29679.getClass(), "signTime", "tjdFdntraI");
        setField(term29679, term29679.getClass(), "signNumber", term29762);
        setField(term29679, term29679.getClass(), "userNumber", term29764);
        setField(term29679, term29679.getClass(), "fileUrl", "PWTZROlgso");
        setBooleanField(term29679, term29679.getClass(), "online", true);
        setField(term29679, term29679.getClass(), "deleted", term29779);
        setField(term29679, term29679.getClass(), "host", "FTKNQGShBg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "irfiORDZdO";
        callMethod(klass, "setLink", argTypes, term29679, args);
    }

};


