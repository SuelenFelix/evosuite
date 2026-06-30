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

public class AnnNode_getId_97705063812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2643;

    public AnnNode_getId_97705063812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2644 = new Double(0.3227335400819148);
        Double term2651 = new Double(0.43337207054070237);
        Object term2648 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2650 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2655 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2648, term2648.getClass(), "weight", 0.28292420012823627);
        setField(term2650, term2650.getClass(), "output", term2651);
        setField(term2650, term2650.getClass(), "inputs", null);
        setField(term2650, term2650.getClass(), "outputs", null);
        setField(term2650, term2650.getClass(), "type", null);
        setIntField(term2650, term2650.getClass(), "id", -341962980);
        setDoubleField(term2650, term2650.getClass(), "bias", 0.25474180574060834);
        setField(term2648, term2648.getClass(), "in", term2650);
        setField(term2655, term2655.getClass(), "output", null);
        setField(term2655, term2655.getClass(), "inputs", null);
        setField(term2655, term2655.getClass(), "outputs", null);
        setField(term2655, term2655.getClass(), "type", null);
        setIntField(term2655, term2655.getClass(), "id", 0);
        setDoubleField(term2655, term2655.getClass(), "bias", 0.0);
        setField(term2648, term2648.getClass(), "out", term2655);
        Object term2658 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2660 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2663 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2658, term2658.getClass(), "weight", 0.1858089882752998);
        setField(term2660, term2660.getClass(), "output", null);
        setField(term2660, term2660.getClass(), "inputs", null);
        setField(term2660, term2660.getClass(), "outputs", null);
        setField(term2660, term2660.getClass(), "type", null);
        setIntField(term2660, term2660.getClass(), "id", 0);
        setDoubleField(term2660, term2660.getClass(), "bias", 0.0);
        setField(term2658, term2658.getClass(), "in", term2660);
        setField(term2663, term2663.getClass(), "output", null);
        setField(term2663, term2663.getClass(), "inputs", null);
        setField(term2663, term2663.getClass(), "outputs", null);
        setField(term2663, term2663.getClass(), "type", null);
        setIntField(term2663, term2663.getClass(), "id", 0);
        setDoubleField(term2663, term2663.getClass(), "bias", 0.0);
        setField(term2658, term2658.getClass(), "out", term2663);
        Double term2672 = new Double(0.9126850255993704);
        Object term2666 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2668 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2671 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2666, term2666.getClass(), "weight", 0.5329919447422633);
        setField(term2668, term2668.getClass(), "output", null);
        setField(term2668, term2668.getClass(), "inputs", null);
        setField(term2668, term2668.getClass(), "outputs", null);
        setField(term2668, term2668.getClass(), "type", null);
        setIntField(term2668, term2668.getClass(), "id", 0);
        setDoubleField(term2668, term2668.getClass(), "bias", 0.0);
        setField(term2666, term2666.getClass(), "in", term2668);
        setField(term2671, term2671.getClass(), "output", term2672);
        setField(term2671, term2671.getClass(), "inputs", null);
        setField(term2671, term2671.getClass(), "outputs", null);
        setField(term2671, term2671.getClass(), "type", null);
        setIntField(term2671, term2671.getClass(), "id", -615654495);
        setDoubleField(term2671, term2671.getClass(), "bias", 0.6693176553622628);
        setField(term2666, term2666.getClass(), "out", term2671);
        Object term2676 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term2676, term2676.getClass(), "weight", 0.7046974927834232);
        setField(term2676, term2676.getClass(), "in", term2650);
        setField(term2676, term2676.getClass(), "out", term2650);
        Double term2681 = new Double(0.13246999699526574);
        Object term2678 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2680 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2678, term2678.getClass(), "weight", 0.5407563152320285);
        setField(term2680, term2680.getClass(), "output", term2681);
        setField(term2680, term2680.getClass(), "inputs", null);
        setField(term2680, term2680.getClass(), "outputs", null);
        setField(term2680, term2680.getClass(), "type", null);
        setIntField(term2680, term2680.getClass(), "id", -1476117762);
        setDoubleField(term2680, term2680.getClass(), "bias", 0.2962868255626906);
        setField(term2678, term2678.getClass(), "in", term2680);
        setField(term2678, term2678.getClass(), "out", term2668);
        ArrayList term2646 = new ArrayList();
        ((ArrayList) term2646).add(term2648);
        ((ArrayList) term2646).add(term2658);
        ((ArrayList) term2646).add(term2666);
        ((ArrayList) term2646).add(term2676);
        ((ArrayList) term2646).add(term2678);
        Object term2689 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term2689, term2689.getClass(), "weight", 0.25025774487844066);
        setField(term2689, term2689.getClass(), "in", term2668);
        setField(term2689, term2689.getClass(), "out", term2655);
        ArrayList term2687 = new ArrayList();
        ((ArrayList) term2687).add(term2689);
        Class<? extends Object> term2706 = Class.forName((String) "nn.neural.AnnType");
        Field term2705 = ((Class) term2706).getDeclaredField((String) "HIDDEN");
        ((Field) term2705).setAccessible(true);
        Object enum17 = ((Field) term2705).get((Object) null);
        term2643 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term2643, term2643.getClass(), "output", term2644);
        setField(term2643, term2643.getClass(), "inputs", term2646);
        setField(term2643, term2643.getClass(), "outputs", term2687);
        setField(term2643, term2643.getClass(), "type", enum17);
        setIntField(term2643, term2643.getClass(), "id", 1532716628);
        setDoubleField(term2643, term2643.getClass(), "bias", 0.9957585718901875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2643, args);
    }

};


