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

public class UserRole_UserRoleBuilder_userId_6369664092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27278;
     Object term27305;

    public UserRole_UserRoleBuilder_userId_6369664092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27279 = new Long(-6657309314982735134L);
        Long term27281 = new Long(-685001356309682920L);
        Long term27283 = new Long(-3189918180129674609L);
        term27278 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder"));
        Object term27285 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27286 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27290 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27295 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27296 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27300 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27278, term27278.getClass(), "id", term27279);
        setField(term27278, term27278.getClass(), "userId", term27281);
        setField(term27278, term27278.getClass(), "roleId", term27283);
        setIntField(term27286, term27286.getClass(), "year", 2020);
        setShortField(term27286, term27286.getClass(), "month", (short) 10);
        setShortField(term27286, term27286.getClass(), "day", (short) 10);
        setField(term27285, term27285.getClass(), "date", term27286);
        setByteField(term27290, term27290.getClass(), "hour", (byte) 8);
        setByteField(term27290, term27290.getClass(), "minute", (byte) 35);
        setByteField(term27290, term27290.getClass(), "second", (byte) 54);
        setIntField(term27290, term27290.getClass(), "nano", 115111505);
        setField(term27285, term27285.getClass(), "time", term27290);
        setField(term27278, term27278.getClass(), "createdAt", term27285);
        setIntField(term27296, term27296.getClass(), "year", 2017);
        setShortField(term27296, term27296.getClass(), "month", (short) 10);
        setShortField(term27296, term27296.getClass(), "day", (short) 24);
        setField(term27295, term27295.getClass(), "date", term27296);
        setByteField(term27300, term27300.getClass(), "hour", (byte) 21);
        setByteField(term27300, term27300.getClass(), "minute", (byte) 10);
        setByteField(term27300, term27300.getClass(), "second", (byte) 20);
        setIntField(term27300, term27300.getClass(), "nano", 736076804);
        setField(term27295, term27295.getClass(), "time", term27300);
        setField(term27278, term27278.getClass(), "updatedAt", term27295);
        term27305 = new Long(5271284328066798769L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term27305;
        callMethod(klass, "userId", argTypes, term27278, args);
    }

};


