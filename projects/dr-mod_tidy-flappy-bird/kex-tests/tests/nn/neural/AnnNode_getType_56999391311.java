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
import java.lang.Double;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class AnnNode_getType_56999391311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2472;

    public AnnNode_getType_56999391311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2473 = new Double(0.9203805380592256);
        Double term2480 = new Double(0.5804948995371725);
        Object term2477 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2479 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2484 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2477, term2477.getClass(), "weight", 0.9276995636844321);
        setField(term2479, term2479.getClass(), "output", term2480);
        setField(term2479, term2479.getClass(), "inputs", null);
        setField(term2479, term2479.getClass(), "outputs", null);
        setField(term2479, term2479.getClass(), "type", null);
        setIntField(term2479, term2479.getClass(), "id", -1210583429);
        setDoubleField(term2479, term2479.getClass(), "bias", 0.6047138318674447);
        setField(term2477, term2477.getClass(), "in", term2479);
        setField(term2484, term2484.getClass(), "output", null);
        setField(term2484, term2484.getClass(), "inputs", null);
        setField(term2484, term2484.getClass(), "outputs", null);
        setField(term2484, term2484.getClass(), "type", null);
        setIntField(term2484, term2484.getClass(), "id", 0);
        setDoubleField(term2484, term2484.getClass(), "bias", 0.0);
        setField(term2477, term2477.getClass(), "out", term2484);
        ArrayList term2475 = new ArrayList();
        ((ArrayList) term2475).add(term2477);
        Double term2497 = new Double(0.7919370314903882);
        Object term2491 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2493 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2496 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2491, term2491.getClass(), "weight", 0.9165240441138934);
        setField(term2493, term2493.getClass(), "output", null);
        setField(term2493, term2493.getClass(), "inputs", null);
        setField(term2493, term2493.getClass(), "outputs", null);
        setField(term2493, term2493.getClass(), "type", null);
        setIntField(term2493, term2493.getClass(), "id", 0);
        setDoubleField(term2493, term2493.getClass(), "bias", 0.0);
        setField(term2491, term2491.getClass(), "in", term2493);
        setField(term2496, term2496.getClass(), "output", term2497);
        setField(term2496, term2496.getClass(), "inputs", null);
        setField(term2496, term2496.getClass(), "outputs", null);
        setField(term2496, term2496.getClass(), "type", null);
        setIntField(term2496, term2496.getClass(), "id", 1596213415);
        setDoubleField(term2496, term2496.getClass(), "bias", 0.8490790645379176);
        setField(term2491, term2491.getClass(), "out", term2496);
        Object term2501 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2503 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2501, term2501.getClass(), "weight", 0.07901636960861558);
        setField(term2501, term2501.getClass(), "in", term2496);
        setField(term2503, term2503.getClass(), "output", null);
        setField(term2503, term2503.getClass(), "inputs", null);
        setField(term2503, term2503.getClass(), "outputs", null);
        setField(term2503, term2503.getClass(), "type", null);
        setIntField(term2503, term2503.getClass(), "id", 0);
        setDoubleField(term2503, term2503.getClass(), "bias", 0.0);
        setField(term2501, term2501.getClass(), "out", term2503);
        Double term2509 = new Double(0.20737514139742264);
        Object term2506 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2508 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2506, term2506.getClass(), "weight", 0.7636130748477434);
        setField(term2508, term2508.getClass(), "output", term2509);
        setField(term2508, term2508.getClass(), "inputs", null);
        setField(term2508, term2508.getClass(), "outputs", null);
        setField(term2508, term2508.getClass(), "type", null);
        setIntField(term2508, term2508.getClass(), "id", -268815336);
        setDoubleField(term2508, term2508.getClass(), "bias", 0.23129126164078717);
        setField(term2506, term2506.getClass(), "in", term2508);
        setField(term2506, term2506.getClass(), "out", term2484);
        Object term2513 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term2513, term2513.getClass(), "weight", 0.5310967137636303);
        setField(term2513, term2513.getClass(), "in", term2503);
        setField(term2513, term2513.getClass(), "out", term2484);
        Object term2515 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term2515, term2515.getClass(), "weight", 0.22227423914231126);
        setField(term2515, term2515.getClass(), "in", term2479);
        setField(term2515, term2515.getClass(), "out", term2479);
        ArrayList term2489 = new ArrayList();
        ((ArrayList) term2489).add(term2491);
        ((ArrayList) term2489).add(term2501);
        ((ArrayList) term2489).add(term2506);
        ((ArrayList) term2489).add(term2491);
        ((ArrayList) term2489).add(term2513);
        ((ArrayList) term2489).add(term2477);
        ((ArrayList) term2489).add(term2515);
        Class<? extends Object> term2532 = Class.forName((String) "nn.neural.AnnType");
        Field term2531 = ((Class) term2532).getDeclaredField((String) "OUTPUT");
        ((Field) term2531).setAccessible(true);
        Object enum16 = ((Field) term2531).get((Object) null);
        term2472 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term2472, term2472.getClass(), "output", term2473);
        setField(term2472, term2472.getClass(), "inputs", term2475);
        setField(term2472, term2472.getClass(), "outputs", term2489);
        setField(term2472, term2472.getClass(), "type", enum16);
        setIntField(term2472, term2472.getClass(), "id", -663691365);
        setDoubleField(term2472, term2472.getClass(), "bias", 0.5597136413549945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term2472, args);
    }

};


