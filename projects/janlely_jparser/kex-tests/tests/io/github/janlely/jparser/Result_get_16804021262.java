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
import java.lang.Integer;

public class Result_get_16804021262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14360;
     Object term14379;

    public Result_get_16804021262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14361 = new ArrayList();
        term14360 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term14360, term14360.getClass(), "result", term14361);
        setField(term14360, term14360.getClass(), "errorMsg", "AhOHzCsHKW");
        setIntField(term14360, term14360.getClass(), "length", 1830648570);
        setIntField(term14360, term14360.getClass(), "pos", -227365013);
        term14379 = new Integer(11724947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14379;
        callMethod(klass, "get", argTypes, term14360, args);
    }

};


