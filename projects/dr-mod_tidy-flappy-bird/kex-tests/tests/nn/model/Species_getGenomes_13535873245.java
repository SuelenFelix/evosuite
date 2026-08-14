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

public class Species_getGenomes_13535873245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4931;

    public Species_getGenomes_13535873245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4934 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4935 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4935, term4935.getClass(), "nodes", null);
        setField(term4935, term4935.getClass(), "connections", null);
        setField(term4935, term4935.getClass(), "nodeInnovator", null);
        setField(term4935, term4935.getClass(), "connectionInnovator", null);
        setField(term4935, term4935.getClass(), "random", null);
        setField(term4934, term4934.getClass(), "genome", term4935);
        setDoubleField(term4934, term4934.getClass(), "fitness", 0.3389647053819348);
        Object term4937 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4938 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4938, term4938.getClass(), "nodes", null);
        setField(term4938, term4938.getClass(), "connections", null);
        setField(term4938, term4938.getClass(), "nodeInnovator", null);
        setField(term4938, term4938.getClass(), "connectionInnovator", null);
        setField(term4938, term4938.getClass(), "random", null);
        setField(term4937, term4937.getClass(), "genome", term4938);
        setDoubleField(term4937, term4937.getClass(), "fitness", 0.14703921400520792);
        Object term4940 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4941 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4941, term4941.getClass(), "nodes", null);
        setField(term4941, term4941.getClass(), "connections", null);
        setField(term4941, term4941.getClass(), "nodeInnovator", null);
        setField(term4941, term4941.getClass(), "connectionInnovator", null);
        setField(term4941, term4941.getClass(), "random", null);
        setField(term4940, term4940.getClass(), "genome", term4941);
        setDoubleField(term4940, term4940.getClass(), "fitness", 0.5569644096083258);
        Object term4943 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4944 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4944, term4944.getClass(), "nodes", null);
        setField(term4944, term4944.getClass(), "connections", null);
        setField(term4944, term4944.getClass(), "nodeInnovator", null);
        setField(term4944, term4944.getClass(), "connectionInnovator", null);
        setField(term4944, term4944.getClass(), "random", null);
        setField(term4943, term4943.getClass(), "genome", term4944);
        setDoubleField(term4943, term4943.getClass(), "fitness", 0.38299462989514377);
        Object term4946 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4947 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4947, term4947.getClass(), "nodes", null);
        setField(term4947, term4947.getClass(), "connections", null);
        setField(term4947, term4947.getClass(), "nodeInnovator", null);
        setField(term4947, term4947.getClass(), "connectionInnovator", null);
        setField(term4947, term4947.getClass(), "random", null);
        setField(term4946, term4946.getClass(), "genome", term4947);
        setDoubleField(term4946, term4946.getClass(), "fitness", 0.019174439062670467);
        ArrayList term4932 = new ArrayList();
        ((ArrayList) term4932).add(term4934);
        ((ArrayList) term4932).add(term4937);
        ((ArrayList) term4932).add(term4940);
        ((ArrayList) term4932).add(term4943);
        ((ArrayList) term4932).add(term4946);
        ArrayList term4953 = new ArrayList();
        ((ArrayList) term4953).add((Object)null);
        ((ArrayList) term4953).add((Object)null);
        ((ArrayList) term4953).add((Object)null);
        ((ArrayList) term4953).add((Object)null);
        ArrayList term4957 = new ArrayList();
        ((ArrayList) term4957).add((Object)null);
        ((ArrayList) term4957).add((Object)null);
        ((ArrayList) term4957).add((Object)null);
        ((ArrayList) term4957).add((Object)null);
        ((ArrayList) term4957).add((Object)null);
        term4931 = newInstance(Class.forName("nn.model.Species"));
        Object term4951 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4952 = newInstance(Class.forName("nn.model.Genome"));
        Object term4961 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term4963 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term4965 = newInstance(Class.forName("java.util.Random"));
        Object term4966 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term4931, term4931.getClass(), "genomes", term4932);
        setField(term4952, term4952.getClass(), "nodes", term4953);
        setField(term4952, term4952.getClass(), "connections", term4957);
        setIntField(term4961, term4961.getClass(), "counter", 100);
        setField(term4952, term4952.getClass(), "nodeInnovator", term4961);
        setIntField(term4963, term4963.getClass(), "counter", 100);
        setField(term4952, term4952.getClass(), "connectionInnovator", term4963);
        setLongField(term4966, term4966.getClass(), "value", 110392425791592L);
        setField(term4965, term4965.getClass(), "seed", term4966);
        setDoubleField(term4965, term4965.getClass(), "nextNextGaussian", 0.17827385312846922);
        setBooleanField(term4965, term4965.getClass(), "haveNextNextGaussian", false);
        setField(term4952, term4952.getClass(), "random", term4965);
        setField(term4951, term4951.getClass(), "genome", term4952);
        setDoubleField(term4951, term4951.getClass(), "fitness", 0.5284679973716927);
        setField(term4931, term4931.getClass(), "bestGenome", term4951);
        setIntField(term4931, term4931.getClass(), "staleness", -407582855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Species");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenomes", argTypes, term4931, args);
    }

};


