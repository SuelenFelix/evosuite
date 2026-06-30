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

public class RegexParser_match_129141925512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1125;

    public RegexParser_match_129141925512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1128 = new HashMap();
        HashMap term1133 = new HashMap();
        term1125 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RegexParser"));
        Object term1126 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1126, term1126.getClass(), "value", 0);
        setField(term1125, term1125.getClass(), "groupId", term1126);
        setField(term1125, term1125.getClass(), "groupResult", term1128);
        setField(term1125, term1125.getClass(), "finalGroup", term1133);
        setField(term1125, term1125.getClass(), "compiledParser", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RegexParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        callMethod(klass, "match", argTypes, term1125, args);
    }

};


