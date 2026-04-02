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
import java.lang.Integer;

public class Species_init_5456685201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4757;
     Object term4792;

    public Species_init_5456685201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4761 = newInstance(Class.forName("nn.model.Node"));
        setField(term4761, term4761.getClass(), "type", null);
        setIntField(term4761, term4761.getClass(), "innovation", 1443855558);
        setField(term4761, term4761.getClass(), "connections", null);
        setDoubleField(term4761, term4761.getClass(), "bias", 0.6171429441798344);
        ArrayList term4759 = new ArrayList();
        ((ArrayList) term4759).add(term4761);
        Object term4768 = newInstance(Class.forName("nn.model.Connection"));
        setField(term4768, term4768.getClass(), "in", null);
        setField(term4768, term4768.getClass(), "out", null);
        setFloatField(term4768, term4768.getClass(), "weight", 0.5657654F);
        setBooleanField(term4768, term4768.getClass(), "expressed", true);
        setIntField(term4768, term4768.getClass(), "innovation", -675283917);
        Object term4772 = newInstance(Class.forName("nn.model.Connection"));
        setField(term4772, term4772.getClass(), "in", null);
        setField(term4772, term4772.getClass(), "out", term4761);
        setFloatField(term4772, term4772.getClass(), "weight", 0.2599733F);
        setBooleanField(term4772, term4772.getClass(), "expressed", false);
        setIntField(term4772, term4772.getClass(), "innovation", 2059896693);
        Object term4776 = newInstance(Class.forName("nn.model.Connection"));
        setField(term4776, term4776.getClass(), "in", null);
        setField(term4776, term4776.getClass(), "out", null);
        setFloatField(term4776, term4776.getClass(), "weight", 0.6117589F);
        setBooleanField(term4776, term4776.getClass(), "expressed", true);
        setIntField(term4776, term4776.getClass(), "innovation", 1605456363);
        ArrayList term4766 = new ArrayList();
        ((ArrayList) term4766).add(term4768);
        ((ArrayList) term4766).add(term4772);
        ((ArrayList) term4766).add(term4776);
        term4757 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4758 = newInstance(Class.forName("nn.model.Genome"));
        Object term4782 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term4784 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term4786 = newInstance(Class.forName("java.util.Random"));
        Object term4787 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term4758, term4758.getClass(), "nodes", term4759);
        setField(term4758, term4758.getClass(), "connections", term4766);
        setIntField(term4782, term4782.getClass(), "counter", 100);
        setField(term4758, term4758.getClass(), "nodeInnovator", term4782);
        setIntField(term4784, term4784.getClass(), "counter", 100);
        setField(term4758, term4758.getClass(), "connectionInnovator", term4784);
        setLongField(term4787, term4787.getClass(), "value", 250507559726029L);
        setField(term4786, term4786.getClass(), "seed", term4787);
        setDoubleField(term4786, term4786.getClass(), "nextNextGaussian", 0.7042450068993633);
        setBooleanField(term4786, term4786.getClass(), "haveNextNextGaussian", true);
        setField(term4758, term4758.getClass(), "random", term4786);
        setField(term4757, term4757.getClass(), "genome", term4758);
        setDoubleField(term4757, term4757.getClass(), "fitness", 0.8975545796030406);
        term4792 = new Integer(532666604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Species");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("nn.model.FitnessGenome");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4757;
        args[1] = term4792;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


