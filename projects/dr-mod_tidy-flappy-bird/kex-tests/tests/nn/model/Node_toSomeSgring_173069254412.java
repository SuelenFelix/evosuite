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
     Object term12816;

    public Node_toSomeSgring_173069254412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12854 = Class.forName((String) "nn.model.Type");
        Field term12853 = ((Class) term12854).getDeclaredField((String) "OUTPUT");
        ((Field) term12853).setAccessible(true);
        Object enum84 = ((Field) term12853).get((Object) null);
        Object term12830 = newInstance(Class.forName("nn.model.Connection"));
        Object term12831 = newInstance(Class.forName("nn.model.Node"));
        Object term12834 = newInstance(Class.forName("nn.model.Node"));
        setField(term12831, term12831.getClass(), "type", null);
        setIntField(term12831, term12831.getClass(), "innovation", 2146718886);
        setField(term12831, term12831.getClass(), "connections", null);
        setDoubleField(term12831, term12831.getClass(), "bias", 0.8233926052583531);
        setField(term12830, term12830.getClass(), "in", term12831);
        setField(term12834, term12834.getClass(), "type", null);
        setIntField(term12834, term12834.getClass(), "innovation", -985577036);
        setField(term12834, term12834.getClass(), "connections", null);
        setDoubleField(term12834, term12834.getClass(), "bias", 0.20785767731652216);
        setField(term12830, term12830.getClass(), "out", term12834);
        setFloatField(term12830, term12830.getClass(), "weight", 0.47593772F);
        setBooleanField(term12830, term12830.getClass(), "expressed", true);
        setIntField(term12830, term12830.getClass(), "innovation", 27780241);
        Object term12840 = newInstance(Class.forName("nn.model.Connection"));
        Object term12841 = newInstance(Class.forName("nn.model.Node"));
        Object term12844 = newInstance(Class.forName("nn.model.Node"));
        setField(term12841, term12841.getClass(), "type", null);
        setIntField(term12841, term12841.getClass(), "innovation", 0);
        setField(term12841, term12841.getClass(), "connections", null);
        setDoubleField(term12841, term12841.getClass(), "bias", 0.0);
        setField(term12840, term12840.getClass(), "in", term12841);
        setField(term12844, term12844.getClass(), "type", null);
        setIntField(term12844, term12844.getClass(), "innovation", 0);
        setField(term12844, term12844.getClass(), "connections", null);
        setDoubleField(term12844, term12844.getClass(), "bias", 0.0);
        setField(term12840, term12840.getClass(), "out", term12844);
        setFloatField(term12840, term12840.getClass(), "weight", 0.10576159F);
        setBooleanField(term12840, term12840.getClass(), "expressed", true);
        setIntField(term12840, term12840.getClass(), "innovation", -477355193);
        ArrayList term12828 = new ArrayList();
        ((ArrayList) term12828).add(term12830);
        ((ArrayList) term12828).add(term12840);
        term12816 = newInstance(Class.forName("nn.model.Node"));
        setField(term12816, term12816.getClass(), "type", enum84);
        setIntField(term12816, term12816.getClass(), "innovation", 962385185);
        setField(term12816, term12816.getClass(), "connections", term12828);
        setDoubleField(term12816, term12816.getClass(), "bias", 0.01480700687689196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toSomeSgring", argTypes, term12816, args);
    }

};


