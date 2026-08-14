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

public class Duration_compareTo_176533695528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6968;
     Object term6974;

    public Duration_compareTo_176533695528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6968 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term6969 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term6969, term6969.getClass(), "seconds", 208800L);
        setIntField(term6969, term6969.getClass(), "nanos", 0);
        setField(term6968, term6968.getClass(), "internalDuration", term6969);
        setLongField(term6968, term6968.getClass(), "effectiveTotalSeconds", 1967728129628047933L);
        setIntField(term6968, term6968.getClass(), "effectiveNanoseconds", -226514366);
        term6974 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term6975 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term6975, term6975.getClass(), "seconds", 270000L);
        setIntField(term6975, term6975.getClass(), "nanos", 0);
        setField(term6974, term6974.getClass(), "internalDuration", term6975);
        setLongField(term6974, term6974.getClass(), "effectiveTotalSeconds", 2120084523938730454L);
        setIntField(term6974, term6974.getClass(), "effectiveNanoseconds", 1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        Object[] args = new Object[1];
        args[0] = term6974;
        callMethod(klass, "compareTo", argTypes, term6968, args);
    }

};


