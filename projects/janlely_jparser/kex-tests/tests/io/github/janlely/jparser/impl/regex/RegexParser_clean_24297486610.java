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

public class RegexParser_clean_24297486610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1077;

    public RegexParser_clean_24297486610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1080 = new HashMap();
        HashMap term1085 = new HashMap();
        term1077 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RegexParser"));
        Object term1078 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1078, term1078.getClass(), "value", 0);
        setField(term1077, term1077.getClass(), "groupId", term1078);
        setField(term1077, term1077.getClass(), "groupResult", term1080);
        setField(term1077, term1077.getClass(), "finalGroup", term1085);
        setField(term1077, term1077.getClass(), "compiledParser", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RegexParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clean", argTypes, term1077, args);
    }

};


