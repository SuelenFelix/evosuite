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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Connection_getWeight_18686001383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term788;

    public Connection_getWeight_18686001383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term841 = Class.forName((String) "nn.model.Type");
        Field term840 = ((Class) term841).getDeclaredField((String) "OUTPUT");
        ((Field) term840).setAccessible(true);
        Object enum6 = ((Field) term840).get((Object) null);
        Object term803 = newInstance(Class.forName("nn.model.Connection"));
        setField(term803, term803.getClass(), "in", null);
        setField(term803, term803.getClass(), "out", null);
        setFloatField(term803, term803.getClass(), "weight", 0.7467328F);
        setBooleanField(term803, term803.getClass(), "expressed", true);
        setIntField(term803, term803.getClass(), "innovation", -2027534003);
        Object term807 = newInstance(Class.forName("nn.model.Connection"));
        setField(term807, term807.getClass(), "in", null);
        setField(term807, term807.getClass(), "out", null);
        setFloatField(term807, term807.getClass(), "weight", 0.0F);
        setBooleanField(term807, term807.getClass(), "expressed", false);
        setIntField(term807, term807.getClass(), "innovation", 0);
        Object term811 = newInstance(Class.forName("nn.model.Connection"));
        setField(term811, term811.getClass(), "in", null);
        setField(term811, term811.getClass(), "out", null);
        setFloatField(term811, term811.getClass(), "weight", 0.0F);
        setBooleanField(term811, term811.getClass(), "expressed", false);
        setIntField(term811, term811.getClass(), "innovation", 0);
        Object term815 = newInstance(Class.forName("nn.model.Connection"));
        setField(term815, term815.getClass(), "in", null);
        setField(term815, term815.getClass(), "out", null);
        setFloatField(term815, term815.getClass(), "weight", 0.0F);
        setBooleanField(term815, term815.getClass(), "expressed", false);
        setIntField(term815, term815.getClass(), "innovation", 0);
        ArrayList term801 = new ArrayList();
        ((ArrayList) term801).add(term803);
        ((ArrayList) term801).add(term803);
        ((ArrayList) term801).add(term807);
        ((ArrayList) term801).add(term807);
        ((ArrayList) term801).add(term811);
        ((ArrayList) term801).add(term815);
        Object term826 = newInstance(Class.forName("nn.model.Connection"));
        setField(term826, term826.getClass(), "in", null);
        setField(term826, term826.getClass(), "out", null);
        setFloatField(term826, term826.getClass(), "weight", 0.27797186F);
        setBooleanField(term826, term826.getClass(), "expressed", false);
        setIntField(term826, term826.getClass(), "innovation", 335112684);
        Object term830 = newInstance(Class.forName("nn.model.Connection"));
        setField(term830, term830.getClass(), "in", null);
        setField(term830, term830.getClass(), "out", null);
        setFloatField(term830, term830.getClass(), "weight", 0.0F);
        setBooleanField(term830, term830.getClass(), "expressed", false);
        setIntField(term830, term830.getClass(), "innovation", 0);
        ArrayList term824 = new ArrayList();
        ((ArrayList) term824).add(term826);
        ((ArrayList) term824).add(term807);
        ((ArrayList) term824).add(term830);
        ((ArrayList) term824).add(term803);
        term788 = newInstance(Class.forName("nn.model.Connection"));
        Object term789 = newInstance(Class.forName("nn.model.Node"));
        Object term822 = newInstance(Class.forName("nn.model.Node"));
        setField(term789, term789.getClass(), "type", enum6);
        setIntField(term789, term789.getClass(), "innovation", 1225272962);
        setField(term789, term789.getClass(), "connections", term801);
        setDoubleField(term789, term789.getClass(), "bias", 0.3202192021706908);
        setField(term788, term788.getClass(), "in", term789);
        setField(term822, term822.getClass(), "type", enum6);
        setIntField(term822, term822.getClass(), "innovation", 1063420942);
        setField(term822, term822.getClass(), "connections", term824);
        setDoubleField(term822, term822.getClass(), "bias", 0.22651340641904605);
        setField(term788, term788.getClass(), "out", term822);
        setFloatField(term788, term788.getClass(), "weight", 0.6436713F);
        setBooleanField(term788, term788.getClass(), "expressed", true);
        setIntField(term788, term788.getClass(), "innovation", 1375330971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeight", argTypes, term788, args);
    }

};


