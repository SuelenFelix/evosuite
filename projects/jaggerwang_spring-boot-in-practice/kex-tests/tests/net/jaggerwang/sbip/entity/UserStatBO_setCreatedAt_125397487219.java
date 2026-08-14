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

public class UserStatBO_setCreatedAt_125397487219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12109;
     Object term12142;

    public UserStatBO_setCreatedAt_125397487219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12110 = new Long(3452833434644634217L);
        Long term12112 = new Long(-8603648071751666348L);
        Long term12114 = new Long(0L);
        Long term12116 = new Long(0L);
        Long term12118 = new Long(0L);
        Long term12120 = new Long(0L);
        term12109 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term12122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12127 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12132 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12133 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12137 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12109, term12109.getClass(), "id", term12110);
        setField(term12109, term12109.getClass(), "userId", term12112);
        setField(term12109, term12109.getClass(), "postCount", term12114);
        setField(term12109, term12109.getClass(), "likeCount", term12116);
        setField(term12109, term12109.getClass(), "followingCount", term12118);
        setField(term12109, term12109.getClass(), "followerCount", term12120);
        setIntField(term12123, term12123.getClass(), "year", 2020);
        setShortField(term12123, term12123.getClass(), "month", (short) 12);
        setShortField(term12123, term12123.getClass(), "day", (short) 21);
        setField(term12122, term12122.getClass(), "date", term12123);
        setByteField(term12127, term12127.getClass(), "hour", (byte) 20);
        setByteField(term12127, term12127.getClass(), "minute", (byte) 16);
        setByteField(term12127, term12127.getClass(), "second", (byte) 59);
        setIntField(term12127, term12127.getClass(), "nano", 976524801);
        setField(term12122, term12122.getClass(), "time", term12127);
        setField(term12109, term12109.getClass(), "createdAt", term12122);
        setIntField(term12133, term12133.getClass(), "year", 2028);
        setShortField(term12133, term12133.getClass(), "month", (short) 5);
        setShortField(term12133, term12133.getClass(), "day", (short) 15);
        setField(term12132, term12132.getClass(), "date", term12133);
        setByteField(term12137, term12137.getClass(), "hour", (byte) 20);
        setByteField(term12137, term12137.getClass(), "minute", (byte) 31);
        setByteField(term12137, term12137.getClass(), "second", (byte) 49);
        setIntField(term12137, term12137.getClass(), "nano", 945744862);
        setField(term12132, term12132.getClass(), "time", term12137);
        setField(term12109, term12109.getClass(), "updatedAt", term12132);
        term12142 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12143 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12147 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12143, term12143.getClass(), "year", 2016);
        setShortField(term12143, term12143.getClass(), "month", (short) 6);
        setShortField(term12143, term12143.getClass(), "day", (short) 23);
        setField(term12142, term12142.getClass(), "date", term12143);
        setByteField(term12147, term12147.getClass(), "hour", (byte) 20);
        setByteField(term12147, term12147.getClass(), "minute", (byte) 51);
        setByteField(term12147, term12147.getClass(), "second", (byte) 43);
        setIntField(term12147, term12147.getClass(), "nano", 284389409);
        setField(term12142, term12142.getClass(), "time", term12147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term12142;
        callMethod(klass, "setCreatedAt", argTypes, term12109, args);
    }

};


