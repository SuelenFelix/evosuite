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

public class UserStat_setLikeCount_44436637215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32307;
     Object term32340;

    public UserStat_setLikeCount_44436637215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32308 = new Long(-5866516262253090421L);
        Long term32310 = new Long(-4336769198128902991L);
        Long term32312 = new Long(-3441020756295150684L);
        Long term32314 = new Long(-2938034344303060228L);
        Long term32316 = new Long(-758819117507836512L);
        Long term32318 = new Long(-1855660992126411308L);
        term32307 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32335 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32307, term32307.getClass(), "id", term32308);
        setField(term32307, term32307.getClass(), "userId", term32310);
        setField(term32307, term32307.getClass(), "postCount", term32312);
        setField(term32307, term32307.getClass(), "likeCount", term32314);
        setField(term32307, term32307.getClass(), "followingCount", term32316);
        setField(term32307, term32307.getClass(), "followerCount", term32318);
        setIntField(term32321, term32321.getClass(), "year", 2015);
        setShortField(term32321, term32321.getClass(), "month", (short) 11);
        setShortField(term32321, term32321.getClass(), "day", (short) 12);
        setField(term32320, term32320.getClass(), "date", term32321);
        setByteField(term32325, term32325.getClass(), "hour", (byte) 8);
        setByteField(term32325, term32325.getClass(), "minute", (byte) 57);
        setByteField(term32325, term32325.getClass(), "second", (byte) 39);
        setIntField(term32325, term32325.getClass(), "nano", 144990931);
        setField(term32320, term32320.getClass(), "time", term32325);
        setField(term32307, term32307.getClass(), "createdAt", term32320);
        setIntField(term32331, term32331.getClass(), "year", 2015);
        setShortField(term32331, term32331.getClass(), "month", (short) 3);
        setShortField(term32331, term32331.getClass(), "day", (short) 10);
        setField(term32330, term32330.getClass(), "date", term32331);
        setByteField(term32335, term32335.getClass(), "hour", (byte) 6);
        setByteField(term32335, term32335.getClass(), "minute", (byte) 11);
        setByteField(term32335, term32335.getClass(), "second", (byte) 21);
        setIntField(term32335, term32335.getClass(), "nano", 925797004);
        setField(term32330, term32330.getClass(), "time", term32335);
        setField(term32307, term32307.getClass(), "updatedAt", term32330);
        term32340 = new Long(-6435676296015352817L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term32340;
        callMethod(klass, "setLikeCount", argTypes, term32307, args);
    }

};


