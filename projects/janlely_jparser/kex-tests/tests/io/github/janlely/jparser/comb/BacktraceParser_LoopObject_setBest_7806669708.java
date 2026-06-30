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

public class BacktraceParser_LoopObject_setBest_7806669708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385;
     Object term406;

    public BacktraceParser_LoopObject_setBest_7806669708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term388 = new ArrayList();
        term385 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject"));
        Object term387 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setIntField(term385, term385.getClass(), "idx", -469968304);
        setField(term387, term387.getClass(), "result", term388);
        setField(term387, term387.getClass(), "errorMsg", "MxlszYVzRf");
        setIntField(term387, term387.getClass(), "length", -1145578966);
        setIntField(term387, term387.getClass(), "pos", 679763016);
        setField(term385, term385.getClass(), "best", term387);
        ArrayList term407 = new ArrayList();
        term406 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term406, term406.getClass(), "result", term407);
        setField(term406, term406.getClass(), "errorMsg", "LQFpaHEwXR");
        setIntField(term406, term406.getClass(), "length", 1962444399);
        setIntField(term406, term406.getClass(), "pos", 767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.Result");
        Object[] args = new Object[1];
        args[0] = term406;
        callMethod(klass, "setBest", argTypes, term385, args);
    }

};


