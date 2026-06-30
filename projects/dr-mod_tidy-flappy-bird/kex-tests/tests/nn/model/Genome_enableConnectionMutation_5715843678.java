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
import java.util.ArrayList;
import java.lang.Object;

public class Genome_enableConnectionMutation_5715843678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9205;

    public Genome_enableConnectionMutation_5715843678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9206 = new ArrayList();
        ArrayList term9210 = new ArrayList();
        term9205 = newInstance(Class.forName("nn.model.Genome"));
        Object term9214 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term9216 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term9218 = newInstance(Class.forName("java.util.Random"));
        Object term9219 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term9205, term9205.getClass(), "nodes", term9206);
        setField(term9205, term9205.getClass(), "connections", term9210);
        setIntField(term9214, term9214.getClass(), "counter", 100);
        setField(term9205, term9205.getClass(), "nodeInnovator", term9214);
        setIntField(term9216, term9216.getClass(), "counter", 100);
        setField(term9205, term9205.getClass(), "connectionInnovator", term9216);
        setLongField(term9219, term9219.getClass(), "value", 264675712553478L);
        setField(term9218, term9218.getClass(), "seed", term9219);
        setDoubleField(term9218, term9218.getClass(), "nextNextGaussian", 0.2849157687292415);
        setBooleanField(term9218, term9218.getClass(), "haveNextNextGaussian", true);
        setField(term9205, term9205.getClass(), "random", term9218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "enableConnectionMutation", argTypes, term9205, args);
    }

};


