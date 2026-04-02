package nn.neural;

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
import static nn.neural.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.util.ArrayList;
import java.lang.String;

public class AnnConnection_getWeight_17219895046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16476;

    public AnnConnection_getWeight_17219895046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term16479 = new Double(0.9022041121474429);
        Object term16483 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16483, term16483.getClass(), "weight", 0.38484791313292943);
        setField(term16483, term16483.getClass(), "in", null);
        setField(term16483, term16483.getClass(), "out", null);
        ArrayList term16481 = new ArrayList();
        ((ArrayList) term16481).add(term16483);
        Object term16489 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16489, term16489.getClass(), "weight", 0.0);
        setField(term16489, term16489.getClass(), "in", null);
        setField(term16489, term16489.getClass(), "out", null);
        Object term16491 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16491, term16491.getClass(), "weight", 0.9439864461820359);
        setField(term16491, term16491.getClass(), "in", null);
        setField(term16491, term16491.getClass(), "out", null);
        Object term16493 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16493, term16493.getClass(), "weight", 0.0);
        setField(term16493, term16493.getClass(), "in", null);
        setField(term16493, term16493.getClass(), "out", null);
        Object term16495 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16495, term16495.getClass(), "weight", 0.22215991475278152);
        setField(term16495, term16495.getClass(), "in", null);
        setField(term16495, term16495.getClass(), "out", null);
        Object term16497 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16497, term16497.getClass(), "weight", 0.07750483171119882);
        setField(term16497, term16497.getClass(), "in", null);
        setField(term16497, term16497.getClass(), "out", null);
        Object term16499 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16499, term16499.getClass(), "weight", 0.0);
        setField(term16499, term16499.getClass(), "in", null);
        setField(term16499, term16499.getClass(), "out", null);
        ArrayList term16487 = new ArrayList();
        ((ArrayList) term16487).add(term16489);
        ((ArrayList) term16487).add(term16491);
        ((ArrayList) term16487).add(term16489);
        ((ArrayList) term16487).add(term16493);
        ((ArrayList) term16487).add(term16495);
        ((ArrayList) term16487).add(term16497);
        ((ArrayList) term16487).add(term16499);
        Class<? extends Object> term16542 = Class.forName((String) "nn.neural.AnnType");
        Field term16541 = ((Class) term16542).getDeclaredField((String) "OUTPUT");
        ((Field) term16541).setAccessible(true);
        Object enum100 = ((Field) term16541).get((Object) null);
        Double term16516 = new Double(0.40635376375558196);
        ArrayList term16518 = new ArrayList();
        ((ArrayList) term16518).add(term16483);
        ((ArrayList) term16518).add(term16491);
        ((ArrayList) term16518).add(term16499);
        ((ArrayList) term16518).add(term16495);
        ((ArrayList) term16518).add(term16491);
        ((ArrayList) term16518).add(term16489);
        Object term16524 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16524, term16524.getClass(), "weight", 0.0);
        setField(term16524, term16524.getClass(), "in", null);
        setField(term16524, term16524.getClass(), "out", null);
        Object term16526 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16526, term16526.getClass(), "weight", 0.0);
        setField(term16526, term16526.getClass(), "in", null);
        setField(term16526, term16526.getClass(), "out", null);
        ArrayList term16522 = new ArrayList();
        ((ArrayList) term16522).add(term16524);
        ((ArrayList) term16522).add(term16489);
        ((ArrayList) term16522).add(term16526);
        Class<? extends Object> term16652 = Class.forName((String) "nn.neural.AnnType");
        Field term16651 = ((Class) term16652).getDeclaredField((String) "INPUT");
        ((Field) term16651).setAccessible(true);
        Object enum101 = ((Field) term16651).get((Object) null);
        term16476 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16478 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16515 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16476, term16476.getClass(), "weight", 0.3797374233070945);
        setField(term16478, term16478.getClass(), "output", term16479);
        setField(term16478, term16478.getClass(), "inputs", term16481);
        setField(term16478, term16478.getClass(), "outputs", term16487);
        setField(term16478, term16478.getClass(), "type", enum100);
        setIntField(term16478, term16478.getClass(), "id", 185647247);
        setDoubleField(term16478, term16478.getClass(), "bias", 0.11415011225631944);
        setField(term16476, term16476.getClass(), "in", term16478);
        setField(term16515, term16515.getClass(), "output", term16516);
        setField(term16515, term16515.getClass(), "inputs", term16518);
        setField(term16515, term16515.getClass(), "outputs", term16522);
        setField(term16515, term16515.getClass(), "type", enum101);
        setIntField(term16515, term16515.getClass(), "id", 720814309);
        setDoubleField(term16515, term16515.getClass(), "bias", 0.9680611801309333);
        setField(term16476, term16476.getClass(), "out", term16515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeight", argTypes, term16476, args);
    }

};


