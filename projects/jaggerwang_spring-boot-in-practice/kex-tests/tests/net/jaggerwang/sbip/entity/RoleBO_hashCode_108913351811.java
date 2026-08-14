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

public class RoleBO_hashCode_108913351811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30301;

    public RoleBO_hashCode_108913351811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30302 = new Long(6252795312796363233L);
        term30301 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term30316 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30321 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30331 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30301, term30301.getClass(), "id", term30302);
        setField(term30301, term30301.getClass(), "name", "orEuhCStGM");
        setIntField(term30317, term30317.getClass(), "year", 2017);
        setShortField(term30317, term30317.getClass(), "month", (short) 11);
        setShortField(term30317, term30317.getClass(), "day", (short) 19);
        setField(term30316, term30316.getClass(), "date", term30317);
        setByteField(term30321, term30321.getClass(), "hour", (byte) 2);
        setByteField(term30321, term30321.getClass(), "minute", (byte) 52);
        setByteField(term30321, term30321.getClass(), "second", (byte) 15);
        setIntField(term30321, term30321.getClass(), "nano", 625778933);
        setField(term30316, term30316.getClass(), "time", term30321);
        setField(term30301, term30301.getClass(), "createdAt", term30316);
        setIntField(term30327, term30327.getClass(), "year", 2015);
        setShortField(term30327, term30327.getClass(), "month", (short) 10);
        setShortField(term30327, term30327.getClass(), "day", (short) 3);
        setField(term30326, term30326.getClass(), "date", term30327);
        setByteField(term30331, term30331.getClass(), "hour", (byte) 10);
        setByteField(term30331, term30331.getClass(), "minute", (byte) 45);
        setByteField(term30331, term30331.getClass(), "second", (byte) 18);
        setIntField(term30331, term30331.getClass(), "nano", 333457081);
        setField(term30326, term30326.getClass(), "time", term30331);
        setField(term30301, term30301.getClass(), "updatedAt", term30326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term30301, args);
    }

};


