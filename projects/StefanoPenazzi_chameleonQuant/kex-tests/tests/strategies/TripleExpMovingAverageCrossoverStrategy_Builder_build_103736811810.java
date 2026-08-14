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

public class TripleExpMovingAverageCrossoverStrategy_Builder_build_103736811810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9819;

    public TripleExpMovingAverageCrossoverStrategy_Builder_build_103736811810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9819 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9819, term9819.getClass(), "ts", null);
        setIntField(term9819, term9819.getClass(), "lengthStma", 114754804);
        setIntField(term9819, term9819.getClass(), "lengthMtma", 1687361082);
        setIntField(term9819, term9819.getClass(), "lengthLtma", 584893196);
        setField(term9819, term9819.getClass(), "source", "WzMEhMXkKx");
        setDoubleField(term9819, term9819.getClass(), "smoothingStma", 0.5335953039331021);
        setDoubleField(term9819, term9819.getClass(), "smoothingMtma", 0.5725602309856443);
        setDoubleField(term9819, term9819.getClass(), "smoothingLtma", 0.5310967137636303);
        setDoubleField(term9819, term9819.getClass(), "targetRange", 0.6054109236809134);
        setField(term9819, term9819.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term9819, args);
    }

};


