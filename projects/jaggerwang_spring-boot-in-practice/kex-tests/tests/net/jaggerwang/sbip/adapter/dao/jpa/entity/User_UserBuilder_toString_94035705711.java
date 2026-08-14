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

public class User_UserBuilder_toString_94035705711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13495;

    public User_UserBuilder_toString_94035705711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13496 = new Long(-7400951017937830861L);
        Long term13546 = new Long(-8993073054427011802L);
        term13495 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder"));
        Object term13560 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13561 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13565 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13570 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13571 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13575 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13495, term13495.getClass(), "id", term13496);
        setField(term13495, term13495.getClass(), "username", "AdxvLJhNLe");
        setField(term13495, term13495.getClass(), "password", "lHfTrWKMPk");
        setField(term13495, term13495.getClass(), "mobile", "JDaAnsVTGV");
        setField(term13495, term13495.getClass(), "email", "mLUZFTfjle");
        setField(term13495, term13495.getClass(), "avatarId", term13546);
        setField(term13495, term13495.getClass(), "intro", "xIeFjkHkOe");
        setIntField(term13561, term13561.getClass(), "year", 2020);
        setShortField(term13561, term13561.getClass(), "month", (short) 12);
        setShortField(term13561, term13561.getClass(), "day", (short) 30);
        setField(term13560, term13560.getClass(), "date", term13561);
        setByteField(term13565, term13565.getClass(), "hour", (byte) 2);
        setByteField(term13565, term13565.getClass(), "minute", (byte) 11);
        setByteField(term13565, term13565.getClass(), "second", (byte) 8);
        setIntField(term13565, term13565.getClass(), "nano", 528799251);
        setField(term13560, term13560.getClass(), "time", term13565);
        setField(term13495, term13495.getClass(), "createdAt", term13560);
        setIntField(term13571, term13571.getClass(), "year", 2027);
        setShortField(term13571, term13571.getClass(), "month", (short) 9);
        setShortField(term13571, term13571.getClass(), "day", (short) 29);
        setField(term13570, term13570.getClass(), "date", term13571);
        setByteField(term13575, term13575.getClass(), "hour", (byte) 19);
        setByteField(term13575, term13575.getClass(), "minute", (byte) 13);
        setByteField(term13575, term13575.getClass(), "second", (byte) 31);
        setIntField(term13575, term13575.getClass(), "nano", 854066575);
        setField(term13570, term13570.getClass(), "time", term13575);
        setField(term13495, term13495.getClass(), "updatedAt", term13570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13495, args);
    }

};


