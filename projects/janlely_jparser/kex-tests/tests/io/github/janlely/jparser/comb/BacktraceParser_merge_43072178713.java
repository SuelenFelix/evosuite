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

public class BacktraceParser_merge_43072178713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711;

    public BacktraceParser_merge_43072178713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term711 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser"));
        setBooleanField(term711, term711.getClass(), "greedy", false);
        setField(term711, term711.getClass(), "parsers", null);
        setIntField(term711, term711.getClass(), "head", 0);
        setField(term711, term711.getClass(), "runnable", null);
        setBooleanField(term711, term711.getClass(), "ignore", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.github.janlely.jparser.Result");
        argTypes[1] = Class.forName("io.github.janlely.jparser.Result");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "merge", argTypes, term711, args);
    }

};


