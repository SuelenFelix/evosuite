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

public class PostLike_PostLikeBuilder_updatedAt_12248824945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22930;
     Object term22957;

    public PostLike_PostLikeBuilder_updatedAt_12248824945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22931 = new Long(-8033044954947064558L);
        Long term22933 = new Long(4626639872957534248L);
        Long term22935 = new Long(-7062466217011408314L);
        term22930 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder"));
        Object term22937 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22938 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22942 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22952 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22930, term22930.getClass(), "id", term22931);
        setField(term22930, term22930.getClass(), "userId", term22933);
        setField(term22930, term22930.getClass(), "postId", term22935);
        setIntField(term22938, term22938.getClass(), "year", 2015);
        setShortField(term22938, term22938.getClass(), "month", (short) 12);
        setShortField(term22938, term22938.getClass(), "day", (short) 18);
        setField(term22937, term22937.getClass(), "date", term22938);
        setByteField(term22942, term22942.getClass(), "hour", (byte) 21);
        setByteField(term22942, term22942.getClass(), "minute", (byte) 45);
        setByteField(term22942, term22942.getClass(), "second", (byte) 43);
        setIntField(term22942, term22942.getClass(), "nano", 629261984);
        setField(term22937, term22937.getClass(), "time", term22942);
        setField(term22930, term22930.getClass(), "createdAt", term22937);
        setIntField(term22948, term22948.getClass(), "year", 2015);
        setShortField(term22948, term22948.getClass(), "month", (short) 5);
        setShortField(term22948, term22948.getClass(), "day", (short) 14);
        setField(term22947, term22947.getClass(), "date", term22948);
        setByteField(term22952, term22952.getClass(), "hour", (byte) 13);
        setByteField(term22952, term22952.getClass(), "minute", (byte) 25);
        setByteField(term22952, term22952.getClass(), "second", (byte) 10);
        setIntField(term22952, term22952.getClass(), "nano", 246578829);
        setField(term22947, term22947.getClass(), "time", term22952);
        setField(term22930, term22930.getClass(), "updatedAt", term22947);
        term22957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22962 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22958, term22958.getClass(), "year", 2028);
        setShortField(term22958, term22958.getClass(), "month", (short) 5);
        setShortField(term22958, term22958.getClass(), "day", (short) 23);
        setField(term22957, term22957.getClass(), "date", term22958);
        setByteField(term22962, term22962.getClass(), "hour", (byte) 6);
        setByteField(term22962, term22962.getClass(), "minute", (byte) 0);
        setByteField(term22962, term22962.getClass(), "second", (byte) 51);
        setIntField(term22962, term22962.getClass(), "nano", 258967293);
        setField(term22957, term22957.getClass(), "time", term22962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term22957;
        callMethod(klass, "updatedAt", argTypes, term22930, args);
    }

};


