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
import java.util.LinkedHashMap;

public class Genome_newNodeMatching_179008643619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11322;
     Object term11356;
     Object term11445;

    public Genome_newNodeMatching_179008643619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11483 = Class.forName((String) "nn.model.Type");
        Field term11482 = ((Class) term11483).getDeclaredField((String) "OUTPUT");
        ((Field) term11482).setAccessible(true);
        Object enum68 = ((Field) term11482).get((Object) null);
        ArrayList term11329 = new ArrayList();
        Object term11325 = newInstance(Class.forName("nn.model.Node"));
        setField(term11325, term11325.getClass(), "type", enum68);
        setIntField(term11325, term11325.getClass(), "innovation", 1109050836);
        setField(term11325, term11325.getClass(), "connections", term11329);
        setDoubleField(term11325, term11325.getClass(), "bias", 0.6199687921970567);
        Class<? extends Object> term11573 = Class.forName((String) "nn.model.Type");
        Field term11572 = ((Class) term11573).getDeclaredField((String) "OUTPUT");
        ((Field) term11572).setAccessible(true);
        Object enum69 = ((Field) term11572).get((Object) null);
        ArrayList term11337 = new ArrayList();
        ((ArrayList) term11337).add((Object)null);
        ((ArrayList) term11337).add((Object)null);
        ((ArrayList) term11337).add((Object)null);
        ((ArrayList) term11337).add((Object)null);
        ((ArrayList) term11337).add((Object)null);
        Object term11333 = newInstance(Class.forName("nn.model.Node"));
        setField(term11333, term11333.getClass(), "type", enum69);
        setIntField(term11333, term11333.getClass(), "innovation", 1978065000);
        setField(term11333, term11333.getClass(), "connections", term11337);
        setDoubleField(term11333, term11333.getClass(), "bias", 0.4997869887510318);
        ArrayList term11323 = new ArrayList();
        ((ArrayList) term11323).add(term11325);
        ((ArrayList) term11323).add(term11333);
        ArrayList term11343 = new ArrayList();
        term11322 = newInstance(Class.forName("nn.model.Genome"));
        Object term11347 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term11349 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term11351 = newInstance(Class.forName("java.util.Random"));
        Object term11352 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term11322, term11322.getClass(), "nodes", term11323);
        setField(term11322, term11322.getClass(), "connections", term11343);
        setIntField(term11347, term11347.getClass(), "counter", 100);
        setField(term11322, term11322.getClass(), "nodeInnovator", term11347);
        setIntField(term11349, term11349.getClass(), "counter", 100);
        setField(term11322, term11322.getClass(), "connectionInnovator", term11349);
        setLongField(term11352, term11352.getClass(), "value", 173436392306470L);
        setField(term11351, term11351.getClass(), "seed", term11352);
        setDoubleField(term11351, term11351.getClass(), "nextNextGaussian", 0.27934774389918404);
        setBooleanField(term11351, term11351.getClass(), "haveNextNextGaussian", true);
        setField(term11322, term11322.getClass(), "random", term11351);
        term11356 = new LinkedHashMap();
        Object term11449 = newInstance(Class.forName("nn.model.Connection"));
        Object term11450 = newInstance(Class.forName("nn.model.Node"));
        Object term11453 = newInstance(Class.forName("nn.model.Node"));
        setField(term11450, term11450.getClass(), "type", enum69);
        setIntField(term11450, term11450.getClass(), "innovation", -773707674);
        setField(term11450, term11450.getClass(), "connections", null);
        setDoubleField(term11450, term11450.getClass(), "bias", 0.29309791570378785);
        setField(term11449, term11449.getClass(), "in", term11450);
        setField(term11453, term11453.getClass(), "type", null);
        setIntField(term11453, term11453.getClass(), "innovation", 0);
        setField(term11453, term11453.getClass(), "connections", null);
        setDoubleField(term11453, term11453.getClass(), "bias", 0.0);
        setField(term11449, term11449.getClass(), "out", term11453);
        setFloatField(term11449, term11449.getClass(), "weight", 0.49330932F);
        setBooleanField(term11449, term11449.getClass(), "expressed", true);
        setIntField(term11449, term11449.getClass(), "innovation", 200150950);
        Object term11459 = newInstance(Class.forName("nn.model.Connection"));
        Object term11460 = newInstance(Class.forName("nn.model.Node"));
        Object term11463 = newInstance(Class.forName("nn.model.Node"));
        setField(term11460, term11460.getClass(), "type", null);
        setIntField(term11460, term11460.getClass(), "innovation", 0);
        setField(term11460, term11460.getClass(), "connections", null);
        setDoubleField(term11460, term11460.getClass(), "bias", 0.0);
        setField(term11459, term11459.getClass(), "in", term11460);
        setField(term11463, term11463.getClass(), "type", null);
        setIntField(term11463, term11463.getClass(), "innovation", 0);
        setField(term11463, term11463.getClass(), "connections", null);
        setDoubleField(term11463, term11463.getClass(), "bias", 0.0);
        setField(term11459, term11459.getClass(), "out", term11463);
        setFloatField(term11459, term11459.getClass(), "weight", 0.48285776F);
        setBooleanField(term11459, term11459.getClass(), "expressed", true);
        setIntField(term11459, term11459.getClass(), "innovation", -31125530);
        Object term11469 = newInstance(Class.forName("nn.model.Connection"));
        Object term11470 = newInstance(Class.forName("nn.model.Node"));
        Object term11473 = newInstance(Class.forName("nn.model.Node"));
        setField(term11470, term11470.getClass(), "type", enum69);
        setIntField(term11470, term11470.getClass(), "innovation", 383244929);
        setField(term11470, term11470.getClass(), "connections", null);
        setDoubleField(term11470, term11470.getClass(), "bias", 0.927519742701973);
        setField(term11469, term11469.getClass(), "in", term11470);
        setField(term11473, term11473.getClass(), "type", enum69);
        setIntField(term11473, term11473.getClass(), "innovation", 207213904);
        setField(term11473, term11473.getClass(), "connections", null);
        setDoubleField(term11473, term11473.getClass(), "bias", 0.7373458011239485);
        setField(term11469, term11469.getClass(), "out", term11473);
        setFloatField(term11469, term11469.getClass(), "weight", 0.49736315F);
        setBooleanField(term11469, term11469.getClass(), "expressed", true);
        setIntField(term11469, term11469.getClass(), "innovation", 1179937517);
        ArrayList term11447 = new ArrayList();
        ((ArrayList) term11447).add(term11449);
        ((ArrayList) term11447).add(term11459);
        ((ArrayList) term11447).add(term11469);
        term11445 = newInstance(Class.forName("nn.model.Node"));
        setField(term11445, term11445.getClass(), "type", enum69);
        setIntField(term11445, term11445.getClass(), "innovation", 335681723);
        setField(term11445, term11445.getClass(), "connections", term11447);
        setDoubleField(term11445, term11445.getClass(), "bias", 0.14499093140326424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("nn.model.Genome");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("nn.model.Node");
        Object[] args = new Object[3];
        args[0] = term11322;
        args[1] = term11356;
        args[2] = term11445;
        callMethod(klass, "newNodeMatching", argTypes, null, args);
    }

};


