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

public class RoleBO_toString_57837382812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30346;

    public RoleBO_toString_57837382812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30347 = new Long(3968143267572761057L);
        term30346 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term30361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30366 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30376 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30346, term30346.getClass(), "id", term30347);
        setField(term30346, term30346.getClass(), "name", "HhEaSXWvrY");
        setIntField(term30362, term30362.getClass(), "year", 2013);
        setShortField(term30362, term30362.getClass(), "month", (short) 3);
        setShortField(term30362, term30362.getClass(), "day", (short) 3);
        setField(term30361, term30361.getClass(), "date", term30362);
        setByteField(term30366, term30366.getClass(), "hour", (byte) 22);
        setByteField(term30366, term30366.getClass(), "minute", (byte) 27);
        setByteField(term30366, term30366.getClass(), "second", (byte) 52);
        setIntField(term30366, term30366.getClass(), "nano", 968779154);
        setField(term30361, term30361.getClass(), "time", term30366);
        setField(term30346, term30346.getClass(), "createdAt", term30361);
        setIntField(term30372, term30372.getClass(), "year", 2019);
        setShortField(term30372, term30372.getClass(), "month", (short) 8);
        setShortField(term30372, term30372.getClass(), "day", (short) 31);
        setField(term30371, term30371.getClass(), "date", term30372);
        setByteField(term30376, term30376.getClass(), "hour", (byte) 22);
        setByteField(term30376, term30376.getClass(), "minute", (byte) 31);
        setByteField(term30376, term30376.getClass(), "second", (byte) 36);
        setIntField(term30376, term30376.getClass(), "nano", 403358328);
        setField(term30371, term30371.getClass(), "time", term30376);
        setField(term30346, term30346.getClass(), "updatedAt", term30371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term30346, args);
    }

};


