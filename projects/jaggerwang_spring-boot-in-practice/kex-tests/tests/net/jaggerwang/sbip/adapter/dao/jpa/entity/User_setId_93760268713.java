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

public class User_setId_93760268713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29091;
     Object term29176;

    public User_setId_93760268713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29092 = new Long(7717843551775677202L);
        Long term29142 = new Long(2823262561274956150L);
        term29091 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term29156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29161 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29171 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29091, term29091.getClass(), "id", term29092);
        setField(term29091, term29091.getClass(), "username", "pumvwBWvpy");
        setField(term29091, term29091.getClass(), "password", "HwLHeGLyhe");
        setField(term29091, term29091.getClass(), "mobile", "RDnkgWkcbz");
        setField(term29091, term29091.getClass(), "email", "IBpaxltauX");
        setField(term29091, term29091.getClass(), "avatarId", term29142);
        setField(term29091, term29091.getClass(), "intro", "hePqROaplw");
        setIntField(term29157, term29157.getClass(), "year", 2020);
        setShortField(term29157, term29157.getClass(), "month", (short) 5);
        setShortField(term29157, term29157.getClass(), "day", (short) 25);
        setField(term29156, term29156.getClass(), "date", term29157);
        setByteField(term29161, term29161.getClass(), "hour", (byte) 4);
        setByteField(term29161, term29161.getClass(), "minute", (byte) 20);
        setByteField(term29161, term29161.getClass(), "second", (byte) 39);
        setIntField(term29161, term29161.getClass(), "nano", 382102366);
        setField(term29156, term29156.getClass(), "time", term29161);
        setField(term29091, term29091.getClass(), "createdAt", term29156);
        setIntField(term29167, term29167.getClass(), "year", 2023);
        setShortField(term29167, term29167.getClass(), "month", (short) 3);
        setShortField(term29167, term29167.getClass(), "day", (short) 4);
        setField(term29166, term29166.getClass(), "date", term29167);
        setByteField(term29171, term29171.getClass(), "hour", (byte) 20);
        setByteField(term29171, term29171.getClass(), "minute", (byte) 17);
        setByteField(term29171, term29171.getClass(), "second", (byte) 33);
        setIntField(term29171, term29171.getClass(), "nano", 193707533);
        setField(term29166, term29166.getClass(), "time", term29171);
        setField(term29091, term29091.getClass(), "updatedAt", term29166);
        term29176 = new Long(8039153062846287600L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term29176;
        callMethod(klass, "setId", argTypes, term29091, args);
    }

};


