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
     Object term9583;

    public Genome_toString_151169264411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9632 = Class.forName((String) "nn.model.Type");
        Field term9631 = ((Class) term9632).getDeclaredField((String) "SENSOR");
        ((Field) term9631).setAccessible(true);
        Object enum55 = ((Field) term9631).get((Object) null);
        ArrayList term9590 = new ArrayList();
        ((ArrayList) term9590).add((Object)null);
        ((ArrayList) term9590).add((Object)null);
        ((ArrayList) term9590).add((Object)null);
        ((ArrayList) term9590).add((Object)null);
        ((ArrayList) term9590).add((Object)null);
        ((ArrayList) term9590).add((Object)null);
        Object term9586 = newInstance(Class.forName("nn.model.Node"));
        setField(term9586, term9586.getClass(), "type", enum55);
        setIntField(term9586, term9586.getClass(), "innovation", 1762934060);
        setField(term9586, term9586.getClass(), "connections", term9590);
        setDoubleField(term9586, term9586.getClass(), "bias", 0.45666264951111046);
        Class<? extends Object> term9722 = Class.forName((String) "nn.model.Type");
        Field term9721 = ((Class) term9722).getDeclaredField((String) "OUTPUT");
        ((Field) term9721).setAccessible(true);
        Object enum56 = ((Field) term9721).get((Object) null);
        ArrayList term9598 = new ArrayList();
        ((ArrayList) term9598).add((Object)null);
        ((ArrayList) term9598).add((Object)null);
        ((ArrayList) term9598).add((Object)null);
        ((ArrayList) term9598).add((Object)null);
        Object term9594 = newInstance(Class.forName("nn.model.Node"));
        setField(term9594, term9594.getClass(), "type", enum56);
        setIntField(term9594, term9594.getClass(), "innovation", 1112256038);
        setField(term9594, term9594.getClass(), "connections", term9598);
        setDoubleField(term9594, term9594.getClass(), "bias", 0.6463368736569162);
        ArrayList term9584 = new ArrayList();
        ((ArrayList) term9584).add(term9586);
        ((ArrayList) term9584).add(term9594);
        Object term9606 = newInstance(Class.forName("nn.model.Connection"));
        Object term9607 = newInstance(Class.forName("nn.model.Node"));
        Object term9610 = newInstance(Class.forName("nn.model.Node"));
        setField(term9607, term9607.getClass(), "type", null);
        setIntField(term9607, term9607.getClass(), "innovation", 1986855642);
        setField(term9607, term9607.getClass(), "connections", null);
        setDoubleField(term9607, term9607.getClass(), "bias", 0.8605802060060375);
        setField(term9606, term9606.getClass(), "in", term9607);
        setField(term9610, term9610.getClass(), "type", null);
        setIntField(term9610, term9610.getClass(), "innovation", 1059048043);
        setField(term9610, term9610.getClass(), "connections", null);
        setDoubleField(term9610, term9610.getClass(), "bias", 0.746182708698679);
        setField(term9606, term9606.getClass(), "out", term9610);
        setFloatField(term9606, term9606.getClass(), "weight", 0.76814204F);
        setBooleanField(term9606, term9606.getClass(), "expressed", false);
        setIntField(term9606, term9606.getClass(), "innovation", 537273345);
        Object term9616 = newInstance(Class.forName("nn.model.Connection"));
        setField(term9616, term9616.getClass(), "in", null);
        setField(term9616, term9616.getClass(), "out", null);
        setFloatField(term9616, term9616.getClass(), "weight", 0.0F);
        setBooleanField(term9616, term9616.getClass(), "expressed", false);
        setIntField(term9616, term9616.getClass(), "innovation", 0);
        ArrayList term9604 = new ArrayList();
        ((ArrayList) term9604).add(term9606);
        ((ArrayList) term9604).add(term9616);
        term9583 = newInstance(Class.forName("nn.model.Genome"));
        Object term9622 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term9624 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term9626 = newInstance(Class.forName("java.util.Random"));
        Object term9627 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term9583, term9583.getClass(), "nodes", term9584);
        setField(term9583, term9583.getClass(), "connections", term9604);
        setIntField(term9622, term9622.getClass(), "counter", 100);
        setField(term9583, term9583.getClass(), "nodeInnovator", term9622);
        setIntField(term9624, term9624.getClass(), "counter", 100);
        setField(term9583, term9583.getClass(), "connectionInnovator", term9624);
        setLongField(term9627, term9627.getClass(), "value", 226807551314971L);
        setField(term9626, term9626.getClass(), "seed", term9627);
        setDoubleField(term9626, term9626.getClass(), "nextNextGaussian", 0.35554035462293654);
        setBooleanField(term9626, term9626.getClass(), "haveNextNextGaussian", true);
        setField(term9583, term9583.getClass(), "random", term9626);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9583, args);
    }

};


