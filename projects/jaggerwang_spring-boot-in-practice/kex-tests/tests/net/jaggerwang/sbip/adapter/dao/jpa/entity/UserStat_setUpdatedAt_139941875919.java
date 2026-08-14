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

public class UserStat_setUpdatedAt_139941875919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32455;
     Object term32488;

    public UserStat_setUpdatedAt_139941875919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32456 = new Long(3804352102719959988L);
        Long term32458 = new Long(-5317408542996378156L);
        Long term32460 = new Long(3345606904545902400L);
        Long term32462 = new Long(-6289397283685653555L);
        Long term32464 = new Long(4270489998641176236L);
        Long term32466 = new Long(7649159120514186821L);
        term32455 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32473 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32478 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32479 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32483 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32455, term32455.getClass(), "id", term32456);
        setField(term32455, term32455.getClass(), "userId", term32458);
        setField(term32455, term32455.getClass(), "postCount", term32460);
        setField(term32455, term32455.getClass(), "likeCount", term32462);
        setField(term32455, term32455.getClass(), "followingCount", term32464);
        setField(term32455, term32455.getClass(), "followerCount", term32466);
        setIntField(term32469, term32469.getClass(), "year", 2018);
        setShortField(term32469, term32469.getClass(), "month", (short) 8);
        setShortField(term32469, term32469.getClass(), "day", (short) 2);
        setField(term32468, term32468.getClass(), "date", term32469);
        setByteField(term32473, term32473.getClass(), "hour", (byte) 20);
        setByteField(term32473, term32473.getClass(), "minute", (byte) 18);
        setByteField(term32473, term32473.getClass(), "second", (byte) 22);
        setIntField(term32473, term32473.getClass(), "nano", 639407296);
        setField(term32468, term32468.getClass(), "time", term32473);
        setField(term32455, term32455.getClass(), "createdAt", term32468);
        setIntField(term32479, term32479.getClass(), "year", 2018);
        setShortField(term32479, term32479.getClass(), "month", (short) 2);
        setShortField(term32479, term32479.getClass(), "day", (short) 15);
        setField(term32478, term32478.getClass(), "date", term32479);
        setByteField(term32483, term32483.getClass(), "hour", (byte) 16);
        setByteField(term32483, term32483.getClass(), "minute", (byte) 4);
        setByteField(term32483, term32483.getClass(), "second", (byte) 19);
        setIntField(term32483, term32483.getClass(), "nano", 538124451);
        setField(term32478, term32478.getClass(), "time", term32483);
        setField(term32455, term32455.getClass(), "updatedAt", term32478);
        term32488 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32489 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32493 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term32489, term32489.getClass(), "year", 2013);
        setShortField(term32489, term32489.getClass(), "month", (short) 10);
        setShortField(term32489, term32489.getClass(), "day", (short) 20);
        setField(term32488, term32488.getClass(), "date", term32489);
        setByteField(term32493, term32493.getClass(), "hour", (byte) 11);
        setByteField(term32493, term32493.getClass(), "minute", (byte) 17);
        setByteField(term32493, term32493.getClass(), "second", (byte) 1);
        setIntField(term32493, term32493.getClass(), "nano", 266879040);
        setField(term32488, term32488.getClass(), "time", term32493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term32488;
        callMethod(klass, "setUpdatedAt", argTypes, term32455, args);
    }

};


