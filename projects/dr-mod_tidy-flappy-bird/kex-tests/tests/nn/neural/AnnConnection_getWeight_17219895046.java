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
     Object term16482;

    public AnnConnection_getWeight_17219895046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term16485 = new Double(0.9022041121474429);
        Object term16489 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16489, term16489.getClass(), "weight", 0.38484791313292943);
        setField(term16489, term16489.getClass(), "in", null);
        setField(term16489, term16489.getClass(), "out", null);
        ArrayList term16487 = new ArrayList();
        ((ArrayList) term16487).add(term16489);
        Object term16495 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16495, term16495.getClass(), "weight", 0.0);
        setField(term16495, term16495.getClass(), "in", null);
        setField(term16495, term16495.getClass(), "out", null);
        Object term16497 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16497, term16497.getClass(), "weight", 0.9439864461820359);
        setField(term16497, term16497.getClass(), "in", null);
        setField(term16497, term16497.getClass(), "out", null);
        Object term16499 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16499, term16499.getClass(), "weight", 0.0);
        setField(term16499, term16499.getClass(), "in", null);
        setField(term16499, term16499.getClass(), "out", null);
        Object term16501 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16501, term16501.getClass(), "weight", 0.22215991475278152);
        setField(term16501, term16501.getClass(), "in", null);
        setField(term16501, term16501.getClass(), "out", null);
        Object term16503 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16503, term16503.getClass(), "weight", 0.07750483171119882);
        setField(term16503, term16503.getClass(), "in", null);
        setField(term16503, term16503.getClass(), "out", null);
        Object term16505 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16505, term16505.getClass(), "weight", 0.0);
        setField(term16505, term16505.getClass(), "in", null);
        setField(term16505, term16505.getClass(), "out", null);
        ArrayList term16493 = new ArrayList();
        ((ArrayList) term16493).add(term16495);
        ((ArrayList) term16493).add(term16497);
        ((ArrayList) term16493).add(term16495);
        ((ArrayList) term16493).add(term16499);
        ((ArrayList) term16493).add(term16501);
        ((ArrayList) term16493).add(term16503);
        ((ArrayList) term16493).add(term16505);
        Class<? extends Object> term16548 = Class.forName((String) "nn.neural.AnnType");
        Field term16547 = ((Class) term16548).getDeclaredField((String) "OUTPUT");
        ((Field) term16547).setAccessible(true);
        Object enum100 = ((Field) term16547).get((Object) null);
        Double term16522 = new Double(0.40635376375558196);
        ArrayList term16524 = new ArrayList();
        ((ArrayList) term16524).add(term16489);
        ((ArrayList) term16524).add(term16497);
        ((ArrayList) term16524).add(term16505);
        ((ArrayList) term16524).add(term16501);
        ((ArrayList) term16524).add(term16497);
        ((ArrayList) term16524).add(term16495);
        Object term16530 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16530, term16530.getClass(), "weight", 0.0);
        setField(term16530, term16530.getClass(), "in", null);
        setField(term16530, term16530.getClass(), "out", null);
        Object term16532 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16532, term16532.getClass(), "weight", 0.0);
        setField(term16532, term16532.getClass(), "in", null);
        setField(term16532, term16532.getClass(), "out", null);
        ArrayList term16528 = new ArrayList();
        ((ArrayList) term16528).add(term16530);
        ((ArrayList) term16528).add(term16495);
        ((ArrayList) term16528).add(term16532);
        Class<? extends Object> term16658 = Class.forName((String) "nn.neural.AnnType");
        Field term16657 = ((Class) term16658).getDeclaredField((String) "INPUT");
        ((Field) term16657).setAccessible(true);
        Object enum101 = ((Field) term16657).get((Object) null);
        term16482 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16484 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16521 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16482, term16482.getClass(), "weight", 0.3797374233070945);
        setField(term16484, term16484.getClass(), "output", term16485);
        setField(term16484, term16484.getClass(), "inputs", term16487);
        setField(term16484, term16484.getClass(), "outputs", term16493);
        setField(term16484, term16484.getClass(), "type", enum100);
        setIntField(term16484, term16484.getClass(), "id", 185647247);
        setDoubleField(term16484, term16484.getClass(), "bias", 0.11415011225631944);
        setField(term16482, term16482.getClass(), "in", term16484);
        setField(term16521, term16521.getClass(), "output", term16522);
        setField(term16521, term16521.getClass(), "inputs", term16524);
        setField(term16521, term16521.getClass(), "outputs", term16528);
        setField(term16521, term16521.getClass(), "type", enum101);
        setIntField(term16521, term16521.getClass(), "id", 720814309);
        setDoubleField(term16521, term16521.getClass(), "bias", 0.9680611801309333);
        setField(term16482, term16482.getClass(), "out", term16521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeight", argTypes, term16482, args);
    }

};


