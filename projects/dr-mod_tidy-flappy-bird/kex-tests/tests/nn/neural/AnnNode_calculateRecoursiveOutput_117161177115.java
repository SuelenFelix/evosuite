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
import java.lang.Integer;

public class AnnNode_calculateRecoursiveOutput_117161177115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2985;
     Object term3017;

    public AnnNode_calculateRecoursiveOutput_117161177115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2986 = new Double(0.6355029654528058);
        Double term2993 = new Double(0.0022646783892913414);
        Object term2990 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2992 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2997 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2990, term2990.getClass(), "weight", 0.6037093070161561);
        setField(term2992, term2992.getClass(), "output", term2993);
        setField(term2992, term2992.getClass(), "inputs", null);
        setField(term2992, term2992.getClass(), "outputs", null);
        setField(term2992, term2992.getClass(), "type", null);
        setIntField(term2992, term2992.getClass(), "id", 1386130016);
        setDoubleField(term2992, term2992.getClass(), "bias", 0.17829386444171214);
        setField(term2990, term2990.getClass(), "in", term2992);
        setField(term2997, term2997.getClass(), "output", null);
        setField(term2997, term2997.getClass(), "inputs", null);
        setField(term2997, term2997.getClass(), "outputs", null);
        setField(term2997, term2997.getClass(), "type", null);
        setIntField(term2997, term2997.getClass(), "id", 0);
        setDoubleField(term2997, term2997.getClass(), "bias", 0.0);
        setField(term2990, term2990.getClass(), "out", term2997);
        ArrayList term2988 = new ArrayList();
        ((ArrayList) term2988).add(term2990);
        ArrayList term3002 = new ArrayList();
        Class<? extends Object> term3020 = Class.forName((String) "nn.neural.AnnType");
        Field term3019 = ((Class) term3020).getDeclaredField((String) "INPUT");
        ((Field) term3019).setAccessible(true);
        Object enum19 = ((Field) term3019).get((Object) null);
        term2985 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term2985, term2985.getClass(), "output", term2986);
        setField(term2985, term2985.getClass(), "inputs", term2988);
        setField(term2985, term2985.getClass(), "outputs", term3002);
        setField(term2985, term2985.getClass(), "type", enum19);
        setIntField(term2985, term2985.getClass(), "id", 1072005683);
        setDoubleField(term2985, term2985.getClass(), "bias", 0.547995853732519);
        term3017 = new Integer(1861318859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.function.Function");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3017;
        callMethod(klass, "calculateRecoursiveOutput", argTypes, term2985, args);
    }

};


