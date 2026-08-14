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

public class UserStat_getFollowingCount_3013885968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32070;

    public UserStat_getFollowingCount_3013885968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32071 = new Long(-6255610460583667093L);
        Long term32073 = new Long(-3947173237186855838L);
        Long term32075 = new Long(1186857065042697930L);
        Long term32077 = new Long(1659080369100392023L);
        Long term32079 = new Long(854087753192360238L);
        Long term32081 = new Long(-6246278604466261475L);
        term32070 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32083 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32088 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32093 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32094 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32098 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32070, term32070.getClass(), "id", term32071);
        setField(term32070, term32070.getClass(), "userId", term32073);
        setField(term32070, term32070.getClass(), "postCount", term32075);
        setField(term32070, term32070.getClass(), "likeCount", term32077);
        setField(term32070, term32070.getClass(), "followingCount", term32079);
        setField(term32070, term32070.getClass(), "followerCount", term32081);
        setIntField(term32084, term32084.getClass(), "year", 2012);
        setShortField(term32084, term32084.getClass(), "month", (short) 7);
        setShortField(term32084, term32084.getClass(), "day", (short) 23);
        setField(term32083, term32083.getClass(), "date", term32084);
        setByteField(term32088, term32088.getClass(), "hour", (byte) 8);
        setByteField(term32088, term32088.getClass(), "minute", (byte) 33);
        setByteField(term32088, term32088.getClass(), "second", (byte) 50);
        setIntField(term32088, term32088.getClass(), "nano", 663997596);
        setField(term32083, term32083.getClass(), "time", term32088);
        setField(term32070, term32070.getClass(), "createdAt", term32083);
        setIntField(term32094, term32094.getClass(), "year", 2018);
        setShortField(term32094, term32094.getClass(), "month", (short) 5);
        setShortField(term32094, term32094.getClass(), "day", (short) 18);
        setField(term32093, term32093.getClass(), "date", term32094);
        setByteField(term32098, term32098.getClass(), "hour", (byte) 22);
        setByteField(term32098, term32098.getClass(), "minute", (byte) 7);
        setByteField(term32098, term32098.getClass(), "second", (byte) 58);
        setIntField(term32098, term32098.getClass(), "nano", 802311880);
        setField(term32093, term32093.getClass(), "time", term32098);
        setField(term32070, term32070.getClass(), "updatedAt", term32093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFollowingCount", argTypes, term32070, args);
    }

};


