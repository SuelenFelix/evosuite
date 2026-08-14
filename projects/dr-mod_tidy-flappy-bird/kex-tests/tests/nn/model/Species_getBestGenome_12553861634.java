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

public class Species_getBestGenome_12553861634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4878;

    public Species_getBestGenome_12553861634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4881 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4882 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4882, term4882.getClass(), "nodes", null);
        setField(term4882, term4882.getClass(), "connections", null);
        setField(term4882, term4882.getClass(), "nodeInnovator", null);
        setField(term4882, term4882.getClass(), "connectionInnovator", null);
        setField(term4882, term4882.getClass(), "random", null);
        setField(term4881, term4881.getClass(), "genome", term4882);
        setDoubleField(term4881, term4881.getClass(), "fitness", 0.4478633017907302);
        Object term4884 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4885 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4885, term4885.getClass(), "nodes", null);
        setField(term4885, term4885.getClass(), "connections", null);
        setField(term4885, term4885.getClass(), "nodeInnovator", null);
        setField(term4885, term4885.getClass(), "connectionInnovator", null);
        setField(term4885, term4885.getClass(), "random", null);
        setField(term4884, term4884.getClass(), "genome", term4885);
        setDoubleField(term4884, term4884.getClass(), "fitness", 0.2682123119817419);
        Object term4887 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4888 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4888, term4888.getClass(), "nodes", null);
        setField(term4888, term4888.getClass(), "connections", null);
        setField(term4888, term4888.getClass(), "nodeInnovator", null);
        setField(term4888, term4888.getClass(), "connectionInnovator", null);
        setField(term4888, term4888.getClass(), "random", null);
        setField(term4887, term4887.getClass(), "genome", term4888);
        setDoubleField(term4887, term4887.getClass(), "fitness", 0.9194156323780788);
        Object term4890 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4891 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4891, term4891.getClass(), "nodes", null);
        setField(term4891, term4891.getClass(), "connections", null);
        setField(term4891, term4891.getClass(), "nodeInnovator", null);
        setField(term4891, term4891.getClass(), "connectionInnovator", null);
        setField(term4891, term4891.getClass(), "random", null);
        setField(term4890, term4890.getClass(), "genome", term4891);
        setDoubleField(term4890, term4890.getClass(), "fitness", 0.3503400017331547);
        Object term4893 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4894 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4894, term4894.getClass(), "nodes", null);
        setField(term4894, term4894.getClass(), "connections", null);
        setField(term4894, term4894.getClass(), "nodeInnovator", null);
        setField(term4894, term4894.getClass(), "connectionInnovator", null);
        setField(term4894, term4894.getClass(), "random", null);
        setField(term4893, term4893.getClass(), "genome", term4894);
        setDoubleField(term4893, term4893.getClass(), "fitness", 0.6335804422604819);
        Object term4896 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4897 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4897, term4897.getClass(), "nodes", null);
        setField(term4897, term4897.getClass(), "connections", null);
        setField(term4897, term4897.getClass(), "nodeInnovator", null);
        setField(term4897, term4897.getClass(), "connectionInnovator", null);
        setField(term4897, term4897.getClass(), "random", null);
        setField(term4896, term4896.getClass(), "genome", term4897);
        setDoubleField(term4896, term4896.getClass(), "fitness", 0.4279162427372558);
        Object term4899 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4900 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4900, term4900.getClass(), "nodes", null);
        setField(term4900, term4900.getClass(), "connections", null);
        setField(term4900, term4900.getClass(), "nodeInnovator", null);
        setField(term4900, term4900.getClass(), "connectionInnovator", null);
        setField(term4900, term4900.getClass(), "random", null);
        setField(term4899, term4899.getClass(), "genome", term4900);
        setDoubleField(term4899, term4899.getClass(), "fitness", 0.42544116787510533);
        Object term4902 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4903 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4903, term4903.getClass(), "nodes", null);
        setField(term4903, term4903.getClass(), "connections", null);
        setField(term4903, term4903.getClass(), "nodeInnovator", null);
        setField(term4903, term4903.getClass(), "connectionInnovator", null);
        setField(term4903, term4903.getClass(), "random", null);
        setField(term4902, term4902.getClass(), "genome", term4903);
        setDoubleField(term4902, term4902.getClass(), "fitness", 0.7630673805338225);
        Object term4905 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4906 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4906, term4906.getClass(), "nodes", null);
        setField(term4906, term4906.getClass(), "connections", null);
        setField(term4906, term4906.getClass(), "nodeInnovator", null);
        setField(term4906, term4906.getClass(), "connectionInnovator", null);
        setField(term4906, term4906.getClass(), "random", null);
        setField(term4905, term4905.getClass(), "genome", term4906);
        setDoubleField(term4905, term4905.getClass(), "fitness", 0.6107111302126562);
        ArrayList term4879 = new ArrayList();
        ((ArrayList) term4879).add(term4881);
        ((ArrayList) term4879).add(term4884);
        ((ArrayList) term4879).add(term4887);
        ((ArrayList) term4879).add(term4890);
        ((ArrayList) term4879).add(term4893);
        ((ArrayList) term4879).add(term4896);
        ((ArrayList) term4879).add(term4899);
        ((ArrayList) term4879).add(term4902);
        ((ArrayList) term4879).add(term4905);
        ArrayList term4912 = new ArrayList();
        ((ArrayList) term4912).add((Object)null);
        ((ArrayList) term4912).add((Object)null);
        ArrayList term4916 = new ArrayList();
        ((ArrayList) term4916).add((Object)null);
        ((ArrayList) term4916).add((Object)null);
        term4878 = newInstance(Class.forName("nn.model.Species"));
        Object term4910 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4911 = newInstance(Class.forName("nn.model.Genome"));
        Object term4920 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term4922 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term4924 = newInstance(Class.forName("java.util.Random"));
        Object term4925 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term4878, term4878.getClass(), "genomes", term4879);
        setField(term4911, term4911.getClass(), "nodes", term4912);
        setField(term4911, term4911.getClass(), "connections", term4916);
        setIntField(term4920, term4920.getClass(), "counter", 100);
        setField(term4911, term4911.getClass(), "nodeInnovator", term4920);
        setIntField(term4922, term4922.getClass(), "counter", 100);
        setField(term4911, term4911.getClass(), "connectionInnovator", term4922);
        setLongField(term4925, term4925.getClass(), "value", 100319011444790L);
        setField(term4924, term4924.getClass(), "seed", term4925);
        setDoubleField(term4924, term4924.getClass(), "nextNextGaussian", 0.682853703128826);
        setBooleanField(term4924, term4924.getClass(), "haveNextNextGaussian", true);
        setField(term4911, term4911.getClass(), "random", term4924);
        setField(term4910, term4910.getClass(), "genome", term4911);
        setDoubleField(term4910, term4910.getClass(), "fitness", 0.3175549148584229);
        setField(term4878, term4878.getClass(), "bestGenome", term4910);
        setIntField(term4878, term4878.getClass(), "staleness", 1474899591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Species");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestGenome", argTypes, term4878, args);
    }

};


