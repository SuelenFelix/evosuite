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

public class UserBO_UserBOBuilder_build_185809700610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29524;

    public UserBO_UserBOBuilder_build_185809700610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29525 = new Long(-1325109462577461208L);
        Long term29575 = new Long(-7181112149072926893L);
        term29524 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        Object term29589 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29590 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29594 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29599 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29604 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29524, term29524.getClass(), "id", term29525);
        setField(term29524, term29524.getClass(), "username", "mGRiYhnMcR");
        setField(term29524, term29524.getClass(), "password", "NFlvfJCVPO");
        setField(term29524, term29524.getClass(), "mobile", "KarbTXFmUU");
        setField(term29524, term29524.getClass(), "email", "jiUSjqwSIQ");
        setField(term29524, term29524.getClass(), "avatarId", term29575);
        setField(term29524, term29524.getClass(), "intro", "MgLCedQfoj");
        setIntField(term29590, term29590.getClass(), "year", 2023);
        setShortField(term29590, term29590.getClass(), "month", (short) 5);
        setShortField(term29590, term29590.getClass(), "day", (short) 8);
        setField(term29589, term29589.getClass(), "date", term29590);
        setByteField(term29594, term29594.getClass(), "hour", (byte) 6);
        setByteField(term29594, term29594.getClass(), "minute", (byte) 35);
        setByteField(term29594, term29594.getClass(), "second", (byte) 9);
        setIntField(term29594, term29594.getClass(), "nano", 577816079);
        setField(term29589, term29589.getClass(), "time", term29594);
        setField(term29524, term29524.getClass(), "createdAt", term29589);
        setIntField(term29600, term29600.getClass(), "year", 2019);
        setShortField(term29600, term29600.getClass(), "month", (short) 12);
        setShortField(term29600, term29600.getClass(), "day", (short) 13);
        setField(term29599, term29599.getClass(), "date", term29600);
        setByteField(term29604, term29604.getClass(), "hour", (byte) 7);
        setByteField(term29604, term29604.getClass(), "minute", (byte) 59);
        setByteField(term29604, term29604.getClass(), "second", (byte) 40);
        setIntField(term29604, term29604.getClass(), "nano", 824164134);
        setField(term29599, term29599.getClass(), "time", term29604);
        setField(term29524, term29524.getClass(), "updatedAt", term29599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term29524, args);
    }

};


