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

public class UserStatBO_canEqual_10291865922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12229;
     Object term12262;

    public UserStatBO_canEqual_10291865922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12230 = new Long(4100236067313034103L);
        Long term12232 = new Long(1195529027276497124L);
        Long term12234 = new Long(0L);
        Long term12236 = new Long(0L);
        Long term12238 = new Long(0L);
        Long term12240 = new Long(0L);
        term12229 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term12242 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12243 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12247 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12252 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12253 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12257 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12229, term12229.getClass(), "id", term12230);
        setField(term12229, term12229.getClass(), "userId", term12232);
        setField(term12229, term12229.getClass(), "postCount", term12234);
        setField(term12229, term12229.getClass(), "likeCount", term12236);
        setField(term12229, term12229.getClass(), "followingCount", term12238);
        setField(term12229, term12229.getClass(), "followerCount", term12240);
        setIntField(term12243, term12243.getClass(), "year", 2013);
        setShortField(term12243, term12243.getClass(), "month", (short) 11);
        setShortField(term12243, term12243.getClass(), "day", (short) 19);
        setField(term12242, term12242.getClass(), "date", term12243);
        setByteField(term12247, term12247.getClass(), "hour", (byte) 6);
        setByteField(term12247, term12247.getClass(), "minute", (byte) 45);
        setByteField(term12247, term12247.getClass(), "second", (byte) 10);
        setIntField(term12247, term12247.getClass(), "nano", 288981190);
        setField(term12242, term12242.getClass(), "time", term12247);
        setField(term12229, term12229.getClass(), "createdAt", term12242);
        setIntField(term12253, term12253.getClass(), "year", 2025);
        setShortField(term12253, term12253.getClass(), "month", (short) 9);
        setShortField(term12253, term12253.getClass(), "day", (short) 18);
        setField(term12252, term12252.getClass(), "date", term12253);
        setByteField(term12257, term12257.getClass(), "hour", (byte) 16);
        setByteField(term12257, term12257.getClass(), "minute", (byte) 1);
        setByteField(term12257, term12257.getClass(), "second", (byte) 23);
        setIntField(term12257, term12257.getClass(), "nano", 178285726);
        setField(term12252, term12252.getClass(), "time", term12257);
        setField(term12229, term12229.getClass(), "updatedAt", term12252);
        term12262 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12262;
        callMethod(klass, "canEqual", argTypes, term12229, args);
    }

};


