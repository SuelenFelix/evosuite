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

public class RegexParser_escape_117684856015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1208;

    public RegexParser_escape_117684856015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1211 = new HashMap();
        HashMap term1216 = new HashMap();
        term1208 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RegexParser"));
        Object term1209 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1209, term1209.getClass(), "value", 0);
        setField(term1208, term1208.getClass(), "groupId", term1209);
        setField(term1208, term1208.getClass(), "groupResult", term1211);
        setField(term1208, term1208.getClass(), "finalGroup", term1216);
        setField(term1208, term1208.getClass(), "compiledParser", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RegexParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "escape", argTypes, term1208, args);
    }

};


