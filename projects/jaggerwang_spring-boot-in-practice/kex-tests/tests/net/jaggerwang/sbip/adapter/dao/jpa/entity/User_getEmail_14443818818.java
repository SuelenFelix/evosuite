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

public class User_getEmail_14443818818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28416;

    public User_getEmail_14443818818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28417 = new Long(-7488291606536854368L);
        Long term28467 = new Long(-6664891356964396236L);
        term28416 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term28481 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28482 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28486 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28496 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28416, term28416.getClass(), "id", term28417);
        setField(term28416, term28416.getClass(), "username", "PXdVZyoJyC");
        setField(term28416, term28416.getClass(), "password", "vLerpqavFM");
        setField(term28416, term28416.getClass(), "mobile", "qnvxzwuGKX");
        setField(term28416, term28416.getClass(), "email", "EdPAvpluZg");
        setField(term28416, term28416.getClass(), "avatarId", term28467);
        setField(term28416, term28416.getClass(), "intro", "DzHVBMqWtE");
        setIntField(term28482, term28482.getClass(), "year", 2017);
        setShortField(term28482, term28482.getClass(), "month", (short) 11);
        setShortField(term28482, term28482.getClass(), "day", (short) 17);
        setField(term28481, term28481.getClass(), "date", term28482);
        setByteField(term28486, term28486.getClass(), "hour", (byte) 8);
        setByteField(term28486, term28486.getClass(), "minute", (byte) 54);
        setByteField(term28486, term28486.getClass(), "second", (byte) 50);
        setIntField(term28486, term28486.getClass(), "nano", 819857135);
        setField(term28481, term28481.getClass(), "time", term28486);
        setField(term28416, term28416.getClass(), "createdAt", term28481);
        setIntField(term28492, term28492.getClass(), "year", 2020);
        setShortField(term28492, term28492.getClass(), "month", (short) 2);
        setShortField(term28492, term28492.getClass(), "day", (short) 27);
        setField(term28491, term28491.getClass(), "date", term28492);
        setByteField(term28496, term28496.getClass(), "hour", (byte) 21);
        setByteField(term28496, term28496.getClass(), "minute", (byte) 35);
        setByteField(term28496, term28496.getClass(), "second", (byte) 42);
        setIntField(term28496, term28496.getClass(), "nano", 887239335);
        setField(term28491, term28491.getClass(), "time", term28496);
        setField(term28416, term28416.getClass(), "updatedAt", term28491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term28416, args);
    }

};


