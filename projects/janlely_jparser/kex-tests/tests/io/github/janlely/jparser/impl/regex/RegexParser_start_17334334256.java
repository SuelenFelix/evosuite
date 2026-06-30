package io.github.janlely.jparser.impl.regex;

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
import static io.github.janlely.jparser.impl.regex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class RegexParser_start_17334334256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term728;

    public RegexParser_start_17334334256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term731 = new HashMap();
        HashMap term736 = new HashMap();
        term728 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RegexParser"));
        Object term729 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term729, term729.getClass(), "value", 0);
        setField(term728, term728.getClass(), "groupId", term729);
        setField(term728, term728.getClass(), "groupResult", term731);
        setField(term728, term728.getClass(), "finalGroup", term736);
        setField(term728, term728.getClass(), "compiledParser", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RegexParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "start", argTypes, term728, args);
    }

};


