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
import java.util.LinkedList;

public class Result_ResultBuilder_result_3405568961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2381;
     Object term2400;

    public Result_ResultBuilder_result_3405568961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2382 = new ArrayList();
        term2381 = newInstance(Class.forName("io.github.janlely.jparser.Result$ResultBuilder"));
        setField(term2381, term2381.getClass(), "result", term2382);
        setField(term2381, term2381.getClass(), "errorMsg", "uuaPigETmJ");
        setIntField(term2381, term2381.getClass(), "length", 97029295);
        setIntField(term2381, term2381.getClass(), "pos", -1371869594);
        term2400 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result$ResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2400;
        callMethod(klass, "result", argTypes, term2381, args);
    }

};


