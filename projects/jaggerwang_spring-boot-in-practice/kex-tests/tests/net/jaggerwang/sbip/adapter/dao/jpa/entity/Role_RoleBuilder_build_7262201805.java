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

public class Role_RoleBuilder_build_7262201805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23252;

    public Role_RoleBuilder_build_7262201805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23253 = new Long(-6983938899150831997L);
        term23252 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role$RoleBuilder"));
        Object term23267 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23268 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23272 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23277 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23278 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23282 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23252, term23252.getClass(), "id", term23253);
        setField(term23252, term23252.getClass(), "name", "OcJCIDNIXA");
        setIntField(term23268, term23268.getClass(), "year", 2021);
        setShortField(term23268, term23268.getClass(), "month", (short) 2);
        setShortField(term23268, term23268.getClass(), "day", (short) 21);
        setField(term23267, term23267.getClass(), "date", term23268);
        setByteField(term23272, term23272.getClass(), "hour", (byte) 4);
        setByteField(term23272, term23272.getClass(), "minute", (byte) 22);
        setByteField(term23272, term23272.getClass(), "second", (byte) 2);
        setIntField(term23272, term23272.getClass(), "nano", 752727543);
        setField(term23267, term23267.getClass(), "time", term23272);
        setField(term23252, term23252.getClass(), "createdAt", term23267);
        setIntField(term23278, term23278.getClass(), "year", 2017);
        setShortField(term23278, term23278.getClass(), "month", (short) 8);
        setShortField(term23278, term23278.getClass(), "day", (short) 30);
        setField(term23277, term23277.getClass(), "date", term23278);
        setByteField(term23282, term23282.getClass(), "hour", (byte) 3);
        setByteField(term23282, term23282.getClass(), "minute", (byte) 48);
        setByteField(term23282, term23282.getClass(), "second", (byte) 37);
        setIntField(term23282, term23282.getClass(), "nano", 121640121);
        setField(term23277, term23277.getClass(), "time", term23282);
        setField(term23252, term23252.getClass(), "updatedAt", term23277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role$RoleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term23252, args);
    }

};


