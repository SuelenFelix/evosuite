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
     Object term2641;

    public AnnNode_getId_97705063812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2642 = new Double(0.3227335400819148);
        Double term2649 = new Double(0.43337207054070237);
        Object term2646 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2648 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2653 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2646, term2646.getClass(), "weight", 0.28292420012823627);
        setField(term2648, term2648.getClass(), "output", term2649);
        setField(term2648, term2648.getClass(), "inputs", null);
        setField(term2648, term2648.getClass(), "outputs", null);
        setField(term2648, term2648.getClass(), "type", null);
        setIntField(term2648, term2648.getClass(), "id", -341962980);
        setDoubleField(term2648, term2648.getClass(), "bias", 0.25474180574060834);
        setField(term2646, term2646.getClass(), "in", term2648);
        setField(term2653, term2653.getClass(), "output", null);
        setField(term2653, term2653.getClass(), "inputs", null);
        setField(term2653, term2653.getClass(), "outputs", null);
        setField(term2653, term2653.getClass(), "type", null);
        setIntField(term2653, term2653.getClass(), "id", 0);
        setDoubleField(term2653, term2653.getClass(), "bias", 0.0);
        setField(term2646, term2646.getClass(), "out", term2653);
        Object term2656 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2658 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2661 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2656, term2656.getClass(), "weight", 0.1858089882752998);
        setField(term2658, term2658.getClass(), "output", null);
        setField(term2658, term2658.getClass(), "inputs", null);
        setField(term2658, term2658.getClass(), "outputs", null);
        setField(term2658, term2658.getClass(), "type", null);
        setIntField(term2658, term2658.getClass(), "id", 0);
        setDoubleField(term2658, term2658.getClass(), "bias", 0.0);
        setField(term2656, term2656.getClass(), "in", term2658);
        setField(term2661, term2661.getClass(), "output", null);
        setField(term2661, term2661.getClass(), "inputs", null);
        setField(term2661, term2661.getClass(), "outputs", null);
        setField(term2661, term2661.getClass(), "type", null);
        setIntField(term2661, term2661.getClass(), "id", 0);
        setDoubleField(term2661, term2661.getClass(), "bias", 0.0);
        setField(term2656, term2656.getClass(), "out", term2661);
        Double term2670 = new Double(0.9126850255993704);
        Object term2664 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2666 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2669 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2664, term2664.getClass(), "weight", 0.5329919447422633);
        setField(term2666, term2666.getClass(), "output", null);
        setField(term2666, term2666.getClass(), "inputs", null);
        setField(term2666, term2666.getClass(), "outputs", null);
        setField(term2666, term2666.getClass(), "type", null);
        setIntField(term2666, term2666.getClass(), "id", 0);
        setDoubleField(term2666, term2666.getClass(), "bias", 0.0);
        setField(term2664, term2664.getClass(), "in", term2666);
        setField(term2669, term2669.getClass(), "output", term2670);
        setField(term2669, term2669.getClass(), "inputs", null);
        setField(term2669, term2669.getClass(), "outputs", null);
        setField(term2669, term2669.getClass(), "type", null);
        setIntField(term2669, term2669.getClass(), "id", -615654495);
        setDoubleField(term2669, term2669.getClass(), "bias", 0.6693176553622628);
        setField(term2664, term2664.getClass(), "out", term2669);
        Object term2674 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term2674, term2674.getClass(), "weight", 0.7046974927834232);
        setField(term2674, term2674.getClass(), "in", term2648);
        setField(term2674, term2674.getClass(), "out", term2648);
        Double term2679 = new Double(0.13246999699526574);
        Object term2676 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2678 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2676, term2676.getClass(), "weight", 0.5407563152320285);
        setField(term2678, term2678.getClass(), "output", term2679);
        setField(term2678, term2678.getClass(), "inputs", null);
        setField(term2678, term2678.getClass(), "outputs", null);
        setField(term2678, term2678.getClass(), "type", null);
        setIntField(term2678, term2678.getClass(), "id", -1476117762);
        setDoubleField(term2678, term2678.getClass(), "bias", 0.2962868255626906);
        setField(term2676, term2676.getClass(), "in", term2678);
        setField(term2676, term2676.getClass(), "out", term2666);
        ArrayList term2644 = new ArrayList();
        ((ArrayList) term2644).add(term2646);
        ((ArrayList) term2644).add(term2656);
        ((ArrayList) term2644).add(term2664);
        ((ArrayList) term2644).add(term2674);
        ((ArrayList) term2644).add(term2676);
        Object term2687 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term2687, term2687.getClass(), "weight", 0.25025774487844066);
        setField(term2687, term2687.getClass(), "in", term2666);
        setField(term2687, term2687.getClass(), "out", term2653);
        ArrayList term2685 = new ArrayList();
        ((ArrayList) term2685).add(term2687);
        Class<? extends Object> term2704 = Class.forName((String) "nn.neural.AnnType");
        Field term2703 = ((Class) term2704).getDeclaredField((String) "HIDDEN");
        ((Field) term2703).setAccessible(true);
        Object enum17 = ((Field) term2703).get((Object) null);
        term2641 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term2641, term2641.getClass(), "output", term2642);
        setField(term2641, term2641.getClass(), "inputs", term2644);
        setField(term2641, term2641.getClass(), "outputs", term2685);
        setField(term2641, term2641.getClass(), "type", enum17);
        setIntField(term2641, term2641.getClass(), "id", 1532716628);
        setDoubleField(term2641, term2641.getClass(), "bias", 0.9957585718901875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2641, args);
    }

};


