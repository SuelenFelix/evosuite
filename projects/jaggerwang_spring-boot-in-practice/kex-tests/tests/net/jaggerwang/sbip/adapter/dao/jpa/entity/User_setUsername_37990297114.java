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

public class User_setUsername_37990297114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29228;

    public User_setUsername_37990297114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29229 = new Long(-7087265016767824631L);
        Long term29279 = new Long(-8121348431673567857L);
        term29228 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term29293 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29294 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29298 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29308 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29228, term29228.getClass(), "id", term29229);
        setField(term29228, term29228.getClass(), "username", "PJcSNDruWd");
        setField(term29228, term29228.getClass(), "password", "VVNNlAePXF");
        setField(term29228, term29228.getClass(), "mobile", "jnwVnmKAFv");
        setField(term29228, term29228.getClass(), "email", "TXyHhqeCjR");
        setField(term29228, term29228.getClass(), "avatarId", term29279);
        setField(term29228, term29228.getClass(), "intro", "lZIgPZPgTu");
        setIntField(term29294, term29294.getClass(), "year", 2018);
        setShortField(term29294, term29294.getClass(), "month", (short) 12);
        setShortField(term29294, term29294.getClass(), "day", (short) 9);
        setField(term29293, term29293.getClass(), "date", term29294);
        setByteField(term29298, term29298.getClass(), "hour", (byte) 11);
        setByteField(term29298, term29298.getClass(), "minute", (byte) 17);
        setByteField(term29298, term29298.getClass(), "second", (byte) 16);
        setIntField(term29298, term29298.getClass(), "nano", 832353222);
        setField(term29293, term29293.getClass(), "time", term29298);
        setField(term29228, term29228.getClass(), "createdAt", term29293);
        setIntField(term29304, term29304.getClass(), "year", 2022);
        setShortField(term29304, term29304.getClass(), "month", (short) 10);
        setShortField(term29304, term29304.getClass(), "day", (short) 18);
        setField(term29303, term29303.getClass(), "date", term29304);
        setByteField(term29308, term29308.getClass(), "hour", (byte) 21);
        setByteField(term29308, term29308.getClass(), "minute", (byte) 51);
        setByteField(term29308, term29308.getClass(), "second", (byte) 0);
        setIntField(term29308, term29308.getClass(), "nano", 906699884);
        setField(term29303, term29303.getClass(), "time", term29308);
        setField(term29228, term29228.getClass(), "updatedAt", term29303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iuCxnHGMoW";
        callMethod(klass, "setUsername", argTypes, term29228, args);
    }

};


