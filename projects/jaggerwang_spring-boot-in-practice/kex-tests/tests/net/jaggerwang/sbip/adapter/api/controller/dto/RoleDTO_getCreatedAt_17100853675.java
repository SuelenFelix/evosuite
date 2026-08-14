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

public class RoleDTO_getCreatedAt_17100853675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17088;

    public RoleDTO_getCreatedAt_17100853675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17089 = new Long(-3279534582096707294L);
        term17088 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO"));
        Object term17103 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17104 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17108 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17113 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17114 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17118 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17088, term17088.getClass(), "id", term17089);
        setField(term17088, term17088.getClass(), "name", "mLwibAPEsa");
        setIntField(term17104, term17104.getClass(), "year", 2016);
        setShortField(term17104, term17104.getClass(), "month", (short) 11);
        setShortField(term17104, term17104.getClass(), "day", (short) 20);
        setField(term17103, term17103.getClass(), "date", term17104);
        setByteField(term17108, term17108.getClass(), "hour", (byte) 17);
        setByteField(term17108, term17108.getClass(), "minute", (byte) 20);
        setByteField(term17108, term17108.getClass(), "second", (byte) 21);
        setIntField(term17108, term17108.getClass(), "nano", 340096364);
        setField(term17103, term17103.getClass(), "time", term17108);
        setField(term17088, term17088.getClass(), "createdAt", term17103);
        setIntField(term17114, term17114.getClass(), "year", 2024);
        setShortField(term17114, term17114.getClass(), "month", (short) 10);
        setShortField(term17114, term17114.getClass(), "day", (short) 28);
        setField(term17113, term17113.getClass(), "date", term17114);
        setByteField(term17118, term17118.getClass(), "hour", (byte) 5);
        setByteField(term17118, term17118.getClass(), "minute", (byte) 13);
        setByteField(term17118, term17118.getClass(), "second", (byte) 51);
        setIntField(term17118, term17118.getClass(), "nano", 605693001);
        setField(term17113, term17113.getClass(), "time", term17118);
        setField(term17088, term17088.getClass(), "updatedAt", term17113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term17088, args);
    }

};


