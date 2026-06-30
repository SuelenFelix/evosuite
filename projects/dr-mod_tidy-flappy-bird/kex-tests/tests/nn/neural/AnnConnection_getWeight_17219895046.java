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
     Object term16466;

    public AnnConnection_getWeight_17219895046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term16469 = new Double(0.9022041121474429);
        Object term16473 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16473, term16473.getClass(), "weight", 0.38484791313292943);
        setField(term16473, term16473.getClass(), "in", null);
        setField(term16473, term16473.getClass(), "out", null);
        ArrayList term16471 = new ArrayList();
        ((ArrayList) term16471).add(term16473);
        Object term16479 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16479, term16479.getClass(), "weight", 0.0);
        setField(term16479, term16479.getClass(), "in", null);
        setField(term16479, term16479.getClass(), "out", null);
        Object term16481 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16481, term16481.getClass(), "weight", 0.9439864461820359);
        setField(term16481, term16481.getClass(), "in", null);
        setField(term16481, term16481.getClass(), "out", null);
        Object term16483 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16483, term16483.getClass(), "weight", 0.0);
        setField(term16483, term16483.getClass(), "in", null);
        setField(term16483, term16483.getClass(), "out", null);
        Object term16485 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16485, term16485.getClass(), "weight", 0.22215991475278152);
        setField(term16485, term16485.getClass(), "in", null);
        setField(term16485, term16485.getClass(), "out", null);
        Object term16487 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16487, term16487.getClass(), "weight", 0.07750483171119882);
        setField(term16487, term16487.getClass(), "in", null);
        setField(term16487, term16487.getClass(), "out", null);
        Object term16489 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16489, term16489.getClass(), "weight", 0.0);
        setField(term16489, term16489.getClass(), "in", null);
        setField(term16489, term16489.getClass(), "out", null);
        ArrayList term16477 = new ArrayList();
        ((ArrayList) term16477).add(term16479);
        ((ArrayList) term16477).add(term16481);
        ((ArrayList) term16477).add(term16479);
        ((ArrayList) term16477).add(term16483);
        ((ArrayList) term16477).add(term16485);
        ((ArrayList) term16477).add(term16487);
        ((ArrayList) term16477).add(term16489);
        Class<? extends Object> term16532 = Class.forName((String) "nn.neural.AnnType");
        Field term16531 = ((Class) term16532).getDeclaredField((String) "OUTPUT");
        ((Field) term16531).setAccessible(true);
        Object enum100 = ((Field) term16531).get((Object) null);
        Double term16506 = new Double(0.40635376375558196);
        ArrayList term16508 = new ArrayList();
        ((ArrayList) term16508).add(term16473);
        ((ArrayList) term16508).add(term16481);
        ((ArrayList) term16508).add(term16489);
        ((ArrayList) term16508).add(term16485);
        ((ArrayList) term16508).add(term16481);
        ((ArrayList) term16508).add(term16479);
        Object term16514 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16514, term16514.getClass(), "weight", 0.0);
        setField(term16514, term16514.getClass(), "in", null);
        setField(term16514, term16514.getClass(), "out", null);
        Object term16516 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16516, term16516.getClass(), "weight", 0.0);
        setField(term16516, term16516.getClass(), "in", null);
        setField(term16516, term16516.getClass(), "out", null);
        ArrayList term16512 = new ArrayList();
        ((ArrayList) term16512).add(term16514);
        ((ArrayList) term16512).add(term16479);
        ((ArrayList) term16512).add(term16516);
        Class<? extends Object> term16642 = Class.forName((String) "nn.neural.AnnType");
        Field term16641 = ((Class) term16642).getDeclaredField((String) "INPUT");
        ((Field) term16641).setAccessible(true);
        Object enum101 = ((Field) term16641).get((Object) null);
        term16466 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16468 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16505 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16466, term16466.getClass(), "weight", 0.3797374233070945);
        setField(term16468, term16468.getClass(), "output", term16469);
        setField(term16468, term16468.getClass(), "inputs", term16471);
        setField(term16468, term16468.getClass(), "outputs", term16477);
        setField(term16468, term16468.getClass(), "type", enum100);
        setIntField(term16468, term16468.getClass(), "id", 185647247);
        setDoubleField(term16468, term16468.getClass(), "bias", 0.11415011225631944);
        setField(term16466, term16466.getClass(), "in", term16468);
        setField(term16505, term16505.getClass(), "output", term16506);
        setField(term16505, term16505.getClass(), "inputs", term16508);
        setField(term16505, term16505.getClass(), "outputs", term16512);
        setField(term16505, term16505.getClass(), "type", enum101);
        setIntField(term16505, term16505.getClass(), "id", 720814309);
        setDoubleField(term16505, term16505.getClass(), "bias", 0.9680611801309333);
        setField(term16466, term16466.getClass(), "out", term16505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeight", argTypes, term16466, args);
    }

};


