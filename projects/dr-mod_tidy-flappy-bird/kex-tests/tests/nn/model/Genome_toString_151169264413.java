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

public class Genome_toString_151169264413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7455;

    public Genome_toString_151169264413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7539 = Class.forName((String) "nn.model.Type");
        Field term7538 = ((Class) term7539).getDeclaredField((String) "SENSOR");
        ((Field) term7538).setAccessible(true);
        Object enum44 = ((Field) term7538).get((Object) null);
        ArrayList term7462 = new ArrayList();
        ((ArrayList) term7462).add((Object)null);
        ((ArrayList) term7462).add((Object)null);
        ((ArrayList) term7462).add((Object)null);
        Object term7458 = newInstance(Class.forName("nn.model.Node"));
        setField(term7458, term7458.getClass(), "type", enum44);
        setIntField(term7458, term7458.getClass(), "innovation", 183531701);
        setField(term7458, term7458.getClass(), "connections", term7462);
        setDoubleField(term7458, term7458.getClass(), "bias", 0.27472560177149286);
        Class<? extends Object> term7629 = Class.forName((String) "nn.model.Type");
        Field term7628 = ((Class) term7629).getDeclaredField((String) "SENSOR");
        ((Field) term7628).setAccessible(true);
        Object enum45 = ((Field) term7628).get((Object) null);
        ArrayList term7470 = new ArrayList();
        ((ArrayList) term7470).add((Object)null);
        ((ArrayList) term7470).add((Object)null);
        ((ArrayList) term7470).add((Object)null);
        ((ArrayList) term7470).add((Object)null);
        ((ArrayList) term7470).add((Object)null);
        ((ArrayList) term7470).add((Object)null);
        ((ArrayList) term7470).add((Object)null);
        ((ArrayList) term7470).add((Object)null);
        ((ArrayList) term7470).add((Object)null);
        Object term7466 = newInstance(Class.forName("nn.model.Node"));
        setField(term7466, term7466.getClass(), "type", enum45);
        setIntField(term7466, term7466.getClass(), "innovation", 1876738932);
        setField(term7466, term7466.getClass(), "connections", term7470);
        setDoubleField(term7466, term7466.getClass(), "bias", 0.4446537162968065);
        Class<? extends Object> term7719 = Class.forName((String) "nn.model.Type");
        Field term7718 = ((Class) term7719).getDeclaredField((String) "HIDDEN");
        ((Field) term7718).setAccessible(true);
        Object enum46 = ((Field) term7718).get((Object) null);
        ArrayList term7478 = new ArrayList();
        ((ArrayList) term7478).add((Object)null);
        ((ArrayList) term7478).add((Object)null);
        ((ArrayList) term7478).add((Object)null);
        Object term7474 = newInstance(Class.forName("nn.model.Node"));
        setField(term7474, term7474.getClass(), "type", enum46);
        setIntField(term7474, term7474.getClass(), "innovation", -1644358555);
        setField(term7474, term7474.getClass(), "connections", term7478);
        setDoubleField(term7474, term7474.getClass(), "bias", 0.3938367676460294);
        ArrayList term7484 = new ArrayList();
        Object term7482 = newInstance(Class.forName("nn.model.Node"));
        setField(term7482, term7482.getClass(), "type", enum45);
        setIntField(term7482, term7482.getClass(), "innovation", 1077223540);
        setField(term7482, term7482.getClass(), "connections", term7484);
        setDoubleField(term7482, term7482.getClass(), "bias", 0.15978842530590698);
        ArrayList term7490 = new ArrayList();
        ((ArrayList) term7490).add((Object)null);
        ((ArrayList) term7490).add((Object)null);
        ((ArrayList) term7490).add((Object)null);
        ((ArrayList) term7490).add((Object)null);
        ((ArrayList) term7490).add((Object)null);
        ((ArrayList) term7490).add((Object)null);
        Object term7488 = newInstance(Class.forName("nn.model.Node"));
        setField(term7488, term7488.getClass(), "type", enum45);
        setIntField(term7488, term7488.getClass(), "innovation", -974923743);
        setField(term7488, term7488.getClass(), "connections", term7490);
        setDoubleField(term7488, term7488.getClass(), "bias", 0.3426382336318774);
        ArrayList term7496 = new ArrayList();
        Object term7494 = newInstance(Class.forName("nn.model.Node"));
        setField(term7494, term7494.getClass(), "type", enum46);
        setIntField(term7494, term7494.getClass(), "innovation", -388591034);
        setField(term7494, term7494.getClass(), "connections", term7496);
        setDoubleField(term7494, term7494.getClass(), "bias", 0.8198571367447252);
        ArrayList term7456 = new ArrayList();
        ((ArrayList) term7456).add(term7458);
        ((ArrayList) term7456).add(term7466);
        ((ArrayList) term7456).add(term7474);
        ((ArrayList) term7456).add(term7482);
        ((ArrayList) term7456).add(term7488);
        ((ArrayList) term7456).add(term7494);
        ((ArrayList) term7456).add(term7482);
        ((ArrayList) term7456).add(term7482);
        Object term7504 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7504, term7504.getClass(), "in", null);
        setField(term7504, term7504.getClass(), "out", null);
        setFloatField(term7504, term7504.getClass(), "weight", 0.0F);
        setBooleanField(term7504, term7504.getClass(), "expressed", false);
        setIntField(term7504, term7504.getClass(), "innovation", 0);
        Object term7508 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7508, term7508.getClass(), "in", null);
        setField(term7508, term7508.getClass(), "out", null);
        setFloatField(term7508, term7508.getClass(), "weight", 0.0F);
        setBooleanField(term7508, term7508.getClass(), "expressed", false);
        setIntField(term7508, term7508.getClass(), "innovation", 0);
        Object term7512 = newInstance(Class.forName("nn.model.Connection"));
        Object term7513 = newInstance(Class.forName("nn.model.Node"));
        setField(term7512, term7512.getClass(), "in", term7466);
        setField(term7513, term7513.getClass(), "type", enum44);
        setIntField(term7513, term7513.getClass(), "innovation", 924095007);
        setField(term7513, term7513.getClass(), "connections", null);
        setDoubleField(term7513, term7513.getClass(), "bias", 0.25562338666414663);
        setField(term7512, term7512.getClass(), "out", term7513);
        setFloatField(term7512, term7512.getClass(), "weight", 0.61838096F);
        setBooleanField(term7512, term7512.getClass(), "expressed", false);
        setIntField(term7512, term7512.getClass(), "innovation", 1302110708);
        Object term7519 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7519, term7519.getClass(), "in", term7474);
        setField(term7519, term7519.getClass(), "out", term7494);
        setFloatField(term7519, term7519.getClass(), "weight", 0.076844275F);
        setBooleanField(term7519, term7519.getClass(), "expressed", false);
        setIntField(term7519, term7519.getClass(), "innovation", -1270258033);
        Object term7523 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7523, term7523.getClass(), "in", null);
        setField(term7523, term7523.getClass(), "out", null);
        setFloatField(term7523, term7523.getClass(), "weight", 0.0F);
        setBooleanField(term7523, term7523.getClass(), "expressed", false);
        setIntField(term7523, term7523.getClass(), "innovation", 0);
        ArrayList term7502 = new ArrayList();
        ((ArrayList) term7502).add(term7504);
        ((ArrayList) term7502).add(term7508);
        ((ArrayList) term7502).add(term7512);
        ((ArrayList) term7502).add(term7519);
        ((ArrayList) term7502).add(term7523);
        term7455 = newInstance(Class.forName("nn.model.Genome"));
        Object term7529 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term7531 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term7533 = newInstance(Class.forName("java.util.Random"));
        Object term7534 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term7455, term7455.getClass(), "nodes", term7456);
        setField(term7455, term7455.getClass(), "connections", term7502);
        setIntField(term7529, term7529.getClass(), "counter", 100);
        setField(term7455, term7455.getClass(), "nodeInnovator", term7529);
        setIntField(term7531, term7531.getClass(), "counter", 100);
        setField(term7455, term7455.getClass(), "connectionInnovator", term7531);
        setLongField(term7534, term7534.getClass(), "value", 165278171261373L);
        setField(term7533, term7533.getClass(), "seed", term7534);
        setDoubleField(term7533, term7533.getClass(), "nextNextGaussian", 0.9147378755448754);
        setBooleanField(term7533, term7533.getClass(), "haveNextNextGaussian", true);
        setField(term7455, term7455.getClass(), "random", term7533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7455, args);
    }

};


