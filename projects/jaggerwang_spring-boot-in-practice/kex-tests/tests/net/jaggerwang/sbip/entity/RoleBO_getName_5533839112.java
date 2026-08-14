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

public class RoleBO_getName_5533839112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29850;

    public RoleBO_getName_5533839112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29851 = new Long(-8211240904293846981L);
        term29850 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term29865 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29866 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29870 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29875 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29876 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29880 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29850, term29850.getClass(), "id", term29851);
        setField(term29850, term29850.getClass(), "name", "WXcZEtUKlI");
        setIntField(term29866, term29866.getClass(), "year", 2019);
        setShortField(term29866, term29866.getClass(), "month", (short) 3);
        setShortField(term29866, term29866.getClass(), "day", (short) 23);
        setField(term29865, term29865.getClass(), "date", term29866);
        setByteField(term29870, term29870.getClass(), "hour", (byte) 13);
        setByteField(term29870, term29870.getClass(), "minute", (byte) 19);
        setByteField(term29870, term29870.getClass(), "second", (byte) 44);
        setIntField(term29870, term29870.getClass(), "nano", 912714703);
        setField(term29865, term29865.getClass(), "time", term29870);
        setField(term29850, term29850.getClass(), "createdAt", term29865);
        setIntField(term29876, term29876.getClass(), "year", 2027);
        setShortField(term29876, term29876.getClass(), "month", (short) 3);
        setShortField(term29876, term29876.getClass(), "day", (short) 4);
        setField(term29875, term29875.getClass(), "date", term29876);
        setByteField(term29880, term29880.getClass(), "hour", (byte) 2);
        setByteField(term29880, term29880.getClass(), "minute", (byte) 3);
        setByteField(term29880, term29880.getClass(), "second", (byte) 31);
        setIntField(term29880, term29880.getClass(), "nano", 652064220);
        setField(term29875, term29875.getClass(), "time", term29880);
        setField(term29850, term29850.getClass(), "updatedAt", term29875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term29850, args);
    }

};


