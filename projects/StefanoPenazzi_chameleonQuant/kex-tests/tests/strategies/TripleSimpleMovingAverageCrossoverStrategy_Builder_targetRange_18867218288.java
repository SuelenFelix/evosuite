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
import java.lang.Double;

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_targetRange_18867218288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8686;
     Object term8706;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_targetRange_18867218288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8686 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8686, term8686.getClass(), "ts", null);
        setIntField(term8686, term8686.getClass(), "lengthStma", -1963464809);
        setIntField(term8686, term8686.getClass(), "lengthMtma", 71190297);
        setIntField(term8686, term8686.getClass(), "lengthLtma", 1202361360);
        setField(term8686, term8686.getClass(), "source", "xBsXSDjXYK");
        setIntField(term8686, term8686.getClass(), "offsetStma", -2015048153);
        setIntField(term8686, term8686.getClass(), "offsetMtma", -2063457669);
        setIntField(term8686, term8686.getClass(), "offsetLtma", -1222006000);
        setField(term8686, term8686.getClass(), "ps", null);
        setDoubleField(term8686, term8686.getClass(), "targetRange", 0.5644914462415626);
        term8706 = new Double(0.509895859167191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term8706;
        callMethod(klass, "targetRange", argTypes, term8686, args);
    }

};


