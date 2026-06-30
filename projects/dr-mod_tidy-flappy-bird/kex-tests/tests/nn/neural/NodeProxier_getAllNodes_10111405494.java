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
import java.util.HashMap;

public class NodeProxier_getAllNodes_10111405494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420;

    public NodeProxier_getAllNodes_10111405494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term421 = new HashMap();
        term420 = newInstance(Class.forName("nn.neural.NodeProxier"));
        setField(term420, term420.getClass(), "matchNodes", term421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.NodeProxier");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllNodes", argTypes, term420, args);
    }

};


