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

public class PostLike_PostLikeBuilder_createdAt_13047544114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22893;
     Object term22920;

    public PostLike_PostLikeBuilder_createdAt_13047544114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22894 = new Long(6545086285386938562L);
        Long term22896 = new Long(3951346165629352117L);
        Long term22898 = new Long(-4187265590402169996L);
        term22893 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder"));
        Object term22900 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22901 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22905 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22910 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22911 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22915 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22893, term22893.getClass(), "id", term22894);
        setField(term22893, term22893.getClass(), "userId", term22896);
        setField(term22893, term22893.getClass(), "postId", term22898);
        setIntField(term22901, term22901.getClass(), "year", 2020);
        setShortField(term22901, term22901.getClass(), "month", (short) 4);
        setShortField(term22901, term22901.getClass(), "day", (short) 16);
        setField(term22900, term22900.getClass(), "date", term22901);
        setByteField(term22905, term22905.getClass(), "hour", (byte) 7);
        setByteField(term22905, term22905.getClass(), "minute", (byte) 46);
        setByteField(term22905, term22905.getClass(), "second", (byte) 47);
        setIntField(term22905, term22905.getClass(), "nano", 687690824);
        setField(term22900, term22900.getClass(), "time", term22905);
        setField(term22893, term22893.getClass(), "createdAt", term22900);
        setIntField(term22911, term22911.getClass(), "year", 2010);
        setShortField(term22911, term22911.getClass(), "month", (short) 7);
        setShortField(term22911, term22911.getClass(), "day", (short) 15);
        setField(term22910, term22910.getClass(), "date", term22911);
        setByteField(term22915, term22915.getClass(), "hour", (byte) 11);
        setByteField(term22915, term22915.getClass(), "minute", (byte) 28);
        setByteField(term22915, term22915.getClass(), "second", (byte) 5);
        setIntField(term22915, term22915.getClass(), "nano", 471613968);
        setField(term22910, term22910.getClass(), "time", term22915);
        setField(term22893, term22893.getClass(), "updatedAt", term22910);
        term22920 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22921 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22925 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22921, term22921.getClass(), "year", 2018);
        setShortField(term22921, term22921.getClass(), "month", (short) 12);
        setShortField(term22921, term22921.getClass(), "day", (short) 17);
        setField(term22920, term22920.getClass(), "date", term22921);
        setByteField(term22925, term22925.getClass(), "hour", (byte) 2);
        setByteField(term22925, term22925.getClass(), "minute", (byte) 8);
        setByteField(term22925, term22925.getClass(), "second", (byte) 33);
        setIntField(term22925, term22925.getClass(), "nano", 799805513);
        setField(term22920, term22920.getClass(), "time", term22925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term22920;
        callMethod(klass, "createdAt", argTypes, term22893, args);
    }

};


