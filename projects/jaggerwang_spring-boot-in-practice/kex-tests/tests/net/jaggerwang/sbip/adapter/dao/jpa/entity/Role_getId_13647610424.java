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

public class Role_getId_13647610424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23483;

    public Role_getId_13647610424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23484 = new Long(-8605430501912680279L);
        term23483 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term23498 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23499 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23503 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23508 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23509 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23513 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23483, term23483.getClass(), "id", term23484);
        setField(term23483, term23483.getClass(), "name", "pJbnHTYrxn");
        setIntField(term23499, term23499.getClass(), "year", 2022);
        setShortField(term23499, term23499.getClass(), "month", (short) 12);
        setShortField(term23499, term23499.getClass(), "day", (short) 22);
        setField(term23498, term23498.getClass(), "date", term23499);
        setByteField(term23503, term23503.getClass(), "hour", (byte) 18);
        setByteField(term23503, term23503.getClass(), "minute", (byte) 30);
        setByteField(term23503, term23503.getClass(), "second", (byte) 56);
        setIntField(term23503, term23503.getClass(), "nano", 111391416);
        setField(term23498, term23498.getClass(), "time", term23503);
        setField(term23483, term23483.getClass(), "createdAt", term23498);
        setIntField(term23509, term23509.getClass(), "year", 2019);
        setShortField(term23509, term23509.getClass(), "month", (short) 6);
        setShortField(term23509, term23509.getClass(), "day", (short) 22);
        setField(term23508, term23508.getClass(), "date", term23509);
        setByteField(term23513, term23513.getClass(), "hour", (byte) 9);
        setByteField(term23513, term23513.getClass(), "minute", (byte) 14);
        setByteField(term23513, term23513.getClass(), "second", (byte) 27);
        setIntField(term23513, term23513.getClass(), "nano", 124138657);
        setField(term23508, term23508.getClass(), "time", term23513);
        setField(term23483, term23483.getClass(), "updatedAt", term23508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term23483, args);
    }

};


