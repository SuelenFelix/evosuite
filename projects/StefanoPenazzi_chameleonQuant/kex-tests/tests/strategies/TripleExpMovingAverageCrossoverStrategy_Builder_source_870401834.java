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

public class TripleExpMovingAverageCrossoverStrategy_Builder_source_870401834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9609;

    public TripleExpMovingAverageCrossoverStrategy_Builder_source_870401834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9609 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9609, term9609.getClass(), "ts", null);
        setIntField(term9609, term9609.getClass(), "lengthStma", -1274456137);
        setIntField(term9609, term9609.getClass(), "lengthMtma", 1041916673);
        setIntField(term9609, term9609.getClass(), "lengthLtma", -601863069);
        setField(term9609, term9609.getClass(), "source", "MvRIxilFMJ");
        setDoubleField(term9609, term9609.getClass(), "smoothingStma", 0.45069204793711093);
        setDoubleField(term9609, term9609.getClass(), "smoothingMtma", 0.9341364461850963);
        setDoubleField(term9609, term9609.getClass(), "smoothingLtma", 0.9022041121474429);
        setDoubleField(term9609, term9609.getClass(), "targetRange", 0.6512870939318848);
        setField(term9609, term9609.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iNwOJRBEjp";
        callMethod(klass, "source", argTypes, term9609, args);
    }

};


