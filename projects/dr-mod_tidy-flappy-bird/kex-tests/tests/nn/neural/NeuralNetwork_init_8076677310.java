package nn.neural;

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
import static nn.neural.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class NeuralNetwork_init_8076677310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430;

    public NeuralNetwork_init_8076677310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term520 = Class.forName((String) "nn.model.Type");
        Field term519 = ((Class) term520).getDeclaredField((String) "OUTPUT");
        ((Field) term519).setAccessible(true);
        Object enum3 = ((Field) term519).get((Object) null);
        ArrayList term437 = new ArrayList();
        ((ArrayList) term437).add((Object)null);
        ((ArrayList) term437).add((Object)null);
        ((ArrayList) term437).add((Object)null);
        ((ArrayList) term437).add((Object)null);
        ((ArrayList) term437).add((Object)null);
        Object term433 = newInstance(Class.forName("nn.model.Node"));
        setField(term433, term433.getClass(), "type", enum3);
        setIntField(term433, term433.getClass(), "innovation", -1179120542);
        setField(term433, term433.getClass(), "connections", term437);
        setDoubleField(term433, term433.getClass(), "bias", 0.4569171842750229);
        ArrayList term443 = new ArrayList();
        Object term441 = newInstance(Class.forName("nn.model.Node"));
        setField(term441, term441.getClass(), "type", enum3);
        setIntField(term441, term441.getClass(), "innovation", -1087774327);
        setField(term441, term441.getClass(), "connections", term443);
        setDoubleField(term441, term441.getClass(), "bias", 0.5183269973490326);
        Class<? extends Object> term610 = Class.forName((String) "nn.model.Type");
        Field term609 = ((Class) term610).getDeclaredField((String) "OUTPUT");
        ((Field) term609).setAccessible(true);
        Object enum4 = ((Field) term609).get((Object) null);
        ArrayList term451 = new ArrayList();
        ((ArrayList) term451).add((Object)null);
        ((ArrayList) term451).add((Object)null);
        Object term447 = newInstance(Class.forName("nn.model.Node"));
        setField(term447, term447.getClass(), "type", enum4);
        setIntField(term447, term447.getClass(), "innovation", -73683645);
        setField(term447, term447.getClass(), "connections", term451);
        setDoubleField(term447, term447.getClass(), "bias", 0.7332741045694002);
        ArrayList term457 = new ArrayList();
        ((ArrayList) term457).add((Object)null);
        ((ArrayList) term457).add((Object)null);
        ((ArrayList) term457).add((Object)null);
        ((ArrayList) term457).add((Object)null);
        ((ArrayList) term457).add((Object)null);
        ((ArrayList) term457).add((Object)null);
        ((ArrayList) term457).add((Object)null);
        ((ArrayList) term457).add((Object)null);
        Object term455 = newInstance(Class.forName("nn.model.Node"));
        setField(term455, term455.getClass(), "type", enum4);
        setIntField(term455, term455.getClass(), "innovation", -1145578966);
        setField(term455, term455.getClass(), "connections", term457);
        setDoubleField(term455, term455.getClass(), "bias", 0.9828442029246764);
        ArrayList term431 = new ArrayList();
        ((ArrayList) term431).add(term433);
        ((ArrayList) term431).add(term441);
        ((ArrayList) term431).add(term447);
        ((ArrayList) term431).add(term455);
        ((ArrayList) term431).add(term455);
        Object term465 = newInstance(Class.forName("nn.model.Connection"));
        setField(term465, term465.getClass(), "in", null);
        setField(term465, term465.getClass(), "out", null);
        setFloatField(term465, term465.getClass(), "weight", 0.0F);
        setBooleanField(term465, term465.getClass(), "expressed", false);
        setIntField(term465, term465.getClass(), "innovation", 0);
        Object term469 = newInstance(Class.forName("nn.model.Connection"));
        setField(term469, term469.getClass(), "in", null);
        setField(term469, term469.getClass(), "out", null);
        setFloatField(term469, term469.getClass(), "weight", 0.0F);
        setBooleanField(term469, term469.getClass(), "expressed", false);
        setIntField(term469, term469.getClass(), "innovation", 0);
        Object term473 = newInstance(Class.forName("nn.model.Connection"));
        Object term474 = newInstance(Class.forName("nn.model.Node"));
        setField(term474, term474.getClass(), "type", enum3);
        setIntField(term474, term474.getClass(), "innovation", 1193880199);
        setField(term474, term474.getClass(), "connections", null);
        setDoubleField(term474, term474.getClass(), "bias", 0.1374549299694151);
        setField(term473, term473.getClass(), "in", term474);
        setField(term473, term473.getClass(), "out", term455);
        setFloatField(term473, term473.getClass(), "weight", 0.51832694F);
        setBooleanField(term473, term473.getClass(), "expressed", true);
        setIntField(term473, term473.getClass(), "innovation", -602026508);
        Object term480 = newInstance(Class.forName("nn.model.Connection"));
        Object term481 = newInstance(Class.forName("nn.model.Node"));
        Object term484 = newInstance(Class.forName("nn.model.Node"));
        setField(term481, term481.getClass(), "type", enum3);
        setIntField(term481, term481.getClass(), "innovation", 679763016);
        setField(term481, term481.getClass(), "connections", null);
        setDoubleField(term481, term481.getClass(), "bias", 0.7031006357544823);
        setField(term480, term480.getClass(), "in", term481);
        setField(term484, term484.getClass(), "type", enum3);
        setIntField(term484, term484.getClass(), "innovation", 1962444399);
        setField(term484, term484.getClass(), "connections", null);
        setDoubleField(term484, term484.getClass(), "bias", 0.9527281779865117);
        setField(term480, term480.getClass(), "out", term484);
        setFloatField(term480, term480.getClass(), "weight", 0.9985961F);
        setBooleanField(term480, term480.getClass(), "expressed", true);
        setIntField(term480, term480.getClass(), "innovation", 767834723);
        Object term490 = newInstance(Class.forName("nn.model.Connection"));
        setField(term490, term490.getClass(), "in", null);
        setField(term490, term490.getClass(), "out", null);
        setFloatField(term490, term490.getClass(), "weight", 0.0F);
        setBooleanField(term490, term490.getClass(), "expressed", false);
        setIntField(term490, term490.getClass(), "innovation", 0);
        Object term494 = newInstance(Class.forName("nn.model.Connection"));
        Object term495 = newInstance(Class.forName("nn.model.Node"));
        Object term498 = newInstance(Class.forName("nn.model.Node"));
        setField(term495, term495.getClass(), "type", null);
        setIntField(term495, term495.getClass(), "innovation", -226514366);
        setField(term495, term495.getClass(), "connections", null);
        setDoubleField(term495, term495.getClass(), "bias", 0.2779719046761513);
        setField(term494, term494.getClass(), "in", term495);
        setField(term498, term498.getClass(), "type", enum4);
        setIntField(term498, term498.getClass(), "innovation", -157887805);
        setField(term498, term498.getClass(), "connections", null);
        setDoubleField(term498, term498.getClass(), "bias", 0.6436713023569729);
        setField(term494, term494.getClass(), "out", term498);
        setFloatField(term494, term494.getClass(), "weight", 0.97262454F);
        setBooleanField(term494, term494.getClass(), "expressed", true);
        setIntField(term494, term494.getClass(), "innovation", 1876565163);
        Object term504 = newInstance(Class.forName("nn.model.Connection"));
        setField(term504, term504.getClass(), "in", null);
        setField(term504, term504.getClass(), "out", null);
        setFloatField(term504, term504.getClass(), "weight", 0.0F);
        setBooleanField(term504, term504.getClass(), "expressed", false);
        setIntField(term504, term504.getClass(), "innovation", 0);
        ArrayList term463 = new ArrayList();
        ((ArrayList) term463).add(term465);
        ((ArrayList) term463).add(term469);
        ((ArrayList) term463).add(term473);
        ((ArrayList) term463).add(term480);
        ((ArrayList) term463).add(term490);
        ((ArrayList) term463).add(term494);
        ((ArrayList) term463).add(term504);
        ((ArrayList) term463).add(term490);
        ((ArrayList) term463).add(term490);
        term430 = newInstance(Class.forName("nn.model.Genome"));
        Object term510 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term512 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term514 = newInstance(Class.forName("java.util.Random"));
        Object term515 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term430, term430.getClass(), "nodes", term431);
        setField(term430, term430.getClass(), "connections", term463);
        setIntField(term510, term510.getClass(), "counter", 100);
        setField(term430, term430.getClass(), "nodeInnovator", term510);
        setIntField(term512, term512.getClass(), "counter", 100);
        setField(term430, term430.getClass(), "connectionInnovator", term512);
        setLongField(term515, term515.getClass(), "value", 268532915045143L);
        setField(term514, term514.getClass(), "seed", term515);
        setDoubleField(term514, term514.getClass(), "nextNextGaussian", 0.8598297828918529);
        setBooleanField(term514, term514.getClass(), "haveNextNextGaussian", false);
        setField(term430, term430.getClass(), "random", term514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.NeuralNetwork");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Genome");
        Object[] args = new Object[1];
        args[0] = term430;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


