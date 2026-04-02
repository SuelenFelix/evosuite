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
     Object term9243;

    public Genome_makeNodeMutation_67847104310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9314 = Class.forName((String) "nn.model.Type");
        Field term9313 = ((Class) term9314).getDeclaredField((String) "OUTPUT");
        ((Field) term9313).setAccessible(true);
        Object enum52 = ((Field) term9313).get((Object) null);
        ArrayList term9250 = new ArrayList();
        ((ArrayList) term9250).add((Object)null);
        ((ArrayList) term9250).add((Object)null);
        ((ArrayList) term9250).add((Object)null);
        ((ArrayList) term9250).add((Object)null);
        Object term9246 = newInstance(Class.forName("nn.model.Node"));
        setField(term9246, term9246.getClass(), "type", enum52);
        setIntField(term9246, term9246.getClass(), "innovation", -746950289);
        setField(term9246, term9246.getClass(), "connections", term9250);
        setDoubleField(term9246, term9246.getClass(), "bias", 0.6695336994403062);
        Class<? extends Object> term9404 = Class.forName((String) "nn.model.Type");
        Field term9403 = ((Class) term9404).getDeclaredField((String) "SENSOR");
        ((Field) term9403).setAccessible(true);
        Object enum53 = ((Field) term9403).get((Object) null);
        ArrayList term9258 = new ArrayList();
        ((ArrayList) term9258).add((Object)null);
        ((ArrayList) term9258).add((Object)null);
        ((ArrayList) term9258).add((Object)null);
        ((ArrayList) term9258).add((Object)null);
        ((ArrayList) term9258).add((Object)null);
        ((ArrayList) term9258).add((Object)null);
        ((ArrayList) term9258).add((Object)null);
        Object term9254 = newInstance(Class.forName("nn.model.Node"));
        setField(term9254, term9254.getClass(), "type", enum53);
        setIntField(term9254, term9254.getClass(), "innovation", 1923558221);
        setField(term9254, term9254.getClass(), "connections", term9258);
        setDoubleField(term9254, term9254.getClass(), "bias", 0.34363635678920734);
        Class<? extends Object> term9494 = Class.forName((String) "nn.model.Type");
        Field term9493 = ((Class) term9494).getDeclaredField((String) "SENSOR");
        ((Field) term9493).setAccessible(true);
        Object enum54 = ((Field) term9493).get((Object) null);
        ArrayList term9266 = new ArrayList();
        ((ArrayList) term9266).add((Object)null);
        ((ArrayList) term9266).add((Object)null);
        Object term9262 = newInstance(Class.forName("nn.model.Node"));
        setField(term9262, term9262.getClass(), "type", enum54);
        setIntField(term9262, term9262.getClass(), "innovation", 719185716);
        setField(term9262, term9262.getClass(), "connections", term9266);
        setDoubleField(term9262, term9262.getClass(), "bias", 0.8323532236646399);
        ArrayList term9272 = new ArrayList();
        ((ArrayList) term9272).add((Object)null);
        ((ArrayList) term9272).add((Object)null);
        ((ArrayList) term9272).add((Object)null);
        Object term9270 = newInstance(Class.forName("nn.model.Node"));
        setField(term9270, term9270.getClass(), "type", enum54);
        setIntField(term9270, term9270.getClass(), "innovation", -1341357647);
        setField(term9270, term9270.getClass(), "connections", term9272);
        setDoubleField(term9270, term9270.getClass(), "bias", 0.44682046821312316);
        ArrayList term9278 = new ArrayList();
        ((ArrayList) term9278).add((Object)null);
        Object term9276 = newInstance(Class.forName("nn.model.Node"));
        setField(term9276, term9276.getClass(), "type", enum52);
        setIntField(term9276, term9276.getClass(), "innovation", -2085566906);
        setField(term9276, term9276.getClass(), "connections", term9278);
        setDoubleField(term9276, term9276.getClass(), "bias", 0.6584787211782301);
        ArrayList term9284 = new ArrayList();
        ((ArrayList) term9284).add((Object)null);
        ((ArrayList) term9284).add((Object)null);
        Object term9282 = newInstance(Class.forName("nn.model.Node"));
        setField(term9282, term9282.getClass(), "type", enum54);
        setIntField(term9282, term9282.getClass(), "innovation", -137577510);
        setField(term9282, term9282.getClass(), "connections", term9284);
        setDoubleField(term9282, term9282.getClass(), "bias", 0.9066998853505908);
        ArrayList term9290 = new ArrayList();
        ((ArrayList) term9290).add((Object)null);
        ((ArrayList) term9290).add((Object)null);
        ((ArrayList) term9290).add((Object)null);
        ((ArrayList) term9290).add((Object)null);
        ((ArrayList) term9290).add((Object)null);
        ((ArrayList) term9290).add((Object)null);
        ((ArrayList) term9290).add((Object)null);
        Object term9288 = newInstance(Class.forName("nn.model.Node"));
        setField(term9288, term9288.getClass(), "type", enum52);
        setIntField(term9288, term9288.getClass(), "innovation", 114915275);
        setField(term9288, term9288.getClass(), "connections", term9290);
        setDoubleField(term9288, term9288.getClass(), "bias", 0.6397358922018691);
        ArrayList term9244 = new ArrayList();
        ((ArrayList) term9244).add(term9246);
        ((ArrayList) term9244).add(term9254);
        ((ArrayList) term9244).add(term9262);
        ((ArrayList) term9244).add(term9270);
        ((ArrayList) term9244).add(term9276);
        ((ArrayList) term9244).add(term9282);
        ((ArrayList) term9244).add(term9288);
        Object term9298 = newInstance(Class.forName("nn.model.Connection"));
        setField(term9298, term9298.getClass(), "in", null);
        setField(term9298, term9298.getClass(), "out", null);
        setFloatField(term9298, term9298.getClass(), "weight", 0.0F);
        setBooleanField(term9298, term9298.getClass(), "expressed", false);
        setIntField(term9298, term9298.getClass(), "innovation", 0);
        ArrayList term9296 = new ArrayList();
        ((ArrayList) term9296).add(term9298);
        ((ArrayList) term9296).add(term9298);
        term9243 = newInstance(Class.forName("nn.model.Genome"));
        Object term9304 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term9306 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term9308 = newInstance(Class.forName("java.util.Random"));
        Object term9309 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term9243, term9243.getClass(), "nodes", term9244);
        setField(term9243, term9243.getClass(), "connections", term9296);
        setIntField(term9304, term9304.getClass(), "counter", 100);
        setField(term9243, term9243.getClass(), "nodeInnovator", term9304);
        setIntField(term9306, term9306.getClass(), "counter", 100);
        setField(term9243, term9243.getClass(), "connectionInnovator", term9306);
        setLongField(term9309, term9309.getClass(), "value", 125774341882694L);
        setField(term9308, term9308.getClass(), "seed", term9309);
        setDoubleField(term9308, term9308.getClass(), "nextNextGaussian", 0.28707058137195374);
        setBooleanField(term9308, term9308.getClass(), "haveNextNextGaussian", true);
        setField(term9243, term9243.getClass(), "random", term9308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makeNodeMutation", argTypes, term9243, args);
    }

};


