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

public class PostStat_setCreatedAt_34389208112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3908;
     Object term3935;

    public PostStat_setCreatedAt_34389208112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3909 = new Long(305759998609888272L);
        Long term3911 = new Long(-8654565919063661957L);
        Long term3913 = new Long(-5248475803419977214L);
        term3908 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term3915 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3916 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3920 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3925 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3926 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3930 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3908, term3908.getClass(), "id", term3909);
        setField(term3908, term3908.getClass(), "postId", term3911);
        setField(term3908, term3908.getClass(), "likeCount", term3913);
        setIntField(term3916, term3916.getClass(), "year", 2020);
        setShortField(term3916, term3916.getClass(), "month", (short) 5);
        setShortField(term3916, term3916.getClass(), "day", (short) 18);
        setField(term3915, term3915.getClass(), "date", term3916);
        setByteField(term3920, term3920.getClass(), "hour", (byte) 5);
        setByteField(term3920, term3920.getClass(), "minute", (byte) 46);
        setByteField(term3920, term3920.getClass(), "second", (byte) 13);
        setIntField(term3920, term3920.getClass(), "nano", 45893173);
        setField(term3915, term3915.getClass(), "time", term3920);
        setField(term3908, term3908.getClass(), "createdAt", term3915);
        setIntField(term3926, term3926.getClass(), "year", 2017);
        setShortField(term3926, term3926.getClass(), "month", (short) 4);
        setShortField(term3926, term3926.getClass(), "day", (short) 3);
        setField(term3925, term3925.getClass(), "date", term3926);
        setByteField(term3930, term3930.getClass(), "hour", (byte) 6);
        setByteField(term3930, term3930.getClass(), "minute", (byte) 51);
        setByteField(term3930, term3930.getClass(), "second", (byte) 10);
        setIntField(term3930, term3930.getClass(), "nano", 316377166);
        setField(term3925, term3925.getClass(), "time", term3930);
        setField(term3908, term3908.getClass(), "updatedAt", term3925);
        term3935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3940 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3936, term3936.getClass(), "year", 2027);
        setShortField(term3936, term3936.getClass(), "month", (short) 8);
        setShortField(term3936, term3936.getClass(), "day", (short) 23);
        setField(term3935, term3935.getClass(), "date", term3936);
        setByteField(term3940, term3940.getClass(), "hour", (byte) 15);
        setByteField(term3940, term3940.getClass(), "minute", (byte) 12);
        setByteField(term3940, term3940.getClass(), "second", (byte) 6);
        setIntField(term3940, term3940.getClass(), "nano", 541218258);
        setField(term3935, term3935.getClass(), "time", term3940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term3935;
        callMethod(klass, "setCreatedAt", argTypes, term3908, args);
    }

};


