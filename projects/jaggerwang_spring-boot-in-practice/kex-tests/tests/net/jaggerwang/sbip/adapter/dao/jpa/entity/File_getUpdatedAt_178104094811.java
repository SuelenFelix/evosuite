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
import java.lang.String;
import java.lang.Object;

public class File_getUpdatedAt_178104094811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17586;

    public File_getUpdatedAt_178104094811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17587 = new Long(-4855037955202452256L);
        Long term17589 = new Long(-5903549884298836343L);
        Class<? extends Object> term17672 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term17671 = ((Class) term17672).getDeclaredField((String) "LOCAL");
        ((Field) term17671).setAccessible(true);
        Object enum45 = ((Field) term17671).get((Object) null);
        Long term17637 = new Long(-3058119213533262883L);
        term17586 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term17624 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term17651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17666 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17586, term17586.getClass(), "id", term17587);
        setField(term17586, term17586.getClass(), "userId", term17589);
        setField(term17586, term17586.getClass(), "region", enum45);
        setField(term17586, term17586.getClass(), "bucket", "DSNsTGYXDF");
        setField(term17586, term17586.getClass(), "path", "sQvGcVjdEx");
        setField(term17624, term17624.getClass(), "name", "rLHAoqXgPh");
        setField(term17624, term17624.getClass(), "size", term17637);
        setField(term17624, term17624.getClass(), "type", "zUlRdimJtU");
        setField(term17586, term17586.getClass(), "meta", term17624);
        setIntField(term17652, term17652.getClass(), "year", 2025);
        setShortField(term17652, term17652.getClass(), "month", (short) 1);
        setShortField(term17652, term17652.getClass(), "day", (short) 20);
        setField(term17651, term17651.getClass(), "date", term17652);
        setByteField(term17656, term17656.getClass(), "hour", (byte) 22);
        setByteField(term17656, term17656.getClass(), "minute", (byte) 55);
        setByteField(term17656, term17656.getClass(), "second", (byte) 9);
        setIntField(term17656, term17656.getClass(), "nano", 660955568);
        setField(term17651, term17651.getClass(), "time", term17656);
        setField(term17586, term17586.getClass(), "createdAt", term17651);
        setIntField(term17662, term17662.getClass(), "year", 2014);
        setShortField(term17662, term17662.getClass(), "month", (short) 2);
        setShortField(term17662, term17662.getClass(), "day", (short) 26);
        setField(term17661, term17661.getClass(), "date", term17662);
        setByteField(term17666, term17666.getClass(), "hour", (byte) 16);
        setByteField(term17666, term17666.getClass(), "minute", (byte) 42);
        setByteField(term17666, term17666.getClass(), "second", (byte) 39);
        setIntField(term17666, term17666.getClass(), "nano", 690212071);
        setField(term17661, term17661.getClass(), "time", term17666);
        setField(term17586, term17586.getClass(), "updatedAt", term17661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term17586, args);
    }

};


