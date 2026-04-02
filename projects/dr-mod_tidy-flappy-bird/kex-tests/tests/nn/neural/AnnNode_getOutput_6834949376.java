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

public class AnnNode_getOutput_6834949376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2117;

    public AnnNode_getOutput_6834949376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2117 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term2117, term2117.getClass(), "output", null);
        setField(term2117, term2117.getClass(), "inputs", null);
        setField(term2117, term2117.getClass(), "outputs", null);
        setField(term2117, term2117.getClass(), "type", null);
        setIntField(term2117, term2117.getClass(), "id", 0);
        setDoubleField(term2117, term2117.getClass(), "bias", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOutput", argTypes, term2117, args);
    }

};


