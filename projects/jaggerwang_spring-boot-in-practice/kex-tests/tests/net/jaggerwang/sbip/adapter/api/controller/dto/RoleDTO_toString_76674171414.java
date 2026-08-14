package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class RoleDTO_toString_76674171414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17539;

    public RoleDTO_toString_76674171414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17540 = new Long(4552367707739103094L);
        term17539 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO"));
        Object term17554 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17555 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17559 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17564 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17565 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17569 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17539, term17539.getClass(), "id", term17540);
        setField(term17539, term17539.getClass(), "name", "AWYyZiNfsm");
        setIntField(term17555, term17555.getClass(), "year", 2010);
        setShortField(term17555, term17555.getClass(), "month", (short) 9);
        setShortField(term17555, term17555.getClass(), "day", (short) 20);
        setField(term17554, term17554.getClass(), "date", term17555);
        setByteField(term17559, term17559.getClass(), "hour", (byte) 3);
        setByteField(term17559, term17559.getClass(), "minute", (byte) 41);
        setByteField(term17559, term17559.getClass(), "second", (byte) 7);
        setIntField(term17559, term17559.getClass(), "nano", 796515800);
        setField(term17554, term17554.getClass(), "time", term17559);
        setField(term17539, term17539.getClass(), "createdAt", term17554);
        setIntField(term17565, term17565.getClass(), "year", 2015);
        setShortField(term17565, term17565.getClass(), "month", (short) 10);
        setShortField(term17565, term17565.getClass(), "day", (short) 2);
        setField(term17564, term17564.getClass(), "date", term17565);
        setByteField(term17569, term17569.getClass(), "hour", (byte) 21);
        setByteField(term17569, term17569.getClass(), "minute", (byte) 18);
        setByteField(term17569, term17569.getClass(), "second", (byte) 42);
        setIntField(term17569, term17569.getClass(), "nano", 185569616);
        setField(term17564, term17564.getClass(), "time", term17569);
        setField(term17539, term17539.getClass(), "updatedAt", term17564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17539, args);
    }

};


