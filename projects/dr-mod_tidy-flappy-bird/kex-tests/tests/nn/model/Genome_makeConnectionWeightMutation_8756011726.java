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

public class Genome_makeConnectionWeightMutation_8756011726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8485;

    public Genome_makeConnectionWeightMutation_8756011726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8573 = Class.forName((String) "nn.model.Type");
        Field term8572 = ((Class) term8573).getDeclaredField((String) "HIDDEN");
        ((Field) term8572).setAccessible(true);
        Object enum46 = ((Field) term8572).get((Object) null);
        ArrayList term8492 = new ArrayList();
        ((ArrayList) term8492).add((Object)null);
        ((ArrayList) term8492).add((Object)null);
        ((ArrayList) term8492).add((Object)null);
        ((ArrayList) term8492).add((Object)null);
        ((ArrayList) term8492).add((Object)null);
        ((ArrayList) term8492).add((Object)null);
        ((ArrayList) term8492).add((Object)null);
        Object term8488 = newInstance(Class.forName("nn.model.Node"));
        setField(term8488, term8488.getClass(), "type", enum46);
        setIntField(term8488, term8488.getClass(), "innovation", 695052304);
        setField(term8488, term8488.getClass(), "connections", term8492);
        setDoubleField(term8488, term8488.getClass(), "bias", 0.3426382336318774);
        Class<? extends Object> term8663 = Class.forName((String) "nn.model.Type");
        Field term8662 = ((Class) term8663).getDeclaredField((String) "HIDDEN");
        ((Field) term8662).setAccessible(true);
        Object enum47 = ((Field) term8662).get((Object) null);
        ArrayList term8500 = new ArrayList();
        ((ArrayList) term8500).add((Object)null);
        ((ArrayList) term8500).add((Object)null);
        ((ArrayList) term8500).add((Object)null);
        Object term8496 = newInstance(Class.forName("nn.model.Node"));
        setField(term8496, term8496.getClass(), "type", enum47);
        setIntField(term8496, term8496.getClass(), "innovation", -1414233013);
        setField(term8496, term8496.getClass(), "connections", term8500);
        setDoubleField(term8496, term8496.getClass(), "bias", 0.15978842530590698);
        ArrayList term8506 = new ArrayList();
        ((ArrayList) term8506).add((Object)null);
        ((ArrayList) term8506).add((Object)null);
        Object term8504 = newInstance(Class.forName("nn.model.Node"));
        setField(term8504, term8504.getClass(), "type", enum47);
        setIntField(term8504, term8504.getClass(), "innovation", -1661200819);
        setField(term8504, term8504.getClass(), "connections", term8506);
        setDoubleField(term8504, term8504.getClass(), "bias", 0.5174310198002574);
        ArrayList term8512 = new ArrayList();
        ((ArrayList) term8512).add((Object)null);
        ((ArrayList) term8512).add((Object)null);
        ((ArrayList) term8512).add((Object)null);
        ((ArrayList) term8512).add((Object)null);
        ((ArrayList) term8512).add((Object)null);
        ((ArrayList) term8512).add((Object)null);
        ((ArrayList) term8512).add((Object)null);
        Object term8510 = newInstance(Class.forName("nn.model.Node"));
        setField(term8510, term8510.getClass(), "type", enum46);
        setIntField(term8510, term8510.getClass(), "innovation", -179937218);
        setField(term8510, term8510.getClass(), "connections", term8512);
        setDoubleField(term8510, term8510.getClass(), "bias", 0.25562338666414663);
        ArrayList term8518 = new ArrayList();
        Object term8516 = newInstance(Class.forName("nn.model.Node"));
        setField(term8516, term8516.getClass(), "type", enum46);
        setIntField(term8516, term8516.getClass(), "innovation", -1174440096);
        setField(term8516, term8516.getClass(), "connections", term8518);
        setDoubleField(term8516, term8516.getClass(), "bias", 0.3938367676460294);
        Class<? extends Object> term8753 = Class.forName((String) "nn.model.Type");
        Field term8752 = ((Class) term8753).getDeclaredField((String) "HIDDEN");
        ((Field) term8752).setAccessible(true);
        Object enum48 = ((Field) term8752).get((Object) null);
        ArrayList term8526 = new ArrayList();
        ((ArrayList) term8526).add((Object)null);
        ((ArrayList) term8526).add((Object)null);
        Object term8522 = newInstance(Class.forName("nn.model.Node"));
        setField(term8522, term8522.getClass(), "type", enum48);
        setIntField(term8522, term8522.getClass(), "innovation", -191639503);
        setField(term8522, term8522.getClass(), "connections", term8526);
        setDoubleField(term8522, term8522.getClass(), "bias", 0.4446537162968065);
        ArrayList term8486 = new ArrayList();
        ((ArrayList) term8486).add(term8488);
        ((ArrayList) term8486).add(term8496);
        ((ArrayList) term8486).add(term8504);
        ((ArrayList) term8486).add(term8510);
        ((ArrayList) term8486).add(term8516);
        ((ArrayList) term8486).add(term8504);
        ((ArrayList) term8486).add(term8504);
        ((ArrayList) term8486).add(term8522);
        Object term8534 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8534, term8534.getClass(), "in", null);
        setField(term8534, term8534.getClass(), "out", null);
        setFloatField(term8534, term8534.getClass(), "weight", 0.0F);
        setBooleanField(term8534, term8534.getClass(), "expressed", false);
        setIntField(term8534, term8534.getClass(), "innovation", 0);
        Object term8538 = newInstance(Class.forName("nn.model.Connection"));
        Object term8539 = newInstance(Class.forName("nn.model.Node"));
        setField(term8539, term8539.getClass(), "type", enum47);
        setIntField(term8539, term8539.getClass(), "innovation", 940896043);
        setField(term8539, term8539.getClass(), "connections", null);
        setDoubleField(term8539, term8539.getClass(), "bias", 0.8872393368594799);
        setField(term8538, term8538.getClass(), "in", term8539);
        setField(term8538, term8538.getClass(), "out", term8522);
        setFloatField(term8538, term8538.getClass(), "weight", 0.12826473F);
        setBooleanField(term8538, term8538.getClass(), "expressed", false);
        setIntField(term8538, term8538.getClass(), "innovation", -1563700756);
        Object term8545 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8545, term8545.getClass(), "in", null);
        setField(term8545, term8545.getClass(), "out", null);
        setFloatField(term8545, term8545.getClass(), "weight", 0.0F);
        setBooleanField(term8545, term8545.getClass(), "expressed", false);
        setIntField(term8545, term8545.getClass(), "innovation", 0);
        Object term8549 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8549, term8549.getClass(), "in", null);
        setField(term8549, term8549.getClass(), "out", null);
        setFloatField(term8549, term8549.getClass(), "weight", 0.0F);
        setBooleanField(term8549, term8549.getClass(), "expressed", false);
        setIntField(term8549, term8549.getClass(), "innovation", 0);
        Object term8553 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8553, term8553.getClass(), "in", term8496);
        setField(term8553, term8553.getClass(), "out", term8516);
        setFloatField(term8553, term8553.getClass(), "weight", 0.64149946F);
        setBooleanField(term8553, term8553.getClass(), "expressed", true);
        setIntField(term8553, term8553.getClass(), "innovation", -679614653);
        Object term8557 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8557, term8557.getClass(), "in", null);
        setField(term8557, term8557.getClass(), "out", null);
        setFloatField(term8557, term8557.getClass(), "weight", 0.0F);
        setBooleanField(term8557, term8557.getClass(), "expressed", false);
        setIntField(term8557, term8557.getClass(), "innovation", 0);
        ArrayList term8532 = new ArrayList();
        ((ArrayList) term8532).add(term8534);
        ((ArrayList) term8532).add(term8538);
        ((ArrayList) term8532).add(term8545);
        ((ArrayList) term8532).add(term8549);
        ((ArrayList) term8532).add(term8553);
        ((ArrayList) term8532).add(term8557);
        ((ArrayList) term8532).add(term8538);
        ((ArrayList) term8532).add(term8534);
        term8485 = newInstance(Class.forName("nn.model.Genome"));
        Object term8563 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term8565 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term8567 = newInstance(Class.forName("java.util.Random"));
        Object term8568 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term8485, term8485.getClass(), "nodes", term8486);
        setField(term8485, term8485.getClass(), "connections", term8532);
        setIntField(term8563, term8563.getClass(), "counter", 100);
        setField(term8485, term8485.getClass(), "nodeInnovator", term8563);
        setIntField(term8565, term8565.getClass(), "counter", 100);
        setField(term8485, term8485.getClass(), "connectionInnovator", term8565);
        setLongField(term8568, term8568.getClass(), "value", 40628812639678L);
        setField(term8567, term8567.getClass(), "seed", term8568);
        setDoubleField(term8567, term8567.getClass(), "nextNextGaussian", 0.27472560177149286);
        setBooleanField(term8567, term8567.getClass(), "haveNextNextGaussian", false);
        setField(term8485, term8485.getClass(), "random", term8567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makeConnectionWeightMutation", argTypes, term8485, args);
    }

};


