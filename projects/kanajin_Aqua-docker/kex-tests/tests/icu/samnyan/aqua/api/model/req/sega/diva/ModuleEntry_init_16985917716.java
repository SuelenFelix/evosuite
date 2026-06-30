package icu.samnyan.aqua.api.model.req.sega.diva;

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
import static icu.samnyan.aqua.api.model.req.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class ModuleEntry_init_16985917716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228756;
     Object term4228770;
     Object term4228772;
     Object term4228782;
     Object term4228792;

    public ModuleEntry_init_16985917716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228756 = new Integer(-1604546829);
        term4228770 = new Integer(899239221);
        term4228772 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228773 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228777 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228773, term4228773.getClass(), "year", 2024);
        setShortField(term4228773, term4228773.getClass(), "month", (short) 4);
        setShortField(term4228773, term4228773.getClass(), "day", (short) 2);
        setField(term4228772, term4228772.getClass(), "date", term4228773);
        setByteField(term4228777, term4228777.getClass(), "hour", (byte) 13);
        setByteField(term4228777, term4228777.getClass(), "minute", (byte) 42);
        setByteField(term4228777, term4228777.getClass(), "second", (byte) 33);
        setIntField(term4228777, term4228777.getClass(), "nano", 799259137);
        setField(term4228772, term4228772.getClass(), "time", term4228777);
        term4228782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228787 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228783, term4228783.getClass(), "year", 2011);
        setShortField(term4228783, term4228783.getClass(), "month", (short) 4);
        setShortField(term4228783, term4228783.getClass(), "day", (short) 9);
        setField(term4228782, term4228782.getClass(), "date", term4228783);
        setByteField(term4228787, term4228787.getClass(), "hour", (byte) 18);
        setByteField(term4228787, term4228787.getClass(), "minute", (byte) 0);
        setByteField(term4228787, term4228787.getClass(), "second", (byte) 51);
        setIntField(term4228787, term4228787.getClass(), "nano", 704342066);
        setField(term4228782, term4228782.getClass(), "time", term4228787);
        term4228792 = new Integer(-311990282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term4228756;
        args[1] = "zUEPOjsKzw";
        args[2] = term4228770;
        args[3] = term4228772;
        args[4] = term4228782;
        args[5] = term4228792;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


