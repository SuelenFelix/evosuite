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
     Object term10954;

    public FitnessGenome_toString_2613304706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10958 = newInstance(Class.forName("nn.model.Node"));
        setField(term10958, term10958.getClass(), "type", null);
        setIntField(term10958, term10958.getClass(), "innovation", 1428598210);
        setField(term10958, term10958.getClass(), "connections", null);
        setDoubleField(term10958, term10958.getClass(), "bias", 0.24376380251538943);
        Object term10961 = newInstance(Class.forName("nn.model.Node"));
        setField(term10961, term10961.getClass(), "type", null);
        setIntField(term10961, term10961.getClass(), "innovation", 0);
        setField(term10961, term10961.getClass(), "connections", null);
        setDoubleField(term10961, term10961.getClass(), "bias", 0.0);
        ArrayList term10956 = new ArrayList();
        ((ArrayList) term10956).add(term10958);
        ((ArrayList) term10956).add(term10961);
        Object term10968 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10968, term10968.getClass(), "in", null);
        setField(term10968, term10968.getClass(), "out", null);
        setFloatField(term10968, term10968.getClass(), "weight", 0.31691194F);
        setBooleanField(term10968, term10968.getClass(), "expressed", false);
        setIntField(term10968, term10968.getClass(), "innovation", 1238707613);
        Object term10972 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10972, term10972.getClass(), "in", null);
        setField(term10972, term10972.getClass(), "out", null);
        setFloatField(term10972, term10972.getClass(), "weight", 0.917166F);
        setBooleanField(term10972, term10972.getClass(), "expressed", true);
        setIntField(term10972, term10972.getClass(), "innovation", -1546528470);
        ArrayList term10966 = new ArrayList();
        ((ArrayList) term10966).add(term10968);
        ((ArrayList) term10966).add(term10972);
        term10954 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10955 = newInstance(Class.forName("nn.model.Genome"));
        Object term10978 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10980 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10982 = newInstance(Class.forName("java.util.Random"));
        Object term10983 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10955, term10955.getClass(), "nodes", term10956);
        setField(term10955, term10955.getClass(), "connections", term10966);
        setIntField(term10978, term10978.getClass(), "counter", 100);
        setField(term10955, term10955.getClass(), "nodeInnovator", term10978);
        setIntField(term10980, term10980.getClass(), "counter", 100);
        setField(term10955, term10955.getClass(), "connectionInnovator", term10980);
        setLongField(term10983, term10983.getClass(), "value", 612500773694L);
        setField(term10982, term10982.getClass(), "seed", term10983);
        setDoubleField(term10982, term10982.getClass(), "nextNextGaussian", 0.1960225801238138);
        setBooleanField(term10982, term10982.getClass(), "haveNextNextGaussian", true);
        setField(term10955, term10955.getClass(), "random", term10982);
        setField(term10954, term10954.getClass(), "genome", term10955);
        setDoubleField(term10954, term10954.getClass(), "fitness", 0.5148137742678777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10954, args);
    }

};


