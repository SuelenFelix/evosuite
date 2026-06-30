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

public class RegexParser_some_15611053092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676;

    public RegexParser_some_15611053092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term679 = new HashMap();
        HashMap term684 = new HashMap();
        term676 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RegexParser"));
        Object term677 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term677, term677.getClass(), "value", 0);
        setField(term676, term676.getClass(), "groupId", term677);
        setField(term676, term676.getClass(), "groupResult", term679);
        setField(term676, term676.getClass(), "finalGroup", term684);
        setField(term676, term676.getClass(), "compiledParser", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RegexParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "some", argTypes, term676, args);
    }

};


