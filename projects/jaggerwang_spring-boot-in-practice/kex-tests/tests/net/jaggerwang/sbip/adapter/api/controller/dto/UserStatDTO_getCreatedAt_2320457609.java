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

public class UserStatDTO_getCreatedAt_2320457609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28394;

    public UserStatDTO_getCreatedAt_2320457609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28395 = new Long(-5876259280451647338L);
        Long term28397 = new Long(-4562564710769146498L);
        Long term28399 = new Long(-6254265799185295775L);
        Long term28401 = new Long(3831994970480278159L);
        Long term28403 = new Long(-5714578622746827780L);
        Long term28405 = new Long(8918129626022907229L);
        term28394 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28407 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28408 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28412 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28422 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28394, term28394.getClass(), "id", term28395);
        setField(term28394, term28394.getClass(), "userId", term28397);
        setField(term28394, term28394.getClass(), "postCount", term28399);
        setField(term28394, term28394.getClass(), "likeCount", term28401);
        setField(term28394, term28394.getClass(), "followingCount", term28403);
        setField(term28394, term28394.getClass(), "followerCount", term28405);
        setIntField(term28408, term28408.getClass(), "year", 2010);
        setShortField(term28408, term28408.getClass(), "month", (short) 3);
        setShortField(term28408, term28408.getClass(), "day", (short) 22);
        setField(term28407, term28407.getClass(), "date", term28408);
        setByteField(term28412, term28412.getClass(), "hour", (byte) 23);
        setByteField(term28412, term28412.getClass(), "minute", (byte) 36);
        setByteField(term28412, term28412.getClass(), "second", (byte) 22);
        setIntField(term28412, term28412.getClass(), "nano", 781575122);
        setField(term28407, term28407.getClass(), "time", term28412);
        setField(term28394, term28394.getClass(), "createdAt", term28407);
        setIntField(term28418, term28418.getClass(), "year", 2015);
        setShortField(term28418, term28418.getClass(), "month", (short) 8);
        setShortField(term28418, term28418.getClass(), "day", (short) 6);
        setField(term28417, term28417.getClass(), "date", term28418);
        setByteField(term28422, term28422.getClass(), "hour", (byte) 16);
        setByteField(term28422, term28422.getClass(), "minute", (byte) 16);
        setByteField(term28422, term28422.getClass(), "second", (byte) 21);
        setIntField(term28422, term28422.getClass(), "nano", 274900303);
        setField(term28417, term28417.getClass(), "time", term28422);
        setField(term28394, term28394.getClass(), "updatedAt", term28417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term28394, args);
    }

};


