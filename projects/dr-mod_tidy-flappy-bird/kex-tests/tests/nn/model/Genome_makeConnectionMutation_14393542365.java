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
     Object term8155;

    public Genome_makeConnectionMutation_14393542365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8216 = Class.forName((String) "nn.model.Type");
        Field term8215 = ((Class) term8216).getDeclaredField((String) "SENSOR");
        ((Field) term8215).setAccessible(true);
        Object enum43 = ((Field) term8215).get((Object) null);
        ArrayList term8162 = new ArrayList();
        ((ArrayList) term8162).add((Object)null);
        ((ArrayList) term8162).add((Object)null);
        ((ArrayList) term8162).add((Object)null);
        ((ArrayList) term8162).add((Object)null);
        ((ArrayList) term8162).add((Object)null);
        ((ArrayList) term8162).add((Object)null);
        ((ArrayList) term8162).add((Object)null);
        Object term8158 = newInstance(Class.forName("nn.model.Node"));
        setField(term8158, term8158.getClass(), "type", enum43);
        setIntField(term8158, term8158.getClass(), "innovation", 186472650);
        setField(term8158, term8158.getClass(), "connections", term8162);
        setDoubleField(term8158, term8158.getClass(), "bias", 0.3803734512496052);
        Class<? extends Object> term8306 = Class.forName((String) "nn.model.Type");
        Field term8305 = ((Class) term8306).getDeclaredField((String) "SENSOR");
        ((Field) term8305).setAccessible(true);
        Object enum44 = ((Field) term8305).get((Object) null);
        ArrayList term8170 = new ArrayList();
        ((ArrayList) term8170).add((Object)null);
        ((ArrayList) term8170).add((Object)null);
        ((ArrayList) term8170).add((Object)null);
        ((ArrayList) term8170).add((Object)null);
        ((ArrayList) term8170).add((Object)null);
        ((ArrayList) term8170).add((Object)null);
        ((ArrayList) term8170).add((Object)null);
        ((ArrayList) term8170).add((Object)null);
        Object term8166 = newInstance(Class.forName("nn.model.Node"));
        setField(term8166, term8166.getClass(), "type", enum44);
        setIntField(term8166, term8166.getClass(), "innovation", 1378805929);
        setField(term8166, term8166.getClass(), "connections", term8170);
        setDoubleField(term8166, term8166.getClass(), "bias", 0.4215991359766782);
        Class<? extends Object> term8396 = Class.forName((String) "nn.model.Type");
        Field term8395 = ((Class) term8396).getDeclaredField((String) "OUTPUT");
        ((Field) term8395).setAccessible(true);
        Object enum45 = ((Field) term8395).get((Object) null);
        ArrayList term8178 = new ArrayList();
        ((ArrayList) term8178).add((Object)null);
        ((ArrayList) term8178).add((Object)null);
        Object term8174 = newInstance(Class.forName("nn.model.Node"));
        setField(term8174, term8174.getClass(), "type", enum45);
        setIntField(term8174, term8174.getClass(), "innovation", 279675992);
        setField(term8174, term8174.getClass(), "connections", term8178);
        setDoubleField(term8174, term8174.getClass(), "bias", 0.8361530707429777);
        ArrayList term8184 = new ArrayList();
        ((ArrayList) term8184).add((Object)null);
        ((ArrayList) term8184).add((Object)null);
        ((ArrayList) term8184).add((Object)null);
        ((ArrayList) term8184).add((Object)null);
        ((ArrayList) term8184).add((Object)null);
        Object term8182 = newInstance(Class.forName("nn.model.Node"));
        setField(term8182, term8182.getClass(), "type", enum45);
        setIntField(term8182, term8182.getClass(), "innovation", 388247095);
        setField(term8182, term8182.getClass(), "connections", term8184);
        setDoubleField(term8182, term8182.getClass(), "bias", 0.2368712300344461);
        ArrayList term8190 = new ArrayList();
        ((ArrayList) term8190).add((Object)null);
        Object term8188 = newInstance(Class.forName("nn.model.Node"));
        setField(term8188, term8188.getClass(), "type", enum43);
        setIntField(term8188, term8188.getClass(), "innovation", 1761540885);
        setField(term8188, term8188.getClass(), "connections", term8190);
        setDoubleField(term8188, term8188.getClass(), "bias", 0.9377667036664316);
        ArrayList term8196 = new ArrayList();
        Object term8194 = newInstance(Class.forName("nn.model.Node"));
        setField(term8194, term8194.getClass(), "type", enum43);
        setIntField(term8194, term8194.getClass(), "innovation", -633523956);
        setField(term8194, term8194.getClass(), "connections", term8196);
        setDoubleField(term8194, term8194.getClass(), "bias", 0.04732617365922176);
        ArrayList term8156 = new ArrayList();
        ((ArrayList) term8156).add(term8158);
        ((ArrayList) term8156).add(term8166);
        ((ArrayList) term8156).add(term8174);
        ((ArrayList) term8156).add(term8182);
        ((ArrayList) term8156).add(term8188);
        ((ArrayList) term8156).add(term8188);
        ((ArrayList) term8156).add(term8166);
        ((ArrayList) term8156).add(term8194);
        ((ArrayList) term8156).add(term8174);
        ArrayList term8202 = new ArrayList();
        term8155 = newInstance(Class.forName("nn.model.Genome"));
        Object term8206 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term8208 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term8210 = newInstance(Class.forName("java.util.Random"));
        Object term8211 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term8155, term8155.getClass(), "nodes", term8156);
        setField(term8155, term8155.getClass(), "connections", term8202);
        setIntField(term8206, term8206.getClass(), "counter", 100);
        setField(term8155, term8155.getClass(), "nodeInnovator", term8206);
        setIntField(term8208, term8208.getClass(), "counter", 100);
        setField(term8155, term8155.getClass(), "connectionInnovator", term8208);
        setLongField(term8211, term8211.getClass(), "value", 54684524558470L);
        setField(term8210, term8210.getClass(), "seed", term8211);
        setDoubleField(term8210, term8210.getClass(), "nextNextGaussian", 0.8485928043846015);
        setBooleanField(term8210, term8210.getClass(), "haveNextNextGaussian", false);
        setField(term8155, term8155.getClass(), "random", term8210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makeConnectionMutation", argTypes, term8155, args);
    }

};


