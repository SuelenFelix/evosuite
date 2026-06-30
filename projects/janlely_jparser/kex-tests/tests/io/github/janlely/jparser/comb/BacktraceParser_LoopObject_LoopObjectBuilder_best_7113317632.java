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

public class BacktraceParser_LoopObject_LoopObjectBuilder_best_7113317632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term55;

    public BacktraceParser_LoopObject_LoopObjectBuilder_best_7113317632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37 = new ArrayList();
        term34 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject$LoopObjectBuilder"));
        Object term36 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setIntField(term34, term34.getClass(), "idx", -1922583790);
        setField(term36, term36.getClass(), "result", term37);
        setField(term36, term36.getClass(), "errorMsg", "sjlJAEtRrb");
        setIntField(term36, term36.getClass(), "length", -616727354);
        setIntField(term36, term36.getClass(), "pos", -1955890973);
        setField(term34, term34.getClass(), "best", term36);
        ArrayList term56 = new ArrayList();
        term55 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term55, term55.getClass(), "result", term56);
        setField(term55, term55.getClass(), "errorMsg", "MuLcgQHgqz");
        setIntField(term55, term55.getClass(), "length", -2038273078);
        setIntField(term55, term55.getClass(), "pos", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject$LoopObjectBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.Result");
        Object[] args = new Object[1];
        args[0] = term55;
        callMethod(klass, "best", argTypes, term34, args);
    }

};


