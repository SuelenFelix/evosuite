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
import java.util.ArrayList;

public class BacktraceParser_merge_4307217876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637;
     Object term656;

    public BacktraceParser_merge_4307217876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term638 = new ArrayList();
        term637 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term637, term637.getClass(), "result", term638);
        setField(term637, term637.getClass(), "errorMsg", "HyxfbSQYBe");
        setIntField(term637, term637.getClass(), "length", 458147407);
        setIntField(term637, term637.getClass(), "pos", -184153539);
        ArrayList term657 = new ArrayList();
        term656 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term656, term656.getClass(), "result", term657);
        setField(term656, term656.getClass(), "errorMsg", "pCTimMblYc");
        setIntField(term656, term656.getClass(), "length", 493620644);
        setIntField(term656, term656.getClass(), "pos", 1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.github.janlely.jparser.Result");
        argTypes[1] = Class.forName("io.github.janlely.jparser.Result");
        Object[] args = new Object[2];
        args[0] = term637;
        args[1] = term656;
        callMethod(klass, "merge", argTypes, null, args);
    }

};


