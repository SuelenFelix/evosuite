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

public class UserStat_UserStatBuilder_createdAt_11511826137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4346;
     Object term4379;

    public UserStat_UserStatBuilder_createdAt_11511826137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4347 = new Long(148047808219672941L);
        Long term4349 = new Long(7489064039921396098L);
        Long term4351 = new Long(6843866297465638866L);
        Long term4353 = new Long(-4023935540989049732L);
        Long term4355 = new Long(855932984568615096L);
        Long term4357 = new Long(-1616722610139554082L);
        term4346 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder"));
        Object term4359 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4360 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4364 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4369 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4370 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4374 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4346, term4346.getClass(), "id", term4347);
        setField(term4346, term4346.getClass(), "userId", term4349);
        setField(term4346, term4346.getClass(), "postCount", term4351);
        setField(term4346, term4346.getClass(), "likeCount", term4353);
        setField(term4346, term4346.getClass(), "followingCount", term4355);
        setField(term4346, term4346.getClass(), "followerCount", term4357);
        setIntField(term4360, term4360.getClass(), "year", 2022);
        setShortField(term4360, term4360.getClass(), "month", (short) 11);
        setShortField(term4360, term4360.getClass(), "day", (short) 10);
        setField(term4359, term4359.getClass(), "date", term4360);
        setByteField(term4364, term4364.getClass(), "hour", (byte) 20);
        setByteField(term4364, term4364.getClass(), "minute", (byte) 8);
        setByteField(term4364, term4364.getClass(), "second", (byte) 35);
        setIntField(term4364, term4364.getClass(), "nano", 658416570);
        setField(term4359, term4359.getClass(), "time", term4364);
        setField(term4346, term4346.getClass(), "createdAt", term4359);
        setIntField(term4370, term4370.getClass(), "year", 2018);
        setShortField(term4370, term4370.getClass(), "month", (short) 11);
        setShortField(term4370, term4370.getClass(), "day", (short) 9);
        setField(term4369, term4369.getClass(), "date", term4370);
        setByteField(term4374, term4374.getClass(), "hour", (byte) 6);
        setByteField(term4374, term4374.getClass(), "minute", (byte) 8);
        setByteField(term4374, term4374.getClass(), "second", (byte) 32);
        setIntField(term4374, term4374.getClass(), "nano", 750733310);
        setField(term4369, term4369.getClass(), "time", term4374);
        setField(term4346, term4346.getClass(), "updatedAt", term4369);
        term4379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4384 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4380, term4380.getClass(), "year", 2010);
        setShortField(term4380, term4380.getClass(), "month", (short) 2);
        setShortField(term4380, term4380.getClass(), "day", (short) 24);
        setField(term4379, term4379.getClass(), "date", term4380);
        setByteField(term4384, term4384.getClass(), "hour", (byte) 17);
        setByteField(term4384, term4384.getClass(), "minute", (byte) 58);
        setByteField(term4384, term4384.getClass(), "second", (byte) 56);
        setIntField(term4384, term4384.getClass(), "nano", 291725532);
        setField(term4379, term4379.getClass(), "time", term4384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term4379;
        callMethod(klass, "createdAt", argTypes, term4346, args);
    }

};


