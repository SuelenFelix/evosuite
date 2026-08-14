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

public class UserRole_init_15227760217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14074;
     Object term14076;
     Object term14078;
     Object term14080;
     Object term14090;

    public UserRole_init_15227760217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14074 = new Long(4096288569907305445L);
        term14076 = new Long(6940486570215409900L);
        term14078 = new Long(-7370364068296402536L);
        term14080 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14081 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14085 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14081, term14081.getClass(), "year", 2023);
        setShortField(term14081, term14081.getClass(), "month", (short) 5);
        setShortField(term14081, term14081.getClass(), "day", (short) 19);
        setField(term14080, term14080.getClass(), "date", term14081);
        setByteField(term14085, term14085.getClass(), "hour", (byte) 20);
        setByteField(term14085, term14085.getClass(), "minute", (byte) 50);
        setByteField(term14085, term14085.getClass(), "second", (byte) 49);
        setIntField(term14085, term14085.getClass(), "nano", 806710892);
        setField(term14080, term14080.getClass(), "time", term14085);
        term14090 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14091 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14095 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14091, term14091.getClass(), "year", 2022);
        setShortField(term14091, term14091.getClass(), "month", (short) 8);
        setShortField(term14091, term14091.getClass(), "day", (short) 3);
        setField(term14090, term14090.getClass(), "date", term14091);
        setByteField(term14095, term14095.getClass(), "hour", (byte) 18);
        setByteField(term14095, term14095.getClass(), "minute", (byte) 3);
        setByteField(term14095, term14095.getClass(), "second", (byte) 33);
        setIntField(term14095, term14095.getClass(), "nano", 770583920);
        setField(term14090, term14090.getClass(), "time", term14095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[5];
        args[0] = term14074;
        args[1] = term14076;
        args[2] = term14078;
        args[3] = term14080;
        args[4] = term14090;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


