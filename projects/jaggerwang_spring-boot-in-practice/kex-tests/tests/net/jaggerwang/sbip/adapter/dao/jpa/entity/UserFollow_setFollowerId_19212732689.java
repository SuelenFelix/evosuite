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

public class UserFollow_setFollowerId_19212732689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11756;
     Object term11783;

    public UserFollow_setFollowerId_19212732689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11757 = new Long(-8398381579707958144L);
        Long term11759 = new Long(-2195061939206930224L);
        Long term11761 = new Long(4525924047960478347L);
        term11756 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11768 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11773 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11778 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11756, term11756.getClass(), "id", term11757);
        setField(term11756, term11756.getClass(), "followingId", term11759);
        setField(term11756, term11756.getClass(), "followerId", term11761);
        setIntField(term11764, term11764.getClass(), "year", 2018);
        setShortField(term11764, term11764.getClass(), "month", (short) 9);
        setShortField(term11764, term11764.getClass(), "day", (short) 3);
        setField(term11763, term11763.getClass(), "date", term11764);
        setByteField(term11768, term11768.getClass(), "hour", (byte) 16);
        setByteField(term11768, term11768.getClass(), "minute", (byte) 48);
        setByteField(term11768, term11768.getClass(), "second", (byte) 45);
        setIntField(term11768, term11768.getClass(), "nano", 919694917);
        setField(term11763, term11763.getClass(), "time", term11768);
        setField(term11756, term11756.getClass(), "createdAt", term11763);
        setIntField(term11774, term11774.getClass(), "year", 2021);
        setShortField(term11774, term11774.getClass(), "month", (short) 8);
        setShortField(term11774, term11774.getClass(), "day", (short) 23);
        setField(term11773, term11773.getClass(), "date", term11774);
        setByteField(term11778, term11778.getClass(), "hour", (byte) 15);
        setByteField(term11778, term11778.getClass(), "minute", (byte) 43);
        setByteField(term11778, term11778.getClass(), "second", (byte) 10);
        setIntField(term11778, term11778.getClass(), "nano", 893504165);
        setField(term11773, term11773.getClass(), "time", term11778);
        setField(term11756, term11756.getClass(), "updatedAt", term11773);
        term11783 = new Long(-3225860270104198596L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term11783;
        callMethod(klass, "setFollowerId", argTypes, term11756, args);
    }

};


