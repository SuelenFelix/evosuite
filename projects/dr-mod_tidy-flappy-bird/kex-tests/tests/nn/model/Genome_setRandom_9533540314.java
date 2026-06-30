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
     Object term10104;
     Object term10170;

    public Genome_setRandom_9533540314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10176 = Class.forName((String) "nn.model.Type");
        Field term10175 = ((Class) term10176).getDeclaredField((String) "HIDDEN");
        ((Field) term10175).setAccessible(true);
        Object enum59 = ((Field) term10175).get((Object) null);
        ArrayList term10111 = new ArrayList();
        ((ArrayList) term10111).add((Object)null);
        ((ArrayList) term10111).add((Object)null);
        Object term10107 = newInstance(Class.forName("nn.model.Node"));
        setField(term10107, term10107.getClass(), "type", enum59);
        setIntField(term10107, term10107.getClass(), "innovation", 241725499);
        setField(term10107, term10107.getClass(), "connections", term10111);
        setDoubleField(term10107, term10107.getClass(), "bias", 0.35949348580116536);
        ArrayList term10105 = new ArrayList();
        ((ArrayList) term10105).add(term10107);
        Object term10119 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10119, term10119.getClass(), "in", null);
        setField(term10119, term10119.getClass(), "out", null);
        setFloatField(term10119, term10119.getClass(), "weight", 0.0F);
        setBooleanField(term10119, term10119.getClass(), "expressed", false);
        setIntField(term10119, term10119.getClass(), "innovation", 0);
        Object term10123 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10123, term10123.getClass(), "in", null);
        setField(term10123, term10123.getClass(), "out", null);
        setFloatField(term10123, term10123.getClass(), "weight", 0.0F);
        setBooleanField(term10123, term10123.getClass(), "expressed", false);
        setIntField(term10123, term10123.getClass(), "innovation", 0);
        Object term10127 = newInstance(Class.forName("nn.model.Connection"));
        Object term10128 = newInstance(Class.forName("nn.model.Node"));
        Object term10131 = newInstance(Class.forName("nn.model.Node"));
        setField(term10128, term10128.getClass(), "type", enum59);
        setIntField(term10128, term10128.getClass(), "innovation", 1174484848);
        setField(term10128, term10128.getClass(), "connections", null);
        setDoubleField(term10128, term10128.getClass(), "bias", 0.9539599355783924);
        setField(term10127, term10127.getClass(), "in", term10128);
        setField(term10131, term10131.getClass(), "type", enum59);
        setIntField(term10131, term10131.getClass(), "innovation", -2024983877);
        setField(term10131, term10131.getClass(), "connections", null);
        setDoubleField(term10131, term10131.getClass(), "bias", 0.710793359488993);
        setField(term10127, term10127.getClass(), "out", term10131);
        setFloatField(term10127, term10127.getClass(), "weight", 0.24411172F);
        setBooleanField(term10127, term10127.getClass(), "expressed", true);
        setIntField(term10127, term10127.getClass(), "innovation", 1757149811);
        Object term10137 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10137, term10137.getClass(), "in", null);
        setField(term10137, term10137.getClass(), "out", null);
        setFloatField(term10137, term10137.getClass(), "weight", 0.0F);
        setBooleanField(term10137, term10137.getClass(), "expressed", false);
        setIntField(term10137, term10137.getClass(), "innovation", 0);
        Object term10141 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10141, term10141.getClass(), "in", null);
        setField(term10141, term10141.getClass(), "out", null);
        setFloatField(term10141, term10141.getClass(), "weight", 0.0F);
        setBooleanField(term10141, term10141.getClass(), "expressed", false);
        setIntField(term10141, term10141.getClass(), "innovation", 0);
        Object term10145 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10145, term10145.getClass(), "in", null);
        setField(term10145, term10145.getClass(), "out", null);
        setFloatField(term10145, term10145.getClass(), "weight", 0.0F);
        setBooleanField(term10145, term10145.getClass(), "expressed", false);
        setIntField(term10145, term10145.getClass(), "innovation", 0);
        Object term10149 = newInstance(Class.forName("nn.model.Connection"));
        Object term10150 = newInstance(Class.forName("nn.model.Node"));
        Object term10153 = newInstance(Class.forName("nn.model.Node"));
        setField(term10150, term10150.getClass(), "type", enum59);
        setIntField(term10150, term10150.getClass(), "innovation", 939889496);
        setField(term10150, term10150.getClass(), "connections", null);
        setDoubleField(term10150, term10150.getClass(), "bias", 0.494050019899438);
        setField(term10149, term10149.getClass(), "in", term10150);
        setField(term10153, term10153.getClass(), "type", null);
        setIntField(term10153, term10153.getClass(), "innovation", -1470115841);
        setField(term10153, term10153.getClass(), "connections", null);
        setDoubleField(term10153, term10153.getClass(), "bias", 0.12165424271232805);
        setField(term10149, term10149.getClass(), "out", term10153);
        setFloatField(term10149, term10149.getClass(), "weight", 0.714912F);
        setBooleanField(term10149, term10149.getClass(), "expressed", false);
        setIntField(term10149, term10149.getClass(), "innovation", 480909331);
        ArrayList term10117 = new ArrayList();
        ((ArrayList) term10117).add(term10119);
        ((ArrayList) term10117).add(term10123);
        ((ArrayList) term10117).add(term10127);
        ((ArrayList) term10117).add(term10137);
        ((ArrayList) term10117).add(term10141);
        ((ArrayList) term10117).add(term10127);
        ((ArrayList) term10117).add(term10145);
        ((ArrayList) term10117).add(term10119);
        ((ArrayList) term10117).add(term10149);
        term10104 = newInstance(Class.forName("nn.model.Genome"));
        Object term10161 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10163 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10165 = newInstance(Class.forName("java.util.Random"));
        Object term10166 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10104, term10104.getClass(), "nodes", term10105);
        setField(term10104, term10104.getClass(), "connections", term10117);
        setIntField(term10161, term10161.getClass(), "counter", 100);
        setField(term10104, term10104.getClass(), "nodeInnovator", term10161);
        setIntField(term10163, term10163.getClass(), "counter", 100);
        setField(term10104, term10104.getClass(), "connectionInnovator", term10163);
        setLongField(term10166, term10166.getClass(), "value", 70236526725537L);
        setField(term10165, term10165.getClass(), "seed", term10166);
        setDoubleField(term10165, term10165.getClass(), "nextNextGaussian", 0.9044080113158133);
        setBooleanField(term10165, term10165.getClass(), "haveNextNextGaussian", false);
        setField(term10104, term10104.getClass(), "random", term10165);
        term10170 = newInstance(Class.forName("java.util.Random"));
        Object term10171 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term10171, term10171.getClass(), "value", 181335073140378L);
        setField(term10170, term10170.getClass(), "seed", term10171);
        setDoubleField(term10170, term10170.getClass(), "nextNextGaussian", 0.7709248376486527);
        setBooleanField(term10170, term10170.getClass(), "haveNextNextGaussian", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Random");
        Object[] args = new Object[1];
        args[0] = term10170;
        callMethod(klass, "setRandom", argTypes, term10104, args);
    }

};


