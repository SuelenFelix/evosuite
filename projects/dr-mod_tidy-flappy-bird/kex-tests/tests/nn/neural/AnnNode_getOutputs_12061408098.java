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

public class AnnNode_getOutputs_12061408098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12833;

    public AnnNode_getOutputs_12061408098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term12834 = new Double(0.15917839663695388);
        Double term12841 = new Double(0.9374115574082594);
        Double term12846 = new Double(0.9203805380592256);
        Object term12838 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term12840 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term12845 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term12838, term12838.getClass(), "weight", 0.6080820676996378);
        setField(term12840, term12840.getClass(), "output", term12841);
        setField(term12840, term12840.getClass(), "inputs", null);
        setField(term12840, term12840.getClass(), "outputs", null);
        setField(term12840, term12840.getClass(), "type", null);
        setIntField(term12840, term12840.getClass(), "id", -2004794532);
        setDoubleField(term12840, term12840.getClass(), "bias", 0.8432220434692428);
        setField(term12838, term12838.getClass(), "in", term12840);
        setField(term12845, term12845.getClass(), "output", term12846);
        setField(term12845, term12845.getClass(), "inputs", null);
        setField(term12845, term12845.getClass(), "outputs", null);
        setField(term12845, term12845.getClass(), "type", null);
        setIntField(term12845, term12845.getClass(), "id", -1419341969);
        setDoubleField(term12845, term12845.getClass(), "bias", 0.530126080388379);
        setField(term12838, term12838.getClass(), "out", term12845);
        ArrayList term12836 = new ArrayList();
        ((ArrayList) term12836).add(term12838);
        Double term12857 = new Double(0.8454723071922143);
        Object term12854 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term12856 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term12861 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term12854, term12854.getClass(), "weight", 0.40695922365872805);
        setField(term12856, term12856.getClass(), "output", term12857);
        setField(term12856, term12856.getClass(), "inputs", null);
        setField(term12856, term12856.getClass(), "outputs", null);
        setField(term12856, term12856.getClass(), "type", null);
        setIntField(term12856, term12856.getClass(), "id", 1475906894);
        setDoubleField(term12856, term12856.getClass(), "bias", 0.8079395143254551);
        setField(term12854, term12854.getClass(), "in", term12856);
        setField(term12861, term12861.getClass(), "output", null);
        setField(term12861, term12861.getClass(), "inputs", null);
        setField(term12861, term12861.getClass(), "outputs", null);
        setField(term12861, term12861.getClass(), "type", null);
        setIntField(term12861, term12861.getClass(), "id", 0);
        setDoubleField(term12861, term12861.getClass(), "bias", 0.0);
        setField(term12854, term12854.getClass(), "out", term12861);
        Object term12864 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term12866 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term12869 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term12864, term12864.getClass(), "weight", 0.16581764143035682);
        setField(term12866, term12866.getClass(), "output", null);
        setField(term12866, term12866.getClass(), "inputs", null);
        setField(term12866, term12866.getClass(), "outputs", null);
        setField(term12866, term12866.getClass(), "type", null);
        setIntField(term12866, term12866.getClass(), "id", 0);
        setDoubleField(term12866, term12866.getClass(), "bias", 0.0);
        setField(term12864, term12864.getClass(), "in", term12866);
        setField(term12869, term12869.getClass(), "output", null);
        setField(term12869, term12869.getClass(), "inputs", null);
        setField(term12869, term12869.getClass(), "outputs", null);
        setField(term12869, term12869.getClass(), "type", null);
        setIntField(term12869, term12869.getClass(), "id", 0);
        setDoubleField(term12869, term12869.getClass(), "bias", 0.0);
        setField(term12864, term12864.getClass(), "out", term12869);
        ArrayList term12852 = new ArrayList();
        ((ArrayList) term12852).add(term12854);
        ((ArrayList) term12852).add(term12864);
        Class<? extends Object> term12886 = Class.forName((String) "nn.neural.AnnType");
        Field term12885 = ((Class) term12886).getDeclaredField((String) "INPUT");
        ((Field) term12885).setAccessible(true);
        Object enum77 = ((Field) term12885).get((Object) null);
        term12833 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term12833, term12833.getClass(), "output", term12834);
        setField(term12833, term12833.getClass(), "inputs", term12836);
        setField(term12833, term12833.getClass(), "outputs", term12852);
        setField(term12833, term12833.getClass(), "type", enum77);
        setIntField(term12833, term12833.getClass(), "id", 1232958763);
        setDoubleField(term12833, term12833.getClass(), "bias", 0.10735086460638021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOutputs", argTypes, term12833, args);
    }

};


