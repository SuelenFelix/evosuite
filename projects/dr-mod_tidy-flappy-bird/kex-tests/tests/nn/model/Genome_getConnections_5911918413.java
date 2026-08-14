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
     Object term9856;

    public Genome_getConnections_5911918413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9927 = Class.forName((String) "nn.model.Type");
        Field term9926 = ((Class) term9927).getDeclaredField((String) "SENSOR");
        ((Field) term9926).setAccessible(true);
        Object enum57 = ((Field) term9926).get((Object) null);
        ArrayList term9863 = new ArrayList();
        ((ArrayList) term9863).add((Object)null);
        ((ArrayList) term9863).add((Object)null);
        ((ArrayList) term9863).add((Object)null);
        ((ArrayList) term9863).add((Object)null);
        ((ArrayList) term9863).add((Object)null);
        ((ArrayList) term9863).add((Object)null);
        ((ArrayList) term9863).add((Object)null);
        ((ArrayList) term9863).add((Object)null);
        Object term9859 = newInstance(Class.forName("nn.model.Node"));
        setField(term9859, term9859.getClass(), "type", enum57);
        setIntField(term9859, term9859.getClass(), "innovation", -435079567);
        setField(term9859, term9859.getClass(), "connections", term9863);
        setDoubleField(term9859, term9859.getClass(), "bias", 0.7860233123966477);
        ArrayList term9869 = new ArrayList();
        ((ArrayList) term9869).add((Object)null);
        ((ArrayList) term9869).add((Object)null);
        ((ArrayList) term9869).add((Object)null);
        ((ArrayList) term9869).add((Object)null);
        ((ArrayList) term9869).add((Object)null);
        ((ArrayList) term9869).add((Object)null);
        Object term9867 = newInstance(Class.forName("nn.model.Node"));
        setField(term9867, term9867.getClass(), "type", enum57);
        setIntField(term9867, term9867.getClass(), "innovation", -1911828505);
        setField(term9867, term9867.getClass(), "connections", term9869);
        setDoubleField(term9867, term9867.getClass(), "bias", 0.06433964340439391);
        Class<? extends Object> term10017 = Class.forName((String) "nn.model.Type");
        Field term10016 = ((Class) term10017).getDeclaredField((String) "OUTPUT");
        ((Field) term10016).setAccessible(true);
        Object enum58 = ((Field) term10016).get((Object) null);
        ArrayList term9877 = new ArrayList();
        ((ArrayList) term9877).add((Object)null);
        ((ArrayList) term9877).add((Object)null);
        Object term9873 = newInstance(Class.forName("nn.model.Node"));
        setField(term9873, term9873.getClass(), "type", enum58);
        setIntField(term9873, term9873.getClass(), "innovation", -1017617829);
        setField(term9873, term9873.getClass(), "connections", term9877);
        setDoubleField(term9873, term9873.getClass(), "bias", 0.8988938672874076);
        ArrayList term9883 = new ArrayList();
        ((ArrayList) term9883).add((Object)null);
        ((ArrayList) term9883).add((Object)null);
        ((ArrayList) term9883).add((Object)null);
        ((ArrayList) term9883).add((Object)null);
        Object term9881 = newInstance(Class.forName("nn.model.Node"));
        setField(term9881, term9881.getClass(), "type", enum58);
        setIntField(term9881, term9881.getClass(), "innovation", -1362132929);
        setField(term9881, term9881.getClass(), "connections", term9883);
        setDoubleField(term9881, term9881.getClass(), "bias", 0.008961627061484845);
        ArrayList term9889 = new ArrayList();
        ((ArrayList) term9889).add((Object)null);
        ((ArrayList) term9889).add((Object)null);
        ((ArrayList) term9889).add((Object)null);
        ((ArrayList) term9889).add((Object)null);
        ((ArrayList) term9889).add((Object)null);
        ((ArrayList) term9889).add((Object)null);
        ((ArrayList) term9889).add((Object)null);
        ((ArrayList) term9889).add((Object)null);
        ((ArrayList) term9889).add((Object)null);
        Object term9887 = newInstance(Class.forName("nn.model.Node"));
        setField(term9887, term9887.getClass(), "type", enum57);
        setIntField(term9887, term9887.getClass(), "innovation", -1671982964);
        setField(term9887, term9887.getClass(), "connections", term9889);
        setDoubleField(term9887, term9887.getClass(), "bias", 0.555720831263745);
        ArrayList term9857 = new ArrayList();
        ((ArrayList) term9857).add(term9859);
        ((ArrayList) term9857).add(term9867);
        ((ArrayList) term9857).add(term9873);
        ((ArrayList) term9857).add(term9881);
        ((ArrayList) term9857).add(term9887);
        Object term9897 = newInstance(Class.forName("nn.model.Connection"));
        setField(term9897, term9897.getClass(), "in", null);
        setField(term9897, term9897.getClass(), "out", null);
        setFloatField(term9897, term9897.getClass(), "weight", 0.0F);
        setBooleanField(term9897, term9897.getClass(), "expressed", false);
        setIntField(term9897, term9897.getClass(), "innovation", 0);
        Object term9901 = newInstance(Class.forName("nn.model.Connection"));
        setField(term9901, term9901.getClass(), "in", null);
        setField(term9901, term9901.getClass(), "out", null);
        setFloatField(term9901, term9901.getClass(), "weight", 0.0F);
        setBooleanField(term9901, term9901.getClass(), "expressed", false);
        setIntField(term9901, term9901.getClass(), "innovation", 0);
        Object term9905 = newInstance(Class.forName("nn.model.Connection"));
        Object term9906 = newInstance(Class.forName("nn.model.Node"));
        Object term9909 = newInstance(Class.forName("nn.model.Node"));
        setField(term9906, term9906.getClass(), "type", enum57);
        setIntField(term9906, term9906.getClass(), "innovation", 270928865);
        setField(term9906, term9906.getClass(), "connections", null);
        setDoubleField(term9906, term9906.getClass(), "bias", 0.42881950761081433);
        setField(term9905, term9905.getClass(), "in", term9906);
        setField(term9909, term9909.getClass(), "type", null);
        setIntField(term9909, term9909.getClass(), "innovation", 1363887997);
        setField(term9909, term9909.getClass(), "connections", null);
        setDoubleField(term9909, term9909.getClass(), "bias", 0.5644745329624891);
        setField(term9905, term9905.getClass(), "out", term9909);
        setFloatField(term9905, term9905.getClass(), "weight", 0.39722002F);
        setBooleanField(term9905, term9905.getClass(), "expressed", false);
        setIntField(term9905, term9905.getClass(), "innovation", -1744763945);
        ArrayList term9895 = new ArrayList();
        ((ArrayList) term9895).add(term9897);
        ((ArrayList) term9895).add(term9901);
        ((ArrayList) term9895).add(term9905);
        term9856 = newInstance(Class.forName("nn.model.Genome"));
        Object term9917 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term9919 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term9921 = newInstance(Class.forName("java.util.Random"));
        Object term9922 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term9856, term9856.getClass(), "nodes", term9857);
        setField(term9856, term9856.getClass(), "connections", term9895);
        setIntField(term9917, term9917.getClass(), "counter", 100);
        setField(term9856, term9856.getClass(), "nodeInnovator", term9917);
        setIntField(term9919, term9919.getClass(), "counter", 100);
        setField(term9856, term9856.getClass(), "connectionInnovator", term9919);
        setLongField(term9922, term9922.getClass(), "value", 95351611575403L);
        setField(term9921, term9921.getClass(), "seed", term9922);
        setDoubleField(term9921, term9921.getClass(), "nextNextGaussian", 0.08993892686283389);
        setBooleanField(term9921, term9921.getClass(), "haveNextNextGaussian", true);
        setField(term9856, term9856.getClass(), "random", term9921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnections", argTypes, term9856, args);
    }

};


