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

public class BacktraceParser_LoopObject_canEqual_14637493310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477;
     Object term498;

    public BacktraceParser_LoopObject_canEqual_14637493310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term480 = new ArrayList();
        term477 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject"));
        Object term479 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setIntField(term477, term477.getClass(), "idx", -817164822);
        setField(term479, term479.getClass(), "result", term480);
        setField(term479, term479.getClass(), "errorMsg", "aJlieCFVtF");
        setIntField(term479, term479.getClass(), "length", -1016503459);
        setIntField(term479, term479.getClass(), "pos", -1968847291);
        setField(term477, term477.getClass(), "best", term479);
        term498 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term498;
        callMethod(klass, "canEqual", argTypes, term477, args);
    }

};


