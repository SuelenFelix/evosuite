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

public class UserBO_getAvatarId_11355032086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25587;

    public UserBO_getAvatarId_11355032086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25588 = new Long(-8033044954947064558L);
        Long term25638 = new Long(4626639872957534248L);
        term25587 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term25652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25657 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25662 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25663 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25667 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25587, term25587.getClass(), "id", term25588);
        setField(term25587, term25587.getClass(), "username", "MHGKyEnwKc");
        setField(term25587, term25587.getClass(), "password", "ShIELyuULw");
        setField(term25587, term25587.getClass(), "mobile", "IpQuOGMgmj");
        setField(term25587, term25587.getClass(), "email", "pJbnHTYrxn");
        setField(term25587, term25587.getClass(), "avatarId", term25638);
        setField(term25587, term25587.getClass(), "intro", "iIRsCSYqXH");
        setIntField(term25653, term25653.getClass(), "year", 2015);
        setShortField(term25653, term25653.getClass(), "month", (short) 4);
        setShortField(term25653, term25653.getClass(), "day", (short) 22);
        setField(term25652, term25652.getClass(), "date", term25653);
        setByteField(term25657, term25657.getClass(), "hour", (byte) 15);
        setByteField(term25657, term25657.getClass(), "minute", (byte) 23);
        setByteField(term25657, term25657.getClass(), "second", (byte) 42);
        setIntField(term25657, term25657.getClass(), "nano", 822658620);
        setField(term25652, term25652.getClass(), "time", term25657);
        setField(term25587, term25587.getClass(), "createdAt", term25652);
        setIntField(term25663, term25663.getClass(), "year", 2020);
        setShortField(term25663, term25663.getClass(), "month", (short) 4);
        setShortField(term25663, term25663.getClass(), "day", (short) 27);
        setField(term25662, term25662.getClass(), "date", term25663);
        setByteField(term25667, term25667.getClass(), "hour", (byte) 16);
        setByteField(term25667, term25667.getClass(), "minute", (byte) 48);
        setByteField(term25667, term25667.getClass(), "second", (byte) 39);
        setIntField(term25667, term25667.getClass(), "nano", 250909266);
        setField(term25662, term25662.getClass(), "time", term25667);
        setField(term25587, term25587.getClass(), "updatedAt", term25662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarId", argTypes, term25587, args);
    }

};


