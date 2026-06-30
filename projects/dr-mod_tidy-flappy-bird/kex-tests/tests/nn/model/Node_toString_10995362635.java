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

public class Node_toString_10995362635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12120;

    public Node_toString_10995362635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12148 = Class.forName((String) "nn.model.Type");
        Field term12147 = ((Class) term12148).getDeclaredField((String) "SENSOR");
        ((Field) term12147).setAccessible(true);
        Object enum79 = ((Field) term12147).get((Object) null);
        Object term12134 = newInstance(Class.forName("nn.model.Connection"));
        Object term12135 = newInstance(Class.forName("nn.model.Node"));
        Object term12138 = newInstance(Class.forName("nn.model.Node"));
        setField(term12135, term12135.getClass(), "type", null);
        setIntField(term12135, term12135.getClass(), "innovation", 1121247998);
        setField(term12135, term12135.getClass(), "connections", null);
        setDoubleField(term12135, term12135.getClass(), "bias", 0.359822327374657);
        setField(term12134, term12134.getClass(), "in", term12135);
        setField(term12138, term12138.getClass(), "type", null);
        setIntField(term12138, term12138.getClass(), "innovation", 0);
        setField(term12138, term12138.getClass(), "connections", null);
        setDoubleField(term12138, term12138.getClass(), "bias", 0.0);
        setField(term12134, term12134.getClass(), "out", term12138);
        setFloatField(term12134, term12134.getClass(), "weight", 0.18361723F);
        setBooleanField(term12134, term12134.getClass(), "expressed", true);
        setIntField(term12134, term12134.getClass(), "innovation", -1480903995);
        ArrayList term12132 = new ArrayList();
        ((ArrayList) term12132).add(term12134);
        term12120 = newInstance(Class.forName("nn.model.Node"));
        setField(term12120, term12120.getClass(), "type", enum79);
        setIntField(term12120, term12120.getClass(), "innovation", 609697271);
        setField(term12120, term12120.getClass(), "connections", term12132);
        setDoubleField(term12120, term12120.getClass(), "bias", 0.6984496238941496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term12120, args);
    }

};


