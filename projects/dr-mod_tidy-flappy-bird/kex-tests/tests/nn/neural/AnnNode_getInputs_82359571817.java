package nn.neural;

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
import static nn.neural.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AnnNode_getInputs_82359571817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13733;

    public AnnNode_getInputs_82359571817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13733 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term13733, term13733.getClass(), "output", null);
        setField(term13733, term13733.getClass(), "inputs", null);
        setField(term13733, term13733.getClass(), "outputs", null);
        setField(term13733, term13733.getClass(), "type", null);
        setIntField(term13733, term13733.getClass(), "id", 0);
        setDoubleField(term13733, term13733.getClass(), "bias", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInputs", argTypes, term13733, args);
    }

};


