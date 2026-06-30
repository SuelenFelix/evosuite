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

public class Genome_makeConnectionWeightMutation_8756011728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6564;

    public Genome_makeConnectionWeightMutation_8756011728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6635 = Class.forName((String) "nn.model.Type");
        Field term6634 = ((Class) term6635).getDeclaredField((String) "HIDDEN");
        ((Field) term6634).setAccessible(true);
        Object enum37 = ((Field) term6634).get((Object) null);
        ArrayList term6571 = new ArrayList();
        ((ArrayList) term6571).add((Object)null);
        ((ArrayList) term6571).add((Object)null);
        ((ArrayList) term6571).add((Object)null);
        ((ArrayList) term6571).add((Object)null);
        ((ArrayList) term6571).add((Object)null);
        ((ArrayList) term6571).add((Object)null);
        ((ArrayList) term6571).add((Object)null);
        ((ArrayList) term6571).add((Object)null);
        ((ArrayList) term6571).add((Object)null);
        Object term6567 = newInstance(Class.forName("nn.model.Node"));
        setField(term6567, term6567.getClass(), "type", enum37);
        setIntField(term6567, term6567.getClass(), "innovation", -1514240086);
        setField(term6567, term6567.getClass(), "connections", term6571);
        setDoubleField(term6567, term6567.getClass(), "bias", 0.8181159806144095);
        Class<? extends Object> term6725 = Class.forName((String) "nn.model.Type");
        Field term6724 = ((Class) term6725).getDeclaredField((String) "SENSOR");
        ((Field) term6724).setAccessible(true);
        Object enum38 = ((Field) term6724).get((Object) null);
        ArrayList term6579 = new ArrayList();
        Object term6575 = newInstance(Class.forName("nn.model.Node"));
        setField(term6575, term6575.getClass(), "type", enum38);
        setIntField(term6575, term6575.getClass(), "innovation", -1784072578);
        setField(term6575, term6575.getClass(), "connections", term6579);
        setDoubleField(term6575, term6575.getClass(), "bias", 0.5199701231035306);
        ArrayList term6585 = new ArrayList();
        ((ArrayList) term6585).add((Object)null);
        ((ArrayList) term6585).add((Object)null);
        ((ArrayList) term6585).add((Object)null);
        ((ArrayList) term6585).add((Object)null);
        ((ArrayList) term6585).add((Object)null);
        ((ArrayList) term6585).add((Object)null);
        ((ArrayList) term6585).add((Object)null);
        ((ArrayList) term6585).add((Object)null);
        Object term6583 = newInstance(Class.forName("nn.model.Node"));
        setField(term6583, term6583.getClass(), "type", enum37);
        setIntField(term6583, term6583.getClass(), "innovation", -1763480506);
        setField(term6583, term6583.getClass(), "connections", term6585);
        setDoubleField(term6583, term6583.getClass(), "bias", 0.42942019398136533);
        Class<? extends Object> term6815 = Class.forName((String) "nn.model.Type");
        Field term6814 = ((Class) term6815).getDeclaredField((String) "HIDDEN");
        ((Field) term6814).setAccessible(true);
        Object enum39 = ((Field) term6814).get((Object) null);
        ArrayList term6593 = new ArrayList();
        ((ArrayList) term6593).add((Object)null);
        ((ArrayList) term6593).add((Object)null);
        Object term6589 = newInstance(Class.forName("nn.model.Node"));
        setField(term6589, term6589.getClass(), "type", enum39);
        setIntField(term6589, term6589.getClass(), "innovation", 941003590);
        setField(term6589, term6589.getClass(), "connections", term6593);
        setDoubleField(term6589, term6589.getClass(), "bias", 0.7217228545305664);
        ArrayList term6599 = new ArrayList();
        ((ArrayList) term6599).add((Object)null);
        ((ArrayList) term6599).add((Object)null);
        ((ArrayList) term6599).add((Object)null);
        Object term6597 = newInstance(Class.forName("nn.model.Node"));
        setField(term6597, term6597.getClass(), "type", enum37);
        setIntField(term6597, term6597.getClass(), "innovation", -1954937310);
        setField(term6597, term6597.getClass(), "connections", term6599);
        setDoubleField(term6597, term6597.getClass(), "bias", 0.3454040981366687);
        ArrayList term6605 = new ArrayList();
        ((ArrayList) term6605).add((Object)null);
        Object term6603 = newInstance(Class.forName("nn.model.Node"));
        setField(term6603, term6603.getClass(), "type", enum38);
        setIntField(term6603, term6603.getClass(), "innovation", 2052244839);
        setField(term6603, term6603.getClass(), "connections", term6605);
        setDoubleField(term6603, term6603.getClass(), "bias", 0.7813411062521521);
        ArrayList term6611 = new ArrayList();
        ((ArrayList) term6611).add((Object)null);
        Object term6609 = newInstance(Class.forName("nn.model.Node"));
        setField(term6609, term6609.getClass(), "type", enum37);
        setIntField(term6609, term6609.getClass(), "innovation", 413214164);
        setField(term6609, term6609.getClass(), "connections", term6611);
        setDoubleField(term6609, term6609.getClass(), "bias", 0.11683469250603162);
        ArrayList term6565 = new ArrayList();
        ((ArrayList) term6565).add(term6567);
        ((ArrayList) term6565).add(term6575);
        ((ArrayList) term6565).add(term6575);
        ((ArrayList) term6565).add(term6583);
        ((ArrayList) term6565).add(term6589);
        ((ArrayList) term6565).add(term6597);
        ((ArrayList) term6565).add(term6603);
        ((ArrayList) term6565).add(term6609);
        Object term6619 = newInstance(Class.forName("nn.model.Connection"));
        setField(term6619, term6619.getClass(), "in", null);
        setField(term6619, term6619.getClass(), "out", null);
        setFloatField(term6619, term6619.getClass(), "weight", 0.0F);
        setBooleanField(term6619, term6619.getClass(), "expressed", false);
        setIntField(term6619, term6619.getClass(), "innovation", 0);
        ArrayList term6617 = new ArrayList();
        ((ArrayList) term6617).add(term6619);
        ((ArrayList) term6617).add(term6619);
        term6564 = newInstance(Class.forName("nn.model.Genome"));
        Object term6625 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term6627 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term6629 = newInstance(Class.forName("java.util.Random"));
        Object term6630 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term6564, term6564.getClass(), "nodes", term6565);
        setField(term6564, term6564.getClass(), "connections", term6617);
        setIntField(term6625, term6625.getClass(), "counter", 100);
        setField(term6564, term6564.getClass(), "nodeInnovator", term6625);
        setIntField(term6627, term6627.getClass(), "counter", 100);
        setField(term6564, term6564.getClass(), "connectionInnovator", term6627);
        setLongField(term6630, term6630.getClass(), "value", 123799599092445L);
        setField(term6629, term6629.getClass(), "seed", term6630);
        setDoubleField(term6629, term6629.getClass(), "nextNextGaussian", 0.15011219154348843);
        setBooleanField(term6629, term6629.getClass(), "haveNextNextGaussian", false);
        setField(term6564, term6564.getClass(), "random", term6629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makeConnectionWeightMutation", argTypes, term6564, args);
    }

};


