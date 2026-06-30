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

public class BacktraceParser_LoopObject_getIdx_6468390175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290;

    public BacktraceParser_LoopObject_getIdx_6468390175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term293 = new ArrayList();
        term290 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject"));
        Object term292 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setIntField(term290, term290.getClass(), "idx", 865208305);
        setField(term292, term292.getClass(), "result", term293);
        setField(term292, term292.getClass(), "errorMsg", "RMFIsYGgne");
        setIntField(term292, term292.getClass(), "length", -1275173084);
        setIntField(term292, term292.getClass(), "pos", -244121226);
        setField(term290, term290.getClass(), "best", term292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdx", argTypes, term290, args);
    }

};


