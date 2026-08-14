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

public class UserStat_UserStatBuilder_updatedAt_12310545308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4389;
     Object term4422;

    public UserStat_UserStatBuilder_updatedAt_12310545308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4390 = new Long(7495904023107549024L);
        Long term4392 = new Long(8802866251294305945L);
        Long term4394 = new Long(4513004407927379358L);
        Long term4396 = new Long(-7115418542247301000L);
        Long term4398 = new Long(8034714140377562739L);
        Long term4400 = new Long(-2924531382671518368L);
        term4389 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder"));
        Object term4402 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4403 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4407 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4412 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4413 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4417 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4389, term4389.getClass(), "id", term4390);
        setField(term4389, term4389.getClass(), "userId", term4392);
        setField(term4389, term4389.getClass(), "postCount", term4394);
        setField(term4389, term4389.getClass(), "likeCount", term4396);
        setField(term4389, term4389.getClass(), "followingCount", term4398);
        setField(term4389, term4389.getClass(), "followerCount", term4400);
        setIntField(term4403, term4403.getClass(), "year", 2028);
        setShortField(term4403, term4403.getClass(), "month", (short) 7);
        setShortField(term4403, term4403.getClass(), "day", (short) 22);
        setField(term4402, term4402.getClass(), "date", term4403);
        setByteField(term4407, term4407.getClass(), "hour", (byte) 18);
        setByteField(term4407, term4407.getClass(), "minute", (byte) 33);
        setByteField(term4407, term4407.getClass(), "second", (byte) 7);
        setIntField(term4407, term4407.getClass(), "nano", 763613074);
        setField(term4402, term4402.getClass(), "time", term4407);
        setField(term4389, term4389.getClass(), "createdAt", term4402);
        setIntField(term4413, term4413.getClass(), "year", 2011);
        setShortField(term4413, term4413.getClass(), "month", (short) 8);
        setShortField(term4413, term4413.getClass(), "day", (short) 1);
        setField(term4412, term4412.getClass(), "date", term4413);
        setByteField(term4417, term4417.getClass(), "hour", (byte) 7);
        setByteField(term4417, term4417.getClass(), "minute", (byte) 2);
        setByteField(term4417, term4417.getClass(), "second", (byte) 46);
        setIntField(term4417, term4417.getClass(), "nano", 187178462);
        setField(term4412, term4412.getClass(), "time", term4417);
        setField(term4389, term4389.getClass(), "updatedAt", term4412);
        term4422 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4423 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4427 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4423, term4423.getClass(), "year", 2020);
        setShortField(term4423, term4423.getClass(), "month", (short) 9);
        setShortField(term4423, term4423.getClass(), "day", (short) 3);
        setField(term4422, term4422.getClass(), "date", term4423);
        setByteField(term4427, term4427.getClass(), "hour", (byte) 10);
        setByteField(term4427, term4427.getClass(), "minute", (byte) 44);
        setByteField(term4427, term4427.getClass(), "second", (byte) 5);
        setIntField(term4427, term4427.getClass(), "nano", 572560230);
        setField(term4422, term4422.getClass(), "time", term4427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term4422;
        callMethod(klass, "updatedAt", argTypes, term4389, args);
    }

};


