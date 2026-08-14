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

public class UserStatBO_setFollowingCount_2527147217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12039;
     Object term12072;

    public UserStatBO_setFollowingCount_2527147217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12040 = new Long(-4598158870068953328L);
        Long term12042 = new Long(138235087558060686L);
        Long term12044 = new Long(0L);
        Long term12046 = new Long(0L);
        Long term12048 = new Long(0L);
        Long term12050 = new Long(0L);
        term12039 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term12052 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12053 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12057 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12062 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12063 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12067 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12039, term12039.getClass(), "id", term12040);
        setField(term12039, term12039.getClass(), "userId", term12042);
        setField(term12039, term12039.getClass(), "postCount", term12044);
        setField(term12039, term12039.getClass(), "likeCount", term12046);
        setField(term12039, term12039.getClass(), "followingCount", term12048);
        setField(term12039, term12039.getClass(), "followerCount", term12050);
        setIntField(term12053, term12053.getClass(), "year", 2013);
        setShortField(term12053, term12053.getClass(), "month", (short) 5);
        setShortField(term12053, term12053.getClass(), "day", (short) 9);
        setField(term12052, term12052.getClass(), "date", term12053);
        setByteField(term12057, term12057.getClass(), "hour", (byte) 4);
        setByteField(term12057, term12057.getClass(), "minute", (byte) 18);
        setByteField(term12057, term12057.getClass(), "second", (byte) 35);
        setIntField(term12057, term12057.getClass(), "nano", 909079395);
        setField(term12052, term12052.getClass(), "time", term12057);
        setField(term12039, term12039.getClass(), "createdAt", term12052);
        setIntField(term12063, term12063.getClass(), "year", 2015);
        setShortField(term12063, term12063.getClass(), "month", (short) 3);
        setShortField(term12063, term12063.getClass(), "day", (short) 15);
        setField(term12062, term12062.getClass(), "date", term12063);
        setByteField(term12067, term12067.getClass(), "hour", (byte) 8);
        setByteField(term12067, term12067.getClass(), "minute", (byte) 45);
        setByteField(term12067, term12067.getClass(), "second", (byte) 29);
        setIntField(term12067, term12067.getClass(), "nano", 781486470);
        setField(term12062, term12062.getClass(), "time", term12067);
        setField(term12039, term12039.getClass(), "updatedAt", term12062);
        term12072 = new Long(5381386339318883012L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12072;
        callMethod(klass, "setFollowingCount", argTypes, term12039, args);
    }

};


