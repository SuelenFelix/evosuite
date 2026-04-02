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

public class Mating_crossover_11879603481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1445;
     Object term1455;
     Object term1498;

    public Mating_crossover_11879603481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1445 = newInstance(Class.forName("nn.actions.Mating"));
        Object term1446 = newInstance(Class.forName("java.util.Random"));
        Object term1447 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term1451 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term1453 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        setLongField(term1447, term1447.getClass(), "value", 230911243808583L);
        setField(term1446, term1446.getClass(), "seed", term1447);
        setDoubleField(term1446, term1446.getClass(), "nextNextGaussian", 0.9022041121474429);
        setBooleanField(term1446, term1446.getClass(), "haveNextNextGaussian", true);
        setField(term1445, term1445.getClass(), "random", term1446);
        setIntField(term1451, term1451.getClass(), "counter", 100);
        setField(term1445, term1445.getClass(), "nodeInnovator", term1451);
        setIntField(term1453, term1453.getClass(), "counter", 100);
        setField(term1445, term1445.getClass(), "connectionInnovator", term1453);
        Object term1459 = newInstance(Class.forName("nn.model.Node"));
        setField(term1459, term1459.getClass(), "type", null);
        setIntField(term1459, term1459.getClass(), "innovation", -420030135);
        setField(term1459, term1459.getClass(), "connections", null);
        setDoubleField(term1459, term1459.getClass(), "bias", 0.40598298281353484);
        Object term1462 = newInstance(Class.forName("nn.model.Node"));
        setField(term1462, term1462.getClass(), "type", null);
        setIntField(term1462, term1462.getClass(), "innovation", 0);
        setField(term1462, term1462.getClass(), "connections", null);
        setDoubleField(term1462, term1462.getClass(), "bias", 0.0);
        Object term1465 = newInstance(Class.forName("nn.model.Node"));
        setField(term1465, term1465.getClass(), "type", null);
        setIntField(term1465, term1465.getClass(), "innovation", 267763294);
        setField(term1465, term1465.getClass(), "connections", null);
        setDoubleField(term1465, term1465.getClass(), "bias", 0.008025683154629148);
        Object term1468 = newInstance(Class.forName("nn.model.Node"));
        setField(term1468, term1468.getClass(), "type", null);
        setIntField(term1468, term1468.getClass(), "innovation", 0);
        setField(term1468, term1468.getClass(), "connections", null);
        setDoubleField(term1468, term1468.getClass(), "bias", 0.0);
        Object term1471 = newInstance(Class.forName("nn.model.Node"));
        setField(term1471, term1471.getClass(), "type", null);
        setIntField(term1471, term1471.getClass(), "innovation", 0);
        setField(term1471, term1471.getClass(), "connections", null);
        setDoubleField(term1471, term1471.getClass(), "bias", 0.0);
        ArrayList term1457 = new ArrayList();
        ((ArrayList) term1457).add(term1459);
        ((ArrayList) term1457).add(term1462);
        ((ArrayList) term1457).add(term1465);
        ((ArrayList) term1457).add(term1468);
        ((ArrayList) term1457).add(term1468);
        ((ArrayList) term1457).add(term1471);
        Object term1478 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1478, term1478.getClass(), "in", null);
        setField(term1478, term1478.getClass(), "out", null);
        setFloatField(term1478, term1478.getClass(), "weight", 0.016575277F);
        setBooleanField(term1478, term1478.getClass(), "expressed", true);
        setIntField(term1478, term1478.getClass(), "innovation", 515182546);
        Object term1482 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1482, term1482.getClass(), "in", null);
        setField(term1482, term1482.getClass(), "out", null);
        setFloatField(term1482, term1482.getClass(), "weight", 0.025133014F);
        setBooleanField(term1482, term1482.getClass(), "expressed", false);
        setIntField(term1482, term1482.getClass(), "innovation", -945116798);
        ArrayList term1476 = new ArrayList();
        ((ArrayList) term1476).add(term1478);
        ((ArrayList) term1476).add(term1482);
        term1455 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term1456 = newInstance(Class.forName("nn.model.Genome"));
        Object term1488 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term1490 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term1492 = newInstance(Class.forName("java.util.Random"));
        Object term1493 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term1456, term1456.getClass(), "nodes", term1457);
        setField(term1456, term1456.getClass(), "connections", term1476);
        setIntField(term1488, term1488.getClass(), "counter", 100);
        setField(term1456, term1456.getClass(), "nodeInnovator", term1488);
        setIntField(term1490, term1490.getClass(), "counter", 100);
        setField(term1456, term1456.getClass(), "connectionInnovator", term1490);
        setLongField(term1493, term1493.getClass(), "value", 148664430262451L);
        setField(term1492, term1492.getClass(), "seed", term1493);
        setDoubleField(term1492, term1492.getClass(), "nextNextGaussian", 0.3710067290060264);
        setBooleanField(term1492, term1492.getClass(), "haveNextNextGaussian", false);
        setField(term1456, term1456.getClass(), "random", term1492);
        setField(term1455, term1455.getClass(), "genome", term1456);
        setDoubleField(term1455, term1455.getClass(), "fitness", 0.7818620200430967);
        Object term1502 = newInstance(Class.forName("nn.model.Node"));
        setField(term1502, term1502.getClass(), "type", null);
        setIntField(term1502, term1502.getClass(), "innovation", 199287428);
        setField(term1502, term1502.getClass(), "connections", null);
        setDoubleField(term1502, term1502.getClass(), "bias", 0.4772043271031934);
        Object term1505 = newInstance(Class.forName("nn.model.Node"));
        setField(term1505, term1505.getClass(), "type", null);
        setIntField(term1505, term1505.getClass(), "innovation", -376422566);
        setField(term1505, term1505.getClass(), "connections", null);
        setDoubleField(term1505, term1505.getClass(), "bias", 0.9123572866833729);
        Object term1508 = newInstance(Class.forName("nn.model.Node"));
        setField(term1508, term1508.getClass(), "type", null);
        setIntField(term1508, term1508.getClass(), "innovation", 0);
        setField(term1508, term1508.getClass(), "connections", null);
        setDoubleField(term1508, term1508.getClass(), "bias", 0.0);
        Object term1511 = newInstance(Class.forName("nn.model.Node"));
        setField(term1511, term1511.getClass(), "type", null);
        setIntField(term1511, term1511.getClass(), "innovation", 0);
        setField(term1511, term1511.getClass(), "connections", null);
        setDoubleField(term1511, term1511.getClass(), "bias", 0.0);
        Object term1514 = newInstance(Class.forName("nn.model.Node"));
        setField(term1514, term1514.getClass(), "type", null);
        setIntField(term1514, term1514.getClass(), "innovation", 0);
        setField(term1514, term1514.getClass(), "connections", null);
        setDoubleField(term1514, term1514.getClass(), "bias", 0.0);
        ArrayList term1500 = new ArrayList();
        ((ArrayList) term1500).add(term1502);
        ((ArrayList) term1500).add(term1505);
        ((ArrayList) term1500).add(term1508);
        ((ArrayList) term1500).add(term1511);
        ((ArrayList) term1500).add(term1514);
        ((ArrayList) term1500).add(term1514);
        Object term1521 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1521, term1521.getClass(), "in", term1508);
        setField(term1521, term1521.getClass(), "out", null);
        setFloatField(term1521, term1521.getClass(), "weight", 0.5195638F);
        setBooleanField(term1521, term1521.getClass(), "expressed", true);
        setIntField(term1521, term1521.getClass(), "innovation", 1745276158);
        Object term1525 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1525, term1525.getClass(), "in", null);
        setField(term1525, term1525.getClass(), "out", term1511);
        setFloatField(term1525, term1525.getClass(), "weight", 0.71547955F);
        setBooleanField(term1525, term1525.getClass(), "expressed", false);
        setIntField(term1525, term1525.getClass(), "innovation", 2009020256);
        ArrayList term1519 = new ArrayList();
        ((ArrayList) term1519).add(term1521);
        ((ArrayList) term1519).add(term1525);
        ((ArrayList) term1519).add(term1525);
        term1498 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term1499 = newInstance(Class.forName("nn.model.Genome"));
        Object term1531 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term1533 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term1535 = newInstance(Class.forName("java.util.Random"));
        Object term1536 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term1499, term1499.getClass(), "nodes", term1500);
        setField(term1499, term1499.getClass(), "connections", term1519);
        setIntField(term1531, term1531.getClass(), "counter", 100);
        setField(term1499, term1499.getClass(), "nodeInnovator", term1531);
        setIntField(term1533, term1533.getClass(), "counter", 100);
        setField(term1499, term1499.getClass(), "connectionInnovator", term1533);
        setLongField(term1536, term1536.getClass(), "value", 74866711604233L);
        setField(term1535, term1535.getClass(), "seed", term1536);
        setDoubleField(term1535, term1535.getClass(), "nextNextGaussian", 0.2446504549754045);
        setBooleanField(term1535, term1535.getClass(), "haveNextNextGaussian", true);
        setField(term1499, term1499.getClass(), "random", term1535);
        setField(term1498, term1498.getClass(), "genome", term1499);
        setDoubleField(term1498, term1498.getClass(), "fitness", 0.6142723998707854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.Mating");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("nn.model.FitnessGenome");
        argTypes[1] = Class.forName("nn.model.FitnessGenome");
        Object[] args = new Object[2];
        args[0] = term1455;
        args[1] = term1498;
        callMethod(klass, "crossover", argTypes, term1445, args);
    }

};


