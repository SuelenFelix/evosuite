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

public class Role_RoleBuilder_createdAt_19293298993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23142;
     Object term23177;

    public Role_RoleBuilder_createdAt_19293298993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23143 = new Long(-814922776357887557L);
        term23142 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role$RoleBuilder"));
        Object term23157 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23158 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23162 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23167 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23168 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23172 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23142, term23142.getClass(), "id", term23143);
        setField(term23142, term23142.getClass(), "name", "HBGNxdNURv");
        setIntField(term23158, term23158.getClass(), "year", 2014);
        setShortField(term23158, term23158.getClass(), "month", (short) 5);
        setShortField(term23158, term23158.getClass(), "day", (short) 18);
        setField(term23157, term23157.getClass(), "date", term23158);
        setByteField(term23162, term23162.getClass(), "hour", (byte) 19);
        setByteField(term23162, term23162.getClass(), "minute", (byte) 25);
        setByteField(term23162, term23162.getClass(), "second", (byte) 8);
        setIntField(term23162, term23162.getClass(), "nano", 217186771);
        setField(term23157, term23157.getClass(), "time", term23162);
        setField(term23142, term23142.getClass(), "createdAt", term23157);
        setIntField(term23168, term23168.getClass(), "year", 2023);
        setShortField(term23168, term23168.getClass(), "month", (short) 2);
        setShortField(term23168, term23168.getClass(), "day", (short) 27);
        setField(term23167, term23167.getClass(), "date", term23168);
        setByteField(term23172, term23172.getClass(), "hour", (byte) 5);
        setByteField(term23172, term23172.getClass(), "minute", (byte) 50);
        setByteField(term23172, term23172.getClass(), "second", (byte) 50);
        setIntField(term23172, term23172.getClass(), "nano", 528521692);
        setField(term23167, term23167.getClass(), "time", term23172);
        setField(term23142, term23142.getClass(), "updatedAt", term23167);
        term23177 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23182 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term23178, term23178.getClass(), "year", 2017);
        setShortField(term23178, term23178.getClass(), "month", (short) 1);
        setShortField(term23178, term23178.getClass(), "day", (short) 4);
        setField(term23177, term23177.getClass(), "date", term23178);
        setByteField(term23182, term23182.getClass(), "hour", (byte) 17);
        setByteField(term23182, term23182.getClass(), "minute", (byte) 39);
        setByteField(term23182, term23182.getClass(), "second", (byte) 5);
        setIntField(term23182, term23182.getClass(), "nano", 712424493);
        setField(term23177, term23177.getClass(), "time", term23182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role$RoleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term23177;
        callMethod(klass, "createdAt", argTypes, term23142, args);
    }

};


