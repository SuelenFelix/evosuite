package net.obvj.performetrics.util;

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
import static net.obvj.performetrics.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class DurationStats_init_19732570482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60504;
     Object term60506;
     Object term60508;
     Object term60514;
     Object term60520;

    public DurationStats_init_19732570482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60504 = new Integer(480137250);
        term60506 = new Integer(-341152642);
        term60508 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60509 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term60509, term60509.getClass(), "seconds", 79200L);
        setIntField(term60509, term60509.getClass(), "nanos", 0);
        setField(term60508, term60508.getClass(), "internalDuration", term60509);
        setLongField(term60508, term60508.getClass(), "effectiveTotalSeconds", -2170847986967241072L);
        setIntField(term60508, term60508.getClass(), "effectiveNanoseconds", -2015854073);
        term60514 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60515 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term60515, term60515.getClass(), "seconds", 316800L);
        setIntField(term60515, term60515.getClass(), "nanos", 0);
        setField(term60514, term60514.getClass(), "internalDuration", term60515);
        setLongField(term60514, term60514.getClass(), "effectiveTotalSeconds", 4044358158040652353L);
        setIntField(term60514, term60514.getClass(), "effectiveNanoseconds", 538259104);
        term60520 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60521 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term60521, term60521.getClass(), "seconds", 234000L);
        setIntField(term60521, term60521.getClass(), "nanos", 0);
        setField(term60520, term60520.getClass(), "internalDuration", term60521);
        setLongField(term60520, term60520.getClass(), "effectiveTotalSeconds", -4443169559037975007L);
        setIntField(term60520, term60520.getClass(), "effectiveNanoseconds", 96566506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationStats");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[3] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[4] = Class.forName("net.obvj.performetrics.util.Duration");
        Object[] args = new Object[5];
        args[0] = term60504;
        args[1] = term60506;
        args[2] = term60508;
        args[3] = term60514;
        args[4] = term60520;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


