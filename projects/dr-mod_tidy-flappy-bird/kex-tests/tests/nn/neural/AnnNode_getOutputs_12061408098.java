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
     Object term12827;

    public AnnNode_getOutputs_12061408098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term12828 = new Double(0.15917839663695388);
        Double term12835 = new Double(0.9374115574082594);
        Double term12840 = new Double(0.9203805380592256);
        Object term12832 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term12834 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term12839 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term12832, term12832.getClass(), "weight", 0.6080820676996378);
        setField(term12834, term12834.getClass(), "output", term12835);
        setField(term12834, term12834.getClass(), "inputs", null);
        setField(term12834, term12834.getClass(), "outputs", null);
        setField(term12834, term12834.getClass(), "type", null);
        setIntField(term12834, term12834.getClass(), "id", -2004794532);
        setDoubleField(term12834, term12834.getClass(), "bias", 0.8432220434692428);
        setField(term12832, term12832.getClass(), "in", term12834);
        setField(term12839, term12839.getClass(), "output", term12840);
        setField(term12839, term12839.getClass(), "inputs", null);
        setField(term12839, term12839.getClass(), "outputs", null);
        setField(term12839, term12839.getClass(), "type", null);
        setIntField(term12839, term12839.getClass(), "id", -1419341969);
        setDoubleField(term12839, term12839.getClass(), "bias", 0.530126080388379);
        setField(term12832, term12832.getClass(), "out", term12839);
        ArrayList term12830 = new ArrayList();
        ((ArrayList) term12830).add(term12832);
        Double term12851 = new Double(0.8454723071922143);
        Object term12848 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term12850 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term12855 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term12848, term12848.getClass(), "weight", 0.40695922365872805);
        setField(term12850, term12850.getClass(), "output", term12851);
        setField(term12850, term12850.getClass(), "inputs", null);
        setField(term12850, term12850.getClass(), "outputs", null);
        setField(term12850, term12850.getClass(), "type", null);
        setIntField(term12850, term12850.getClass(), "id", 1475906894);
        setDoubleField(term12850, term12850.getClass(), "bias", 0.8079395143254551);
        setField(term12848, term12848.getClass(), "in", term12850);
        setField(term12855, term12855.getClass(), "output", null);
        setField(term12855, term12855.getClass(), "inputs", null);
        setField(term12855, term12855.getClass(), "outputs", null);
        setField(term12855, term12855.getClass(), "type", null);
        setIntField(term12855, term12855.getClass(), "id", 0);
        setDoubleField(term12855, term12855.getClass(), "bias", 0.0);
        setField(term12848, term12848.getClass(), "out", term12855);
        Object term12858 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term12860 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term12863 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term12858, term12858.getClass(), "weight", 0.16581764143035682);
        setField(term12860, term12860.getClass(), "output", null);
        setField(term12860, term12860.getClass(), "inputs", null);
        setField(term12860, term12860.getClass(), "outputs", null);
        setField(term12860, term12860.getClass(), "type", null);
        setIntField(term12860, term12860.getClass(), "id", 0);
        setDoubleField(term12860, term12860.getClass(), "bias", 0.0);
        setField(term12858, term12858.getClass(), "in", term12860);
        setField(term12863, term12863.getClass(), "output", null);
        setField(term12863, term12863.getClass(), "inputs", null);
        setField(term12863, term12863.getClass(), "outputs", null);
        setField(term12863, term12863.getClass(), "type", null);
        setIntField(term12863, term12863.getClass(), "id", 0);
        setDoubleField(term12863, term12863.getClass(), "bias", 0.0);
        setField(term12858, term12858.getClass(), "out", term12863);
        ArrayList term12846 = new ArrayList();
        ((ArrayList) term12846).add(term12848);
        ((ArrayList) term12846).add(term12858);
        Class<? extends Object> term12880 = Class.forName((String) "nn.neural.AnnType");
        Field term12879 = ((Class) term12880).getDeclaredField((String) "INPUT");
        ((Field) term12879).setAccessible(true);
        Object enum77 = ((Field) term12879).get((Object) null);
        term12827 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term12827, term12827.getClass(), "output", term12828);
        setField(term12827, term12827.getClass(), "inputs", term12830);
        setField(term12827, term12827.getClass(), "outputs", term12846);
        setField(term12827, term12827.getClass(), "type", enum77);
        setIntField(term12827, term12827.getClass(), "id", 1232958763);
        setDoubleField(term12827, term12827.getClass(), "bias", 0.10735086460638021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOutputs", argTypes, term12827, args);
    }

};


