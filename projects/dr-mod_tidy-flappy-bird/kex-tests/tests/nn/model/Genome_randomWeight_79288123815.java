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

public class Genome_randomWeight_79288123815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10265;

    public Genome_randomWeight_79288123815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10356 = Class.forName((String) "nn.model.Type");
        Field term10355 = ((Class) term10356).getDeclaredField((String) "HIDDEN");
        ((Field) term10355).setAccessible(true);
        Object enum60 = ((Field) term10355).get((Object) null);
        ArrayList term10272 = new ArrayList();
        ((ArrayList) term10272).add((Object)null);
        ((ArrayList) term10272).add((Object)null);
        ((ArrayList) term10272).add((Object)null);
        ((ArrayList) term10272).add((Object)null);
        ((ArrayList) term10272).add((Object)null);
        ((ArrayList) term10272).add((Object)null);
        Object term10268 = newInstance(Class.forName("nn.model.Node"));
        setField(term10268, term10268.getClass(), "type", enum60);
        setIntField(term10268, term10268.getClass(), "innovation", -1235127374);
        setField(term10268, term10268.getClass(), "connections", term10272);
        setDoubleField(term10268, term10268.getClass(), "bias", 0.7412534377270371);
        Class<? extends Object> term10446 = Class.forName((String) "nn.model.Type");
        Field term10445 = ((Class) term10446).getDeclaredField((String) "OUTPUT");
        ((Field) term10445).setAccessible(true);
        Object enum61 = ((Field) term10445).get((Object) null);
        ArrayList term10280 = new ArrayList();
        Object term10276 = newInstance(Class.forName("nn.model.Node"));
        setField(term10276, term10276.getClass(), "type", enum61);
        setIntField(term10276, term10276.getClass(), "innovation", 961252909);
        setField(term10276, term10276.getClass(), "connections", term10280);
        setDoubleField(term10276, term10276.getClass(), "bias", 0.33650824379057453);
        Class<? extends Object> term10536 = Class.forName((String) "nn.model.Type");
        Field term10535 = ((Class) term10536).getDeclaredField((String) "HIDDEN");
        ((Field) term10535).setAccessible(true);
        Object enum62 = ((Field) term10535).get((Object) null);
        ArrayList term10288 = new ArrayList();
        ((ArrayList) term10288).add((Object)null);
        ((ArrayList) term10288).add((Object)null);
        ((ArrayList) term10288).add((Object)null);
        ((ArrayList) term10288).add((Object)null);
        ((ArrayList) term10288).add((Object)null);
        ((ArrayList) term10288).add((Object)null);
        ((ArrayList) term10288).add((Object)null);
        ((ArrayList) term10288).add((Object)null);
        Object term10284 = newInstance(Class.forName("nn.model.Node"));
        setField(term10284, term10284.getClass(), "type", enum62);
        setIntField(term10284, term10284.getClass(), "innovation", -2077814162);
        setField(term10284, term10284.getClass(), "connections", term10288);
        setDoubleField(term10284, term10284.getClass(), "bias", 0.2170446731874749);
        ArrayList term10294 = new ArrayList();
        ((ArrayList) term10294).add((Object)null);
        ((ArrayList) term10294).add((Object)null);
        ((ArrayList) term10294).add((Object)null);
        Object term10292 = newInstance(Class.forName("nn.model.Node"));
        setField(term10292, term10292.getClass(), "type", enum60);
        setIntField(term10292, term10292.getClass(), "innovation", 923905351);
        setField(term10292, term10292.getClass(), "connections", term10294);
        setDoubleField(term10292, term10292.getClass(), "bias", 0.49591925980210916);
        ArrayList term10300 = new ArrayList();
        ((ArrayList) term10300).add((Object)null);
        ((ArrayList) term10300).add((Object)null);
        ((ArrayList) term10300).add((Object)null);
        ((ArrayList) term10300).add((Object)null);
        ((ArrayList) term10300).add((Object)null);
        ((ArrayList) term10300).add((Object)null);
        ((ArrayList) term10300).add((Object)null);
        ((ArrayList) term10300).add((Object)null);
        ((ArrayList) term10300).add((Object)null);
        Object term10298 = newInstance(Class.forName("nn.model.Node"));
        setField(term10298, term10298.getClass(), "type", enum60);
        setIntField(term10298, term10298.getClass(), "innovation", 631528579);
        setField(term10298, term10298.getClass(), "connections", term10300);
        setDoubleField(term10298, term10298.getClass(), "bias", 0.9306262668515027);
        ArrayList term10266 = new ArrayList();
        ((ArrayList) term10266).add(term10268);
        ((ArrayList) term10266).add(term10276);
        ((ArrayList) term10266).add(term10284);
        ((ArrayList) term10266).add(term10292);
        ((ArrayList) term10266).add(term10298);
        Object term10308 = newInstance(Class.forName("nn.model.Connection"));
        Object term10309 = newInstance(Class.forName("nn.model.Node"));
        setField(term10309, term10309.getClass(), "type", enum61);
        setIntField(term10309, term10309.getClass(), "innovation", -147055177);
        setField(term10309, term10309.getClass(), "connections", null);
        setDoubleField(term10309, term10309.getClass(), "bias", 0.7120592018058269);
        setField(term10308, term10308.getClass(), "in", term10309);
        setField(term10308, term10308.getClass(), "out", term10298);
        setFloatField(term10308, term10308.getClass(), "weight", 0.51753795F);
        setBooleanField(term10308, term10308.getClass(), "expressed", true);
        setIntField(term10308, term10308.getClass(), "innovation", -1652091834);
        Object term10315 = newInstance(Class.forName("nn.model.Connection"));
        Object term10316 = newInstance(Class.forName("nn.model.Node"));
        Object term10319 = newInstance(Class.forName("nn.model.Node"));
        setField(term10316, term10316.getClass(), "type", enum62);
        setIntField(term10316, term10316.getClass(), "innovation", 444514470);
        setField(term10316, term10316.getClass(), "connections", null);
        setDoubleField(term10316, term10316.getClass(), "bias", 0.3897971128913206);
        setField(term10315, term10315.getClass(), "in", term10316);
        setField(term10319, term10319.getClass(), "type", enum62);
        setIntField(term10319, term10319.getClass(), "innovation", -282021579);
        setField(term10319, term10319.getClass(), "connections", null);
        setDoubleField(term10319, term10319.getClass(), "bias", 0.697625539365438);
        setField(term10315, term10315.getClass(), "out", term10319);
        setFloatField(term10315, term10315.getClass(), "weight", 0.9172358F);
        setBooleanField(term10315, term10315.getClass(), "expressed", false);
        setIntField(term10315, term10315.getClass(), "innovation", -1652588127);
        Object term10325 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10325, term10325.getClass(), "in", null);
        setField(term10325, term10325.getClass(), "out", null);
        setFloatField(term10325, term10325.getClass(), "weight", 0.0F);
        setBooleanField(term10325, term10325.getClass(), "expressed", false);
        setIntField(term10325, term10325.getClass(), "innovation", 0);
        Object term10329 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10329, term10329.getClass(), "in", null);
        setField(term10329, term10329.getClass(), "out", null);
        setFloatField(term10329, term10329.getClass(), "weight", 0.0F);
        setBooleanField(term10329, term10329.getClass(), "expressed", false);
        setIntField(term10329, term10329.getClass(), "innovation", 0);
        Object term10333 = newInstance(Class.forName("nn.model.Connection"));
        Object term10334 = newInstance(Class.forName("nn.model.Node"));
        setField(term10333, term10333.getClass(), "in", term10284);
        setField(term10334, term10334.getClass(), "type", enum61);
        setIntField(term10334, term10334.getClass(), "innovation", 1349806561);
        setField(term10334, term10334.getClass(), "connections", null);
        setDoubleField(term10334, term10334.getClass(), "bias", 0.5191680850819778);
        setField(term10333, term10333.getClass(), "out", term10334);
        setFloatField(term10333, term10333.getClass(), "weight", 0.34114075F);
        setBooleanField(term10333, term10333.getClass(), "expressed", false);
        setIntField(term10333, term10333.getClass(), "innovation", -1902823385);
        Object term10340 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10340, term10340.getClass(), "in", null);
        setField(term10340, term10340.getClass(), "out", null);
        setFloatField(term10340, term10340.getClass(), "weight", 0.0F);
        setBooleanField(term10340, term10340.getClass(), "expressed", false);
        setIntField(term10340, term10340.getClass(), "innovation", 0);
        ArrayList term10306 = new ArrayList();
        ((ArrayList) term10306).add(term10308);
        ((ArrayList) term10306).add(term10315);
        ((ArrayList) term10306).add(term10325);
        ((ArrayList) term10306).add(term10329);
        ((ArrayList) term10306).add(term10333);
        ((ArrayList) term10306).add(term10340);
        term10265 = newInstance(Class.forName("nn.model.Genome"));
        Object term10346 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10348 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10350 = newInstance(Class.forName("java.util.Random"));
        Object term10351 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10265, term10265.getClass(), "nodes", term10266);
        setField(term10265, term10265.getClass(), "connections", term10306);
        setIntField(term10346, term10346.getClass(), "counter", 100);
        setField(term10265, term10265.getClass(), "nodeInnovator", term10346);
        setIntField(term10348, term10348.getClass(), "counter", 100);
        setField(term10265, term10265.getClass(), "connectionInnovator", term10348);
        setLongField(term10351, term10351.getClass(), "value", 119904568754612L);
        setField(term10350, term10350.getClass(), "seed", term10351);
        setDoubleField(term10350, term10350.getClass(), "nextNextGaussian", 0.2610608910723019);
        setBooleanField(term10350, term10350.getClass(), "haveNextNextGaussian", true);
        setField(term10265, term10265.getClass(), "random", term10350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "randomWeight", argTypes, term10265, args);
    }

};


