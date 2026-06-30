package nn.neural;

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
import static nn.neural.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class NodeProxier_convert2_18637925472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;
     Object term190;

    public NodeProxier_convert2_18637925472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term185 = new HashMap();
        term184 = newInstance(Class.forName("nn.neural.NodeProxier"));
        setField(term184, term184.getClass(), "matchNodes", term185);
        Class<? extends Object> term225 = Class.forName((String) "nn.model.Type");
        Field term224 = ((Class) term225).getDeclaredField((String) "HIDDEN");
        ((Field) term224).setAccessible(true);
        Object enum1 = ((Field) term224).get((Object) null);
        Object term204 = newInstance(Class.forName("nn.model.Connection"));
        Object term205 = newInstance(Class.forName("nn.model.Node"));
        Object term208 = newInstance(Class.forName("nn.model.Node"));
        setField(term205, term205.getClass(), "type", null);
        setIntField(term205, term205.getClass(), "innovation", -1456670397);
        setField(term205, term205.getClass(), "connections", null);
        setDoubleField(term205, term205.getClass(), "bias", 0.37773193782763337);
        setField(term204, term204.getClass(), "in", term205);
        setField(term208, term208.getClass(), "type", null);
        setIntField(term208, term208.getClass(), "innovation", -655067527);
        setField(term208, term208.getClass(), "connections", null);
        setDoubleField(term208, term208.getClass(), "bias", 0.2641345529914265);
        setField(term204, term204.getClass(), "out", term208);
        setFloatField(term204, term204.getClass(), "weight", 0.24413109F);
        setBooleanField(term204, term204.getClass(), "expressed", false);
        setIntField(term204, term204.getClass(), "innovation", -203030934);
        Object term214 = newInstance(Class.forName("nn.model.Connection"));
        Object term215 = newInstance(Class.forName("nn.model.Node"));
        setField(term215, term215.getClass(), "type", null);
        setIntField(term215, term215.getClass(), "innovation", 1622346318);
        setField(term215, term215.getClass(), "connections", null);
        setDoubleField(term215, term215.getClass(), "bias", 0.6076495596892013);
        setField(term214, term214.getClass(), "in", term215);
        setField(term214, term214.getClass(), "out", term208);
        setFloatField(term214, term214.getClass(), "weight", 0.37773192F);
        setBooleanField(term214, term214.getClass(), "expressed", false);
        setIntField(term214, term214.getClass(), "innovation", -244121226);
        ArrayList term202 = new ArrayList();
        ((ArrayList) term202).add(term204);
        ((ArrayList) term202).add(term214);
        term190 = newInstance(Class.forName("nn.model.Node"));
        setField(term190, term190.getClass(), "type", enum1);
        setIntField(term190, term190.getClass(), "innovation", -1685132342);
        setField(term190, term190.getClass(), "connections", term202);
        setDoubleField(term190, term190.getClass(), "bias", 0.8474802076607362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.NodeProxier");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Node");
        Object[] args = new Object[1];
        args[0] = term190;
        callMethod(klass, "convert2", argTypes, term184, args);
    }

};


