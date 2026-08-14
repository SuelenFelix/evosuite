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

public class TripleExpMovingAverageCrossoverStrategy_Builder_lengthShortTermMA_17997025371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9513;
     Object term9533;

    public TripleExpMovingAverageCrossoverStrategy_Builder_lengthShortTermMA_17997025371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9513 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9513, term9513.getClass(), "ts", null);
        setIntField(term9513, term9513.getClass(), "lengthStma", 1953277050);
        setIntField(term9513, term9513.getClass(), "lengthMtma", 1283079251);
        setIntField(term9513, term9513.getClass(), "lengthLtma", -523949691);
        setField(term9513, term9513.getClass(), "source", "OEXDRUKcFl");
        setDoubleField(term9513, term9513.getClass(), "smoothingStma", 0.6561919196821765);
        setDoubleField(term9513, term9513.getClass(), "smoothingMtma", 0.7330178886612495);
        setDoubleField(term9513, term9513.getClass(), "smoothingLtma", 0.7618164754425794);
        setDoubleField(term9513, term9513.getClass(), "targetRange", 0.7385589312559342);
        setField(term9513, term9513.getClass(), "ps", null);
        term9533 = new Integer(1398204340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9533;
        callMethod(klass, "lengthShortTermMA", argTypes, term9513, args);
    }

};


