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

public class Genome_getNodes_54646481212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9811;

    public Genome_getNodes_54646481212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9812 = new ArrayList();
        Object term9818 = newInstance(Class.forName("nn.model.Connection"));
        Object term9819 = newInstance(Class.forName("nn.model.Node"));
        Object term9822 = newInstance(Class.forName("nn.model.Node"));
        setField(term9819, term9819.getClass(), "type", null);
        setIntField(term9819, term9819.getClass(), "innovation", -441333794);
        setField(term9819, term9819.getClass(), "connections", null);
        setDoubleField(term9819, term9819.getClass(), "bias", 0.49164780269698416);
        setField(term9818, term9818.getClass(), "in", term9819);
        setField(term9822, term9822.getClass(), "type", null);
        setIntField(term9822, term9822.getClass(), "innovation", 0);
        setField(term9822, term9822.getClass(), "connections", null);
        setDoubleField(term9822, term9822.getClass(), "bias", 0.0);
        setField(term9818, term9818.getClass(), "out", term9822);
        setFloatField(term9818, term9818.getClass(), "weight", 0.9678135F);
        setBooleanField(term9818, term9818.getClass(), "expressed", false);
        setIntField(term9818, term9818.getClass(), "innovation", 2079590265);
        Object term9828 = newInstance(Class.forName("nn.model.Connection"));
        Object term9829 = newInstance(Class.forName("nn.model.Node"));
        setField(term9828, term9828.getClass(), "in", term9822);
        setField(term9829, term9829.getClass(), "type", null);
        setIntField(term9829, term9829.getClass(), "innovation", 0);
        setField(term9829, term9829.getClass(), "connections", null);
        setDoubleField(term9829, term9829.getClass(), "bias", 0.0);
        setField(term9828, term9828.getClass(), "out", term9829);
        setFloatField(term9828, term9828.getClass(), "weight", 0.009446323F);
        setBooleanField(term9828, term9828.getClass(), "expressed", false);
        setIntField(term9828, term9828.getClass(), "innovation", -867099093);
        Object term9835 = newInstance(Class.forName("nn.model.Connection"));
        Object term9836 = newInstance(Class.forName("nn.model.Node"));
        Object term9839 = newInstance(Class.forName("nn.model.Node"));
        setField(term9836, term9836.getClass(), "type", null);
        setIntField(term9836, term9836.getClass(), "innovation", 1504698817);
        setField(term9836, term9836.getClass(), "connections", null);
        setDoubleField(term9836, term9836.getClass(), "bias", 0.6560878972868479);
        setField(term9835, term9835.getClass(), "in", term9836);
        setField(term9839, term9839.getClass(), "type", null);
        setIntField(term9839, term9839.getClass(), "innovation", -1573760035);
        setField(term9839, term9839.getClass(), "connections", null);
        setDoubleField(term9839, term9839.getClass(), "bias", 0.6712198198383964);
        setField(term9835, term9835.getClass(), "out", term9839);
        setFloatField(term9835, term9835.getClass(), "weight", 0.45938897F);
        setBooleanField(term9835, term9835.getClass(), "expressed", true);
        setIntField(term9835, term9835.getClass(), "innovation", 2039815750);
        ArrayList term9816 = new ArrayList();
        ((ArrayList) term9816).add(term9818);
        ((ArrayList) term9816).add(term9828);
        ((ArrayList) term9816).add(term9835);
        term9811 = newInstance(Class.forName("nn.model.Genome"));
        Object term9847 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term9849 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term9851 = newInstance(Class.forName("java.util.Random"));
        Object term9852 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term9811, term9811.getClass(), "nodes", term9812);
        setField(term9811, term9811.getClass(), "connections", term9816);
        setIntField(term9847, term9847.getClass(), "counter", 100);
        setField(term9811, term9811.getClass(), "nodeInnovator", term9847);
        setIntField(term9849, term9849.getClass(), "counter", 100);
        setField(term9811, term9811.getClass(), "connectionInnovator", term9849);
        setLongField(term9852, term9852.getClass(), "value", 34560975234432L);
        setField(term9851, term9851.getClass(), "seed", term9852);
        setDoubleField(term9851, term9851.getClass(), "nextNextGaussian", 0.05844959776072378);
        setBooleanField(term9851, term9851.getClass(), "haveNextNextGaussian", true);
        setField(term9811, term9811.getClass(), "random", term9851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNodes", argTypes, term9811, args);
    }

};


