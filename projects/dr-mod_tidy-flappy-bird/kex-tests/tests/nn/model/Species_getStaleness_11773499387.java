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

public class Species_getStaleness_11773499387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5010;

    public Species_getStaleness_11773499387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5013 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term5014 = newInstance(Class.forName("nn.model.Genome"));
        setField(term5014, term5014.getClass(), "nodes", null);
        setField(term5014, term5014.getClass(), "connections", null);
        setField(term5014, term5014.getClass(), "nodeInnovator", null);
        setField(term5014, term5014.getClass(), "connectionInnovator", null);
        setField(term5014, term5014.getClass(), "random", null);
        setField(term5013, term5013.getClass(), "genome", term5014);
        setDoubleField(term5013, term5013.getClass(), "fitness", 0.09385588267689582);
        ArrayList term5011 = new ArrayList();
        ((ArrayList) term5011).add(term5013);
        ArrayList term5020 = new ArrayList();
        ((ArrayList) term5020).add((Object)null);
        ((ArrayList) term5020).add((Object)null);
        ((ArrayList) term5020).add((Object)null);
        ((ArrayList) term5020).add((Object)null);
        ((ArrayList) term5020).add((Object)null);
        ((ArrayList) term5020).add((Object)null);
        ((ArrayList) term5020).add((Object)null);
        ((ArrayList) term5020).add((Object)null);
        ArrayList term5024 = new ArrayList();
        ((ArrayList) term5024).add((Object)null);
        ((ArrayList) term5024).add((Object)null);
        ((ArrayList) term5024).add((Object)null);
        ((ArrayList) term5024).add((Object)null);
        ((ArrayList) term5024).add((Object)null);
        ((ArrayList) term5024).add((Object)null);
        ((ArrayList) term5024).add((Object)null);
        ((ArrayList) term5024).add((Object)null);
        term5010 = newInstance(Class.forName("nn.model.Species"));
        Object term5018 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term5019 = newInstance(Class.forName("nn.model.Genome"));
        Object term5028 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term5030 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term5032 = newInstance(Class.forName("java.util.Random"));
        Object term5033 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term5010, term5010.getClass(), "genomes", term5011);
        setField(term5019, term5019.getClass(), "nodes", term5020);
        setField(term5019, term5019.getClass(), "connections", term5024);
        setIntField(term5028, term5028.getClass(), "counter", 100);
        setField(term5019, term5019.getClass(), "nodeInnovator", term5028);
        setIntField(term5030, term5030.getClass(), "counter", 100);
        setField(term5019, term5019.getClass(), "connectionInnovator", term5030);
        setLongField(term5033, term5033.getClass(), "value", 181126687502873L);
        setField(term5032, term5032.getClass(), "seed", term5033);
        setDoubleField(term5032, term5032.getClass(), "nextNextGaussian", 0.6635389764920203);
        setBooleanField(term5032, term5032.getClass(), "haveNextNextGaussian", false);
        setField(term5019, term5019.getClass(), "random", term5032);
        setField(term5018, term5018.getClass(), "genome", term5019);
        setDoubleField(term5018, term5018.getClass(), "fitness", 0.9118883779077857);
        setField(term5010, term5010.getClass(), "bestGenome", term5018);
        setIntField(term5010, term5010.getClass(), "staleness", 1235045850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Species");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStaleness", argTypes, term5010, args);
    }

};


