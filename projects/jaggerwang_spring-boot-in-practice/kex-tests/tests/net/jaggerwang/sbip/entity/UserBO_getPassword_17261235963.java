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

public class UserBO_getPassword_17261235963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25182;

    public UserBO_getPassword_17261235963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25183 = new Long(-5367775625638780650L);
        Long term25233 = new Long(-7830820957252387854L);
        term25182 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term25247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25252 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25262 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25182, term25182.getClass(), "id", term25183);
        setField(term25182, term25182.getClass(), "username", "OIHoJeysUi");
        setField(term25182, term25182.getClass(), "password", "WXMWFDGcLB");
        setField(term25182, term25182.getClass(), "mobile", "wKWbJssZuG");
        setField(term25182, term25182.getClass(), "email", "NzBMMhkhpT");
        setField(term25182, term25182.getClass(), "avatarId", term25233);
        setField(term25182, term25182.getClass(), "intro", "qCpEbQDHdF");
        setIntField(term25248, term25248.getClass(), "year", 2029);
        setShortField(term25248, term25248.getClass(), "month", (short) 1);
        setShortField(term25248, term25248.getClass(), "day", (short) 21);
        setField(term25247, term25247.getClass(), "date", term25248);
        setByteField(term25252, term25252.getClass(), "hour", (byte) 9);
        setByteField(term25252, term25252.getClass(), "minute", (byte) 46);
        setByteField(term25252, term25252.getClass(), "second", (byte) 1);
        setIntField(term25252, term25252.getClass(), "nano", 276350652);
        setField(term25247, term25247.getClass(), "time", term25252);
        setField(term25182, term25182.getClass(), "createdAt", term25247);
        setIntField(term25258, term25258.getClass(), "year", 2019);
        setShortField(term25258, term25258.getClass(), "month", (short) 12);
        setShortField(term25258, term25258.getClass(), "day", (short) 20);
        setField(term25257, term25257.getClass(), "date", term25258);
        setByteField(term25262, term25262.getClass(), "hour", (byte) 22);
        setByteField(term25262, term25262.getClass(), "minute", (byte) 20);
        setByteField(term25262, term25262.getClass(), "second", (byte) 29);
        setIntField(term25262, term25262.getClass(), "nano", 582302461);
        setField(term25257, term25257.getClass(), "time", term25262);
        setField(term25182, term25182.getClass(), "updatedAt", term25257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term25182, args);
    }

};


