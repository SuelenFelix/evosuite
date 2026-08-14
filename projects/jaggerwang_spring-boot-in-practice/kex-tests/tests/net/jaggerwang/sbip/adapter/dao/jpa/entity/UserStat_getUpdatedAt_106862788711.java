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

public class UserStat_getUpdatedAt_106862788711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32169;

    public UserStat_getUpdatedAt_106862788711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32170 = new Long(9148095734887346640L);
        Long term32172 = new Long(-5311570055634772542L);
        Long term32174 = new Long(-1279719656945091084L);
        Long term32176 = new Long(7190487627244901799L);
        Long term32178 = new Long(-5577824208081701355L);
        Long term32180 = new Long(4003767587571884508L);
        term32169 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32182 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32183 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32187 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32192 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32193 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32197 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32169, term32169.getClass(), "id", term32170);
        setField(term32169, term32169.getClass(), "userId", term32172);
        setField(term32169, term32169.getClass(), "postCount", term32174);
        setField(term32169, term32169.getClass(), "likeCount", term32176);
        setField(term32169, term32169.getClass(), "followingCount", term32178);
        setField(term32169, term32169.getClass(), "followerCount", term32180);
        setIntField(term32183, term32183.getClass(), "year", 2013);
        setShortField(term32183, term32183.getClass(), "month", (short) 11);
        setShortField(term32183, term32183.getClass(), "day", (short) 15);
        setField(term32182, term32182.getClass(), "date", term32183);
        setByteField(term32187, term32187.getClass(), "hour", (byte) 16);
        setByteField(term32187, term32187.getClass(), "minute", (byte) 0);
        setByteField(term32187, term32187.getClass(), "second", (byte) 59);
        setIntField(term32187, term32187.getClass(), "nano", 823311700);
        setField(term32182, term32182.getClass(), "time", term32187);
        setField(term32169, term32169.getClass(), "createdAt", term32182);
        setIntField(term32193, term32193.getClass(), "year", 2017);
        setShortField(term32193, term32193.getClass(), "month", (short) 11);
        setShortField(term32193, term32193.getClass(), "day", (short) 30);
        setField(term32192, term32192.getClass(), "date", term32193);
        setByteField(term32197, term32197.getClass(), "hour", (byte) 23);
        setByteField(term32197, term32197.getClass(), "minute", (byte) 28);
        setByteField(term32197, term32197.getClass(), "second", (byte) 34);
        setIntField(term32197, term32197.getClass(), "nano", 684347789);
        setField(term32192, term32192.getClass(), "time", term32197);
        setField(term32169, term32169.getClass(), "updatedAt", term32192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term32169, args);
    }

};


