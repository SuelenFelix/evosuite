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

public class UserRole_setUpdatedAt_140048112911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13927;
     Object term13954;

    public UserRole_setUpdatedAt_140048112911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13928 = new Long(5845993504299821981L);
        Long term13930 = new Long(-1528017371096319990L);
        Long term13932 = new Long(-1526328443223793465L);
        term13927 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term13934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13939 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13944 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13945 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13949 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13927, term13927.getClass(), "id", term13928);
        setField(term13927, term13927.getClass(), "userId", term13930);
        setField(term13927, term13927.getClass(), "roleId", term13932);
        setIntField(term13935, term13935.getClass(), "year", 2018);
        setShortField(term13935, term13935.getClass(), "month", (short) 9);
        setShortField(term13935, term13935.getClass(), "day", (short) 8);
        setField(term13934, term13934.getClass(), "date", term13935);
        setByteField(term13939, term13939.getClass(), "hour", (byte) 14);
        setByteField(term13939, term13939.getClass(), "minute", (byte) 21);
        setByteField(term13939, term13939.getClass(), "second", (byte) 23);
        setIntField(term13939, term13939.getClass(), "nano", 316911941);
        setField(term13934, term13934.getClass(), "time", term13939);
        setField(term13927, term13927.getClass(), "createdAt", term13934);
        setIntField(term13945, term13945.getClass(), "year", 2028);
        setShortField(term13945, term13945.getClass(), "month", (short) 5);
        setShortField(term13945, term13945.getClass(), "day", (short) 6);
        setField(term13944, term13944.getClass(), "date", term13945);
        setByteField(term13949, term13949.getClass(), "hour", (byte) 19);
        setByteField(term13949, term13949.getClass(), "minute", (byte) 33);
        setByteField(term13949, term13949.getClass(), "second", (byte) 32);
        setIntField(term13949, term13949.getClass(), "nano", 917257563);
        setField(term13944, term13944.getClass(), "time", term13949);
        setField(term13927, term13927.getClass(), "updatedAt", term13944);
        term13954 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13955 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13959 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13955, term13955.getClass(), "year", 2029);
        setShortField(term13955, term13955.getClass(), "month", (short) 7);
        setShortField(term13955, term13955.getClass(), "day", (short) 22);
        setField(term13954, term13954.getClass(), "date", term13955);
        setByteField(term13959, term13959.getClass(), "hour", (byte) 17);
        setByteField(term13959, term13959.getClass(), "minute", (byte) 59);
        setByteField(term13959, term13959.getClass(), "second", (byte) 58);
        setIntField(term13959, term13959.getClass(), "nano", 921418702);
        setField(term13954, term13954.getClass(), "time", term13959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term13954;
        callMethod(klass, "setUpdatedAt", argTypes, term13927, args);
    }

};


