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

public class UserRole_UserRoleBuilder_id_3669259401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27249;
     Object term27276;

    public UserRole_UserRoleBuilder_id_3669259401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27250 = new Long(8495724482241106293L);
        Long term27252 = new Long(-4318584834500248968L);
        Long term27254 = new Long(-7839957570751440706L);
        term27249 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder"));
        Object term27256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27261 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27271 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27249, term27249.getClass(), "id", term27250);
        setField(term27249, term27249.getClass(), "userId", term27252);
        setField(term27249, term27249.getClass(), "roleId", term27254);
        setIntField(term27257, term27257.getClass(), "year", 2029);
        setShortField(term27257, term27257.getClass(), "month", (short) 2);
        setShortField(term27257, term27257.getClass(), "day", (short) 4);
        setField(term27256, term27256.getClass(), "date", term27257);
        setByteField(term27261, term27261.getClass(), "hour", (byte) 18);
        setByteField(term27261, term27261.getClass(), "minute", (byte) 31);
        setByteField(term27261, term27261.getClass(), "second", (byte) 27);
        setIntField(term27261, term27261.getClass(), "nano", 737016275);
        setField(term27256, term27256.getClass(), "time", term27261);
        setField(term27249, term27249.getClass(), "createdAt", term27256);
        setIntField(term27267, term27267.getClass(), "year", 2022);
        setShortField(term27267, term27267.getClass(), "month", (short) 3);
        setShortField(term27267, term27267.getClass(), "day", (short) 27);
        setField(term27266, term27266.getClass(), "date", term27267);
        setByteField(term27271, term27271.getClass(), "hour", (byte) 18);
        setByteField(term27271, term27271.getClass(), "minute", (byte) 52);
        setByteField(term27271, term27271.getClass(), "second", (byte) 30);
        setIntField(term27271, term27271.getClass(), "nano", 610437590);
        setField(term27266, term27266.getClass(), "time", term27271);
        setField(term27249, term27249.getClass(), "updatedAt", term27266);
        term27276 = new Long(-4944032768681866361L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term27276;
        callMethod(klass, "id", argTypes, term27249, args);
    }

};


