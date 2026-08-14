package nn.actions;

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
import static nn.actions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.String;
import java.lang.Boolean;

public class Mating_addNodesAndConnections_6399831375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2378;
     Object term2388;
     Object term2433;
     Object term2527;
     Object term2557;

    public Mating_addNodesAndConnections_6399831375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2378 = newInstance(Class.forName("nn.actions.Mating"));
        Object term2379 = newInstance(Class.forName("java.util.Random"));
        Object term2380 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term2384 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term2386 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        setLongField(term2380, term2380.getClass(), "value", 156676807913307L);
        setField(term2379, term2379.getClass(), "seed", term2380);
        setDoubleField(term2379, term2379.getClass(), "nextNextGaussian", 0.17829386444171214);
        setBooleanField(term2379, term2379.getClass(), "haveNextNextGaussian", false);
        setField(term2378, term2378.getClass(), "random", term2379);
        setIntField(term2384, term2384.getClass(), "counter", 100);
        setField(term2378, term2378.getClass(), "nodeInnovator", term2384);
        setIntField(term2386, term2386.getClass(), "counter", 100);
        setField(term2378, term2378.getClass(), "connectionInnovator", term2386);
        ArrayList term2389 = new ArrayList();
        Object term2395 = newInstance(Class.forName("nn.model.Connection"));
        Object term2396 = newInstance(Class.forName("nn.model.Node"));
        Object term2399 = newInstance(Class.forName("nn.model.Node"));
        setField(term2396, term2396.getClass(), "type", null);
        setIntField(term2396, term2396.getClass(), "innovation", 1723148410);
        setField(term2396, term2396.getClass(), "connections", null);
        setDoubleField(term2396, term2396.getClass(), "bias", 0.58265008665336);
        setField(term2395, term2395.getClass(), "in", term2396);
        setField(term2399, term2399.getClass(), "type", null);
        setIntField(term2399, term2399.getClass(), "innovation", 0);
        setField(term2399, term2399.getClass(), "connections", null);
        setDoubleField(term2399, term2399.getClass(), "bias", 0.0);
        setField(term2395, term2395.getClass(), "out", term2399);
        setFloatField(term2395, term2395.getClass(), "weight", 0.96286476F);
        setBooleanField(term2395, term2395.getClass(), "expressed", true);
        setIntField(term2395, term2395.getClass(), "innovation", -1792504217);
        Object term2405 = newInstance(Class.forName("nn.model.Connection"));
        Object term2406 = newInstance(Class.forName("nn.model.Node"));
        Object term2409 = newInstance(Class.forName("nn.model.Node"));
        setField(term2406, term2406.getClass(), "type", null);
        setIntField(term2406, term2406.getClass(), "innovation", 0);
        setField(term2406, term2406.getClass(), "connections", null);
        setDoubleField(term2406, term2406.getClass(), "bias", 0.0);
        setField(term2405, term2405.getClass(), "in", term2406);
        setField(term2409, term2409.getClass(), "type", null);
        setIntField(term2409, term2409.getClass(), "innovation", 0);
        setField(term2409, term2409.getClass(), "connections", null);
        setDoubleField(term2409, term2409.getClass(), "bias", 0.0);
        setField(term2405, term2405.getClass(), "out", term2409);
        setFloatField(term2405, term2405.getClass(), "weight", 0.78659093F);
        setBooleanField(term2405, term2405.getClass(), "expressed", true);
        setIntField(term2405, term2405.getClass(), "innovation", -1941343035);
        Object term2415 = newInstance(Class.forName("nn.model.Connection"));
        Object term2416 = newInstance(Class.forName("nn.model.Node"));
        setField(term2416, term2416.getClass(), "type", null);
        setIntField(term2416, term2416.getClass(), "innovation", -920797484);
        setField(term2416, term2416.getClass(), "connections", null);
        setDoubleField(term2416, term2416.getClass(), "bias", 0.0100718646868041);
        setField(term2415, term2415.getClass(), "in", term2416);
        setField(term2415, term2415.getClass(), "out", term2416);
        setFloatField(term2415, term2415.getClass(), "weight", 0.20511848F);
        setBooleanField(term2415, term2415.getClass(), "expressed", true);
        setIntField(term2415, term2415.getClass(), "innovation", -1748391876);
        ArrayList term2393 = new ArrayList();
        ((ArrayList) term2393).add(term2395);
        ((ArrayList) term2393).add(term2405);
        ((ArrayList) term2393).add(term2415);
        term2388 = newInstance(Class.forName("nn.model.Genome"));
        Object term2424 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term2426 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term2428 = newInstance(Class.forName("java.util.Random"));
        Object term2429 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term2388, term2388.getClass(), "nodes", term2389);
        setField(term2388, term2388.getClass(), "connections", term2393);
        setIntField(term2424, term2424.getClass(), "counter", 100);
        setField(term2388, term2388.getClass(), "nodeInnovator", term2424);
        setIntField(term2426, term2426.getClass(), "counter", 100);
        setField(term2388, term2388.getClass(), "connectionInnovator", term2426);
        setLongField(term2429, term2429.getClass(), "value", 91623202764209L);
        setField(term2428, term2428.getClass(), "seed", term2429);
        setDoubleField(term2428, term2428.getClass(), "nextNextGaussian", 0.1163034938203874);
        setBooleanField(term2428, term2428.getClass(), "haveNextNextGaussian", true);
        setField(term2388, term2388.getClass(), "random", term2428);
        term2433 = new LinkedHashMap();
        Class<? extends Object> term2560 = Class.forName((String) "nn.model.Type");
        Field term2559 = ((Class) term2560).getDeclaredField((String) "SENSOR");
        ((Field) term2559).setAccessible(true);
        Object enum12 = ((Field) term2559).get((Object) null);
        ArrayList term2530 = new ArrayList();
        Object term2539 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2539, term2539.getClass(), "in", null);
        setField(term2539, term2539.getClass(), "out", null);
        setFloatField(term2539, term2539.getClass(), "weight", 0.18330246F);
        setBooleanField(term2539, term2539.getClass(), "expressed", false);
        setIntField(term2539, term2539.getClass(), "innovation", 808614267);
        Object term2543 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2543, term2543.getClass(), "in", null);
        setField(term2543, term2543.getClass(), "out", null);
        setFloatField(term2543, term2543.getClass(), "weight", 0.0F);
        setBooleanField(term2543, term2543.getClass(), "expressed", false);
        setIntField(term2543, term2543.getClass(), "innovation", 0);
        Object term2547 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2547, term2547.getClass(), "in", null);
        setField(term2547, term2547.getClass(), "out", null);
        setFloatField(term2547, term2547.getClass(), "weight", 0.0F);
        setBooleanField(term2547, term2547.getClass(), "expressed", false);
        setIntField(term2547, term2547.getClass(), "innovation", 0);
        ArrayList term2537 = new ArrayList();
        ((ArrayList) term2537).add(term2539);
        ((ArrayList) term2537).add(term2543);
        ((ArrayList) term2537).add(term2547);
        term2527 = newInstance(Class.forName("nn.model.Connection"));
        Object term2528 = newInstance(Class.forName("nn.model.Node"));
        Object term2535 = newInstance(Class.forName("nn.model.Node"));
        setField(term2528, term2528.getClass(), "type", enum12);
        setIntField(term2528, term2528.getClass(), "innovation", -1608123016);
        setField(term2528, term2528.getClass(), "connections", term2530);
        setDoubleField(term2528, term2528.getClass(), "bias", 0.8046904246652031);
        setField(term2527, term2527.getClass(), "in", term2528);
        setField(term2535, term2535.getClass(), "type", enum12);
        setIntField(term2535, term2535.getClass(), "innovation", -896473214);
        setField(term2535, term2535.getClass(), "connections", term2537);
        setDoubleField(term2535, term2535.getClass(), "bias", 0.3142783864669928);
        setField(term2527, term2527.getClass(), "out", term2535);
        setFloatField(term2527, term2527.getClass(), "weight", 0.51947397F);
        setBooleanField(term2527, term2527.getClass(), "expressed", true);
        setIntField(term2527, term2527.getClass(), "innovation", 1611734632);
        term2557 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.Mating");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("nn.model.Genome");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("nn.model.Connection");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term2388;
        args[1] = term2433;
        args[2] = term2527;
        args[3] = term2557;
        callMethod(klass, "addNodesAndConnections", argTypes, term2378, args);
    }

};


