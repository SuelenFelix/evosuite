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

public class Node_getBias_181063647212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18495;

    public Node_getBias_181063647212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18540 = Class.forName((String) "nn.model.Type");
        Field term18539 = ((Class) term18540).getDeclaredField((String) "OUTPUT");
        ((Field) term18539).setAccessible(true);
        Object enum116 = ((Field) term18539).get((Object) null);
        Object term18509 = newInstance(Class.forName("nn.model.Connection"));
        Object term18510 = newInstance(Class.forName("nn.model.Node"));
        Object term18513 = newInstance(Class.forName("nn.model.Node"));
        setField(term18510, term18510.getClass(), "type", null);
        setIntField(term18510, term18510.getClass(), "innovation", 1113574554);
        setField(term18510, term18510.getClass(), "connections", null);
        setDoubleField(term18510, term18510.getClass(), "bias", 0.5086784040916195);
        setField(term18509, term18509.getClass(), "in", term18510);
        setField(term18513, term18513.getClass(), "type", null);
        setIntField(term18513, term18513.getClass(), "innovation", 1685800093);
        setField(term18513, term18513.getClass(), "connections", null);
        setDoubleField(term18513, term18513.getClass(), "bias", 0.8058692746281759);
        setField(term18509, term18509.getClass(), "out", term18513);
        setFloatField(term18509, term18509.getClass(), "weight", 0.95319855F);
        setBooleanField(term18509, term18509.getClass(), "expressed", true);
        setIntField(term18509, term18509.getClass(), "innovation", -377697034);
        Object term18519 = newInstance(Class.forName("nn.model.Connection"));
        Object term18520 = newInstance(Class.forName("nn.model.Node"));
        Object term18523 = newInstance(Class.forName("nn.model.Node"));
        setField(term18520, term18520.getClass(), "type", null);
        setIntField(term18520, term18520.getClass(), "innovation", 0);
        setField(term18520, term18520.getClass(), "connections", null);
        setDoubleField(term18520, term18520.getClass(), "bias", 0.0);
        setField(term18519, term18519.getClass(), "in", term18520);
        setField(term18523, term18523.getClass(), "type", null);
        setIntField(term18523, term18523.getClass(), "innovation", 0);
        setField(term18523, term18523.getClass(), "connections", null);
        setDoubleField(term18523, term18523.getClass(), "bias", 0.0);
        setField(term18519, term18519.getClass(), "out", term18523);
        setFloatField(term18519, term18519.getClass(), "weight", 0.99221486F);
        setBooleanField(term18519, term18519.getClass(), "expressed", true);
        setIntField(term18519, term18519.getClass(), "innovation", -1099061955);
        Object term18529 = newInstance(Class.forName("nn.model.Connection"));
        Object term18530 = newInstance(Class.forName("nn.model.Node"));
        setField(term18529, term18529.getClass(), "in", term18523);
        setField(term18530, term18530.getClass(), "type", null);
        setIntField(term18530, term18530.getClass(), "innovation", 0);
        setField(term18530, term18530.getClass(), "connections", null);
        setDoubleField(term18530, term18530.getClass(), "bias", 0.0);
        setField(term18529, term18529.getClass(), "out", term18530);
        setFloatField(term18529, term18529.getClass(), "weight", 0.61780673F);
        setBooleanField(term18529, term18529.getClass(), "expressed", true);
        setIntField(term18529, term18529.getClass(), "innovation", -1948910444);
        ArrayList term18507 = new ArrayList();
        ((ArrayList) term18507).add(term18509);
        ((ArrayList) term18507).add(term18519);
        ((ArrayList) term18507).add(term18529);
        term18495 = newInstance(Class.forName("nn.model.Node"));
        setField(term18495, term18495.getClass(), "type", enum116);
        setIntField(term18495, term18495.getClass(), "innovation", -1302341502);
        setField(term18495, term18495.getClass(), "connections", term18507);
        setDoubleField(term18495, term18495.getClass(), "bias", 0.5349035289029883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBias", argTypes, term18495, args);
    }

};


