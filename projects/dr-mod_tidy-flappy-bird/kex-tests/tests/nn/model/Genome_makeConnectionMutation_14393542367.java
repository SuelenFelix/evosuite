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

public class Genome_makeConnectionMutation_14393542367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6232;

    public Genome_makeConnectionMutation_14393542367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6295 = Class.forName((String) "nn.model.Type");
        Field term6294 = ((Class) term6295).getDeclaredField((String) "HIDDEN");
        ((Field) term6294).setAccessible(true);
        Object enum34 = ((Field) term6294).get((Object) null);
        ArrayList term6239 = new ArrayList();
        ((ArrayList) term6239).add((Object)null);
        ((ArrayList) term6239).add((Object)null);
        ((ArrayList) term6239).add((Object)null);
        ((ArrayList) term6239).add((Object)null);
        ((ArrayList) term6239).add((Object)null);
        ((ArrayList) term6239).add((Object)null);
        ((ArrayList) term6239).add((Object)null);
        ((ArrayList) term6239).add((Object)null);
        ((ArrayList) term6239).add((Object)null);
        Object term6235 = newInstance(Class.forName("nn.model.Node"));
        setField(term6235, term6235.getClass(), "type", enum34);
        setIntField(term6235, term6235.getClass(), "innovation", 847207929);
        setField(term6235, term6235.getClass(), "connections", term6239);
        setDoubleField(term6235, term6235.getClass(), "bias", 0.12551786512833385);
        ArrayList term6245 = new ArrayList();
        ((ArrayList) term6245).add((Object)null);
        ((ArrayList) term6245).add((Object)null);
        ((ArrayList) term6245).add((Object)null);
        ((ArrayList) term6245).add((Object)null);
        ((ArrayList) term6245).add((Object)null);
        ((ArrayList) term6245).add((Object)null);
        ((ArrayList) term6245).add((Object)null);
        ((ArrayList) term6245).add((Object)null);
        ((ArrayList) term6245).add((Object)null);
        Object term6243 = newInstance(Class.forName("nn.model.Node"));
        setField(term6243, term6243.getClass(), "type", enum34);
        setIntField(term6243, term6243.getClass(), "innovation", 1175146356);
        setField(term6243, term6243.getClass(), "connections", term6245);
        setDoubleField(term6243, term6243.getClass(), "bias", 0.1151115055344808);
        Class<? extends Object> term6385 = Class.forName((String) "nn.model.Type");
        Field term6384 = ((Class) term6385).getDeclaredField((String) "HIDDEN");
        ((Field) term6384).setAccessible(true);
        Object enum35 = ((Field) term6384).get((Object) null);
        ArrayList term6253 = new ArrayList();
        Object term6249 = newInstance(Class.forName("nn.model.Node"));
        setField(term6249, term6249.getClass(), "type", enum35);
        setIntField(term6249, term6249.getClass(), "innovation", 81427089);
        setField(term6249, term6249.getClass(), "connections", term6253);
        setDoubleField(term6249, term6249.getClass(), "bias", 0.5386474507958124);
        Class<? extends Object> term6475 = Class.forName((String) "nn.model.Type");
        Field term6474 = ((Class) term6475).getDeclaredField((String) "SENSOR");
        ((Field) term6474).setAccessible(true);
        Object enum36 = ((Field) term6474).get((Object) null);
        ArrayList term6261 = new ArrayList();
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        ((ArrayList) term6261).add((Object)null);
        Object term6257 = newInstance(Class.forName("nn.model.Node"));
        setField(term6257, term6257.getClass(), "type", enum36);
        setIntField(term6257, term6257.getClass(), "innovation", -382652403);
        setField(term6257, term6257.getClass(), "connections", term6261);
        setDoubleField(term6257, term6257.getClass(), "bias", 0.1749946990463458);
        ArrayList term6233 = new ArrayList();
        ((ArrayList) term6233).add(term6235);
        ((ArrayList) term6233).add(term6243);
        ((ArrayList) term6233).add(term6249);
        ((ArrayList) term6233).add(term6257);
        Object term6269 = newInstance(Class.forName("nn.model.Connection"));
        setField(term6269, term6269.getClass(), "in", null);
        setField(term6269, term6269.getClass(), "out", null);
        setFloatField(term6269, term6269.getClass(), "weight", 0.0F);
        setBooleanField(term6269, term6269.getClass(), "expressed", false);
        setIntField(term6269, term6269.getClass(), "innovation", 0);
        Object term6273 = newInstance(Class.forName("nn.model.Connection"));
        Object term6274 = newInstance(Class.forName("nn.model.Node"));
        Object term6277 = newInstance(Class.forName("nn.model.Node"));
        setField(term6274, term6274.getClass(), "type", enum36);
        setIntField(term6274, term6274.getClass(), "innovation", 1574458332);
        setField(term6274, term6274.getClass(), "connections", null);
        setDoubleField(term6274, term6274.getClass(), "bias", 0.4795388086922092);
        setField(term6273, term6273.getClass(), "in", term6274);
        setField(term6277, term6277.getClass(), "type", enum35);
        setIntField(term6277, term6277.getClass(), "innovation", 196952878);
        setField(term6277, term6277.getClass(), "connections", null);
        setDoubleField(term6277, term6277.getClass(), "bias", 0.14092209049948845);
        setField(term6273, term6273.getClass(), "out", term6277);
        setFloatField(term6273, term6273.getClass(), "weight", 0.8223115F);
        setBooleanField(term6273, term6273.getClass(), "expressed", true);
        setIntField(term6273, term6273.getClass(), "innovation", 802673242);
        ArrayList term6267 = new ArrayList();
        ((ArrayList) term6267).add(term6269);
        ((ArrayList) term6267).add(term6273);
        term6232 = newInstance(Class.forName("nn.model.Genome"));
        Object term6285 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term6287 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term6289 = newInstance(Class.forName("java.util.Random"));
        Object term6290 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term6232, term6232.getClass(), "nodes", term6233);
        setField(term6232, term6232.getClass(), "connections", term6267);
        setIntField(term6285, term6285.getClass(), "counter", 100);
        setField(term6232, term6232.getClass(), "nodeInnovator", term6285);
        setIntField(term6287, term6287.getClass(), "counter", 100);
        setField(term6232, term6232.getClass(), "connectionInnovator", term6287);
        setLongField(term6290, term6290.getClass(), "value", 31064646993302L);
        setField(term6289, term6289.getClass(), "seed", term6290);
        setDoubleField(term6289, term6289.getClass(), "nextNextGaussian", 0.2351393567986032);
        setBooleanField(term6289, term6289.getClass(), "haveNextNextGaussian", false);
        setField(term6232, term6232.getClass(), "random", term6289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makeConnectionMutation", argTypes, term6232, args);
    }

};


