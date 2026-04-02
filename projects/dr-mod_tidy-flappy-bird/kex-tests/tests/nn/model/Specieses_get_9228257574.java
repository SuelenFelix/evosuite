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

public class Specieses_get_9228257574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2997;
     Object term3002;

    public Specieses_get_9228257574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2998 = new ArrayList();
        term2997 = newInstance(Class.forName("nn.model.Specieses"));
        setField(term2997, term2997.getClass(), "specieses", term2998);
        Class<? extends Object> term3084 = Class.forName((String) "nn.model.Type");
        Field term3083 = ((Class) term3084).getDeclaredField((String) "HIDDEN");
        ((Field) term3083).setAccessible(true);
        Object enum22 = ((Field) term3083).get((Object) null);
        ArrayList term3009 = new ArrayList();
        ((ArrayList) term3009).add((Object)null);
        ((ArrayList) term3009).add((Object)null);
        ((ArrayList) term3009).add((Object)null);
        ((ArrayList) term3009).add((Object)null);
        ((ArrayList) term3009).add((Object)null);
        ((ArrayList) term3009).add((Object)null);
        Object term3005 = newInstance(Class.forName("nn.model.Node"));
        setField(term3005, term3005.getClass(), "type", enum22);
        setIntField(term3005, term3005.getClass(), "innovation", 574481092);
        setField(term3005, term3005.getClass(), "connections", term3009);
        setDoubleField(term3005, term3005.getClass(), "bias", 0.3147638130628596);
        Class<? extends Object> term3174 = Class.forName((String) "nn.model.Type");
        Field term3173 = ((Class) term3174).getDeclaredField((String) "HIDDEN");
        ((Field) term3173).setAccessible(true);
        Object enum23 = ((Field) term3173).get((Object) null);
        ArrayList term3017 = new ArrayList();
        Object term3013 = newInstance(Class.forName("nn.model.Node"));
        setField(term3013, term3013.getClass(), "type", enum23);
        setIntField(term3013, term3013.getClass(), "innovation", -49052672);
        setField(term3013, term3013.getClass(), "connections", term3017);
        setDoubleField(term3013, term3013.getClass(), "bias", 0.04708163975594959);
        ArrayList term3023 = new ArrayList();
        ((ArrayList) term3023).add((Object)null);
        ((ArrayList) term3023).add((Object)null);
        ((ArrayList) term3023).add((Object)null);
        Object term3021 = newInstance(Class.forName("nn.model.Node"));
        setField(term3021, term3021.getClass(), "type", enum22);
        setIntField(term3021, term3021.getClass(), "innovation", -310528004);
        setField(term3021, term3021.getClass(), "connections", term3023);
        setDoubleField(term3021, term3021.getClass(), "bias", 0.9963416078314885);
        Class<? extends Object> term3264 = Class.forName((String) "nn.model.Type");
        Field term3263 = ((Class) term3264).getDeclaredField((String) "SENSOR");
        ((Field) term3263).setAccessible(true);
        Object enum24 = ((Field) term3263).get((Object) null);
        ArrayList term3031 = new ArrayList();
        ((ArrayList) term3031).add((Object)null);
        ((ArrayList) term3031).add((Object)null);
        ((ArrayList) term3031).add((Object)null);
        ((ArrayList) term3031).add((Object)null);
        ((ArrayList) term3031).add((Object)null);
        ((ArrayList) term3031).add((Object)null);
        ((ArrayList) term3031).add((Object)null);
        ((ArrayList) term3031).add((Object)null);
        ((ArrayList) term3031).add((Object)null);
        Object term3027 = newInstance(Class.forName("nn.model.Node"));
        setField(term3027, term3027.getClass(), "type", enum24);
        setIntField(term3027, term3027.getClass(), "innovation", 803925431);
        setField(term3027, term3027.getClass(), "connections", term3031);
        setDoubleField(term3027, term3027.getClass(), "bias", 0.06795505641704636);
        ArrayList term3003 = new ArrayList();
        ((ArrayList) term3003).add(term3005);
        ((ArrayList) term3003).add(term3013);
        ((ArrayList) term3003).add(term3021);
        ((ArrayList) term3003).add(term3027);
        Object term3039 = newInstance(Class.forName("nn.model.Connection"));
        setField(term3039, term3039.getClass(), "in", null);
        setField(term3039, term3039.getClass(), "out", null);
        setFloatField(term3039, term3039.getClass(), "weight", 0.0F);
        setBooleanField(term3039, term3039.getClass(), "expressed", false);
        setIntField(term3039, term3039.getClass(), "innovation", 0);
        Object term3043 = newInstance(Class.forName("nn.model.Connection"));
        setField(term3043, term3043.getClass(), "in", null);
        setField(term3043, term3043.getClass(), "out", null);
        setFloatField(term3043, term3043.getClass(), "weight", 0.0F);
        setBooleanField(term3043, term3043.getClass(), "expressed", false);
        setIntField(term3043, term3043.getClass(), "innovation", 0);
        Object term3047 = newInstance(Class.forName("nn.model.Connection"));
        setField(term3047, term3047.getClass(), "in", null);
        setField(term3047, term3047.getClass(), "out", null);
        setFloatField(term3047, term3047.getClass(), "weight", 0.0F);
        setBooleanField(term3047, term3047.getClass(), "expressed", false);
        setIntField(term3047, term3047.getClass(), "innovation", 0);
        Object term3051 = newInstance(Class.forName("nn.model.Connection"));
        Object term3052 = newInstance(Class.forName("nn.model.Node"));
        Object term3055 = newInstance(Class.forName("nn.model.Node"));
        setField(term3052, term3052.getClass(), "type", enum24);
        setIntField(term3052, term3052.getClass(), "innovation", -634976996);
        setField(term3052, term3052.getClass(), "connections", null);
        setDoubleField(term3052, term3052.getClass(), "bias", 0.10087360265456191);
        setField(term3051, term3051.getClass(), "in", term3052);
        setField(term3055, term3055.getClass(), "type", enum23);
        setIntField(term3055, term3055.getClass(), "innovation", -1404350380);
        setField(term3055, term3055.getClass(), "connections", null);
        setDoubleField(term3055, term3055.getClass(), "bias", 0.5957631946929023);
        setField(term3051, term3051.getClass(), "out", term3055);
        setFloatField(term3051, term3051.getClass(), "weight", 0.21098667F);
        setBooleanField(term3051, term3051.getClass(), "expressed", false);
        setIntField(term3051, term3051.getClass(), "innovation", -2013924238);
        Object term3061 = newInstance(Class.forName("nn.model.Connection"));
        Object term3062 = newInstance(Class.forName("nn.model.Node"));
        setField(term3061, term3061.getClass(), "in", term3027);
        setField(term3062, term3062.getClass(), "type", enum22);
        setIntField(term3062, term3062.getClass(), "innovation", 76929641);
        setField(term3062, term3062.getClass(), "connections", null);
        setDoubleField(term3062, term3062.getClass(), "bias", 0.198746516614277);
        setField(term3061, term3061.getClass(), "out", term3062);
        setFloatField(term3061, term3061.getClass(), "weight", 0.791937F);
        setBooleanField(term3061, term3061.getClass(), "expressed", false);
        setIntField(term3061, term3061.getClass(), "innovation", -2003192918);
        Object term3068 = newInstance(Class.forName("nn.model.Connection"));
        setField(term3068, term3068.getClass(), "in", null);
        setField(term3068, term3068.getClass(), "out", null);
        setFloatField(term3068, term3068.getClass(), "weight", 0.0F);
        setBooleanField(term3068, term3068.getClass(), "expressed", false);
        setIntField(term3068, term3068.getClass(), "innovation", 0);
        ArrayList term3037 = new ArrayList();
        ((ArrayList) term3037).add(term3039);
        ((ArrayList) term3037).add(term3043);
        ((ArrayList) term3037).add(term3047);
        ((ArrayList) term3037).add(term3051);
        ((ArrayList) term3037).add(term3061);
        ((ArrayList) term3037).add(term3039);
        ((ArrayList) term3037).add(term3051);
        ((ArrayList) term3037).add(term3068);
        term3002 = newInstance(Class.forName("nn.model.Genome"));
        Object term3074 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term3076 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term3078 = newInstance(Class.forName("java.util.Random"));
        Object term3079 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term3002, term3002.getClass(), "nodes", term3003);
        setField(term3002, term3002.getClass(), "connections", term3037);
        setIntField(term3074, term3074.getClass(), "counter", 100);
        setField(term3002, term3002.getClass(), "nodeInnovator", term3074);
        setIntField(term3076, term3076.getClass(), "counter", 100);
        setField(term3002, term3002.getClass(), "connectionInnovator", term3076);
        setLongField(term3079, term3079.getClass(), "value", 13992495049811L);
        setField(term3078, term3078.getClass(), "seed", term3079);
        setDoubleField(term3078, term3078.getClass(), "nextNextGaussian", 0.24810335047389354);
        setBooleanField(term3078, term3078.getClass(), "haveNextNextGaussian", true);
        setField(term3002, term3002.getClass(), "random", term3078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Specieses");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Genome");
        Object[] args = new Object[1];
        args[0] = term3002;
        callMethod(klass, "get", argTypes, term2997, args);
    }

};


