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

public class RoleDTO_hashCode_127750140413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17494;

    public RoleDTO_hashCode_127750140413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17495 = new Long(8765880103547975810L);
        term17494 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO"));
        Object term17509 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17510 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17514 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17524 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17494, term17494.getClass(), "id", term17495);
        setField(term17494, term17494.getClass(), "name", "IoSfuKDFRe");
        setIntField(term17510, term17510.getClass(), "year", 2012);
        setShortField(term17510, term17510.getClass(), "month", (short) 6);
        setShortField(term17510, term17510.getClass(), "day", (short) 24);
        setField(term17509, term17509.getClass(), "date", term17510);
        setByteField(term17514, term17514.getClass(), "hour", (byte) 23);
        setByteField(term17514, term17514.getClass(), "minute", (byte) 9);
        setByteField(term17514, term17514.getClass(), "second", (byte) 32);
        setIntField(term17514, term17514.getClass(), "nano", 933669930);
        setField(term17509, term17509.getClass(), "time", term17514);
        setField(term17494, term17494.getClass(), "createdAt", term17509);
        setIntField(term17520, term17520.getClass(), "year", 2013);
        setShortField(term17520, term17520.getClass(), "month", (short) 9);
        setShortField(term17520, term17520.getClass(), "day", (short) 29);
        setField(term17519, term17519.getClass(), "date", term17520);
        setByteField(term17524, term17524.getClass(), "hour", (byte) 18);
        setByteField(term17524, term17524.getClass(), "minute", (byte) 32);
        setByteField(term17524, term17524.getClass(), "second", (byte) 59);
        setIntField(term17524, term17524.getClass(), "nano", 213125607);
        setField(term17519, term17519.getClass(), "time", term17524);
        setField(term17494, term17494.getClass(), "updatedAt", term17519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term17494, args);
    }

};


