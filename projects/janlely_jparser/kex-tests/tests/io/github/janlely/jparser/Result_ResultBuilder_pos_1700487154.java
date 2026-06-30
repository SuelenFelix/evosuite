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

public class Result_ResultBuilder_pos_1700487154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2495;
     Object term2514;

    public Result_ResultBuilder_pos_1700487154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2496 = new ArrayList();
        term2495 = newInstance(Class.forName("io.github.janlely.jparser.Result$ResultBuilder"));
        setField(term2495, term2495.getClass(), "result", term2496);
        setField(term2495, term2495.getClass(), "errorMsg", "aJlieCFVtF");
        setIntField(term2495, term2495.getClass(), "length", -112921587);
        setIntField(term2495, term2495.getClass(), "pos", 933028652);
        term2514 = new Integer(287287233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result$ResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2514;
        callMethod(klass, "pos", argTypes, term2495, args);
    }

};


