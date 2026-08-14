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

public class Role_setUpdatedAt_146151107411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23832;
     Object term23867;

    public Role_setUpdatedAt_146151107411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23833 = new Long(-894705411488729365L);
        term23832 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term23847 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23848 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23852 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23857 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23858 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23862 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23832, term23832.getClass(), "id", term23833);
        setField(term23832, term23832.getClass(), "name", "NTlKJDDWlk");
        setIntField(term23848, term23848.getClass(), "year", 2022);
        setShortField(term23848, term23848.getClass(), "month", (short) 10);
        setShortField(term23848, term23848.getClass(), "day", (short) 14);
        setField(term23847, term23847.getClass(), "date", term23848);
        setByteField(term23852, term23852.getClass(), "hour", (byte) 7);
        setByteField(term23852, term23852.getClass(), "minute", (byte) 29);
        setByteField(term23852, term23852.getClass(), "second", (byte) 42);
        setIntField(term23852, term23852.getClass(), "nano", 962865996);
        setField(term23847, term23847.getClass(), "time", term23852);
        setField(term23832, term23832.getClass(), "createdAt", term23847);
        setIntField(term23858, term23858.getClass(), "year", 2026);
        setShortField(term23858, term23858.getClass(), "month", (short) 7);
        setShortField(term23858, term23858.getClass(), "day", (short) 18);
        setField(term23857, term23857.getClass(), "date", term23858);
        setByteField(term23862, term23862.getClass(), "hour", (byte) 14);
        setByteField(term23862, term23862.getClass(), "minute", (byte) 29);
        setByteField(term23862, term23862.getClass(), "second", (byte) 53);
        setIntField(term23862, term23862.getClass(), "nano", 285756900);
        setField(term23857, term23857.getClass(), "time", term23862);
        setField(term23832, term23832.getClass(), "updatedAt", term23857);
        term23867 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23868 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23872 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term23868, term23868.getClass(), "year", 2012);
        setShortField(term23868, term23868.getClass(), "month", (short) 2);
        setShortField(term23868, term23868.getClass(), "day", (short) 2);
        setField(term23867, term23867.getClass(), "date", term23868);
        setByteField(term23872, term23872.getClass(), "hour", (byte) 4);
        setByteField(term23872, term23872.getClass(), "minute", (byte) 19);
        setByteField(term23872, term23872.getClass(), "second", (byte) 58);
        setIntField(term23872, term23872.getClass(), "nano", 550709112);
        setField(term23867, term23867.getClass(), "time", term23872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term23867;
        callMethod(klass, "setUpdatedAt", argTypes, term23832, args);
    }

};


