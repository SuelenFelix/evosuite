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

public class AnnNode_connectInput_11512880532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1513;

    public AnnNode_connectInput_11512880532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1513 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term1513, term1513.getClass(), "output", null);
        setField(term1513, term1513.getClass(), "inputs", null);
        setField(term1513, term1513.getClass(), "outputs", null);
        setField(term1513, term1513.getClass(), "type", null);
        setIntField(term1513, term1513.getClass(), "id", 0);
        setDoubleField(term1513, term1513.getClass(), "bias", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.neural.AnnConnection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "connectInput", argTypes, term1513, args);
    }

};


