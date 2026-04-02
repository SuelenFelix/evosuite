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
     Object term2639;

    public AnnNode_getId_97705063812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2640 = new Double(0.3227335400819148);
        Double term2647 = new Double(0.43337207054070237);
        Object term2644 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2646 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2651 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2644, term2644.getClass(), "weight", 0.28292420012823627);
        setField(term2646, term2646.getClass(), "output", term2647);
        setField(term2646, term2646.getClass(), "inputs", null);
        setField(term2646, term2646.getClass(), "outputs", null);
        setField(term2646, term2646.getClass(), "type", null);
        setIntField(term2646, term2646.getClass(), "id", -341962980);
        setDoubleField(term2646, term2646.getClass(), "bias", 0.25474180574060834);
        setField(term2644, term2644.getClass(), "in", term2646);
        setField(term2651, term2651.getClass(), "output", null);
        setField(term2651, term2651.getClass(), "inputs", null);
        setField(term2651, term2651.getClass(), "outputs", null);
        setField(term2651, term2651.getClass(), "type", null);
        setIntField(term2651, term2651.getClass(), "id", 0);
        setDoubleField(term2651, term2651.getClass(), "bias", 0.0);
        setField(term2644, term2644.getClass(), "out", term2651);
        Object term2654 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2656 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2659 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2654, term2654.getClass(), "weight", 0.1858089882752998);
        setField(term2656, term2656.getClass(), "output", null);
        setField(term2656, term2656.getClass(), "inputs", null);
        setField(term2656, term2656.getClass(), "outputs", null);
        setField(term2656, term2656.getClass(), "type", null);
        setIntField(term2656, term2656.getClass(), "id", 0);
        setDoubleField(term2656, term2656.getClass(), "bias", 0.0);
        setField(term2654, term2654.getClass(), "in", term2656);
        setField(term2659, term2659.getClass(), "output", null);
        setField(term2659, term2659.getClass(), "inputs", null);
        setField(term2659, term2659.getClass(), "outputs", null);
        setField(term2659, term2659.getClass(), "type", null);
        setIntField(term2659, term2659.getClass(), "id", 0);
        setDoubleField(term2659, term2659.getClass(), "bias", 0.0);
        setField(term2654, term2654.getClass(), "out", term2659);
        Double term2668 = new Double(0.9126850255993704);
        Object term2662 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2664 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2667 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2662, term2662.getClass(), "weight", 0.5329919447422633);
        setField(term2664, term2664.getClass(), "output", null);
        setField(term2664, term2664.getClass(), "inputs", null);
        setField(term2664, term2664.getClass(), "outputs", null);
        setField(term2664, term2664.getClass(), "type", null);
        setIntField(term2664, term2664.getClass(), "id", 0);
        setDoubleField(term2664, term2664.getClass(), "bias", 0.0);
        setField(term2662, term2662.getClass(), "in", term2664);
        setField(term2667, term2667.getClass(), "output", term2668);
        setField(term2667, term2667.getClass(), "inputs", null);
        setField(term2667, term2667.getClass(), "outputs", null);
        setField(term2667, term2667.getClass(), "type", null);
        setIntField(term2667, term2667.getClass(), "id", -615654495);
        setDoubleField(term2667, term2667.getClass(), "bias", 0.6693176553622628);
        setField(term2662, term2662.getClass(), "out", term2667);
        Object term2672 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term2672, term2672.getClass(), "weight", 0.7046974927834232);
        setField(term2672, term2672.getClass(), "in", term2646);
        setField(term2672, term2672.getClass(), "out", term2646);
        Double term2677 = new Double(0.13246999699526574);
        Object term2674 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2676 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2674, term2674.getClass(), "weight", 0.5407563152320285);
        setField(term2676, term2676.getClass(), "output", term2677);
        setField(term2676, term2676.getClass(), "inputs", null);
        setField(term2676, term2676.getClass(), "outputs", null);
        setField(term2676, term2676.getClass(), "type", null);
        setIntField(term2676, term2676.getClass(), "id", -1476117762);
        setDoubleField(term2676, term2676.getClass(), "bias", 0.2962868255626906);
        setField(term2674, term2674.getClass(), "in", term2676);
        setField(term2674, term2674.getClass(), "out", term2664);
        ArrayList term2642 = new ArrayList();
        ((ArrayList) term2642).add(term2644);
        ((ArrayList) term2642).add(term2654);
        ((ArrayList) term2642).add(term2662);
        ((ArrayList) term2642).add(term2672);
        ((ArrayList) term2642).add(term2674);
        Object term2685 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term2685, term2685.getClass(), "weight", 0.25025774487844066);
        setField(term2685, term2685.getClass(), "in", term2664);
        setField(term2685, term2685.getClass(), "out", term2651);
        ArrayList term2683 = new ArrayList();
        ((ArrayList) term2683).add(term2685);
        Class<? extends Object> term2702 = Class.forName((String) "nn.neural.AnnType");
        Field term2701 = ((Class) term2702).getDeclaredField((String) "HIDDEN");
        ((Field) term2701).setAccessible(true);
        Object enum17 = ((Field) term2701).get((Object) null);
        term2639 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term2639, term2639.getClass(), "output", term2640);
        setField(term2639, term2639.getClass(), "inputs", term2642);
        setField(term2639, term2639.getClass(), "outputs", term2683);
        setField(term2639, term2639.getClass(), "type", enum17);
        setIntField(term2639, term2639.getClass(), "id", 1532716628);
        setDoubleField(term2639, term2639.getClass(), "bias", 0.9957585718901875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2639, args);
    }

};


