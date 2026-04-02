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

public class AnnConnection_setIn_2268921243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15990;

    public AnnConnection_setIn_2268921243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15990 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term15990, term15990.getClass(), "weight", 0.0);
        setField(term15990, term15990.getClass(), "in", null);
        setField(term15990, term15990.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.neural.AnnNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIn", argTypes, term15990, args);
    }

};


