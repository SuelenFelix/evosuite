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

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_offsetMediumTermMA_15416268076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8622;
     Object term8642;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_offsetMediumTermMA_15416268076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8622 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8622, term8622.getClass(), "ts", null);
        setIntField(term8622, term8622.getClass(), "lengthStma", 1072005683);
        setIntField(term8622, term8622.getClass(), "lengthMtma", 1861318859);
        setIntField(term8622, term8622.getClass(), "lengthLtma", 1474524152);
        setField(term8622, term8622.getClass(), "source", "QXzGXbEXMu");
        setIntField(term8622, term8622.getClass(), "offsetStma", 568954359);
        setIntField(term8622, term8622.getClass(), "offsetMtma", 53410913);
        setIntField(term8622, term8622.getClass(), "offsetLtma", -375014958);
        setField(term8622, term8622.getClass(), "ps", null);
        setDoubleField(term8622, term8622.getClass(), "targetRange", 0.7171972879282721);
        term8642 = new Integer(1107176718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8642;
        callMethod(klass, "offsetMediumTermMA", argTypes, term8622, args);
    }

};


