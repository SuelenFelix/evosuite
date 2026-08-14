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

public class UserBO_UserBOBuilder_updatedAt_3634536029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29379;
     Object term29464;

    public UserBO_UserBOBuilder_updatedAt_3634536029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29380 = new Long(8931772176819893873L);
        Long term29430 = new Long(-4370635295110591519L);
        term29379 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        Object term29444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29449 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29459 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29379, term29379.getClass(), "id", term29380);
        setField(term29379, term29379.getClass(), "username", "bdyhHbDAmJ");
        setField(term29379, term29379.getClass(), "password", "BBXiTNHqGE");
        setField(term29379, term29379.getClass(), "mobile", "IEYhJmgCVd");
        setField(term29379, term29379.getClass(), "email", "KSJeYkkvpk");
        setField(term29379, term29379.getClass(), "avatarId", term29430);
        setField(term29379, term29379.getClass(), "intro", "qUtkFGMNUV");
        setIntField(term29445, term29445.getClass(), "year", 2018);
        setShortField(term29445, term29445.getClass(), "month", (short) 1);
        setShortField(term29445, term29445.getClass(), "day", (short) 29);
        setField(term29444, term29444.getClass(), "date", term29445);
        setByteField(term29449, term29449.getClass(), "hour", (byte) 17);
        setByteField(term29449, term29449.getClass(), "minute", (byte) 5);
        setByteField(term29449, term29449.getClass(), "second", (byte) 53);
        setIntField(term29449, term29449.getClass(), "nano", 36624440);
        setField(term29444, term29444.getClass(), "time", term29449);
        setField(term29379, term29379.getClass(), "createdAt", term29444);
        setIntField(term29455, term29455.getClass(), "year", 2022);
        setShortField(term29455, term29455.getClass(), "month", (short) 12);
        setShortField(term29455, term29455.getClass(), "day", (short) 22);
        setField(term29454, term29454.getClass(), "date", term29455);
        setByteField(term29459, term29459.getClass(), "hour", (byte) 18);
        setByteField(term29459, term29459.getClass(), "minute", (byte) 30);
        setByteField(term29459, term29459.getClass(), "second", (byte) 56);
        setIntField(term29459, term29459.getClass(), "nano", 111391416);
        setField(term29454, term29454.getClass(), "time", term29459);
        setField(term29379, term29379.getClass(), "updatedAt", term29454);
        term29464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29469 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29465, term29465.getClass(), "year", 2019);
        setShortField(term29465, term29465.getClass(), "month", (short) 6);
        setShortField(term29465, term29465.getClass(), "day", (short) 22);
        setField(term29464, term29464.getClass(), "date", term29465);
        setByteField(term29469, term29469.getClass(), "hour", (byte) 9);
        setByteField(term29469, term29469.getClass(), "minute", (byte) 14);
        setByteField(term29469, term29469.getClass(), "second", (byte) 27);
        setIntField(term29469, term29469.getClass(), "nano", 124138657);
        setField(term29464, term29464.getClass(), "time", term29469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term29464;
        callMethod(klass, "updatedAt", argTypes, term29379, args);
    }

};


