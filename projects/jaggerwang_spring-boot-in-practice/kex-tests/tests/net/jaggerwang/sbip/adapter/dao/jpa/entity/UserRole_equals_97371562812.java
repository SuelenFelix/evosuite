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

public class UserRole_equals_97371562812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13964;
     Object term13991;

    public UserRole_equals_97371562812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13965 = new Long(-412186147449928821L);
        Long term13967 = new Long(-1449569009562240465L);
        Long term13969 = new Long(2287449183416662404L);
        term13964 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term13971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13976 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13986 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13964, term13964.getClass(), "id", term13965);
        setField(term13964, term13964.getClass(), "userId", term13967);
        setField(term13964, term13964.getClass(), "roleId", term13969);
        setIntField(term13972, term13972.getClass(), "year", 2012);
        setShortField(term13972, term13972.getClass(), "month", (short) 6);
        setShortField(term13972, term13972.getClass(), "day", (short) 24);
        setField(term13971, term13971.getClass(), "date", term13972);
        setByteField(term13976, term13976.getClass(), "hour", (byte) 23);
        setByteField(term13976, term13976.getClass(), "minute", (byte) 9);
        setByteField(term13976, term13976.getClass(), "second", (byte) 32);
        setIntField(term13976, term13976.getClass(), "nano", 933669930);
        setField(term13971, term13971.getClass(), "time", term13976);
        setField(term13964, term13964.getClass(), "createdAt", term13971);
        setIntField(term13982, term13982.getClass(), "year", 2013);
        setShortField(term13982, term13982.getClass(), "month", (short) 9);
        setShortField(term13982, term13982.getClass(), "day", (short) 29);
        setField(term13981, term13981.getClass(), "date", term13982);
        setByteField(term13986, term13986.getClass(), "hour", (byte) 18);
        setByteField(term13986, term13986.getClass(), "minute", (byte) 32);
        setByteField(term13986, term13986.getClass(), "second", (byte) 59);
        setIntField(term13986, term13986.getClass(), "nano", 213125607);
        setField(term13981, term13981.getClass(), "time", term13986);
        setField(term13964, term13964.getClass(), "updatedAt", term13981);
        term13991 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13991;
        callMethod(klass, "equals", argTypes, term13964, args);
    }

};


