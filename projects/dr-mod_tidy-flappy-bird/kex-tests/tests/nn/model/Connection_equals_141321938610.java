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

public class Connection_equals_141321938610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2382;
     Object term2444;

    public Connection_equals_141321938610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2446 = Class.forName((String) "nn.model.Type");
        Field term2445 = ((Class) term2446).getDeclaredField((String) "OUTPUT");
        ((Field) term2445).setAccessible(true);
        Object enum19 = ((Field) term2445).get((Object) null);
        Object term2397 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2397, term2397.getClass(), "in", null);
        setField(term2397, term2397.getClass(), "out", null);
        setFloatField(term2397, term2397.getClass(), "weight", 0.35872674F);
        setBooleanField(term2397, term2397.getClass(), "expressed", false);
        setIntField(term2397, term2397.getClass(), "innovation", 1358829571);
        Object term2401 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2401, term2401.getClass(), "in", null);
        setField(term2401, term2401.getClass(), "out", null);
        setFloatField(term2401, term2401.getClass(), "weight", 0.0F);
        setBooleanField(term2401, term2401.getClass(), "expressed", false);
        setIntField(term2401, term2401.getClass(), "innovation", 0);
        Object term2405 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2405, term2405.getClass(), "in", null);
        setField(term2405, term2405.getClass(), "out", null);
        setFloatField(term2405, term2405.getClass(), "weight", 0.21723765F);
        setBooleanField(term2405, term2405.getClass(), "expressed", false);
        setIntField(term2405, term2405.getClass(), "innovation", 197109649);
        Object term2409 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2409, term2409.getClass(), "in", null);
        setField(term2409, term2409.getClass(), "out", null);
        setFloatField(term2409, term2409.getClass(), "weight", 0.0F);
        setBooleanField(term2409, term2409.getClass(), "expressed", false);
        setIntField(term2409, term2409.getClass(), "innovation", 0);
        Object term2413 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2413, term2413.getClass(), "in", null);
        setField(term2413, term2413.getClass(), "out", null);
        setFloatField(term2413, term2413.getClass(), "weight", 0.0F);
        setBooleanField(term2413, term2413.getClass(), "expressed", false);
        setIntField(term2413, term2413.getClass(), "innovation", 0);
        Object term2417 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2417, term2417.getClass(), "in", null);
        setField(term2417, term2417.getClass(), "out", null);
        setFloatField(term2417, term2417.getClass(), "weight", 0.22417867F);
        setBooleanField(term2417, term2417.getClass(), "expressed", false);
        setIntField(term2417, term2417.getClass(), "innovation", -1504890659);
        ArrayList term2395 = new ArrayList();
        ((ArrayList) term2395).add(term2397);
        ((ArrayList) term2395).add(term2401);
        ((ArrayList) term2395).add(term2401);
        ((ArrayList) term2395).add(term2405);
        ((ArrayList) term2395).add(term2409);
        ((ArrayList) term2395).add(term2401);
        ((ArrayList) term2395).add(term2413);
        ((ArrayList) term2395).add(term2417);
        Class<? extends Object> term2536 = Class.forName((String) "nn.model.Type");
        Field term2535 = ((Class) term2536).getDeclaredField((String) "HIDDEN");
        ((Field) term2535).setAccessible(true);
        Object enum20 = ((Field) term2535).get((Object) null);
        ArrayList term2436 = new ArrayList();
        ((ArrayList) term2436).add(term2405);
        ((ArrayList) term2436).add(term2401);
        term2382 = newInstance(Class.forName("nn.model.Connection"));
        Object term2383 = newInstance(Class.forName("nn.model.Node"));
        Object term2424 = newInstance(Class.forName("nn.model.Node"));
        setField(term2383, term2383.getClass(), "type", enum19);
        setIntField(term2383, term2383.getClass(), "innovation", 628918458);
        setField(term2383, term2383.getClass(), "connections", term2395);
        setDoubleField(term2383, term2383.getClass(), "bias", 0.06587158449170749);
        setField(term2382, term2382.getClass(), "in", term2383);
        setField(term2424, term2424.getClass(), "type", enum20);
        setIntField(term2424, term2424.getClass(), "innovation", 991356662);
        setField(term2424, term2424.getClass(), "connections", term2436);
        setDoubleField(term2424, term2424.getClass(), "bias", 0.0865998004187658);
        setField(term2382, term2382.getClass(), "out", term2424);
        setFloatField(term2382, term2382.getClass(), "weight", 0.2946385F);
        setBooleanField(term2382, term2382.getClass(), "expressed", false);
        setIntField(term2382, term2382.getClass(), "innovation", -506958186);
        term2444 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2444;
        callMethod(klass, "equals", argTypes, term2382, args);
    }

};


