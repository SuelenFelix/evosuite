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

public class RoleBO_getId_10143046601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29805;

    public RoleBO_getId_10143046601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29806 = new Long(3660520943100987842L);
        term29805 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term29820 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29821 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29825 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29830 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29831 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29835 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29805, term29805.getClass(), "id", term29806);
        setField(term29805, term29805.getClass(), "name", "dkZFDZxcde");
        setIntField(term29821, term29821.getClass(), "year", 2023);
        setShortField(term29821, term29821.getClass(), "month", (short) 4);
        setShortField(term29821, term29821.getClass(), "day", (short) 10);
        setField(term29820, term29820.getClass(), "date", term29821);
        setByteField(term29825, term29825.getClass(), "hour", (byte) 19);
        setByteField(term29825, term29825.getClass(), "minute", (byte) 34);
        setByteField(term29825, term29825.getClass(), "second", (byte) 41);
        setIntField(term29825, term29825.getClass(), "nano", 911888376);
        setField(term29820, term29820.getClass(), "time", term29825);
        setField(term29805, term29805.getClass(), "createdAt", term29820);
        setIntField(term29831, term29831.getClass(), "year", 2014);
        setShortField(term29831, term29831.getClass(), "month", (short) 2);
        setShortField(term29831, term29831.getClass(), "day", (short) 5);
        setField(term29830, term29830.getClass(), "date", term29831);
        setByteField(term29835, term29835.getClass(), "hour", (byte) 14);
        setByteField(term29835, term29835.getClass(), "minute", (byte) 2);
        setByteField(term29835, term29835.getClass(), "second", (byte) 4);
        setIntField(term29835, term29835.getClass(), "nano", 458277660);
        setField(term29830, term29830.getClass(), "time", term29835);
        setField(term29805, term29805.getClass(), "updatedAt", term29830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term29805, args);
    }

};


