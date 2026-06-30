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
     Object term8483;

    public Genome_makeConnectionWeightMutation_8756011726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8571 = Class.forName((String) "nn.model.Type");
        Field term8570 = ((Class) term8571).getDeclaredField((String) "HIDDEN");
        ((Field) term8570).setAccessible(true);
        Object enum46 = ((Field) term8570).get((Object) null);
        ArrayList term8490 = new ArrayList();
        ((ArrayList) term8490).add((Object)null);
        ((ArrayList) term8490).add((Object)null);
        ((ArrayList) term8490).add((Object)null);
        ((ArrayList) term8490).add((Object)null);
        ((ArrayList) term8490).add((Object)null);
        ((ArrayList) term8490).add((Object)null);
        ((ArrayList) term8490).add((Object)null);
        Object term8486 = newInstance(Class.forName("nn.model.Node"));
        setField(term8486, term8486.getClass(), "type", enum46);
        setIntField(term8486, term8486.getClass(), "innovation", 695052304);
        setField(term8486, term8486.getClass(), "connections", term8490);
        setDoubleField(term8486, term8486.getClass(), "bias", 0.3426382336318774);
        Class<? extends Object> term8661 = Class.forName((String) "nn.model.Type");
        Field term8660 = ((Class) term8661).getDeclaredField((String) "HIDDEN");
        ((Field) term8660).setAccessible(true);
        Object enum47 = ((Field) term8660).get((Object) null);
        ArrayList term8498 = new ArrayList();
        ((ArrayList) term8498).add((Object)null);
        ((ArrayList) term8498).add((Object)null);
        ((ArrayList) term8498).add((Object)null);
        Object term8494 = newInstance(Class.forName("nn.model.Node"));
        setField(term8494, term8494.getClass(), "type", enum47);
        setIntField(term8494, term8494.getClass(), "innovation", -1414233013);
        setField(term8494, term8494.getClass(), "connections", term8498);
        setDoubleField(term8494, term8494.getClass(), "bias", 0.15978842530590698);
        ArrayList term8504 = new ArrayList();
        ((ArrayList) term8504).add((Object)null);
        ((ArrayList) term8504).add((Object)null);
        Object term8502 = newInstance(Class.forName("nn.model.Node"));
        setField(term8502, term8502.getClass(), "type", enum47);
        setIntField(term8502, term8502.getClass(), "innovation", -1661200819);
        setField(term8502, term8502.getClass(), "connections", term8504);
        setDoubleField(term8502, term8502.getClass(), "bias", 0.5174310198002574);
        ArrayList term8510 = new ArrayList();
        ((ArrayList) term8510).add((Object)null);
        ((ArrayList) term8510).add((Object)null);
        ((ArrayList) term8510).add((Object)null);
        ((ArrayList) term8510).add((Object)null);
        ((ArrayList) term8510).add((Object)null);
        ((ArrayList) term8510).add((Object)null);
        ((ArrayList) term8510).add((Object)null);
        Object term8508 = newInstance(Class.forName("nn.model.Node"));
        setField(term8508, term8508.getClass(), "type", enum46);
        setIntField(term8508, term8508.getClass(), "innovation", -179937218);
        setField(term8508, term8508.getClass(), "connections", term8510);
        setDoubleField(term8508, term8508.getClass(), "bias", 0.25562338666414663);
        ArrayList term8516 = new ArrayList();
        Object term8514 = newInstance(Class.forName("nn.model.Node"));
        setField(term8514, term8514.getClass(), "type", enum46);
        setIntField(term8514, term8514.getClass(), "innovation", -1174440096);
        setField(term8514, term8514.getClass(), "connections", term8516);
        setDoubleField(term8514, term8514.getClass(), "bias", 0.3938367676460294);
        Class<? extends Object> term8751 = Class.forName((String) "nn.model.Type");
        Field term8750 = ((Class) term8751).getDeclaredField((String) "HIDDEN");
        ((Field) term8750).setAccessible(true);
        Object enum48 = ((Field) term8750).get((Object) null);
        ArrayList term8524 = new ArrayList();
        ((ArrayList) term8524).add((Object)null);
        ((ArrayList) term8524).add((Object)null);
        Object term8520 = newInstance(Class.forName("nn.model.Node"));
        setField(term8520, term8520.getClass(), "type", enum48);
        setIntField(term8520, term8520.getClass(), "innovation", -191639503);
        setField(term8520, term8520.getClass(), "connections", term8524);
        setDoubleField(term8520, term8520.getClass(), "bias", 0.4446537162968065);
        ArrayList term8484 = new ArrayList();
        ((ArrayList) term8484).add(term8486);
        ((ArrayList) term8484).add(term8494);
        ((ArrayList) term8484).add(term8502);
        ((ArrayList) term8484).add(term8508);
        ((ArrayList) term8484).add(term8514);
        ((ArrayList) term8484).add(term8502);
        ((ArrayList) term8484).add(term8502);
        ((ArrayList) term8484).add(term8520);
        Object term8532 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8532, term8532.getClass(), "in", null);
        setField(term8532, term8532.getClass(), "out", null);
        setFloatField(term8532, term8532.getClass(), "weight", 0.0F);
        setBooleanField(term8532, term8532.getClass(), "expressed", false);
        setIntField(term8532, term8532.getClass(), "innovation", 0);
        Object term8536 = newInstance(Class.forName("nn.model.Connection"));
        Object term8537 = newInstance(Class.forName("nn.model.Node"));
        setField(term8537, term8537.getClass(), "type", enum47);
        setIntField(term8537, term8537.getClass(), "innovation", 940896043);
        setField(term8537, term8537.getClass(), "connections", null);
        setDoubleField(term8537, term8537.getClass(), "bias", 0.8872393368594799);
        setField(term8536, term8536.getClass(), "in", term8537);
        setField(term8536, term8536.getClass(), "out", term8520);
        setFloatField(term8536, term8536.getClass(), "weight", 0.12826473F);
        setBooleanField(term8536, term8536.getClass(), "expressed", false);
        setIntField(term8536, term8536.getClass(), "innovation", -1563700756);
        Object term8543 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8543, term8543.getClass(), "in", null);
        setField(term8543, term8543.getClass(), "out", null);
        setFloatField(term8543, term8543.getClass(), "weight", 0.0F);
        setBooleanField(term8543, term8543.getClass(), "expressed", false);
        setIntField(term8543, term8543.getClass(), "innovation", 0);
        Object term8547 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8547, term8547.getClass(), "in", null);
        setField(term8547, term8547.getClass(), "out", null);
        setFloatField(term8547, term8547.getClass(), "weight", 0.0F);
        setBooleanField(term8547, term8547.getClass(), "expressed", false);
        setIntField(term8547, term8547.getClass(), "innovation", 0);
        Object term8551 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8551, term8551.getClass(), "in", term8494);
        setField(term8551, term8551.getClass(), "out", term8514);
        setFloatField(term8551, term8551.getClass(), "weight", 0.64149946F);
        setBooleanField(term8551, term8551.getClass(), "expressed", true);
        setIntField(term8551, term8551.getClass(), "innovation", -679614653);
        Object term8555 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8555, term8555.getClass(), "in", null);
        setField(term8555, term8555.getClass(), "out", null);
        setFloatField(term8555, term8555.getClass(), "weight", 0.0F);
        setBooleanField(term8555, term8555.getClass(), "expressed", false);
        setIntField(term8555, term8555.getClass(), "innovation", 0);
        ArrayList term8530 = new ArrayList();
        ((ArrayList) term8530).add(term8532);
        ((ArrayList) term8530).add(term8536);
        ((ArrayList) term8530).add(term8543);
        ((ArrayList) term8530).add(term8547);
        ((ArrayList) term8530).add(term8551);
        ((ArrayList) term8530).add(term8555);
        ((ArrayList) term8530).add(term8536);
        ((ArrayList) term8530).add(term8532);
        term8483 = newInstance(Class.forName("nn.model.Genome"));
        Object term8561 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term8563 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term8565 = newInstance(Class.forName("java.util.Random"));
        Object term8566 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term8483, term8483.getClass(), "nodes", term8484);
        setField(term8483, term8483.getClass(), "connections", term8530);
        setIntField(term8561, term8561.getClass(), "counter", 100);
        setField(term8483, term8483.getClass(), "nodeInnovator", term8561);
        setIntField(term8563, term8563.getClass(), "counter", 100);
        setField(term8483, term8483.getClass(), "connectionInnovator", term8563);
        setLongField(term8566, term8566.getClass(), "value", 152454768042004L);
        setField(term8565, term8565.getClass(), "seed", term8566);
        setDoubleField(term8565, term8565.getClass(), "nextNextGaussian", 0.27472560177149286);
        setBooleanField(term8565, term8565.getClass(), "haveNextNextGaussian", false);
        setField(term8483, term8483.getClass(), "random", term8565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makeConnectionWeightMutation", argTypes, term8483, args);
    }

};


