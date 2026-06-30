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
     Object term10331;
     Object term10413;

    public FitnessGenome_init_21424561820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10416 = Class.forName((String) "nn.model.Type");
        Field term10415 = ((Class) term10416).getDeclaredField((String) "OUTPUT");
        ((Field) term10415).setAccessible(true);
        Object enum67 = ((Field) term10415).get((Object) null);
        ArrayList term10338 = new ArrayList();
        ((ArrayList) term10338).add((Object)null);
        ((ArrayList) term10338).add((Object)null);
        ((ArrayList) term10338).add((Object)null);
        ((ArrayList) term10338).add((Object)null);
        ((ArrayList) term10338).add((Object)null);
        ((ArrayList) term10338).add((Object)null);
        ((ArrayList) term10338).add((Object)null);
        ((ArrayList) term10338).add((Object)null);
        ((ArrayList) term10338).add((Object)null);
        Object term10334 = newInstance(Class.forName("nn.model.Node"));
        setField(term10334, term10334.getClass(), "type", enum67);
        setIntField(term10334, term10334.getClass(), "innovation", 1268893136);
        setField(term10334, term10334.getClass(), "connections", term10338);
        setDoubleField(term10334, term10334.getClass(), "bias", 0.14499093140326424);
        ArrayList term10344 = new ArrayList();
        ((ArrayList) term10344).add((Object)null);
        ((ArrayList) term10344).add((Object)null);
        ((ArrayList) term10344).add((Object)null);
        ((ArrayList) term10344).add((Object)null);
        ((ArrayList) term10344).add((Object)null);
        ((ArrayList) term10344).add((Object)null);
        ((ArrayList) term10344).add((Object)null);
        ((ArrayList) term10344).add((Object)null);
        Object term10342 = newInstance(Class.forName("nn.model.Node"));
        setField(term10342, term10342.getClass(), "type", enum67);
        setIntField(term10342, term10342.getClass(), "innovation", 1017354215);
        setField(term10342, term10342.getClass(), "connections", term10344);
        setDoubleField(term10342, term10342.getClass(), "bias", 0.25927427995958796);
        Class<? extends Object> term10506 = Class.forName((String) "nn.model.Type");
        Field term10505 = ((Class) term10506).getDeclaredField((String) "SENSOR");
        ((Field) term10505).setAccessible(true);
        Object enum68 = ((Field) term10505).get((Object) null);
        ArrayList term10352 = new ArrayList();
        ((ArrayList) term10352).add((Object)null);
        ((ArrayList) term10352).add((Object)null);
        ((ArrayList) term10352).add((Object)null);
        ((ArrayList) term10352).add((Object)null);
        ((ArrayList) term10352).add((Object)null);
        ((ArrayList) term10352).add((Object)null);
        Object term10348 = newInstance(Class.forName("nn.model.Node"));
        setField(term10348, term10348.getClass(), "type", enum68);
        setIntField(term10348, term10348.getClass(), "innovation", -1472700822);
        setField(term10348, term10348.getClass(), "connections", term10352);
        setDoubleField(term10348, term10348.getClass(), "bias", 0.927519742701973);
        ArrayList term10358 = new ArrayList();
        ((ArrayList) term10358).add((Object)null);
        ((ArrayList) term10358).add((Object)null);
        ((ArrayList) term10358).add((Object)null);
        ((ArrayList) term10358).add((Object)null);
        Object term10356 = newInstance(Class.forName("nn.model.Node"));
        setField(term10356, term10356.getClass(), "type", enum67);
        setIntField(term10356, term10356.getClass(), "innovation", 407708341);
        setField(term10356, term10356.getClass(), "connections", term10358);
        setDoubleField(term10356, term10356.getClass(), "bias", 0.8936973138508374);
        Class<? extends Object> term10596 = Class.forName((String) "nn.model.Type");
        Field term10595 = ((Class) term10596).getDeclaredField((String) "HIDDEN");
        ((Field) term10595).setAccessible(true);
        Object enum69 = ((Field) term10595).get((Object) null);
        ArrayList term10366 = new ArrayList();
        ((ArrayList) term10366).add((Object)null);
        ((ArrayList) term10366).add((Object)null);
        ((ArrayList) term10366).add((Object)null);
        ((ArrayList) term10366).add((Object)null);
        ((ArrayList) term10366).add((Object)null);
        Object term10362 = newInstance(Class.forName("nn.model.Node"));
        setField(term10362, term10362.getClass(), "type", enum69);
        setIntField(term10362, term10362.getClass(), "innovation", -287519200);
        setField(term10362, term10362.getClass(), "connections", term10366);
        setDoubleField(term10362, term10362.getClass(), "bias", 0.35525650405457);
        ArrayList term10372 = new ArrayList();
        ((ArrayList) term10372).add((Object)null);
        ((ArrayList) term10372).add((Object)null);
        ((ArrayList) term10372).add((Object)null);
        ((ArrayList) term10372).add((Object)null);
        ((ArrayList) term10372).add((Object)null);
        ((ArrayList) term10372).add((Object)null);
        ((ArrayList) term10372).add((Object)null);
        Object term10370 = newInstance(Class.forName("nn.model.Node"));
        setField(term10370, term10370.getClass(), "type", enum68);
        setIntField(term10370, term10370.getClass(), "innovation", 203264365);
        setField(term10370, term10370.getClass(), "connections", term10372);
        setDoubleField(term10370, term10370.getClass(), "bias", 0.9336280471224291);
        ArrayList term10332 = new ArrayList();
        ((ArrayList) term10332).add(term10334);
        ((ArrayList) term10332).add(term10342);
        ((ArrayList) term10332).add(term10348);
        ((ArrayList) term10332).add(term10356);
        ((ArrayList) term10332).add(term10362);
        ((ArrayList) term10332).add(term10348);
        ((ArrayList) term10332).add(term10370);
        Object term10380 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10380, term10380.getClass(), "in", null);
        setField(term10380, term10380.getClass(), "out", null);
        setFloatField(term10380, term10380.getClass(), "weight", 0.0F);
        setBooleanField(term10380, term10380.getClass(), "expressed", false);
        setIntField(term10380, term10380.getClass(), "innovation", 0);
        Object term10384 = newInstance(Class.forName("nn.model.Connection"));
        Object term10385 = newInstance(Class.forName("nn.model.Node"));
        setField(term10385, term10385.getClass(), "type", enum69);
        setIntField(term10385, term10385.getClass(), "innovation", -2117361140);
        setField(term10385, term10385.getClass(), "connections", null);
        setDoubleField(term10385, term10385.getClass(), "bias", 0.4579502284885265);
        setField(term10384, term10384.getClass(), "in", term10385);
        setField(term10384, term10384.getClass(), "out", term10356);
        setFloatField(term10384, term10384.getClass(), "weight", 0.5124845F);
        setBooleanField(term10384, term10384.getClass(), "expressed", true);
        setIntField(term10384, term10384.getClass(), "innovation", -1413291732);
        Object term10391 = newInstance(Class.forName("nn.model.Connection"));
        Object term10392 = newInstance(Class.forName("nn.model.Node"));
        setField(term10392, term10392.getClass(), "type", enum68);
        setIntField(term10392, term10392.getClass(), "innovation", 1626670889);
        setField(term10392, term10392.getClass(), "connections", null);
        setDoubleField(term10392, term10392.getClass(), "bias", 0.7373458011239485);
        setField(term10391, term10391.getClass(), "in", term10392);
        setField(term10391, term10391.getClass(), "out", term10370);
        setFloatField(term10391, term10391.getClass(), "weight", 0.3114875F);
        setBooleanField(term10391, term10391.getClass(), "expressed", true);
        setIntField(term10391, term10391.getClass(), "innovation", -1066281036);
        Object term10398 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10398, term10398.getClass(), "in", null);
        setField(term10398, term10398.getClass(), "out", null);
        setFloatField(term10398, term10398.getClass(), "weight", 0.0F);
        setBooleanField(term10398, term10398.getClass(), "expressed", false);
        setIntField(term10398, term10398.getClass(), "innovation", 0);
        ArrayList term10378 = new ArrayList();
        ((ArrayList) term10378).add(term10380);
        ((ArrayList) term10378).add(term10384);
        ((ArrayList) term10378).add(term10391);
        ((ArrayList) term10378).add(term10380);
        ((ArrayList) term10378).add(term10398);
        term10331 = newInstance(Class.forName("nn.model.Genome"));
        Object term10404 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10406 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10408 = newInstance(Class.forName("java.util.Random"));
        Object term10409 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10331, term10331.getClass(), "nodes", term10332);
        setField(term10331, term10331.getClass(), "connections", term10378);
        setIntField(term10404, term10404.getClass(), "counter", 100);
        setField(term10331, term10331.getClass(), "nodeInnovator", term10404);
        setIntField(term10406, term10406.getClass(), "counter", 100);
        setField(term10331, term10331.getClass(), "connectionInnovator", term10406);
        setLongField(term10409, term10409.getClass(), "value", 196435023665675L);
        setField(term10408, term10408.getClass(), "seed", term10409);
        setDoubleField(term10408, term10408.getClass(), "nextNextGaussian", 0.9257970053187846);
        setBooleanField(term10408, term10408.getClass(), "haveNextNextGaussian", true);
        setField(term10331, term10331.getClass(), "random", term10408);
        term10413 = new Double(0.9134526610201622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("nn.model.Genome");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term10331;
        args[1] = term10413;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


