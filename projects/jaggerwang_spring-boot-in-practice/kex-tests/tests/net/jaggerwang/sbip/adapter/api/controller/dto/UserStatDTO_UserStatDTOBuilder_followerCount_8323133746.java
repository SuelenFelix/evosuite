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

public class UserStatDTO_UserStatDTOBuilder_followerCount_8323133746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58097;
     Object term58130;

    public UserStatDTO_UserStatDTOBuilder_followerCount_8323133746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58098 = new Long(-1493241070032348830L);
        Long term58100 = new Long(-2261267969370273698L);
        Long term58102 = new Long(-6265268170103538784L);
        Long term58104 = new Long(-6478060368064484690L);
        Long term58106 = new Long(2358294751965878279L);
        Long term58108 = new Long(8600922426578985605L);
        term58097 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder"));
        Object term58110 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58111 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58115 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58125 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58097, term58097.getClass(), "id", term58098);
        setField(term58097, term58097.getClass(), "userId", term58100);
        setField(term58097, term58097.getClass(), "postCount", term58102);
        setField(term58097, term58097.getClass(), "likeCount", term58104);
        setField(term58097, term58097.getClass(), "followingCount", term58106);
        setField(term58097, term58097.getClass(), "followerCount", term58108);
        setIntField(term58111, term58111.getClass(), "year", 2010);
        setShortField(term58111, term58111.getClass(), "month", (short) 5);
        setShortField(term58111, term58111.getClass(), "day", (short) 27);
        setField(term58110, term58110.getClass(), "date", term58111);
        setByteField(term58115, term58115.getClass(), "hour", (byte) 20);
        setByteField(term58115, term58115.getClass(), "minute", (byte) 55);
        setByteField(term58115, term58115.getClass(), "second", (byte) 13);
        setIntField(term58115, term58115.getClass(), "nano", 375773979);
        setField(term58110, term58110.getClass(), "time", term58115);
        setField(term58097, term58097.getClass(), "createdAt", term58110);
        setIntField(term58121, term58121.getClass(), "year", 2023);
        setShortField(term58121, term58121.getClass(), "month", (short) 5);
        setShortField(term58121, term58121.getClass(), "day", (short) 21);
        setField(term58120, term58120.getClass(), "date", term58121);
        setByteField(term58125, term58125.getClass(), "hour", (byte) 7);
        setByteField(term58125, term58125.getClass(), "minute", (byte) 54);
        setByteField(term58125, term58125.getClass(), "second", (byte) 55);
        setIntField(term58125, term58125.getClass(), "nano", 241590130);
        setField(term58120, term58120.getClass(), "time", term58125);
        setField(term58097, term58097.getClass(), "updatedAt", term58120);
        term58130 = new Long(-3701629604936783176L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term58130;
        callMethod(klass, "followerCount", argTypes, term58097, args);
    }

};


