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

public class User_getAvatarId_7418535909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28551;

    public User_getAvatarId_7418535909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28552 = new Long(5307445998877056304L);
        Long term28602 = new Long(-8148408579143384073L);
        term28551 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term28616 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28617 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28621 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28626 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28627 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28631 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28551, term28551.getClass(), "id", term28552);
        setField(term28551, term28551.getClass(), "username", "THZSpzBRYP");
        setField(term28551, term28551.getClass(), "password", "ZfBIVGBQOE");
        setField(term28551, term28551.getClass(), "mobile", "QSrDQfEsTR");
        setField(term28551, term28551.getClass(), "email", "PsqusYmejD");
        setField(term28551, term28551.getClass(), "avatarId", term28602);
        setField(term28551, term28551.getClass(), "intro", "NTWMiBEaDF");
        setIntField(term28617, term28617.getClass(), "year", 2018);
        setShortField(term28617, term28617.getClass(), "month", (short) 11);
        setShortField(term28617, term28617.getClass(), "day", (short) 23);
        setField(term28616, term28616.getClass(), "date", term28617);
        setByteField(term28621, term28621.getClass(), "hour", (byte) 15);
        setByteField(term28621, term28621.getClass(), "minute", (byte) 21);
        setByteField(term28621, term28621.getClass(), "second", (byte) 39);
        setIntField(term28621, term28621.getClass(), "nano", 255623386);
        setField(term28616, term28616.getClass(), "time", term28621);
        setField(term28551, term28551.getClass(), "createdAt", term28616);
        setIntField(term28627, term28627.getClass(), "year", 2016);
        setShortField(term28627, term28627.getClass(), "month", (short) 11);
        setShortField(term28627, term28627.getClass(), "day", (short) 8);
        setField(term28626, term28626.getClass(), "date", term28627);
        setByteField(term28631, term28631.getClass(), "hour", (byte) 7);
        setByteField(term28631, term28631.getClass(), "minute", (byte) 33);
        setByteField(term28631, term28631.getClass(), "second", (byte) 30);
        setIntField(term28631, term28631.getClass(), "nano", 274725601);
        setField(term28626, term28626.getClass(), "time", term28631);
        setField(term28551, term28551.getClass(), "updatedAt", term28626);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarId", argTypes, term28551, args);
    }

};


