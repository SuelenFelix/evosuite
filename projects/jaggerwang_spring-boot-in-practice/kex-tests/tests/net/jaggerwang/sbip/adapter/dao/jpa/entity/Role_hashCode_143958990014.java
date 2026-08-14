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

public class Role_hashCode_143958990014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23979;

    public Role_hashCode_143958990014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23980 = new Long(-4029227951294167228L);
        term23979 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term23994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23999 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24004 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24005 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24009 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23979, term23979.getClass(), "id", term23980);
        setField(term23979, term23979.getClass(), "name", "qYzsiuXOgS");
        setIntField(term23995, term23995.getClass(), "year", 2012);
        setShortField(term23995, term23995.getClass(), "month", (short) 11);
        setShortField(term23995, term23995.getClass(), "day", (short) 23);
        setField(term23994, term23994.getClass(), "date", term23995);
        setByteField(term23999, term23999.getClass(), "hour", (byte) 21);
        setByteField(term23999, term23999.getClass(), "minute", (byte) 45);
        setByteField(term23999, term23999.getClass(), "second", (byte) 46);
        setIntField(term23999, term23999.getClass(), "nano", 484678696);
        setField(term23994, term23994.getClass(), "time", term23999);
        setField(term23979, term23979.getClass(), "createdAt", term23994);
        setIntField(term24005, term24005.getClass(), "year", 2027);
        setShortField(term24005, term24005.getClass(), "month", (short) 12);
        setShortField(term24005, term24005.getClass(), "day", (short) 25);
        setField(term24004, term24004.getClass(), "date", term24005);
        setByteField(term24009, term24009.getClass(), "hour", (byte) 8);
        setByteField(term24009, term24009.getClass(), "minute", (byte) 19);
        setByteField(term24009, term24009.getClass(), "second", (byte) 20);
        setIntField(term24009, term24009.getClass(), "nano", 127700185);
        setField(term24004, term24004.getClass(), "time", term24009);
        setField(term23979, term23979.getClass(), "updatedAt", term24004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term23979, args);
    }

};


