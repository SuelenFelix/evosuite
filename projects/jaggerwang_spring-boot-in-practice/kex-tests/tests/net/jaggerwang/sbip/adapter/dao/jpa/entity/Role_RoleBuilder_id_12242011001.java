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

public class Role_RoleBuilder_id_12242011001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23028;
     Object term23063;

    public Role_RoleBuilder_id_12242011001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23029 = new Long(9160882370265093763L);
        term23028 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role$RoleBuilder"));
        Object term23043 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23044 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23048 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23053 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23054 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23058 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23028, term23028.getClass(), "id", term23029);
        setField(term23028, term23028.getClass(), "name", "EwQBhZjCIT");
        setIntField(term23044, term23044.getClass(), "year", 2025);
        setShortField(term23044, term23044.getClass(), "month", (short) 4);
        setShortField(term23044, term23044.getClass(), "day", (short) 6);
        setField(term23043, term23043.getClass(), "date", term23044);
        setByteField(term23048, term23048.getClass(), "hour", (byte) 23);
        setByteField(term23048, term23048.getClass(), "minute", (byte) 17);
        setByteField(term23048, term23048.getClass(), "second", (byte) 11);
        setIntField(term23048, term23048.getClass(), "nano", 928165672);
        setField(term23043, term23043.getClass(), "time", term23048);
        setField(term23028, term23028.getClass(), "createdAt", term23043);
        setIntField(term23054, term23054.getClass(), "year", 2022);
        setShortField(term23054, term23054.getClass(), "month", (short) 3);
        setShortField(term23054, term23054.getClass(), "day", (short) 20);
        setField(term23053, term23053.getClass(), "date", term23054);
        setByteField(term23058, term23058.getClass(), "hour", (byte) 20);
        setByteField(term23058, term23058.getClass(), "minute", (byte) 31);
        setByteField(term23058, term23058.getClass(), "second", (byte) 56);
        setIntField(term23058, term23058.getClass(), "nano", 682853702);
        setField(term23053, term23053.getClass(), "time", term23058);
        setField(term23028, term23028.getClass(), "updatedAt", term23053);
        term23063 = new Long(6848008460134431064L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role$RoleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term23063;
        callMethod(klass, "id", argTypes, term23028, args);
    }

};


