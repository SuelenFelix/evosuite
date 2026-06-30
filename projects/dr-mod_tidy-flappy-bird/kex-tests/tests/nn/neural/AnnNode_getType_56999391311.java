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
     Object term2474;

    public AnnNode_getType_56999391311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2475 = new Double(0.9203805380592256);
        Double term2482 = new Double(0.5804948995371725);
        Object term2479 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2481 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2486 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2479, term2479.getClass(), "weight", 0.9276995636844321);
        setField(term2481, term2481.getClass(), "output", term2482);
        setField(term2481, term2481.getClass(), "inputs", null);
        setField(term2481, term2481.getClass(), "outputs", null);
        setField(term2481, term2481.getClass(), "type", null);
        setIntField(term2481, term2481.getClass(), "id", -1210583429);
        setDoubleField(term2481, term2481.getClass(), "bias", 0.6047138318674447);
        setField(term2479, term2479.getClass(), "in", term2481);
        setField(term2486, term2486.getClass(), "output", null);
        setField(term2486, term2486.getClass(), "inputs", null);
        setField(term2486, term2486.getClass(), "outputs", null);
        setField(term2486, term2486.getClass(), "type", null);
        setIntField(term2486, term2486.getClass(), "id", 0);
        setDoubleField(term2486, term2486.getClass(), "bias", 0.0);
        setField(term2479, term2479.getClass(), "out", term2486);
        ArrayList term2477 = new ArrayList();
        ((ArrayList) term2477).add(term2479);
        Double term2499 = new Double(0.7919370314903882);
        Object term2493 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2495 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2498 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2493, term2493.getClass(), "weight", 0.9165240441138934);
        setField(term2495, term2495.getClass(), "output", null);
        setField(term2495, term2495.getClass(), "inputs", null);
        setField(term2495, term2495.getClass(), "outputs", null);
        setField(term2495, term2495.getClass(), "type", null);
        setIntField(term2495, term2495.getClass(), "id", 0);
        setDoubleField(term2495, term2495.getClass(), "bias", 0.0);
        setField(term2493, term2493.getClass(), "in", term2495);
        setField(term2498, term2498.getClass(), "output", term2499);
        setField(term2498, term2498.getClass(), "inputs", null);
        setField(term2498, term2498.getClass(), "outputs", null);
        setField(term2498, term2498.getClass(), "type", null);
        setIntField(term2498, term2498.getClass(), "id", 1596213415);
        setDoubleField(term2498, term2498.getClass(), "bias", 0.8490790645379176);
        setField(term2493, term2493.getClass(), "out", term2498);
        Object term2503 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2505 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2503, term2503.getClass(), "weight", 0.07901636960861558);
        setField(term2503, term2503.getClass(), "in", term2498);
        setField(term2505, term2505.getClass(), "output", null);
        setField(term2505, term2505.getClass(), "inputs", null);
        setField(term2505, term2505.getClass(), "outputs", null);
        setField(term2505, term2505.getClass(), "type", null);
        setIntField(term2505, term2505.getClass(), "id", 0);
        setDoubleField(term2505, term2505.getClass(), "bias", 0.0);
        setField(term2503, term2503.getClass(), "out", term2505);
        Double term2511 = new Double(0.20737514139742264);
        Object term2508 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2510 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2508, term2508.getClass(), "weight", 0.7636130748477434);
        setField(term2510, term2510.getClass(), "output", term2511);
        setField(term2510, term2510.getClass(), "inputs", null);
        setField(term2510, term2510.getClass(), "outputs", null);
        setField(term2510, term2510.getClass(), "type", null);
        setIntField(term2510, term2510.getClass(), "id", -268815336);
        setDoubleField(term2510, term2510.getClass(), "bias", 0.23129126164078717);
        setField(term2508, term2508.getClass(), "in", term2510);
        setField(term2508, term2508.getClass(), "out", term2486);
        Object term2515 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term2515, term2515.getClass(), "weight", 0.5310967137636303);
        setField(term2515, term2515.getClass(), "in", term2505);
        setField(term2515, term2515.getClass(), "out", term2486);
        Object term2517 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term2517, term2517.getClass(), "weight", 0.22227423914231126);
        setField(term2517, term2517.getClass(), "in", term2481);
        setField(term2517, term2517.getClass(), "out", term2481);
        ArrayList term2491 = new ArrayList();
        ((ArrayList) term2491).add(term2493);
        ((ArrayList) term2491).add(term2503);
        ((ArrayList) term2491).add(term2508);
        ((ArrayList) term2491).add(term2493);
        ((ArrayList) term2491).add(term2515);
        ((ArrayList) term2491).add(term2479);
        ((ArrayList) term2491).add(term2517);
        Class<? extends Object> term2534 = Class.forName((String) "nn.neural.AnnType");
        Field term2533 = ((Class) term2534).getDeclaredField((String) "OUTPUT");
        ((Field) term2533).setAccessible(true);
        Object enum16 = ((Field) term2533).get((Object) null);
        term2474 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term2474, term2474.getClass(), "output", term2475);
        setField(term2474, term2474.getClass(), "inputs", term2477);
        setField(term2474, term2474.getClass(), "outputs", term2491);
        setField(term2474, term2474.getClass(), "type", enum16);
        setIntField(term2474, term2474.getClass(), "id", -663691365);
        setDoubleField(term2474, term2474.getClass(), "bias", 0.5597136413549945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term2474, args);
    }

};


