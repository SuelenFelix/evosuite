package io.github.janlely.jparser.comb;

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
import static io.github.janlely.jparser.comb.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BacktraceParser_onResultFound_9553476807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term695;

    public BacktraceParser_onResultFound_9553476807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term695 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser"));
        setBooleanField(term695, term695.getClass(), "greedy", false);
        setField(term695, term695.getClass(), "parsers", null);
        setIntField(term695, term695.getClass(), "head", 0);
        setField(term695, term695.getClass(), "runnable", null);
        setBooleanField(term695, term695.getClass(), "ignore", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Runnable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onResultFound", argTypes, term695, args);
    }

};


