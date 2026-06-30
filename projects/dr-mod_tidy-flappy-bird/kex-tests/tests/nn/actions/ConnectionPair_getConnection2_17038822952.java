package nn.actions;

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
import static nn.actions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class ConnectionPair_getConnection2_17038822952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1312;

    public ConnectionPair_getConnection2_17038822952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1345 = Class.forName((String) "nn.model.Type");
        Field term1344 = ((Class) term1345).getDeclaredField((String) "OUTPUT");
        ((Field) term1344).setAccessible(true);
        Object enum5 = ((Field) term1344).get((Object) null);
        ArrayList term1319 = new ArrayList();
        ((ArrayList) term1319).add((Object)null);
        ((ArrayList) term1319).add((Object)null);
        ((ArrayList) term1319).add((Object)null);
        ((ArrayList) term1319).add((Object)null);
        ((ArrayList) term1319).add((Object)null);
        ((ArrayList) term1319).add((Object)null);
        ((ArrayList) term1319).add((Object)null);
        ((ArrayList) term1319).add((Object)null);
        ((ArrayList) term1319).add((Object)null);
        ArrayList term1326 = new ArrayList();
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        term1312 = newInstance(Class.forName("nn.actions.ConnectionPair"));
        Object term1313 = newInstance(Class.forName("nn.model.Connection"));
        Object term1314 = newInstance(Class.forName("nn.model.Node"));
        Object term1324 = newInstance(Class.forName("nn.model.Node"));
        Object term1334 = newInstance(Class.forName("nn.model.Connection"));
        Object term1335 = newInstance(Class.forName("nn.model.Node"));
        Object term1338 = newInstance(Class.forName("nn.model.Node"));
        setField(term1314, term1314.getClass(), "type", enum5);
        setIntField(term1314, term1314.getClass(), "innovation", -130649791);
        setField(term1314, term1314.getClass(), "connections", term1319);
        setDoubleField(term1314, term1314.getClass(), "bias", 0.45069204793711093);
        setField(term1313, term1313.getClass(), "in", term1314);
        setField(term1324, term1324.getClass(), "type", enum5);
        setIntField(term1324, term1324.getClass(), "innovation", 252575029);
        setField(term1324, term1324.getClass(), "connections", term1326);
        setDoubleField(term1324, term1324.getClass(), "bias", 0.05880719443135807);
        setField(term1313, term1313.getClass(), "out", term1324);
        setFloatField(term1313, term1313.getClass(), "weight", 0.11179066F);
        setBooleanField(term1313, term1313.getClass(), "expressed", false);
        setIntField(term1313, term1313.getClass(), "innovation", -1183353915);
        setField(term1312, term1312.getClass(), "connection1", term1313);
        setField(term1335, term1335.getClass(), "type", null);
        setIntField(term1335, term1335.getClass(), "innovation", 0);
        setField(term1335, term1335.getClass(), "connections", null);
        setDoubleField(term1335, term1335.getClass(), "bias", 0.0);
        setField(term1334, term1334.getClass(), "in", term1335);
        setField(term1338, term1338.getClass(), "type", null);
        setIntField(term1338, term1338.getClass(), "innovation", 0);
        setField(term1338, term1338.getClass(), "connections", null);
        setDoubleField(term1338, term1338.getClass(), "bias", 0.0);
        setField(term1334, term1334.getClass(), "out", term1338);
        setFloatField(term1334, term1334.getClass(), "weight", 0.24959576F);
        setBooleanField(term1334, term1334.getClass(), "expressed", false);
        setIntField(term1334, term1334.getClass(), "innovation", 1460722225);
        setField(term1312, term1312.getClass(), "connection2", term1334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.ConnectionPair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnection2", argTypes, term1312, args);
    }

};


