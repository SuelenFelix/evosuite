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

public class UserFollow_setFollowingId_799763258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11727;
     Object term11754;

    public UserFollow_setFollowingId_799763258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11728 = new Long(-1279670138064751276L);
        Long term11730 = new Long(-7205236974351118210L);
        Long term11732 = new Long(-2136893352275781569L);
        term11727 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11739 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11749 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11727, term11727.getClass(), "id", term11728);
        setField(term11727, term11727.getClass(), "followingId", term11730);
        setField(term11727, term11727.getClass(), "followerId", term11732);
        setIntField(term11735, term11735.getClass(), "year", 2018);
        setShortField(term11735, term11735.getClass(), "month", (short) 5);
        setShortField(term11735, term11735.getClass(), "day", (short) 22);
        setField(term11734, term11734.getClass(), "date", term11735);
        setByteField(term11739, term11739.getClass(), "hour", (byte) 16);
        setByteField(term11739, term11739.getClass(), "minute", (byte) 46);
        setByteField(term11739, term11739.getClass(), "second", (byte) 48);
        setIntField(term11739, term11739.getClass(), "nano", 72983043);
        setField(term11734, term11734.getClass(), "time", term11739);
        setField(term11727, term11727.getClass(), "createdAt", term11734);
        setIntField(term11745, term11745.getClass(), "year", 2022);
        setShortField(term11745, term11745.getClass(), "month", (short) 3);
        setShortField(term11745, term11745.getClass(), "day", (short) 16);
        setField(term11744, term11744.getClass(), "date", term11745);
        setByteField(term11749, term11749.getClass(), "hour", (byte) 16);
        setByteField(term11749, term11749.getClass(), "minute", (byte) 35);
        setByteField(term11749, term11749.getClass(), "second", (byte) 38);
        setIntField(term11749, term11749.getClass(), "nano", 79329968);
        setField(term11744, term11744.getClass(), "time", term11749);
        setField(term11727, term11727.getClass(), "updatedAt", term11744);
        term11754 = new Long(-9147545274054597570L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term11754;
        callMethod(klass, "setFollowingId", argTypes, term11727, args);
    }

};


