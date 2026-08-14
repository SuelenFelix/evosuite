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

public class UserStatDTO_fromBO_8733122270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28130;

    public UserStatDTO_fromBO_8733122270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28131 = new Long(-1365372122034008688L);
        Long term28133 = new Long(-6108006981756732593L);
        Long term28135 = new Long(0L);
        Long term28137 = new Long(0L);
        Long term28139 = new Long(0L);
        Long term28141 = new Long(0L);
        term28130 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term28143 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28144 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28148 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28158 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28130, term28130.getClass(), "id", term28131);
        setField(term28130, term28130.getClass(), "userId", term28133);
        setField(term28130, term28130.getClass(), "postCount", term28135);
        setField(term28130, term28130.getClass(), "likeCount", term28137);
        setField(term28130, term28130.getClass(), "followingCount", term28139);
        setField(term28130, term28130.getClass(), "followerCount", term28141);
        setIntField(term28144, term28144.getClass(), "year", 2017);
        setShortField(term28144, term28144.getClass(), "month", (short) 2);
        setShortField(term28144, term28144.getClass(), "day", (short) 5);
        setField(term28143, term28143.getClass(), "date", term28144);
        setByteField(term28148, term28148.getClass(), "hour", (byte) 5);
        setByteField(term28148, term28148.getClass(), "minute", (byte) 46);
        setByteField(term28148, term28148.getClass(), "second", (byte) 38);
        setIntField(term28148, term28148.getClass(), "nano", 214202896);
        setField(term28143, term28143.getClass(), "time", term28148);
        setField(term28130, term28130.getClass(), "createdAt", term28143);
        setIntField(term28154, term28154.getClass(), "year", 2025);
        setShortField(term28154, term28154.getClass(), "month", (short) 6);
        setShortField(term28154, term28154.getClass(), "day", (short) 18);
        setField(term28153, term28153.getClass(), "date", term28154);
        setByteField(term28158, term28158.getClass(), "hour", (byte) 14);
        setByteField(term28158, term28158.getClass(), "minute", (byte) 17);
        setByteField(term28158, term28158.getClass(), "second", (byte) 34);
        setIntField(term28158, term28158.getClass(), "nano", 564527758);
        setField(term28153, term28153.getClass(), "time", term28158);
        setField(term28130, term28130.getClass(), "updatedAt", term28153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Object[] args = new Object[1];
        args[0] = term28130;
        callMethod(klass, "fromBO", argTypes, null, args);
    }

};


