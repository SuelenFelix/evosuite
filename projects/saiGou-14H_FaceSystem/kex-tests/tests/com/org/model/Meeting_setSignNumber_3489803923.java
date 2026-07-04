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

public class Meeting_setSignNumber_3489803923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30697;
     Object term30811;

    public Meeting_setSignNumber_3489803923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30698 = new Integer(1130655068);
        Integer term30780 = new Integer(1747437566);
        Integer term30782 = new Integer(-1175737970);
        Integer term30797 = new Integer(891165187);
        term30697 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term30700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30705 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30751 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30697, term30697.getClass(), "id", term30698);
        setIntField(term30701, term30701.getClass(), "year", 2025);
        setShortField(term30701, term30701.getClass(), "month", (short) 10);
        setShortField(term30701, term30701.getClass(), "day", (short) 12);
        setField(term30700, term30700.getClass(), "date", term30701);
        setByteField(term30705, term30705.getClass(), "hour", (byte) 0);
        setByteField(term30705, term30705.getClass(), "minute", (byte) 58);
        setByteField(term30705, term30705.getClass(), "second", (byte) 44);
        setIntField(term30705, term30705.getClass(), "nano", 42807662);
        setField(term30700, term30700.getClass(), "time", term30705);
        setField(term30697, term30697.getClass(), "createTime", term30700);
        setField(term30697, term30697.getClass(), "name", "zuNZswjwvh");
        setField(term30697, term30697.getClass(), "link", "CUwtHZSXXF");
        setField(term30697, term30697.getClass(), "introduce", "KnZpIapfph");
        setIntField(term30747, term30747.getClass(), "year", 2026);
        setShortField(term30747, term30747.getClass(), "month", (short) 3);
        setShortField(term30747, term30747.getClass(), "day", (short) 23);
        setField(term30746, term30746.getClass(), "date", term30747);
        setByteField(term30751, term30751.getClass(), "hour", (byte) 21);
        setByteField(term30751, term30751.getClass(), "minute", (byte) 25);
        setByteField(term30751, term30751.getClass(), "second", (byte) 41);
        setIntField(term30751, term30751.getClass(), "nano", 714890677);
        setField(term30746, term30746.getClass(), "time", term30751);
        setField(term30697, term30697.getClass(), "updateTime", term30746);
        setField(term30697, term30697.getClass(), "meetingTime", "OKSBlBxAMS");
        setField(term30697, term30697.getClass(), "signTime", "TVSQWqAGgr");
        setField(term30697, term30697.getClass(), "signNumber", term30780);
        setField(term30697, term30697.getClass(), "userNumber", term30782);
        setField(term30697, term30697.getClass(), "fileUrl", "wURsdnmHcS");
        setBooleanField(term30697, term30697.getClass(), "online", true);
        setField(term30697, term30697.getClass(), "deleted", term30797);
        setField(term30697, term30697.getClass(), "host", "nAOgCSwECO");
        term30811 = new Integer(1608737678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term30811;
        callMethod(klass, "setSignNumber", argTypes, term30697, args);
    }

};


