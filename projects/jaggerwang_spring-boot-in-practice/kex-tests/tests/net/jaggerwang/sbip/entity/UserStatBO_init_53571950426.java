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

public class UserStatBO_init_53571950426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12329;
     Object term12331;
     Object term12333;
     Object term12335;
     Object term12337;
     Object term12339;
     Object term12341;
     Object term12351;

    public UserStatBO_init_53571950426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12329 = new Long(5219030281405653303L);
        term12331 = new Long(-8471550651709805183L);
        term12333 = new Long(-948292411727204525L);
        term12335 = new Long(-8892586408602479513L);
        term12337 = new Long(4616440478358528406L);
        term12339 = new Long(3427570961451840069L);
        term12341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12346 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12342, term12342.getClass(), "year", 2013);
        setShortField(term12342, term12342.getClass(), "month", (short) 7);
        setShortField(term12342, term12342.getClass(), "day", (short) 3);
        setField(term12341, term12341.getClass(), "date", term12342);
        setByteField(term12346, term12346.getClass(), "hour", (byte) 10);
        setByteField(term12346, term12346.getClass(), "minute", (byte) 59);
        setByteField(term12346, term12346.getClass(), "second", (byte) 22);
        setIntField(term12346, term12346.getClass(), "nano", 937921480);
        setField(term12341, term12341.getClass(), "time", term12346);
        term12351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12356 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12352, term12352.getClass(), "year", 2012);
        setShortField(term12352, term12352.getClass(), "month", (short) 2);
        setShortField(term12352, term12352.getClass(), "day", (short) 29);
        setField(term12351, term12351.getClass(), "date", term12352);
        setByteField(term12356, term12356.getClass(), "hour", (byte) 14);
        setByteField(term12356, term12356.getClass(), "minute", (byte) 26);
        setByteField(term12356, term12356.getClass(), "second", (byte) 20);
        setIntField(term12356, term12356.getClass(), "nano", 780823452);
        setField(term12351, term12351.getClass(), "time", term12356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.lang.Long");
        argTypes[4] = Class.forName("java.lang.Long");
        argTypes[5] = Class.forName("java.lang.Long");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[8];
        args[0] = term12329;
        args[1] = term12331;
        args[2] = term12333;
        args[3] = term12335;
        args[4] = term12337;
        args[5] = term12339;
        args[6] = term12341;
        args[7] = term12351;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


