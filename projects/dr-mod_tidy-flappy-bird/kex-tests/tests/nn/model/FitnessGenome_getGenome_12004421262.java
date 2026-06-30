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

public class FitnessGenome_getGenome_12004421262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10781;

    public FitnessGenome_getGenome_12004421262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10785 = newInstance(Class.forName("nn.model.Node"));
        setField(term10785, term10785.getClass(), "type", null);
        setIntField(term10785, term10785.getClass(), "innovation", 1909773180);
        setField(term10785, term10785.getClass(), "connections", null);
        setDoubleField(term10785, term10785.getClass(), "bias", 0.1900451907417724);
        Object term10788 = newInstance(Class.forName("nn.model.Node"));
        setField(term10788, term10788.getClass(), "type", null);
        setIntField(term10788, term10788.getClass(), "innovation", -970417907);
        setField(term10788, term10788.getClass(), "connections", null);
        setDoubleField(term10788, term10788.getClass(), "bias", 0.538124451815847);
        Object term10791 = newInstance(Class.forName("nn.model.Node"));
        setField(term10791, term10791.getClass(), "type", null);
        setIntField(term10791, term10791.getClass(), "innovation", 0);
        setField(term10791, term10791.getClass(), "connections", null);
        setDoubleField(term10791, term10791.getClass(), "bias", 0.0);
        Object term10794 = newInstance(Class.forName("nn.model.Node"));
        setField(term10794, term10794.getClass(), "type", null);
        setIntField(term10794, term10794.getClass(), "innovation", 0);
        setField(term10794, term10794.getClass(), "connections", null);
        setDoubleField(term10794, term10794.getClass(), "bias", 0.0);
        ArrayList term10783 = new ArrayList();
        ((ArrayList) term10783).add(term10785);
        ((ArrayList) term10783).add(term10788);
        ((ArrayList) term10783).add(term10791);
        ((ArrayList) term10783).add(term10794);
        ((ArrayList) term10783).add(term10794);
        Object term10801 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10801, term10801.getClass(), "in", null);
        setField(term10801, term10801.getClass(), "out", term10791);
        setFloatField(term10801, term10801.getClass(), "weight", 0.15231675F);
        setBooleanField(term10801, term10801.getClass(), "expressed", false);
        setIntField(term10801, term10801.getClass(), "innovation", -1303269101);
        ArrayList term10799 = new ArrayList();
        ((ArrayList) term10799).add(term10801);
        term10781 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10782 = newInstance(Class.forName("nn.model.Genome"));
        Object term10807 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10809 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10811 = newInstance(Class.forName("java.util.Random"));
        Object term10812 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10782, term10782.getClass(), "nodes", term10783);
        setField(term10782, term10782.getClass(), "connections", term10799);
        setIntField(term10807, term10807.getClass(), "counter", 100);
        setField(term10782, term10782.getClass(), "nodeInnovator", term10807);
        setIntField(term10809, term10809.getClass(), "counter", 100);
        setField(term10782, term10782.getClass(), "connectionInnovator", term10809);
        setLongField(term10812, term10812.getClass(), "value", 14709180298474L);
        setField(term10811, term10811.getClass(), "seed", term10812);
        setDoubleField(term10811, term10811.getClass(), "nextNextGaussian", 0.26687904044277755);
        setBooleanField(term10811, term10811.getClass(), "haveNextNextGaussian", true);
        setField(term10782, term10782.getClass(), "random", term10811);
        setField(term10781, term10781.getClass(), "genome", term10782);
        setDoubleField(term10781, term10781.getClass(), "fitness", 0.6208267483985057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenome", argTypes, term10781, args);
    }

};


