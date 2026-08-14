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

public class User_UserBuilder_createdAt_1548551898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13070;
     Object term13155;

    public User_UserBuilder_createdAt_1548551898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13071 = new Long(8073378116544724166L);
        Long term13121 = new Long(-8303973304709662279L);
        term13070 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder"));
        Object term13135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13140 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13150 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13070, term13070.getClass(), "id", term13071);
        setField(term13070, term13070.getClass(), "username", "fztQhjqwdP");
        setField(term13070, term13070.getClass(), "password", "eVpkWxjuki");
        setField(term13070, term13070.getClass(), "mobile", "SJiQaLvSKv");
        setField(term13070, term13070.getClass(), "email", "OEXDRUKcFl");
        setField(term13070, term13070.getClass(), "avatarId", term13121);
        setField(term13070, term13070.getClass(), "intro", "RYdKCNNMBR");
        setIntField(term13136, term13136.getClass(), "year", 2013);
        setShortField(term13136, term13136.getClass(), "month", (short) 10);
        setShortField(term13136, term13136.getClass(), "day", (short) 7);
        setField(term13135, term13135.getClass(), "date", term13136);
        setByteField(term13140, term13140.getClass(), "hour", (byte) 12);
        setByteField(term13140, term13140.getClass(), "minute", (byte) 2);
        setByteField(term13140, term13140.getClass(), "second", (byte) 42);
        setIntField(term13140, term13140.getClass(), "nano", 202308437);
        setField(term13135, term13135.getClass(), "time", term13140);
        setField(term13070, term13070.getClass(), "createdAt", term13135);
        setIntField(term13146, term13146.getClass(), "year", 2019);
        setShortField(term13146, term13146.getClass(), "month", (short) 12);
        setShortField(term13146, term13146.getClass(), "day", (short) 29);
        setField(term13145, term13145.getClass(), "date", term13146);
        setByteField(term13150, term13150.getClass(), "hour", (byte) 16);
        setByteField(term13150, term13150.getClass(), "minute", (byte) 10);
        setByteField(term13150, term13150.getClass(), "second", (byte) 1);
        setIntField(term13150, term13150.getClass(), "nano", 198559584);
        setField(term13145, term13145.getClass(), "time", term13150);
        setField(term13070, term13070.getClass(), "updatedAt", term13145);
        term13155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13160 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13156, term13156.getClass(), "year", 2022);
        setShortField(term13156, term13156.getClass(), "month", (short) 5);
        setShortField(term13156, term13156.getClass(), "day", (short) 29);
        setField(term13155, term13155.getClass(), "date", term13156);
        setByteField(term13160, term13160.getClass(), "hour", (byte) 11);
        setByteField(term13160, term13160.getClass(), "minute", (byte) 41);
        setByteField(term13160, term13160.getClass(), "second", (byte) 43);
        setIntField(term13160, term13160.getClass(), "nano", 984890757);
        setField(term13155, term13155.getClass(), "time", term13160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term13155;
        callMethod(klass, "createdAt", argTypes, term13070, args);
    }

};


