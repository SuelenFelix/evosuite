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
     Object term12801;

    public Node_toSomeSgring_173069254412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12839 = Class.forName((String) "nn.model.Type");
        Field term12838 = ((Class) term12839).getDeclaredField((String) "OUTPUT");
        ((Field) term12838).setAccessible(true);
        Object enum84 = ((Field) term12838).get((Object) null);
        Object term12815 = newInstance(Class.forName("nn.model.Connection"));
        Object term12816 = newInstance(Class.forName("nn.model.Node"));
        Object term12819 = newInstance(Class.forName("nn.model.Node"));
        setField(term12816, term12816.getClass(), "type", null);
        setIntField(term12816, term12816.getClass(), "innovation", 2146718886);
        setField(term12816, term12816.getClass(), "connections", null);
        setDoubleField(term12816, term12816.getClass(), "bias", 0.8233926052583531);
        setField(term12815, term12815.getClass(), "in", term12816);
        setField(term12819, term12819.getClass(), "type", null);
        setIntField(term12819, term12819.getClass(), "innovation", -985577036);
        setField(term12819, term12819.getClass(), "connections", null);
        setDoubleField(term12819, term12819.getClass(), "bias", 0.20785767731652216);
        setField(term12815, term12815.getClass(), "out", term12819);
        setFloatField(term12815, term12815.getClass(), "weight", 0.47593772F);
        setBooleanField(term12815, term12815.getClass(), "expressed", true);
        setIntField(term12815, term12815.getClass(), "innovation", 27780241);
        Object term12825 = newInstance(Class.forName("nn.model.Connection"));
        Object term12826 = newInstance(Class.forName("nn.model.Node"));
        Object term12829 = newInstance(Class.forName("nn.model.Node"));
        setField(term12826, term12826.getClass(), "type", null);
        setIntField(term12826, term12826.getClass(), "innovation", 0);
        setField(term12826, term12826.getClass(), "connections", null);
        setDoubleField(term12826, term12826.getClass(), "bias", 0.0);
        setField(term12825, term12825.getClass(), "in", term12826);
        setField(term12829, term12829.getClass(), "type", null);
        setIntField(term12829, term12829.getClass(), "innovation", 0);
        setField(term12829, term12829.getClass(), "connections", null);
        setDoubleField(term12829, term12829.getClass(), "bias", 0.0);
        setField(term12825, term12825.getClass(), "out", term12829);
        setFloatField(term12825, term12825.getClass(), "weight", 0.10576159F);
        setBooleanField(term12825, term12825.getClass(), "expressed", true);
        setIntField(term12825, term12825.getClass(), "innovation", -477355193);
        ArrayList term12813 = new ArrayList();
        ((ArrayList) term12813).add(term12815);
        ((ArrayList) term12813).add(term12825);
        term12801 = newInstance(Class.forName("nn.model.Node"));
        setField(term12801, term12801.getClass(), "type", enum84);
        setIntField(term12801, term12801.getClass(), "innovation", 962385185);
        setField(term12801, term12801.getClass(), "connections", term12813);
        setDoubleField(term12801, term12801.getClass(), "bias", 0.01480700687689196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toSomeSgring", argTypes, term12801, args);
    }

};


