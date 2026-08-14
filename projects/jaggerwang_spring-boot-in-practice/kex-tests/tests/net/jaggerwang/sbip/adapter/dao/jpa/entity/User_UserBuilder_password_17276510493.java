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

public class User_UserBuilder_password_17276510493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12305;

    public User_UserBuilder_password_17276510493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12306 = new Long(-1571034605670661708L);
        Long term12356 = new Long(-7983954942068142191L);
        term12305 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder"));
        Object term12370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12375 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12385 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12305, term12305.getClass(), "id", term12306);
        setField(term12305, term12305.getClass(), "username", "idgaQsnJpQ");
        setField(term12305, term12305.getClass(), "password", "VgZnGoIFwQ");
        setField(term12305, term12305.getClass(), "mobile", "jUbSRrkrYZ");
        setField(term12305, term12305.getClass(), "email", "bWWfajKbEX");
        setField(term12305, term12305.getClass(), "avatarId", term12356);
        setField(term12305, term12305.getClass(), "intro", "cAPeiZHKGJ");
        setIntField(term12371, term12371.getClass(), "year", 2020);
        setShortField(term12371, term12371.getClass(), "month", (short) 2);
        setShortField(term12371, term12371.getClass(), "day", (short) 1);
        setField(term12370, term12370.getClass(), "date", term12371);
        setByteField(term12375, term12375.getClass(), "hour", (byte) 0);
        setByteField(term12375, term12375.getClass(), "minute", (byte) 46);
        setByteField(term12375, term12375.getClass(), "second", (byte) 1);
        setIntField(term12375, term12375.getClass(), "nano", 544722812);
        setField(term12370, term12370.getClass(), "time", term12375);
        setField(term12305, term12305.getClass(), "createdAt", term12370);
        setIntField(term12381, term12381.getClass(), "year", 2027);
        setShortField(term12381, term12381.getClass(), "month", (short) 8);
        setShortField(term12381, term12381.getClass(), "day", (short) 16);
        setField(term12380, term12380.getClass(), "date", term12381);
        setByteField(term12385, term12385.getClass(), "hour", (byte) 15);
        setByteField(term12385, term12385.getClass(), "minute", (byte) 1);
        setByteField(term12385, term12385.getClass(), "second", (byte) 18);
        setIntField(term12385, term12385.getClass(), "nano", 245350825);
        setField(term12380, term12380.getClass(), "time", term12385);
        setField(term12305, term12305.getClass(), "updatedAt", term12380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvJFtLBaxj";
        callMethod(klass, "password", argTypes, term12305, args);
    }

};


