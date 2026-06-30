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

public class BacktraceParser_LoopObject_LoopObjectBuilder_idx_3453740141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term22;

    public BacktraceParser_LoopObject_LoopObjectBuilder_idx_3453740141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4 = new ArrayList();
        term1 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject$LoopObjectBuilder"));
        Object term3 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setIntField(term1, term1.getClass(), "idx", 568599855);
        setField(term3, term3.getClass(), "result", term4);
        setField(term3, term3.getClass(), "errorMsg", "PAEBtnZtTD");
        setIntField(term3, term3.getClass(), "length", 1162663216);
        setIntField(term3, term3.getClass(), "pos", 1484323161);
        setField(term1, term1.getClass(), "best", term3);
        term22 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject$LoopObjectBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22;
        callMethod(klass, "idx", argTypes, term1, args);
    }

};


