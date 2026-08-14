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
     Object term18511;

    public Node_getBias_181063647212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18556 = Class.forName((String) "nn.model.Type");
        Field term18555 = ((Class) term18556).getDeclaredField((String) "OUTPUT");
        ((Field) term18555).setAccessible(true);
        Object enum116 = ((Field) term18555).get((Object) null);
        Object term18525 = newInstance(Class.forName("nn.model.Connection"));
        Object term18526 = newInstance(Class.forName("nn.model.Node"));
        Object term18529 = newInstance(Class.forName("nn.model.Node"));
        setField(term18526, term18526.getClass(), "type", null);
        setIntField(term18526, term18526.getClass(), "innovation", 1113574554);
        setField(term18526, term18526.getClass(), "connections", null);
        setDoubleField(term18526, term18526.getClass(), "bias", 0.5086784040916195);
        setField(term18525, term18525.getClass(), "in", term18526);
        setField(term18529, term18529.getClass(), "type", null);
        setIntField(term18529, term18529.getClass(), "innovation", 1685800093);
        setField(term18529, term18529.getClass(), "connections", null);
        setDoubleField(term18529, term18529.getClass(), "bias", 0.8058692746281759);
        setField(term18525, term18525.getClass(), "out", term18529);
        setFloatField(term18525, term18525.getClass(), "weight", 0.95319855F);
        setBooleanField(term18525, term18525.getClass(), "expressed", true);
        setIntField(term18525, term18525.getClass(), "innovation", -377697034);
        Object term18535 = newInstance(Class.forName("nn.model.Connection"));
        Object term18536 = newInstance(Class.forName("nn.model.Node"));
        Object term18539 = newInstance(Class.forName("nn.model.Node"));
        setField(term18536, term18536.getClass(), "type", null);
        setIntField(term18536, term18536.getClass(), "innovation", 0);
        setField(term18536, term18536.getClass(), "connections", null);
        setDoubleField(term18536, term18536.getClass(), "bias", 0.0);
        setField(term18535, term18535.getClass(), "in", term18536);
        setField(term18539, term18539.getClass(), "type", null);
        setIntField(term18539, term18539.getClass(), "innovation", 0);
        setField(term18539, term18539.getClass(), "connections", null);
        setDoubleField(term18539, term18539.getClass(), "bias", 0.0);
        setField(term18535, term18535.getClass(), "out", term18539);
        setFloatField(term18535, term18535.getClass(), "weight", 0.99221486F);
        setBooleanField(term18535, term18535.getClass(), "expressed", true);
        setIntField(term18535, term18535.getClass(), "innovation", -1099061955);
        Object term18545 = newInstance(Class.forName("nn.model.Connection"));
        Object term18546 = newInstance(Class.forName("nn.model.Node"));
        setField(term18545, term18545.getClass(), "in", term18539);
        setField(term18546, term18546.getClass(), "type", null);
        setIntField(term18546, term18546.getClass(), "innovation", 0);
        setField(term18546, term18546.getClass(), "connections", null);
        setDoubleField(term18546, term18546.getClass(), "bias", 0.0);
        setField(term18545, term18545.getClass(), "out", term18546);
        setFloatField(term18545, term18545.getClass(), "weight", 0.61780673F);
        setBooleanField(term18545, term18545.getClass(), "expressed", true);
        setIntField(term18545, term18545.getClass(), "innovation", -1948910444);
        ArrayList term18523 = new ArrayList();
        ((ArrayList) term18523).add(term18525);
        ((ArrayList) term18523).add(term18535);
        ((ArrayList) term18523).add(term18545);
        term18511 = newInstance(Class.forName("nn.model.Node"));
        setField(term18511, term18511.getClass(), "type", enum116);
        setIntField(term18511, term18511.getClass(), "innovation", -1302341502);
        setField(term18511, term18511.getClass(), "connections", term18523);
        setDoubleField(term18511, term18511.getClass(), "bias", 0.5349035289029883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBias", argTypes, term18511, args);
    }

};


