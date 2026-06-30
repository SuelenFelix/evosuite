package nn.model;

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
import static nn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class Node_setBias_114929997616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13239;
     Object term13242;

    public Node_setBias_114929997616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13239 = newInstance(Class.forName("nn.model.Node"));
        setField(term13239, term13239.getClass(), "type", null);
        setIntField(term13239, term13239.getClass(), "innovation", 0);
        setField(term13239, term13239.getClass(), "connections", null);
        setDoubleField(term13239, term13239.getClass(), "bias", 0.0);
        term13242 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term13242;
        callMethod(klass, "setBias", argTypes, term13239, args);
    }

};


