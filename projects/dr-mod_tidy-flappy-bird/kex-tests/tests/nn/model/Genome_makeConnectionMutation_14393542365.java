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

public class Genome_makeConnectionMutation_14393542365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8153;

    public Genome_makeConnectionMutation_14393542365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8214 = Class.forName((String) "nn.model.Type");
        Field term8213 = ((Class) term8214).getDeclaredField((String) "SENSOR");
        ((Field) term8213).setAccessible(true);
        Object enum43 = ((Field) term8213).get((Object) null);
        ArrayList term8160 = new ArrayList();
        ((ArrayList) term8160).add((Object)null);
        ((ArrayList) term8160).add((Object)null);
        ((ArrayList) term8160).add((Object)null);
        ((ArrayList) term8160).add((Object)null);
        ((ArrayList) term8160).add((Object)null);
        ((ArrayList) term8160).add((Object)null);
        ((ArrayList) term8160).add((Object)null);
        Object term8156 = newInstance(Class.forName("nn.model.Node"));
        setField(term8156, term8156.getClass(), "type", enum43);
        setIntField(term8156, term8156.getClass(), "innovation", 186472650);
        setField(term8156, term8156.getClass(), "connections", term8160);
        setDoubleField(term8156, term8156.getClass(), "bias", 0.3803734512496052);
        Class<? extends Object> term8304 = Class.forName((String) "nn.model.Type");
        Field term8303 = ((Class) term8304).getDeclaredField((String) "SENSOR");
        ((Field) term8303).setAccessible(true);
        Object enum44 = ((Field) term8303).get((Object) null);
        ArrayList term8168 = new ArrayList();
        ((ArrayList) term8168).add((Object)null);
        ((ArrayList) term8168).add((Object)null);
        ((ArrayList) term8168).add((Object)null);
        ((ArrayList) term8168).add((Object)null);
        ((ArrayList) term8168).add((Object)null);
        ((ArrayList) term8168).add((Object)null);
        ((ArrayList) term8168).add((Object)null);
        ((ArrayList) term8168).add((Object)null);
        Object term8164 = newInstance(Class.forName("nn.model.Node"));
        setField(term8164, term8164.getClass(), "type", enum44);
        setIntField(term8164, term8164.getClass(), "innovation", 1378805929);
        setField(term8164, term8164.getClass(), "connections", term8168);
        setDoubleField(term8164, term8164.getClass(), "bias", 0.4215991359766782);
        Class<? extends Object> term8394 = Class.forName((String) "nn.model.Type");
        Field term8393 = ((Class) term8394).getDeclaredField((String) "OUTPUT");
        ((Field) term8393).setAccessible(true);
        Object enum45 = ((Field) term8393).get((Object) null);
        ArrayList term8176 = new ArrayList();
        ((ArrayList) term8176).add((Object)null);
        ((ArrayList) term8176).add((Object)null);
        Object term8172 = newInstance(Class.forName("nn.model.Node"));
        setField(term8172, term8172.getClass(), "type", enum45);
        setIntField(term8172, term8172.getClass(), "innovation", 279675992);
        setField(term8172, term8172.getClass(), "connections", term8176);
        setDoubleField(term8172, term8172.getClass(), "bias", 0.8361530707429777);
        ArrayList term8182 = new ArrayList();
        ((ArrayList) term8182).add((Object)null);
        ((ArrayList) term8182).add((Object)null);
        ((ArrayList) term8182).add((Object)null);
        ((ArrayList) term8182).add((Object)null);
        ((ArrayList) term8182).add((Object)null);
        Object term8180 = newInstance(Class.forName("nn.model.Node"));
        setField(term8180, term8180.getClass(), "type", enum45);
        setIntField(term8180, term8180.getClass(), "innovation", 388247095);
        setField(term8180, term8180.getClass(), "connections", term8182);
        setDoubleField(term8180, term8180.getClass(), "bias", 0.2368712300344461);
        ArrayList term8188 = new ArrayList();
        ((ArrayList) term8188).add((Object)null);
        Object term8186 = newInstance(Class.forName("nn.model.Node"));
        setField(term8186, term8186.getClass(), "type", enum43);
        setIntField(term8186, term8186.getClass(), "innovation", 1761540885);
        setField(term8186, term8186.getClass(), "connections", term8188);
        setDoubleField(term8186, term8186.getClass(), "bias", 0.9377667036664316);
        ArrayList term8194 = new ArrayList();
        Object term8192 = newInstance(Class.forName("nn.model.Node"));
        setField(term8192, term8192.getClass(), "type", enum43);
        setIntField(term8192, term8192.getClass(), "innovation", -633523956);
        setField(term8192, term8192.getClass(), "connections", term8194);
        setDoubleField(term8192, term8192.getClass(), "bias", 0.04732617365922176);
        ArrayList term8154 = new ArrayList();
        ((ArrayList) term8154).add(term8156);
        ((ArrayList) term8154).add(term8164);
        ((ArrayList) term8154).add(term8172);
        ((ArrayList) term8154).add(term8180);
        ((ArrayList) term8154).add(term8186);
        ((ArrayList) term8154).add(term8186);
        ((ArrayList) term8154).add(term8164);
        ((ArrayList) term8154).add(term8192);
        ((ArrayList) term8154).add(term8172);
        ArrayList term8200 = new ArrayList();
        term8153 = newInstance(Class.forName("nn.model.Genome"));
        Object term8204 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term8206 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term8208 = newInstance(Class.forName("java.util.Random"));
        Object term8209 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term8153, term8153.getClass(), "nodes", term8154);
        setField(term8153, term8153.getClass(), "connections", term8200);
        setIntField(term8204, term8204.getClass(), "counter", 100);
        setField(term8153, term8153.getClass(), "nodeInnovator", term8204);
        setIntField(term8206, term8206.getClass(), "counter", 100);
        setField(term8153, term8153.getClass(), "connectionInnovator", term8206);
        setLongField(term8209, term8209.getClass(), "value", 169956687661446L);
        setField(term8208, term8208.getClass(), "seed", term8209);
        setDoubleField(term8208, term8208.getClass(), "nextNextGaussian", 0.8485928043846015);
        setBooleanField(term8208, term8208.getClass(), "haveNextNextGaussian", false);
        setField(term8153, term8153.getClass(), "random", term8208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makeConnectionMutation", argTypes, term8153, args);
    }

};


