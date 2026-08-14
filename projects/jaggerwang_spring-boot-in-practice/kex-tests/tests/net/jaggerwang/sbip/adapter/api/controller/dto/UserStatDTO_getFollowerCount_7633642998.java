package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserStatDTO_getFollowerCount_7633642998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28361;

    public UserStatDTO_getFollowerCount_7633642998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28362 = new Long(6542357174275680335L);
        Long term28364 = new Long(206360660645917003L);
        Long term28366 = new Long(8680715663951713735L);
        Long term28368 = new Long(-4905558793519537969L);
        Long term28370 = new Long(4354242424632479389L);
        Long term28372 = new Long(-4146453776626172590L);
        term28361 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28379 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28385 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28389 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28361, term28361.getClass(), "id", term28362);
        setField(term28361, term28361.getClass(), "userId", term28364);
        setField(term28361, term28361.getClass(), "postCount", term28366);
        setField(term28361, term28361.getClass(), "likeCount", term28368);
        setField(term28361, term28361.getClass(), "followingCount", term28370);
        setField(term28361, term28361.getClass(), "followerCount", term28372);
        setIntField(term28375, term28375.getClass(), "year", 2027);
        setShortField(term28375, term28375.getClass(), "month", (short) 5);
        setShortField(term28375, term28375.getClass(), "day", (short) 22);
        setField(term28374, term28374.getClass(), "date", term28375);
        setByteField(term28379, term28379.getClass(), "hour", (byte) 6);
        setByteField(term28379, term28379.getClass(), "minute", (byte) 8);
        setByteField(term28379, term28379.getClass(), "second", (byte) 27);
        setIntField(term28379, term28379.getClass(), "nano", 955380448);
        setField(term28374, term28374.getClass(), "time", term28379);
        setField(term28361, term28361.getClass(), "createdAt", term28374);
        setIntField(term28385, term28385.getClass(), "year", 2029);
        setShortField(term28385, term28385.getClass(), "month", (short) 1);
        setShortField(term28385, term28385.getClass(), "day", (short) 12);
        setField(term28384, term28384.getClass(), "date", term28385);
        setByteField(term28389, term28389.getClass(), "hour", (byte) 15);
        setByteField(term28389, term28389.getClass(), "minute", (byte) 27);
        setByteField(term28389, term28389.getClass(), "second", (byte) 0);
        setIntField(term28389, term28389.getClass(), "nano", 592641552);
        setField(term28384, term28384.getClass(), "time", term28389);
        setField(term28361, term28361.getClass(), "updatedAt", term28384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFollowerCount", argTypes, term28361, args);
    }

};


