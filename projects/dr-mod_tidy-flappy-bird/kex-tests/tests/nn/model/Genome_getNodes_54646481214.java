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

public class Genome_getNodes_54646481214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7808;

    public Genome_getNodes_54646481214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7875 = Class.forName((String) "nn.model.Type");
        Field term7874 = ((Class) term7875).getDeclaredField((String) "SENSOR");
        ((Field) term7874).setAccessible(true);
        Object enum47 = ((Field) term7874).get((Object) null);
        ArrayList term7815 = new ArrayList();
        ((ArrayList) term7815).add((Object)null);
        Object term7811 = newInstance(Class.forName("nn.model.Node"));
        setField(term7811, term7811.getClass(), "type", enum47);
        setIntField(term7811, term7811.getClass(), "innovation", -600102466);
        setField(term7811, term7811.getClass(), "connections", term7815);
        setDoubleField(term7811, term7811.getClass(), "bias", 0.39653472969283077);
        Class<? extends Object> term7965 = Class.forName((String) "nn.model.Type");
        Field term7964 = ((Class) term7965).getDeclaredField((String) "SENSOR");
        ((Field) term7964).setAccessible(true);
        Object enum48 = ((Field) term7964).get((Object) null);
        ArrayList term7823 = new ArrayList();
        ((ArrayList) term7823).add((Object)null);
        ((ArrayList) term7823).add((Object)null);
        ((ArrayList) term7823).add((Object)null);
        Object term7819 = newInstance(Class.forName("nn.model.Node"));
        setField(term7819, term7819.getClass(), "type", enum48);
        setIntField(term7819, term7819.getClass(), "innovation", 1943019963);
        setField(term7819, term7819.getClass(), "connections", term7823);
        setDoubleField(term7819, term7819.getClass(), "bias", 0.15055062571842626);
        ArrayList term7829 = new ArrayList();
        ((ArrayList) term7829).add((Object)null);
        ((ArrayList) term7829).add((Object)null);
        ((ArrayList) term7829).add((Object)null);
        ((ArrayList) term7829).add((Object)null);
        ((ArrayList) term7829).add((Object)null);
        ((ArrayList) term7829).add((Object)null);
        ((ArrayList) term7829).add((Object)null);
        Object term7827 = newInstance(Class.forName("nn.model.Node"));
        setField(term7827, term7827.getClass(), "type", enum47);
        setIntField(term7827, term7827.getClass(), "innovation", -37129068);
        setField(term7827, term7827.getClass(), "connections", term7829);
        setDoubleField(term7827, term7827.getClass(), "bias", 0.6665364546645218);
        Class<? extends Object> term8055 = Class.forName((String) "nn.model.Type");
        Field term8054 = ((Class) term8055).getDeclaredField((String) "SENSOR");
        ((Field) term8054).setAccessible(true);
        Object enum49 = ((Field) term8054).get((Object) null);
        ArrayList term7837 = new ArrayList();
        ((ArrayList) term7837).add((Object)null);
        ((ArrayList) term7837).add((Object)null);
        ((ArrayList) term7837).add((Object)null);
        ((ArrayList) term7837).add((Object)null);
        ((ArrayList) term7837).add((Object)null);
        ((ArrayList) term7837).add((Object)null);
        Object term7833 = newInstance(Class.forName("nn.model.Node"));
        setField(term7833, term7833.getClass(), "type", enum49);
        setIntField(term7833, term7833.getClass(), "innovation", -899986714);
        setField(term7833, term7833.getClass(), "connections", term7837);
        setDoubleField(term7833, term7833.getClass(), "bias", 0.059611302990266846);
        ArrayList term7843 = new ArrayList();
        ((ArrayList) term7843).add((Object)null);
        ((ArrayList) term7843).add((Object)null);
        ((ArrayList) term7843).add((Object)null);
        Object term7841 = newInstance(Class.forName("nn.model.Node"));
        setField(term7841, term7841.getClass(), "type", enum49);
        setIntField(term7841, term7841.getClass(), "innovation", -1261824381);
        setField(term7841, term7841.getClass(), "connections", term7843);
        setDoubleField(term7841, term7841.getClass(), "bias", 0.2698328402687743);
        ArrayList term7849 = new ArrayList();
        ((ArrayList) term7849).add((Object)null);
        ((ArrayList) term7849).add((Object)null);
        ((ArrayList) term7849).add((Object)null);
        ((ArrayList) term7849).add((Object)null);
        ((ArrayList) term7849).add((Object)null);
        ((ArrayList) term7849).add((Object)null);
        Object term7847 = newInstance(Class.forName("nn.model.Node"));
        setField(term7847, term7847.getClass(), "type", enum47);
        setIntField(term7847, term7847.getClass(), "innovation", -861014847);
        setField(term7847, term7847.getClass(), "connections", term7849);
        setDoubleField(term7847, term7847.getClass(), "bias", 0.6965590169168311);
        ArrayList term7855 = new ArrayList();
        ((ArrayList) term7855).add((Object)null);
        ((ArrayList) term7855).add((Object)null);
        Object term7853 = newInstance(Class.forName("nn.model.Node"));
        setField(term7853, term7853.getClass(), "type", enum47);
        setIntField(term7853, term7853.getClass(), "innovation", -1541566235);
        setField(term7853, term7853.getClass(), "connections", term7855);
        setDoubleField(term7853, term7853.getClass(), "bias", 0.29225699525915894);
        ArrayList term7809 = new ArrayList();
        ((ArrayList) term7809).add(term7811);
        ((ArrayList) term7809).add(term7819);
        ((ArrayList) term7809).add(term7827);
        ((ArrayList) term7809).add(term7833);
        ((ArrayList) term7809).add(term7841);
        ((ArrayList) term7809).add(term7847);
        ((ArrayList) term7809).add(term7853);
        ((ArrayList) term7809).add(term7819);
        ArrayList term7861 = new ArrayList();
        term7808 = newInstance(Class.forName("nn.model.Genome"));
        Object term7865 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term7867 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term7869 = newInstance(Class.forName("java.util.Random"));
        Object term7870 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term7808, term7808.getClass(), "nodes", term7809);
        setField(term7808, term7808.getClass(), "connections", term7861);
        setIntField(term7865, term7865.getClass(), "counter", 100);
        setField(term7808, term7808.getClass(), "nodeInnovator", term7865);
        setIntField(term7867, term7867.getClass(), "counter", 100);
        setField(term7808, term7808.getClass(), "connectionInnovator", term7867);
        setLongField(term7870, term7870.getClass(), "value", 247819867501386L);
        setField(term7869, term7869.getClass(), "seed", term7870);
        setDoubleField(term7869, term7869.getClass(), "nextNextGaussian", 0.2849157687292415);
        setBooleanField(term7869, term7869.getClass(), "haveNextNextGaussian", true);
        setField(term7808, term7808.getClass(), "random", term7869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNodes", argTypes, term7808, args);
    }

};


