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

public class TripleMovingAverageCrossoverStrategy_run_1692115425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16525;

    public TripleMovingAverageCrossoverStrategy_run_1692115425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16525 = newInstance(Class.forName("strategies.TripleMovingAverageCrossoverStrategy"));
        setField(term16525, term16525.getClass(), "itsRef", null);
        setField(term16525, term16525.getClass(), "stma", null);
        setField(term16525, term16525.getClass(), "mtma", null);
        setField(term16525, term16525.getClass(), "ltma", null);
        setField(term16525, term16525.getClass(), "source", null);
        setDoubleField(term16525, term16525.getClass(), "targetRange", 0.0);
        setField(term16525, term16525.getClass(), "crossList", null);
        setField(term16525, term16525.getClass(), "positions", null);
        setField(term16525, term16525.getClass(), "positionSizing", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleMovingAverageCrossoverStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term16525, args);
    }

};


