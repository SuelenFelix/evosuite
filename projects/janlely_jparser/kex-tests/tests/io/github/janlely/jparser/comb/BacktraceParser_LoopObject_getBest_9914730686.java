package io.github.janlely.jparser.comb;

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
import static io.github.janlely.jparser.comb.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class BacktraceParser_LoopObject_getBest_9914730686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321;

    public BacktraceParser_LoopObject_getBest_9914730686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term324 = new ArrayList();
        term321 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject"));
        Object term323 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setIntField(term321, term321.getClass(), "idx", -203030934);
        setField(term323, term323.getClass(), "result", term324);
        setField(term323, term323.getClass(), "errorMsg", "NRdvgJlhkX");
        setIntField(term323, term323.getClass(), "length", -1179120542);
        setIntField(term323, term323.getClass(), "pos", -73683645);
        setField(term321, term321.getClass(), "best", term323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBest", argTypes, term321, args);
    }

};


