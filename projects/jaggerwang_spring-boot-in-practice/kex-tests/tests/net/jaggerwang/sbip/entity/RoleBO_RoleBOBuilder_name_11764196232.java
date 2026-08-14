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

public class RoleBO_RoleBOBuilder_name_11764196232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19814;

    public RoleBO_RoleBOBuilder_name_11764196232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19815 = new Long(-7400951017937830861L);
        term19814 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO$RoleBOBuilder"));
        Object term19829 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19830 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19834 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19844 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term19814, term19814.getClass(), "id", term19815);
        setField(term19814, term19814.getClass(), "name", "OqbwYQfvAe");
        setIntField(term19830, term19830.getClass(), "year", 2019);
        setShortField(term19830, term19830.getClass(), "month", (short) 7);
        setShortField(term19830, term19830.getClass(), "day", (short) 4);
        setField(term19829, term19829.getClass(), "date", term19830);
        setByteField(term19834, term19834.getClass(), "hour", (byte) 19);
        setByteField(term19834, term19834.getClass(), "minute", (byte) 20);
        setByteField(term19834, term19834.getClass(), "second", (byte) 59);
        setIntField(term19834, term19834.getClass(), "nano", 246784352);
        setField(term19829, term19829.getClass(), "time", term19834);
        setField(term19814, term19814.getClass(), "createdAt", term19829);
        setIntField(term19840, term19840.getClass(), "year", 2023);
        setShortField(term19840, term19840.getClass(), "month", (short) 7);
        setShortField(term19840, term19840.getClass(), "day", (short) 1);
        setField(term19839, term19839.getClass(), "date", term19840);
        setByteField(term19844, term19844.getClass(), "hour", (byte) 4);
        setByteField(term19844, term19844.getClass(), "minute", (byte) 33);
        setByteField(term19844, term19844.getClass(), "second", (byte) 9);
        setIntField(term19844, term19844.getClass(), "nano", 94365310);
        setField(term19839, term19839.getClass(), "time", term19844);
        setField(term19814, term19814.getClass(), "updatedAt", term19839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO$RoleBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tRxZafjqIx";
        callMethod(klass, "name", argTypes, term19814, args);
    }

};


