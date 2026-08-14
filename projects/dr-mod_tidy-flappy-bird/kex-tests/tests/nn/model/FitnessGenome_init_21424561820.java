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
import java.lang.Double;

public class FitnessGenome_init_21424561820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10328;
     Object term10410;

    public FitnessGenome_init_21424561820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10413 = Class.forName((String) "nn.model.Type");
        Field term10412 = ((Class) term10413).getDeclaredField((String) "OUTPUT");
        ((Field) term10412).setAccessible(true);
        Object enum67 = ((Field) term10412).get((Object) null);
        ArrayList term10335 = new ArrayList();
        ((ArrayList) term10335).add((Object)null);
        ((ArrayList) term10335).add((Object)null);
        ((ArrayList) term10335).add((Object)null);
        ((ArrayList) term10335).add((Object)null);
        ((ArrayList) term10335).add((Object)null);
        ((ArrayList) term10335).add((Object)null);
        ((ArrayList) term10335).add((Object)null);
        ((ArrayList) term10335).add((Object)null);
        ((ArrayList) term10335).add((Object)null);
        Object term10331 = newInstance(Class.forName("nn.model.Node"));
        setField(term10331, term10331.getClass(), "type", enum67);
        setIntField(term10331, term10331.getClass(), "innovation", 1268893136);
        setField(term10331, term10331.getClass(), "connections", term10335);
        setDoubleField(term10331, term10331.getClass(), "bias", 0.14499093140326424);
        ArrayList term10341 = new ArrayList();
        ((ArrayList) term10341).add((Object)null);
        ((ArrayList) term10341).add((Object)null);
        ((ArrayList) term10341).add((Object)null);
        ((ArrayList) term10341).add((Object)null);
        ((ArrayList) term10341).add((Object)null);
        ((ArrayList) term10341).add((Object)null);
        ((ArrayList) term10341).add((Object)null);
        ((ArrayList) term10341).add((Object)null);
        Object term10339 = newInstance(Class.forName("nn.model.Node"));
        setField(term10339, term10339.getClass(), "type", enum67);
        setIntField(term10339, term10339.getClass(), "innovation", 1017354215);
        setField(term10339, term10339.getClass(), "connections", term10341);
        setDoubleField(term10339, term10339.getClass(), "bias", 0.25927427995958796);
        Class<? extends Object> term10503 = Class.forName((String) "nn.model.Type");
        Field term10502 = ((Class) term10503).getDeclaredField((String) "SENSOR");
        ((Field) term10502).setAccessible(true);
        Object enum68 = ((Field) term10502).get((Object) null);
        ArrayList term10349 = new ArrayList();
        ((ArrayList) term10349).add((Object)null);
        ((ArrayList) term10349).add((Object)null);
        ((ArrayList) term10349).add((Object)null);
        ((ArrayList) term10349).add((Object)null);
        ((ArrayList) term10349).add((Object)null);
        ((ArrayList) term10349).add((Object)null);
        Object term10345 = newInstance(Class.forName("nn.model.Node"));
        setField(term10345, term10345.getClass(), "type", enum68);
        setIntField(term10345, term10345.getClass(), "innovation", -1472700822);
        setField(term10345, term10345.getClass(), "connections", term10349);
        setDoubleField(term10345, term10345.getClass(), "bias", 0.927519742701973);
        ArrayList term10355 = new ArrayList();
        ((ArrayList) term10355).add((Object)null);
        ((ArrayList) term10355).add((Object)null);
        ((ArrayList) term10355).add((Object)null);
        ((ArrayList) term10355).add((Object)null);
        Object term10353 = newInstance(Class.forName("nn.model.Node"));
        setField(term10353, term10353.getClass(), "type", enum67);
        setIntField(term10353, term10353.getClass(), "innovation", 407708341);
        setField(term10353, term10353.getClass(), "connections", term10355);
        setDoubleField(term10353, term10353.getClass(), "bias", 0.8936973138508374);
        Class<? extends Object> term10593 = Class.forName((String) "nn.model.Type");
        Field term10592 = ((Class) term10593).getDeclaredField((String) "HIDDEN");
        ((Field) term10592).setAccessible(true);
        Object enum69 = ((Field) term10592).get((Object) null);
        ArrayList term10363 = new ArrayList();
        ((ArrayList) term10363).add((Object)null);
        ((ArrayList) term10363).add((Object)null);
        ((ArrayList) term10363).add((Object)null);
        ((ArrayList) term10363).add((Object)null);
        ((ArrayList) term10363).add((Object)null);
        Object term10359 = newInstance(Class.forName("nn.model.Node"));
        setField(term10359, term10359.getClass(), "type", enum69);
        setIntField(term10359, term10359.getClass(), "innovation", -287519200);
        setField(term10359, term10359.getClass(), "connections", term10363);
        setDoubleField(term10359, term10359.getClass(), "bias", 0.35525650405457);
        ArrayList term10369 = new ArrayList();
        ((ArrayList) term10369).add((Object)null);
        ((ArrayList) term10369).add((Object)null);
        ((ArrayList) term10369).add((Object)null);
        ((ArrayList) term10369).add((Object)null);
        ((ArrayList) term10369).add((Object)null);
        ((ArrayList) term10369).add((Object)null);
        ((ArrayList) term10369).add((Object)null);
        Object term10367 = newInstance(Class.forName("nn.model.Node"));
        setField(term10367, term10367.getClass(), "type", enum68);
        setIntField(term10367, term10367.getClass(), "innovation", 203264365);
        setField(term10367, term10367.getClass(), "connections", term10369);
        setDoubleField(term10367, term10367.getClass(), "bias", 0.9336280471224291);
        ArrayList term10329 = new ArrayList();
        ((ArrayList) term10329).add(term10331);
        ((ArrayList) term10329).add(term10339);
        ((ArrayList) term10329).add(term10345);
        ((ArrayList) term10329).add(term10353);
        ((ArrayList) term10329).add(term10359);
        ((ArrayList) term10329).add(term10345);
        ((ArrayList) term10329).add(term10367);
        Object term10377 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10377, term10377.getClass(), "in", null);
        setField(term10377, term10377.getClass(), "out", null);
        setFloatField(term10377, term10377.getClass(), "weight", 0.0F);
        setBooleanField(term10377, term10377.getClass(), "expressed", false);
        setIntField(term10377, term10377.getClass(), "innovation", 0);
        Object term10381 = newInstance(Class.forName("nn.model.Connection"));
        Object term10382 = newInstance(Class.forName("nn.model.Node"));
        setField(term10382, term10382.getClass(), "type", enum69);
        setIntField(term10382, term10382.getClass(), "innovation", -2117361140);
        setField(term10382, term10382.getClass(), "connections", null);
        setDoubleField(term10382, term10382.getClass(), "bias", 0.4579502284885265);
        setField(term10381, term10381.getClass(), "in", term10382);
        setField(term10381, term10381.getClass(), "out", term10353);
        setFloatField(term10381, term10381.getClass(), "weight", 0.5124845F);
        setBooleanField(term10381, term10381.getClass(), "expressed", true);
        setIntField(term10381, term10381.getClass(), "innovation", -1413291732);
        Object term10388 = newInstance(Class.forName("nn.model.Connection"));
        Object term10389 = newInstance(Class.forName("nn.model.Node"));
        setField(term10389, term10389.getClass(), "type", enum68);
        setIntField(term10389, term10389.getClass(), "innovation", 1626670889);
        setField(term10389, term10389.getClass(), "connections", null);
        setDoubleField(term10389, term10389.getClass(), "bias", 0.7373458011239485);
        setField(term10388, term10388.getClass(), "in", term10389);
        setField(term10388, term10388.getClass(), "out", term10367);
        setFloatField(term10388, term10388.getClass(), "weight", 0.3114875F);
        setBooleanField(term10388, term10388.getClass(), "expressed", true);
        setIntField(term10388, term10388.getClass(), "innovation", -1066281036);
        Object term10395 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10395, term10395.getClass(), "in", null);
        setField(term10395, term10395.getClass(), "out", null);
        setFloatField(term10395, term10395.getClass(), "weight", 0.0F);
        setBooleanField(term10395, term10395.getClass(), "expressed", false);
        setIntField(term10395, term10395.getClass(), "innovation", 0);
        ArrayList term10375 = new ArrayList();
        ((ArrayList) term10375).add(term10377);
        ((ArrayList) term10375).add(term10381);
        ((ArrayList) term10375).add(term10388);
        ((ArrayList) term10375).add(term10377);
        ((ArrayList) term10375).add(term10395);
        term10328 = newInstance(Class.forName("nn.model.Genome"));
        Object term10401 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10403 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10405 = newInstance(Class.forName("java.util.Random"));
        Object term10406 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10328, term10328.getClass(), "nodes", term10329);
        setField(term10328, term10328.getClass(), "connections", term10375);
        setIntField(term10401, term10401.getClass(), "counter", 100);
        setField(term10328, term10328.getClass(), "nodeInnovator", term10401);
        setIntField(term10403, term10403.getClass(), "counter", 100);
        setField(term10328, term10328.getClass(), "connectionInnovator", term10403);
        setLongField(term10406, term10406.getClass(), "value", 39449755209327L);
        setField(term10405, term10405.getClass(), "seed", term10406);
        setDoubleField(term10405, term10405.getClass(), "nextNextGaussian", 0.9257970053187846);
        setBooleanField(term10405, term10405.getClass(), "haveNextNextGaussian", true);
        setField(term10328, term10328.getClass(), "random", term10405);
        term10410 = new Double(0.9134526610201622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("nn.model.Genome");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term10328;
        args[1] = term10410;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


