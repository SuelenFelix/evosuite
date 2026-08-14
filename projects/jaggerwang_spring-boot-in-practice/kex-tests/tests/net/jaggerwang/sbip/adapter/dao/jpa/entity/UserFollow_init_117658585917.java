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

public class UserFollow_init_117658585917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11969;
     Object term11971;
     Object term11973;
     Object term11975;
     Object term11985;

    public UserFollow_init_117658585917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11969 = new Long(3662777917800385964L);
        term11971 = new Long(-7005300544167632229L);
        term11973 = new Long(-278716491237139968L);
        term11975 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11976 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11980 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11976, term11976.getClass(), "year", 2029);
        setShortField(term11976, term11976.getClass(), "month", (short) 11);
        setShortField(term11976, term11976.getClass(), "day", (short) 8);
        setField(term11975, term11975.getClass(), "date", term11976);
        setByteField(term11980, term11980.getClass(), "hour", (byte) 23);
        setByteField(term11980, term11980.getClass(), "minute", (byte) 43);
        setByteField(term11980, term11980.getClass(), "second", (byte) 12);
        setIntField(term11980, term11980.getClass(), "nano", 586227255);
        setField(term11975, term11975.getClass(), "time", term11980);
        term11985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11990 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11986, term11986.getClass(), "year", 2014);
        setShortField(term11986, term11986.getClass(), "month", (short) 1);
        setShortField(term11986, term11986.getClass(), "day", (short) 23);
        setField(term11985, term11985.getClass(), "date", term11986);
        setByteField(term11990, term11990.getClass(), "hour", (byte) 19);
        setByteField(term11990, term11990.getClass(), "minute", (byte) 52);
        setByteField(term11990, term11990.getClass(), "second", (byte) 9);
        setIntField(term11990, term11990.getClass(), "nano", 235326975);
        setField(term11985, term11985.getClass(), "time", term11990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[5];
        args[0] = term11969;
        args[1] = term11971;
        args[2] = term11973;
        args[3] = term11975;
        args[4] = term11985;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


