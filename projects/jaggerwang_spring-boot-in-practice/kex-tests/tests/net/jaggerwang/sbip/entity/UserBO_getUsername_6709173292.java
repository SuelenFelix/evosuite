package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserBO_getUsername_6709173292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25047;

    public UserBO_getUsername_6709173292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25048 = new Long(-4994148485124075625L);
        Long term25098 = new Long(-8842842172497711872L);
        term25047 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term25112 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25113 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25117 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25127 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25047, term25047.getClass(), "id", term25048);
        setField(term25047, term25047.getClass(), "username", "zcorEihhLK");
        setField(term25047, term25047.getClass(), "password", "GrqozDKFOk");
        setField(term25047, term25047.getClass(), "mobile", "CFyoseFGLF");
        setField(term25047, term25047.getClass(), "email", "SFqCrhEWLm");
        setField(term25047, term25047.getClass(), "avatarId", term25098);
        setField(term25047, term25047.getClass(), "intro", "GZdcJyZntS");
        setIntField(term25113, term25113.getClass(), "year", 2019);
        setShortField(term25113, term25113.getClass(), "month", (short) 5);
        setShortField(term25113, term25113.getClass(), "day", (short) 16);
        setField(term25112, term25112.getClass(), "date", term25113);
        setByteField(term25117, term25117.getClass(), "hour", (byte) 3);
        setByteField(term25117, term25117.getClass(), "minute", (byte) 12);
        setByteField(term25117, term25117.getClass(), "second", (byte) 27);
        setIntField(term25117, term25117.getClass(), "nano", 775737832);
        setField(term25112, term25112.getClass(), "time", term25117);
        setField(term25047, term25047.getClass(), "createdAt", term25112);
        setIntField(term25123, term25123.getClass(), "year", 2016);
        setShortField(term25123, term25123.getClass(), "month", (short) 12);
        setShortField(term25123, term25123.getClass(), "day", (short) 2);
        setField(term25122, term25122.getClass(), "date", term25123);
        setByteField(term25127, term25127.getClass(), "hour", (byte) 7);
        setByteField(term25127, term25127.getClass(), "minute", (byte) 38);
        setByteField(term25127, term25127.getClass(), "second", (byte) 49);
        setIntField(term25127, term25127.getClass(), "nano", 415044053);
        setField(term25122, term25122.getClass(), "time", term25127);
        setField(term25047, term25047.getClass(), "updatedAt", term25122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term25047, args);
    }

};


