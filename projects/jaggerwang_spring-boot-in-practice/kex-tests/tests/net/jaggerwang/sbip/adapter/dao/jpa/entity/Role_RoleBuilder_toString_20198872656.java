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

public class Role_RoleBuilder_toString_20198872656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23297;

    public Role_RoleBuilder_toString_20198872656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23298 = new Long(-2720964670491002091L);
        term23297 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role$RoleBuilder"));
        Object term23312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23317 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23322 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23323 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23327 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23297, term23297.getClass(), "id", term23298);
        setField(term23297, term23297.getClass(), "name", "XfRABIFVEp");
        setIntField(term23313, term23313.getClass(), "year", 2010);
        setShortField(term23313, term23313.getClass(), "month", (short) 5);
        setShortField(term23313, term23313.getClass(), "day", (short) 21);
        setField(term23312, term23312.getClass(), "date", term23313);
        setByteField(term23317, term23317.getClass(), "hour", (byte) 2);
        setByteField(term23317, term23317.getClass(), "minute", (byte) 7);
        setByteField(term23317, term23317.getClass(), "second", (byte) 22);
        setIntField(term23317, term23317.getClass(), "nano", 178273852);
        setField(term23312, term23312.getClass(), "time", term23317);
        setField(term23297, term23297.getClass(), "createdAt", term23312);
        setIntField(term23323, term23323.getClass(), "year", 2020);
        setShortField(term23323, term23323.getClass(), "month", (short) 7);
        setShortField(term23323, term23323.getClass(), "day", (short) 27);
        setField(term23322, term23322.getClass(), "date", term23323);
        setByteField(term23327, term23327.getClass(), "hour", (byte) 23);
        setByteField(term23327, term23327.getClass(), "minute", (byte) 41);
        setByteField(term23327, term23327.getClass(), "second", (byte) 32);
        setIntField(term23327, term23327.getClass(), "nano", 523353963);
        setField(term23322, term23322.getClass(), "time", term23327);
        setField(term23297, term23297.getClass(), "updatedAt", term23322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role$RoleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term23297, args);
    }

};


