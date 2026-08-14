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

public class UserStat_UserStatBuilder_likeCount_6127306014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4241;
     Object term4274;

    public UserStat_UserStatBuilder_likeCount_6127306014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4242 = new Long(1597484336218508869L);
        Long term4244 = new Long(-685023850445639859L);
        Long term4246 = new Long(-6950146046121430355L);
        Long term4248 = new Long(1667122142089513324L);
        Long term4250 = new Long(-6342139649364011743L);
        Long term4252 = new Long(-4924950707540628022L);
        term4241 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder"));
        Object term4254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4259 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4264 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4265 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4269 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4241, term4241.getClass(), "id", term4242);
        setField(term4241, term4241.getClass(), "userId", term4244);
        setField(term4241, term4241.getClass(), "postCount", term4246);
        setField(term4241, term4241.getClass(), "likeCount", term4248);
        setField(term4241, term4241.getClass(), "followingCount", term4250);
        setField(term4241, term4241.getClass(), "followerCount", term4252);
        setIntField(term4255, term4255.getClass(), "year", 2018);
        setShortField(term4255, term4255.getClass(), "month", (short) 2);
        setShortField(term4255, term4255.getClass(), "day", (short) 14);
        setField(term4254, term4254.getClass(), "date", term4255);
        setByteField(term4259, term4259.getClass(), "hour", (byte) 2);
        setByteField(term4259, term4259.getClass(), "minute", (byte) 40);
        setByteField(term4259, term4259.getClass(), "second", (byte) 48);
        setIntField(term4259, term4259.getClass(), "nano", 371006728);
        setField(term4254, term4254.getClass(), "time", term4259);
        setField(term4241, term4241.getClass(), "createdAt", term4254);
        setIntField(term4265, term4265.getClass(), "year", 2025);
        setShortField(term4265, term4265.getClass(), "month", (short) 8);
        setShortField(term4265, term4265.getClass(), "day", (short) 22);
        setField(term4264, term4264.getClass(), "date", term4265);
        setByteField(term4269, term4269.getClass(), "hour", (byte) 6);
        setByteField(term4269, term4269.getClass(), "minute", (byte) 48);
        setByteField(term4269, term4269.getClass(), "second", (byte) 49);
        setIntField(term4269, term4269.getClass(), "nano", 46400229);
        setField(term4264, term4264.getClass(), "time", term4269);
        setField(term4241, term4241.getClass(), "updatedAt", term4264);
        term4274 = new Long(-4393710401270724527L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4274;
        callMethod(klass, "likeCount", argTypes, term4241, args);
    }

};


