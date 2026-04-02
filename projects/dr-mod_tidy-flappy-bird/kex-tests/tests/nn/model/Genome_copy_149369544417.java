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
     Object term10696;

    public Genome_copy_149369544417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10735 = Class.forName((String) "nn.model.Type");
        Field term10734 = ((Class) term10735).getDeclaredField((String) "SENSOR");
        ((Field) term10734).setAccessible(true);
        Object enum63 = ((Field) term10734).get((Object) null);
        ArrayList term10703 = new ArrayList();
        ((ArrayList) term10703).add((Object)null);
        ((ArrayList) term10703).add((Object)null);
        ((ArrayList) term10703).add((Object)null);
        Object term10699 = newInstance(Class.forName("nn.model.Node"));
        setField(term10699, term10699.getClass(), "type", enum63);
        setIntField(term10699, term10699.getClass(), "innovation", 44908093);
        setField(term10699, term10699.getClass(), "connections", term10703);
        setDoubleField(term10699, term10699.getClass(), "bias", 0.11515719123986734);
        Class<? extends Object> term10825 = Class.forName((String) "nn.model.Type");
        Field term10824 = ((Class) term10825).getDeclaredField((String) "HIDDEN");
        ((Field) term10824).setAccessible(true);
        Object enum64 = ((Field) term10824).get((Object) null);
        ArrayList term10711 = new ArrayList();
        ((ArrayList) term10711).add((Object)null);
        ((ArrayList) term10711).add((Object)null);
        ((ArrayList) term10711).add((Object)null);
        ((ArrayList) term10711).add((Object)null);
        ((ArrayList) term10711).add((Object)null);
        ((ArrayList) term10711).add((Object)null);
        ((ArrayList) term10711).add((Object)null);
        Object term10707 = newInstance(Class.forName("nn.model.Node"));
        setField(term10707, term10707.getClass(), "type", enum64);
        setIntField(term10707, term10707.getClass(), "innovation", 1583691829);
        setField(term10707, term10707.getClass(), "connections", term10711);
        setDoubleField(term10707, term10707.getClass(), "bias", 0.6413275352493107);
        ArrayList term10697 = new ArrayList();
        ((ArrayList) term10697).add(term10699);
        ((ArrayList) term10697).add(term10707);
        Object term10719 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10719, term10719.getClass(), "in", null);
        setField(term10719, term10719.getClass(), "out", null);
        setFloatField(term10719, term10719.getClass(), "weight", 0.0F);
        setBooleanField(term10719, term10719.getClass(), "expressed", false);
        setIntField(term10719, term10719.getClass(), "innovation", 0);
        ArrayList term10717 = new ArrayList();
        ((ArrayList) term10717).add(term10719);
        term10696 = newInstance(Class.forName("nn.model.Genome"));
        Object term10725 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10727 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10729 = newInstance(Class.forName("java.util.Random"));
        Object term10730 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10696, term10696.getClass(), "nodes", term10697);
        setField(term10696, term10696.getClass(), "connections", term10717);
        setIntField(term10725, term10725.getClass(), "counter", 100);
        setField(term10696, term10696.getClass(), "nodeInnovator", term10725);
        setIntField(term10727, term10727.getClass(), "counter", 100);
        setField(term10696, term10696.getClass(), "connectionInnovator", term10727);
        setLongField(term10730, term10730.getClass(), "value", 260735652783558L);
        setField(term10729, term10729.getClass(), "seed", term10730);
        setDoubleField(term10729, term10729.getClass(), "nextNextGaussian", 0.9220677404866297);
        setBooleanField(term10729, term10729.getClass(), "haveNextNextGaussian", false);
        setField(term10696, term10696.getClass(), "random", term10729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term10696, args);
    }

};


