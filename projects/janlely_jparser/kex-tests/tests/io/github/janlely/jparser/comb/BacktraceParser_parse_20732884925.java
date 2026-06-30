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
import java.util.ArrayList;

public class BacktraceParser_parse_20732884925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term629;

    public BacktraceParser_parse_20732884925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term631 = new ArrayList();
        term629 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser"));
        setBooleanField(term629, term629.getClass(), "greedy", true);
        setField(term629, term629.getClass(), "parsers", term631);
        setIntField(term629, term629.getClass(), "head", 292681826);
        setField(term629, term629.getClass(), "runnable", null);
        setBooleanField(term629, term629.getClass(), "ignore", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.IBuffer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parse", argTypes, term629, args);
    }

};


