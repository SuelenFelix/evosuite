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
     Object term3764;

    public AnnConnection_getOut_9830966033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3767 = new Double(0.5644914462415626);
        Object term3771 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3771, term3771.getClass(), "weight", 0.049786419821445604);
        setField(term3771, term3771.getClass(), "in", null);
        setField(term3771, term3771.getClass(), "out", null);
        Object term3773 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3773, term3773.getClass(), "weight", 0.8381176594884352);
        setField(term3773, term3773.getClass(), "in", null);
        setField(term3773, term3773.getClass(), "out", null);
        Object term3775 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3775, term3775.getClass(), "weight", 0.0);
        setField(term3775, term3775.getClass(), "in", null);
        setField(term3775, term3775.getClass(), "out", null);
        Object term3777 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3777, term3777.getClass(), "weight", 0.0);
        setField(term3777, term3777.getClass(), "in", null);
        setField(term3777, term3777.getClass(), "out", null);
        ArrayList term3769 = new ArrayList();
        ((ArrayList) term3769).add(term3771);
        ((ArrayList) term3769).add(term3773);
        ((ArrayList) term3769).add(term3775);
        ((ArrayList) term3769).add(term3773);
        ((ArrayList) term3769).add(term3777);
        Object term3783 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3783, term3783.getClass(), "weight", 0.0);
        setField(term3783, term3783.getClass(), "in", null);
        setField(term3783, term3783.getClass(), "out", null);
        Object term3785 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3785, term3785.getClass(), "weight", 0.8814078959581401);
        setField(term3785, term3785.getClass(), "in", null);
        setField(term3785, term3785.getClass(), "out", null);
        ArrayList term3781 = new ArrayList();
        ((ArrayList) term3781).add(term3777);
        ((ArrayList) term3781).add(term3783);
        ((ArrayList) term3781).add(term3764);
        ((ArrayList) term3781).add(term3764);
        ((ArrayList) term3781).add(term3785);
        ((ArrayList) term3781).add(term3771);
        ((ArrayList) term3781).add(term3777);
        ((ArrayList) term3781).add(term3771);
        Class<? extends Object> term3831 = Class.forName((String) "nn.neural.AnnType");
        Field term3830 = ((Class) term3831).getDeclaredField((String) "HIDDEN");
        ((Field) term3830).setAccessible(true);
        Object enum24 = ((Field) term3830).get((Object) null);
        Double term3802 = new Double(0.9628647861255637);
        Object term3806 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3806, term3806.getClass(), "weight", 0.0);
        setField(term3806, term3806.getClass(), "in", null);
        setField(term3806, term3806.getClass(), "out", null);
        Object term3808 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3808, term3808.getClass(), "weight", 0.0);
        setField(term3808, term3808.getClass(), "in", null);
        setField(term3808, term3808.getClass(), "out", null);
        ArrayList term3804 = new ArrayList();
        ((ArrayList) term3804).add(term3806);
        ((ArrayList) term3804).add(term3783);
        ((ArrayList) term3804).add(term3806);
        ((ArrayList) term3804).add(term3775);
        ((ArrayList) term3804).add(term3783);
        ((ArrayList) term3804).add(term3808);
        ((ArrayList) term3804).add(term3775);
        Object term3814 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3814, term3814.getClass(), "weight", 0.47210750955444725);
        setField(term3814, term3814.getClass(), "in", null);
        setField(term3814, term3814.getClass(), "out", null);
        ArrayList term3812 = new ArrayList();
        ((ArrayList) term3812).add(term3808);
        ((ArrayList) term3812).add(term3773);
        ((ArrayList) term3812).add(term3808);
        ((ArrayList) term3812).add(term3775);
        ((ArrayList) term3812).add(term3785);
        ((ArrayList) term3812).add(term3814);
        ((ArrayList) term3812).add(term3777);
        Class<? extends Object> term3941 = Class.forName((String) "nn.neural.AnnType");
        Field term3940 = ((Class) term3941).getDeclaredField((String) "OUTPUT");
        ((Field) term3940).setAccessible(true);
        Object enum25 = ((Field) term3940).get((Object) null);
        term3764 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term3766 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term3801 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term3764, term3764.getClass(), "weight", 0.281059649526194);
        setField(term3766, term3766.getClass(), "output", term3767);
        setField(term3766, term3766.getClass(), "inputs", term3769);
        setField(term3766, term3766.getClass(), "outputs", term3781);
        setField(term3766, term3766.getClass(), "type", enum24);
        setIntField(term3766, term3766.getClass(), "id", -227365013);
        setDoubleField(term3766, term3766.getClass(), "bias", 0.6221715730666386);
        setField(term3764, term3764.getClass(), "in", term3766);
        setField(term3801, term3801.getClass(), "output", term3802);
        setField(term3801, term3801.getClass(), "inputs", term3804);
        setField(term3801, term3801.getClass(), "outputs", term3812);
        setField(term3801, term3801.getClass(), "type", enum25);
        setIntField(term3801, term3801.getClass(), "id", 11724947);
        setDoubleField(term3801, term3801.getClass(), "bias", 0.6375926466054153);
        setField(term3764, term3764.getClass(), "out", term3801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOut", argTypes, term3764, args);
    }

};


