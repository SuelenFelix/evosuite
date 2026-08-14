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

public class RoleDTO_toBO_3200983791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16953;

    public RoleDTO_toBO_3200983791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16954 = new Long(-3225860270104198596L);
        term16953 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO"));
        Object term16968 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16969 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16973 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16978 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16979 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16983 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16953, term16953.getClass(), "id", term16954);
        setField(term16953, term16953.getClass(), "name", "qFGKIJjlmV");
        setIntField(term16969, term16969.getClass(), "year", 2025);
        setShortField(term16969, term16969.getClass(), "month", (short) 11);
        setShortField(term16969, term16969.getClass(), "day", (short) 16);
        setField(term16968, term16968.getClass(), "date", term16969);
        setByteField(term16973, term16973.getClass(), "hour", (byte) 12);
        setByteField(term16973, term16973.getClass(), "minute", (byte) 27);
        setByteField(term16973, term16973.getClass(), "second", (byte) 36);
        setIntField(term16973, term16973.getClass(), "nano", 699989217);
        setField(term16968, term16968.getClass(), "time", term16973);
        setField(term16953, term16953.getClass(), "createdAt", term16968);
        setIntField(term16979, term16979.getClass(), "year", 2018);
        setShortField(term16979, term16979.getClass(), "month", (short) 10);
        setShortField(term16979, term16979.getClass(), "day", (short) 3);
        setField(term16978, term16978.getClass(), "date", term16979);
        setByteField(term16983, term16983.getClass(), "hour", (byte) 12);
        setByteField(term16983, term16983.getClass(), "minute", (byte) 49);
        setByteField(term16983, term16983.getClass(), "second", (byte) 38);
        setIntField(term16983, term16983.getClass(), "nano", 549840711);
        setField(term16978, term16978.getClass(), "time", term16983);
        setField(term16953, term16953.getClass(), "updatedAt", term16978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBO", argTypes, term16953, args);
    }

};


