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
import java.lang.Double;

public class FitnessGenome_setFitness_14144903364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10861;
     Object term10905;

    public FitnessGenome_setFitness_14144903364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10865 = newInstance(Class.forName("nn.model.Node"));
        setField(term10865, term10865.getClass(), "type", null);
        setIntField(term10865, term10865.getClass(), "innovation", -2062724184);
        setField(term10865, term10865.getClass(), "connections", null);
        setDoubleField(term10865, term10865.getClass(), "bias", 0.9636047288221744);
        Object term10868 = newInstance(Class.forName("nn.model.Node"));
        setField(term10868, term10868.getClass(), "type", null);
        setIntField(term10868, term10868.getClass(), "innovation", 0);
        setField(term10868, term10868.getClass(), "connections", null);
        setDoubleField(term10868, term10868.getClass(), "bias", 0.0);
        Object term10871 = newInstance(Class.forName("nn.model.Node"));
        setField(term10871, term10871.getClass(), "type", null);
        setIntField(term10871, term10871.getClass(), "innovation", 0);
        setField(term10871, term10871.getClass(), "connections", null);
        setDoubleField(term10871, term10871.getClass(), "bias", 0.0);
        Object term10874 = newInstance(Class.forName("nn.model.Node"));
        setField(term10874, term10874.getClass(), "type", null);
        setIntField(term10874, term10874.getClass(), "innovation", 0);
        setField(term10874, term10874.getClass(), "connections", null);
        setDoubleField(term10874, term10874.getClass(), "bias", 0.0);
        ArrayList term10863 = new ArrayList();
        ((ArrayList) term10863).add(term10865);
        ((ArrayList) term10863).add(term10868);
        ((ArrayList) term10863).add(term10871);
        ((ArrayList) term10863).add(term10874);
        Object term10881 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10881, term10881.getClass(), "in", term10871);
        setField(term10881, term10881.getClass(), "out", term10871);
        setFloatField(term10881, term10881.getClass(), "weight", 0.48370367F);
        setBooleanField(term10881, term10881.getClass(), "expressed", false);
        setIntField(term10881, term10881.getClass(), "innovation", -1547322575);
        Object term10885 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10885, term10885.getClass(), "in", term10868);
        setField(term10885, term10885.getClass(), "out", null);
        setFloatField(term10885, term10885.getClass(), "weight", 0.7823827F);
        setBooleanField(term10885, term10885.getClass(), "expressed", true);
        setIntField(term10885, term10885.getClass(), "innovation", -1466822773);
        Object term10889 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10889, term10889.getClass(), "in", null);
        setField(term10889, term10889.getClass(), "out", term10871);
        setFloatField(term10889, term10889.getClass(), "weight", 0.38002086F);
        setBooleanField(term10889, term10889.getClass(), "expressed", true);
        setIntField(term10889, term10889.getClass(), "innovation", -230022261);
        ArrayList term10879 = new ArrayList();
        ((ArrayList) term10879).add(term10881);
        ((ArrayList) term10879).add(term10885);
        ((ArrayList) term10879).add(term10889);
        ((ArrayList) term10879).add(term10889);
        term10861 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10862 = newInstance(Class.forName("nn.model.Genome"));
        Object term10895 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10897 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10899 = newInstance(Class.forName("java.util.Random"));
        Object term10900 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10862, term10862.getClass(), "nodes", term10863);
        setField(term10862, term10862.getClass(), "connections", term10879);
        setIntField(term10895, term10895.getClass(), "counter", 100);
        setField(term10862, term10862.getClass(), "nodeInnovator", term10895);
        setIntField(term10897, term10897.getClass(), "counter", 100);
        setField(term10862, term10862.getClass(), "connectionInnovator", term10897);
        setLongField(term10900, term10900.getClass(), "value", 160468406989403L);
        setField(term10899, term10899.getClass(), "seed", term10900);
        setDoubleField(term10899, term10899.getClass(), "nextNextGaussian", 0.9812989520568652);
        setBooleanField(term10899, term10899.getClass(), "haveNextNextGaussian", false);
        setField(term10862, term10862.getClass(), "random", term10899);
        setField(term10861, term10861.getClass(), "genome", term10862);
        setDoubleField(term10861, term10861.getClass(), "fitness", 0.5260401729085636);
        term10905 = new Double(0.1966416537238288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term10905;
        callMethod(klass, "setFitness", argTypes, term10861, args);
    }

};


