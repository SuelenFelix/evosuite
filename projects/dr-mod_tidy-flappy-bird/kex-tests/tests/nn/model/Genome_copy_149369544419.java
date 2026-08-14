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

public class Genome_copy_149369544419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9219;

    public Genome_copy_149369544419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9254 = Class.forName((String) "nn.model.Type");
        Field term9253 = ((Class) term9254).getDeclaredField((String) "OUTPUT");
        ((Field) term9253).setAccessible(true);
        Object enum59 = ((Field) term9253).get((Object) null);
        ArrayList term9226 = new ArrayList();
        ((ArrayList) term9226).add((Object)null);
        ((ArrayList) term9226).add((Object)null);
        ((ArrayList) term9226).add((Object)null);
        ((ArrayList) term9226).add((Object)null);
        ((ArrayList) term9226).add((Object)null);
        ((ArrayList) term9226).add((Object)null);
        ((ArrayList) term9226).add((Object)null);
        Object term9222 = newInstance(Class.forName("nn.model.Node"));
        setField(term9222, term9222.getClass(), "type", enum59);
        setIntField(term9222, term9222.getClass(), "innovation", -859828739);
        setField(term9222, term9222.getClass(), "connections", term9226);
        setDoubleField(term9222, term9222.getClass(), "bias", 0.33650824379057453);
        Class<? extends Object> term9344 = Class.forName((String) "nn.model.Type");
        Field term9343 = ((Class) term9344).getDeclaredField((String) "SENSOR");
        ((Field) term9343).setAccessible(true);
        Object enum60 = ((Field) term9343).get((Object) null);
        ArrayList term9234 = new ArrayList();
        ((ArrayList) term9234).add((Object)null);
        ((ArrayList) term9234).add((Object)null);
        ((ArrayList) term9234).add((Object)null);
        ((ArrayList) term9234).add((Object)null);
        ((ArrayList) term9234).add((Object)null);
        ((ArrayList) term9234).add((Object)null);
        Object term9230 = newInstance(Class.forName("nn.model.Node"));
        setField(term9230, term9230.getClass(), "type", enum60);
        setIntField(term9230, term9230.getClass(), "innovation", -441333794);
        setField(term9230, term9230.getClass(), "connections", term9234);
        setDoubleField(term9230, term9230.getClass(), "bias", 0.5191680850819778);
        ArrayList term9220 = new ArrayList();
        ((ArrayList) term9220).add(term9222);
        ((ArrayList) term9220).add(term9230);
        ArrayList term9240 = new ArrayList();
        term9219 = newInstance(Class.forName("nn.model.Genome"));
        Object term9244 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term9246 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term9248 = newInstance(Class.forName("java.util.Random"));
        Object term9249 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term9219, term9219.getClass(), "nodes", term9220);
        setField(term9219, term9219.getClass(), "connections", term9240);
        setIntField(term9244, term9244.getClass(), "counter", 100);
        setField(term9219, term9219.getClass(), "nodeInnovator", term9244);
        setIntField(term9246, term9246.getClass(), "counter", 100);
        setField(term9219, term9219.getClass(), "connectionInnovator", term9246);
        setLongField(term9249, term9249.getClass(), "value", 107975643022769L);
        setField(term9248, term9248.getClass(), "seed", term9249);
        setDoubleField(term9248, term9248.getClass(), "nextNextGaussian", 0.49591925980210916);
        setBooleanField(term9248, term9248.getClass(), "haveNextNextGaussian", false);
        setField(term9219, term9219.getClass(), "random", term9248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term9219, args);
    }

};


