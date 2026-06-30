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

public class BacktraceParser_LoopObject_LoopObjectBuilder_idx_3453740146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;
     Object term158;

    public BacktraceParser_LoopObject_LoopObjectBuilder_idx_3453740146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject$LoopObjectBuilder"));
        setIntField(term156, term156.getClass(), "idx", 0);
        setField(term156, term156.getClass(), "best", null);
        term158 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject$LoopObjectBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term158;
        callMethod(klass, "idx", argTypes, term156, args);
    }

};


