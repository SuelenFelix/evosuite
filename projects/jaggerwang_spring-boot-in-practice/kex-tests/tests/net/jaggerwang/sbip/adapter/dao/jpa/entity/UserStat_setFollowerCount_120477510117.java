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

public class UserStat_setFollowerCount_120477510117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32377;
     Object term32410;

    public UserStat_setFollowerCount_120477510117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32378 = new Long(9121171957554652661L);
        Long term32380 = new Long(-2752058965354731489L);
        Long term32382 = new Long(-4723024480537897669L);
        Long term32384 = new Long(-8609587218393726408L);
        Long term32386 = new Long(4133412897876628646L);
        Long term32388 = new Long(-4233021136506075526L);
        term32377 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32390 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32391 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32395 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32400 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32401 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32405 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32377, term32377.getClass(), "id", term32378);
        setField(term32377, term32377.getClass(), "userId", term32380);
        setField(term32377, term32377.getClass(), "postCount", term32382);
        setField(term32377, term32377.getClass(), "likeCount", term32384);
        setField(term32377, term32377.getClass(), "followingCount", term32386);
        setField(term32377, term32377.getClass(), "followerCount", term32388);
        setIntField(term32391, term32391.getClass(), "year", 2024);
        setShortField(term32391, term32391.getClass(), "month", (short) 5);
        setShortField(term32391, term32391.getClass(), "day", (short) 8);
        setField(term32390, term32390.getClass(), "date", term32391);
        setByteField(term32395, term32395.getClass(), "hour", (byte) 10);
        setByteField(term32395, term32395.getClass(), "minute", (byte) 21);
        setByteField(term32395, term32395.getClass(), "second", (byte) 1);
        setIntField(term32395, term32395.getClass(), "nano", 912060546);
        setField(term32390, term32390.getClass(), "time", term32395);
        setField(term32377, term32377.getClass(), "createdAt", term32390);
        setIntField(term32401, term32401.getClass(), "year", 2016);
        setShortField(term32401, term32401.getClass(), "month", (short) 1);
        setShortField(term32401, term32401.getClass(), "day", (short) 22);
        setField(term32400, term32400.getClass(), "date", term32401);
        setByteField(term32405, term32405.getClass(), "hour", (byte) 23);
        setByteField(term32405, term32405.getClass(), "minute", (byte) 0);
        setByteField(term32405, term32405.getClass(), "second", (byte) 1);
        setIntField(term32405, term32405.getClass(), "nano", 558329369);
        setField(term32400, term32400.getClass(), "time", term32405);
        setField(term32377, term32377.getClass(), "updatedAt", term32400);
        term32410 = new Long(9041534029896652168L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term32410;
        callMethod(klass, "setFollowerCount", argTypes, term32377, args);
    }

};


