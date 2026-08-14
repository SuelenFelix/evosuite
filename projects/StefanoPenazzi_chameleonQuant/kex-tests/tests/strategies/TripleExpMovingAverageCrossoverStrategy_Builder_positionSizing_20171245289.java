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

public class TripleExpMovingAverageCrossoverStrategy_Builder_positionSizing_20171245289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9789;

    public TripleExpMovingAverageCrossoverStrategy_Builder_positionSizing_20171245289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9789 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9789, term9789.getClass(), "ts", null);
        setIntField(term9789, term9789.getClass(), "lengthStma", -1970452551);
        setIntField(term9789, term9789.getClass(), "lengthMtma", -1896376975);
        setIntField(term9789, term9789.getClass(), "lengthLtma", 729658803);
        setField(term9789, term9789.getClass(), "source", "hCWPJQKpdc");
        setDoubleField(term9789, term9789.getClass(), "smoothingStma", 0.9276995636844321);
        setDoubleField(term9789, term9789.getClass(), "smoothingMtma", 0.7636130748477434);
        setDoubleField(term9789, term9789.getClass(), "smoothingLtma", 0.07901636960861558);
        setDoubleField(term9789, term9789.getClass(), "targetRange", 0.18717846301066243);
        setField(term9789, term9789.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("strategies.positionsizing.PositionSizingI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "positionSizing", argTypes, term9789, args);
    }

};


