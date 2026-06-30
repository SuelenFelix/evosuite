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
import java.util.ArrayList;

public class Result_map_4138616229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14548;

    public Result_map_4138616229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14549 = new ArrayList();
        term14548 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term14548, term14548.getClass(), "result", term14549);
        setField(term14548, term14548.getClass(), "errorMsg", "DuKcNfVVYR");
        setIntField(term14548, term14548.getClass(), "length", 628918458);
        setIntField(term14548, term14548.getClass(), "pos", -1274456137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Function");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "map", argTypes, term14548, args);
    }

};


