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
     Object term3762;

    public AnnConnection_getOut_9830966033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3765 = new Double(0.5644914462415626);
        Object term3769 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3769, term3769.getClass(), "weight", 0.049786419821445604);
        setField(term3769, term3769.getClass(), "in", null);
        setField(term3769, term3769.getClass(), "out", null);
        Object term3771 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3771, term3771.getClass(), "weight", 0.8381176594884352);
        setField(term3771, term3771.getClass(), "in", null);
        setField(term3771, term3771.getClass(), "out", null);
        Object term3773 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3773, term3773.getClass(), "weight", 0.0);
        setField(term3773, term3773.getClass(), "in", null);
        setField(term3773, term3773.getClass(), "out", null);
        Object term3775 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3775, term3775.getClass(), "weight", 0.0);
        setField(term3775, term3775.getClass(), "in", null);
        setField(term3775, term3775.getClass(), "out", null);
        ArrayList term3767 = new ArrayList();
        ((ArrayList) term3767).add(term3769);
        ((ArrayList) term3767).add(term3771);
        ((ArrayList) term3767).add(term3773);
        ((ArrayList) term3767).add(term3771);
        ((ArrayList) term3767).add(term3775);
        Object term3781 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3781, term3781.getClass(), "weight", 0.0);
        setField(term3781, term3781.getClass(), "in", null);
        setField(term3781, term3781.getClass(), "out", null);
        Object term3783 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3783, term3783.getClass(), "weight", 0.8814078959581401);
        setField(term3783, term3783.getClass(), "in", null);
        setField(term3783, term3783.getClass(), "out", null);
        ArrayList term3779 = new ArrayList();
        ((ArrayList) term3779).add(term3775);
        ((ArrayList) term3779).add(term3781);
        ((ArrayList) term3779).add(term3762);
        ((ArrayList) term3779).add(term3762);
        ((ArrayList) term3779).add(term3783);
        ((ArrayList) term3779).add(term3769);
        ((ArrayList) term3779).add(term3775);
        ((ArrayList) term3779).add(term3769);
        Class<? extends Object> term3829 = Class.forName((String) "nn.neural.AnnType");
        Field term3828 = ((Class) term3829).getDeclaredField((String) "HIDDEN");
        ((Field) term3828).setAccessible(true);
        Object enum24 = ((Field) term3828).get((Object) null);
        Double term3800 = new Double(0.9628647861255637);
        Object term3804 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3804, term3804.getClass(), "weight", 0.0);
        setField(term3804, term3804.getClass(), "in", null);
        setField(term3804, term3804.getClass(), "out", null);
        Object term3806 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3806, term3806.getClass(), "weight", 0.0);
        setField(term3806, term3806.getClass(), "in", null);
        setField(term3806, term3806.getClass(), "out", null);
        ArrayList term3802 = new ArrayList();
        ((ArrayList) term3802).add(term3804);
        ((ArrayList) term3802).add(term3781);
        ((ArrayList) term3802).add(term3804);
        ((ArrayList) term3802).add(term3773);
        ((ArrayList) term3802).add(term3781);
        ((ArrayList) term3802).add(term3806);
        ((ArrayList) term3802).add(term3773);
        Object term3812 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3812, term3812.getClass(), "weight", 0.47210750955444725);
        setField(term3812, term3812.getClass(), "in", null);
        setField(term3812, term3812.getClass(), "out", null);
        ArrayList term3810 = new ArrayList();
        ((ArrayList) term3810).add(term3806);
        ((ArrayList) term3810).add(term3771);
        ((ArrayList) term3810).add(term3806);
        ((ArrayList) term3810).add(term3773);
        ((ArrayList) term3810).add(term3783);
        ((ArrayList) term3810).add(term3812);
        ((ArrayList) term3810).add(term3775);
        Class<? extends Object> term3939 = Class.forName((String) "nn.neural.AnnType");
        Field term3938 = ((Class) term3939).getDeclaredField((String) "OUTPUT");
        ((Field) term3938).setAccessible(true);
        Object enum25 = ((Field) term3938).get((Object) null);
        term3762 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term3764 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term3799 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term3762, term3762.getClass(), "weight", 0.281059649526194);
        setField(term3764, term3764.getClass(), "output", term3765);
        setField(term3764, term3764.getClass(), "inputs", term3767);
        setField(term3764, term3764.getClass(), "outputs", term3779);
        setField(term3764, term3764.getClass(), "type", enum24);
        setIntField(term3764, term3764.getClass(), "id", -227365013);
        setDoubleField(term3764, term3764.getClass(), "bias", 0.6221715730666386);
        setField(term3762, term3762.getClass(), "in", term3764);
        setField(term3799, term3799.getClass(), "output", term3800);
        setField(term3799, term3799.getClass(), "inputs", term3802);
        setField(term3799, term3799.getClass(), "outputs", term3810);
        setField(term3799, term3799.getClass(), "type", enum25);
        setIntField(term3799, term3799.getClass(), "id", 11724947);
        setDoubleField(term3799, term3799.getClass(), "bias", 0.6375926466054153);
        setField(term3762, term3762.getClass(), "out", term3799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOut", argTypes, term3762, args);
    }

};


