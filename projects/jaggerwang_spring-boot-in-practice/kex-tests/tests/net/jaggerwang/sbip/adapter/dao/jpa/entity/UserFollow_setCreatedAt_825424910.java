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

public class UserFollow_setCreatedAt_825424910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11785;
     Object term11812;

    public UserFollow_setCreatedAt_825424910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11786 = new Long(-1164342036939643746L);
        Long term11788 = new Long(-7013378340043571457L);
        Long term11790 = new Long(-3279534582096707294L);
        term11785 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11797 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11802 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11803 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11807 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11785, term11785.getClass(), "id", term11786);
        setField(term11785, term11785.getClass(), "followingId", term11788);
        setField(term11785, term11785.getClass(), "followerId", term11790);
        setIntField(term11793, term11793.getClass(), "year", 2015);
        setShortField(term11793, term11793.getClass(), "month", (short) 2);
        setShortField(term11793, term11793.getClass(), "day", (short) 1);
        setField(term11792, term11792.getClass(), "date", term11793);
        setByteField(term11797, term11797.getClass(), "hour", (byte) 11);
        setByteField(term11797, term11797.getClass(), "minute", (byte) 31);
        setByteField(term11797, term11797.getClass(), "second", (byte) 24);
        setIntField(term11797, term11797.getClass(), "nano", 461437823);
        setField(term11792, term11792.getClass(), "time", term11797);
        setField(term11785, term11785.getClass(), "createdAt", term11792);
        setIntField(term11803, term11803.getClass(), "year", 2012);
        setShortField(term11803, term11803.getClass(), "month", (short) 3);
        setShortField(term11803, term11803.getClass(), "day", (short) 12);
        setField(term11802, term11802.getClass(), "date", term11803);
        setByteField(term11807, term11807.getClass(), "hour", (byte) 0);
        setByteField(term11807, term11807.getClass(), "minute", (byte) 32);
        setByteField(term11807, term11807.getClass(), "second", (byte) 14);
        setIntField(term11807, term11807.getClass(), "nano", 342342345);
        setField(term11802, term11802.getClass(), "time", term11807);
        setField(term11785, term11785.getClass(), "updatedAt", term11802);
        term11812 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11813 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11817 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11813, term11813.getClass(), "year", 2026);
        setShortField(term11813, term11813.getClass(), "month", (short) 9);
        setShortField(term11813, term11813.getClass(), "day", (short) 18);
        setField(term11812, term11812.getClass(), "date", term11813);
        setByteField(term11817, term11817.getClass(), "hour", (byte) 14);
        setByteField(term11817, term11817.getClass(), "minute", (byte) 51);
        setByteField(term11817, term11817.getClass(), "second", (byte) 41);
        setIntField(term11817, term11817.getClass(), "nano", 830322169);
        setField(term11812, term11812.getClass(), "time", term11817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term11812;
        callMethod(klass, "setCreatedAt", argTypes, term11785, args);
    }

};


