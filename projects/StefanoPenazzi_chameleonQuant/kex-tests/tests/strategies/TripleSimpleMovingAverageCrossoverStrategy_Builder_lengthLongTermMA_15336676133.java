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

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_lengthLongTermMA_15336676133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8506;
     Object term8526;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_lengthLongTermMA_15336676133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8506 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8506, term8506.getClass(), "ts", null);
        setIntField(term8506, term8506.getClass(), "lengthStma", -1888585309);
        setIntField(term8506, term8506.getClass(), "lengthMtma", 683666002);
        setIntField(term8506, term8506.getClass(), "lengthLtma", 1596213415);
        setField(term8506, term8506.getClass(), "source", "SPpkrGcPRr");
        setIntField(term8506, term8506.getClass(), "offsetStma", -268815336);
        setIntField(term8506, term8506.getClass(), "offsetMtma", -1210583429);
        setIntField(term8506, term8506.getClass(), "offsetLtma", -663691365);
        setField(term8506, term8506.getClass(), "ps", null);
        setDoubleField(term8506, term8506.getClass(), "targetRange", 0.5617009352394552);
        term8526 = new Integer(339854490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8526;
        callMethod(klass, "lengthLongTermMA", argTypes, term8506, args);
    }

};


