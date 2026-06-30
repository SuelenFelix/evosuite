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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class NeuralNetwork_calculate_21053833211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term699;
     Object term743;

    public NeuralNetwork_calculate_21053833211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term701 = new HashMap();
        Set<Object> term752 =  ((Map) term701).keySet();
        HashSet term700 = new HashSet((Collection<? extends Object>) term752);
        HashMap term716 = new HashMap();
        Set<Object> term753 =  ((Map) term716).keySet();
        HashSet term715 = new HashSet((Collection<? extends Object>) term753);
        HashMap term729 = new HashMap();
        Set<Object> term754 =  ((Map) term729).keySet();
        HashSet term728 = new HashSet((Collection<? extends Object>) term754);
        term699 = newInstance(Class.forName("nn.neural.NeuralNetwork"));
        setField(term699, term699.getClass(), "inputNodes", term700);
        setField(term699, term699.getClass(), "outputNodes", term715);
        setField(term699, term699.getClass(), "hiddenNodes", term728);
        term743 = (double[]) newDoubleArray(8);
        setDoubleElement(term743, 0, 0.3587267442738795);
        setDoubleElement(term743, 1, 0.07802449704920456);
        setDoubleElement(term743, 2, 0.5279279537140873);
        setDoubleElement(term743, 3, 0.3202192021706908);
        setDoubleElement(term743, 4, 0.22651340641904605);
        setDoubleElement(term743, 5, 0.8878841294187743);
        setDoubleElement(term743, 6, 0.6588948704887806);
        setDoubleElement(term743, 7, 0.6397214730945112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.NeuralNetwork");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term743;
        callMethod(klass, "calculate", argTypes, term699, args);
    }

};


