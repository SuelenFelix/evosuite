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
     Object term18505;

    public Node_getBias_181063647212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18550 = Class.forName((String) "nn.model.Type");
        Field term18549 = ((Class) term18550).getDeclaredField((String) "OUTPUT");
        ((Field) term18549).setAccessible(true);
        Object enum116 = ((Field) term18549).get((Object) null);
        Object term18519 = newInstance(Class.forName("nn.model.Connection"));
        Object term18520 = newInstance(Class.forName("nn.model.Node"));
        Object term18523 = newInstance(Class.forName("nn.model.Node"));
        setField(term18520, term18520.getClass(), "type", null);
        setIntField(term18520, term18520.getClass(), "innovation", 1113574554);
        setField(term18520, term18520.getClass(), "connections", null);
        setDoubleField(term18520, term18520.getClass(), "bias", 0.5086784040916195);
        setField(term18519, term18519.getClass(), "in", term18520);
        setField(term18523, term18523.getClass(), "type", null);
        setIntField(term18523, term18523.getClass(), "innovation", 1685800093);
        setField(term18523, term18523.getClass(), "connections", null);
        setDoubleField(term18523, term18523.getClass(), "bias", 0.8058692746281759);
        setField(term18519, term18519.getClass(), "out", term18523);
        setFloatField(term18519, term18519.getClass(), "weight", 0.95319855F);
        setBooleanField(term18519, term18519.getClass(), "expressed", true);
        setIntField(term18519, term18519.getClass(), "innovation", -377697034);
        Object term18529 = newInstance(Class.forName("nn.model.Connection"));
        Object term18530 = newInstance(Class.forName("nn.model.Node"));
        Object term18533 = newInstance(Class.forName("nn.model.Node"));
        setField(term18530, term18530.getClass(), "type", null);
        setIntField(term18530, term18530.getClass(), "innovation", 0);
        setField(term18530, term18530.getClass(), "connections", null);
        setDoubleField(term18530, term18530.getClass(), "bias", 0.0);
        setField(term18529, term18529.getClass(), "in", term18530);
        setField(term18533, term18533.getClass(), "type", null);
        setIntField(term18533, term18533.getClass(), "innovation", 0);
        setField(term18533, term18533.getClass(), "connections", null);
        setDoubleField(term18533, term18533.getClass(), "bias", 0.0);
        setField(term18529, term18529.getClass(), "out", term18533);
        setFloatField(term18529, term18529.getClass(), "weight", 0.99221486F);
        setBooleanField(term18529, term18529.getClass(), "expressed", true);
        setIntField(term18529, term18529.getClass(), "innovation", -1099061955);
        Object term18539 = newInstance(Class.forName("nn.model.Connection"));
        Object term18540 = newInstance(Class.forName("nn.model.Node"));
        setField(term18539, term18539.getClass(), "in", term18533);
        setField(term18540, term18540.getClass(), "type", null);
        setIntField(term18540, term18540.getClass(), "innovation", 0);
        setField(term18540, term18540.getClass(), "connections", null);
        setDoubleField(term18540, term18540.getClass(), "bias", 0.0);
        setField(term18539, term18539.getClass(), "out", term18540);
        setFloatField(term18539, term18539.getClass(), "weight", 0.61780673F);
        setBooleanField(term18539, term18539.getClass(), "expressed", true);
        setIntField(term18539, term18539.getClass(), "innovation", -1948910444);
        ArrayList term18517 = new ArrayList();
        ((ArrayList) term18517).add(term18519);
        ((ArrayList) term18517).add(term18529);
        ((ArrayList) term18517).add(term18539);
        term18505 = newInstance(Class.forName("nn.model.Node"));
        setField(term18505, term18505.getClass(), "type", enum116);
        setIntField(term18505, term18505.getClass(), "innovation", -1302341502);
        setField(term18505, term18505.getClass(), "connections", term18517);
        setDoubleField(term18505, term18505.getClass(), "bias", 0.5349035289029883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBias", argTypes, term18505, args);
    }

};


