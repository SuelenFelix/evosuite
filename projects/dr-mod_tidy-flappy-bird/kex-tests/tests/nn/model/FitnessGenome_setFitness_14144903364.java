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
     Object term10849;
     Object term10893;

    public FitnessGenome_setFitness_14144903364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10853 = newInstance(Class.forName("nn.model.Node"));
        setField(term10853, term10853.getClass(), "type", null);
        setIntField(term10853, term10853.getClass(), "innovation", -2062724184);
        setField(term10853, term10853.getClass(), "connections", null);
        setDoubleField(term10853, term10853.getClass(), "bias", 0.9636047288221744);
        Object term10856 = newInstance(Class.forName("nn.model.Node"));
        setField(term10856, term10856.getClass(), "type", null);
        setIntField(term10856, term10856.getClass(), "innovation", 0);
        setField(term10856, term10856.getClass(), "connections", null);
        setDoubleField(term10856, term10856.getClass(), "bias", 0.0);
        Object term10859 = newInstance(Class.forName("nn.model.Node"));
        setField(term10859, term10859.getClass(), "type", null);
        setIntField(term10859, term10859.getClass(), "innovation", 0);
        setField(term10859, term10859.getClass(), "connections", null);
        setDoubleField(term10859, term10859.getClass(), "bias", 0.0);
        Object term10862 = newInstance(Class.forName("nn.model.Node"));
        setField(term10862, term10862.getClass(), "type", null);
        setIntField(term10862, term10862.getClass(), "innovation", 0);
        setField(term10862, term10862.getClass(), "connections", null);
        setDoubleField(term10862, term10862.getClass(), "bias", 0.0);
        ArrayList term10851 = new ArrayList();
        ((ArrayList) term10851).add(term10853);
        ((ArrayList) term10851).add(term10856);
        ((ArrayList) term10851).add(term10859);
        ((ArrayList) term10851).add(term10862);
        Object term10869 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10869, term10869.getClass(), "in", term10859);
        setField(term10869, term10869.getClass(), "out", term10859);
        setFloatField(term10869, term10869.getClass(), "weight", 0.48370367F);
        setBooleanField(term10869, term10869.getClass(), "expressed", false);
        setIntField(term10869, term10869.getClass(), "innovation", -1547322575);
        Object term10873 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10873, term10873.getClass(), "in", term10856);
        setField(term10873, term10873.getClass(), "out", null);
        setFloatField(term10873, term10873.getClass(), "weight", 0.7823827F);
        setBooleanField(term10873, term10873.getClass(), "expressed", true);
        setIntField(term10873, term10873.getClass(), "innovation", -1466822773);
        Object term10877 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10877, term10877.getClass(), "in", null);
        setField(term10877, term10877.getClass(), "out", term10859);
        setFloatField(term10877, term10877.getClass(), "weight", 0.38002086F);
        setBooleanField(term10877, term10877.getClass(), "expressed", true);
        setIntField(term10877, term10877.getClass(), "innovation", -230022261);
        ArrayList term10867 = new ArrayList();
        ((ArrayList) term10867).add(term10869);
        ((ArrayList) term10867).add(term10873);
        ((ArrayList) term10867).add(term10877);
        ((ArrayList) term10867).add(term10877);
        term10849 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10850 = newInstance(Class.forName("nn.model.Genome"));
        Object term10883 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10885 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10887 = newInstance(Class.forName("java.util.Random"));
        Object term10888 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10850, term10850.getClass(), "nodes", term10851);
        setField(term10850, term10850.getClass(), "connections", term10867);
        setIntField(term10883, term10883.getClass(), "counter", 100);
        setField(term10850, term10850.getClass(), "nodeInnovator", term10883);
        setIntField(term10885, term10885.getClass(), "counter", 100);
        setField(term10850, term10850.getClass(), "connectionInnovator", term10885);
        setLongField(term10888, term10888.getClass(), "value", 163817061136647L);
        setField(term10887, term10887.getClass(), "seed", term10888);
        setDoubleField(term10887, term10887.getClass(), "nextNextGaussian", 0.9812989520568652);
        setBooleanField(term10887, term10887.getClass(), "haveNextNextGaussian", false);
        setField(term10850, term10850.getClass(), "random", term10887);
        setField(term10849, term10849.getClass(), "genome", term10850);
        setDoubleField(term10849, term10849.getClass(), "fitness", 0.5260401729085636);
        term10893 = new Double(0.1966416537238288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term10893;
        callMethod(klass, "setFitness", argTypes, term10849, args);
    }

};


