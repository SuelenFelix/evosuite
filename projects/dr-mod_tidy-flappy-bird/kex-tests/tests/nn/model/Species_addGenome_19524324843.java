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

public class Species_addGenome_19524324843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4799;
     Object term4837;

    public Species_addGenome_19524324843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4802 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4803 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4803, term4803.getClass(), "nodes", null);
        setField(term4803, term4803.getClass(), "connections", null);
        setField(term4803, term4803.getClass(), "nodeInnovator", null);
        setField(term4803, term4803.getClass(), "connectionInnovator", null);
        setField(term4803, term4803.getClass(), "random", null);
        setField(term4802, term4802.getClass(), "genome", term4803);
        setDoubleField(term4802, term4802.getClass(), "fitness", 0.8524962128719791);
        Object term4805 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4806 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4806, term4806.getClass(), "nodes", null);
        setField(term4806, term4806.getClass(), "connections", null);
        setField(term4806, term4806.getClass(), "nodeInnovator", null);
        setField(term4806, term4806.getClass(), "connectionInnovator", null);
        setField(term4806, term4806.getClass(), "random", null);
        setField(term4805, term4805.getClass(), "genome", term4806);
        setDoubleField(term4805, term4805.getClass(), "fitness", 0.4269446855123301);
        Object term4808 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4809 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4809, term4809.getClass(), "nodes", null);
        setField(term4809, term4809.getClass(), "connections", null);
        setField(term4809, term4809.getClass(), "nodeInnovator", null);
        setField(term4809, term4809.getClass(), "connectionInnovator", null);
        setField(term4809, term4809.getClass(), "random", null);
        setField(term4808, term4808.getClass(), "genome", term4809);
        setDoubleField(term4808, term4808.getClass(), "fitness", 0.16182948586501322);
        Object term4811 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4812 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4812, term4812.getClass(), "nodes", null);
        setField(term4812, term4812.getClass(), "connections", null);
        setField(term4812, term4812.getClass(), "nodeInnovator", null);
        setField(term4812, term4812.getClass(), "connectionInnovator", null);
        setField(term4812, term4812.getClass(), "random", null);
        setField(term4811, term4811.getClass(), "genome", term4812);
        setDoubleField(term4811, term4811.getClass(), "fitness", 0.39028347452315004);
        ArrayList term4800 = new ArrayList();
        ((ArrayList) term4800).add(term4802);
        ((ArrayList) term4800).add(term4805);
        ((ArrayList) term4800).add(term4808);
        ((ArrayList) term4800).add(term4811);
        ArrayList term4818 = new ArrayList();
        ((ArrayList) term4818).add((Object)null);
        ((ArrayList) term4818).add((Object)null);
        ((ArrayList) term4818).add((Object)null);
        ((ArrayList) term4818).add((Object)null);
        ((ArrayList) term4818).add((Object)null);
        ((ArrayList) term4818).add((Object)null);
        ArrayList term4822 = new ArrayList();
        ((ArrayList) term4822).add((Object)null);
        ((ArrayList) term4822).add((Object)null);
        ((ArrayList) term4822).add((Object)null);
        ((ArrayList) term4822).add((Object)null);
        ((ArrayList) term4822).add((Object)null);
        ((ArrayList) term4822).add((Object)null);
        ((ArrayList) term4822).add((Object)null);
        ((ArrayList) term4822).add((Object)null);
        term4799 = newInstance(Class.forName("nn.model.Species"));
        Object term4816 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4817 = newInstance(Class.forName("nn.model.Genome"));
        Object term4826 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term4828 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term4830 = newInstance(Class.forName("java.util.Random"));
        Object term4831 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term4799, term4799.getClass(), "genomes", term4800);
        setField(term4817, term4817.getClass(), "nodes", term4818);
        setField(term4817, term4817.getClass(), "connections", term4822);
        setIntField(term4826, term4826.getClass(), "counter", 100);
        setField(term4817, term4817.getClass(), "nodeInnovator", term4826);
        setIntField(term4828, term4828.getClass(), "counter", 100);
        setField(term4817, term4817.getClass(), "connectionInnovator", term4828);
        setLongField(term4831, term4831.getClass(), "value", 15810518210375L);
        setField(term4830, term4830.getClass(), "seed", term4831);
        setDoubleField(term4830, term4830.getClass(), "nextNextGaussian", 0.9452756892252447);
        setBooleanField(term4830, term4830.getClass(), "haveNextNextGaussian", true);
        setField(term4817, term4817.getClass(), "random", term4830);
        setField(term4816, term4816.getClass(), "genome", term4817);
        setDoubleField(term4816, term4816.getClass(), "fitness", 0.7265543616081012);
        setField(term4799, term4799.getClass(), "bestGenome", term4816);
        setIntField(term4799, term4799.getClass(), "staleness", 2136158480);
        Object term4841 = newInstance(Class.forName("nn.model.Node"));
        setField(term4841, term4841.getClass(), "type", null);
        setIntField(term4841, term4841.getClass(), "innovation", 2118747457);
        setField(term4841, term4841.getClass(), "connections", null);
        setDoubleField(term4841, term4841.getClass(), "bias", 0.8691836681752382);
        Object term4844 = newInstance(Class.forName("nn.model.Node"));
        setField(term4844, term4844.getClass(), "type", null);
        setIntField(term4844, term4844.getClass(), "innovation", 1868344256);
        setField(term4844, term4844.getClass(), "connections", null);
        setDoubleField(term4844, term4844.getClass(), "bias", 0.011084532735115116);
        Object term4847 = newInstance(Class.forName("nn.model.Node"));
        setField(term4847, term4847.getClass(), "type", null);
        setIntField(term4847, term4847.getClass(), "innovation", 162113491);
        setField(term4847, term4847.getClass(), "connections", null);
        setDoubleField(term4847, term4847.getClass(), "bias", 0.9553804492342851);
        Object term4850 = newInstance(Class.forName("nn.model.Node"));
        setField(term4850, term4850.getClass(), "type", null);
        setIntField(term4850, term4850.getClass(), "innovation", 0);
        setField(term4850, term4850.getClass(), "connections", null);
        setDoubleField(term4850, term4850.getClass(), "bias", 0.0);
        Object term4853 = newInstance(Class.forName("nn.model.Node"));
        setField(term4853, term4853.getClass(), "type", null);
        setIntField(term4853, term4853.getClass(), "innovation", 0);
        setField(term4853, term4853.getClass(), "connections", null);
        setDoubleField(term4853, term4853.getClass(), "bias", 0.0);
        Object term4856 = newInstance(Class.forName("nn.model.Node"));
        setField(term4856, term4856.getClass(), "type", null);
        setIntField(term4856, term4856.getClass(), "innovation", 0);
        setField(term4856, term4856.getClass(), "connections", null);
        setDoubleField(term4856, term4856.getClass(), "bias", 0.0);
        Object term4859 = newInstance(Class.forName("nn.model.Node"));
        setField(term4859, term4859.getClass(), "type", null);
        setIntField(term4859, term4859.getClass(), "innovation", 0);
        setField(term4859, term4859.getClass(), "connections", null);
        setDoubleField(term4859, term4859.getClass(), "bias", 0.0);
        ArrayList term4839 = new ArrayList();
        ((ArrayList) term4839).add(term4841);
        ((ArrayList) term4839).add(term4844);
        ((ArrayList) term4839).add(term4847);
        ((ArrayList) term4839).add(term4844);
        ((ArrayList) term4839).add(term4850);
        ((ArrayList) term4839).add(term4853);
        ((ArrayList) term4839).add(term4856);
        ((ArrayList) term4839).add(term4859);
        ArrayList term4864 = new ArrayList();
        term4837 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4838 = newInstance(Class.forName("nn.model.Genome"));
        Object term4868 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term4870 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term4872 = newInstance(Class.forName("java.util.Random"));
        Object term4873 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term4838, term4838.getClass(), "nodes", term4839);
        setField(term4838, term4838.getClass(), "connections", term4864);
        setIntField(term4868, term4868.getClass(), "counter", 100);
        setField(term4838, term4838.getClass(), "nodeInnovator", term4868);
        setIntField(term4870, term4870.getClass(), "counter", 100);
        setField(term4838, term4838.getClass(), "connectionInnovator", term4870);
        setLongField(term4873, term4873.getClass(), "value", 2880726852859L);
        setField(term4872, term4872.getClass(), "seed", term4873);
        setDoubleField(term4872, term4872.getClass(), "nextNextGaussian", 0.7815751235487547);
        setBooleanField(term4872, term4872.getClass(), "haveNextNextGaussian", true);
        setField(term4838, term4838.getClass(), "random", term4872);
        setField(term4837, term4837.getClass(), "genome", term4838);
        setDoubleField(term4837, term4837.getClass(), "fitness", 0.27972598243188085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Species");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.FitnessGenome");
        Object[] args = new Object[1];
        args[0] = term4837;
        callMethod(klass, "addGenome", argTypes, term4799, args);
    }

};


