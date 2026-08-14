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

public class Node_getType_16420505855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17612;

    public Node_getType_16420505855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17650 = Class.forName((String) "nn.model.Type");
        Field term17649 = ((Class) term17650).getDeclaredField((String) "HIDDEN");
        ((Field) term17649).setAccessible(true);
        Object enum109 = ((Field) term17649).get((Object) null);
        Object term17626 = newInstance(Class.forName("nn.model.Connection"));
        Object term17627 = newInstance(Class.forName("nn.model.Node"));
        Object term17630 = newInstance(Class.forName("nn.model.Node"));
        setField(term17627, term17627.getClass(), "type", enum109);
        setIntField(term17627, term17627.getClass(), "innovation", 406945977);
        setField(term17627, term17627.getClass(), "connections", null);
        setDoubleField(term17627, term17627.getClass(), "bias", 0.46505735758715006);
        setField(term17626, term17626.getClass(), "in", term17627);
        setField(term17630, term17630.getClass(), "type", enum109);
        setIntField(term17630, term17630.getClass(), "innovation", 1882655922);
        setField(term17630, term17630.getClass(), "connections", null);
        setDoubleField(term17630, term17630.getClass(), "bias", 0.18162585474118642);
        setField(term17626, term17626.getClass(), "out", term17630);
        setFloatField(term17626, term17626.getClass(), "weight", 0.4588288F);
        setBooleanField(term17626, term17626.getClass(), "expressed", true);
        setIntField(term17626, term17626.getClass(), "innovation", 610850630);
        Object term17636 = newInstance(Class.forName("nn.model.Connection"));
        Object term17637 = newInstance(Class.forName("nn.model.Node"));
        Object term17640 = newInstance(Class.forName("nn.model.Node"));
        setField(term17637, term17637.getClass(), "type", null);
        setIntField(term17637, term17637.getClass(), "innovation", 0);
        setField(term17637, term17637.getClass(), "connections", null);
        setDoubleField(term17637, term17637.getClass(), "bias", 0.0);
        setField(term17636, term17636.getClass(), "in", term17637);
        setField(term17640, term17640.getClass(), "type", null);
        setIntField(term17640, term17640.getClass(), "innovation", 0);
        setField(term17640, term17640.getClass(), "connections", null);
        setDoubleField(term17640, term17640.getClass(), "bias", 0.0);
        setField(term17636, term17636.getClass(), "out", term17640);
        setFloatField(term17636, term17636.getClass(), "weight", 0.0042077303F);
        setBooleanField(term17636, term17636.getClass(), "expressed", false);
        setIntField(term17636, term17636.getClass(), "innovation", 1367703658);
        ArrayList term17624 = new ArrayList();
        ((ArrayList) term17624).add(term17626);
        ((ArrayList) term17624).add(term17636);
        ((ArrayList) term17624).add(term17636);
        term17612 = newInstance(Class.forName("nn.model.Node"));
        setField(term17612, term17612.getClass(), "type", enum109);
        setIntField(term17612, term17612.getClass(), "innovation", -1726073541);
        setField(term17612, term17612.getClass(), "connections", term17624);
        setDoubleField(term17612, term17612.getClass(), "bias", 0.8021566501622185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term17612, args);
    }

};


