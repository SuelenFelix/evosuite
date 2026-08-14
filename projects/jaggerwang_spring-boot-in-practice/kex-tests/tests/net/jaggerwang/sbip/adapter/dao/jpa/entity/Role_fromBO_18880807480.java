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

public class Role_fromBO_18880807480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23348;

    public Role_fromBO_18880807480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23349 = new Long(-723697646775816649L);
        term23348 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term23363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23368 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23378 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23348, term23348.getClass(), "id", term23349);
        setField(term23348, term23348.getClass(), "name", "MHGKyEnwKc");
        setIntField(term23364, term23364.getClass(), "year", 2014);
        setShortField(term23364, term23364.getClass(), "month", (short) 2);
        setShortField(term23364, term23364.getClass(), "day", (short) 18);
        setField(term23363, term23363.getClass(), "date", term23364);
        setByteField(term23368, term23368.getClass(), "hour", (byte) 4);
        setByteField(term23368, term23368.getClass(), "minute", (byte) 16);
        setByteField(term23368, term23368.getClass(), "second", (byte) 8);
        setIntField(term23368, term23368.getClass(), "nano", 486006871);
        setField(term23363, term23363.getClass(), "time", term23368);
        setField(term23348, term23348.getClass(), "createdAt", term23363);
        setIntField(term23374, term23374.getClass(), "year", 2024);
        setShortField(term23374, term23374.getClass(), "month", (short) 10);
        setShortField(term23374, term23374.getClass(), "day", (short) 8);
        setField(term23373, term23373.getClass(), "date", term23374);
        setByteField(term23378, term23378.getClass(), "hour", (byte) 19);
        setByteField(term23378, term23378.getClass(), "minute", (byte) 31);
        setByteField(term23378, term23378.getClass(), "second", (byte) 10);
        setIntField(term23378, term23378.getClass(), "nano", 930417883);
        setField(term23373, term23373.getClass(), "time", term23378);
        setField(term23348, term23348.getClass(), "updatedAt", term23373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Object[] args = new Object[1];
        args[0] = term23348;
        callMethod(klass, "fromBO", argTypes, null, args);
    }

};


