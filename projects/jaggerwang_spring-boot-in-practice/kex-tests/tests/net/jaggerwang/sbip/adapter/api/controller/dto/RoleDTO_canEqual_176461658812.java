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

public class RoleDTO_canEqual_176461658812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17448;
     Object term17483;

    public RoleDTO_canEqual_176461658812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17449 = new Long(-5207216109884759743L);
        term17448 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO"));
        Object term17463 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17464 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17468 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17473 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17474 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17478 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17448, term17448.getClass(), "id", term17449);
        setField(term17448, term17448.getClass(), "name", "GNEmuHPNcU");
        setIntField(term17464, term17464.getClass(), "year", 2028);
        setShortField(term17464, term17464.getClass(), "month", (short) 5);
        setShortField(term17464, term17464.getClass(), "day", (short) 6);
        setField(term17463, term17463.getClass(), "date", term17464);
        setByteField(term17468, term17468.getClass(), "hour", (byte) 19);
        setByteField(term17468, term17468.getClass(), "minute", (byte) 33);
        setByteField(term17468, term17468.getClass(), "second", (byte) 32);
        setIntField(term17468, term17468.getClass(), "nano", 917257563);
        setField(term17463, term17463.getClass(), "time", term17468);
        setField(term17448, term17448.getClass(), "createdAt", term17463);
        setIntField(term17474, term17474.getClass(), "year", 2029);
        setShortField(term17474, term17474.getClass(), "month", (short) 7);
        setShortField(term17474, term17474.getClass(), "day", (short) 22);
        setField(term17473, term17473.getClass(), "date", term17474);
        setByteField(term17478, term17478.getClass(), "hour", (byte) 17);
        setByteField(term17478, term17478.getClass(), "minute", (byte) 59);
        setByteField(term17478, term17478.getClass(), "second", (byte) 58);
        setIntField(term17478, term17478.getClass(), "nano", 921418702);
        setField(term17473, term17473.getClass(), "time", term17478);
        setField(term17448, term17448.getClass(), "updatedAt", term17473);
        term17483 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17483;
        callMethod(klass, "canEqual", argTypes, term17448, args);
    }

};


