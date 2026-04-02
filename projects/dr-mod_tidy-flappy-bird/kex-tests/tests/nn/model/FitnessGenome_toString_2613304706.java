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
import java.lang.Object;
import java.util.ArrayList;

public class FitnessGenome_toString_2613304706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10942;

    public FitnessGenome_toString_2613304706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10946 = newInstance(Class.forName("nn.model.Node"));
        setField(term10946, term10946.getClass(), "type", null);
        setIntField(term10946, term10946.getClass(), "innovation", 1428598210);
        setField(term10946, term10946.getClass(), "connections", null);
        setDoubleField(term10946, term10946.getClass(), "bias", 0.24376380251538943);
        Object term10949 = newInstance(Class.forName("nn.model.Node"));
        setField(term10949, term10949.getClass(), "type", null);
        setIntField(term10949, term10949.getClass(), "innovation", 0);
        setField(term10949, term10949.getClass(), "connections", null);
        setDoubleField(term10949, term10949.getClass(), "bias", 0.0);
        ArrayList term10944 = new ArrayList();
        ((ArrayList) term10944).add(term10946);
        ((ArrayList) term10944).add(term10949);
        Object term10956 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10956, term10956.getClass(), "in", null);
        setField(term10956, term10956.getClass(), "out", null);
        setFloatField(term10956, term10956.getClass(), "weight", 0.31691194F);
        setBooleanField(term10956, term10956.getClass(), "expressed", false);
        setIntField(term10956, term10956.getClass(), "innovation", 1238707613);
        Object term10960 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10960, term10960.getClass(), "in", null);
        setField(term10960, term10960.getClass(), "out", null);
        setFloatField(term10960, term10960.getClass(), "weight", 0.917166F);
        setBooleanField(term10960, term10960.getClass(), "expressed", true);
        setIntField(term10960, term10960.getClass(), "innovation", -1546528470);
        ArrayList term10954 = new ArrayList();
        ((ArrayList) term10954).add(term10956);
        ((ArrayList) term10954).add(term10960);
        term10942 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10943 = newInstance(Class.forName("nn.model.Genome"));
        Object term10966 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10968 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10970 = newInstance(Class.forName("java.util.Random"));
        Object term10971 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10943, term10943.getClass(), "nodes", term10944);
        setField(term10943, term10943.getClass(), "connections", term10954);
        setIntField(term10966, term10966.getClass(), "counter", 100);
        setField(term10943, term10943.getClass(), "nodeInnovator", term10966);
        setIntField(term10968, term10968.getClass(), "counter", 100);
        setField(term10943, term10943.getClass(), "connectionInnovator", term10968);
        setLongField(term10971, term10971.getClass(), "value", 6056631881210L);
        setField(term10970, term10970.getClass(), "seed", term10971);
        setDoubleField(term10970, term10970.getClass(), "nextNextGaussian", 0.1960225801238138);
        setBooleanField(term10970, term10970.getClass(), "haveNextNextGaussian", true);
        setField(term10943, term10943.getClass(), "random", term10970);
        setField(term10942, term10942.getClass(), "genome", term10943);
        setDoubleField(term10942, term10942.getClass(), "fitness", 0.5148137742678777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10942, args);
    }

};


