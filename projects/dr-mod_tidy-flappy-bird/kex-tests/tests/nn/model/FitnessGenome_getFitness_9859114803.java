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
     Object term10817;

    public FitnessGenome_getFitness_9859114803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10821 = newInstance(Class.forName("nn.model.Node"));
        setField(term10821, term10821.getClass(), "type", null);
        setIntField(term10821, term10821.getClass(), "innovation", 1122535239);
        setField(term10821, term10821.getClass(), "connections", null);
        setDoubleField(term10821, term10821.getClass(), "bias", 0.5935456780207055);
        Object term10824 = newInstance(Class.forName("nn.model.Node"));
        setField(term10824, term10824.getClass(), "type", null);
        setIntField(term10824, term10824.getClass(), "innovation", 1158923260);
        setField(term10824, term10824.getClass(), "connections", null);
        setDoubleField(term10824, term10824.getClass(), "bias", 0.027331340622965494);
        Object term10827 = newInstance(Class.forName("nn.model.Node"));
        setField(term10827, term10827.getClass(), "type", null);
        setIntField(term10827, term10827.getClass(), "innovation", 1633508772);
        setField(term10827, term10827.getClass(), "connections", null);
        setDoubleField(term10827, term10827.getClass(), "bias", 0.05455375073513069);
        Object term10830 = newInstance(Class.forName("nn.model.Node"));
        setField(term10830, term10830.getClass(), "type", null);
        setIntField(term10830, term10830.getClass(), "innovation", 1355471365);
        setField(term10830, term10830.getClass(), "connections", null);
        setDoubleField(term10830, term10830.getClass(), "bias", 0.060834383944714965);
        Object term10833 = newInstance(Class.forName("nn.model.Node"));
        setField(term10833, term10833.getClass(), "type", null);
        setIntField(term10833, term10833.getClass(), "innovation", -575810668);
        setField(term10833, term10833.getClass(), "connections", null);
        setDoubleField(term10833, term10833.getClass(), "bias", 0.032930209231383456);
        ArrayList term10819 = new ArrayList();
        ((ArrayList) term10819).add(term10821);
        ((ArrayList) term10819).add(term10824);
        ((ArrayList) term10819).add(term10827);
        ((ArrayList) term10819).add(term10830);
        ((ArrayList) term10819).add(term10830);
        ((ArrayList) term10819).add(term10824);
        ((ArrayList) term10819).add(term10833);
        Object term10840 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10840, term10840.getClass(), "in", null);
        setField(term10840, term10840.getClass(), "out", term10824);
        setFloatField(term10840, term10840.getClass(), "weight", 0.86633056F);
        setBooleanField(term10840, term10840.getClass(), "expressed", false);
        setIntField(term10840, term10840.getClass(), "innovation", 1703103733);
        Object term10844 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10844, term10844.getClass(), "in", null);
        setField(term10844, term10844.getClass(), "out", term10830);
        setFloatField(term10844, term10844.getClass(), "weight", 0.5548342F);
        setBooleanField(term10844, term10844.getClass(), "expressed", false);
        setIntField(term10844, term10844.getClass(), "innovation", 2003399396);
        Object term10848 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10848, term10848.getClass(), "in", null);
        setField(term10848, term10848.getClass(), "out", null);
        setFloatField(term10848, term10848.getClass(), "weight", 0.8503558F);
        setBooleanField(term10848, term10848.getClass(), "expressed", false);
        setIntField(term10848, term10848.getClass(), "innovation", 1223703911);
        ArrayList term10838 = new ArrayList();
        ((ArrayList) term10838).add(term10840);
        ((ArrayList) term10838).add(term10844);
        ((ArrayList) term10838).add(term10848);
        term10817 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10818 = newInstance(Class.forName("nn.model.Genome"));
        Object term10854 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10856 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10858 = newInstance(Class.forName("java.util.Random"));
        Object term10859 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10818, term10818.getClass(), "nodes", term10819);
        setField(term10818, term10818.getClass(), "connections", term10838);
        setIntField(term10854, term10854.getClass(), "counter", 100);
        setField(term10818, term10818.getClass(), "nodeInnovator", term10854);
        setIntField(term10856, term10856.getClass(), "counter", 100);
        setField(term10818, term10818.getClass(), "connectionInnovator", term10856);
        setLongField(term10859, term10859.getClass(), "value", 64614620644755L);
        setField(term10858, term10858.getClass(), "seed", term10859);
        setDoubleField(term10858, term10858.getClass(), "nextNextGaussian", 0.38868894902156725);
        setBooleanField(term10858, term10858.getClass(), "haveNextNextGaussian", true);
        setField(term10818, term10818.getClass(), "random", term10858);
        setField(term10817, term10817.getClass(), "genome", term10818);
        setDoubleField(term10817, term10817.getClass(), "fitness", 0.4689439946635412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFitness", argTypes, term10817, args);
    }

};


