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

public class Genome_getConnections_5911918415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8144;

    public Genome_getConnections_5911918415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8220 = Class.forName((String) "nn.model.Type");
        Field term8219 = ((Class) term8220).getDeclaredField((String) "HIDDEN");
        ((Field) term8219).setAccessible(true);
        Object enum50 = ((Field) term8219).get((Object) null);
        ArrayList term8151 = new ArrayList();
        Object term8147 = newInstance(Class.forName("nn.model.Node"));
        setField(term8147, term8147.getClass(), "type", enum50);
        setIntField(term8147, term8147.getClass(), "innovation", 186472650);
        setField(term8147, term8147.getClass(), "connections", term8151);
        setDoubleField(term8147, term8147.getClass(), "bias", 0.5197346036604176);
        ArrayList term8157 = new ArrayList();
        ((ArrayList) term8157).add((Object)null);
        ((ArrayList) term8157).add((Object)null);
        Object term8155 = newInstance(Class.forName("nn.model.Node"));
        setField(term8155, term8155.getClass(), "type", enum50);
        setIntField(term8155, term8155.getClass(), "innovation", 279675992);
        setField(term8155, term8155.getClass(), "connections", term8157);
        setDoubleField(term8155, term8155.getClass(), "bias", 0.6695336994403062);
        Class<? extends Object> term8310 = Class.forName((String) "nn.model.Type");
        Field term8309 = ((Class) term8310).getDeclaredField((String) "OUTPUT");
        ((Field) term8309).setAccessible(true);
        Object enum51 = ((Field) term8309).get((Object) null);
        ArrayList term8165 = new ArrayList();
        ((ArrayList) term8165).add((Object)null);
        ((ArrayList) term8165).add((Object)null);
        ((ArrayList) term8165).add((Object)null);
        ((ArrayList) term8165).add((Object)null);
        ((ArrayList) term8165).add((Object)null);
        ((ArrayList) term8165).add((Object)null);
        ((ArrayList) term8165).add((Object)null);
        ((ArrayList) term8165).add((Object)null);
        Object term8161 = newInstance(Class.forName("nn.model.Node"));
        setField(term8161, term8161.getClass(), "type", enum51);
        setIntField(term8161, term8161.getClass(), "innovation", 1833713431);
        setField(term8161, term8161.getClass(), "connections", term8165);
        setDoubleField(term8161, term8161.getClass(), "bias", 0.6397358922018691);
        ArrayList term8171 = new ArrayList();
        ((ArrayList) term8171).add((Object)null);
        ((ArrayList) term8171).add((Object)null);
        Object term8169 = newInstance(Class.forName("nn.model.Node"));
        setField(term8169, term8169.getClass(), "type", enum51);
        setIntField(term8169, term8169.getClass(), "innovation", -2003607923);
        setField(term8169, term8169.getClass(), "connections", term8171);
        setDoubleField(term8169, term8169.getClass(), "bias", 0.05083782629282396);
        ArrayList term8177 = new ArrayList();
        ((ArrayList) term8177).add((Object)null);
        ((ArrayList) term8177).add((Object)null);
        ((ArrayList) term8177).add((Object)null);
        ((ArrayList) term8177).add((Object)null);
        ((ArrayList) term8177).add((Object)null);
        ((ArrayList) term8177).add((Object)null);
        ((ArrayList) term8177).add((Object)null);
        ((ArrayList) term8177).add((Object)null);
        Object term8175 = newInstance(Class.forName("nn.model.Node"));
        setField(term8175, term8175.getClass(), "type", enum51);
        setIntField(term8175, term8175.getClass(), "innovation", -633523956);
        setField(term8175, term8175.getClass(), "connections", term8177);
        setDoubleField(term8175, term8175.getClass(), "bias", 0.1937075341828559);
        Class<? extends Object> term8400 = Class.forName((String) "nn.model.Type");
        Field term8399 = ((Class) term8400).getDeclaredField((String) "OUTPUT");
        ((Field) term8399).setAccessible(true);
        Object enum52 = ((Field) term8399).get((Object) null);
        ArrayList term8185 = new ArrayList();
        Object term8181 = newInstance(Class.forName("nn.model.Node"));
        setField(term8181, term8181.getClass(), "type", enum52);
        setIntField(term8181, term8181.getClass(), "innovation", 1761540885);
        setField(term8181, term8181.getClass(), "connections", term8185);
        setDoubleField(term8181, term8181.getClass(), "bias", 0.3821023664998483);
        ArrayList term8145 = new ArrayList();
        ((ArrayList) term8145).add(term8147);
        ((ArrayList) term8145).add(term8155);
        ((ArrayList) term8145).add(term8161);
        ((ArrayList) term8145).add(term8169);
        ((ArrayList) term8145).add(term8155);
        ((ArrayList) term8145).add(term8175);
        ((ArrayList) term8145).add(term8181);
        Object term8193 = newInstance(Class.forName("nn.model.Connection"));
        Object term8194 = newInstance(Class.forName("nn.model.Node"));
        setField(term8194, term8194.getClass(), "type", enum51);
        setIntField(term8194, term8194.getClass(), "innovation", -552272253);
        setField(term8194, term8194.getClass(), "connections", null);
        setDoubleField(term8194, term8194.getClass(), "bias", 0.8323532236646399);
        setField(term8193, term8193.getClass(), "in", term8194);
        setField(term8193, term8193.getClass(), "out", term8161);
        setFloatField(term8193, term8193.getClass(), "weight", 0.74047095F);
        setBooleanField(term8193, term8193.getClass(), "expressed", true);
        setIntField(term8193, term8193.getClass(), "innovation", -706222608);
        Object term8200 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8200, term8200.getClass(), "in", null);
        setField(term8200, term8200.getClass(), "out", null);
        setFloatField(term8200, term8200.getClass(), "weight", 0.0F);
        setBooleanField(term8200, term8200.getClass(), "expressed", false);
        setIntField(term8200, term8200.getClass(), "innovation", 0);
        Object term8204 = newInstance(Class.forName("nn.model.Connection"));
        setField(term8204, term8204.getClass(), "in", null);
        setField(term8204, term8204.getClass(), "out", null);
        setFloatField(term8204, term8204.getClass(), "weight", 0.0F);
        setBooleanField(term8204, term8204.getClass(), "expressed", false);
        setIntField(term8204, term8204.getClass(), "innovation", 0);
        ArrayList term8191 = new ArrayList();
        ((ArrayList) term8191).add(term8193);
        ((ArrayList) term8191).add(term8200);
        ((ArrayList) term8191).add(term8204);
        term8144 = newInstance(Class.forName("nn.model.Genome"));
        Object term8210 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term8212 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term8214 = newInstance(Class.forName("java.util.Random"));
        Object term8215 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term8144, term8144.getClass(), "nodes", term8145);
        setField(term8144, term8144.getClass(), "connections", term8191);
        setIntField(term8210, term8210.getClass(), "counter", 100);
        setField(term8144, term8144.getClass(), "nodeInnovator", term8210);
        setIntField(term8212, term8212.getClass(), "counter", 100);
        setField(term8144, term8144.getClass(), "connectionInnovator", term8212);
        setLongField(term8215, term8215.getClass(), "value", 70588682055302L);
        setField(term8214, term8214.getClass(), "seed", term8215);
        setDoubleField(term8214, term8214.getClass(), "nextNextGaussian", 0.34363635678920734);
        setBooleanField(term8214, term8214.getClass(), "haveNextNextGaussian", false);
        setField(term8144, term8144.getClass(), "random", term8214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnections", argTypes, term8144, args);
    }

};


