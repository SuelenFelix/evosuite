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

public class Genome_setRandom_9533540314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10106;
     Object term10172;

    public Genome_setRandom_9533540314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10178 = Class.forName((String) "nn.model.Type");
        Field term10177 = ((Class) term10178).getDeclaredField((String) "HIDDEN");
        ((Field) term10177).setAccessible(true);
        Object enum59 = ((Field) term10177).get((Object) null);
        ArrayList term10113 = new ArrayList();
        ((ArrayList) term10113).add((Object)null);
        ((ArrayList) term10113).add((Object)null);
        Object term10109 = newInstance(Class.forName("nn.model.Node"));
        setField(term10109, term10109.getClass(), "type", enum59);
        setIntField(term10109, term10109.getClass(), "innovation", 241725499);
        setField(term10109, term10109.getClass(), "connections", term10113);
        setDoubleField(term10109, term10109.getClass(), "bias", 0.35949348580116536);
        ArrayList term10107 = new ArrayList();
        ((ArrayList) term10107).add(term10109);
        Object term10121 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10121, term10121.getClass(), "in", null);
        setField(term10121, term10121.getClass(), "out", null);
        setFloatField(term10121, term10121.getClass(), "weight", 0.0F);
        setBooleanField(term10121, term10121.getClass(), "expressed", false);
        setIntField(term10121, term10121.getClass(), "innovation", 0);
        Object term10125 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10125, term10125.getClass(), "in", null);
        setField(term10125, term10125.getClass(), "out", null);
        setFloatField(term10125, term10125.getClass(), "weight", 0.0F);
        setBooleanField(term10125, term10125.getClass(), "expressed", false);
        setIntField(term10125, term10125.getClass(), "innovation", 0);
        Object term10129 = newInstance(Class.forName("nn.model.Connection"));
        Object term10130 = newInstance(Class.forName("nn.model.Node"));
        Object term10133 = newInstance(Class.forName("nn.model.Node"));
        setField(term10130, term10130.getClass(), "type", enum59);
        setIntField(term10130, term10130.getClass(), "innovation", 1174484848);
        setField(term10130, term10130.getClass(), "connections", null);
        setDoubleField(term10130, term10130.getClass(), "bias", 0.9539599355783924);
        setField(term10129, term10129.getClass(), "in", term10130);
        setField(term10133, term10133.getClass(), "type", enum59);
        setIntField(term10133, term10133.getClass(), "innovation", -2024983877);
        setField(term10133, term10133.getClass(), "connections", null);
        setDoubleField(term10133, term10133.getClass(), "bias", 0.710793359488993);
        setField(term10129, term10129.getClass(), "out", term10133);
        setFloatField(term10129, term10129.getClass(), "weight", 0.24411172F);
        setBooleanField(term10129, term10129.getClass(), "expressed", true);
        setIntField(term10129, term10129.getClass(), "innovation", 1757149811);
        Object term10139 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10139, term10139.getClass(), "in", null);
        setField(term10139, term10139.getClass(), "out", null);
        setFloatField(term10139, term10139.getClass(), "weight", 0.0F);
        setBooleanField(term10139, term10139.getClass(), "expressed", false);
        setIntField(term10139, term10139.getClass(), "innovation", 0);
        Object term10143 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10143, term10143.getClass(), "in", null);
        setField(term10143, term10143.getClass(), "out", null);
        setFloatField(term10143, term10143.getClass(), "weight", 0.0F);
        setBooleanField(term10143, term10143.getClass(), "expressed", false);
        setIntField(term10143, term10143.getClass(), "innovation", 0);
        Object term10147 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10147, term10147.getClass(), "in", null);
        setField(term10147, term10147.getClass(), "out", null);
        setFloatField(term10147, term10147.getClass(), "weight", 0.0F);
        setBooleanField(term10147, term10147.getClass(), "expressed", false);
        setIntField(term10147, term10147.getClass(), "innovation", 0);
        Object term10151 = newInstance(Class.forName("nn.model.Connection"));
        Object term10152 = newInstance(Class.forName("nn.model.Node"));
        Object term10155 = newInstance(Class.forName("nn.model.Node"));
        setField(term10152, term10152.getClass(), "type", enum59);
        setIntField(term10152, term10152.getClass(), "innovation", 939889496);
        setField(term10152, term10152.getClass(), "connections", null);
        setDoubleField(term10152, term10152.getClass(), "bias", 0.494050019899438);
        setField(term10151, term10151.getClass(), "in", term10152);
        setField(term10155, term10155.getClass(), "type", null);
        setIntField(term10155, term10155.getClass(), "innovation", -1470115841);
        setField(term10155, term10155.getClass(), "connections", null);
        setDoubleField(term10155, term10155.getClass(), "bias", 0.12165424271232805);
        setField(term10151, term10151.getClass(), "out", term10155);
        setFloatField(term10151, term10151.getClass(), "weight", 0.714912F);
        setBooleanField(term10151, term10151.getClass(), "expressed", false);
        setIntField(term10151, term10151.getClass(), "innovation", 480909331);
        ArrayList term10119 = new ArrayList();
        ((ArrayList) term10119).add(term10121);
        ((ArrayList) term10119).add(term10125);
        ((ArrayList) term10119).add(term10129);
        ((ArrayList) term10119).add(term10139);
        ((ArrayList) term10119).add(term10143);
        ((ArrayList) term10119).add(term10129);
        ((ArrayList) term10119).add(term10147);
        ((ArrayList) term10119).add(term10121);
        ((ArrayList) term10119).add(term10151);
        term10106 = newInstance(Class.forName("nn.model.Genome"));
        Object term10163 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10165 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10167 = newInstance(Class.forName("java.util.Random"));
        Object term10168 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10106, term10106.getClass(), "nodes", term10107);
        setField(term10106, term10106.getClass(), "connections", term10119);
        setIntField(term10163, term10163.getClass(), "counter", 100);
        setField(term10106, term10106.getClass(), "nodeInnovator", term10163);
        setIntField(term10165, term10165.getClass(), "counter", 100);
        setField(term10106, term10106.getClass(), "connectionInnovator", term10165);
        setLongField(term10168, term10168.getClass(), "value", 160231122566968L);
        setField(term10167, term10167.getClass(), "seed", term10168);
        setDoubleField(term10167, term10167.getClass(), "nextNextGaussian", 0.9044080113158133);
        setBooleanField(term10167, term10167.getClass(), "haveNextNextGaussian", false);
        setField(term10106, term10106.getClass(), "random", term10167);
        term10172 = newInstance(Class.forName("java.util.Random"));
        Object term10173 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term10173, term10173.getClass(), "value", 11784794871898L);
        setField(term10172, term10172.getClass(), "seed", term10173);
        setDoubleField(term10172, term10172.getClass(), "nextNextGaussian", 0.7709248376486527);
        setBooleanField(term10172, term10172.getClass(), "haveNextNextGaussian", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Random");
        Object[] args = new Object[1];
        args[0] = term10172;
        callMethod(klass, "setRandom", argTypes, term10106, args);
    }

};


