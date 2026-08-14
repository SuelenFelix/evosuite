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

public class DualExpMovingAverageCrossoverStrategy_Builder_lengthLongTermMA_2765479712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11576;
     Object term11593;

    public DualExpMovingAverageCrossoverStrategy_Builder_lengthLongTermMA_2765479712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11576 = newInstance(Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder"));
        setField(term11576, term11576.getClass(), "ts", null);
        setIntField(term11576, term11576.getClass(), "lengthStma", 1045547089);
        setIntField(term11576, term11576.getClass(), "lengthLtma", -1122880881);
        setField(term11576, term11576.getClass(), "source", "PznxWXsZME");
        setDoubleField(term11576, term11576.getClass(), "smoothingStma", 0.25025774487844066);
        setDoubleField(term11576, term11576.getClass(), "smoothingLtma", 0.1858089882752998);
        setField(term11576, term11576.getClass(), "ps", null);
        term11593 = new Integer(-542712742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11593;
        callMethod(klass, "lengthLongTermMA", argTypes, term11576, args);
    }

};


