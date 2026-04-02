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

public class Genome_toggleConnectionMutation_65668201429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10305;

    public Genome_toggleConnectionMutation_65668201429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10305 = newInstance(Class.forName("nn.model.Genome"));
        setField(term10305, term10305.getClass(), "nodes", null);
        setField(term10305, term10305.getClass(), "connections", null);
        setField(term10305, term10305.getClass(), "nodeInnovator", null);
        setField(term10305, term10305.getClass(), "connectionInnovator", null);
        setField(term10305, term10305.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toggleConnectionMutation", argTypes, term10305, args);
    }

};


