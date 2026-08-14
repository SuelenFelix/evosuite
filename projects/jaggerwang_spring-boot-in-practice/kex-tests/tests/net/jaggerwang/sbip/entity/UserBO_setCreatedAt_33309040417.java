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

public class UserBO_setCreatedAt_33309040417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27186;
     Object term27271;

    public UserBO_setCreatedAt_33309040417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27187 = new Long(-5044181804110715069L);
        Long term27237 = new Long(-2413135395771470086L);
        term27186 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term27251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27256 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27266 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27186, term27186.getClass(), "id", term27187);
        setField(term27186, term27186.getClass(), "username", "DPskuFUobI");
        setField(term27186, term27186.getClass(), "password", "wBGfLpNNiZ");
        setField(term27186, term27186.getClass(), "mobile", "yUGCjlqgJE");
        setField(term27186, term27186.getClass(), "email", "PXdVZyoJyC");
        setField(term27186, term27186.getClass(), "avatarId", term27237);
        setField(term27186, term27186.getClass(), "intro", "vLerpqavFM");
        setIntField(term27252, term27252.getClass(), "year", 2010);
        setShortField(term27252, term27252.getClass(), "month", (short) 3);
        setShortField(term27252, term27252.getClass(), "day", (short) 22);
        setField(term27251, term27251.getClass(), "date", term27252);
        setByteField(term27256, term27256.getClass(), "hour", (byte) 23);
        setByteField(term27256, term27256.getClass(), "minute", (byte) 36);
        setByteField(term27256, term27256.getClass(), "second", (byte) 22);
        setIntField(term27256, term27256.getClass(), "nano", 781575122);
        setField(term27251, term27251.getClass(), "time", term27256);
        setField(term27186, term27186.getClass(), "createdAt", term27251);
        setIntField(term27262, term27262.getClass(), "year", 2015);
        setShortField(term27262, term27262.getClass(), "month", (short) 8);
        setShortField(term27262, term27262.getClass(), "day", (short) 6);
        setField(term27261, term27261.getClass(), "date", term27262);
        setByteField(term27266, term27266.getClass(), "hour", (byte) 16);
        setByteField(term27266, term27266.getClass(), "minute", (byte) 16);
        setByteField(term27266, term27266.getClass(), "second", (byte) 21);
        setIntField(term27266, term27266.getClass(), "nano", 274900303);
        setField(term27261, term27261.getClass(), "time", term27266);
        setField(term27186, term27186.getClass(), "updatedAt", term27261);
        term27271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27276 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term27272, term27272.getClass(), "year", 2022);
        setShortField(term27272, term27272.getClass(), "month", (short) 5);
        setShortField(term27272, term27272.getClass(), "day", (short) 28);
        setField(term27271, term27271.getClass(), "date", term27272);
        setByteField(term27276, term27276.getClass(), "hour", (byte) 20);
        setByteField(term27276, term27276.getClass(), "minute", (byte) 42);
        setByteField(term27276, term27276.getClass(), "second", (byte) 20);
        setIntField(term27276, term27276.getClass(), "nano", 528388661);
        setField(term27271, term27271.getClass(), "time", term27276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term27271;
        callMethod(klass, "setCreatedAt", argTypes, term27186, args);
    }

};


