package nn.model;

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
import static nn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Node_toString_10995362636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17739;

    public Node_toString_10995362636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17781 = Class.forName((String) "nn.model.Type");
        Field term17780 = ((Class) term17781).getDeclaredField((String) "SENSOR");
        ((Field) term17780).setAccessible(true);
        Object enum110 = ((Field) term17780).get((Object) null);
        Object term17753 = newInstance(Class.forName("nn.model.Connection"));
        Object term17754 = newInstance(Class.forName("nn.model.Node"));
        Object term17757 = newInstance(Class.forName("nn.model.Node"));
        setField(term17754, term17754.getClass(), "type", null);
        setIntField(term17754, term17754.getClass(), "innovation", 491497994);
        setField(term17754, term17754.getClass(), "connections", null);
        setDoubleField(term17754, term17754.getClass(), "bias", 0.16099540167443394);
        setField(term17753, term17753.getClass(), "in", term17754);
        setField(term17757, term17757.getClass(), "type", null);
        setIntField(term17757, term17757.getClass(), "innovation", 0);
        setField(term17757, term17757.getClass(), "connections", null);
        setDoubleField(term17757, term17757.getClass(), "bias", 0.0);
        setField(term17753, term17753.getClass(), "out", term17757);
        setFloatField(term17753, term17753.getClass(), "weight", 0.5959743F);
        setBooleanField(term17753, term17753.getClass(), "expressed", false);
        setIntField(term17753, term17753.getClass(), "innovation", -533202192);
        Object term17763 = newInstance(Class.forName("nn.model.Connection"));
        Object term17764 = newInstance(Class.forName("nn.model.Node"));
        setField(term17764, term17764.getClass(), "type", enum110);
        setIntField(term17764, term17764.getClass(), "innovation", 667778327);
        setField(term17764, term17764.getClass(), "connections", null);
        setDoubleField(term17764, term17764.getClass(), "bias", 0.8730095856413708);
        setField(term17763, term17763.getClass(), "in", term17764);
        setField(term17763, term17763.getClass(), "out", term17757);
        setFloatField(term17763, term17763.getClass(), "weight", 0.9262459F);
        setBooleanField(term17763, term17763.getClass(), "expressed", true);
        setIntField(term17763, term17763.getClass(), "innovation", -169463842);
        Object term17770 = newInstance(Class.forName("nn.model.Connection"));
        Object term17771 = newInstance(Class.forName("nn.model.Node"));
        setField(term17771, term17771.getClass(), "type", null);
        setIntField(term17771, term17771.getClass(), "innovation", -400280008);
        setField(term17771, term17771.getClass(), "connections", null);
        setDoubleField(term17771, term17771.getClass(), "bias", 0.9797763362008045);
        setField(term17770, term17770.getClass(), "in", term17771);
        setField(term17770, term17770.getClass(), "out", term17764);
        setFloatField(term17770, term17770.getClass(), "weight", 0.6530844F);
        setBooleanField(term17770, term17770.getClass(), "expressed", false);
        setIntField(term17770, term17770.getClass(), "innovation", 1415605360);
        ArrayList term17751 = new ArrayList();
        ((ArrayList) term17751).add(term17753);
        ((ArrayList) term17751).add(term17763);
        ((ArrayList) term17751).add(term17763);
        ((ArrayList) term17751).add(term17770);
        term17739 = newInstance(Class.forName("nn.model.Node"));
        setField(term17739, term17739.getClass(), "type", enum110);
        setIntField(term17739, term17739.getClass(), "innovation", 170509161);
        setField(term17739, term17739.getClass(), "connections", term17751);
        setDoubleField(term17739, term17739.getClass(), "bias", 0.0032031687815008425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17739, args);
    }

};


