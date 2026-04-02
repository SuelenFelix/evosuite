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
     Object term10802;

    public FitnessGenome_getFitness_9859114803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10806 = newInstance(Class.forName("nn.model.Node"));
        setField(term10806, term10806.getClass(), "type", null);
        setIntField(term10806, term10806.getClass(), "innovation", 1122535239);
        setField(term10806, term10806.getClass(), "connections", null);
        setDoubleField(term10806, term10806.getClass(), "bias", 0.5935456780207055);
        Object term10809 = newInstance(Class.forName("nn.model.Node"));
        setField(term10809, term10809.getClass(), "type", null);
        setIntField(term10809, term10809.getClass(), "innovation", 1158923260);
        setField(term10809, term10809.getClass(), "connections", null);
        setDoubleField(term10809, term10809.getClass(), "bias", 0.027331340622965494);
        Object term10812 = newInstance(Class.forName("nn.model.Node"));
        setField(term10812, term10812.getClass(), "type", null);
        setIntField(term10812, term10812.getClass(), "innovation", 1633508772);
        setField(term10812, term10812.getClass(), "connections", null);
        setDoubleField(term10812, term10812.getClass(), "bias", 0.05455375073513069);
        Object term10815 = newInstance(Class.forName("nn.model.Node"));
        setField(term10815, term10815.getClass(), "type", null);
        setIntField(term10815, term10815.getClass(), "innovation", 1355471365);
        setField(term10815, term10815.getClass(), "connections", null);
        setDoubleField(term10815, term10815.getClass(), "bias", 0.060834383944714965);
        Object term10818 = newInstance(Class.forName("nn.model.Node"));
        setField(term10818, term10818.getClass(), "type", null);
        setIntField(term10818, term10818.getClass(), "innovation", -575810668);
        setField(term10818, term10818.getClass(), "connections", null);
        setDoubleField(term10818, term10818.getClass(), "bias", 0.032930209231383456);
        ArrayList term10804 = new ArrayList();
        ((ArrayList) term10804).add(term10806);
        ((ArrayList) term10804).add(term10809);
        ((ArrayList) term10804).add(term10812);
        ((ArrayList) term10804).add(term10815);
        ((ArrayList) term10804).add(term10815);
        ((ArrayList) term10804).add(term10809);
        ((ArrayList) term10804).add(term10818);
        Object term10825 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10825, term10825.getClass(), "in", null);
        setField(term10825, term10825.getClass(), "out", term10809);
        setFloatField(term10825, term10825.getClass(), "weight", 0.86633056F);
        setBooleanField(term10825, term10825.getClass(), "expressed", false);
        setIntField(term10825, term10825.getClass(), "innovation", 1703103733);
        Object term10829 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10829, term10829.getClass(), "in", null);
        setField(term10829, term10829.getClass(), "out", term10815);
        setFloatField(term10829, term10829.getClass(), "weight", 0.5548342F);
        setBooleanField(term10829, term10829.getClass(), "expressed", false);
        setIntField(term10829, term10829.getClass(), "innovation", 2003399396);
        Object term10833 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10833, term10833.getClass(), "in", null);
        setField(term10833, term10833.getClass(), "out", null);
        setFloatField(term10833, term10833.getClass(), "weight", 0.8503558F);
        setBooleanField(term10833, term10833.getClass(), "expressed", false);
        setIntField(term10833, term10833.getClass(), "innovation", 1223703911);
        ArrayList term10823 = new ArrayList();
        ((ArrayList) term10823).add(term10825);
        ((ArrayList) term10823).add(term10829);
        ((ArrayList) term10823).add(term10833);
        term10802 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10803 = newInstance(Class.forName("nn.model.Genome"));
        Object term10839 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10841 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10843 = newInstance(Class.forName("java.util.Random"));
        Object term10844 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10803, term10803.getClass(), "nodes", term10804);
        setField(term10803, term10803.getClass(), "connections", term10823);
        setIntField(term10839, term10839.getClass(), "counter", 100);
        setField(term10803, term10803.getClass(), "nodeInnovator", term10839);
        setIntField(term10841, term10841.getClass(), "counter", 100);
        setField(term10803, term10803.getClass(), "connectionInnovator", term10841);
        setLongField(term10844, term10844.getClass(), "value", 179604011697697L);
        setField(term10843, term10843.getClass(), "seed", term10844);
        setDoubleField(term10843, term10843.getClass(), "nextNextGaussian", 0.38868894902156725);
        setBooleanField(term10843, term10843.getClass(), "haveNextNextGaussian", true);
        setField(term10803, term10803.getClass(), "random", term10843);
        setField(term10802, term10802.getClass(), "genome", term10803);
        setDoubleField(term10802, term10802.getClass(), "fitness", 0.4689439946635412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFitness", argTypes, term10802, args);
    }

};


