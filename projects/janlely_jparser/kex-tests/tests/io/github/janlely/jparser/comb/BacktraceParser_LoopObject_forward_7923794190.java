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

public class BacktraceParser_LoopObject_forward_7923794190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;

    public BacktraceParser_LoopObject_forward_7923794190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term169 = new ArrayList();
        term166 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject"));
        Object term168 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setIntField(term166, term166.getClass(), "idx", 597278769);
        setField(term168, term168.getClass(), "result", term169);
        setField(term168, term168.getClass(), "errorMsg", "EGtDIRbSSb");
        setIntField(term168, term168.getClass(), "length", -1685132342);
        setIntField(term168, term168.getClass(), "pos", -1456670397);
        setField(term166, term166.getClass(), "best", term168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "forward", argTypes, term166, args);
    }

};


