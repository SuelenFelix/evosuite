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
import java.lang.Integer;

public class AnnNode_calculateRecoursiveOutput_117161177119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3140;
     Object term3143;

    public AnnNode_calculateRecoursiveOutput_117161177119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3140 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term3140, term3140.getClass(), "output", null);
        setField(term3140, term3140.getClass(), "inputs", null);
        setField(term3140, term3140.getClass(), "outputs", null);
        setField(term3140, term3140.getClass(), "type", null);
        setIntField(term3140, term3140.getClass(), "id", 0);
        setDoubleField(term3140, term3140.getClass(), "bias", 0.0);
        term3143 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.function.Function");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3143;
        callMethod(klass, "calculateRecoursiveOutput", argTypes, term3140, args);
    }

};


