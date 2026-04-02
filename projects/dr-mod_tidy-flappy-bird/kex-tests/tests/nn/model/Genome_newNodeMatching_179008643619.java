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
     Object term11324;
     Object term11358;
     Object term11455;

    public Genome_newNodeMatching_179008643619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11493 = Class.forName((String) "nn.model.Type");
        Field term11492 = ((Class) term11493).getDeclaredField((String) "OUTPUT");
        ((Field) term11492).setAccessible(true);
        Object enum68 = ((Field) term11492).get((Object) null);
        ArrayList term11331 = new ArrayList();
        Object term11327 = newInstance(Class.forName("nn.model.Node"));
        setField(term11327, term11327.getClass(), "type", enum68);
        setIntField(term11327, term11327.getClass(), "innovation", 1109050836);
        setField(term11327, term11327.getClass(), "connections", term11331);
        setDoubleField(term11327, term11327.getClass(), "bias", 0.6199687921970567);
        Class<? extends Object> term11583 = Class.forName((String) "nn.model.Type");
        Field term11582 = ((Class) term11583).getDeclaredField((String) "OUTPUT");
        ((Field) term11582).setAccessible(true);
        Object enum69 = ((Field) term11582).get((Object) null);
        ArrayList term11339 = new ArrayList();
        ((ArrayList) term11339).add((Object)null);
        ((ArrayList) term11339).add((Object)null);
        ((ArrayList) term11339).add((Object)null);
        ((ArrayList) term11339).add((Object)null);
        ((ArrayList) term11339).add((Object)null);
        Object term11335 = newInstance(Class.forName("nn.model.Node"));
        setField(term11335, term11335.getClass(), "type", enum69);
        setIntField(term11335, term11335.getClass(), "innovation", 1978065000);
        setField(term11335, term11335.getClass(), "connections", term11339);
        setDoubleField(term11335, term11335.getClass(), "bias", 0.4997869887510318);
        ArrayList term11325 = new ArrayList();
        ((ArrayList) term11325).add(term11327);
        ((ArrayList) term11325).add(term11335);
        ArrayList term11345 = new ArrayList();
        term11324 = newInstance(Class.forName("nn.model.Genome"));
        Object term11349 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term11351 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term11353 = newInstance(Class.forName("java.util.Random"));
        Object term11354 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term11324, term11324.getClass(), "nodes", term11325);
        setField(term11324, term11324.getClass(), "connections", term11345);
        setIntField(term11349, term11349.getClass(), "counter", 100);
        setField(term11324, term11324.getClass(), "nodeInnovator", term11349);
        setIntField(term11351, term11351.getClass(), "counter", 100);
        setField(term11324, term11324.getClass(), "connectionInnovator", term11351);
        setLongField(term11354, term11354.getClass(), "value", 57066292295175L);
        setField(term11353, term11353.getClass(), "seed", term11354);
        setDoubleField(term11353, term11353.getClass(), "nextNextGaussian", 0.27934774389918404);
        setBooleanField(term11353, term11353.getClass(), "haveNextNextGaussian", true);
        setField(term11324, term11324.getClass(), "random", term11353);
        term11358 = new LinkedHashMap();
        Object term11459 = newInstance(Class.forName("nn.model.Connection"));
        Object term11460 = newInstance(Class.forName("nn.model.Node"));
        Object term11463 = newInstance(Class.forName("nn.model.Node"));
        setField(term11460, term11460.getClass(), "type", enum69);
        setIntField(term11460, term11460.getClass(), "innovation", -773707674);
        setField(term11460, term11460.getClass(), "connections", null);
        setDoubleField(term11460, term11460.getClass(), "bias", 0.29309791570378785);
        setField(term11459, term11459.getClass(), "in", term11460);
        setField(term11463, term11463.getClass(), "type", null);
        setIntField(term11463, term11463.getClass(), "innovation", 0);
        setField(term11463, term11463.getClass(), "connections", null);
        setDoubleField(term11463, term11463.getClass(), "bias", 0.0);
        setField(term11459, term11459.getClass(), "out", term11463);
        setFloatField(term11459, term11459.getClass(), "weight", 0.49330932F);
        setBooleanField(term11459, term11459.getClass(), "expressed", true);
        setIntField(term11459, term11459.getClass(), "innovation", 200150950);
        Object term11469 = newInstance(Class.forName("nn.model.Connection"));
        Object term11470 = newInstance(Class.forName("nn.model.Node"));
        Object term11473 = newInstance(Class.forName("nn.model.Node"));
        setField(term11470, term11470.getClass(), "type", null);
        setIntField(term11470, term11470.getClass(), "innovation", 0);
        setField(term11470, term11470.getClass(), "connections", null);
        setDoubleField(term11470, term11470.getClass(), "bias", 0.0);
        setField(term11469, term11469.getClass(), "in", term11470);
        setField(term11473, term11473.getClass(), "type", null);
        setIntField(term11473, term11473.getClass(), "innovation", 0);
        setField(term11473, term11473.getClass(), "connections", null);
        setDoubleField(term11473, term11473.getClass(), "bias", 0.0);
        setField(term11469, term11469.getClass(), "out", term11473);
        setFloatField(term11469, term11469.getClass(), "weight", 0.48285776F);
        setBooleanField(term11469, term11469.getClass(), "expressed", true);
        setIntField(term11469, term11469.getClass(), "innovation", -31125530);
        Object term11479 = newInstance(Class.forName("nn.model.Connection"));
        Object term11480 = newInstance(Class.forName("nn.model.Node"));
        Object term11483 = newInstance(Class.forName("nn.model.Node"));
        setField(term11480, term11480.getClass(), "type", enum69);
        setIntField(term11480, term11480.getClass(), "innovation", 383244929);
        setField(term11480, term11480.getClass(), "connections", null);
        setDoubleField(term11480, term11480.getClass(), "bias", 0.927519742701973);
        setField(term11479, term11479.getClass(), "in", term11480);
        setField(term11483, term11483.getClass(), "type", enum69);
        setIntField(term11483, term11483.getClass(), "innovation", 207213904);
        setField(term11483, term11483.getClass(), "connections", null);
        setDoubleField(term11483, term11483.getClass(), "bias", 0.7373458011239485);
        setField(term11479, term11479.getClass(), "out", term11483);
        setFloatField(term11479, term11479.getClass(), "weight", 0.49736315F);
        setBooleanField(term11479, term11479.getClass(), "expressed", true);
        setIntField(term11479, term11479.getClass(), "innovation", 1179937517);
        ArrayList term11457 = new ArrayList();
        ((ArrayList) term11457).add(term11459);
        ((ArrayList) term11457).add(term11469);
        ((ArrayList) term11457).add(term11479);
        term11455 = newInstance(Class.forName("nn.model.Node"));
        setField(term11455, term11455.getClass(), "type", enum69);
        setIntField(term11455, term11455.getClass(), "innovation", 335681723);
        setField(term11455, term11455.getClass(), "connections", term11457);
        setDoubleField(term11455, term11455.getClass(), "bias", 0.14499093140326424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("nn.model.Genome");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("nn.model.Node");
        Object[] args = new Object[3];
        args[0] = term11324;
        args[1] = term11358;
        args[2] = term11455;
        callMethod(klass, "newNodeMatching", argTypes, null, args);
    }

};


