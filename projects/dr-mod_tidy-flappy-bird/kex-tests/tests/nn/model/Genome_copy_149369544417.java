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
import java.lang.String;

public class Genome_copy_149369544417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10694;

    public Genome_copy_149369544417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10733 = Class.forName((String) "nn.model.Type");
        Field term10732 = ((Class) term10733).getDeclaredField((String) "SENSOR");
        ((Field) term10732).setAccessible(true);
        Object enum63 = ((Field) term10732).get((Object) null);
        ArrayList term10701 = new ArrayList();
        ((ArrayList) term10701).add((Object)null);
        ((ArrayList) term10701).add((Object)null);
        ((ArrayList) term10701).add((Object)null);
        Object term10697 = newInstance(Class.forName("nn.model.Node"));
        setField(term10697, term10697.getClass(), "type", enum63);
        setIntField(term10697, term10697.getClass(), "innovation", 44908093);
        setField(term10697, term10697.getClass(), "connections", term10701);
        setDoubleField(term10697, term10697.getClass(), "bias", 0.11515719123986734);
        Class<? extends Object> term10823 = Class.forName((String) "nn.model.Type");
        Field term10822 = ((Class) term10823).getDeclaredField((String) "HIDDEN");
        ((Field) term10822).setAccessible(true);
        Object enum64 = ((Field) term10822).get((Object) null);
        ArrayList term10709 = new ArrayList();
        ((ArrayList) term10709).add((Object)null);
        ((ArrayList) term10709).add((Object)null);
        ((ArrayList) term10709).add((Object)null);
        ((ArrayList) term10709).add((Object)null);
        ((ArrayList) term10709).add((Object)null);
        ((ArrayList) term10709).add((Object)null);
        ((ArrayList) term10709).add((Object)null);
        Object term10705 = newInstance(Class.forName("nn.model.Node"));
        setField(term10705, term10705.getClass(), "type", enum64);
        setIntField(term10705, term10705.getClass(), "innovation", 1583691829);
        setField(term10705, term10705.getClass(), "connections", term10709);
        setDoubleField(term10705, term10705.getClass(), "bias", 0.6413275352493107);
        ArrayList term10695 = new ArrayList();
        ((ArrayList) term10695).add(term10697);
        ((ArrayList) term10695).add(term10705);
        Object term10717 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10717, term10717.getClass(), "in", null);
        setField(term10717, term10717.getClass(), "out", null);
        setFloatField(term10717, term10717.getClass(), "weight", 0.0F);
        setBooleanField(term10717, term10717.getClass(), "expressed", false);
        setIntField(term10717, term10717.getClass(), "innovation", 0);
        ArrayList term10715 = new ArrayList();
        ((ArrayList) term10715).add(term10717);
        term10694 = newInstance(Class.forName("nn.model.Genome"));
        Object term10723 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10725 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10727 = newInstance(Class.forName("java.util.Random"));
        Object term10728 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10694, term10694.getClass(), "nodes", term10695);
        setField(term10694, term10694.getClass(), "connections", term10715);
        setIntField(term10723, term10723.getClass(), "counter", 100);
        setField(term10694, term10694.getClass(), "nodeInnovator", term10723);
        setIntField(term10725, term10725.getClass(), "counter", 100);
        setField(term10694, term10694.getClass(), "connectionInnovator", term10725);
        setLongField(term10728, term10728.getClass(), "value", 74185877998365L);
        setField(term10727, term10727.getClass(), "seed", term10728);
        setDoubleField(term10727, term10727.getClass(), "nextNextGaussian", 0.9220677404866297);
        setBooleanField(term10727, term10727.getClass(), "haveNextNextGaussian", false);
        setField(term10694, term10694.getClass(), "random", term10727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term10694, args);
    }

};


