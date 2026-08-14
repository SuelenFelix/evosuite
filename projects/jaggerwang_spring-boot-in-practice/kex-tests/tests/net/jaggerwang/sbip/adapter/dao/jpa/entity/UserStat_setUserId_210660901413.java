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

public class UserStat_setUserId_210660901413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32237;
     Object term32270;

    public UserStat_setUserId_210660901413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32238 = new Long(369988508829037253L);
        Long term32240 = new Long(-9069994265835848577L);
        Long term32242 = new Long(-1698215709085558019L);
        Long term32244 = new Long(-9057998854977924783L);
        Long term32246 = new Long(8015201292704898322L);
        Long term32248 = new Long(623115373634781772L);
        term32237 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32255 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32260 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32261 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32265 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32237, term32237.getClass(), "id", term32238);
        setField(term32237, term32237.getClass(), "userId", term32240);
        setField(term32237, term32237.getClass(), "postCount", term32242);
        setField(term32237, term32237.getClass(), "likeCount", term32244);
        setField(term32237, term32237.getClass(), "followingCount", term32246);
        setField(term32237, term32237.getClass(), "followerCount", term32248);
        setIntField(term32251, term32251.getClass(), "year", 2015);
        setShortField(term32251, term32251.getClass(), "month", (short) 10);
        setShortField(term32251, term32251.getClass(), "day", (short) 4);
        setField(term32250, term32250.getClass(), "date", term32251);
        setByteField(term32255, term32255.getClass(), "hour", (byte) 4);
        setByteField(term32255, term32255.getClass(), "minute", (byte) 28);
        setByteField(term32255, term32255.getClass(), "second", (byte) 5);
        setIntField(term32255, term32255.getClass(), "nano", 457950228);
        setField(term32250, term32250.getClass(), "time", term32255);
        setField(term32237, term32237.getClass(), "createdAt", term32250);
        setIntField(term32261, term32261.getClass(), "year", 2017);
        setShortField(term32261, term32261.getClass(), "month", (short) 2);
        setShortField(term32261, term32261.getClass(), "day", (short) 8);
        setField(term32260, term32260.getClass(), "date", term32261);
        setByteField(term32265, term32265.getClass(), "hour", (byte) 12);
        setByteField(term32265, term32265.getClass(), "minute", (byte) 5);
        setByteField(term32265, term32265.getClass(), "second", (byte) 46);
        setIntField(term32265, term32265.getClass(), "nano", 847487783);
        setField(term32260, term32260.getClass(), "time", term32265);
        setField(term32237, term32237.getClass(), "updatedAt", term32260);
        term32270 = new Long(-6928102703492980650L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term32270;
        callMethod(klass, "setUserId", argTypes, term32237, args);
    }

};


