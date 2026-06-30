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

public class ConnectionPair_getConnection1_17038813341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1097;

    public ConnectionPair_getConnection1_17038813341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1133 = Class.forName((String) "nn.model.Type");
        Field term1132 = ((Class) term1133).getDeclaredField((String) "OUTPUT");
        ((Field) term1132).setAccessible(true);
        Object enum3 = ((Field) term1132).get((Object) null);
        ArrayList term1104 = new ArrayList();
        ((ArrayList) term1104).add((Object)null);
        Class<? extends Object> term1223 = Class.forName((String) "nn.model.Type");
        Field term1222 = ((Class) term1223).getDeclaredField((String) "HIDDEN");
        ((Field) term1222).setAccessible(true);
        Object enum4 = ((Field) term1222).get((Object) null);
        ArrayList term1121 = new ArrayList();
        ((ArrayList) term1121).add((Object)null);
        ((ArrayList) term1121).add((Object)null);
        ((ArrayList) term1121).add((Object)null);
        ((ArrayList) term1121).add((Object)null);
        ((ArrayList) term1121).add((Object)null);
        ((ArrayList) term1121).add((Object)null);
        ((ArrayList) term1121).add((Object)null);
        ((ArrayList) term1121).add((Object)null);
        ((ArrayList) term1121).add((Object)null);
        term1097 = newInstance(Class.forName("nn.actions.ConnectionPair"));
        Object term1098 = newInstance(Class.forName("nn.model.Connection"));
        Object term1099 = newInstance(Class.forName("nn.model.Node"));
        Object term1109 = newInstance(Class.forName("nn.model.Node"));
        Object term1115 = newInstance(Class.forName("nn.model.Connection"));
        Object term1116 = newInstance(Class.forName("nn.model.Node"));
        Object term1126 = newInstance(Class.forName("nn.model.Node"));
        setField(term1099, term1099.getClass(), "type", enum3);
        setIntField(term1099, term1099.getClass(), "innovation", 1684998508);
        setField(term1099, term1099.getClass(), "connections", term1104);
        setDoubleField(term1099, term1099.getClass(), "bias", 0.1245258965512791);
        setField(term1098, term1098.getClass(), "in", term1099);
        setField(term1109, term1109.getClass(), "type", null);
        setIntField(term1109, term1109.getClass(), "innovation", 0);
        setField(term1109, term1109.getClass(), "connections", null);
        setDoubleField(term1109, term1109.getClass(), "bias", 0.0);
        setField(term1098, term1098.getClass(), "out", term1109);
        setFloatField(term1098, term1098.getClass(), "weight", 0.21098667F);
        setBooleanField(term1098, term1098.getClass(), "expressed", false);
        setIntField(term1098, term1098.getClass(), "innovation", 1320570890);
        setField(term1097, term1097.getClass(), "connection1", term1098);
        setField(term1116, term1116.getClass(), "type", enum4);
        setIntField(term1116, term1116.getClass(), "innovation", -1146679443);
        setField(term1116, term1116.getClass(), "connections", term1121);
        setDoubleField(term1116, term1116.getClass(), "bias", 0.7080134263823477);
        setField(term1115, term1115.getClass(), "in", term1116);
        setField(term1126, term1126.getClass(), "type", null);
        setIntField(term1126, term1126.getClass(), "innovation", 0);
        setField(term1126, term1126.getClass(), "connections", null);
        setDoubleField(term1126, term1126.getClass(), "bias", 0.0);
        setField(term1115, term1115.getClass(), "out", term1126);
        setFloatField(term1115, term1115.getClass(), "weight", 0.1610204F);
        setBooleanField(term1115, term1115.getClass(), "expressed", false);
        setIntField(term1115, term1115.getClass(), "innovation", -1111249833);
        setField(term1097, term1097.getClass(), "connection2", term1115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.ConnectionPair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnection1", argTypes, term1097, args);
    }

};


