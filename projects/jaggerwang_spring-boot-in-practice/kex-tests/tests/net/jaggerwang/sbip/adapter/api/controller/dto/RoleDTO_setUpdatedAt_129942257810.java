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

public class RoleDTO_setUpdatedAt_129942257810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17347;
     Object term17382;

    public RoleDTO_setUpdatedAt_129942257810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17348 = new Long(6150186973473930616L);
        term17347 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO"));
        Object term17362 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17363 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17367 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17372 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17373 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17377 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17347, term17347.getClass(), "id", term17348);
        setField(term17347, term17347.getClass(), "name", "PvmBHIXaMY");
        setIntField(term17363, term17363.getClass(), "year", 2013);
        setShortField(term17363, term17363.getClass(), "month", (short) 5);
        setShortField(term17363, term17363.getClass(), "day", (short) 14);
        setField(term17362, term17362.getClass(), "date", term17363);
        setByteField(term17367, term17367.getClass(), "hour", (byte) 12);
        setByteField(term17367, term17367.getClass(), "minute", (byte) 8);
        setByteField(term17367, term17367.getClass(), "second", (byte) 12);
        setIntField(term17367, term17367.getClass(), "nano", 597594916);
        setField(term17362, term17362.getClass(), "time", term17367);
        setField(term17347, term17347.getClass(), "createdAt", term17362);
        setIntField(term17373, term17373.getClass(), "year", 2020);
        setShortField(term17373, term17373.getClass(), "month", (short) 4);
        setShortField(term17373, term17373.getClass(), "day", (short) 2);
        setField(term17372, term17372.getClass(), "date", term17373);
        setByteField(term17377, term17377.getClass(), "hour", (byte) 11);
        setByteField(term17377, term17377.getClass(), "minute", (byte) 26);
        setByteField(term17377, term17377.getClass(), "second", (byte) 22);
        setIntField(term17377, term17377.getClass(), "nano", 168224721);
        setField(term17372, term17372.getClass(), "time", term17377);
        setField(term17347, term17347.getClass(), "updatedAt", term17372);
        term17382 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17383 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17387 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term17383, term17383.getClass(), "year", 2010);
        setShortField(term17383, term17383.getClass(), "month", (short) 10);
        setShortField(term17383, term17383.getClass(), "day", (short) 26);
        setField(term17382, term17382.getClass(), "date", term17383);
        setByteField(term17387, term17387.getClass(), "hour", (byte) 6);
        setByteField(term17387, term17387.getClass(), "minute", (byte) 28);
        setByteField(term17387, term17387.getClass(), "second", (byte) 52);
        setIntField(term17387, term17387.getClass(), "nano", 197540216);
        setField(term17382, term17382.getClass(), "time", term17387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term17382;
        callMethod(klass, "setUpdatedAt", argTypes, term17347, args);
    }

};


