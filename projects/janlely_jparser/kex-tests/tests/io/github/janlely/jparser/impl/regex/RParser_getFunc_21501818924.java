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

public class RParser_getFunc_21501818924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15666;

    public RParser_getFunc_21501818924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15666 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term15666, term15666.getClass(), "type", null);
        setIntField(term15666, term15666.getClass(), "quoteId", 0);
        setIntField(term15666, term15666.getClass(), "groupId", 0);
        setField(term15666, term15666.getClass(), "parser", null);
        setField(term15666, term15666.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFunc", argTypes, term15666, args);
    }

};


