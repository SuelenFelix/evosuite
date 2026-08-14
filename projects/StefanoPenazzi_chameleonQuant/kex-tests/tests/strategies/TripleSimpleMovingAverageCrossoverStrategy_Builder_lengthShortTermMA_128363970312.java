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

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_lengthShortTermMA_128363970312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8778;
     Object term8786;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_lengthShortTermMA_128363970312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8778 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8778, term8778.getClass(), "ts", null);
        setIntField(term8778, term8778.getClass(), "lengthStma", 0);
        setIntField(term8778, term8778.getClass(), "lengthMtma", 0);
        setIntField(term8778, term8778.getClass(), "lengthLtma", 0);
        setField(term8778, term8778.getClass(), "source", null);
        setIntField(term8778, term8778.getClass(), "offsetStma", 0);
        setIntField(term8778, term8778.getClass(), "offsetMtma", 0);
        setIntField(term8778, term8778.getClass(), "offsetLtma", 0);
        setField(term8778, term8778.getClass(), "ps", null);
        setDoubleField(term8778, term8778.getClass(), "targetRange", 0.0);
        term8786 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8786;
        callMethod(klass, "lengthShortTermMA", argTypes, term8778, args);
    }

};


