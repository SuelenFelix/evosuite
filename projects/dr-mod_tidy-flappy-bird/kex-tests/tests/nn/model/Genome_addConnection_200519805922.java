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

public class Genome_addConnection_200519805922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11673;

    public Genome_addConnection_200519805922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11673 = newInstance(Class.forName("nn.model.Genome"));
        setField(term11673, term11673.getClass(), "nodes", null);
        setField(term11673, term11673.getClass(), "connections", null);
        setField(term11673, term11673.getClass(), "nodeInnovator", null);
        setField(term11673, term11673.getClass(), "connectionInnovator", null);
        setField(term11673, term11673.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Connection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addConnection", argTypes, term11673, args);
    }

};


