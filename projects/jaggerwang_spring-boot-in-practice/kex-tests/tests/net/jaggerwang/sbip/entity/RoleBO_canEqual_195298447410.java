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

public class RoleBO_canEqual_195298447410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30255;
     Object term30290;

    public RoleBO_canEqual_195298447410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30256 = new Long(8499930868919012909L);
        term30255 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term30270 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30271 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30275 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30280 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30285 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30255, term30255.getClass(), "id", term30256);
        setField(term30255, term30255.getClass(), "name", "QtrylgCLiF");
        setIntField(term30271, term30271.getClass(), "year", 2017);
        setShortField(term30271, term30271.getClass(), "month", (short) 5);
        setShortField(term30271, term30271.getClass(), "day", (short) 2);
        setField(term30270, term30270.getClass(), "date", term30271);
        setByteField(term30275, term30275.getClass(), "hour", (byte) 7);
        setByteField(term30275, term30275.getClass(), "minute", (byte) 24);
        setByteField(term30275, term30275.getClass(), "second", (byte) 51);
        setIntField(term30275, term30275.getClass(), "nano", 706502334);
        setField(term30270, term30270.getClass(), "time", term30275);
        setField(term30255, term30255.getClass(), "createdAt", term30270);
        setIntField(term30281, term30281.getClass(), "year", 2026);
        setShortField(term30281, term30281.getClass(), "month", (short) 11);
        setShortField(term30281, term30281.getClass(), "day", (short) 1);
        setField(term30280, term30280.getClass(), "date", term30281);
        setByteField(term30285, term30285.getClass(), "hour", (byte) 9);
        setByteField(term30285, term30285.getClass(), "minute", (byte) 4);
        setByteField(term30285, term30285.getClass(), "second", (byte) 25);
        setIntField(term30285, term30285.getClass(), "nano", 272299951);
        setField(term30280, term30280.getClass(), "time", term30285);
        setField(term30255, term30255.getClass(), "updatedAt", term30280);
        term30290 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30290;
        callMethod(klass, "canEqual", argTypes, term30255, args);
    }

};


