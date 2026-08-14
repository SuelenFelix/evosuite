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

public class UserBO_UserBOBuilder_password_18563775453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28469;

    public UserBO_UserBOBuilder_password_18563775453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28470 = new Long(5498944509671266637L);
        Long term28520 = new Long(-6838909359433858599L);
        term28469 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        Object term28534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28539 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28544 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28545 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28549 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28469, term28469.getClass(), "id", term28470);
        setField(term28469, term28469.getClass(), "username", "aanyiAOJCl");
        setField(term28469, term28469.getClass(), "password", "VDokbsCuqq");
        setField(term28469, term28469.getClass(), "mobile", "xClUIcPECX");
        setField(term28469, term28469.getClass(), "email", "avhRaGZaBF");
        setField(term28469, term28469.getClass(), "avatarId", term28520);
        setField(term28469, term28469.getClass(), "intro", "JkgoRtImdE");
        setIntField(term28535, term28535.getClass(), "year", 2017);
        setShortField(term28535, term28535.getClass(), "month", (short) 1);
        setShortField(term28535, term28535.getClass(), "day", (short) 4);
        setField(term28534, term28534.getClass(), "date", term28535);
        setByteField(term28539, term28539.getClass(), "hour", (byte) 17);
        setByteField(term28539, term28539.getClass(), "minute", (byte) 39);
        setByteField(term28539, term28539.getClass(), "second", (byte) 5);
        setIntField(term28539, term28539.getClass(), "nano", 712424493);
        setField(term28534, term28534.getClass(), "time", term28539);
        setField(term28469, term28469.getClass(), "createdAt", term28534);
        setIntField(term28545, term28545.getClass(), "year", 2012);
        setShortField(term28545, term28545.getClass(), "month", (short) 1);
        setShortField(term28545, term28545.getClass(), "day", (short) 27);
        setField(term28544, term28544.getClass(), "date", term28545);
        setByteField(term28549, term28549.getClass(), "hour", (byte) 3);
        setByteField(term28549, term28549.getClass(), "minute", (byte) 30);
        setByteField(term28549, term28549.getClass(), "second", (byte) 25);
        setIntField(term28549, term28549.getClass(), "nano", 460782173);
        setField(term28544, term28544.getClass(), "time", term28549);
        setField(term28469, term28469.getClass(), "updatedAt", term28544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qFGKIJjlmV";
        callMethod(klass, "password", argTypes, term28469, args);
    }

};


