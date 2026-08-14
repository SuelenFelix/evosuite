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

public class AnnNode_getOutputs_120614080918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13736;

    public AnnNode_getOutputs_120614080918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13736 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term13736, term13736.getClass(), "output", null);
        setField(term13736, term13736.getClass(), "inputs", null);
        setField(term13736, term13736.getClass(), "outputs", null);
        setField(term13736, term13736.getClass(), "type", null);
        setIntField(term13736, term13736.getClass(), "id", 0);
        setDoubleField(term13736, term13736.getClass(), "bias", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOutputs", argTypes, term13736, args);
    }

};


