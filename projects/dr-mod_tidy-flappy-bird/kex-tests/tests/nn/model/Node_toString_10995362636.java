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
     Object term17733;

    public Node_toString_10995362636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17775 = Class.forName((String) "nn.model.Type");
        Field term17774 = ((Class) term17775).getDeclaredField((String) "SENSOR");
        ((Field) term17774).setAccessible(true);
        Object enum110 = ((Field) term17774).get((Object) null);
        Object term17747 = newInstance(Class.forName("nn.model.Connection"));
        Object term17748 = newInstance(Class.forName("nn.model.Node"));
        Object term17751 = newInstance(Class.forName("nn.model.Node"));
        setField(term17748, term17748.getClass(), "type", null);
        setIntField(term17748, term17748.getClass(), "innovation", 491497994);
        setField(term17748, term17748.getClass(), "connections", null);
        setDoubleField(term17748, term17748.getClass(), "bias", 0.16099540167443394);
        setField(term17747, term17747.getClass(), "in", term17748);
        setField(term17751, term17751.getClass(), "type", null);
        setIntField(term17751, term17751.getClass(), "innovation", 0);
        setField(term17751, term17751.getClass(), "connections", null);
        setDoubleField(term17751, term17751.getClass(), "bias", 0.0);
        setField(term17747, term17747.getClass(), "out", term17751);
        setFloatField(term17747, term17747.getClass(), "weight", 0.5959743F);
        setBooleanField(term17747, term17747.getClass(), "expressed", false);
        setIntField(term17747, term17747.getClass(), "innovation", -533202192);
        Object term17757 = newInstance(Class.forName("nn.model.Connection"));
        Object term17758 = newInstance(Class.forName("nn.model.Node"));
        setField(term17758, term17758.getClass(), "type", enum110);
        setIntField(term17758, term17758.getClass(), "innovation", 667778327);
        setField(term17758, term17758.getClass(), "connections", null);
        setDoubleField(term17758, term17758.getClass(), "bias", 0.8730095856413708);
        setField(term17757, term17757.getClass(), "in", term17758);
        setField(term17757, term17757.getClass(), "out", term17751);
        setFloatField(term17757, term17757.getClass(), "weight", 0.9262459F);
        setBooleanField(term17757, term17757.getClass(), "expressed", true);
        setIntField(term17757, term17757.getClass(), "innovation", -169463842);
        Object term17764 = newInstance(Class.forName("nn.model.Connection"));
        Object term17765 = newInstance(Class.forName("nn.model.Node"));
        setField(term17765, term17765.getClass(), "type", null);
        setIntField(term17765, term17765.getClass(), "innovation", -400280008);
        setField(term17765, term17765.getClass(), "connections", null);
        setDoubleField(term17765, term17765.getClass(), "bias", 0.9797763362008045);
        setField(term17764, term17764.getClass(), "in", term17765);
        setField(term17764, term17764.getClass(), "out", term17758);
        setFloatField(term17764, term17764.getClass(), "weight", 0.6530844F);
        setBooleanField(term17764, term17764.getClass(), "expressed", false);
        setIntField(term17764, term17764.getClass(), "innovation", 1415605360);
        ArrayList term17745 = new ArrayList();
        ((ArrayList) term17745).add(term17747);
        ((ArrayList) term17745).add(term17757);
        ((ArrayList) term17745).add(term17757);
        ((ArrayList) term17745).add(term17764);
        term17733 = newInstance(Class.forName("nn.model.Node"));
        setField(term17733, term17733.getClass(), "type", enum110);
        setIntField(term17733, term17733.getClass(), "innovation", 170509161);
        setField(term17733, term17733.getClass(), "connections", term17745);
        setDoubleField(term17733, term17733.getClass(), "bias", 0.0032031687815008425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17733, args);
    }

};


