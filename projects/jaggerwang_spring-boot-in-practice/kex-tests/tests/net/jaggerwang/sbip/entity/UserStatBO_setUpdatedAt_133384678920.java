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

public class UserStatBO_setUpdatedAt_133384678920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12152;
     Object term12185;

    public UserStatBO_setUpdatedAt_133384678920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12153 = new Long(-7884871963229073324L);
        Long term12155 = new Long(-8649738738252714180L);
        Long term12157 = new Long(0L);
        Long term12159 = new Long(0L);
        Long term12161 = new Long(0L);
        Long term12163 = new Long(0L);
        term12152 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term12165 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12166 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12170 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12175 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12176 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12180 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12152, term12152.getClass(), "id", term12153);
        setField(term12152, term12152.getClass(), "userId", term12155);
        setField(term12152, term12152.getClass(), "postCount", term12157);
        setField(term12152, term12152.getClass(), "likeCount", term12159);
        setField(term12152, term12152.getClass(), "followingCount", term12161);
        setField(term12152, term12152.getClass(), "followerCount", term12163);
        setIntField(term12166, term12166.getClass(), "year", 2014);
        setShortField(term12166, term12166.getClass(), "month", (short) 10);
        setShortField(term12166, term12166.getClass(), "day", (short) 7);
        setField(term12165, term12165.getClass(), "date", term12166);
        setByteField(term12170, term12170.getClass(), "hour", (byte) 12);
        setByteField(term12170, term12170.getClass(), "minute", (byte) 59);
        setByteField(term12170, term12170.getClass(), "second", (byte) 39);
        setIntField(term12170, term12170.getClass(), "nano", 603709306);
        setField(term12165, term12165.getClass(), "time", term12170);
        setField(term12152, term12152.getClass(), "createdAt", term12165);
        setIntField(term12176, term12176.getClass(), "year", 2019);
        setShortField(term12176, term12176.getClass(), "month", (short) 8);
        setShortField(term12176, term12176.getClass(), "day", (short) 12);
        setField(term12175, term12175.getClass(), "date", term12176);
        setByteField(term12180, term12180.getClass(), "hour", (byte) 14);
        setByteField(term12180, term12180.getClass(), "minute", (byte) 1);
        setByteField(term12180, term12180.getClass(), "second", (byte) 51);
        setIntField(term12180, term12180.getClass(), "nano", 499021786);
        setField(term12175, term12175.getClass(), "time", term12180);
        setField(term12152, term12152.getClass(), "updatedAt", term12175);
        term12185 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12186 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12190 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12186, term12186.getClass(), "year", 2014);
        setShortField(term12186, term12186.getClass(), "month", (short) 7);
        setShortField(term12186, term12186.getClass(), "day", (short) 22);
        setField(term12185, term12185.getClass(), "date", term12186);
        setByteField(term12190, term12190.getClass(), "hour", (byte) 9);
        setByteField(term12190, term12190.getClass(), "minute", (byte) 40);
        setByteField(term12190, term12190.getClass(), "second", (byte) 34);
        setIntField(term12190, term12190.getClass(), "nano", 463008257);
        setField(term12185, term12185.getClass(), "time", term12190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term12185;
        callMethod(klass, "setUpdatedAt", argTypes, term12152, args);
    }

};


