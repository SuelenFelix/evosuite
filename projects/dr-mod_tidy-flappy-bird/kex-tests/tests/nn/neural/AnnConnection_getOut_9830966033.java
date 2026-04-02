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
import java.lang.Object;
import java.lang.Double;
import java.util.ArrayList;
import java.lang.String;

public class AnnConnection_getOut_9830966033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3760;

    public AnnConnection_getOut_9830966033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3763 = new Double(0.5644914462415626);
        Object term3767 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3767, term3767.getClass(), "weight", 0.049786419821445604);
        setField(term3767, term3767.getClass(), "in", null);
        setField(term3767, term3767.getClass(), "out", null);
        Object term3769 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3769, term3769.getClass(), "weight", 0.8381176594884352);
        setField(term3769, term3769.getClass(), "in", null);
        setField(term3769, term3769.getClass(), "out", null);
        Object term3771 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3771, term3771.getClass(), "weight", 0.0);
        setField(term3771, term3771.getClass(), "in", null);
        setField(term3771, term3771.getClass(), "out", null);
        Object term3773 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3773, term3773.getClass(), "weight", 0.0);
        setField(term3773, term3773.getClass(), "in", null);
        setField(term3773, term3773.getClass(), "out", null);
        ArrayList term3765 = new ArrayList();
        ((ArrayList) term3765).add(term3767);
        ((ArrayList) term3765).add(term3769);
        ((ArrayList) term3765).add(term3771);
        ((ArrayList) term3765).add(term3769);
        ((ArrayList) term3765).add(term3773);
        Object term3779 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3779, term3779.getClass(), "weight", 0.0);
        setField(term3779, term3779.getClass(), "in", null);
        setField(term3779, term3779.getClass(), "out", null);
        Object term3781 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3781, term3781.getClass(), "weight", 0.8814078959581401);
        setField(term3781, term3781.getClass(), "in", null);
        setField(term3781, term3781.getClass(), "out", null);
        ArrayList term3777 = new ArrayList();
        ((ArrayList) term3777).add(term3773);
        ((ArrayList) term3777).add(term3779);
        ((ArrayList) term3777).add(term3760);
        ((ArrayList) term3777).add(term3760);
        ((ArrayList) term3777).add(term3781);
        ((ArrayList) term3777).add(term3767);
        ((ArrayList) term3777).add(term3773);
        ((ArrayList) term3777).add(term3767);
        Class<? extends Object> term3827 = Class.forName((String) "nn.neural.AnnType");
        Field term3826 = ((Class) term3827).getDeclaredField((String) "HIDDEN");
        ((Field) term3826).setAccessible(true);
        Object enum24 = ((Field) term3826).get((Object) null);
        Double term3798 = new Double(0.9628647861255637);
        Object term3802 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3802, term3802.getClass(), "weight", 0.0);
        setField(term3802, term3802.getClass(), "in", null);
        setField(term3802, term3802.getClass(), "out", null);
        Object term3804 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3804, term3804.getClass(), "weight", 0.0);
        setField(term3804, term3804.getClass(), "in", null);
        setField(term3804, term3804.getClass(), "out", null);
        ArrayList term3800 = new ArrayList();
        ((ArrayList) term3800).add(term3802);
        ((ArrayList) term3800).add(term3779);
        ((ArrayList) term3800).add(term3802);
        ((ArrayList) term3800).add(term3771);
        ((ArrayList) term3800).add(term3779);
        ((ArrayList) term3800).add(term3804);
        ((ArrayList) term3800).add(term3771);
        Object term3810 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3810, term3810.getClass(), "weight", 0.47210750955444725);
        setField(term3810, term3810.getClass(), "in", null);
        setField(term3810, term3810.getClass(), "out", null);
        ArrayList term3808 = new ArrayList();
        ((ArrayList) term3808).add(term3804);
        ((ArrayList) term3808).add(term3769);
        ((ArrayList) term3808).add(term3804);
        ((ArrayList) term3808).add(term3771);
        ((ArrayList) term3808).add(term3781);
        ((ArrayList) term3808).add(term3810);
        ((ArrayList) term3808).add(term3773);
        Class<? extends Object> term3937 = Class.forName((String) "nn.neural.AnnType");
        Field term3936 = ((Class) term3937).getDeclaredField((String) "OUTPUT");
        ((Field) term3936).setAccessible(true);
        Object enum25 = ((Field) term3936).get((Object) null);
        term3760 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term3762 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term3797 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term3760, term3760.getClass(), "weight", 0.281059649526194);
        setField(term3762, term3762.getClass(), "output", term3763);
        setField(term3762, term3762.getClass(), "inputs", term3765);
        setField(term3762, term3762.getClass(), "outputs", term3777);
        setField(term3762, term3762.getClass(), "type", enum24);
        setIntField(term3762, term3762.getClass(), "id", -227365013);
        setDoubleField(term3762, term3762.getClass(), "bias", 0.6221715730666386);
        setField(term3760, term3760.getClass(), "in", term3762);
        setField(term3797, term3797.getClass(), "output", term3798);
        setField(term3797, term3797.getClass(), "inputs", term3800);
        setField(term3797, term3797.getClass(), "outputs", term3808);
        setField(term3797, term3797.getClass(), "type", enum25);
        setIntField(term3797, term3797.getClass(), "id", 11724947);
        setDoubleField(term3797, term3797.getClass(), "bias", 0.6375926466054153);
        setField(term3760, term3760.getClass(), "out", term3797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOut", argTypes, term3760, args);
    }

};


