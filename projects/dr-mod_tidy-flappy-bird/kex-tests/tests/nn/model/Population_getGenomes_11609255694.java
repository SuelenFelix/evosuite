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

public class Population_getGenomes_11609255694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3807;

    public Population_getGenomes_11609255694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3811 = new ArrayList();
        ((ArrayList) term3811).add((Object)null);
        ((ArrayList) term3811).add((Object)null);
        ((ArrayList) term3811).add((Object)null);
        ((ArrayList) term3811).add((Object)null);
        ((ArrayList) term3811).add((Object)null);
        ((ArrayList) term3811).add((Object)null);
        ((ArrayList) term3811).add((Object)null);
        ArrayList term3814 = new ArrayList();
        ((ArrayList) term3814).add((Object)null);
        Object term3810 = newInstance(Class.forName("nn.model.Genome"));
        Object term3817 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term3819 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term3821 = newInstance(Class.forName("java.util.Random"));
        setField(term3810, term3810.getClass(), "nodes", term3811);
        setField(term3810, term3810.getClass(), "connections", term3814);
        setIntField(term3817, term3817.getClass(), "counter", 100);
        setField(term3810, term3810.getClass(), "nodeInnovator", term3817);
        setIntField(term3819, term3819.getClass(), "counter", 100);
        setField(term3810, term3810.getClass(), "connectionInnovator", term3819);
        setField(term3821, term3821.getClass(), "seed", null);
        setDoubleField(term3821, term3821.getClass(), "nextNextGaussian", 0.6481625751444708);
        setBooleanField(term3821, term3821.getClass(), "haveNextNextGaussian", false);
        setField(term3810, term3810.getClass(), "random", term3821);
        ArrayList term3825 = new ArrayList();
        ((ArrayList) term3825).add((Object)null);
        ArrayList term3828 = new ArrayList();
        ((ArrayList) term3828).add((Object)null);
        ((ArrayList) term3828).add((Object)null);
        ((ArrayList) term3828).add((Object)null);
        ((ArrayList) term3828).add((Object)null);
        ((ArrayList) term3828).add((Object)null);
        ((ArrayList) term3828).add((Object)null);
        ((ArrayList) term3828).add((Object)null);
        ((ArrayList) term3828).add((Object)null);
        ((ArrayList) term3828).add((Object)null);
        Object term3824 = newInstance(Class.forName("nn.model.Genome"));
        Object term3831 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term3833 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term3835 = newInstance(Class.forName("java.util.Random"));
        setField(term3824, term3824.getClass(), "nodes", term3825);
        setField(term3824, term3824.getClass(), "connections", term3828);
        setIntField(term3831, term3831.getClass(), "counter", 100);
        setField(term3824, term3824.getClass(), "nodeInnovator", term3831);
        setIntField(term3833, term3833.getClass(), "counter", 100);
        setField(term3824, term3824.getClass(), "connectionInnovator", term3833);
        setField(term3835, term3835.getClass(), "seed", null);
        setDoubleField(term3835, term3835.getClass(), "nextNextGaussian", 0.62046987338639);
        setBooleanField(term3835, term3835.getClass(), "haveNextNextGaussian", false);
        setField(term3824, term3824.getClass(), "random", term3835);
        ArrayList term3839 = new ArrayList();
        ((ArrayList) term3839).add((Object)null);
        ArrayList term3842 = new ArrayList();
        ((ArrayList) term3842).add((Object)null);
        ((ArrayList) term3842).add((Object)null);
        ((ArrayList) term3842).add((Object)null);
        ((ArrayList) term3842).add((Object)null);
        Object term3838 = newInstance(Class.forName("nn.model.Genome"));
        Object term3845 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term3847 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term3849 = newInstance(Class.forName("java.util.Random"));
        setField(term3838, term3838.getClass(), "nodes", term3839);
        setField(term3838, term3838.getClass(), "connections", term3842);
        setIntField(term3845, term3845.getClass(), "counter", 100);
        setField(term3838, term3838.getClass(), "nodeInnovator", term3845);
        setIntField(term3847, term3847.getClass(), "counter", 100);
        setField(term3838, term3838.getClass(), "connectionInnovator", term3847);
        setField(term3849, term3849.getClass(), "seed", null);
        setDoubleField(term3849, term3849.getClass(), "nextNextGaussian", 0.16681991355621673);
        setBooleanField(term3849, term3849.getClass(), "haveNextNextGaussian", true);
        setField(term3838, term3838.getClass(), "random", term3849);
        ArrayList term3808 = new ArrayList();
        ((ArrayList) term3808).add(term3810);
        ((ArrayList) term3808).add(term3824);
        ((ArrayList) term3808).add(term3838);
        ArrayList term3861 = new ArrayList();
        ArrayList term3867 = new ArrayList();
        ArrayList term3871 = new ArrayList();
        ((ArrayList) term3871).add((Object)null);
        ((ArrayList) term3871).add((Object)null);
        term3807 = newInstance(Class.forName("nn.model.Population"));
        Object term3854 = newInstance(Class.forName("java.util.Random"));
        Object term3855 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term3860 = newInstance(Class.forName("nn.model.Specieses"));
        Object term3865 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term3866 = newInstance(Class.forName("nn.model.Genome"));
        Object term3875 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term3877 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term3879 = newInstance(Class.forName("java.util.Random"));
        Object term3880 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term3885 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term3887 = newInstance(Class.forName("nn.model.NodeInnovator"));
        setField(term3807, term3807.getClass(), "genomes", term3808);
        setField(term3807, term3807.getClass(), "evaluator", null);
        setLongField(term3855, term3855.getClass(), "value", 272463664719053L);
        setField(term3854, term3854.getClass(), "seed", term3855);
        setDoubleField(term3854, term3854.getClass(), "nextNextGaussian", 0.24168508149332457);
        setBooleanField(term3854, term3854.getClass(), "haveNextNextGaussian", false);
        setField(term3807, term3807.getClass(), "random", term3854);
        setIntField(term3807, term3807.getClass(), "populationSize", -525570815);
        setField(term3860, term3860.getClass(), "specieses", term3861);
        setField(term3807, term3807.getClass(), "specieses", term3860);
        setField(term3866, term3866.getClass(), "nodes", term3867);
        setField(term3866, term3866.getClass(), "connections", term3871);
        setIntField(term3875, term3875.getClass(), "counter", 100);
        setField(term3866, term3866.getClass(), "nodeInnovator", term3875);
        setIntField(term3877, term3877.getClass(), "counter", 100);
        setField(term3866, term3866.getClass(), "connectionInnovator", term3877);
        setLongField(term3880, term3880.getClass(), "value", 119989122452119L);
        setField(term3879, term3879.getClass(), "seed", term3880);
        setDoubleField(term3879, term3879.getClass(), "nextNextGaussian", 0.9765582392968284);
        setBooleanField(term3879, term3879.getClass(), "haveNextNextGaussian", false);
        setField(term3866, term3866.getClass(), "random", term3879);
        setField(term3865, term3865.getClass(), "genome", term3866);
        setDoubleField(term3865, term3865.getClass(), "fitness", 0.33340230026214834);
        setField(term3807, term3807.getClass(), "best", term3865);
        setIntField(term3885, term3885.getClass(), "counter", 100);
        setField(term3807, term3807.getClass(), "connectionInnovator", term3885);
        setIntField(term3887, term3887.getClass(), "counter", 100);
        setField(term3807, term3807.getClass(), "nodeInnovator", term3887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Population");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenomes", argTypes, term3807, args);
    }

};


