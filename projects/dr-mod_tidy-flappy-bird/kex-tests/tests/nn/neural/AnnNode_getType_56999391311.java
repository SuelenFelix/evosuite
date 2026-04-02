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
     Object term2470;

    public AnnNode_getType_56999391311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2471 = new Double(0.9203805380592256);
        Double term2478 = new Double(0.5804948995371725);
        Object term2475 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2477 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2482 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2475, term2475.getClass(), "weight", 0.9276995636844321);
        setField(term2477, term2477.getClass(), "output", term2478);
        setField(term2477, term2477.getClass(), "inputs", null);
        setField(term2477, term2477.getClass(), "outputs", null);
        setField(term2477, term2477.getClass(), "type", null);
        setIntField(term2477, term2477.getClass(), "id", -1210583429);
        setDoubleField(term2477, term2477.getClass(), "bias", 0.6047138318674447);
        setField(term2475, term2475.getClass(), "in", term2477);
        setField(term2482, term2482.getClass(), "output", null);
        setField(term2482, term2482.getClass(), "inputs", null);
        setField(term2482, term2482.getClass(), "outputs", null);
        setField(term2482, term2482.getClass(), "type", null);
        setIntField(term2482, term2482.getClass(), "id", 0);
        setDoubleField(term2482, term2482.getClass(), "bias", 0.0);
        setField(term2475, term2475.getClass(), "out", term2482);
        ArrayList term2473 = new ArrayList();
        ((ArrayList) term2473).add(term2475);
        Double term2495 = new Double(0.7919370314903882);
        Object term2489 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2491 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2494 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2489, term2489.getClass(), "weight", 0.9165240441138934);
        setField(term2491, term2491.getClass(), "output", null);
        setField(term2491, term2491.getClass(), "inputs", null);
        setField(term2491, term2491.getClass(), "outputs", null);
        setField(term2491, term2491.getClass(), "type", null);
        setIntField(term2491, term2491.getClass(), "id", 0);
        setDoubleField(term2491, term2491.getClass(), "bias", 0.0);
        setField(term2489, term2489.getClass(), "in", term2491);
        setField(term2494, term2494.getClass(), "output", term2495);
        setField(term2494, term2494.getClass(), "inputs", null);
        setField(term2494, term2494.getClass(), "outputs", null);
        setField(term2494, term2494.getClass(), "type", null);
        setIntField(term2494, term2494.getClass(), "id", 1596213415);
        setDoubleField(term2494, term2494.getClass(), "bias", 0.8490790645379176);
        setField(term2489, term2489.getClass(), "out", term2494);
        Object term2499 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2501 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2499, term2499.getClass(), "weight", 0.07901636960861558);
        setField(term2499, term2499.getClass(), "in", term2494);
        setField(term2501, term2501.getClass(), "output", null);
        setField(term2501, term2501.getClass(), "inputs", null);
        setField(term2501, term2501.getClass(), "outputs", null);
        setField(term2501, term2501.getClass(), "type", null);
        setIntField(term2501, term2501.getClass(), "id", 0);
        setDoubleField(term2501, term2501.getClass(), "bias", 0.0);
        setField(term2499, term2499.getClass(), "out", term2501);
        Double term2507 = new Double(0.20737514139742264);
        Object term2504 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2506 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2504, term2504.getClass(), "weight", 0.7636130748477434);
        setField(term2506, term2506.getClass(), "output", term2507);
        setField(term2506, term2506.getClass(), "inputs", null);
        setField(term2506, term2506.getClass(), "outputs", null);
        setField(term2506, term2506.getClass(), "type", null);
        setIntField(term2506, term2506.getClass(), "id", -268815336);
        setDoubleField(term2506, term2506.getClass(), "bias", 0.23129126164078717);
        setField(term2504, term2504.getClass(), "in", term2506);
        setField(term2504, term2504.getClass(), "out", term2482);
        Object term2511 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term2511, term2511.getClass(), "weight", 0.5310967137636303);
        setField(term2511, term2511.getClass(), "in", term2501);
        setField(term2511, term2511.getClass(), "out", term2482);
        Object term2513 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term2513, term2513.getClass(), "weight", 0.22227423914231126);
        setField(term2513, term2513.getClass(), "in", term2477);
        setField(term2513, term2513.getClass(), "out", term2477);
        ArrayList term2487 = new ArrayList();
        ((ArrayList) term2487).add(term2489);
        ((ArrayList) term2487).add(term2499);
        ((ArrayList) term2487).add(term2504);
        ((ArrayList) term2487).add(term2489);
        ((ArrayList) term2487).add(term2511);
        ((ArrayList) term2487).add(term2475);
        ((ArrayList) term2487).add(term2513);
        Class<? extends Object> term2530 = Class.forName((String) "nn.neural.AnnType");
        Field term2529 = ((Class) term2530).getDeclaredField((String) "OUTPUT");
        ((Field) term2529).setAccessible(true);
        Object enum16 = ((Field) term2529).get((Object) null);
        term2470 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term2470, term2470.getClass(), "output", term2471);
        setField(term2470, term2470.getClass(), "inputs", term2473);
        setField(term2470, term2470.getClass(), "outputs", term2487);
        setField(term2470, term2470.getClass(), "type", enum16);
        setIntField(term2470, term2470.getClass(), "id", -663691365);
        setDoubleField(term2470, term2470.getClass(), "bias", 0.5597136413549945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term2470, args);
    }

};


