package strategies;

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
import static strategies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TripleExpMovingAverageCrossoverStrategy_Builder_lengthLongTermMA_3220425573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9577;
     Object term9597;

    public TripleExpMovingAverageCrossoverStrategy_Builder_lengthLongTermMA_3220425573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9577 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9577, term9577.getClass(), "ts", null);
        setIntField(term9577, term9577.getClass(), "lengthStma", -1002370457);
        setIntField(term9577, term9577.getClass(), "lengthMtma", -2014576105);
        setIntField(term9577, term9577.getClass(), "lengthLtma", 1296895584);
        setField(term9577, term9577.getClass(), "source", "yGtHPyvYiQ");
        setDoubleField(term9577, term9577.getClass(), "smoothingStma", 0.9511861072660375);
        setDoubleField(term9577, term9577.getClass(), "smoothingMtma", 0.05880719443135807);
        setDoubleField(term9577, term9577.getClass(), "smoothingLtma", 0.34010089048558567);
        setDoubleField(term9577, term9577.getClass(), "targetRange", 0.19625398866403143);
        setField(term9577, term9577.getClass(), "ps", null);
        term9597 = new Integer(628918458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9597;
        callMethod(klass, "lengthLongTermMA", argTypes, term9577, args);
    }

};


