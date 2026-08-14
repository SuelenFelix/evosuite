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

public class FitnessGenome_getFitness_9859114803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10814;

    public FitnessGenome_getFitness_9859114803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10818 = newInstance(Class.forName("nn.model.Node"));
        setField(term10818, term10818.getClass(), "type", null);
        setIntField(term10818, term10818.getClass(), "innovation", 1122535239);
        setField(term10818, term10818.getClass(), "connections", null);
        setDoubleField(term10818, term10818.getClass(), "bias", 0.5935456780207055);
        Object term10821 = newInstance(Class.forName("nn.model.Node"));
        setField(term10821, term10821.getClass(), "type", null);
        setIntField(term10821, term10821.getClass(), "innovation", 1158923260);
        setField(term10821, term10821.getClass(), "connections", null);
        setDoubleField(term10821, term10821.getClass(), "bias", 0.027331340622965494);
        Object term10824 = newInstance(Class.forName("nn.model.Node"));
        setField(term10824, term10824.getClass(), "type", null);
        setIntField(term10824, term10824.getClass(), "innovation", 1633508772);
        setField(term10824, term10824.getClass(), "connections", null);
        setDoubleField(term10824, term10824.getClass(), "bias", 0.05455375073513069);
        Object term10827 = newInstance(Class.forName("nn.model.Node"));
        setField(term10827, term10827.getClass(), "type", null);
        setIntField(term10827, term10827.getClass(), "innovation", 1355471365);
        setField(term10827, term10827.getClass(), "connections", null);
        setDoubleField(term10827, term10827.getClass(), "bias", 0.060834383944714965);
        Object term10830 = newInstance(Class.forName("nn.model.Node"));
        setField(term10830, term10830.getClass(), "type", null);
        setIntField(term10830, term10830.getClass(), "innovation", -575810668);
        setField(term10830, term10830.getClass(), "connections", null);
        setDoubleField(term10830, term10830.getClass(), "bias", 0.032930209231383456);
        ArrayList term10816 = new ArrayList();
        ((ArrayList) term10816).add(term10818);
        ((ArrayList) term10816).add(term10821);
        ((ArrayList) term10816).add(term10824);
        ((ArrayList) term10816).add(term10827);
        ((ArrayList) term10816).add(term10827);
        ((ArrayList) term10816).add(term10821);
        ((ArrayList) term10816).add(term10830);
        Object term10837 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10837, term10837.getClass(), "in", null);
        setField(term10837, term10837.getClass(), "out", term10821);
        setFloatField(term10837, term10837.getClass(), "weight", 0.86633056F);
        setBooleanField(term10837, term10837.getClass(), "expressed", false);
        setIntField(term10837, term10837.getClass(), "innovation", 1703103733);
        Object term10841 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10841, term10841.getClass(), "in", null);
        setField(term10841, term10841.getClass(), "out", term10827);
        setFloatField(term10841, term10841.getClass(), "weight", 0.5548342F);
        setBooleanField(term10841, term10841.getClass(), "expressed", false);
        setIntField(term10841, term10841.getClass(), "innovation", 2003399396);
        Object term10845 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10845, term10845.getClass(), "in", null);
        setField(term10845, term10845.getClass(), "out", null);
        setFloatField(term10845, term10845.getClass(), "weight", 0.8503558F);
        setBooleanField(term10845, term10845.getClass(), "expressed", false);
        setIntField(term10845, term10845.getClass(), "innovation", 1223703911);
        ArrayList term10835 = new ArrayList();
        ((ArrayList) term10835).add(term10837);
        ((ArrayList) term10835).add(term10841);
        ((ArrayList) term10835).add(term10845);
        term10814 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10815 = newInstance(Class.forName("nn.model.Genome"));
        Object term10851 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10853 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10855 = newInstance(Class.forName("java.util.Random"));
        Object term10856 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10815, term10815.getClass(), "nodes", term10816);
        setField(term10815, term10815.getClass(), "connections", term10835);
        setIntField(term10851, term10851.getClass(), "counter", 100);
        setField(term10815, term10815.getClass(), "nodeInnovator", term10851);
        setIntField(term10853, term10853.getClass(), "counter", 100);
        setField(term10815, term10815.getClass(), "connectionInnovator", term10853);
        setLongField(term10856, term10856.getClass(), "value", 182884022521160L);
        setField(term10855, term10855.getClass(), "seed", term10856);
        setDoubleField(term10855, term10855.getClass(), "nextNextGaussian", 0.38868894902156725);
        setBooleanField(term10855, term10855.getClass(), "haveNextNextGaussian", true);
        setField(term10815, term10815.getClass(), "random", term10855);
        setField(term10814, term10814.getClass(), "genome", term10815);
        setDoubleField(term10814, term10814.getClass(), "fitness", 0.4689439946635412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFitness", argTypes, term10814, args);
    }

};


