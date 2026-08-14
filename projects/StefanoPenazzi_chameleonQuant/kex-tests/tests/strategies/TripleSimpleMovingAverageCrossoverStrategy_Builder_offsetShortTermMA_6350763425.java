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

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_offsetShortTermMA_6350763425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8590;
     Object term8610;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_offsetShortTermMA_6350763425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8590 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8590, term8590.getClass(), "ts", null);
        setIntField(term8590, term8590.getClass(), "lengthStma", 890669485);
        setIntField(term8590, term8590.getClass(), "lengthMtma", 691577392);
        setIntField(term8590, term8590.getClass(), "lengthLtma", -893623680);
        setField(term8590, term8590.getClass(), "source", "vjxIhXHxGR");
        setIntField(term8590, term8590.getClass(), "offsetStma", -1963434938);
        setIntField(term8590, term8590.getClass(), "offsetMtma", 906181092);
        setIntField(term8590, term8590.getClass(), "offsetLtma", 1045657203);
        setField(term8590, term8590.getClass(), "ps", null);
        setDoubleField(term8590, term8590.getClass(), "targetRange", 0.268304014379393);
        term8610 = new Integer(1386130016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8610;
        callMethod(klass, "offsetShortTermMA", argTypes, term8590, args);
    }

};


