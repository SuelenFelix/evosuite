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

public class RoleBO_RoleBOBuilder_updatedAt_7194171824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19936;
     Object term19971;

    public RoleBO_RoleBOBuilder_updatedAt_7194171824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19937 = new Long(2287785643837657068L);
        term19936 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO$RoleBOBuilder"));
        Object term19951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19956 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19966 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term19936, term19936.getClass(), "id", term19937);
        setField(term19936, term19936.getClass(), "name", "PgPzMSEjjX");
        setIntField(term19952, term19952.getClass(), "year", 2029);
        setShortField(term19952, term19952.getClass(), "month", (short) 4);
        setShortField(term19952, term19952.getClass(), "day", (short) 27);
        setField(term19951, term19951.getClass(), "date", term19952);
        setByteField(term19956, term19956.getClass(), "hour", (byte) 16);
        setByteField(term19956, term19956.getClass(), "minute", (byte) 25);
        setByteField(term19956, term19956.getClass(), "second", (byte) 10);
        setIntField(term19956, term19956.getClass(), "nano", 699018782);
        setField(term19951, term19951.getClass(), "time", term19956);
        setField(term19936, term19936.getClass(), "createdAt", term19951);
        setIntField(term19962, term19962.getClass(), "year", 2023);
        setShortField(term19962, term19962.getClass(), "month", (short) 12);
        setShortField(term19962, term19962.getClass(), "day", (short) 12);
        setField(term19961, term19961.getClass(), "date", term19962);
        setByteField(term19966, term19966.getClass(), "hour", (byte) 0);
        setByteField(term19966, term19966.getClass(), "minute", (byte) 12);
        setByteField(term19966, term19966.getClass(), "second", (byte) 38);
        setIntField(term19966, term19966.getClass(), "nano", 430999236);
        setField(term19961, term19961.getClass(), "time", term19966);
        setField(term19936, term19936.getClass(), "updatedAt", term19961);
        term19971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19976 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term19972, term19972.getClass(), "year", 2018);
        setShortField(term19972, term19972.getClass(), "month", (short) 6);
        setShortField(term19972, term19972.getClass(), "day", (short) 17);
        setField(term19971, term19971.getClass(), "date", term19972);
        setByteField(term19976, term19976.getClass(), "hour", (byte) 1);
        setByteField(term19976, term19976.getClass(), "minute", (byte) 3);
        setByteField(term19976, term19976.getClass(), "second", (byte) 5);
        setIntField(term19976, term19976.getClass(), "nano", 914834044);
        setField(term19971, term19971.getClass(), "time", term19976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO$RoleBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term19971;
        callMethod(klass, "updatedAt", argTypes, term19936, args);
    }

};


