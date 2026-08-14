package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class RoleBO_RoleBOBuilder_createdAt_7992890993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19881;
     Object term19916;

    public RoleBO_RoleBOBuilder_createdAt_7992890993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19882 = new Long(-8993073054427011802L);
        term19881 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO$RoleBOBuilder"));
        Object term19896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19901 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19906 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19907 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19911 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term19881, term19881.getClass(), "id", term19882);
        setField(term19881, term19881.getClass(), "name", "DhjNLmRMCu");
        setIntField(term19897, term19897.getClass(), "year", 2013);
        setShortField(term19897, term19897.getClass(), "month", (short) 10);
        setShortField(term19897, term19897.getClass(), "day", (short) 7);
        setField(term19896, term19896.getClass(), "date", term19897);
        setByteField(term19901, term19901.getClass(), "hour", (byte) 12);
        setByteField(term19901, term19901.getClass(), "minute", (byte) 2);
        setByteField(term19901, term19901.getClass(), "second", (byte) 42);
        setIntField(term19901, term19901.getClass(), "nano", 202308437);
        setField(term19896, term19896.getClass(), "time", term19901);
        setField(term19881, term19881.getClass(), "createdAt", term19896);
        setIntField(term19907, term19907.getClass(), "year", 2019);
        setShortField(term19907, term19907.getClass(), "month", (short) 12);
        setShortField(term19907, term19907.getClass(), "day", (short) 29);
        setField(term19906, term19906.getClass(), "date", term19907);
        setByteField(term19911, term19911.getClass(), "hour", (byte) 16);
        setByteField(term19911, term19911.getClass(), "minute", (byte) 10);
        setByteField(term19911, term19911.getClass(), "second", (byte) 1);
        setIntField(term19911, term19911.getClass(), "nano", 198559584);
        setField(term19906, term19906.getClass(), "time", term19911);
        setField(term19881, term19881.getClass(), "updatedAt", term19906);
        term19916 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19917 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19921 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term19917, term19917.getClass(), "year", 2022);
        setShortField(term19917, term19917.getClass(), "month", (short) 5);
        setShortField(term19917, term19917.getClass(), "day", (short) 29);
        setField(term19916, term19916.getClass(), "date", term19917);
        setByteField(term19921, term19921.getClass(), "hour", (byte) 11);
        setByteField(term19921, term19921.getClass(), "minute", (byte) 41);
        setByteField(term19921, term19921.getClass(), "second", (byte) 43);
        setIntField(term19921, term19921.getClass(), "nano", 984890757);
        setField(term19916, term19916.getClass(), "time", term19921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO$RoleBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term19916;
        callMethod(klass, "createdAt", argTypes, term19881, args);
    }

};


