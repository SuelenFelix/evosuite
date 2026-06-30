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

public class Genome_enableConnectionMutation_57158436710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7030;

    public Genome_enableConnectionMutation_57158436710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7110 = Class.forName((String) "nn.model.Type");
        Field term7109 = ((Class) term7110).getDeclaredField((String) "HIDDEN");
        ((Field) term7109).setAccessible(true);
        Object enum41 = ((Field) term7109).get((Object) null);
        ArrayList term7037 = new ArrayList();
        ((ArrayList) term7037).add((Object)null);
        ((ArrayList) term7037).add((Object)null);
        ((ArrayList) term7037).add((Object)null);
        ((ArrayList) term7037).add((Object)null);
        ((ArrayList) term7037).add((Object)null);
        ((ArrayList) term7037).add((Object)null);
        Object term7033 = newInstance(Class.forName("nn.model.Node"));
        setField(term7033, term7033.getClass(), "type", enum41);
        setIntField(term7033, term7033.getClass(), "innovation", -1271598018);
        setField(term7033, term7033.getClass(), "connections", term7037);
        setDoubleField(term7033, term7033.getClass(), "bias", 0.9330567218798436);
        Class<? extends Object> term7200 = Class.forName((String) "nn.model.Type");
        Field term7199 = ((Class) term7200).getDeclaredField((String) "OUTPUT");
        ((Field) term7199).setAccessible(true);
        Object enum42 = ((Field) term7199).get((Object) null);
        ArrayList term7045 = new ArrayList();
        ((ArrayList) term7045).add((Object)null);
        Object term7041 = newInstance(Class.forName("nn.model.Node"));
        setField(term7041, term7041.getClass(), "type", enum42);
        setIntField(term7041, term7041.getClass(), "innovation", -299497261);
        setField(term7041, term7041.getClass(), "connections", term7045);
        setDoubleField(term7041, term7041.getClass(), "bias", 0.6571101155689184);
        Class<? extends Object> term7290 = Class.forName((String) "nn.model.Type");
        Field term7289 = ((Class) term7290).getDeclaredField((String) "HIDDEN");
        ((Field) term7289).setAccessible(true);
        Object enum43 = ((Field) term7289).get((Object) null);
        ArrayList term7053 = new ArrayList();
        ((ArrayList) term7053).add((Object)null);
        ((ArrayList) term7053).add((Object)null);
        Object term7049 = newInstance(Class.forName("nn.model.Node"));
        setField(term7049, term7049.getClass(), "type", enum43);
        setIntField(term7049, term7049.getClass(), "innovation", 811839399);
        setField(term7049, term7049.getClass(), "connections", term7053);
        setDoubleField(term7049, term7049.getClass(), "bias", 0.9832782789384902);
        ArrayList term7059 = new ArrayList();
        ((ArrayList) term7059).add((Object)null);
        ((ArrayList) term7059).add((Object)null);
        ((ArrayList) term7059).add((Object)null);
        ((ArrayList) term7059).add((Object)null);
        ((ArrayList) term7059).add((Object)null);
        ((ArrayList) term7059).add((Object)null);
        ((ArrayList) term7059).add((Object)null);
        Object term7057 = newInstance(Class.forName("nn.model.Node"));
        setField(term7057, term7057.getClass(), "type", enum42);
        setIntField(term7057, term7057.getClass(), "innovation", 504525721);
        setField(term7057, term7057.getClass(), "connections", term7059);
        setDoubleField(term7057, term7057.getClass(), "bias", 0.26197094142616373);
        ArrayList term7065 = new ArrayList();
        ((ArrayList) term7065).add((Object)null);
        ((ArrayList) term7065).add((Object)null);
        ((ArrayList) term7065).add((Object)null);
        Object term7063 = newInstance(Class.forName("nn.model.Node"));
        setField(term7063, term7063.getClass(), "type", enum42);
        setIntField(term7063, term7063.getClass(), "innovation", -1549952664);
        setField(term7063, term7063.getClass(), "connections", term7065);
        setDoubleField(term7063, term7063.getClass(), "bias", 0.7296354885225688);
        ArrayList term7071 = new ArrayList();
        ((ArrayList) term7071).add((Object)null);
        ((ArrayList) term7071).add((Object)null);
        ((ArrayList) term7071).add((Object)null);
        ((ArrayList) term7071).add((Object)null);
        ((ArrayList) term7071).add((Object)null);
        Object term7069 = newInstance(Class.forName("nn.model.Node"));
        setField(term7069, term7069.getClass(), "type", enum43);
        setIntField(term7069, term7069.getClass(), "innovation", 157967613);
        setField(term7069, term7069.getClass(), "connections", term7071);
        setDoubleField(term7069, term7069.getClass(), "bias", 0.5070134415466635);
        ArrayList term7031 = new ArrayList();
        ((ArrayList) term7031).add(term7033);
        ((ArrayList) term7031).add(term7041);
        ((ArrayList) term7031).add(term7049);
        ((ArrayList) term7031).add(term7057);
        ((ArrayList) term7031).add(term7063);
        ((ArrayList) term7031).add(term7069);
        Object term7079 = newInstance(Class.forName("nn.model.Connection"));
        Object term7080 = newInstance(Class.forName("nn.model.Node"));
        setField(term7079, term7079.getClass(), "in", term7057);
        setField(term7080, term7080.getClass(), "type", enum41);
        setIntField(term7080, term7080.getClass(), "innovation", 1835568392);
        setField(term7080, term7080.getClass(), "connections", null);
        setDoubleField(term7080, term7080.getClass(), "bias", 0.42502044755210044);
        setField(term7079, term7079.getClass(), "out", term7080);
        setFloatField(term7079, term7079.getClass(), "weight", 0.59576315F);
        setBooleanField(term7079, term7079.getClass(), "expressed", true);
        setIntField(term7079, term7079.getClass(), "innovation", 457470807);
        Object term7086 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7086, term7086.getClass(), "in", null);
        setField(term7086, term7086.getClass(), "out", null);
        setFloatField(term7086, term7086.getClass(), "weight", 0.0F);
        setBooleanField(term7086, term7086.getClass(), "expressed", false);
        setIntField(term7086, term7086.getClass(), "innovation", 0);
        Object term7090 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7090, term7090.getClass(), "in", null);
        setField(term7090, term7090.getClass(), "out", null);
        setFloatField(term7090, term7090.getClass(), "weight", 0.0F);
        setBooleanField(term7090, term7090.getClass(), "expressed", false);
        setIntField(term7090, term7090.getClass(), "innovation", 0);
        Object term7094 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7094, term7094.getClass(), "in", null);
        setField(term7094, term7094.getClass(), "out", null);
        setFloatField(term7094, term7094.getClass(), "weight", 0.0F);
        setBooleanField(term7094, term7094.getClass(), "expressed", false);
        setIntField(term7094, term7094.getClass(), "innovation", 0);
        ArrayList term7077 = new ArrayList();
        ((ArrayList) term7077).add(term7079);
        ((ArrayList) term7077).add(term7086);
        ((ArrayList) term7077).add(term7086);
        ((ArrayList) term7077).add(term7090);
        ((ArrayList) term7077).add(term7094);
        term7030 = newInstance(Class.forName("nn.model.Genome"));
        Object term7100 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term7102 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term7104 = newInstance(Class.forName("java.util.Random"));
        Object term7105 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term7030, term7030.getClass(), "nodes", term7031);
        setField(term7030, term7030.getClass(), "connections", term7077);
        setIntField(term7100, term7100.getClass(), "counter", 100);
        setField(term7030, term7030.getClass(), "nodeInnovator", term7100);
        setIntField(term7102, term7102.getClass(), "counter", 100);
        setField(term7030, term7030.getClass(), "connectionInnovator", term7102);
        setLongField(term7105, term7105.getClass(), "value", 50115654507526L);
        setField(term7104, term7104.getClass(), "seed", term7105);
        setDoubleField(term7104, term7104.getClass(), "nextNextGaussian", 0.1452204834065195);
        setBooleanField(term7104, term7104.getClass(), "haveNextNextGaussian", false);
        setField(term7030, term7030.getClass(), "random", term7104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "enableConnectionMutation", argTypes, term7030, args);
    }

};


