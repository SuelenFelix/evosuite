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

public class Role_getUpdatedAt_17923019467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23618;

    public Role_getUpdatedAt_17923019467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23619 = new Long(7199459243454109261L);
        term23618 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term23633 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23634 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23638 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23648 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23618, term23618.getClass(), "id", term23619);
        setField(term23618, term23618.getClass(), "name", "WBAOTqErtm");
        setIntField(term23634, term23634.getClass(), "year", 2023);
        setShortField(term23634, term23634.getClass(), "month", (short) 4);
        setShortField(term23634, term23634.getClass(), "day", (short) 10);
        setField(term23633, term23633.getClass(), "date", term23634);
        setByteField(term23638, term23638.getClass(), "hour", (byte) 19);
        setByteField(term23638, term23638.getClass(), "minute", (byte) 34);
        setByteField(term23638, term23638.getClass(), "second", (byte) 41);
        setIntField(term23638, term23638.getClass(), "nano", 911888376);
        setField(term23633, term23633.getClass(), "time", term23638);
        setField(term23618, term23618.getClass(), "createdAt", term23633);
        setIntField(term23644, term23644.getClass(), "year", 2014);
        setShortField(term23644, term23644.getClass(), "month", (short) 2);
        setShortField(term23644, term23644.getClass(), "day", (short) 5);
        setField(term23643, term23643.getClass(), "date", term23644);
        setByteField(term23648, term23648.getClass(), "hour", (byte) 14);
        setByteField(term23648, term23648.getClass(), "minute", (byte) 2);
        setByteField(term23648, term23648.getClass(), "second", (byte) 4);
        setIntField(term23648, term23648.getClass(), "nano", 458277660);
        setField(term23643, term23643.getClass(), "time", term23648);
        setField(term23618, term23618.getClass(), "updatedAt", term23643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term23618, args);
    }

};


