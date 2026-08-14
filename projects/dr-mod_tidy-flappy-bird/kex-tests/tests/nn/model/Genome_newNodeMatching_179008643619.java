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
     Object term11461;

    public Genome_newNodeMatching_179008643619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11499 = Class.forName((String) "nn.model.Type");
        Field term11498 = ((Class) term11499).getDeclaredField((String) "OUTPUT");
        ((Field) term11498).setAccessible(true);
        Object enum68 = ((Field) term11498).get((Object) null);
        ArrayList term11331 = new ArrayList();
        Object term11327 = newInstance(Class.forName("nn.model.Node"));
        setField(term11327, term11327.getClass(), "type", enum68);
        setIntField(term11327, term11327.getClass(), "innovation", 1109050836);
        setField(term11327, term11327.getClass(), "connections", term11331);
        setDoubleField(term11327, term11327.getClass(), "bias", 0.6199687921970567);
        Class<? extends Object> term11589 = Class.forName((String) "nn.model.Type");
        Field term11588 = ((Class) term11589).getDeclaredField((String) "OUTPUT");
        ((Field) term11588).setAccessible(true);
        Object enum69 = ((Field) term11588).get((Object) null);
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
        setLongField(term11354, term11354.getClass(), "value", 60001480498677L);
        setField(term11353, term11353.getClass(), "seed", term11354);
        setDoubleField(term11353, term11353.getClass(), "nextNextGaussian", 0.27934774389918404);
        setBooleanField(term11353, term11353.getClass(), "haveNextNextGaussian", true);
        setField(term11324, term11324.getClass(), "random", term11353);
        term11358 = new LinkedHashMap();
        Object term11465 = newInstance(Class.forName("nn.model.Connection"));
        Object term11466 = newInstance(Class.forName("nn.model.Node"));
        Object term11469 = newInstance(Class.forName("nn.model.Node"));
        setField(term11466, term11466.getClass(), "type", enum69);
        setIntField(term11466, term11466.getClass(), "innovation", -773707674);
        setField(term11466, term11466.getClass(), "connections", null);
        setDoubleField(term11466, term11466.getClass(), "bias", 0.29309791570378785);
        setField(term11465, term11465.getClass(), "in", term11466);
        setField(term11469, term11469.getClass(), "type", null);
        setIntField(term11469, term11469.getClass(), "innovation", 0);
        setField(term11469, term11469.getClass(), "connections", null);
        setDoubleField(term11469, term11469.getClass(), "bias", 0.0);
        setField(term11465, term11465.getClass(), "out", term11469);
        setFloatField(term11465, term11465.getClass(), "weight", 0.49330932F);
        setBooleanField(term11465, term11465.getClass(), "expressed", true);
        setIntField(term11465, term11465.getClass(), "innovation", 200150950);
        Object term11475 = newInstance(Class.forName("nn.model.Connection"));
        Object term11476 = newInstance(Class.forName("nn.model.Node"));
        Object term11479 = newInstance(Class.forName("nn.model.Node"));
        setField(term11476, term11476.getClass(), "type", null);
        setIntField(term11476, term11476.getClass(), "innovation", 0);
        setField(term11476, term11476.getClass(), "connections", null);
        setDoubleField(term11476, term11476.getClass(), "bias", 0.0);
        setField(term11475, term11475.getClass(), "in", term11476);
        setField(term11479, term11479.getClass(), "type", null);
        setIntField(term11479, term11479.getClass(), "innovation", 0);
        setField(term11479, term11479.getClass(), "connections", null);
        setDoubleField(term11479, term11479.getClass(), "bias", 0.0);
        setField(term11475, term11475.getClass(), "out", term11479);
        setFloatField(term11475, term11475.getClass(), "weight", 0.48285776F);
        setBooleanField(term11475, term11475.getClass(), "expressed", true);
        setIntField(term11475, term11475.getClass(), "innovation", -31125530);
        Object term11485 = newInstance(Class.forName("nn.model.Connection"));
        Object term11486 = newInstance(Class.forName("nn.model.Node"));
        Object term11489 = newInstance(Class.forName("nn.model.Node"));
        setField(term11486, term11486.getClass(), "type", enum69);
        setIntField(term11486, term11486.getClass(), "innovation", 383244929);
        setField(term11486, term11486.getClass(), "connections", null);
        setDoubleField(term11486, term11486.getClass(), "bias", 0.927519742701973);
        setField(term11485, term11485.getClass(), "in", term11486);
        setField(term11489, term11489.getClass(), "type", enum69);
        setIntField(term11489, term11489.getClass(), "innovation", 207213904);
        setField(term11489, term11489.getClass(), "connections", null);
        setDoubleField(term11489, term11489.getClass(), "bias", 0.7373458011239485);
        setField(term11485, term11485.getClass(), "out", term11489);
        setFloatField(term11485, term11485.getClass(), "weight", 0.49736315F);
        setBooleanField(term11485, term11485.getClass(), "expressed", true);
        setIntField(term11485, term11485.getClass(), "innovation", 1179937517);
        ArrayList term11463 = new ArrayList();
        ((ArrayList) term11463).add(term11465);
        ((ArrayList) term11463).add(term11475);
        ((ArrayList) term11463).add(term11485);
        term11461 = newInstance(Class.forName("nn.model.Node"));
        setField(term11461, term11461.getClass(), "type", enum69);
        setIntField(term11461, term11461.getClass(), "innovation", 335681723);
        setField(term11461, term11461.getClass(), "connections", term11463);
        setDoubleField(term11461, term11461.getClass(), "bias", 0.14499093140326424);
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
        args[2] = term11461;
        callMethod(klass, "newNodeMatching", argTypes, null, args);
    }

};


