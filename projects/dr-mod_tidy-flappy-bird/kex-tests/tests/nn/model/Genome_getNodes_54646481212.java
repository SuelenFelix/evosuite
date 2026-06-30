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
     Object term9809;

    public Genome_getNodes_54646481212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9810 = new ArrayList();
        Object term9816 = newInstance(Class.forName("nn.model.Connection"));
        Object term9817 = newInstance(Class.forName("nn.model.Node"));
        Object term9820 = newInstance(Class.forName("nn.model.Node"));
        setField(term9817, term9817.getClass(), "type", null);
        setIntField(term9817, term9817.getClass(), "innovation", -441333794);
        setField(term9817, term9817.getClass(), "connections", null);
        setDoubleField(term9817, term9817.getClass(), "bias", 0.49164780269698416);
        setField(term9816, term9816.getClass(), "in", term9817);
        setField(term9820, term9820.getClass(), "type", null);
        setIntField(term9820, term9820.getClass(), "innovation", 0);
        setField(term9820, term9820.getClass(), "connections", null);
        setDoubleField(term9820, term9820.getClass(), "bias", 0.0);
        setField(term9816, term9816.getClass(), "out", term9820);
        setFloatField(term9816, term9816.getClass(), "weight", 0.9678135F);
        setBooleanField(term9816, term9816.getClass(), "expressed", false);
        setIntField(term9816, term9816.getClass(), "innovation", 2079590265);
        Object term9826 = newInstance(Class.forName("nn.model.Connection"));
        Object term9827 = newInstance(Class.forName("nn.model.Node"));
        setField(term9826, term9826.getClass(), "in", term9820);
        setField(term9827, term9827.getClass(), "type", null);
        setIntField(term9827, term9827.getClass(), "innovation", 0);
        setField(term9827, term9827.getClass(), "connections", null);
        setDoubleField(term9827, term9827.getClass(), "bias", 0.0);
        setField(term9826, term9826.getClass(), "out", term9827);
        setFloatField(term9826, term9826.getClass(), "weight", 0.009446323F);
        setBooleanField(term9826, term9826.getClass(), "expressed", false);
        setIntField(term9826, term9826.getClass(), "innovation", -867099093);
        Object term9833 = newInstance(Class.forName("nn.model.Connection"));
        Object term9834 = newInstance(Class.forName("nn.model.Node"));
        Object term9837 = newInstance(Class.forName("nn.model.Node"));
        setField(term9834, term9834.getClass(), "type", null);
        setIntField(term9834, term9834.getClass(), "innovation", 1504698817);
        setField(term9834, term9834.getClass(), "connections", null);
        setDoubleField(term9834, term9834.getClass(), "bias", 0.6560878972868479);
        setField(term9833, term9833.getClass(), "in", term9834);
        setField(term9837, term9837.getClass(), "type", null);
        setIntField(term9837, term9837.getClass(), "innovation", -1573760035);
        setField(term9837, term9837.getClass(), "connections", null);
        setDoubleField(term9837, term9837.getClass(), "bias", 0.6712198198383964);
        setField(term9833, term9833.getClass(), "out", term9837);
        setFloatField(term9833, term9833.getClass(), "weight", 0.45938897F);
        setBooleanField(term9833, term9833.getClass(), "expressed", true);
        setIntField(term9833, term9833.getClass(), "innovation", 2039815750);
        ArrayList term9814 = new ArrayList();
        ((ArrayList) term9814).add(term9816);
        ((ArrayList) term9814).add(term9826);
        ((ArrayList) term9814).add(term9833);
        term9809 = newInstance(Class.forName("nn.model.Genome"));
        Object term9845 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term9847 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term9849 = newInstance(Class.forName("java.util.Random"));
        Object term9850 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term9809, term9809.getClass(), "nodes", term9810);
        setField(term9809, term9809.getClass(), "connections", term9814);
        setIntField(term9845, term9845.getClass(), "counter", 100);
        setField(term9809, term9809.getClass(), "nodeInnovator", term9845);
        setIntField(term9847, term9847.getClass(), "counter", 100);
        setField(term9809, term9809.getClass(), "connectionInnovator", term9847);
        setLongField(term9850, term9850.getClass(), "value", 198194450000915L);
        setField(term9849, term9849.getClass(), "seed", term9850);
        setDoubleField(term9849, term9849.getClass(), "nextNextGaussian", 0.05844959776072378);
        setBooleanField(term9849, term9849.getClass(), "haveNextNextGaussian", true);
        setField(term9809, term9809.getClass(), "random", term9849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNodes", argTypes, term9809, args);
    }

};


