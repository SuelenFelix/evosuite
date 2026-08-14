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
import java.lang.Object;

public class DurationFormat_MyTimeUnit_from_20618341203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20413;

    public DurationFormat_MyTimeUnit_from_20618341203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20413 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term20414 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term20414, term20414.getClass(), "seconds", 115200L);
        setIntField(term20414, term20414.getClass(), "nanos", 0);
        setField(term20413, term20413.getClass(), "internalDuration", term20414);
        setLongField(term20413, term20413.getClass(), "effectiveTotalSeconds", -7612550318181586304L);
        setIntField(term20413, term20413.getClass(), "effectiveNanoseconds", -341962980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationFormat$MyTimeUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        Object[] args = new Object[1];
        args[0] = term20413;
        callMethod(klass, "from", argTypes, null, args);
    }

};


