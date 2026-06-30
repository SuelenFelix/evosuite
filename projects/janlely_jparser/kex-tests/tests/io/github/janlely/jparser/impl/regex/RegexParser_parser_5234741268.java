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

public class RegexParser_parser_5234741268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741;

    public RegexParser_parser_5234741268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term744 = new HashMap();
        HashMap term749 = new HashMap();
        term741 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RegexParser"));
        Object term742 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term742, term742.getClass(), "value", 0);
        setField(term741, term741.getClass(), "groupId", term742);
        setField(term741, term741.getClass(), "groupResult", term744);
        setField(term741, term741.getClass(), "finalGroup", term749);
        setField(term741, term741.getClass(), "compiledParser", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RegexParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parser", argTypes, term741, args);
    }

};


