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

public class Role_prePersist_77945822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23438;

    public Role_prePersist_77945822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23439 = new Long(7875739215674729968L);
        term23438 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term23453 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23454 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23458 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23463 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23464 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23468 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23438, term23438.getClass(), "id", term23439);
        setField(term23438, term23438.getClass(), "name", "IpQuOGMgmj");
        setIntField(term23454, term23454.getClass(), "year", 2015);
        setShortField(term23454, term23454.getClass(), "month", (short) 4);
        setShortField(term23454, term23454.getClass(), "day", (short) 14);
        setField(term23453, term23453.getClass(), "date", term23454);
        setByteField(term23458, term23458.getClass(), "hour", (byte) 23);
        setByteField(term23458, term23458.getClass(), "minute", (byte) 8);
        setByteField(term23458, term23458.getClass(), "second", (byte) 53);
        setIntField(term23458, term23458.getClass(), "nano", 375234559);
        setField(term23453, term23453.getClass(), "time", term23458);
        setField(term23438, term23438.getClass(), "createdAt", term23453);
        setIntField(term23464, term23464.getClass(), "year", 2018);
        setShortField(term23464, term23464.getClass(), "month", (short) 1);
        setShortField(term23464, term23464.getClass(), "day", (short) 29);
        setField(term23463, term23463.getClass(), "date", term23464);
        setByteField(term23468, term23468.getClass(), "hour", (byte) 17);
        setByteField(term23468, term23468.getClass(), "minute", (byte) 5);
        setByteField(term23468, term23468.getClass(), "second", (byte) 53);
        setIntField(term23468, term23468.getClass(), "nano", 36624440);
        setField(term23463, term23463.getClass(), "time", term23468);
        setField(term23438, term23438.getClass(), "updatedAt", term23463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prePersist", argTypes, term23438, args);
    }

};


