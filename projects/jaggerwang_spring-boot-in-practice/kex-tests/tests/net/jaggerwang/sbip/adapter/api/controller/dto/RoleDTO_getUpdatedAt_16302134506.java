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

public class RoleDTO_getUpdatedAt_16302134506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17133;

    public RoleDTO_getUpdatedAt_16302134506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17134 = new Long(-6490254947459640565L);
        term17133 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO"));
        Object term17148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17153 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17158 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17159 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17163 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17133, term17133.getClass(), "id", term17134);
        setField(term17133, term17133.getClass(), "name", "zsWKWiTFuo");
        setIntField(term17149, term17149.getClass(), "year", 2029);
        setShortField(term17149, term17149.getClass(), "month", (short) 7);
        setShortField(term17149, term17149.getClass(), "day", (short) 19);
        setField(term17148, term17148.getClass(), "date", term17149);
        setByteField(term17153, term17153.getClass(), "hour", (byte) 4);
        setByteField(term17153, term17153.getClass(), "minute", (byte) 38);
        setByteField(term17153, term17153.getClass(), "second", (byte) 15);
        setIntField(term17153, term17153.getClass(), "nano", 260833456);
        setField(term17148, term17148.getClass(), "time", term17153);
        setField(term17133, term17133.getClass(), "createdAt", term17148);
        setIntField(term17159, term17159.getClass(), "year", 2019);
        setShortField(term17159, term17159.getClass(), "month", (short) 12);
        setShortField(term17159, term17159.getClass(), "day", (short) 13);
        setField(term17158, term17158.getClass(), "date", term17159);
        setByteField(term17163, term17163.getClass(), "hour", (byte) 17);
        setByteField(term17163, term17163.getClass(), "minute", (byte) 38);
        setByteField(term17163, term17163.getClass(), "second", (byte) 43);
        setIntField(term17163, term17163.getClass(), "nano", 435007801);
        setField(term17158, term17158.getClass(), "time", term17163);
        setField(term17133, term17133.getClass(), "updatedAt", term17158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term17133, args);
    }

};


