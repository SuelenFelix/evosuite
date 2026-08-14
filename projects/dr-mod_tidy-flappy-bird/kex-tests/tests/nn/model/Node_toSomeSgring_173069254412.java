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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Node_toSomeSgring_173069254412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12813;

    public Node_toSomeSgring_173069254412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12851 = Class.forName((String) "nn.model.Type");
        Field term12850 = ((Class) term12851).getDeclaredField((String) "OUTPUT");
        ((Field) term12850).setAccessible(true);
        Object enum84 = ((Field) term12850).get((Object) null);
        Object term12827 = newInstance(Class.forName("nn.model.Connection"));
        Object term12828 = newInstance(Class.forName("nn.model.Node"));
        Object term12831 = newInstance(Class.forName("nn.model.Node"));
        setField(term12828, term12828.getClass(), "type", null);
        setIntField(term12828, term12828.getClass(), "innovation", 2146718886);
        setField(term12828, term12828.getClass(), "connections", null);
        setDoubleField(term12828, term12828.getClass(), "bias", 0.8233926052583531);
        setField(term12827, term12827.getClass(), "in", term12828);
        setField(term12831, term12831.getClass(), "type", null);
        setIntField(term12831, term12831.getClass(), "innovation", -985577036);
        setField(term12831, term12831.getClass(), "connections", null);
        setDoubleField(term12831, term12831.getClass(), "bias", 0.20785767731652216);
        setField(term12827, term12827.getClass(), "out", term12831);
        setFloatField(term12827, term12827.getClass(), "weight", 0.47593772F);
        setBooleanField(term12827, term12827.getClass(), "expressed", true);
        setIntField(term12827, term12827.getClass(), "innovation", 27780241);
        Object term12837 = newInstance(Class.forName("nn.model.Connection"));
        Object term12838 = newInstance(Class.forName("nn.model.Node"));
        Object term12841 = newInstance(Class.forName("nn.model.Node"));
        setField(term12838, term12838.getClass(), "type", null);
        setIntField(term12838, term12838.getClass(), "innovation", 0);
        setField(term12838, term12838.getClass(), "connections", null);
        setDoubleField(term12838, term12838.getClass(), "bias", 0.0);
        setField(term12837, term12837.getClass(), "in", term12838);
        setField(term12841, term12841.getClass(), "type", null);
        setIntField(term12841, term12841.getClass(), "innovation", 0);
        setField(term12841, term12841.getClass(), "connections", null);
        setDoubleField(term12841, term12841.getClass(), "bias", 0.0);
        setField(term12837, term12837.getClass(), "out", term12841);
        setFloatField(term12837, term12837.getClass(), "weight", 0.10576159F);
        setBooleanField(term12837, term12837.getClass(), "expressed", true);
        setIntField(term12837, term12837.getClass(), "innovation", -477355193);
        ArrayList term12825 = new ArrayList();
        ((ArrayList) term12825).add(term12827);
        ((ArrayList) term12825).add(term12837);
        term12813 = newInstance(Class.forName("nn.model.Node"));
        setField(term12813, term12813.getClass(), "type", enum84);
        setIntField(term12813, term12813.getClass(), "innovation", 962385185);
        setField(term12813, term12813.getClass(), "connections", term12825);
        setDoubleField(term12813, term12813.getClass(), "bias", 0.01480700687689196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toSomeSgring", argTypes, term12813, args);
    }

};


