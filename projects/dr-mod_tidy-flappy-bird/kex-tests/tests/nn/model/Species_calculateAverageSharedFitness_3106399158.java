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

public class Species_calculateAverageSharedFitness_3106399158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5039;

    public Species_calculateAverageSharedFitness_3106399158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5042 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term5043 = newInstance(Class.forName("nn.model.Genome"));
        setField(term5043, term5043.getClass(), "nodes", null);
        setField(term5043, term5043.getClass(), "connections", null);
        setField(term5043, term5043.getClass(), "nodeInnovator", null);
        setField(term5043, term5043.getClass(), "connectionInnovator", null);
        setField(term5043, term5043.getClass(), "random", null);
        setField(term5042, term5042.getClass(), "genome", term5043);
        setDoubleField(term5042, term5042.getClass(), "fitness", 0.6900630482766184);
        Object term5045 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term5046 = newInstance(Class.forName("nn.model.Genome"));
        setField(term5046, term5046.getClass(), "nodes", null);
        setField(term5046, term5046.getClass(), "connections", null);
        setField(term5046, term5046.getClass(), "nodeInnovator", null);
        setField(term5046, term5046.getClass(), "connectionInnovator", null);
        setField(term5046, term5046.getClass(), "random", null);
        setField(term5045, term5045.getClass(), "genome", term5046);
        setDoubleField(term5045, term5045.getClass(), "fitness", 0.7658890382866111);
        ArrayList term5040 = new ArrayList();
        ((ArrayList) term5040).add(term5042);
        ((ArrayList) term5040).add(term5045);
        ArrayList term5052 = new ArrayList();
        ((ArrayList) term5052).add((Object)null);
        ((ArrayList) term5052).add((Object)null);
        ArrayList term5056 = new ArrayList();
        term5039 = newInstance(Class.forName("nn.model.Species"));
        Object term5050 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term5051 = newInstance(Class.forName("nn.model.Genome"));
        Object term5060 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term5062 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term5064 = newInstance(Class.forName("java.util.Random"));
        Object term5065 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term5039, term5039.getClass(), "genomes", term5040);
        setField(term5051, term5051.getClass(), "nodes", term5052);
        setField(term5051, term5051.getClass(), "connections", term5056);
        setIntField(term5060, term5060.getClass(), "counter", 100);
        setField(term5051, term5051.getClass(), "nodeInnovator", term5060);
        setIntField(term5062, term5062.getClass(), "counter", 100);
        setField(term5051, term5051.getClass(), "connectionInnovator", term5062);
        setLongField(term5065, term5065.getClass(), "value", 69300715236982L);
        setField(term5064, term5064.getClass(), "seed", term5065);
        setDoubleField(term5064, term5064.getClass(), "nextNextGaussian", 0.5749950495796489);
        setBooleanField(term5064, term5064.getClass(), "haveNextNextGaussian", true);
        setField(term5051, term5051.getClass(), "random", term5064);
        setField(term5050, term5050.getClass(), "genome", term5051);
        setDoubleField(term5050, term5050.getClass(), "fitness", 0.7319834414419222);
        setField(term5039, term5039.getClass(), "bestGenome", term5050);
        setIntField(term5039, term5039.getClass(), "staleness", -252449812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Species");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateAverageSharedFitness", argTypes, term5039, args);
    }

};


