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
     Object term10778;

    public FitnessGenome_getGenome_12004421262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10782 = newInstance(Class.forName("nn.model.Node"));
        setField(term10782, term10782.getClass(), "type", null);
        setIntField(term10782, term10782.getClass(), "innovation", 1909773180);
        setField(term10782, term10782.getClass(), "connections", null);
        setDoubleField(term10782, term10782.getClass(), "bias", 0.1900451907417724);
        Object term10785 = newInstance(Class.forName("nn.model.Node"));
        setField(term10785, term10785.getClass(), "type", null);
        setIntField(term10785, term10785.getClass(), "innovation", -970417907);
        setField(term10785, term10785.getClass(), "connections", null);
        setDoubleField(term10785, term10785.getClass(), "bias", 0.538124451815847);
        Object term10788 = newInstance(Class.forName("nn.model.Node"));
        setField(term10788, term10788.getClass(), "type", null);
        setIntField(term10788, term10788.getClass(), "innovation", 0);
        setField(term10788, term10788.getClass(), "connections", null);
        setDoubleField(term10788, term10788.getClass(), "bias", 0.0);
        Object term10791 = newInstance(Class.forName("nn.model.Node"));
        setField(term10791, term10791.getClass(), "type", null);
        setIntField(term10791, term10791.getClass(), "innovation", 0);
        setField(term10791, term10791.getClass(), "connections", null);
        setDoubleField(term10791, term10791.getClass(), "bias", 0.0);
        ArrayList term10780 = new ArrayList();
        ((ArrayList) term10780).add(term10782);
        ((ArrayList) term10780).add(term10785);
        ((ArrayList) term10780).add(term10788);
        ((ArrayList) term10780).add(term10791);
        ((ArrayList) term10780).add(term10791);
        Object term10798 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10798, term10798.getClass(), "in", null);
        setField(term10798, term10798.getClass(), "out", term10788);
        setFloatField(term10798, term10798.getClass(), "weight", 0.15231675F);
        setBooleanField(term10798, term10798.getClass(), "expressed", false);
        setIntField(term10798, term10798.getClass(), "innovation", -1303269101);
        ArrayList term10796 = new ArrayList();
        ((ArrayList) term10796).add(term10798);
        term10778 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10779 = newInstance(Class.forName("nn.model.Genome"));
        Object term10804 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10806 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10808 = newInstance(Class.forName("java.util.Random"));
        Object term10809 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10779, term10779.getClass(), "nodes", term10780);
        setField(term10779, term10779.getClass(), "connections", term10796);
        setIntField(term10804, term10804.getClass(), "counter", 100);
        setField(term10779, term10779.getClass(), "nodeInnovator", term10804);
        setIntField(term10806, term10806.getClass(), "counter", 100);
        setField(term10779, term10779.getClass(), "connectionInnovator", term10806);
        setLongField(term10809, term10809.getClass(), "value", 141013934913684L);
        setField(term10808, term10808.getClass(), "seed", term10809);
        setDoubleField(term10808, term10808.getClass(), "nextNextGaussian", 0.26687904044277755);
        setBooleanField(term10808, term10808.getClass(), "haveNextNextGaussian", true);
        setField(term10779, term10779.getClass(), "random", term10808);
        setField(term10778, term10778.getClass(), "genome", term10779);
        setDoubleField(term10778, term10778.getClass(), "fitness", 0.6208267483985057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenome", argTypes, term10778, args);
    }

};


