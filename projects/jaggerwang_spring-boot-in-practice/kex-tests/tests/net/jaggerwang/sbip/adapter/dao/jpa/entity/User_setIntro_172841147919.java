package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_setIntro_172841147919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29993;

    public User_setIntro_172841147919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29994 = new Long(-4703513086610650698L);
        Long term30044 = new Long(-8123300791906968552L);
        term29993 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term30058 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30059 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30063 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30068 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30069 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30073 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29993, term29993.getClass(), "id", term29994);
        setField(term29993, term29993.getClass(), "username", "GNEmuHPNcU");
        setField(term29993, term29993.getClass(), "password", "IoSfuKDFRe");
        setField(term29993, term29993.getClass(), "mobile", "AWYyZiNfsm");
        setField(term29993, term29993.getClass(), "email", "ITRRYiuDwH");
        setField(term29993, term29993.getClass(), "avatarId", term30044);
        setField(term29993, term29993.getClass(), "intro", "llRfwANcVF");
        setIntField(term30059, term30059.getClass(), "year", 2016);
        setShortField(term30059, term30059.getClass(), "month", (short) 12);
        setShortField(term30059, term30059.getClass(), "day", (short) 3);
        setField(term30058, term30058.getClass(), "date", term30059);
        setByteField(term30063, term30063.getClass(), "hour", (byte) 8);
        setByteField(term30063, term30063.getClass(), "minute", (byte) 59);
        setByteField(term30063, term30063.getClass(), "second", (byte) 39);
        setIntField(term30063, term30063.getClass(), "nano", 208911877);
        setField(term30058, term30058.getClass(), "time", term30063);
        setField(term29993, term29993.getClass(), "createdAt", term30058);
        setIntField(term30069, term30069.getClass(), "year", 2023);
        setShortField(term30069, term30069.getClass(), "month", (short) 6);
        setShortField(term30069, term30069.getClass(), "day", (short) 5);
        setField(term30068, term30068.getClass(), "date", term30069);
        setByteField(term30073, term30073.getClass(), "hour", (byte) 22);
        setByteField(term30073, term30073.getClass(), "minute", (byte) 22);
        setByteField(term30073, term30073.getClass(), "second", (byte) 4);
        setIntField(term30073, term30073.getClass(), "nano", 656087896);
        setField(term30068, term30068.getClass(), "time", term30073);
        setField(term29993, term29993.getClass(), "updatedAt", term30068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sUEeHQTWkA";
        callMethod(klass, "setIntro", argTypes, term29993, args);
    }

};


