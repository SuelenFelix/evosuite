package net.jaggerwang.sbip.adapter.dao;

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
import static net.jaggerwang.sbip.adapter.dao.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserStatDaoImpl_save_3076501010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33073;

    public UserStatDaoImpl_save_3076501010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33074 = new Long(6427987239762071453L);
        Long term33076 = new Long(9216691136820489449L);
        Long term33078 = new Long(0L);
        Long term33080 = new Long(0L);
        Long term33082 = new Long(0L);
        Long term33084 = new Long(0L);
        term33073 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term33086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33091 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33101 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term33073, term33073.getClass(), "id", term33074);
        setField(term33073, term33073.getClass(), "userId", term33076);
        setField(term33073, term33073.getClass(), "postCount", term33078);
        setField(term33073, term33073.getClass(), "likeCount", term33080);
        setField(term33073, term33073.getClass(), "followingCount", term33082);
        setField(term33073, term33073.getClass(), "followerCount", term33084);
        setIntField(term33087, term33087.getClass(), "year", 2014);
        setShortField(term33087, term33087.getClass(), "month", (short) 11);
        setShortField(term33087, term33087.getClass(), "day", (short) 16);
        setField(term33086, term33086.getClass(), "date", term33087);
        setByteField(term33091, term33091.getClass(), "hour", (byte) 22);
        setByteField(term33091, term33091.getClass(), "minute", (byte) 31);
        setByteField(term33091, term33091.getClass(), "second", (byte) 12);
        setIntField(term33091, term33091.getClass(), "nano", 196022579);
        setField(term33086, term33086.getClass(), "time", term33091);
        setField(term33073, term33073.getClass(), "createdAt", term33086);
        setIntField(term33097, term33097.getClass(), "year", 2020);
        setShortField(term33097, term33097.getClass(), "month", (short) 4);
        setShortField(term33097, term33097.getClass(), "day", (short) 19);
        setField(term33096, term33096.getClass(), "date", term33097);
        setByteField(term33101, term33101.getClass(), "hour", (byte) 5);
        setByteField(term33101, term33101.getClass(), "minute", (byte) 30);
        setByteField(term33101, term33101.getClass(), "second", (byte) 22);
        setIntField(term33101, term33101.getClass(), "nano", 839145960);
        setField(term33096, term33096.getClass(), "time", term33101);
        setField(term33073, term33073.getClass(), "updatedAt", term33096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.UserStatDaoImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Object[] args = new Object[1];
        args[0] = term33073;
        callMethod(klass, "save", argTypes, null, args);
    }

};


