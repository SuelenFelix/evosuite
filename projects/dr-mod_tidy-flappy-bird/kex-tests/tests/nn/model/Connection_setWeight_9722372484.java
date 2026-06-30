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
import java.lang.Float;

public class Connection_setWeight_9722372484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930;
     Object term996;

    public Connection_setWeight_9722372484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term999 = Class.forName((String) "nn.model.Type");
        Field term998 = ((Class) term999).getDeclaredField((String) "HIDDEN");
        ((Field) term998).setAccessible(true);
        Object enum7 = ((Field) term998).get((Object) null);
        Object term945 = newInstance(Class.forName("nn.model.Connection"));
        setField(term945, term945.getClass(), "in", null);
        setField(term945, term945.getClass(), "out", null);
        setFloatField(term945, term945.getClass(), "weight", 0.45691717F);
        setBooleanField(term945, term945.getClass(), "expressed", false);
        setIntField(term945, term945.getClass(), "innovation", -1845499264);
        Object term949 = newInstance(Class.forName("nn.model.Connection"));
        setField(term949, term949.getClass(), "in", null);
        setField(term949, term949.getClass(), "out", null);
        setFloatField(term949, term949.getClass(), "weight", 0.89057696F);
        setBooleanField(term949, term949.getClass(), "expressed", true);
        setIntField(term949, term949.getClass(), "innovation", 1090617576);
        Object term953 = newInstance(Class.forName("nn.model.Connection"));
        setField(term953, term953.getClass(), "in", null);
        setField(term953, term953.getClass(), "out", null);
        setFloatField(term953, term953.getClass(), "weight", 0.0F);
        setBooleanField(term953, term953.getClass(), "expressed", false);
        setIntField(term953, term953.getClass(), "innovation", 0);
        Object term957 = newInstance(Class.forName("nn.model.Connection"));
        setField(term957, term957.getClass(), "in", null);
        setField(term957, term957.getClass(), "out", null);
        setFloatField(term957, term957.getClass(), "weight", 0.0F);
        setBooleanField(term957, term957.getClass(), "expressed", false);
        setIntField(term957, term957.getClass(), "innovation", 0);
        Object term961 = newInstance(Class.forName("nn.model.Connection"));
        setField(term961, term961.getClass(), "in", null);
        setField(term961, term961.getClass(), "out", null);
        setFloatField(term961, term961.getClass(), "weight", 0.0F);
        setBooleanField(term961, term961.getClass(), "expressed", false);
        setIntField(term961, term961.getClass(), "innovation", 0);
        Object term965 = newInstance(Class.forName("nn.model.Connection"));
        setField(term965, term965.getClass(), "in", null);
        setField(term965, term965.getClass(), "out", null);
        setFloatField(term965, term965.getClass(), "weight", 0.15826964F);
        setBooleanField(term965, term965.getClass(), "expressed", false);
        setIntField(term965, term965.getClass(), "innovation", -556405712);
        ArrayList term943 = new ArrayList();
        ((ArrayList) term943).add(term945);
        ((ArrayList) term943).add(term945);
        ((ArrayList) term943).add(term949);
        ((ArrayList) term943).add(term953);
        ((ArrayList) term943).add(term945);
        ((ArrayList) term943).add(term957);
        ((ArrayList) term943).add(term961);
        ((ArrayList) term943).add(term965);
        Class<? extends Object> term1089 = Class.forName((String) "nn.model.Type");
        Field term1088 = ((Class) term1089).getDeclaredField((String) "OUTPUT");
        ((Field) term1088).setAccessible(true);
        Object enum8 = ((Field) term1088).get((Object) null);
        Object term986 = newInstance(Class.forName("nn.model.Connection"));
        setField(term986, term986.getClass(), "in", null);
        setField(term986, term986.getClass(), "out", null);
        setFloatField(term986, term986.getClass(), "weight", 0.0F);
        setBooleanField(term986, term986.getClass(), "expressed", false);
        setIntField(term986, term986.getClass(), "innovation", 0);
        ArrayList term984 = new ArrayList();
        ((ArrayList) term984).add(term945);
        ((ArrayList) term984).add(term961);
        ((ArrayList) term984).add(term986);
        term930 = newInstance(Class.forName("nn.model.Connection"));
        Object term931 = newInstance(Class.forName("nn.model.Node"));
        Object term972 = newInstance(Class.forName("nn.model.Node"));
        setField(term931, term931.getClass(), "type", enum7);
        setIntField(term931, term931.getClass(), "innovation", -478195677);
        setField(term931, term931.getClass(), "connections", term943);
        setDoubleField(term931, term931.getClass(), "bias", 0.791695029600875);
        setField(term930, term930.getClass(), "in", term931);
        setField(term972, term972.getClass(), "type", enum8);
        setIntField(term972, term972.getClass(), "innovation", -505439934);
        setField(term972, term972.getClass(), "connections", term984);
        setDoubleField(term972, term972.getClass(), "bias", 0.6862221294683138);
        setField(term930, term930.getClass(), "out", term972);
        setFloatField(term930, term930.getClass(), "weight", 0.17877543F);
        setBooleanField(term930, term930.getClass(), "expressed", false);
        setIntField(term930, term930.getClass(), "innovation", -344842608);
        term996 = new Float(0.8598297F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term996;
        callMethod(klass, "setWeight", argTypes, term930, args);
    }

};


