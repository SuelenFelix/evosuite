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
     Object term10316;
     Object term10398;

    public FitnessGenome_init_21424561820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10401 = Class.forName((String) "nn.model.Type");
        Field term10400 = ((Class) term10401).getDeclaredField((String) "OUTPUT");
        ((Field) term10400).setAccessible(true);
        Object enum67 = ((Field) term10400).get((Object) null);
        ArrayList term10323 = new ArrayList();
        ((ArrayList) term10323).add((Object)null);
        ((ArrayList) term10323).add((Object)null);
        ((ArrayList) term10323).add((Object)null);
        ((ArrayList) term10323).add((Object)null);
        ((ArrayList) term10323).add((Object)null);
        ((ArrayList) term10323).add((Object)null);
        ((ArrayList) term10323).add((Object)null);
        ((ArrayList) term10323).add((Object)null);
        ((ArrayList) term10323).add((Object)null);
        Object term10319 = newInstance(Class.forName("nn.model.Node"));
        setField(term10319, term10319.getClass(), "type", enum67);
        setIntField(term10319, term10319.getClass(), "innovation", 1268893136);
        setField(term10319, term10319.getClass(), "connections", term10323);
        setDoubleField(term10319, term10319.getClass(), "bias", 0.14499093140326424);
        ArrayList term10329 = new ArrayList();
        ((ArrayList) term10329).add((Object)null);
        ((ArrayList) term10329).add((Object)null);
        ((ArrayList) term10329).add((Object)null);
        ((ArrayList) term10329).add((Object)null);
        ((ArrayList) term10329).add((Object)null);
        ((ArrayList) term10329).add((Object)null);
        ((ArrayList) term10329).add((Object)null);
        ((ArrayList) term10329).add((Object)null);
        Object term10327 = newInstance(Class.forName("nn.model.Node"));
        setField(term10327, term10327.getClass(), "type", enum67);
        setIntField(term10327, term10327.getClass(), "innovation", 1017354215);
        setField(term10327, term10327.getClass(), "connections", term10329);
        setDoubleField(term10327, term10327.getClass(), "bias", 0.25927427995958796);
        Class<? extends Object> term10491 = Class.forName((String) "nn.model.Type");
        Field term10490 = ((Class) term10491).getDeclaredField((String) "SENSOR");
        ((Field) term10490).setAccessible(true);
        Object enum68 = ((Field) term10490).get((Object) null);
        ArrayList term10337 = new ArrayList();
        ((ArrayList) term10337).add((Object)null);
        ((ArrayList) term10337).add((Object)null);
        ((ArrayList) term10337).add((Object)null);
        ((ArrayList) term10337).add((Object)null);
        ((ArrayList) term10337).add((Object)null);
        ((ArrayList) term10337).add((Object)null);
        Object term10333 = newInstance(Class.forName("nn.model.Node"));
        setField(term10333, term10333.getClass(), "type", enum68);
        setIntField(term10333, term10333.getClass(), "innovation", -1472700822);
        setField(term10333, term10333.getClass(), "connections", term10337);
        setDoubleField(term10333, term10333.getClass(), "bias", 0.927519742701973);
        ArrayList term10343 = new ArrayList();
        ((ArrayList) term10343).add((Object)null);
        ((ArrayList) term10343).add((Object)null);
        ((ArrayList) term10343).add((Object)null);
        ((ArrayList) term10343).add((Object)null);
        Object term10341 = newInstance(Class.forName("nn.model.Node"));
        setField(term10341, term10341.getClass(), "type", enum67);
        setIntField(term10341, term10341.getClass(), "innovation", 407708341);
        setField(term10341, term10341.getClass(), "connections", term10343);
        setDoubleField(term10341, term10341.getClass(), "bias", 0.8936973138508374);
        Class<? extends Object> term10581 = Class.forName((String) "nn.model.Type");
        Field term10580 = ((Class) term10581).getDeclaredField((String) "HIDDEN");
        ((Field) term10580).setAccessible(true);
        Object enum69 = ((Field) term10580).get((Object) null);
        ArrayList term10351 = new ArrayList();
        ((ArrayList) term10351).add((Object)null);
        ((ArrayList) term10351).add((Object)null);
        ((ArrayList) term10351).add((Object)null);
        ((ArrayList) term10351).add((Object)null);
        ((ArrayList) term10351).add((Object)null);
        Object term10347 = newInstance(Class.forName("nn.model.Node"));
        setField(term10347, term10347.getClass(), "type", enum69);
        setIntField(term10347, term10347.getClass(), "innovation", -287519200);
        setField(term10347, term10347.getClass(), "connections", term10351);
        setDoubleField(term10347, term10347.getClass(), "bias", 0.35525650405457);
        ArrayList term10357 = new ArrayList();
        ((ArrayList) term10357).add((Object)null);
        ((ArrayList) term10357).add((Object)null);
        ((ArrayList) term10357).add((Object)null);
        ((ArrayList) term10357).add((Object)null);
        ((ArrayList) term10357).add((Object)null);
        ((ArrayList) term10357).add((Object)null);
        ((ArrayList) term10357).add((Object)null);
        Object term10355 = newInstance(Class.forName("nn.model.Node"));
        setField(term10355, term10355.getClass(), "type", enum68);
        setIntField(term10355, term10355.getClass(), "innovation", 203264365);
        setField(term10355, term10355.getClass(), "connections", term10357);
        setDoubleField(term10355, term10355.getClass(), "bias", 0.9336280471224291);
        ArrayList term10317 = new ArrayList();
        ((ArrayList) term10317).add(term10319);
        ((ArrayList) term10317).add(term10327);
        ((ArrayList) term10317).add(term10333);
        ((ArrayList) term10317).add(term10341);
        ((ArrayList) term10317).add(term10347);
        ((ArrayList) term10317).add(term10333);
        ((ArrayList) term10317).add(term10355);
        Object term10365 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10365, term10365.getClass(), "in", null);
        setField(term10365, term10365.getClass(), "out", null);
        setFloatField(term10365, term10365.getClass(), "weight", 0.0F);
        setBooleanField(term10365, term10365.getClass(), "expressed", false);
        setIntField(term10365, term10365.getClass(), "innovation", 0);
        Object term10369 = newInstance(Class.forName("nn.model.Connection"));
        Object term10370 = newInstance(Class.forName("nn.model.Node"));
        setField(term10370, term10370.getClass(), "type", enum69);
        setIntField(term10370, term10370.getClass(), "innovation", -2117361140);
        setField(term10370, term10370.getClass(), "connections", null);
        setDoubleField(term10370, term10370.getClass(), "bias", 0.4579502284885265);
        setField(term10369, term10369.getClass(), "in", term10370);
        setField(term10369, term10369.getClass(), "out", term10341);
        setFloatField(term10369, term10369.getClass(), "weight", 0.5124845F);
        setBooleanField(term10369, term10369.getClass(), "expressed", true);
        setIntField(term10369, term10369.getClass(), "innovation", -1413291732);
        Object term10376 = newInstance(Class.forName("nn.model.Connection"));
        Object term10377 = newInstance(Class.forName("nn.model.Node"));
        setField(term10377, term10377.getClass(), "type", enum68);
        setIntField(term10377, term10377.getClass(), "innovation", 1626670889);
        setField(term10377, term10377.getClass(), "connections", null);
        setDoubleField(term10377, term10377.getClass(), "bias", 0.7373458011239485);
        setField(term10376, term10376.getClass(), "in", term10377);
        setField(term10376, term10376.getClass(), "out", term10355);
        setFloatField(term10376, term10376.getClass(), "weight", 0.3114875F);
        setBooleanField(term10376, term10376.getClass(), "expressed", true);
        setIntField(term10376, term10376.getClass(), "innovation", -1066281036);
        Object term10383 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10383, term10383.getClass(), "in", null);
        setField(term10383, term10383.getClass(), "out", null);
        setFloatField(term10383, term10383.getClass(), "weight", 0.0F);
        setBooleanField(term10383, term10383.getClass(), "expressed", false);
        setIntField(term10383, term10383.getClass(), "innovation", 0);
        ArrayList term10363 = new ArrayList();
        ((ArrayList) term10363).add(term10365);
        ((ArrayList) term10363).add(term10369);
        ((ArrayList) term10363).add(term10376);
        ((ArrayList) term10363).add(term10365);
        ((ArrayList) term10363).add(term10383);
        term10316 = newInstance(Class.forName("nn.model.Genome"));
        Object term10389 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10391 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10393 = newInstance(Class.forName("java.util.Random"));
        Object term10394 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10316, term10316.getClass(), "nodes", term10317);
        setField(term10316, term10316.getClass(), "connections", term10363);
        setIntField(term10389, term10389.getClass(), "counter", 100);
        setField(term10316, term10316.getClass(), "nodeInnovator", term10389);
        setIntField(term10391, term10391.getClass(), "counter", 100);
        setField(term10316, term10316.getClass(), "connectionInnovator", term10391);
        setLongField(term10394, term10394.getClass(), "value", 42800631609057L);
        setField(term10393, term10393.getClass(), "seed", term10394);
        setDoubleField(term10393, term10393.getClass(), "nextNextGaussian", 0.9257970053187846);
        setBooleanField(term10393, term10393.getClass(), "haveNextNextGaussian", true);
        setField(term10316, term10316.getClass(), "random", term10393);
        term10398 = new Double(0.9134526610201622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("nn.model.Genome");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term10316;
        args[1] = term10398;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


