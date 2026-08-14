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

public class Duration_negated_177195836727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6962;

    public Duration_negated_177195836727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6962 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term6963 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term6963, term6963.getClass(), "seconds", 136800L);
        setIntField(term6963, term6963.getClass(), "nanos", 0);
        setField(term6962, term6962.getClass(), "internalDuration", term6963);
        setLongField(term6962, term6962.getClass(), "effectiveTotalSeconds", -4502405999831680926L);
        setIntField(term6962, term6962.getClass(), "effectiveNanoseconds", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "negated", argTypes, term6962, args);
    }

};


