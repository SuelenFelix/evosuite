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

public class UserStatDTO_setPostCount_22174214113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28530;
     Object term28563;

    public UserStatDTO_setPostCount_22174214113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28531 = new Long(5047215164896153648L);
        Long term28533 = new Long(6695041041196724237L);
        Long term28535 = new Long(-9133417318192430290L);
        Long term28537 = new Long(3447455321955655601L);
        Long term28539 = new Long(-6503611645609982617L);
        Long term28541 = new Long(-7574091101944828886L);
        term28530 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28543 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28544 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28548 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28558 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28530, term28530.getClass(), "id", term28531);
        setField(term28530, term28530.getClass(), "userId", term28533);
        setField(term28530, term28530.getClass(), "postCount", term28535);
        setField(term28530, term28530.getClass(), "likeCount", term28537);
        setField(term28530, term28530.getClass(), "followingCount", term28539);
        setField(term28530, term28530.getClass(), "followerCount", term28541);
        setIntField(term28544, term28544.getClass(), "year", 2015);
        setShortField(term28544, term28544.getClass(), "month", (short) 5);
        setShortField(term28544, term28544.getClass(), "day", (short) 14);
        setField(term28543, term28543.getClass(), "date", term28544);
        setByteField(term28548, term28548.getClass(), "hour", (byte) 13);
        setByteField(term28548, term28548.getClass(), "minute", (byte) 25);
        setByteField(term28548, term28548.getClass(), "second", (byte) 10);
        setIntField(term28548, term28548.getClass(), "nano", 246578829);
        setField(term28543, term28543.getClass(), "time", term28548);
        setField(term28530, term28530.getClass(), "createdAt", term28543);
        setIntField(term28554, term28554.getClass(), "year", 2028);
        setShortField(term28554, term28554.getClass(), "month", (short) 5);
        setShortField(term28554, term28554.getClass(), "day", (short) 23);
        setField(term28553, term28553.getClass(), "date", term28554);
        setByteField(term28558, term28558.getClass(), "hour", (byte) 6);
        setByteField(term28558, term28558.getClass(), "minute", (byte) 0);
        setByteField(term28558, term28558.getClass(), "second", (byte) 51);
        setIntField(term28558, term28558.getClass(), "nano", 258967293);
        setField(term28553, term28553.getClass(), "time", term28558);
        setField(term28530, term28530.getClass(), "updatedAt", term28553);
        term28563 = new Long(-6792339614909987294L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term28563;
        callMethod(klass, "setPostCount", argTypes, term28530, args);
    }

};


