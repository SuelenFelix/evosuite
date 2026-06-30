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
import java.lang.Integer;
import java.util.ArrayList;

public class BacktraceParser_LoopObject_init_17267726243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259;
     Object term261;

    public BacktraceParser_LoopObject_init_17267726243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259 = new Integer(-1007160944);
        ArrayList term262 = new ArrayList();
        term261 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term261, term261.getClass(), "result", term262);
        setField(term261, term261.getClass(), "errorMsg", "hRNSzYYIrc");
        setIntField(term261, term261.getClass(), "length", 1135664017);
        setIntField(term261, term261.getClass(), "pos", 590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("io.github.janlely.jparser.Result");
        Object[] args = new Object[2];
        args[0] = term259;
        args[1] = term261;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


