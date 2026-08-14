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

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_build_152089962610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8748;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_build_152089962610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8748 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8748, term8748.getClass(), "ts", null);
        setIntField(term8748, term8748.getClass(), "lengthStma", 202001407);
        setIntField(term8748, term8748.getClass(), "lengthMtma", 158873461);
        setIntField(term8748, term8748.getClass(), "lengthLtma", -430151637);
        setField(term8748, term8748.getClass(), "source", "ZVecLZMLHF");
        setIntField(term8748, term8748.getClass(), "offsetStma", -1697741339);
        setIntField(term8748, term8748.getClass(), "offsetMtma", 98922530);
        setIntField(term8748, term8748.getClass(), "offsetLtma", -1388471422);
        setField(term8748, term8748.getClass(), "ps", null);
        setDoubleField(term8748, term8748.getClass(), "targetRange", 0.686293604788188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term8748, args);
    }

};


