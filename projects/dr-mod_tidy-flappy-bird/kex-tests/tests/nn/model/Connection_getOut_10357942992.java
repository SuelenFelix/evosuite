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

public class Connection_getOut_10357942992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550;

    public Connection_getOut_10357942992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term609 = Class.forName((String) "nn.model.Type");
        Field term608 = ((Class) term609).getDeclaredField((String) "SENSOR");
        ((Field) term608).setAccessible(true);
        Object enum4 = ((Field) term608).get((Object) null);
        Object term565 = newInstance(Class.forName("nn.model.Connection"));
        setField(term565, term565.getClass(), "in", null);
        setField(term565, term565.getClass(), "out", null);
        setFloatField(term565, term565.getClass(), "weight", 0.95272815F);
        setBooleanField(term565, term565.getClass(), "expressed", true);
        setIntField(term565, term565.getClass(), "innovation", 97029295);
        ArrayList term563 = new ArrayList();
        ((ArrayList) term563).add(term565);
        Class<? extends Object> term699 = Class.forName((String) "nn.model.Type");
        Field term698 = ((Class) term699).getDeclaredField((String) "HIDDEN");
        ((Field) term698).setAccessible(true);
        Object enum5 = ((Field) term698).get((Object) null);
        Object term586 = newInstance(Class.forName("nn.model.Connection"));
        setField(term586, term586.getClass(), "in", null);
        setField(term586, term586.getClass(), "out", null);
        setFloatField(term586, term586.getClass(), "weight", 0.0F);
        setBooleanField(term586, term586.getClass(), "expressed", false);
        setIntField(term586, term586.getClass(), "innovation", 0);
        Object term590 = newInstance(Class.forName("nn.model.Connection"));
        setField(term590, term590.getClass(), "in", null);
        setField(term590, term590.getClass(), "out", null);
        setFloatField(term590, term590.getClass(), "weight", 0.0F);
        setBooleanField(term590, term590.getClass(), "expressed", false);
        setIntField(term590, term590.getClass(), "innovation", 0);
        Object term594 = newInstance(Class.forName("nn.model.Connection"));
        setField(term594, term594.getClass(), "in", null);
        setField(term594, term594.getClass(), "out", null);
        setFloatField(term594, term594.getClass(), "weight", 0.20144695F);
        setBooleanField(term594, term594.getClass(), "expressed", false);
        setIntField(term594, term594.getClass(), "innovation", 292681826);
        Object term598 = newInstance(Class.forName("nn.model.Connection"));
        setField(term598, term598.getClass(), "in", null);
        setField(term598, term598.getClass(), "out", null);
        setFloatField(term598, term598.getClass(), "weight", 0.0F);
        setBooleanField(term598, term598.getClass(), "expressed", false);
        setIntField(term598, term598.getClass(), "innovation", 0);
        ArrayList term584 = new ArrayList();
        ((ArrayList) term584).add(term586);
        ((ArrayList) term584).add(term586);
        ((ArrayList) term584).add(term590);
        ((ArrayList) term584).add(term594);
        ((ArrayList) term584).add(term565);
        ((ArrayList) term584).add(term598);
        term550 = newInstance(Class.forName("nn.model.Connection"));
        Object term551 = newInstance(Class.forName("nn.model.Node"));
        Object term572 = newInstance(Class.forName("nn.model.Node"));
        setField(term551, term551.getClass(), "type", enum4);
        setIntField(term551, term551.getClass(), "innovation", -14890619);
        setField(term551, term551.getClass(), "connections", term563);
        setDoubleField(term551, term551.getClass(), "bias", 0.11493000848982304);
        setField(term550, term550.getClass(), "in", term551);
        setField(term572, term572.getClass(), "type", enum5);
        setIntField(term572, term572.getClass(), "innovation", -1371869594);
        setField(term572, term572.getClass(), "connections", term584);
        setDoubleField(term572, term572.getClass(), "bias", 0.37161417339133307);
        setField(term550, term550.getClass(), "out", term572);
        setFloatField(term550, term550.getClass(), "weight", 0.7254646F);
        setBooleanField(term550, term550.getClass(), "expressed", true);
        setIntField(term550, term550.getClass(), "innovation", -2095575670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOut", argTypes, term550, args);
    }

};


