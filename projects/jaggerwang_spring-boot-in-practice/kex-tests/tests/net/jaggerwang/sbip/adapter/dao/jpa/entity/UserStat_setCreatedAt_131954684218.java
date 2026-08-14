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

public class UserStat_setCreatedAt_131954684218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32412;
     Object term32445;

    public UserStat_setCreatedAt_131954684218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32413 = new Long(1342629750107593698L);
        Long term32415 = new Long(-2050224942342343039L);
        Long term32417 = new Long(-2456427474561523240L);
        Long term32419 = new Long(-7010338441819086776L);
        Long term32421 = new Long(1881020230556705937L);
        Long term32423 = new Long(-2937192447508714837L);
        term32412 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32425 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32426 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32430 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32440 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32412, term32412.getClass(), "id", term32413);
        setField(term32412, term32412.getClass(), "userId", term32415);
        setField(term32412, term32412.getClass(), "postCount", term32417);
        setField(term32412, term32412.getClass(), "likeCount", term32419);
        setField(term32412, term32412.getClass(), "followingCount", term32421);
        setField(term32412, term32412.getClass(), "followerCount", term32423);
        setIntField(term32426, term32426.getClass(), "year", 2012);
        setShortField(term32426, term32426.getClass(), "month", (short) 5);
        setShortField(term32426, term32426.getClass(), "day", (short) 9);
        setField(term32425, term32425.getClass(), "date", term32426);
        setByteField(term32430, term32430.getClass(), "hour", (byte) 4);
        setByteField(term32430, term32430.getClass(), "minute", (byte) 24);
        setByteField(term32430, term32430.getClass(), "second", (byte) 51);
        setIntField(term32430, term32430.getClass(), "nano", 768693356);
        setField(term32425, term32425.getClass(), "time", term32430);
        setField(term32412, term32412.getClass(), "createdAt", term32425);
        setIntField(term32436, term32436.getClass(), "year", 2026);
        setShortField(term32436, term32436.getClass(), "month", (short) 3);
        setShortField(term32436, term32436.getClass(), "day", (short) 10);
        setField(term32435, term32435.getClass(), "date", term32436);
        setByteField(term32440, term32440.getClass(), "hour", (byte) 20);
        setByteField(term32440, term32440.getClass(), "minute", (byte) 16);
        setByteField(term32440, term32440.getClass(), "second", (byte) 6);
        setIntField(term32440, term32440.getClass(), "nano", 559277183);
        setField(term32435, term32435.getClass(), "time", term32440);
        setField(term32412, term32412.getClass(), "updatedAt", term32435);
        term32445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32450 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term32446, term32446.getClass(), "year", 2027);
        setShortField(term32446, term32446.getClass(), "month", (short) 1);
        setShortField(term32446, term32446.getClass(), "day", (short) 12);
        setField(term32445, term32445.getClass(), "date", term32446);
        setByteField(term32450, term32450.getClass(), "hour", (byte) 12);
        setByteField(term32450, term32450.getClass(), "minute", (byte) 12);
        setByteField(term32450, term32450.getClass(), "second", (byte) 21);
        setIntField(term32450, term32450.getClass(), "nano", 77791222);
        setField(term32445, term32445.getClass(), "time", term32450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term32445;
        callMethod(klass, "setCreatedAt", argTypes, term32412, args);
    }

};


