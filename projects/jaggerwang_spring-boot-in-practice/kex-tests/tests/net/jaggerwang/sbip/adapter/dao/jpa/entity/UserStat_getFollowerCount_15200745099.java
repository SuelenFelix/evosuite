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

public class UserStat_getFollowerCount_15200745099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32103;

    public UserStat_getFollowerCount_15200745099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32104 = new Long(9113614356317836741L);
        Long term32106 = new Long(2244124922001093690L);
        Long term32108 = new Long(-849289244399400018L);
        Long term32110 = new Long(-5334920917680098031L);
        Long term32112 = new Long(-5681371087517724194L);
        Long term32114 = new Long(-2109397517777696156L);
        term32103 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32116 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32117 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32121 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32131 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32103, term32103.getClass(), "id", term32104);
        setField(term32103, term32103.getClass(), "userId", term32106);
        setField(term32103, term32103.getClass(), "postCount", term32108);
        setField(term32103, term32103.getClass(), "likeCount", term32110);
        setField(term32103, term32103.getClass(), "followingCount", term32112);
        setField(term32103, term32103.getClass(), "followerCount", term32114);
        setIntField(term32117, term32117.getClass(), "year", 2012);
        setShortField(term32117, term32117.getClass(), "month", (short) 12);
        setShortField(term32117, term32117.getClass(), "day", (short) 5);
        setField(term32116, term32116.getClass(), "date", term32117);
        setByteField(term32121, term32121.getClass(), "hour", (byte) 23);
        setByteField(term32121, term32121.getClass(), "minute", (byte) 26);
        setByteField(term32121, term32121.getClass(), "second", (byte) 26);
        setIntField(term32121, term32121.getClass(), "nano", 226998623);
        setField(term32116, term32116.getClass(), "time", term32121);
        setField(term32103, term32103.getClass(), "createdAt", term32116);
        setIntField(term32127, term32127.getClass(), "year", 2020);
        setShortField(term32127, term32127.getClass(), "month", (short) 4);
        setShortField(term32127, term32127.getClass(), "day", (short) 20);
        setField(term32126, term32126.getClass(), "date", term32127);
        setByteField(term32131, term32131.getClass(), "hour", (byte) 6);
        setByteField(term32131, term32131.getClass(), "minute", (byte) 10);
        setByteField(term32131, term32131.getClass(), "second", (byte) 52);
        setIntField(term32131, term32131.getClass(), "nano", 872227966);
        setField(term32126, term32126.getClass(), "time", term32131);
        setField(term32103, term32103.getClass(), "updatedAt", term32126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFollowerCount", argTypes, term32103, args);
    }

};


