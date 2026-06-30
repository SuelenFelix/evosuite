package io.github.janlely.jparser;

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
import static io.github.janlely.jparser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Result_reachEnd_38010380128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14765;

    public Result_reachEnd_38010380128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14765 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term14765, term14765.getClass(), "result", null);
        setField(term14765, term14765.getClass(), "errorMsg", null);
        setIntField(term14765, term14765.getClass(), "length", 0);
        setIntField(term14765, term14765.getClass(), "pos", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reachEnd", argTypes, term14765, args);
    }

};


