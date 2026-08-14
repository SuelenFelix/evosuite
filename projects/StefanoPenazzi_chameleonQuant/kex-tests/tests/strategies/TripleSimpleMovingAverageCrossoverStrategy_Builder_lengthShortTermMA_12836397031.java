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

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_lengthShortTermMA_12836397031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8442;
     Object term8462;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_lengthShortTermMA_12836397031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8442 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8442, term8442.getClass(), "ts", null);
        setIntField(term8442, term8442.getClass(), "lengthStma", 1442160736);
        setIntField(term8442, term8442.getClass(), "lengthMtma", 1114000454);
        setIntField(term8442, term8442.getClass(), "lengthLtma", -556405712);
        setField(term8442, term8442.getClass(), "source", "XPKmummaqg");
        setIntField(term8442, term8442.getClass(), "offsetStma", -1772434990);
        setIntField(term8442, term8442.getClass(), "offsetMtma", -1845499264);
        setIntField(term8442, term8442.getClass(), "offsetLtma", -505439934);
        setField(term8442, term8442.getClass(), "ps", null);
        setDoubleField(term8442, term8442.getClass(), "targetRange", 0.39286935532362843);
        term8462 = new Integer(-344842608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8462;
        callMethod(klass, "lengthShortTermMA", argTypes, term8442, args);
    }

};


