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

public class Result_ResultBuilder_errorMsg_11903738132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2413;

    public Result_ResultBuilder_errorMsg_11903738132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2414 = new ArrayList();
        term2413 = newInstance(Class.forName("io.github.janlely.jparser.Result$ResultBuilder"));
        setField(term2413, term2413.getClass(), "result", term2414);
        setField(term2413, term2413.getClass(), "errorMsg", "MxlszYVzRf");
        setIntField(term2413, term2413.getClass(), "length", -2095575670);
        setIntField(term2413, term2413.getClass(), "pos", 1225272962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result$ResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "errorMsg", argTypes, term2413, args);
    }

};


