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

public class RegexParser_validToken_162715047614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1195;

    public RegexParser_validToken_162715047614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1198 = new HashMap();
        HashMap term1203 = new HashMap();
        term1195 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RegexParser"));
        Object term1196 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1196, term1196.getClass(), "value", 0);
        setField(term1195, term1195.getClass(), "groupId", term1196);
        setField(term1195, term1195.getClass(), "groupResult", term1198);
        setField(term1195, term1195.getClass(), "finalGroup", term1203);
        setField(term1195, term1195.getClass(), "compiledParser", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RegexParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validToken", argTypes, term1195, args);
    }

};


