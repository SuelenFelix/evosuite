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

public class Genome_makeNodeMutation_67847104330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10321;

    public Genome_makeNodeMutation_67847104330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10321 = newInstance(Class.forName("nn.model.Genome"));
        setField(term10321, term10321.getClass(), "nodes", null);
        setField(term10321, term10321.getClass(), "connections", null);
        setField(term10321, term10321.getClass(), "nodeInnovator", null);
        setField(term10321, term10321.getClass(), "connectionInnovator", null);
        setField(term10321, term10321.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makeNodeMutation", argTypes, term10321, args);
    }

};


