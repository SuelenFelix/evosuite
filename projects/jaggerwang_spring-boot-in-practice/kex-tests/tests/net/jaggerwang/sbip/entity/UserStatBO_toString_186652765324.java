package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserStatBO_toString_186652765324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12296;

    public UserStatBO_toString_186652765324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12297 = new Long(-7291742736502427077L);
        Long term12299 = new Long(-8121849829073967555L);
        Long term12301 = new Long(0L);
        Long term12303 = new Long(0L);
        Long term12305 = new Long(0L);
        Long term12307 = new Long(0L);
        term12296 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term12309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12314 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12324 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12296, term12296.getClass(), "id", term12297);
        setField(term12296, term12296.getClass(), "userId", term12299);
        setField(term12296, term12296.getClass(), "postCount", term12301);
        setField(term12296, term12296.getClass(), "likeCount", term12303);
        setField(term12296, term12296.getClass(), "followingCount", term12305);
        setField(term12296, term12296.getClass(), "followerCount", term12307);
        setIntField(term12310, term12310.getClass(), "year", 2021);
        setShortField(term12310, term12310.getClass(), "month", (short) 8);
        setShortField(term12310, term12310.getClass(), "day", (short) 27);
        setField(term12309, term12309.getClass(), "date", term12310);
        setByteField(term12314, term12314.getClass(), "hour", (byte) 20);
        setByteField(term12314, term12314.getClass(), "minute", (byte) 11);
        setByteField(term12314, term12314.getClass(), "second", (byte) 47);
        setIntField(term12314, term12314.getClass(), "nano", 116303493);
        setField(term12309, term12309.getClass(), "time", term12314);
        setField(term12296, term12296.getClass(), "createdAt", term12309);
        setIntField(term12320, term12320.getClass(), "year", 2012);
        setShortField(term12320, term12320.getClass(), "month", (short) 5);
        setShortField(term12320, term12320.getClass(), "day", (short) 17);
        setField(term12319, term12319.getClass(), "date", term12320);
        setByteField(term12324, term12324.getClass(), "hour", (byte) 19);
        setByteField(term12324, term12324.getClass(), "minute", (byte) 36);
        setByteField(term12324, term12324.getClass(), "second", (byte) 33);
        setIntField(term12324, term12324.getClass(), "nano", 46625011);
        setField(term12319, term12319.getClass(), "time", term12324);
        setField(term12296, term12296.getClass(), "updatedAt", term12319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term12296, args);
    }

};


