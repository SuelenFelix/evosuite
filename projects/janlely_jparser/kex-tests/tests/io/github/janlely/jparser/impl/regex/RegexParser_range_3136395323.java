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

public class RegexParser_range_3136395323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689;

    public RegexParser_range_3136395323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term692 = new HashMap();
        HashMap term697 = new HashMap();
        term689 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RegexParser"));
        Object term690 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term690, term690.getClass(), "value", 0);
        setField(term689, term689.getClass(), "groupId", term690);
        setField(term689, term689.getClass(), "groupResult", term692);
        setField(term689, term689.getClass(), "finalGroup", term697);
        setField(term689, term689.getClass(), "compiledParser", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RegexParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "range", argTypes, term689, args);
    }

};


