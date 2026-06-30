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

public class Species_init_6400915420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4725;

    public Species_init_6400915420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4727 = new ArrayList();
        Object term4733 = newInstance(Class.forName("nn.model.Connection"));
        setField(term4733, term4733.getClass(), "in", null);
        setField(term4733, term4733.getClass(), "out", null);
        setFloatField(term4733, term4733.getClass(), "weight", 0.16755807F);
        setBooleanField(term4733, term4733.getClass(), "expressed", true);
        setIntField(term4733, term4733.getClass(), "innovation", 1879729823);
        Object term4737 = newInstance(Class.forName("nn.model.Connection"));
        setField(term4737, term4737.getClass(), "in", null);
        setField(term4737, term4737.getClass(), "out", null);
        setFloatField(term4737, term4737.getClass(), "weight", 0.19656086F);
        setBooleanField(term4737, term4737.getClass(), "expressed", false);
        setIntField(term4737, term4737.getClass(), "innovation", -1150062870);
        Object term4741 = newInstance(Class.forName("nn.model.Connection"));
        setField(term4741, term4741.getClass(), "in", null);
        setField(term4741, term4741.getClass(), "out", null);
        setFloatField(term4741, term4741.getClass(), "weight", 0.0F);
        setBooleanField(term4741, term4741.getClass(), "expressed", false);
        setIntField(term4741, term4741.getClass(), "innovation", 0);
        ArrayList term4731 = new ArrayList();
        ((ArrayList) term4731).add(term4733);
        ((ArrayList) term4731).add(term4737);
        ((ArrayList) term4731).add(term4741);
        term4725 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4726 = newInstance(Class.forName("nn.model.Genome"));
        Object term4747 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term4749 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term4751 = newInstance(Class.forName("java.util.Random"));
        Object term4752 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term4726, term4726.getClass(), "nodes", term4727);
        setField(term4726, term4726.getClass(), "connections", term4731);
        setIntField(term4747, term4747.getClass(), "counter", 100);
        setField(term4726, term4726.getClass(), "nodeInnovator", term4747);
        setIntField(term4749, term4749.getClass(), "counter", 100);
        setField(term4726, term4726.getClass(), "connectionInnovator", term4749);
        setLongField(term4752, term4752.getClass(), "value", 85673383578173L);
        setField(term4751, term4751.getClass(), "seed", term4752);
        setDoubleField(term4751, term4751.getClass(), "nextNextGaussian", 0.5128908508266724);
        setBooleanField(term4751, term4751.getClass(), "haveNextNextGaussian", false);
        setField(term4726, term4726.getClass(), "random", term4751);
        setField(term4725, term4725.getClass(), "genome", term4726);
        setDoubleField(term4725, term4725.getClass(), "fitness", 0.3548098444455199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Species");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.FitnessGenome");
        Object[] args = new Object[1];
        args[0] = term4725;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


