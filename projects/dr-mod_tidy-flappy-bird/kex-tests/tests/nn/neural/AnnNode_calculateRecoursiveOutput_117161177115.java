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
     Object term2987;
     Object term3019;

    public AnnNode_calculateRecoursiveOutput_117161177115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2988 = new Double(0.6355029654528058);
        Double term2995 = new Double(0.0022646783892913414);
        Object term2992 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2994 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term2999 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2992, term2992.getClass(), "weight", 0.6037093070161561);
        setField(term2994, term2994.getClass(), "output", term2995);
        setField(term2994, term2994.getClass(), "inputs", null);
        setField(term2994, term2994.getClass(), "outputs", null);
        setField(term2994, term2994.getClass(), "type", null);
        setIntField(term2994, term2994.getClass(), "id", 1386130016);
        setDoubleField(term2994, term2994.getClass(), "bias", 0.17829386444171214);
        setField(term2992, term2992.getClass(), "in", term2994);
        setField(term2999, term2999.getClass(), "output", null);
        setField(term2999, term2999.getClass(), "inputs", null);
        setField(term2999, term2999.getClass(), "outputs", null);
        setField(term2999, term2999.getClass(), "type", null);
        setIntField(term2999, term2999.getClass(), "id", 0);
        setDoubleField(term2999, term2999.getClass(), "bias", 0.0);
        setField(term2992, term2992.getClass(), "out", term2999);
        ArrayList term2990 = new ArrayList();
        ((ArrayList) term2990).add(term2992);
        ArrayList term3004 = new ArrayList();
        Class<? extends Object> term3022 = Class.forName((String) "nn.neural.AnnType");
        Field term3021 = ((Class) term3022).getDeclaredField((String) "INPUT");
        ((Field) term3021).setAccessible(true);
        Object enum19 = ((Field) term3021).get((Object) null);
        term2987 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term2987, term2987.getClass(), "output", term2988);
        setField(term2987, term2987.getClass(), "inputs", term2990);
        setField(term2987, term2987.getClass(), "outputs", term3004);
        setField(term2987, term2987.getClass(), "type", enum19);
        setIntField(term2987, term2987.getClass(), "id", 1072005683);
        setDoubleField(term2987, term2987.getClass(), "bias", 0.547995853732519);
        term3019 = new Integer(1861318859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.function.Function");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3019;
        callMethod(klass, "calculateRecoursiveOutput", argTypes, term2987, args);
    }

};


