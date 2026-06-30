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
import java.lang.Integer;

public class Result_ResultBuilder_pos_17004871511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2595;
     Object term2598;

    public Result_ResultBuilder_pos_17004871511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2595 = newInstance(Class.forName("io.github.janlely.jparser.Result$ResultBuilder"));
        setField(term2595, term2595.getClass(), "result", null);
        setField(term2595, term2595.getClass(), "errorMsg", null);
        setIntField(term2595, term2595.getClass(), "length", 0);
        setIntField(term2595, term2595.getClass(), "pos", 0);
        term2598 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result$ResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2598;
        callMethod(klass, "pos", argTypes, term2595, args);
    }

};


