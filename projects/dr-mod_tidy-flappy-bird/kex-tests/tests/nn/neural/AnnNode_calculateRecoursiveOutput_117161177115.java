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
     Object term2989;
     Object term3021;

    public AnnNode_calculateRecoursiveOutput_117161177115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2990 = new Double(0.6355029654528058);
        Double term2997 = new Double(0.0022646783892913414);
        Object term2994 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term2996 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term3001 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term2994, term2994.getClass(), "weight", 0.6037093070161561);
        setField(term2996, term2996.getClass(), "output", term2997);
        setField(term2996, term2996.getClass(), "inputs", null);
        setField(term2996, term2996.getClass(), "outputs", null);
        setField(term2996, term2996.getClass(), "type", null);
        setIntField(term2996, term2996.getClass(), "id", 1386130016);
        setDoubleField(term2996, term2996.getClass(), "bias", 0.17829386444171214);
        setField(term2994, term2994.getClass(), "in", term2996);
        setField(term3001, term3001.getClass(), "output", null);
        setField(term3001, term3001.getClass(), "inputs", null);
        setField(term3001, term3001.getClass(), "outputs", null);
        setField(term3001, term3001.getClass(), "type", null);
        setIntField(term3001, term3001.getClass(), "id", 0);
        setDoubleField(term3001, term3001.getClass(), "bias", 0.0);
        setField(term2994, term2994.getClass(), "out", term3001);
        ArrayList term2992 = new ArrayList();
        ((ArrayList) term2992).add(term2994);
        ArrayList term3006 = new ArrayList();
        Class<? extends Object> term3024 = Class.forName((String) "nn.neural.AnnType");
        Field term3023 = ((Class) term3024).getDeclaredField((String) "INPUT");
        ((Field) term3023).setAccessible(true);
        Object enum19 = ((Field) term3023).get((Object) null);
        term2989 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term2989, term2989.getClass(), "output", term2990);
        setField(term2989, term2989.getClass(), "inputs", term2992);
        setField(term2989, term2989.getClass(), "outputs", term3006);
        setField(term2989, term2989.getClass(), "type", enum19);
        setIntField(term2989, term2989.getClass(), "id", 1072005683);
        setDoubleField(term2989, term2989.getClass(), "bias", 0.547995853732519);
        term3021 = new Integer(1861318859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.function.Function");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3021;
        callMethod(klass, "calculateRecoursiveOutput", argTypes, term2989, args);
    }

};


