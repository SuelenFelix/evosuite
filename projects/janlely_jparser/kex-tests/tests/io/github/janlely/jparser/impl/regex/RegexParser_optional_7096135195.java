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

public class RegexParser_optional_7096135195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715;

    public RegexParser_optional_7096135195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term718 = new HashMap();
        HashMap term723 = new HashMap();
        term715 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RegexParser"));
        Object term716 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term716, term716.getClass(), "value", 0);
        setField(term715, term715.getClass(), "groupId", term716);
        setField(term715, term715.getClass(), "groupResult", term718);
        setField(term715, term715.getClass(), "finalGroup", term723);
        setField(term715, term715.getClass(), "compiledParser", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RegexParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "optional", argTypes, term715, args);
    }

};


