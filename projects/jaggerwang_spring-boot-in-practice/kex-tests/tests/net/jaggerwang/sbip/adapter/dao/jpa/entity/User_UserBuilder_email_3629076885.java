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

public class User_UserBuilder_email_3629076885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12619;

    public User_UserBuilder_email_3629076885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12620 = new Long(-1465819833800717311L);
        Long term12670 = new Long(-8306611953768020559L);
        term12619 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder"));
        Object term12684 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12685 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12689 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12694 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12695 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12699 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12619, term12619.getClass(), "id", term12620);
        setField(term12619, term12619.getClass(), "username", "GVizqqzXpy");
        setField(term12619, term12619.getClass(), "password", "JqXGgAhZPl");
        setField(term12619, term12619.getClass(), "mobile", "jiKYgYHqIS");
        setField(term12619, term12619.getClass(), "email", "DfISiziTgG");
        setField(term12619, term12619.getClass(), "avatarId", term12670);
        setField(term12619, term12619.getClass(), "intro", "XqgfKFvPSD");
        setIntField(term12685, term12685.getClass(), "year", 2022);
        setShortField(term12685, term12685.getClass(), "month", (short) 12);
        setShortField(term12685, term12685.getClass(), "day", (short) 19);
        setField(term12684, term12684.getClass(), "date", term12685);
        setByteField(term12689, term12689.getClass(), "hour", (byte) 11);
        setByteField(term12689, term12689.getClass(), "minute", (byte) 25);
        setByteField(term12689, term12689.getClass(), "second", (byte) 6);
        setIntField(term12689, term12689.getClass(), "nano", 620469872);
        setField(term12684, term12684.getClass(), "time", term12689);
        setField(term12619, term12619.getClass(), "createdAt", term12684);
        setIntField(term12695, term12695.getClass(), "year", 2013);
        setShortField(term12695, term12695.getClass(), "month", (short) 5);
        setShortField(term12695, term12695.getClass(), "day", (short) 3);
        setField(term12694, term12694.getClass(), "date", term12695);
        setByteField(term12699, term12699.getClass(), "hour", (byte) 18);
        setByteField(term12699, term12699.getClass(), "minute", (byte) 52);
        setByteField(term12699, term12699.getClass(), "second", (byte) 15);
        setIntField(term12699, term12699.getClass(), "nano", 241685081);
        setField(term12694, term12694.getClass(), "time", term12699);
        setField(term12619, term12619.getClass(), "updatedAt", term12694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JiVRgTZvKc";
        callMethod(klass, "email", argTypes, term12619, args);
    }

};


