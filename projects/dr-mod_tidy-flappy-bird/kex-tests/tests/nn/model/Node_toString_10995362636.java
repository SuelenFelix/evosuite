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
     Object term17723;

    public Node_toString_10995362636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17765 = Class.forName((String) "nn.model.Type");
        Field term17764 = ((Class) term17765).getDeclaredField((String) "SENSOR");
        ((Field) term17764).setAccessible(true);
        Object enum110 = ((Field) term17764).get((Object) null);
        Object term17737 = newInstance(Class.forName("nn.model.Connection"));
        Object term17738 = newInstance(Class.forName("nn.model.Node"));
        Object term17741 = newInstance(Class.forName("nn.model.Node"));
        setField(term17738, term17738.getClass(), "type", null);
        setIntField(term17738, term17738.getClass(), "innovation", 491497994);
        setField(term17738, term17738.getClass(), "connections", null);
        setDoubleField(term17738, term17738.getClass(), "bias", 0.16099540167443394);
        setField(term17737, term17737.getClass(), "in", term17738);
        setField(term17741, term17741.getClass(), "type", null);
        setIntField(term17741, term17741.getClass(), "innovation", 0);
        setField(term17741, term17741.getClass(), "connections", null);
        setDoubleField(term17741, term17741.getClass(), "bias", 0.0);
        setField(term17737, term17737.getClass(), "out", term17741);
        setFloatField(term17737, term17737.getClass(), "weight", 0.5959743F);
        setBooleanField(term17737, term17737.getClass(), "expressed", false);
        setIntField(term17737, term17737.getClass(), "innovation", -533202192);
        Object term17747 = newInstance(Class.forName("nn.model.Connection"));
        Object term17748 = newInstance(Class.forName("nn.model.Node"));
        setField(term17748, term17748.getClass(), "type", enum110);
        setIntField(term17748, term17748.getClass(), "innovation", 667778327);
        setField(term17748, term17748.getClass(), "connections", null);
        setDoubleField(term17748, term17748.getClass(), "bias", 0.8730095856413708);
        setField(term17747, term17747.getClass(), "in", term17748);
        setField(term17747, term17747.getClass(), "out", term17741);
        setFloatField(term17747, term17747.getClass(), "weight", 0.9262459F);
        setBooleanField(term17747, term17747.getClass(), "expressed", true);
        setIntField(term17747, term17747.getClass(), "innovation", -169463842);
        Object term17754 = newInstance(Class.forName("nn.model.Connection"));
        Object term17755 = newInstance(Class.forName("nn.model.Node"));
        setField(term17755, term17755.getClass(), "type", null);
        setIntField(term17755, term17755.getClass(), "innovation", -400280008);
        setField(term17755, term17755.getClass(), "connections", null);
        setDoubleField(term17755, term17755.getClass(), "bias", 0.9797763362008045);
        setField(term17754, term17754.getClass(), "in", term17755);
        setField(term17754, term17754.getClass(), "out", term17748);
        setFloatField(term17754, term17754.getClass(), "weight", 0.6530844F);
        setBooleanField(term17754, term17754.getClass(), "expressed", false);
        setIntField(term17754, term17754.getClass(), "innovation", 1415605360);
        ArrayList term17735 = new ArrayList();
        ((ArrayList) term17735).add(term17737);
        ((ArrayList) term17735).add(term17747);
        ((ArrayList) term17735).add(term17747);
        ((ArrayList) term17735).add(term17754);
        term17723 = newInstance(Class.forName("nn.model.Node"));
        setField(term17723, term17723.getClass(), "type", enum110);
        setIntField(term17723, term17723.getClass(), "innovation", 170509161);
        setField(term17723, term17723.getClass(), "connections", term17735);
        setDoubleField(term17723, term17723.getClass(), "bias", 0.0032031687815008425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17723, args);
    }

};


