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

public class UserStat_getPostCount_5680478236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32004;

    public UserStat_getPostCount_5680478236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32005 = new Long(3853743792832767733L);
        Long term32007 = new Long(-6064923943154213519L);
        Long term32009 = new Long(-6344058468200613078L);
        Long term32011 = new Long(9069301103965727560L);
        Long term32013 = new Long(1078204819466025938L);
        Long term32015 = new Long(-4526944004625263747L);
        term32004 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32022 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32032 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32004, term32004.getClass(), "id", term32005);
        setField(term32004, term32004.getClass(), "userId", term32007);
        setField(term32004, term32004.getClass(), "postCount", term32009);
        setField(term32004, term32004.getClass(), "likeCount", term32011);
        setField(term32004, term32004.getClass(), "followingCount", term32013);
        setField(term32004, term32004.getClass(), "followerCount", term32015);
        setIntField(term32018, term32018.getClass(), "year", 2010);
        setShortField(term32018, term32018.getClass(), "month", (short) 1);
        setShortField(term32018, term32018.getClass(), "day", (short) 25);
        setField(term32017, term32017.getClass(), "date", term32018);
        setByteField(term32022, term32022.getClass(), "hour", (byte) 2);
        setByteField(term32022, term32022.getClass(), "minute", (byte) 58);
        setByteField(term32022, term32022.getClass(), "second", (byte) 38);
        setIntField(term32022, term32022.getClass(), "nano", 91985442);
        setField(term32017, term32017.getClass(), "time", term32022);
        setField(term32004, term32004.getClass(), "createdAt", term32017);
        setIntField(term32028, term32028.getClass(), "year", 2016);
        setShortField(term32028, term32028.getClass(), "month", (short) 8);
        setShortField(term32028, term32028.getClass(), "day", (short) 5);
        setField(term32027, term32027.getClass(), "date", term32028);
        setByteField(term32032, term32032.getClass(), "hour", (byte) 0);
        setByteField(term32032, term32032.getClass(), "minute", (byte) 44);
        setByteField(term32032, term32032.getClass(), "second", (byte) 0);
        setIntField(term32032, term32032.getClass(), "nano", 108509);
        setField(term32027, term32027.getClass(), "time", term32032);
        setField(term32004, term32004.getClass(), "updatedAt", term32027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostCount", argTypes, term32004, args);
    }

};


