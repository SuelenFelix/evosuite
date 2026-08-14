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

public class Role_getName_2029275295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23528;

    public Role_getName_2029275295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23529 = new Long(2985226914509512766L);
        term23528 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term23543 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23544 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23548 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23558 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23528, term23528.getClass(), "id", term23529);
        setField(term23528, term23528.getClass(), "name", "iIRsCSYqXH");
        setIntField(term23544, term23544.getClass(), "year", 2023);
        setShortField(term23544, term23544.getClass(), "month", (short) 5);
        setShortField(term23544, term23544.getClass(), "day", (short) 8);
        setField(term23543, term23543.getClass(), "date", term23544);
        setByteField(term23548, term23548.getClass(), "hour", (byte) 6);
        setByteField(term23548, term23548.getClass(), "minute", (byte) 35);
        setByteField(term23548, term23548.getClass(), "second", (byte) 9);
        setIntField(term23548, term23548.getClass(), "nano", 577816079);
        setField(term23543, term23543.getClass(), "time", term23548);
        setField(term23528, term23528.getClass(), "createdAt", term23543);
        setIntField(term23554, term23554.getClass(), "year", 2019);
        setShortField(term23554, term23554.getClass(), "month", (short) 12);
        setShortField(term23554, term23554.getClass(), "day", (short) 13);
        setField(term23553, term23553.getClass(), "date", term23554);
        setByteField(term23558, term23558.getClass(), "hour", (byte) 7);
        setByteField(term23558, term23558.getClass(), "minute", (byte) 59);
        setByteField(term23558, term23558.getClass(), "second", (byte) 40);
        setIntField(term23558, term23558.getClass(), "nano", 824164134);
        setField(term23553, term23553.getClass(), "time", term23558);
        setField(term23528, term23528.getClass(), "updatedAt", term23553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term23528, args);
    }

};


