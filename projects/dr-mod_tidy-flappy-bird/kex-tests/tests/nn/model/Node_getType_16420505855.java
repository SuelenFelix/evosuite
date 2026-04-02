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
     Object term17606;

    public Node_getType_16420505855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17644 = Class.forName((String) "nn.model.Type");
        Field term17643 = ((Class) term17644).getDeclaredField((String) "HIDDEN");
        ((Field) term17643).setAccessible(true);
        Object enum109 = ((Field) term17643).get((Object) null);
        Object term17620 = newInstance(Class.forName("nn.model.Connection"));
        Object term17621 = newInstance(Class.forName("nn.model.Node"));
        Object term17624 = newInstance(Class.forName("nn.model.Node"));
        setField(term17621, term17621.getClass(), "type", enum109);
        setIntField(term17621, term17621.getClass(), "innovation", 406945977);
        setField(term17621, term17621.getClass(), "connections", null);
        setDoubleField(term17621, term17621.getClass(), "bias", 0.46505735758715006);
        setField(term17620, term17620.getClass(), "in", term17621);
        setField(term17624, term17624.getClass(), "type", enum109);
        setIntField(term17624, term17624.getClass(), "innovation", 1882655922);
        setField(term17624, term17624.getClass(), "connections", null);
        setDoubleField(term17624, term17624.getClass(), "bias", 0.18162585474118642);
        setField(term17620, term17620.getClass(), "out", term17624);
        setFloatField(term17620, term17620.getClass(), "weight", 0.4588288F);
        setBooleanField(term17620, term17620.getClass(), "expressed", true);
        setIntField(term17620, term17620.getClass(), "innovation", 610850630);
        Object term17630 = newInstance(Class.forName("nn.model.Connection"));
        Object term17631 = newInstance(Class.forName("nn.model.Node"));
        Object term17634 = newInstance(Class.forName("nn.model.Node"));
        setField(term17631, term17631.getClass(), "type", null);
        setIntField(term17631, term17631.getClass(), "innovation", 0);
        setField(term17631, term17631.getClass(), "connections", null);
        setDoubleField(term17631, term17631.getClass(), "bias", 0.0);
        setField(term17630, term17630.getClass(), "in", term17631);
        setField(term17634, term17634.getClass(), "type", null);
        setIntField(term17634, term17634.getClass(), "innovation", 0);
        setField(term17634, term17634.getClass(), "connections", null);
        setDoubleField(term17634, term17634.getClass(), "bias", 0.0);
        setField(term17630, term17630.getClass(), "out", term17634);
        setFloatField(term17630, term17630.getClass(), "weight", 0.0042077303F);
        setBooleanField(term17630, term17630.getClass(), "expressed", false);
        setIntField(term17630, term17630.getClass(), "innovation", 1367703658);
        ArrayList term17618 = new ArrayList();
        ((ArrayList) term17618).add(term17620);
        ((ArrayList) term17618).add(term17630);
        ((ArrayList) term17618).add(term17630);
        term17606 = newInstance(Class.forName("nn.model.Node"));
        setField(term17606, term17606.getClass(), "type", enum109);
        setIntField(term17606, term17606.getClass(), "innovation", -1726073541);
        setField(term17606, term17606.getClass(), "connections", term17618);
        setDoubleField(term17606, term17606.getClass(), "bias", 0.8021566501622185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term17606, args);
    }

};


