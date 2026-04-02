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
     Object term10766;

    public FitnessGenome_getGenome_12004421262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10770 = newInstance(Class.forName("nn.model.Node"));
        setField(term10770, term10770.getClass(), "type", null);
        setIntField(term10770, term10770.getClass(), "innovation", 1909773180);
        setField(term10770, term10770.getClass(), "connections", null);
        setDoubleField(term10770, term10770.getClass(), "bias", 0.1900451907417724);
        Object term10773 = newInstance(Class.forName("nn.model.Node"));
        setField(term10773, term10773.getClass(), "type", null);
        setIntField(term10773, term10773.getClass(), "innovation", -970417907);
        setField(term10773, term10773.getClass(), "connections", null);
        setDoubleField(term10773, term10773.getClass(), "bias", 0.538124451815847);
        Object term10776 = newInstance(Class.forName("nn.model.Node"));
        setField(term10776, term10776.getClass(), "type", null);
        setIntField(term10776, term10776.getClass(), "innovation", 0);
        setField(term10776, term10776.getClass(), "connections", null);
        setDoubleField(term10776, term10776.getClass(), "bias", 0.0);
        Object term10779 = newInstance(Class.forName("nn.model.Node"));
        setField(term10779, term10779.getClass(), "type", null);
        setIntField(term10779, term10779.getClass(), "innovation", 0);
        setField(term10779, term10779.getClass(), "connections", null);
        setDoubleField(term10779, term10779.getClass(), "bias", 0.0);
        ArrayList term10768 = new ArrayList();
        ((ArrayList) term10768).add(term10770);
        ((ArrayList) term10768).add(term10773);
        ((ArrayList) term10768).add(term10776);
        ((ArrayList) term10768).add(term10779);
        ((ArrayList) term10768).add(term10779);
        Object term10786 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10786, term10786.getClass(), "in", null);
        setField(term10786, term10786.getClass(), "out", term10776);
        setFloatField(term10786, term10786.getClass(), "weight", 0.15231675F);
        setBooleanField(term10786, term10786.getClass(), "expressed", false);
        setIntField(term10786, term10786.getClass(), "innovation", -1303269101);
        ArrayList term10784 = new ArrayList();
        ((ArrayList) term10784).add(term10786);
        term10766 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10767 = newInstance(Class.forName("nn.model.Genome"));
        Object term10792 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10794 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10796 = newInstance(Class.forName("java.util.Random"));
        Object term10797 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10767, term10767.getClass(), "nodes", term10768);
        setField(term10767, term10767.getClass(), "connections", term10784);
        setIntField(term10792, term10792.getClass(), "counter", 100);
        setField(term10767, term10767.getClass(), "nodeInnovator", term10792);
        setIntField(term10794, term10794.getClass(), "counter", 100);
        setField(term10767, term10767.getClass(), "connectionInnovator", term10794);
        setLongField(term10797, term10797.getClass(), "value", 146561687412118L);
        setField(term10796, term10796.getClass(), "seed", term10797);
        setDoubleField(term10796, term10796.getClass(), "nextNextGaussian", 0.26687904044277755);
        setBooleanField(term10796, term10796.getClass(), "haveNextNextGaussian", true);
        setField(term10767, term10767.getClass(), "random", term10796);
        setField(term10766, term10766.getClass(), "genome", term10767);
        setDoubleField(term10766, term10766.getClass(), "fitness", 0.6208267483985057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenome", argTypes, term10766, args);
    }

};


