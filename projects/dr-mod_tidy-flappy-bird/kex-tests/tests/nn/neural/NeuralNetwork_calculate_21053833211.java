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
     Object term739;

    public NeuralNetwork_calculate_21053833211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term701 = new HashMap();
        Set<Object> term748 =  ((Map) term701).keySet();
        HashSet term700 = new HashSet((Collection<? extends Object>) term748);
        HashMap term714 = new HashMap();
        Set<Object> term749 =  ((Map) term714).keySet();
        HashSet term713 = new HashSet((Collection<? extends Object>) term749);
        HashMap term727 = new HashMap();
        Set<Object> term750 =  ((Map) term727).keySet();
        HashSet term726 = new HashSet((Collection<? extends Object>) term750);
        term699 = newInstance(Class.forName("nn.neural.NeuralNetwork"));
        setField(term699, term699.getClass(), "inputNodes", term700);
        setField(term699, term699.getClass(), "outputNodes", term713);
        setField(term699, term699.getClass(), "hiddenNodes", term726);
        term739 = (double[]) newDoubleArray(8);
        setDoubleElement(term739, 0, 0.3587267442738795);
        setDoubleElement(term739, 1, 0.07802449704920456);
        setDoubleElement(term739, 2, 0.5279279537140873);
        setDoubleElement(term739, 3, 0.3202192021706908);
        setDoubleElement(term739, 4, 0.22651340641904605);
        setDoubleElement(term739, 5, 0.8878841294187743);
        setDoubleElement(term739, 6, 0.6588948704887806);
        setDoubleElement(term739, 7, 0.6397214730945112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.NeuralNetwork");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term739;
        callMethod(klass, "calculate", argTypes, term699, args);
    }

};


