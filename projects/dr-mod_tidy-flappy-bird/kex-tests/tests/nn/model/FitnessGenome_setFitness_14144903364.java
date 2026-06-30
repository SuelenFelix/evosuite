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
     Object term10864;
     Object term10908;

    public FitnessGenome_setFitness_14144903364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10868 = newInstance(Class.forName("nn.model.Node"));
        setField(term10868, term10868.getClass(), "type", null);
        setIntField(term10868, term10868.getClass(), "innovation", -2062724184);
        setField(term10868, term10868.getClass(), "connections", null);
        setDoubleField(term10868, term10868.getClass(), "bias", 0.9636047288221744);
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
        Object term10877 = newInstance(Class.forName("nn.model.Node"));
        setField(term10877, term10877.getClass(), "type", null);
        setIntField(term10877, term10877.getClass(), "innovation", 0);
        setField(term10877, term10877.getClass(), "connections", null);
        setDoubleField(term10877, term10877.getClass(), "bias", 0.0);
        ArrayList term10866 = new ArrayList();
        ((ArrayList) term10866).add(term10868);
        ((ArrayList) term10866).add(term10871);
        ((ArrayList) term10866).add(term10874);
        ((ArrayList) term10866).add(term10877);
        Object term10884 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10884, term10884.getClass(), "in", term10874);
        setField(term10884, term10884.getClass(), "out", term10874);
        setFloatField(term10884, term10884.getClass(), "weight", 0.48370367F);
        setBooleanField(term10884, term10884.getClass(), "expressed", false);
        setIntField(term10884, term10884.getClass(), "innovation", -1547322575);
        Object term10888 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10888, term10888.getClass(), "in", term10871);
        setField(term10888, term10888.getClass(), "out", null);
        setFloatField(term10888, term10888.getClass(), "weight", 0.7823827F);
        setBooleanField(term10888, term10888.getClass(), "expressed", true);
        setIntField(term10888, term10888.getClass(), "innovation", -1466822773);
        Object term10892 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10892, term10892.getClass(), "in", null);
        setField(term10892, term10892.getClass(), "out", term10874);
        setFloatField(term10892, term10892.getClass(), "weight", 0.38002086F);
        setBooleanField(term10892, term10892.getClass(), "expressed", true);
        setIntField(term10892, term10892.getClass(), "innovation", -230022261);
        ArrayList term10882 = new ArrayList();
        ((ArrayList) term10882).add(term10884);
        ((ArrayList) term10882).add(term10888);
        ((ArrayList) term10882).add(term10892);
        ((ArrayList) term10882).add(term10892);
        term10864 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10865 = newInstance(Class.forName("nn.model.Genome"));
        Object term10898 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10900 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10902 = newInstance(Class.forName("java.util.Random"));
        Object term10903 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10865, term10865.getClass(), "nodes", term10866);
        setField(term10865, term10865.getClass(), "connections", term10882);
        setIntField(term10898, term10898.getClass(), "counter", 100);
        setField(term10865, term10865.getClass(), "nodeInnovator", term10898);
        setIntField(term10900, term10900.getClass(), "counter", 100);
        setField(term10865, term10865.getClass(), "connectionInnovator", term10900);
        setLongField(term10903, term10903.getClass(), "value", 78358945277084L);
        setField(term10902, term10902.getClass(), "seed", term10903);
        setDoubleField(term10902, term10902.getClass(), "nextNextGaussian", 0.9812989520568652);
        setBooleanField(term10902, term10902.getClass(), "haveNextNextGaussian", false);
        setField(term10865, term10865.getClass(), "random", term10902);
        setField(term10864, term10864.getClass(), "genome", term10865);
        setDoubleField(term10864, term10864.getClass(), "fitness", 0.5260401729085636);
        term10908 = new Double(0.1966416537238288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term10908;
        callMethod(klass, "setFitness", argTypes, term10864, args);
    }

};


