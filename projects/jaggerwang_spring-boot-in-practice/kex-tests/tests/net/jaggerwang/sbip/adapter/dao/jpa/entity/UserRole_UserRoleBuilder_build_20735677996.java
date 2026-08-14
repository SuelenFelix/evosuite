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

public class UserRole_UserRoleBuilder_build_20735677996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27410;

    public UserRole_UserRoleBuilder_build_20735677996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27411 = new Long(2671083699707412572L);
        Long term27413 = new Long(8940743873279878610L);
        Long term27415 = new Long(-1865007698397606253L);
        term27410 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder"));
        Object term27417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27422 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27432 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27410, term27410.getClass(), "id", term27411);
        setField(term27410, term27410.getClass(), "userId", term27413);
        setField(term27410, term27410.getClass(), "roleId", term27415);
        setIntField(term27418, term27418.getClass(), "year", 2013);
        setShortField(term27418, term27418.getClass(), "month", (short) 1);
        setShortField(term27418, term27418.getClass(), "day", (short) 1);
        setField(term27417, term27417.getClass(), "date", term27418);
        setByteField(term27422, term27422.getClass(), "hour", (byte) 17);
        setByteField(term27422, term27422.getClass(), "minute", (byte) 16);
        setByteField(term27422, term27422.getClass(), "second", (byte) 19);
        setIntField(term27422, term27422.getClass(), "nano", 656333309);
        setField(term27417, term27417.getClass(), "time", term27422);
        setField(term27410, term27410.getClass(), "createdAt", term27417);
        setIntField(term27428, term27428.getClass(), "year", 2012);
        setShortField(term27428, term27428.getClass(), "month", (short) 3);
        setShortField(term27428, term27428.getClass(), "day", (short) 8);
        setField(term27427, term27427.getClass(), "date", term27428);
        setByteField(term27432, term27432.getClass(), "hour", (byte) 18);
        setByteField(term27432, term27432.getClass(), "minute", (byte) 5);
        setByteField(term27432, term27432.getClass(), "second", (byte) 29);
        setIntField(term27432, term27432.getClass(), "nano", 800260160);
        setField(term27427, term27427.getClass(), "time", term27432);
        setField(term27410, term27410.getClass(), "updatedAt", term27427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term27410, args);
    }

};


