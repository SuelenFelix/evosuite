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

public class Genome_setRandom_9533540316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8489;
     Object term8539;

    public Genome_setRandom_9533540316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8545 = Class.forName((String) "nn.model.Type");
        Field term8544 = ((Class) term8545).getDeclaredField((String) "OUTPUT");
        ((Field) term8544).setAccessible(true);
        Object enum53 = ((Field) term8544).get((Object) null);
        ArrayList term8496 = new ArrayList();
        ((ArrayList) term8496).add((Object)null);
        ((ArrayList) term8496).add((Object)null);
        ((ArrayList) term8496).add((Object)null);
        ((ArrayList) term8496).add((Object)null);
        Object term8492 = newInstance(Class.forName("nn.model.Node"));
        setField(term8492, term8492.getClass(), "type", enum53);
        setIntField(term8492, term8492.getClass(), "innovation", 695052304);
        setField(term8492, term8492.getClass(), "connections", term8496);
        setDoubleField(term8492, term8492.getClass(), "bias", 0.45666264951111046);
        ArrayList term8490 = new ArrayList();
        ((ArrayList) term8490).add(term8492);
        Object term8504 = newInstance(Class.forName("nn.model.Connection"));
        Object term8505 = newInstance(Class.forName("nn.model.Node"));
        Object term8508 = newInstance(Class.forName("nn.model.Node"));
        setField(term8505, term8505.getClass(), "type", null);
        setIntField(term8505, term8505.getClass(), "innovation", -679614653);
        setField(term8505, term8505.getClass(), "connections", null);
        setDoubleField(term8505, term8505.getClass(), "bias", 0.746182708698679);
        setField(term8504, term8504.getClass(), "in", term8505);
        setField(term8508, term8508.getClass(), "type", enum53);
        setIntField(term8508, term8508.getClass(), "innovation", -235039141);
        setField(term8508, term8508.getClass(), "connections", null);
        setDoubleField(term8508, term8508.getClass(), "bias", 0.3326214440098766);
        setField(term8504, term8504.getClass(), "out", term8508);
        setFloatField(term8504, term8504.getClass(), "weight", 0.9938727F);
        setBooleanField(term8504, term8504.getClass(), "expressed", false);
        setIntField(term8504, term8504.getClass(), "innovation", -1563700756);
        Object term8514 = newInstance(Class.forName("nn.model.Connection"));
        Object term8515 = newInstance(Class.forName("nn.model.Node"));
        Object term8518 = newInstance(Class.forName("nn.model.Node"));
        setField(term8515, term8515.getClass(), "type", null);
        setIntField(term8515, term8515.getClass(), "innovation", 940896043);
        setField(term8515, term8515.getClass(), "connections", null);
        setDoubleField(term8515, term8515.getClass(), "bias", 0.28707058137195374);
        setField(term8514, term8514.getClass(), "in", term8515);
        setField(term8518, term8518.getClass(), "type", null);
        setIntField(term8518, term8518.getClass(), "innovation", -1156002984);
        setField(term8518, term8518.getClass(), "connections", null);
        setDoubleField(term8518, term8518.getClass(), "bias", 0.584132621410495);
        setField(term8514, term8514.getClass(), "out", term8518);
        setFloatField(term8514, term8514.getClass(), "weight", 0.39897245F);
        setBooleanField(term8514, term8514.getClass(), "expressed", true);
        setIntField(term8514, term8514.getClass(), "innovation", 1676254730);
        Object term8524 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8524, term8524.getClass(), "in", null);
        setField(term8524, term8524.getClass(), "out", null);
        setFloatField(term8524, term8524.getClass(), "weight", 0.0F);
        setBooleanField(term8524, term8524.getClass(), "expressed", false);
        setIntField(term8524, term8524.getClass(), "innovation", 0);
        ArrayList term8502 = new ArrayList();
        ((ArrayList) term8502).add(term8504);
        ((ArrayList) term8502).add(term8514);
        ((ArrayList) term8502).add(term8524);
        term8489 = newInstance(Class.forName("nn.model.Genome"));
        Object term8530 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term8532 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term8534 = newInstance(Class.forName("java.util.Random"));
        Object term8535 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term8489, term8489.getClass(), "nodes", term8490);
        setField(term8489, term8489.getClass(), "connections", term8502);
        setIntField(term8530, term8530.getClass(), "counter", 100);
        setField(term8489, term8489.getClass(), "nodeInnovator", term8530);
        setIntField(term8532, term8532.getClass(), "counter", 100);
        setField(term8489, term8489.getClass(), "connectionInnovator", term8532);
        setLongField(term8535, term8535.getClass(), "value", 278356302286696L);
        setField(term8534, term8534.getClass(), "seed", term8535);
        setDoubleField(term8534, term8534.getClass(), "nextNextGaussian", 0.6463368736569162);
        setBooleanField(term8534, term8534.getClass(), "haveNextNextGaussian", true);
        setField(term8489, term8489.getClass(), "random", term8534);
        term8539 = newInstance(Class.forName("java.util.Random"));
        Object term8540 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term8540, term8540.getClass(), "value", 273189150871214L);
        setField(term8539, term8539.getClass(), "seed", term8540);
        setDoubleField(term8539, term8539.getClass(), "nextNextGaussian", 0.35554035462293654);
        setBooleanField(term8539, term8539.getClass(), "haveNextNextGaussian", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Random");
        Object[] args = new Object[1];
        args[0] = term8539;
        callMethod(klass, "setRandom", argTypes, term8489, args);
    }

};


