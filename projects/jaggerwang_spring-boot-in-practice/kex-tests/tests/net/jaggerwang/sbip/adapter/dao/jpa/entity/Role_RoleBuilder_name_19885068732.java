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

public class Role_RoleBuilder_name_19885068732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23075;

    public Role_RoleBuilder_name_19885068732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23076 = new Long(-5338413783740215067L);
        term23075 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role$RoleBuilder"));
        Object term23090 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23091 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23095 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23101 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23105 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23075, term23075.getClass(), "id", term23076);
        setField(term23075, term23075.getClass(), "name", "aSkmSwTnEw");
        setIntField(term23091, term23091.getClass(), "year", 2016);
        setShortField(term23091, term23091.getClass(), "month", (short) 5);
        setShortField(term23091, term23091.getClass(), "day", (short) 9);
        setField(term23090, term23090.getClass(), "date", term23091);
        setByteField(term23095, term23095.getClass(), "hour", (byte) 1);
        setByteField(term23095, term23095.getClass(), "minute", (byte) 20);
        setByteField(term23095, term23095.getClass(), "second", (byte) 56);
        setIntField(term23095, term23095.getClass(), "nano", 198437232);
        setField(term23090, term23090.getClass(), "time", term23095);
        setField(term23075, term23075.getClass(), "createdAt", term23090);
        setIntField(term23101, term23101.getClass(), "year", 2021);
        setShortField(term23101, term23101.getClass(), "month", (short) 2);
        setShortField(term23101, term23101.getClass(), "day", (short) 5);
        setField(term23100, term23100.getClass(), "date", term23101);
        setByteField(term23105, term23105.getClass(), "hour", (byte) 20);
        setByteField(term23105, term23105.getClass(), "minute", (byte) 43);
        setByteField(term23105, term23105.getClass(), "second", (byte) 37);
        setIntField(term23105, term23105.getClass(), "nano", 191661361);
        setField(term23100, term23100.getClass(), "time", term23105);
        setField(term23075, term23075.getClass(), "updatedAt", term23100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role$RoleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xvkbvaEGYd";
        callMethod(klass, "name", argTypes, term23075, args);
    }

};


