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

public class Result_ResultBuilder_build_6943364295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2526;

    public Result_ResultBuilder_build_6943364295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2527 = new ArrayList();
        term2526 = newInstance(Class.forName("io.github.janlely.jparser.Result$ResultBuilder"));
        setField(term2526, term2526.getClass(), "result", term2527);
        setField(term2526, term2526.getClass(), "errorMsg", "ZiaGIbnzTs");
        setIntField(term2526, term2526.getClass(), "length", 962840079);
        setIntField(term2526, term2526.getClass(), "pos", 1540719661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result$ResultBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2526, args);
    }

};


