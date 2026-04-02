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
import java.lang.Float;

public class Genome_newConnection_117534145024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10298;
     Object term10299;

    public Genome_newConnection_117534145024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10298 = newInstance(Class.forName("nn.model.Genome"));
        setField(term10298, term10298.getClass(), "nodes", null);
        setField(term10298, term10298.getClass(), "connections", null);
        setField(term10298, term10298.getClass(), "nodeInnovator", null);
        setField(term10298, term10298.getClass(), "connectionInnovator", null);
        setField(term10298, term10298.getClass(), "random", null);
        term10299 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("nn.model.Node");
        argTypes[1] = Class.forName("nn.model.Node");
        argTypes[2] = float.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term10299;
        callMethod(klass, "newConnection", argTypes, term10298, args);
    }

};


