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

public class Genome_getConnections_5911918413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9854;

    public Genome_getConnections_5911918413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9925 = Class.forName((String) "nn.model.Type");
        Field term9924 = ((Class) term9925).getDeclaredField((String) "SENSOR");
        ((Field) term9924).setAccessible(true);
        Object enum57 = ((Field) term9924).get((Object) null);
        ArrayList term9861 = new ArrayList();
        ((ArrayList) term9861).add((Object)null);
        ((ArrayList) term9861).add((Object)null);
        ((ArrayList) term9861).add((Object)null);
        ((ArrayList) term9861).add((Object)null);
        ((ArrayList) term9861).add((Object)null);
        ((ArrayList) term9861).add((Object)null);
        ((ArrayList) term9861).add((Object)null);
        ((ArrayList) term9861).add((Object)null);
        Object term9857 = newInstance(Class.forName("nn.model.Node"));
        setField(term9857, term9857.getClass(), "type", enum57);
        setIntField(term9857, term9857.getClass(), "innovation", -435079567);
        setField(term9857, term9857.getClass(), "connections", term9861);
        setDoubleField(term9857, term9857.getClass(), "bias", 0.7860233123966477);
        ArrayList term9867 = new ArrayList();
        ((ArrayList) term9867).add((Object)null);
        ((ArrayList) term9867).add((Object)null);
        ((ArrayList) term9867).add((Object)null);
        ((ArrayList) term9867).add((Object)null);
        ((ArrayList) term9867).add((Object)null);
        ((ArrayList) term9867).add((Object)null);
        Object term9865 = newInstance(Class.forName("nn.model.Node"));
        setField(term9865, term9865.getClass(), "type", enum57);
        setIntField(term9865, term9865.getClass(), "innovation", -1911828505);
        setField(term9865, term9865.getClass(), "connections", term9867);
        setDoubleField(term9865, term9865.getClass(), "bias", 0.06433964340439391);
        Class<? extends Object> term10015 = Class.forName((String) "nn.model.Type");
        Field term10014 = ((Class) term10015).getDeclaredField((String) "OUTPUT");
        ((Field) term10014).setAccessible(true);
        Object enum58 = ((Field) term10014).get((Object) null);
        ArrayList term9875 = new ArrayList();
        ((ArrayList) term9875).add((Object)null);
        ((ArrayList) term9875).add((Object)null);
        Object term9871 = newInstance(Class.forName("nn.model.Node"));
        setField(term9871, term9871.getClass(), "type", enum58);
        setIntField(term9871, term9871.getClass(), "innovation", -1017617829);
        setField(term9871, term9871.getClass(), "connections", term9875);
        setDoubleField(term9871, term9871.getClass(), "bias", 0.8988938672874076);
        ArrayList term9881 = new ArrayList();
        ((ArrayList) term9881).add((Object)null);
        ((ArrayList) term9881).add((Object)null);
        ((ArrayList) term9881).add((Object)null);
        ((ArrayList) term9881).add((Object)null);
        Object term9879 = newInstance(Class.forName("nn.model.Node"));
        setField(term9879, term9879.getClass(), "type", enum58);
        setIntField(term9879, term9879.getClass(), "innovation", -1362132929);
        setField(term9879, term9879.getClass(), "connections", term9881);
        setDoubleField(term9879, term9879.getClass(), "bias", 0.008961627061484845);
        ArrayList term9887 = new ArrayList();
        ((ArrayList) term9887).add((Object)null);
        ((ArrayList) term9887).add((Object)null);
        ((ArrayList) term9887).add((Object)null);
        ((ArrayList) term9887).add((Object)null);
        ((ArrayList) term9887).add((Object)null);
        ((ArrayList) term9887).add((Object)null);
        ((ArrayList) term9887).add((Object)null);
        ((ArrayList) term9887).add((Object)null);
        ((ArrayList) term9887).add((Object)null);
        Object term9885 = newInstance(Class.forName("nn.model.Node"));
        setField(term9885, term9885.getClass(), "type", enum57);
        setIntField(term9885, term9885.getClass(), "innovation", -1671982964);
        setField(term9885, term9885.getClass(), "connections", term9887);
        setDoubleField(term9885, term9885.getClass(), "bias", 0.555720831263745);
        ArrayList term9855 = new ArrayList();
        ((ArrayList) term9855).add(term9857);
        ((ArrayList) term9855).add(term9865);
        ((ArrayList) term9855).add(term9871);
        ((ArrayList) term9855).add(term9879);
        ((ArrayList) term9855).add(term9885);
        Object term9895 = newInstance(Class.forName("nn.model.Connection"));
        setField(term9895, term9895.getClass(), "in", null);
        setField(term9895, term9895.getClass(), "out", null);
        setFloatField(term9895, term9895.getClass(), "weight", 0.0F);
        setBooleanField(term9895, term9895.getClass(), "expressed", false);
        setIntField(term9895, term9895.getClass(), "innovation", 0);
        Object term9899 = newInstance(Class.forName("nn.model.Connection"));
        setField(term9899, term9899.getClass(), "in", null);
        setField(term9899, term9899.getClass(), "out", null);
        setFloatField(term9899, term9899.getClass(), "weight", 0.0F);
        setBooleanField(term9899, term9899.getClass(), "expressed", false);
        setIntField(term9899, term9899.getClass(), "innovation", 0);
        Object term9903 = newInstance(Class.forName("nn.model.Connection"));
        Object term9904 = newInstance(Class.forName("nn.model.Node"));
        Object term9907 = newInstance(Class.forName("nn.model.Node"));
        setField(term9904, term9904.getClass(), "type", enum57);
        setIntField(term9904, term9904.getClass(), "innovation", 270928865);
        setField(term9904, term9904.getClass(), "connections", null);
        setDoubleField(term9904, term9904.getClass(), "bias", 0.42881950761081433);
        setField(term9903, term9903.getClass(), "in", term9904);
        setField(term9907, term9907.getClass(), "type", null);
        setIntField(term9907, term9907.getClass(), "innovation", 1363887997);
        setField(term9907, term9907.getClass(), "connections", null);
        setDoubleField(term9907, term9907.getClass(), "bias", 0.5644745329624891);
        setField(term9903, term9903.getClass(), "out", term9907);
        setFloatField(term9903, term9903.getClass(), "weight", 0.39722002F);
        setBooleanField(term9903, term9903.getClass(), "expressed", false);
        setIntField(term9903, term9903.getClass(), "innovation", -1744763945);
        ArrayList term9893 = new ArrayList();
        ((ArrayList) term9893).add(term9895);
        ((ArrayList) term9893).add(term9899);
        ((ArrayList) term9893).add(term9903);
        term9854 = newInstance(Class.forName("nn.model.Genome"));
        Object term9915 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term9917 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term9919 = newInstance(Class.forName("java.util.Random"));
        Object term9920 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term9854, term9854.getClass(), "nodes", term9855);
        setField(term9854, term9854.getClass(), "connections", term9893);
        setIntField(term9915, term9915.getClass(), "counter", 100);
        setField(term9854, term9854.getClass(), "nodeInnovator", term9915);
        setIntField(term9917, term9917.getClass(), "counter", 100);
        setField(term9854, term9854.getClass(), "connectionInnovator", term9917);
        setLongField(term9920, term9920.getClass(), "value", 278827757683761L);
        setField(term9919, term9919.getClass(), "seed", term9920);
        setDoubleField(term9919, term9919.getClass(), "nextNextGaussian", 0.08993892686283389);
        setBooleanField(term9919, term9919.getClass(), "haveNextNextGaussian", true);
        setField(term9854, term9854.getClass(), "random", term9919);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnections", argTypes, term9854, args);
    }

};


