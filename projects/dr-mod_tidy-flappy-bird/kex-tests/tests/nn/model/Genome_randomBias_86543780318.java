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

public class Genome_randomBias_86543780318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8874;

    public Genome_randomBias_86543780318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8950 = Class.forName((String) "nn.model.Type");
        Field term8949 = ((Class) term8950).getDeclaredField((String) "OUTPUT");
        ((Field) term8949).setAccessible(true);
        Object enum56 = ((Field) term8949).get((Object) null);
        ArrayList term8881 = new ArrayList();
        ((ArrayList) term8881).add((Object)null);
        ((ArrayList) term8881).add((Object)null);
        ((ArrayList) term8881).add((Object)null);
        ((ArrayList) term8881).add((Object)null);
        ((ArrayList) term8881).add((Object)null);
        ((ArrayList) term8881).add((Object)null);
        Object term8877 = newInstance(Class.forName("nn.model.Node"));
        setField(term8877, term8877.getClass(), "type", enum56);
        setIntField(term8877, term8877.getClass(), "innovation", -137577510);
        setField(term8877, term8877.getClass(), "connections", term8881);
        setDoubleField(term8877, term8877.getClass(), "bias", 0.6613885474313168);
        Class<? extends Object> term9040 = Class.forName((String) "nn.model.Type");
        Field term9039 = ((Class) term9040).getDeclaredField((String) "SENSOR");
        ((Field) term9039).setAccessible(true);
        Object enum57 = ((Field) term9039).get((Object) null);
        ArrayList term8889 = new ArrayList();
        ((ArrayList) term8889).add((Object)null);
        ((ArrayList) term8889).add((Object)null);
        ((ArrayList) term8889).add((Object)null);
        ((ArrayList) term8889).add((Object)null);
        ((ArrayList) term8889).add((Object)null);
        ((ArrayList) term8889).add((Object)null);
        ((ArrayList) term8889).add((Object)null);
        ((ArrayList) term8889).add((Object)null);
        Object term8885 = newInstance(Class.forName("nn.model.Node"));
        setField(term8885, term8885.getClass(), "type", enum57);
        setIntField(term8885, term8885.getClass(), "innovation", 1762934060);
        setField(term8885, term8885.getClass(), "connections", term8889);
        setDoubleField(term8885, term8885.getClass(), "bias", 0.494050019899438);
        Class<? extends Object> term9130 = Class.forName((String) "nn.model.Type");
        Field term9129 = ((Class) term9130).getDeclaredField((String) "SENSOR");
        ((Field) term9129).setAccessible(true);
        Object enum58 = ((Field) term9129).get((Object) null);
        ArrayList term8897 = new ArrayList();
        Object term8893 = newInstance(Class.forName("nn.model.Node"));
        setField(term8893, term8893.getClass(), "type", enum58);
        setIntField(term8893, term8893.getClass(), "innovation", 338519695);
        setField(term8893, term8893.getClass(), "connections", term8897);
        setDoubleField(term8893, term8893.getClass(), "bias", 0.06433964340439391);
        ArrayList term8903 = new ArrayList();
        ((ArrayList) term8903).add((Object)null);
        ((ArrayList) term8903).add((Object)null);
        Object term8901 = newInstance(Class.forName("nn.model.Node"));
        setField(term8901, term8901.getClass(), "type", enum58);
        setIntField(term8901, term8901.getClass(), "innovation", 1773193728);
        setField(term8901, term8901.getClass(), "connections", term8903);
        setDoubleField(term8901, term8901.getClass(), "bias", 0.5644745329624891);
        ArrayList term8875 = new ArrayList();
        ((ArrayList) term8875).add(term8877);
        ((ArrayList) term8875).add(term8885);
        ((ArrayList) term8875).add(term8893);
        ((ArrayList) term8875).add(term8901);
        ((ArrayList) term8875).add(term8901);
        Object term8911 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8911, term8911.getClass(), "in", null);
        setField(term8911, term8911.getClass(), "out", null);
        setFloatField(term8911, term8911.getClass(), "weight", 0.0F);
        setBooleanField(term8911, term8911.getClass(), "expressed", false);
        setIntField(term8911, term8911.getClass(), "innovation", 0);
        Object term8915 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8915, term8915.getClass(), "in", null);
        setField(term8915, term8915.getClass(), "out", null);
        setFloatField(term8915, term8915.getClass(), "weight", 0.0F);
        setBooleanField(term8915, term8915.getClass(), "expressed", false);
        setIntField(term8915, term8915.getClass(), "innovation", 0);
        Object term8919 = newInstance(Class.forName("nn.model.Connection"));
        Object term8920 = newInstance(Class.forName("nn.model.Node"));
        setField(term8920, term8920.getClass(), "type", enum58);
        setIntField(term8920, term8920.getClass(), "innovation", 1624820010);
        setField(term8920, term8920.getClass(), "connections", null);
        setDoubleField(term8920, term8920.getClass(), "bias", 0.7860233123966477);
        setField(term8919, term8919.getClass(), "in", term8920);
        setField(term8919, term8919.getClass(), "out", term8893);
        setFloatField(term8919, term8919.getClass(), "weight", 0.4815951F);
        setBooleanField(term8919, term8919.getClass(), "expressed", false);
        setIntField(term8919, term8919.getClass(), "innovation", 2025566580);
        Object term8926 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8926, term8926.getClass(), "in", null);
        setField(term8926, term8926.getClass(), "out", null);
        setFloatField(term8926, term8926.getClass(), "weight", 0.0F);
        setBooleanField(term8926, term8926.getClass(), "expressed", false);
        setIntField(term8926, term8926.getClass(), "innovation", 0);
        Object term8930 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8930, term8930.getClass(), "in", null);
        setField(term8930, term8930.getClass(), "out", null);
        setFloatField(term8930, term8930.getClass(), "weight", 0.0F);
        setBooleanField(term8930, term8930.getClass(), "expressed", false);
        setIntField(term8930, term8930.getClass(), "innovation", 0);
        Object term8934 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8934, term8934.getClass(), "in", null);
        setField(term8934, term8934.getClass(), "out", null);
        setFloatField(term8934, term8934.getClass(), "weight", 0.0F);
        setBooleanField(term8934, term8934.getClass(), "expressed", false);
        setIntField(term8934, term8934.getClass(), "innovation", 0);
        ArrayList term8909 = new ArrayList();
        ((ArrayList) term8909).add(term8911);
        ((ArrayList) term8909).add(term8915);
        ((ArrayList) term8909).add(term8919);
        ((ArrayList) term8909).add(term8926);
        ((ArrayList) term8909).add(term8930);
        ((ArrayList) term8909).add(term8934);
        ((ArrayList) term8909).add(term8911);
        ((ArrayList) term8909).add(term8919);
        ((ArrayList) term8909).add(term8915);
        term8874 = newInstance(Class.forName("nn.model.Genome"));
        Object term8940 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term8942 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term8944 = newInstance(Class.forName("java.util.Random"));
        Object term8945 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term8874, term8874.getClass(), "nodes", term8875);
        setField(term8874, term8874.getClass(), "connections", term8909);
        setIntField(term8940, term8940.getClass(), "counter", 100);
        setField(term8874, term8874.getClass(), "nodeInnovator", term8940);
        setIntField(term8942, term8942.getClass(), "counter", 100);
        setField(term8874, term8874.getClass(), "connectionInnovator", term8942);
        setLongField(term8945, term8945.getClass(), "value", 266135496572582L);
        setField(term8944, term8944.getClass(), "seed", term8945);
        setDoubleField(term8944, term8944.getClass(), "nextNextGaussian", 0.12165424271232805);
        setBooleanField(term8944, term8944.getClass(), "haveNextNextGaussian", true);
        setField(term8874, term8874.getClass(), "random", term8944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "randomBias", argTypes, term8874, args);
    }

};


