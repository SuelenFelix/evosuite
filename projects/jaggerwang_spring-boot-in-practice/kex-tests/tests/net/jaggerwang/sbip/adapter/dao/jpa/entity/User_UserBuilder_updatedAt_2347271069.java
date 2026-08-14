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

public class User_UserBuilder_updatedAt_2347271069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13215;
     Object term13300;

    public User_UserBuilder_updatedAt_2347271069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13216 = new Long(6853972830905120647L);
        Long term13266 = new Long(1442167273909860961L);
        term13215 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder"));
        Object term13280 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13285 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13290 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13291 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13295 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13215, term13215.getClass(), "id", term13216);
        setField(term13215, term13215.getClass(), "username", "yGtHPyvYiQ");
        setField(term13215, term13215.getClass(), "password", "MvRIxilFMJ");
        setField(term13215, term13215.getClass(), "mobile", "iNwOJRBEjp");
        setField(term13215, term13215.getClass(), "email", "XylxrMBraH");
        setField(term13215, term13215.getClass(), "avatarId", term13266);
        setField(term13215, term13215.getClass(), "intro", "pORebkoRdD");
        setIntField(term13281, term13281.getClass(), "year", 2029);
        setShortField(term13281, term13281.getClass(), "month", (short) 4);
        setShortField(term13281, term13281.getClass(), "day", (short) 27);
        setField(term13280, term13280.getClass(), "date", term13281);
        setByteField(term13285, term13285.getClass(), "hour", (byte) 16);
        setByteField(term13285, term13285.getClass(), "minute", (byte) 25);
        setByteField(term13285, term13285.getClass(), "second", (byte) 10);
        setIntField(term13285, term13285.getClass(), "nano", 699018782);
        setField(term13280, term13280.getClass(), "time", term13285);
        setField(term13215, term13215.getClass(), "createdAt", term13280);
        setIntField(term13291, term13291.getClass(), "year", 2023);
        setShortField(term13291, term13291.getClass(), "month", (short) 12);
        setShortField(term13291, term13291.getClass(), "day", (short) 12);
        setField(term13290, term13290.getClass(), "date", term13291);
        setByteField(term13295, term13295.getClass(), "hour", (byte) 0);
        setByteField(term13295, term13295.getClass(), "minute", (byte) 12);
        setByteField(term13295, term13295.getClass(), "second", (byte) 38);
        setIntField(term13295, term13295.getClass(), "nano", 430999236);
        setField(term13290, term13290.getClass(), "time", term13295);
        setField(term13215, term13215.getClass(), "updatedAt", term13290);
        term13300 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13301 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13305 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13301, term13301.getClass(), "year", 2018);
        setShortField(term13301, term13301.getClass(), "month", (short) 6);
        setShortField(term13301, term13301.getClass(), "day", (short) 17);
        setField(term13300, term13300.getClass(), "date", term13301);
        setByteField(term13305, term13305.getClass(), "hour", (byte) 1);
        setByteField(term13305, term13305.getClass(), "minute", (byte) 3);
        setByteField(term13305, term13305.getClass(), "second", (byte) 5);
        setIntField(term13305, term13305.getClass(), "nano", 914834044);
        setField(term13300, term13300.getClass(), "time", term13305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term13300;
        callMethod(klass, "updatedAt", argTypes, term13215, args);
    }

};


