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

public class DualSimpleMovingAverageCrossoverStrategy_Builder_lengthShortTermMA_11898463591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11273;
     Object term11290;

    public DualSimpleMovingAverageCrossoverStrategy_Builder_lengthShortTermMA_11898463591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11273 = newInstance(Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term11273, term11273.getClass(), "ts", null);
        setIntField(term11273, term11273.getClass(), "lengthStma", 1152356969);
        setIntField(term11273, term11273.getClass(), "lengthLtma", -1667990367);
        setField(term11273, term11273.getClass(), "source", "SdCKLMIYnX");
        setIntField(term11273, term11273.getClass(), "offsetStma", -1214628358);
        setIntField(term11273, term11273.getClass(), "offsetLtma", 1102721075);
        setField(term11273, term11273.getClass(), "ps", null);
        term11290 = new Integer(-426764678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11290;
        callMethod(klass, "lengthShortTermMA", argTypes, term11273, args);
    }

};


