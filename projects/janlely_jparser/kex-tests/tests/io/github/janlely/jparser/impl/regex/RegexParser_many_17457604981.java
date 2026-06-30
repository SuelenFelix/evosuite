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

public class RegexParser_many_17457604981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663;

    public RegexParser_many_17457604981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term666 = new HashMap();
        HashMap term671 = new HashMap();
        term663 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RegexParser"));
        Object term664 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term664, term664.getClass(), "value", 0);
        setField(term663, term663.getClass(), "groupId", term664);
        setField(term663, term663.getClass(), "groupResult", term666);
        setField(term663, term663.getClass(), "finalGroup", term671);
        setField(term663, term663.getClass(), "compiledParser", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RegexParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "many", argTypes, term663, args);
    }

};


