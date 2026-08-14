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

public class UserBO_init_11537958324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28018;
     Object term28068;
     Object term28082;
     Object term28092;

    public UserBO_init_11537958324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28018 = new Long(6978548804004471804L);
        term28068 = new Long(-8957441653116712448L);
        term28082 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28083 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28087 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28083, term28083.getClass(), "year", 2025);
        setShortField(term28083, term28083.getClass(), "month", (short) 4);
        setShortField(term28083, term28083.getClass(), "day", (short) 6);
        setField(term28082, term28082.getClass(), "date", term28083);
        setByteField(term28087, term28087.getClass(), "hour", (byte) 23);
        setByteField(term28087, term28087.getClass(), "minute", (byte) 17);
        setByteField(term28087, term28087.getClass(), "second", (byte) 11);
        setIntField(term28087, term28087.getClass(), "nano", 928165672);
        setField(term28082, term28082.getClass(), "time", term28087);
        term28092 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28093 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28097 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28093, term28093.getClass(), "year", 2022);
        setShortField(term28093, term28093.getClass(), "month", (short) 3);
        setShortField(term28093, term28093.getClass(), "day", (short) 20);
        setField(term28092, term28092.getClass(), "date", term28093);
        setByteField(term28097, term28097.getClass(), "hour", (byte) 20);
        setByteField(term28097, term28097.getClass(), "minute", (byte) 31);
        setByteField(term28097, term28097.getClass(), "second", (byte) 56);
        setIntField(term28097, term28097.getClass(), "nano", 682853702);
        setField(term28092, term28092.getClass(), "time", term28097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.Long");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        argTypes[8] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[9];
        args[0] = term28018;
        args[1] = "RDnkgWkcbz";
        args[2] = "IBpaxltauX";
        args[3] = "hePqROaplw";
        args[4] = "PJcSNDruWd";
        args[5] = term28068;
        args[6] = "VVNNlAePXF";
        args[7] = term28082;
        args[8] = term28092;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


