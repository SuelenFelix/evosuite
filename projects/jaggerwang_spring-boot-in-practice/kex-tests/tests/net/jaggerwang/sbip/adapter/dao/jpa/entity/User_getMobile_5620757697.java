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

public class User_getMobile_5620757697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28281;

    public User_getMobile_5620757697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28282 = new Long(8912657350087595530L);
        Long term28332 = new Long(7440648013789140935L);
        term28281 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term28346 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28347 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28351 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28361 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28281, term28281.getClass(), "id", term28282);
        setField(term28281, term28281.getClass(), "username", "DIbeDHICho");
        setField(term28281, term28281.getClass(), "password", "dJGPlmSRnz");
        setField(term28281, term28281.getClass(), "mobile", "DPskuFUobI");
        setField(term28281, term28281.getClass(), "email", "wBGfLpNNiZ");
        setField(term28281, term28281.getClass(), "avatarId", term28332);
        setField(term28281, term28281.getClass(), "intro", "yUGCjlqgJE");
        setIntField(term28347, term28347.getClass(), "year", 2026);
        setShortField(term28347, term28347.getClass(), "month", (short) 12);
        setShortField(term28347, term28347.getClass(), "day", (short) 22);
        setField(term28346, term28346.getClass(), "date", term28347);
        setByteField(term28351, term28351.getClass(), "hour", (byte) 19);
        setByteField(term28351, term28351.getClass(), "minute", (byte) 39);
        setByteField(term28351, term28351.getClass(), "second", (byte) 23);
        setIntField(term28351, term28351.getClass(), "nano", 342247024);
        setField(term28346, term28346.getClass(), "time", term28351);
        setField(term28281, term28281.getClass(), "createdAt", term28346);
        setIntField(term28357, term28357.getClass(), "year", 2020);
        setShortField(term28357, term28357.getClass(), "month", (short) 5);
        setShortField(term28357, term28357.getClass(), "day", (short) 8);
        setField(term28356, term28356.getClass(), "date", term28357);
        setByteField(term28361, term28361.getClass(), "hour", (byte) 8);
        setByteField(term28361, term28361.getClass(), "minute", (byte) 25);
        setByteField(term28361, term28361.getClass(), "second", (byte) 28);
        setIntField(term28361, term28361.getClass(), "nano", 159788425);
        setField(term28356, term28356.getClass(), "time", term28361);
        setField(term28281, term28281.getClass(), "updatedAt", term28356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMobile", argTypes, term28281, args);
    }

};


