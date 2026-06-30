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
     Object term10957;

    public FitnessGenome_toString_2613304706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10961 = newInstance(Class.forName("nn.model.Node"));
        setField(term10961, term10961.getClass(), "type", null);
        setIntField(term10961, term10961.getClass(), "innovation", 1428598210);
        setField(term10961, term10961.getClass(), "connections", null);
        setDoubleField(term10961, term10961.getClass(), "bias", 0.24376380251538943);
        Object term10964 = newInstance(Class.forName("nn.model.Node"));
        setField(term10964, term10964.getClass(), "type", null);
        setIntField(term10964, term10964.getClass(), "innovation", 0);
        setField(term10964, term10964.getClass(), "connections", null);
        setDoubleField(term10964, term10964.getClass(), "bias", 0.0);
        ArrayList term10959 = new ArrayList();
        ((ArrayList) term10959).add(term10961);
        ((ArrayList) term10959).add(term10964);
        Object term10971 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10971, term10971.getClass(), "in", null);
        setField(term10971, term10971.getClass(), "out", null);
        setFloatField(term10971, term10971.getClass(), "weight", 0.31691194F);
        setBooleanField(term10971, term10971.getClass(), "expressed", false);
        setIntField(term10971, term10971.getClass(), "innovation", 1238707613);
        Object term10975 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10975, term10975.getClass(), "in", null);
        setField(term10975, term10975.getClass(), "out", null);
        setFloatField(term10975, term10975.getClass(), "weight", 0.917166F);
        setBooleanField(term10975, term10975.getClass(), "expressed", true);
        setIntField(term10975, term10975.getClass(), "innovation", -1546528470);
        ArrayList term10969 = new ArrayList();
        ((ArrayList) term10969).add(term10971);
        ((ArrayList) term10969).add(term10975);
        term10957 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10958 = newInstance(Class.forName("nn.model.Genome"));
        Object term10981 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10983 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10985 = newInstance(Class.forName("java.util.Random"));
        Object term10986 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10958, term10958.getClass(), "nodes", term10959);
        setField(term10958, term10958.getClass(), "connections", term10969);
        setIntField(term10981, term10981.getClass(), "counter", 100);
        setField(term10958, term10958.getClass(), "nodeInnovator", term10981);
        setIntField(term10983, term10983.getClass(), "counter", 100);
        setField(term10958, term10958.getClass(), "connectionInnovator", term10983);
        setLongField(term10986, term10986.getClass(), "value", 224284609224746L);
        setField(term10985, term10985.getClass(), "seed", term10986);
        setDoubleField(term10985, term10985.getClass(), "nextNextGaussian", 0.1960225801238138);
        setBooleanField(term10985, term10985.getClass(), "haveNextNextGaussian", true);
        setField(term10958, term10958.getClass(), "random", term10985);
        setField(term10957, term10957.getClass(), "genome", term10958);
        setDoubleField(term10957, term10957.getClass(), "fitness", 0.5148137742678777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10957, args);
    }

};


