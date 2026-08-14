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

public class UserStat_UserStatBuilder_toString_212264851310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4465;

    public UserStat_UserStatBuilder_toString_212264851310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4466 = new Long(5381386339318883012L);
        Long term4468 = new Long(-1333707622307134180L);
        Long term4470 = new Long(-4360569253593381888L);
        Long term4472 = new Long(1457594663983990440L);
        Long term4474 = new Long(3452833434644634217L);
        Long term4476 = new Long(-8603648071751666348L);
        term4465 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder"));
        Object term4478 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4479 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4483 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4488 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4489 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4493 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4465, term4465.getClass(), "id", term4466);
        setField(term4465, term4465.getClass(), "userId", term4468);
        setField(term4465, term4465.getClass(), "postCount", term4470);
        setField(term4465, term4465.getClass(), "likeCount", term4472);
        setField(term4465, term4465.getClass(), "followingCount", term4474);
        setField(term4465, term4465.getClass(), "followerCount", term4476);
        setIntField(term4479, term4479.getClass(), "year", 2011);
        setShortField(term4479, term4479.getClass(), "month", (short) 4);
        setShortField(term4479, term4479.getClass(), "day", (short) 19);
        setField(term4478, term4478.getClass(), "date", term4479);
        setByteField(term4483, term4483.getClass(), "hour", (byte) 12);
        setByteField(term4483, term4483.getClass(), "minute", (byte) 0);
        setByteField(term4483, term4483.getClass(), "second", (byte) 14);
        setIntField(term4483, term4483.getClass(), "nano", 849079063);
        setField(term4478, term4478.getClass(), "time", term4483);
        setField(term4465, term4465.getClass(), "createdAt", term4478);
        setIntField(term4489, term4489.getClass(), "year", 2014);
        setShortField(term4489, term4489.getClass(), "month", (short) 8);
        setShortField(term4489, term4489.getClass(), "day", (short) 17);
        setField(term4488, term4488.getClass(), "date", term4489);
        setByteField(term4493, term4493.getClass(), "hour", (byte) 19);
        setByteField(term4493, term4493.getClass(), "minute", (byte) 32);
        setByteField(term4493, term4493.getClass(), "second", (byte) 5);
        setIntField(term4493, term4493.getClass(), "nano", 604713831);
        setField(term4488, term4488.getClass(), "time", term4493);
        setField(term4465, term4465.getClass(), "updatedAt", term4488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4465, args);
    }

};


