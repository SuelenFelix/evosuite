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

public class Genome_toString_151169264411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9581;

    public Genome_toString_151169264411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9630 = Class.forName((String) "nn.model.Type");
        Field term9629 = ((Class) term9630).getDeclaredField((String) "SENSOR");
        ((Field) term9629).setAccessible(true);
        Object enum55 = ((Field) term9629).get((Object) null);
        ArrayList term9588 = new ArrayList();
        ((ArrayList) term9588).add((Object)null);
        ((ArrayList) term9588).add((Object)null);
        ((ArrayList) term9588).add((Object)null);
        ((ArrayList) term9588).add((Object)null);
        ((ArrayList) term9588).add((Object)null);
        ((ArrayList) term9588).add((Object)null);
        Object term9584 = newInstance(Class.forName("nn.model.Node"));
        setField(term9584, term9584.getClass(), "type", enum55);
        setIntField(term9584, term9584.getClass(), "innovation", 1762934060);
        setField(term9584, term9584.getClass(), "connections", term9588);
        setDoubleField(term9584, term9584.getClass(), "bias", 0.45666264951111046);
        Class<? extends Object> term9720 = Class.forName((String) "nn.model.Type");
        Field term9719 = ((Class) term9720).getDeclaredField((String) "OUTPUT");
        ((Field) term9719).setAccessible(true);
        Object enum56 = ((Field) term9719).get((Object) null);
        ArrayList term9596 = new ArrayList();
        ((ArrayList) term9596).add((Object)null);
        ((ArrayList) term9596).add((Object)null);
        ((ArrayList) term9596).add((Object)null);
        ((ArrayList) term9596).add((Object)null);
        Object term9592 = newInstance(Class.forName("nn.model.Node"));
        setField(term9592, term9592.getClass(), "type", enum56);
        setIntField(term9592, term9592.getClass(), "innovation", 1112256038);
        setField(term9592, term9592.getClass(), "connections", term9596);
        setDoubleField(term9592, term9592.getClass(), "bias", 0.6463368736569162);
        ArrayList term9582 = new ArrayList();
        ((ArrayList) term9582).add(term9584);
        ((ArrayList) term9582).add(term9592);
        Object term9604 = newInstance(Class.forName("nn.model.Connection"));
        Object term9605 = newInstance(Class.forName("nn.model.Node"));
        Object term9608 = newInstance(Class.forName("nn.model.Node"));
        setField(term9605, term9605.getClass(), "type", null);
        setIntField(term9605, term9605.getClass(), "innovation", 1986855642);
        setField(term9605, term9605.getClass(), "connections", null);
        setDoubleField(term9605, term9605.getClass(), "bias", 0.8605802060060375);
        setField(term9604, term9604.getClass(), "in", term9605);
        setField(term9608, term9608.getClass(), "type", null);
        setIntField(term9608, term9608.getClass(), "innovation", 1059048043);
        setField(term9608, term9608.getClass(), "connections", null);
        setDoubleField(term9608, term9608.getClass(), "bias", 0.746182708698679);
        setField(term9604, term9604.getClass(), "out", term9608);
        setFloatField(term9604, term9604.getClass(), "weight", 0.76814204F);
        setBooleanField(term9604, term9604.getClass(), "expressed", false);
        setIntField(term9604, term9604.getClass(), "innovation", 537273345);
        Object term9614 = newInstance(Class.forName("nn.model.Connection"));
        setField(term9614, term9614.getClass(), "in", null);
        setField(term9614, term9614.getClass(), "out", null);
        setFloatField(term9614, term9614.getClass(), "weight", 0.0F);
        setBooleanField(term9614, term9614.getClass(), "expressed", false);
        setIntField(term9614, term9614.getClass(), "innovation", 0);
        ArrayList term9602 = new ArrayList();
        ((ArrayList) term9602).add(term9604);
        ((ArrayList) term9602).add(term9614);
        term9581 = newInstance(Class.forName("nn.model.Genome"));
        Object term9620 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term9622 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term9624 = newInstance(Class.forName("java.util.Random"));
        Object term9625 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term9581, term9581.getClass(), "nodes", term9582);
        setField(term9581, term9581.getClass(), "connections", term9602);
        setIntField(term9620, term9620.getClass(), "counter", 100);
        setField(term9581, term9581.getClass(), "nodeInnovator", term9620);
        setIntField(term9622, term9622.getClass(), "counter", 100);
        setField(term9581, term9581.getClass(), "connectionInnovator", term9622);
        setLongField(term9625, term9625.getClass(), "value", 105674420677505L);
        setField(term9624, term9624.getClass(), "seed", term9625);
        setDoubleField(term9624, term9624.getClass(), "nextNextGaussian", 0.35554035462293654);
        setBooleanField(term9624, term9624.getClass(), "haveNextNextGaussian", true);
        setField(term9581, term9581.getClass(), "random", term9624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9581, args);
    }

};


