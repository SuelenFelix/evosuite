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

public class Genome_newConnection_19356271405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5908;

    public Genome_newConnection_19356271405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5908 = newInstance(Class.forName("nn.model.Genome"));
        setField(term5908, term5908.getClass(), "nodes", null);
        setField(term5908, term5908.getClass(), "connections", null);
        setField(term5908, term5908.getClass(), "nodeInnovator", null);
        setField(term5908, term5908.getClass(), "connectionInnovator", null);
        setField(term5908, term5908.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("nn.model.Node");
        argTypes[1] = Class.forName("nn.model.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "newConnection", argTypes, term5908, args);
    }

};


