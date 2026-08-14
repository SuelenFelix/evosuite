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

public class UserBO_getIntro_2747230977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25722;

    public UserBO_getIntro_2747230977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25723 = new Long(-7062466217011408314L);
        Long term25773 = new Long(-5455716707538294699L);
        term25722 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term25787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25792 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25797 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25798 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25802 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25722, term25722.getClass(), "id", term25723);
        setField(term25722, term25722.getClass(), "username", "nghfqDXyCG");
        setField(term25722, term25722.getClass(), "password", "WBAOTqErtm");
        setField(term25722, term25722.getClass(), "mobile", "PqtVXXZMqK");
        setField(term25722, term25722.getClass(), "email", "rYbtIDVdnd");
        setField(term25722, term25722.getClass(), "avatarId", term25773);
        setField(term25722, term25722.getClass(), "intro", "UKAReurpHG");
        setIntField(term25788, term25788.getClass(), "year", 2022);
        setShortField(term25788, term25788.getClass(), "month", (short) 8);
        setShortField(term25788, term25788.getClass(), "day", (short) 16);
        setField(term25787, term25787.getClass(), "date", term25788);
        setByteField(term25792, term25792.getClass(), "hour", (byte) 4);
        setByteField(term25792, term25792.getClass(), "minute", (byte) 38);
        setByteField(term25792, term25792.getClass(), "second", (byte) 51);
        setIntField(term25792, term25792.getClass(), "nano", 348952212);
        setField(term25787, term25787.getClass(), "time", term25792);
        setField(term25722, term25722.getClass(), "createdAt", term25787);
        setIntField(term25798, term25798.getClass(), "year", 2016);
        setShortField(term25798, term25798.getClass(), "month", (short) 7);
        setShortField(term25798, term25798.getClass(), "day", (short) 21);
        setField(term25797, term25797.getClass(), "date", term25798);
        setByteField(term25802, term25802.getClass(), "hour", (byte) 22);
        setByteField(term25802, term25802.getClass(), "minute", (byte) 2);
        setByteField(term25802, term25802.getClass(), "second", (byte) 21);
        setIntField(term25802, term25802.getClass(), "nano", 729266668);
        setField(term25797, term25797.getClass(), "time", term25802);
        setField(term25722, term25722.getClass(), "updatedAt", term25797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntro", argTypes, term25722, args);
    }

};


