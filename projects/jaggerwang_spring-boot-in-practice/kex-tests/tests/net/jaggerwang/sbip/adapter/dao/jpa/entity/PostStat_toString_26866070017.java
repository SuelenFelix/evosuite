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

public class PostStat_toString_26866070017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4065;

    public PostStat_toString_26866070017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4066 = new Long(5946780097489996391L);
        Long term4068 = new Long(-8652538484981166496L);
        Long term4070 = new Long(2701184207686293431L);
        term4065 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term4072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4077 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4082 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4083 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4087 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4065, term4065.getClass(), "id", term4066);
        setField(term4065, term4065.getClass(), "postId", term4068);
        setField(term4065, term4065.getClass(), "likeCount", term4070);
        setIntField(term4073, term4073.getClass(), "year", 2022);
        setShortField(term4073, term4073.getClass(), "month", (short) 6);
        setShortField(term4073, term4073.getClass(), "day", (short) 20);
        setField(term4072, term4072.getClass(), "date", term4073);
        setByteField(term4077, term4077.getClass(), "hour", (byte) 7);
        setByteField(term4077, term4077.getClass(), "minute", (byte) 57);
        setByteField(term4077, term4077.getClass(), "second", (byte) 37);
        setIntField(term4077, term4077.getClass(), "nano", 90374877);
        setField(term4072, term4072.getClass(), "time", term4077);
        setField(term4065, term4065.getClass(), "createdAt", term4072);
        setIntField(term4083, term4083.getClass(), "year", 2023);
        setShortField(term4083, term4083.getClass(), "month", (short) 2);
        setShortField(term4083, term4083.getClass(), "day", (short) 16);
        setField(term4082, term4082.getClass(), "date", term4083);
        setByteField(term4087, term4087.getClass(), "hour", (byte) 3);
        setByteField(term4087, term4087.getClass(), "minute", (byte) 18);
        setByteField(term4087, term4087.getClass(), "second", (byte) 56);
        setIntField(term4087, term4087.getClass(), "nano", 733017887);
        setField(term4082, term4082.getClass(), "time", term4087);
        setField(term4065, term4065.getClass(), "updatedAt", term4082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4065, args);
    }

};


