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

public class UserStat_prePersist_14418320452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31905;

    public UserStat_prePersist_14418320452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31906 = new Long(-1721083210597101555L);
        Long term31908 = new Long(937792282597213200L);
        Long term31910 = new Long(-6096027338784768449L);
        Long term31912 = new Long(6338971839666144092L);
        Long term31914 = new Long(5295517562699482299L);
        Long term31916 = new Long(-7671399023433976259L);
        term31905 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term31918 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31923 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31933 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31905, term31905.getClass(), "id", term31906);
        setField(term31905, term31905.getClass(), "userId", term31908);
        setField(term31905, term31905.getClass(), "postCount", term31910);
        setField(term31905, term31905.getClass(), "likeCount", term31912);
        setField(term31905, term31905.getClass(), "followingCount", term31914);
        setField(term31905, term31905.getClass(), "followerCount", term31916);
        setIntField(term31919, term31919.getClass(), "year", 2029);
        setShortField(term31919, term31919.getClass(), "month", (short) 6);
        setShortField(term31919, term31919.getClass(), "day", (short) 25);
        setField(term31918, term31918.getClass(), "date", term31919);
        setByteField(term31923, term31923.getClass(), "hour", (byte) 14);
        setByteField(term31923, term31923.getClass(), "minute", (byte) 19);
        setByteField(term31923, term31923.getClass(), "second", (byte) 52);
        setIntField(term31923, term31923.getClass(), "nano", 250367769);
        setField(term31918, term31918.getClass(), "time", term31923);
        setField(term31905, term31905.getClass(), "createdAt", term31918);
        setIntField(term31929, term31929.getClass(), "year", 2011);
        setShortField(term31929, term31929.getClass(), "month", (short) 11);
        setShortField(term31929, term31929.getClass(), "day", (short) 24);
        setField(term31928, term31928.getClass(), "date", term31929);
        setByteField(term31933, term31933.getClass(), "hour", (byte) 5);
        setByteField(term31933, term31933.getClass(), "minute", (byte) 45);
        setByteField(term31933, term31933.getClass(), "second", (byte) 11);
        setIntField(term31933, term31933.getClass(), "nano", 438339982);
        setField(term31928, term31928.getClass(), "time", term31933);
        setField(term31905, term31905.getClass(), "updatedAt", term31928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prePersist", argTypes, term31905, args);
    }

};


