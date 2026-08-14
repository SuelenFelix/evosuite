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

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_source_11245848734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8538;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_source_11245848734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8538 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8538, term8538.getClass(), "ts", null);
        setIntField(term8538, term8538.getClass(), "lengthStma", -615654495);
        setIntField(term8538, term8538.getClass(), "lengthMtma", -1476117762);
        setIntField(term8538, term8538.getClass(), "lengthLtma", -341962980);
        setField(term8538, term8538.getClass(), "source", "sEccwbJKYE");
        setIntField(term8538, term8538.getClass(), "offsetStma", 1532716628);
        setIntField(term8538, term8538.getClass(), "offsetMtma", -1801760683);
        setIntField(term8538, term8538.getClass(), "offsetLtma", 1141317871);
        setField(term8538, term8538.getClass(), "ps", null);
        setDoubleField(term8538, term8538.getClass(), "targetRange", 0.09067063848644474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWRooQKkdW";
        callMethod(klass, "source", argTypes, term8538, args);
    }

};


