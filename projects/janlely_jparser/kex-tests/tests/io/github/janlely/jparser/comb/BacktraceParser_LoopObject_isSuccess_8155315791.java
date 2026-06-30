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

public class BacktraceParser_LoopObject_isSuccess_8155315791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197;

    public BacktraceParser_LoopObject_isSuccess_8155315791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term200 = new ArrayList();
        term197 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject"));
        Object term199 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setIntField(term197, term197.getClass(), "idx", 1622346318);
        setField(term199, term199.getClass(), "result", term200);
        setField(term199, term199.getClass(), "errorMsg", "SzjVpOQTyS");
        setIntField(term199, term199.getClass(), "length", 1048535127);
        setIntField(term199, term199.getClass(), "pos", -655067527);
        setField(term197, term197.getClass(), "best", term199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term197, args);
    }

};


