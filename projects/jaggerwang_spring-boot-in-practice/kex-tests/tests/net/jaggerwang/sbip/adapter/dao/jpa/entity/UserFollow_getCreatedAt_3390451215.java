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

public class UserFollow_getCreatedAt_3390451215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11644;

    public UserFollow_getCreatedAt_3390451215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11645 = new Long(6465987664600701876L);
        Long term11647 = new Long(-136372844051852955L);
        Long term11649 = new Long(-7632759764262745126L);
        term11644 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11666 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11644, term11644.getClass(), "id", term11645);
        setField(term11644, term11644.getClass(), "followingId", term11647);
        setField(term11644, term11644.getClass(), "followerId", term11649);
        setIntField(term11652, term11652.getClass(), "year", 2029);
        setShortField(term11652, term11652.getClass(), "month", (short) 5);
        setShortField(term11652, term11652.getClass(), "day", (short) 11);
        setField(term11651, term11651.getClass(), "date", term11652);
        setByteField(term11656, term11656.getClass(), "hour", (byte) 20);
        setByteField(term11656, term11656.getClass(), "minute", (byte) 17);
        setByteField(term11656, term11656.getClass(), "second", (byte) 32);
        setIntField(term11656, term11656.getClass(), "nano", 327503582);
        setField(term11651, term11651.getClass(), "time", term11656);
        setField(term11644, term11644.getClass(), "createdAt", term11651);
        setIntField(term11662, term11662.getClass(), "year", 2012);
        setShortField(term11662, term11662.getClass(), "month", (short) 10);
        setShortField(term11662, term11662.getClass(), "day", (short) 1);
        setField(term11661, term11661.getClass(), "date", term11662);
        setByteField(term11666, term11666.getClass(), "hour", (byte) 9);
        setByteField(term11666, term11666.getClass(), "minute", (byte) 27);
        setByteField(term11666, term11666.getClass(), "second", (byte) 33);
        setIntField(term11666, term11666.getClass(), "nano", 714912000);
        setField(term11661, term11661.getClass(), "time", term11666);
        setField(term11644, term11644.getClass(), "updatedAt", term11661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term11644, args);
    }

};


