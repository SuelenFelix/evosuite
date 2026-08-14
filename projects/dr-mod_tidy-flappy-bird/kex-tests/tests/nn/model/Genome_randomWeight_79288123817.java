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

public class Genome_randomWeight_79288123817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8634;

    public Genome_randomWeight_79288123817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8695 = Class.forName((String) "nn.model.Type");
        Field term8694 = ((Class) term8695).getDeclaredField((String) "SENSOR");
        ((Field) term8694).setAccessible(true);
        Object enum54 = ((Field) term8694).get((Object) null);
        ArrayList term8641 = new ArrayList();
        ((ArrayList) term8641).add((Object)null);
        ((ArrayList) term8641).add((Object)null);
        Object term8637 = newInstance(Class.forName("nn.model.Node"));
        setField(term8637, term8637.getClass(), "type", enum54);
        setIntField(term8637, term8637.getClass(), "innovation", -1749591213);
        setField(term8637, term8637.getClass(), "connections", term8641);
        setDoubleField(term8637, term8637.getClass(), "bias", 0.555720831263745);
        Class<? extends Object> term8785 = Class.forName((String) "nn.model.Type");
        Field term8784 = ((Class) term8785).getDeclaredField((String) "HIDDEN");
        ((Field) term8784).setAccessible(true);
        Object enum55 = ((Field) term8784).get((Object) null);
        ArrayList term8649 = new ArrayList();
        ((ArrayList) term8649).add((Object)null);
        ((ArrayList) term8649).add((Object)null);
        ((ArrayList) term8649).add((Object)null);
        ((ArrayList) term8649).add((Object)null);
        ((ArrayList) term8649).add((Object)null);
        ((ArrayList) term8649).add((Object)null);
        ((ArrayList) term8649).add((Object)null);
        ((ArrayList) term8649).add((Object)null);
        Object term8645 = newInstance(Class.forName("nn.model.Node"));
        setField(term8645, term8645.getClass(), "type", enum55);
        setIntField(term8645, term8645.getClass(), "innovation", -746950289);
        setField(term8645, term8645.getClass(), "connections", term8649);
        setDoubleField(term8645, term8645.getClass(), "bias", 0.8296938655870651);
        ArrayList term8635 = new ArrayList();
        ((ArrayList) term8635).add(term8637);
        ((ArrayList) term8635).add(term8645);
        Object term8657 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8657, term8657.getClass(), "in", null);
        setField(term8657, term8657.getClass(), "out", null);
        setFloatField(term8657, term8657.getClass(), "weight", 0.0F);
        setBooleanField(term8657, term8657.getClass(), "expressed", false);
        setIntField(term8657, term8657.getClass(), "innovation", 0);
        Object term8661 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8661, term8661.getClass(), "in", null);
        setField(term8661, term8661.getClass(), "out", null);
        setFloatField(term8661, term8661.getClass(), "weight", 0.0F);
        setBooleanField(term8661, term8661.getClass(), "expressed", false);
        setIntField(term8661, term8661.getClass(), "innovation", 0);
        Object term8665 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8665, term8665.getClass(), "in", null);
        setField(term8665, term8665.getClass(), "out", null);
        setFloatField(term8665, term8665.getClass(), "weight", 0.0F);
        setBooleanField(term8665, term8665.getClass(), "expressed", false);
        setIntField(term8665, term8665.getClass(), "innovation", 0);
        Object term8669 = newInstance(Class.forName("nn.model.Connection"));
        Object term8670 = newInstance(Class.forName("nn.model.Node"));
        Object term8673 = newInstance(Class.forName("nn.model.Node"));
        setField(term8670, term8670.getClass(), "type", null);
        setIntField(term8670, term8670.getClass(), "innovation", 47607734);
        setField(term8670, term8670.getClass(), "connections", null);
        setDoubleField(term8670, term8670.getClass(), "bias", 0.6560878972868479);
        setField(term8669, term8669.getClass(), "in", term8670);
        setField(term8673, term8673.getClass(), "type", enum54);
        setIntField(term8673, term8673.getClass(), "innovation", 328631288);
        setField(term8673, term8673.getClass(), "connections", null);
        setDoubleField(term8673, term8673.getClass(), "bias", 0.49164780269698416);
        setField(term8669, term8669.getClass(), "out", term8673);
        setFloatField(term8669, term8669.getClass(), "weight", 0.12826473F);
        setBooleanField(term8669, term8669.getClass(), "expressed", true);
        setIntField(term8669, term8669.getClass(), "innovation", -1631415805);
        Object term8679 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8679, term8679.getClass(), "in", null);
        setField(term8679, term8679.getClass(), "out", null);
        setFloatField(term8679, term8679.getClass(), "weight", 0.0F);
        setBooleanField(term8679, term8679.getClass(), "expressed", false);
        setIntField(term8679, term8679.getClass(), "innovation", 0);
        ArrayList term8655 = new ArrayList();
        ((ArrayList) term8655).add(term8657);
        ((ArrayList) term8655).add(term8661);
        ((ArrayList) term8655).add(term8665);
        ((ArrayList) term8655).add(term8669);
        ((ArrayList) term8655).add(term8679);
        ((ArrayList) term8655).add(term8657);
        term8634 = newInstance(Class.forName("nn.model.Genome"));
        Object term8685 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term8687 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term8689 = newInstance(Class.forName("java.util.Random"));
        Object term8690 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term8634, term8634.getClass(), "nodes", term8635);
        setField(term8634, term8634.getClass(), "connections", term8655);
        setIntField(term8685, term8685.getClass(), "counter", 100);
        setField(term8634, term8634.getClass(), "nodeInnovator", term8685);
        setIntField(term8687, term8687.getClass(), "counter", 100);
        setField(term8634, term8634.getClass(), "connectionInnovator", term8687);
        setLongField(term8690, term8690.getClass(), "value", 91549237377048L);
        setField(term8689, term8689.getClass(), "seed", term8690);
        setDoubleField(term8689, term8689.getClass(), "nextNextGaussian", 0.008961627061484845);
        setBooleanField(term8689, term8689.getClass(), "haveNextNextGaussian", true);
        setField(term8634, term8634.getClass(), "random", term8689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "randomWeight", argTypes, term8634, args);
    }

};


