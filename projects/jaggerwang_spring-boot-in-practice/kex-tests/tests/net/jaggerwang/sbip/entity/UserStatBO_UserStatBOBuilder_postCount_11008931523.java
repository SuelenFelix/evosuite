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

public class UserStatBO_UserStatBOBuilder_postCount_11008931523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12464;
     Object term12501;

    public UserStatBO_UserStatBOBuilder_postCount_11008931523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12465 = new Long(-6673920710396545553L);
        Long term12467 = new Long(3412644969878030772L);
        Long term12470 = new Long(6698455537431331246L);
        Long term12473 = new Long(-8327432141027603933L);
        Long term12476 = new Long(-433040798405298080L);
        Long term12479 = new Long(-1505191021111100819L);
        term12464 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder"));
        Object term12481 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12482 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12486 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12496 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12464, term12464.getClass(), "id", term12465);
        setField(term12464, term12464.getClass(), "userId", term12467);
        setBooleanField(term12464, term12464.getClass(), "postCount$set", false);
        setField(term12464, term12464.getClass(), "postCount$value", term12470);
        setBooleanField(term12464, term12464.getClass(), "likeCount$set", true);
        setField(term12464, term12464.getClass(), "likeCount$value", term12473);
        setBooleanField(term12464, term12464.getClass(), "followingCount$set", false);
        setField(term12464, term12464.getClass(), "followingCount$value", term12476);
        setBooleanField(term12464, term12464.getClass(), "followerCount$set", true);
        setField(term12464, term12464.getClass(), "followerCount$value", term12479);
        setIntField(term12482, term12482.getClass(), "year", 2026);
        setShortField(term12482, term12482.getClass(), "month", (short) 10);
        setShortField(term12482, term12482.getClass(), "day", (short) 19);
        setField(term12481, term12481.getClass(), "date", term12482);
        setByteField(term12486, term12486.getClass(), "hour", (byte) 7);
        setByteField(term12486, term12486.getClass(), "minute", (byte) 22);
        setByteField(term12486, term12486.getClass(), "second", (byte) 11);
        setIntField(term12486, term12486.getClass(), "nano", 17846677);
        setField(term12481, term12481.getClass(), "time", term12486);
        setField(term12464, term12464.getClass(), "createdAt", term12481);
        setIntField(term12492, term12492.getClass(), "year", 2018);
        setShortField(term12492, term12492.getClass(), "month", (short) 10);
        setShortField(term12492, term12492.getClass(), "day", (short) 17);
        setField(term12491, term12491.getClass(), "date", term12492);
        setByteField(term12496, term12496.getClass(), "hour", (byte) 5);
        setByteField(term12496, term12496.getClass(), "minute", (byte) 10);
        setByteField(term12496, term12496.getClass(), "second", (byte) 23);
        setIntField(term12496, term12496.getClass(), "nano", 571520422);
        setField(term12491, term12491.getClass(), "time", term12496);
        setField(term12464, term12464.getClass(), "updatedAt", term12491);
        term12501 = new Long(-1000830646340880796L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12501;
        callMethod(klass, "postCount", argTypes, term12464, args);
    }

};


