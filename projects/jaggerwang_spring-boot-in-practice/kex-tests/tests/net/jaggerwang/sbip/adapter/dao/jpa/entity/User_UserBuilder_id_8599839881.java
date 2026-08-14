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

public class User_UserBuilder_id_8599839881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12011;
     Object term12096;

    public User_UserBuilder_id_8599839881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12012 = new Long(-629491722907628764L);
        Long term12062 = new Long(-5552123402871285352L);
        term12011 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder"));
        Object term12076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12081 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12091 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12011, term12011.getClass(), "id", term12012);
        setField(term12011, term12011.getClass(), "username", "bLPjGVBhlX");
        setField(term12011, term12011.getClass(), "password", "whBvTVIIlC");
        setField(term12011, term12011.getClass(), "mobile", "IgRJUzaCwW");
        setField(term12011, term12011.getClass(), "email", "JUmudUmaaV");
        setField(term12011, term12011.getClass(), "avatarId", term12062);
        setField(term12011, term12011.getClass(), "intro", "KoyGrUJeJW");
        setIntField(term12077, term12077.getClass(), "year", 2023);
        setShortField(term12077, term12077.getClass(), "month", (short) 8);
        setShortField(term12077, term12077.getClass(), "day", (short) 21);
        setField(term12076, term12076.getClass(), "date", term12077);
        setByteField(term12081, term12081.getClass(), "hour", (byte) 10);
        setByteField(term12081, term12081.getClass(), "minute", (byte) 36);
        setByteField(term12081, term12081.getClass(), "second", (byte) 15);
        setIntField(term12081, term12081.getClass(), "nano", 257070204);
        setField(term12076, term12076.getClass(), "time", term12081);
        setField(term12011, term12011.getClass(), "createdAt", term12076);
        setIntField(term12087, term12087.getClass(), "year", 2012);
        setShortField(term12087, term12087.getClass(), "month", (short) 12);
        setShortField(term12087, term12087.getClass(), "day", (short) 14);
        setField(term12086, term12086.getClass(), "date", term12087);
        setByteField(term12091, term12091.getClass(), "hour", (byte) 1);
        setByteField(term12091, term12091.getClass(), "minute", (byte) 47);
        setByteField(term12091, term12091.getClass(), "second", (byte) 3);
        setIntField(term12091, term12091.getClass(), "nano", 359751066);
        setField(term12086, term12086.getClass(), "time", term12091);
        setField(term12011, term12011.getClass(), "updatedAt", term12086);
        term12096 = new Long(-5587528177305224828L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12096;
        callMethod(klass, "id", argTypes, term12011, args);
    }

};


