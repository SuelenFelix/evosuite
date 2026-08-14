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

public class RoleBO_RoleBOBuilder_id_941603001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19767;
     Object term19802;

    public RoleBO_RoleBOBuilder_id_941603001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19768 = new Long(6895382576300001141L);
        term19767 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO$RoleBOBuilder"));
        Object term19782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19787 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19797 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term19767, term19767.getClass(), "id", term19768);
        setField(term19767, term19767.getClass(), "name", "sZdUNdggUW");
        setIntField(term19783, term19783.getClass(), "year", 2029);
        setShortField(term19783, term19783.getClass(), "month", (short) 7);
        setShortField(term19783, term19783.getClass(), "day", (short) 14);
        setField(term19782, term19782.getClass(), "date", term19783);
        setByteField(term19787, term19787.getClass(), "hour", (byte) 17);
        setByteField(term19787, term19787.getClass(), "minute", (byte) 37);
        setByteField(term19787, term19787.getClass(), "second", (byte) 39);
        setIntField(term19787, term19787.getClass(), "nano", 333402299);
        setField(term19782, term19782.getClass(), "time", term19787);
        setField(term19767, term19767.getClass(), "createdAt", term19782);
        setIntField(term19793, term19793.getClass(), "year", 2025);
        setShortField(term19793, term19793.getClass(), "month", (short) 10);
        setShortField(term19793, term19793.getClass(), "day", (short) 30);
        setField(term19792, term19792.getClass(), "date", term19793);
        setByteField(term19797, term19797.getClass(), "hour", (byte) 1);
        setByteField(term19797, term19797.getClass(), "minute", (byte) 4);
        setByteField(term19797, term19797.getClass(), "second", (byte) 18);
        setIntField(term19797, term19797.getClass(), "nano", 717716253);
        setField(term19792, term19792.getClass(), "time", term19797);
        setField(term19767, term19767.getClass(), "updatedAt", term19792);
        term19802 = new Long(9062006526792682783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO$RoleBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term19802;
        callMethod(klass, "id", argTypes, term19767, args);
    }

};


