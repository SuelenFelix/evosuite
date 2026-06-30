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
     Object term12817;

    public AnnNode_getOutputs_12061408098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term12818 = new Double(0.15917839663695388);
        Double term12825 = new Double(0.9374115574082594);
        Double term12830 = new Double(0.9203805380592256);
        Object term12822 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term12824 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term12829 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term12822, term12822.getClass(), "weight", 0.6080820676996378);
        setField(term12824, term12824.getClass(), "output", term12825);
        setField(term12824, term12824.getClass(), "inputs", null);
        setField(term12824, term12824.getClass(), "outputs", null);
        setField(term12824, term12824.getClass(), "type", null);
        setIntField(term12824, term12824.getClass(), "id", -2004794532);
        setDoubleField(term12824, term12824.getClass(), "bias", 0.8432220434692428);
        setField(term12822, term12822.getClass(), "in", term12824);
        setField(term12829, term12829.getClass(), "output", term12830);
        setField(term12829, term12829.getClass(), "inputs", null);
        setField(term12829, term12829.getClass(), "outputs", null);
        setField(term12829, term12829.getClass(), "type", null);
        setIntField(term12829, term12829.getClass(), "id", -1419341969);
        setDoubleField(term12829, term12829.getClass(), "bias", 0.530126080388379);
        setField(term12822, term12822.getClass(), "out", term12829);
        ArrayList term12820 = new ArrayList();
        ((ArrayList) term12820).add(term12822);
        Double term12841 = new Double(0.8454723071922143);
        Object term12838 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term12840 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term12845 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term12838, term12838.getClass(), "weight", 0.40695922365872805);
        setField(term12840, term12840.getClass(), "output", term12841);
        setField(term12840, term12840.getClass(), "inputs", null);
        setField(term12840, term12840.getClass(), "outputs", null);
        setField(term12840, term12840.getClass(), "type", null);
        setIntField(term12840, term12840.getClass(), "id", 1475906894);
        setDoubleField(term12840, term12840.getClass(), "bias", 0.8079395143254551);
        setField(term12838, term12838.getClass(), "in", term12840);
        setField(term12845, term12845.getClass(), "output", null);
        setField(term12845, term12845.getClass(), "inputs", null);
        setField(term12845, term12845.getClass(), "outputs", null);
        setField(term12845, term12845.getClass(), "type", null);
        setIntField(term12845, term12845.getClass(), "id", 0);
        setDoubleField(term12845, term12845.getClass(), "bias", 0.0);
        setField(term12838, term12838.getClass(), "out", term12845);
        Object term12848 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term12850 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term12853 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term12848, term12848.getClass(), "weight", 0.16581764143035682);
        setField(term12850, term12850.getClass(), "output", null);
        setField(term12850, term12850.getClass(), "inputs", null);
        setField(term12850, term12850.getClass(), "outputs", null);
        setField(term12850, term12850.getClass(), "type", null);
        setIntField(term12850, term12850.getClass(), "id", 0);
        setDoubleField(term12850, term12850.getClass(), "bias", 0.0);
        setField(term12848, term12848.getClass(), "in", term12850);
        setField(term12853, term12853.getClass(), "output", null);
        setField(term12853, term12853.getClass(), "inputs", null);
        setField(term12853, term12853.getClass(), "outputs", null);
        setField(term12853, term12853.getClass(), "type", null);
        setIntField(term12853, term12853.getClass(), "id", 0);
        setDoubleField(term12853, term12853.getClass(), "bias", 0.0);
        setField(term12848, term12848.getClass(), "out", term12853);
        ArrayList term12836 = new ArrayList();
        ((ArrayList) term12836).add(term12838);
        ((ArrayList) term12836).add(term12848);
        Class<? extends Object> term12870 = Class.forName((String) "nn.neural.AnnType");
        Field term12869 = ((Class) term12870).getDeclaredField((String) "INPUT");
        ((Field) term12869).setAccessible(true);
        Object enum77 = ((Field) term12869).get((Object) null);
        term12817 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term12817, term12817.getClass(), "output", term12818);
        setField(term12817, term12817.getClass(), "inputs", term12820);
        setField(term12817, term12817.getClass(), "outputs", term12836);
        setField(term12817, term12817.getClass(), "type", enum77);
        setIntField(term12817, term12817.getClass(), "id", 1232958763);
        setDoubleField(term12817, term12817.getClass(), "bias", 0.10735086460638021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOutputs", argTypes, term12817, args);
    }

};


