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

public class User_getUpdatedAt_179518534912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28956;

    public User_getUpdatedAt_179518534912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28957 = new Long(-4726601557653351735L);
        Long term29007 = new Long(-3502423991725415780L);
        term28956 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term29021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29026 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29036 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28956, term28956.getClass(), "id", term28957);
        setField(term28956, term28956.getClass(), "username", "UDaboHZHhz");
        setField(term28956, term28956.getClass(), "password", "nRvKihUSPj");
        setField(term28956, term28956.getClass(), "mobile", "BbNeQJpYPr");
        setField(term28956, term28956.getClass(), "email", "riMtzCoxNj");
        setField(term28956, term28956.getClass(), "avatarId", term29007);
        setField(term28956, term28956.getClass(), "intro", "YAXkVjQZcV");
        setIntField(term29022, term29022.getClass(), "year", 2015);
        setShortField(term29022, term29022.getClass(), "month", (short) 11);
        setShortField(term29022, term29022.getClass(), "day", (short) 6);
        setField(term29021, term29021.getClass(), "date", term29022);
        setByteField(term29026, term29026.getClass(), "hour", (byte) 5);
        setByteField(term29026, term29026.getClass(), "minute", (byte) 30);
        setByteField(term29026, term29026.getClass(), "second", (byte) 37);
        setIntField(term29026, term29026.getClass(), "nano", 396534729);
        setField(term29021, term29021.getClass(), "time", term29026);
        setField(term28956, term28956.getClass(), "createdAt", term29021);
        setIntField(term29032, term29032.getClass(), "year", 2013);
        setShortField(term29032, term29032.getClass(), "month", (short) 1);
        setShortField(term29032, term29032.getClass(), "day", (short) 4);
        setField(term29031, term29031.getClass(), "date", term29032);
        setByteField(term29036, term29036.getClass(), "hour", (byte) 22);
        setByteField(term29036, term29036.getClass(), "minute", (byte) 8);
        setByteField(term29036, term29036.getClass(), "second", (byte) 55);
        setIntField(term29036, term29036.getClass(), "nano", 284915768);
        setField(term29031, term29031.getClass(), "time", term29036);
        setField(term28956, term28956.getClass(), "updatedAt", term29031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term28956, args);
    }

};


