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

public class FitnessGenome_copy_20041143245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10910;

    public FitnessGenome_copy_20041143245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10914 = newInstance(Class.forName("nn.model.Node"));
        setField(term10914, term10914.getClass(), "type", null);
        setIntField(term10914, term10914.getClass(), "innovation", -400720912);
        setField(term10914, term10914.getClass(), "connections", null);
        setDoubleField(term10914, term10914.getClass(), "bias", 0.03123965072102497);
        ArrayList term10912 = new ArrayList();
        ((ArrayList) term10912).add(term10914);
        Object term10921 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10921, term10921.getClass(), "in", null);
        setField(term10921, term10921.getClass(), "out", null);
        setFloatField(term10921, term10921.getClass(), "weight", 0.51252073F);
        setBooleanField(term10921, term10921.getClass(), "expressed", true);
        setIntField(term10921, term10921.getClass(), "innovation", -89522625);
        Object term10925 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10925, term10925.getClass(), "in", term10914);
        setField(term10925, term10925.getClass(), "out", null);
        setFloatField(term10925, term10925.getClass(), "weight", 0.9906085F);
        setBooleanField(term10925, term10925.getClass(), "expressed", false);
        setIntField(term10925, term10925.getClass(), "innovation", 1232958763);
        Object term10929 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10929, term10929.getClass(), "in", null);
        setField(term10929, term10929.getClass(), "out", null);
        setFloatField(term10929, term10929.getClass(), "weight", 0.5379623F);
        setBooleanField(term10929, term10929.getClass(), "expressed", true);
        setIntField(term10929, term10929.getClass(), "innovation", -2014792457);
        Object term10933 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10933, term10933.getClass(), "in", null);
        setField(term10933, term10933.getClass(), "out", null);
        setFloatField(term10933, term10933.getClass(), "weight", 0.010970712F);
        setBooleanField(term10933, term10933.getClass(), "expressed", false);
        setIntField(term10933, term10933.getClass(), "innovation", -1419341969);
        Object term10937 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10937, term10937.getClass(), "in", null);
        setField(term10937, term10937.getClass(), "out", null);
        setFloatField(term10937, term10937.getClass(), "weight", 0.19754016F);
        setBooleanField(term10937, term10937.getClass(), "expressed", true);
        setIntField(term10937, term10937.getClass(), "innovation", -1510967747);
        Object term10941 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10941, term10941.getClass(), "in", null);
        setField(term10941, term10941.getClass(), "out", null);
        setFloatField(term10941, term10941.getClass(), "weight", 0.16822469F);
        setBooleanField(term10941, term10941.getClass(), "expressed", false);
        setIntField(term10941, term10941.getClass(), "innovation", -2004794532);
        ArrayList term10919 = new ArrayList();
        ((ArrayList) term10919).add(term10921);
        ((ArrayList) term10919).add(term10925);
        ((ArrayList) term10919).add(term10929);
        ((ArrayList) term10919).add(term10929);
        ((ArrayList) term10919).add(term10933);
        ((ArrayList) term10919).add(term10921);
        ((ArrayList) term10919).add(term10921);
        ((ArrayList) term10919).add(term10937);
        ((ArrayList) term10919).add(term10941);
        term10910 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10911 = newInstance(Class.forName("nn.model.Genome"));
        Object term10947 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10949 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10951 = newInstance(Class.forName("java.util.Random"));
        Object term10952 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10911, term10911.getClass(), "nodes", term10912);
        setField(term10911, term10911.getClass(), "connections", term10919);
        setIntField(term10947, term10947.getClass(), "counter", 100);
        setField(term10911, term10911.getClass(), "nodeInnovator", term10947);
        setIntField(term10949, term10949.getClass(), "counter", 100);
        setField(term10911, term10911.getClass(), "connectionInnovator", term10949);
        setLongField(term10952, term10952.getClass(), "value", 188823233047452L);
        setField(term10951, term10951.getClass(), "seed", term10952);
        setDoubleField(term10951, term10951.getClass(), "nextNextGaussian", 0.026533684659376444);
        setBooleanField(term10951, term10951.getClass(), "haveNextNextGaussian", true);
        setField(term10911, term10911.getClass(), "random", term10951);
        setField(term10910, term10910.getClass(), "genome", term10911);
        setDoubleField(term10910, term10910.getClass(), "fitness", 0.11613622644165744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term10910, args);
    }

};


