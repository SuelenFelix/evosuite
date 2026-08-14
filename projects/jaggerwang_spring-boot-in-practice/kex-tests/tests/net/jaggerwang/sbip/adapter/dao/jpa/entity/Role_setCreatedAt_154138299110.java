package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Role_setCreatedAt_154138299110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23777;
     Object term23812;

    public Role_setCreatedAt_154138299110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23778 = new Long(-823085399570394644L);
        term23777 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term23792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23797 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23802 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23803 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23807 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23777, term23777.getClass(), "id", term23778);
        setField(term23777, term23777.getClass(), "name", "WVRMUmrljA");
        setIntField(term23793, term23793.getClass(), "year", 2016);
        setShortField(term23793, term23793.getClass(), "month", (short) 2);
        setShortField(term23793, term23793.getClass(), "day", (short) 12);
        setField(term23792, term23792.getClass(), "date", term23793);
        setByteField(term23797, term23797.getClass(), "hour", (byte) 7);
        setByteField(term23797, term23797.getClass(), "minute", (byte) 16);
        setByteField(term23797, term23797.getClass(), "second", (byte) 55);
        setIntField(term23797, term23797.getClass(), "nano", 690063047);
        setField(term23792, term23792.getClass(), "time", term23797);
        setField(term23777, term23777.getClass(), "createdAt", term23792);
        setIntField(term23803, term23803.getClass(), "year", 2019);
        setShortField(term23803, term23803.getClass(), "month", (short) 3);
        setShortField(term23803, term23803.getClass(), "day", (short) 19);
        setField(term23802, term23802.getClass(), "date", term23803);
        setByteField(term23807, term23807.getClass(), "hour", (byte) 19);
        setByteField(term23807, term23807.getClass(), "minute", (byte) 24);
        setByteField(term23807, term23807.getClass(), "second", (byte) 21);
        setIntField(term23807, term23807.getClass(), "nano", 765889037);
        setField(term23802, term23802.getClass(), "time", term23807);
        setField(term23777, term23777.getClass(), "updatedAt", term23802);
        term23812 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23813 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23817 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term23813, term23813.getClass(), "year", 2021);
        setShortField(term23813, term23813.getClass(), "month", (short) 7);
        setShortField(term23813, term23813.getClass(), "day", (short) 2);
        setField(term23812, term23812.getClass(), "date", term23813);
        setByteField(term23817, term23817.getClass(), "hour", (byte) 21);
        setByteField(term23817, term23817.getClass(), "minute", (byte) 55);
        setByteField(term23817, term23817.getClass(), "second", (byte) 54);
        setIntField(term23817, term23817.getClass(), "nano", 731983440);
        setField(term23812, term23812.getClass(), "time", term23817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term23812;
        callMethod(klass, "setCreatedAt", argTypes, term23777, args);
    }

};


