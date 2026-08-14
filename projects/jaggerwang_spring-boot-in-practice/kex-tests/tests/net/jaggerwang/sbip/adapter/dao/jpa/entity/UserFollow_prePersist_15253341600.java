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

public class UserFollow_prePersist_15253341600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11536;

    public UserFollow_prePersist_15253341600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11537 = new Long(-1497280900081695731L);
        Long term11539 = new Long(-3602825674339018793L);
        Long term11541 = new Long(3086974592680165932L);
        term11536 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11543 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11544 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11548 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11558 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11536, term11536.getClass(), "id", term11537);
        setField(term11536, term11536.getClass(), "followingId", term11539);
        setField(term11536, term11536.getClass(), "followerId", term11541);
        setIntField(term11544, term11544.getClass(), "year", 2012);
        setShortField(term11544, term11544.getClass(), "month", (short) 5);
        setShortField(term11544, term11544.getClass(), "day", (short) 25);
        setField(term11543, term11543.getClass(), "date", term11544);
        setByteField(term11548, term11548.getClass(), "hour", (byte) 5);
        setByteField(term11548, term11548.getClass(), "minute", (byte) 8);
        setByteField(term11548, term11548.getClass(), "second", (byte) 47);
        setIntField(term11548, term11548.getClass(), "nano", 455554221);
        setField(term11543, term11543.getClass(), "time", term11548);
        setField(term11536, term11536.getClass(), "createdAt", term11543);
        setIntField(term11554, term11554.getClass(), "year", 2029);
        setShortField(term11554, term11554.getClass(), "month", (short) 11);
        setShortField(term11554, term11554.getClass(), "day", (short) 18);
        setField(term11553, term11553.getClass(), "date", term11554);
        setByteField(term11558, term11558.getClass(), "hour", (byte) 5);
        setByteField(term11558, term11558.getClass(), "minute", (byte) 36);
        setByteField(term11558, term11558.getClass(), "second", (byte) 57);
        setIntField(term11558, term11558.getClass(), "nano", 394167804);
        setField(term11553, term11553.getClass(), "time", term11558);
        setField(term11536, term11536.getClass(), "updatedAt", term11553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prePersist", argTypes, term11536, args);
    }

};


