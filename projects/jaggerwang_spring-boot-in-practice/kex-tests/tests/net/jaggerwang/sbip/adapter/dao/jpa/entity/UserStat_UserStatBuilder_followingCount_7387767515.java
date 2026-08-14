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

public class UserStat_UserStatBuilder_followingCount_7387767515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4276;
     Object term4309;

    public UserStat_UserStatBuilder_followingCount_7387767515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4277 = new Long(-4822736661741380518L);
        Long term4279 = new Long(-5386201758403679145L);
        Long term4281 = new Long(-7268507582722666254L);
        Long term4283 = new Long(5671808784468963649L);
        Long term4285 = new Long(2297097306706899827L);
        Long term4287 = new Long(-900457279156388404L);
        term4276 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder"));
        Object term4289 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4290 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4294 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4304 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4276, term4276.getClass(), "id", term4277);
        setField(term4276, term4276.getClass(), "userId", term4279);
        setField(term4276, term4276.getClass(), "postCount", term4281);
        setField(term4276, term4276.getClass(), "likeCount", term4283);
        setField(term4276, term4276.getClass(), "followingCount", term4285);
        setField(term4276, term4276.getClass(), "followerCount", term4287);
        setIntField(term4290, term4290.getClass(), "year", 2028);
        setShortField(term4290, term4290.getClass(), "month", (short) 4);
        setShortField(term4290, term4290.getClass(), "day", (short) 1);
        setField(term4289, term4289.getClass(), "date", term4290);
        setByteField(term4294, term4294.getClass(), "hour", (byte) 16);
        setByteField(term4294, term4294.getClass(), "minute", (byte) 22);
        setByteField(term4294, term4294.getClass(), "second", (byte) 32);
        setIntField(term4294, term4294.getClass(), "nano", 406353763);
        setField(term4289, term4289.getClass(), "time", term4294);
        setField(term4276, term4276.getClass(), "createdAt", term4289);
        setIntField(term4300, term4300.getClass(), "year", 2019);
        setShortField(term4300, term4300.getClass(), "month", (short) 7);
        setShortField(term4300, term4300.getClass(), "day", (short) 19);
        setField(term4299, term4299.getClass(), "date", term4300);
        setByteField(term4304, term4304.getClass(), "hour", (byte) 10);
        setByteField(term4304, term4304.getClass(), "minute", (byte) 54);
        setByteField(term4304, term4304.getClass(), "second", (byte) 55);
        setIntField(term4304, term4304.getClass(), "nano", 244650454);
        setField(term4299, term4299.getClass(), "time", term4304);
        setField(term4276, term4276.getClass(), "updatedAt", term4299);
        term4309 = new Long(1084801489398441516L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4309;
        callMethod(klass, "followingCount", argTypes, term4276, args);
    }

};


