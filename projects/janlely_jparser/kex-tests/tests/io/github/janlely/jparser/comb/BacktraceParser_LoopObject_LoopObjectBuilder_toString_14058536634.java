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

public class BacktraceParser_LoopObject_LoopObjectBuilder_toString_14058536634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;

    public BacktraceParser_LoopObject_LoopObjectBuilder_toString_14058536634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term128 = new ArrayList();
        term125 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject$LoopObjectBuilder"));
        Object term127 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setIntField(term125, term125.getClass(), "idx", 1134449235);
        setField(term127, term127.getClass(), "result", term128);
        setField(term127, term127.getClass(), "errorMsg", "jJCZpVmanW");
        setIntField(term127, term127.getClass(), "length", -883034806);
        setIntField(term127, term127.getClass(), "pos", 1585847225);
        setField(term125, term125.getClass(), "best", term127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject$LoopObjectBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term125, args);
    }

};


