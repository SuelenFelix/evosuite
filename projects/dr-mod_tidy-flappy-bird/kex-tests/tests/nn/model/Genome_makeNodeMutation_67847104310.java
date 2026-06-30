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

public class Genome_makeNodeMutation_67847104310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9241;

    public Genome_makeNodeMutation_67847104310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9312 = Class.forName((String) "nn.model.Type");
        Field term9311 = ((Class) term9312).getDeclaredField((String) "OUTPUT");
        ((Field) term9311).setAccessible(true);
        Object enum52 = ((Field) term9311).get((Object) null);
        ArrayList term9248 = new ArrayList();
        ((ArrayList) term9248).add((Object)null);
        ((ArrayList) term9248).add((Object)null);
        ((ArrayList) term9248).add((Object)null);
        ((ArrayList) term9248).add((Object)null);
        Object term9244 = newInstance(Class.forName("nn.model.Node"));
        setField(term9244, term9244.getClass(), "type", enum52);
        setIntField(term9244, term9244.getClass(), "innovation", -746950289);
        setField(term9244, term9244.getClass(), "connections", term9248);
        setDoubleField(term9244, term9244.getClass(), "bias", 0.6695336994403062);
        Class<? extends Object> term9402 = Class.forName((String) "nn.model.Type");
        Field term9401 = ((Class) term9402).getDeclaredField((String) "SENSOR");
        ((Field) term9401).setAccessible(true);
        Object enum53 = ((Field) term9401).get((Object) null);
        ArrayList term9256 = new ArrayList();
        ((ArrayList) term9256).add((Object)null);
        ((ArrayList) term9256).add((Object)null);
        ((ArrayList) term9256).add((Object)null);
        ((ArrayList) term9256).add((Object)null);
        ((ArrayList) term9256).add((Object)null);
        ((ArrayList) term9256).add((Object)null);
        ((ArrayList) term9256).add((Object)null);
        Object term9252 = newInstance(Class.forName("nn.model.Node"));
        setField(term9252, term9252.getClass(), "type", enum53);
        setIntField(term9252, term9252.getClass(), "innovation", 1923558221);
        setField(term9252, term9252.getClass(), "connections", term9256);
        setDoubleField(term9252, term9252.getClass(), "bias", 0.34363635678920734);
        Class<? extends Object> term9492 = Class.forName((String) "nn.model.Type");
        Field term9491 = ((Class) term9492).getDeclaredField((String) "SENSOR");
        ((Field) term9491).setAccessible(true);
        Object enum54 = ((Field) term9491).get((Object) null);
        ArrayList term9264 = new ArrayList();
        ((ArrayList) term9264).add((Object)null);
        ((ArrayList) term9264).add((Object)null);
        Object term9260 = newInstance(Class.forName("nn.model.Node"));
        setField(term9260, term9260.getClass(), "type", enum54);
        setIntField(term9260, term9260.getClass(), "innovation", 719185716);
        setField(term9260, term9260.getClass(), "connections", term9264);
        setDoubleField(term9260, term9260.getClass(), "bias", 0.8323532236646399);
        ArrayList term9270 = new ArrayList();
        ((ArrayList) term9270).add((Object)null);
        ((ArrayList) term9270).add((Object)null);
        ((ArrayList) term9270).add((Object)null);
        Object term9268 = newInstance(Class.forName("nn.model.Node"));
        setField(term9268, term9268.getClass(), "type", enum54);
        setIntField(term9268, term9268.getClass(), "innovation", -1341357647);
        setField(term9268, term9268.getClass(), "connections", term9270);
        setDoubleField(term9268, term9268.getClass(), "bias", 0.44682046821312316);
        ArrayList term9276 = new ArrayList();
        ((ArrayList) term9276).add((Object)null);
        Object term9274 = newInstance(Class.forName("nn.model.Node"));
        setField(term9274, term9274.getClass(), "type", enum52);
        setIntField(term9274, term9274.getClass(), "innovation", -2085566906);
        setField(term9274, term9274.getClass(), "connections", term9276);
        setDoubleField(term9274, term9274.getClass(), "bias", 0.6584787211782301);
        ArrayList term9282 = new ArrayList();
        ((ArrayList) term9282).add((Object)null);
        ((ArrayList) term9282).add((Object)null);
        Object term9280 = newInstance(Class.forName("nn.model.Node"));
        setField(term9280, term9280.getClass(), "type", enum54);
        setIntField(term9280, term9280.getClass(), "innovation", -137577510);
        setField(term9280, term9280.getClass(), "connections", term9282);
        setDoubleField(term9280, term9280.getClass(), "bias", 0.9066998853505908);
        ArrayList term9288 = new ArrayList();
        ((ArrayList) term9288).add((Object)null);
        ((ArrayList) term9288).add((Object)null);
        ((ArrayList) term9288).add((Object)null);
        ((ArrayList) term9288).add((Object)null);
        ((ArrayList) term9288).add((Object)null);
        ((ArrayList) term9288).add((Object)null);
        ((ArrayList) term9288).add((Object)null);
        Object term9286 = newInstance(Class.forName("nn.model.Node"));
        setField(term9286, term9286.getClass(), "type", enum52);
        setIntField(term9286, term9286.getClass(), "innovation", 114915275);
        setField(term9286, term9286.getClass(), "connections", term9288);
        setDoubleField(term9286, term9286.getClass(), "bias", 0.6397358922018691);
        ArrayList term9242 = new ArrayList();
        ((ArrayList) term9242).add(term9244);
        ((ArrayList) term9242).add(term9252);
        ((ArrayList) term9242).add(term9260);
        ((ArrayList) term9242).add(term9268);
        ((ArrayList) term9242).add(term9274);
        ((ArrayList) term9242).add(term9280);
        ((ArrayList) term9242).add(term9286);
        Object term9296 = newInstance(Class.forName("nn.model.Connection"));
        setField(term9296, term9296.getClass(), "in", null);
        setField(term9296, term9296.getClass(), "out", null);
        setFloatField(term9296, term9296.getClass(), "weight", 0.0F);
        setBooleanField(term9296, term9296.getClass(), "expressed", false);
        setIntField(term9296, term9296.getClass(), "innovation", 0);
        ArrayList term9294 = new ArrayList();
        ((ArrayList) term9294).add(term9296);
        ((ArrayList) term9294).add(term9296);
        term9241 = newInstance(Class.forName("nn.model.Genome"));
        Object term9302 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term9304 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term9306 = newInstance(Class.forName("java.util.Random"));
        Object term9307 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term9241, term9241.getClass(), "nodes", term9242);
        setField(term9241, term9241.getClass(), "connections", term9294);
        setIntField(term9302, term9302.getClass(), "counter", 100);
        setField(term9241, term9241.getClass(), "nodeInnovator", term9302);
        setIntField(term9304, term9304.getClass(), "counter", 100);
        setField(term9241, term9241.getClass(), "connectionInnovator", term9304);
        setLongField(term9307, term9307.getClass(), "value", 242165769481961L);
        setField(term9306, term9306.getClass(), "seed", term9307);
        setDoubleField(term9306, term9306.getClass(), "nextNextGaussian", 0.28707058137195374);
        setBooleanField(term9306, term9306.getClass(), "haveNextNextGaussian", true);
        setField(term9241, term9241.getClass(), "random", term9306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makeNodeMutation", argTypes, term9241, args);
    }

};


