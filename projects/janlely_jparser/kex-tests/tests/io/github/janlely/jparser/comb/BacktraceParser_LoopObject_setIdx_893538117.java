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
import java.lang.Integer;

public class BacktraceParser_LoopObject_setIdx_893538117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352;
     Object term373;

    public BacktraceParser_LoopObject_setIdx_893538117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term355 = new ArrayList();
        term352 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject"));
        Object term354 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setIntField(term352, term352.getClass(), "idx", -226514366);
        setField(term354, term354.getClass(), "result", term355);
        setField(term354, term354.getClass(), "errorMsg", "uuaPigETmJ");
        setIntField(term354, term354.getClass(), "length", 1193880199);
        setIntField(term354, term354.getClass(), "pos", -1087774327);
        setField(term352, term352.getClass(), "best", term354);
        term373 = new Integer(-1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term373;
        callMethod(klass, "setIdx", argTypes, term352, args);
    }

};


