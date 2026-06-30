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

public class BacktraceParser_LoopObject_equals_6577876969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;
     Object term466;

    public BacktraceParser_LoopObject_equals_6577876969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term448 = new ArrayList();
        term445 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject"));
        Object term447 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setIntField(term445, term445.getClass(), "idx", -602026508);
        setField(term447, term447.getClass(), "result", term448);
        setField(term447, term447.getClass(), "errorMsg", "oVcInYnLWB");
        setIntField(term447, term447.getClass(), "length", -157887805);
        setIntField(term447, term447.getClass(), "pos", 1876565163);
        setField(term445, term445.getClass(), "best", term447);
        term466 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term466;
        callMethod(klass, "equals", argTypes, term445, args);
    }

};


