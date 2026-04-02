package nn.actions;

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
import static nn.actions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Mating_addNodesAndConnections_722192358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2644;

    public Mating_addNodesAndConnections_722192358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2644 = newInstance(Class.forName("nn.actions.Mating"));
        setField(term2644, term2644.getClass(), "random", null);
        setField(term2644, term2644.getClass(), "nodeInnovator", null);
        setField(term2644, term2644.getClass(), "connectionInnovator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.Mating");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("nn.model.Genome");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("nn.model.Connection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "addNodesAndConnections", argTypes, term2644, args);
    }

};


