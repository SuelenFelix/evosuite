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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Connection_getIn_10015872661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312;

    public Connection_getIn_10015872661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term371 = Class.forName((String) "nn.model.Type");
        Field term370 = ((Class) term371).getDeclaredField((String) "SENSOR");
        ((Field) term370).setAccessible(true);
        Object enum2 = ((Field) term370).get((Object) null);
        Object term327 = newInstance(Class.forName("nn.model.Connection"));
        setField(term327, term327.getClass(), "in", null);
        setField(term327, term327.getClass(), "out", null);
        setFloatField(term327, term327.getClass(), "weight", 0.26441735F);
        setBooleanField(term327, term327.getClass(), "expressed", false);
        setIntField(term327, term327.getClass(), "innovation", -1968847291);
        Object term331 = newInstance(Class.forName("nn.model.Connection"));
        setField(term331, term331.getClass(), "in", null);
        setField(term331, term331.getClass(), "out", null);
        setFloatField(term331, term331.getClass(), "weight", 0.51832694F);
        setBooleanField(term331, term331.getClass(), "expressed", true);
        setIntField(term331, term331.getClass(), "innovation", -602026508);
        Object term335 = newInstance(Class.forName("nn.model.Connection"));
        setField(term335, term335.getClass(), "in", null);
        setField(term335, term335.getClass(), "out", null);
        setFloatField(term335, term335.getClass(), "weight", 0.0F);
        setBooleanField(term335, term335.getClass(), "expressed", false);
        setIntField(term335, term335.getClass(), "innovation", 0);
        ArrayList term325 = new ArrayList();
        ((ArrayList) term325).add(term327);
        ((ArrayList) term325).add(term327);
        ((ArrayList) term325).add(term331);
        ((ArrayList) term325).add(term331);
        ((ArrayList) term325).add(term335);
        Class<? extends Object> term461 = Class.forName((String) "nn.model.Type");
        Field term460 = ((Class) term461).getDeclaredField((String) "OUTPUT");
        ((Field) term460).setAccessible(true);
        Object enum3 = ((Field) term460).get((Object) null);
        Object term356 = newInstance(Class.forName("nn.model.Connection"));
        setField(term356, term356.getClass(), "in", null);
        setField(term356, term356.getClass(), "out", null);
        setFloatField(term356, term356.getClass(), "weight", 0.9985961F);
        setBooleanField(term356, term356.getClass(), "expressed", true);
        setIntField(term356, term356.getClass(), "innovation", 679763016);
        Object term360 = newInstance(Class.forName("nn.model.Connection"));
        setField(term360, term360.getClass(), "in", null);
        setField(term360, term360.getClass(), "out", null);
        setFloatField(term360, term360.getClass(), "weight", 0.0F);
        setBooleanField(term360, term360.getClass(), "expressed", false);
        setIntField(term360, term360.getClass(), "innovation", 0);
        ArrayList term354 = new ArrayList();
        ((ArrayList) term354).add(term356);
        ((ArrayList) term354).add(term360);
        term312 = newInstance(Class.forName("nn.model.Connection"));
        Object term313 = newInstance(Class.forName("nn.model.Node"));
        Object term342 = newInstance(Class.forName("nn.model.Node"));
        setField(term313, term313.getClass(), "type", enum2);
        setIntField(term313, term313.getClass(), "innovation", -226514366);
        setField(term313, term313.getClass(), "connections", term325);
        setDoubleField(term313, term313.getClass(), "bias", 0.4569171842750229);
        setField(term312, term312.getClass(), "in", term313);
        setField(term342, term342.getClass(), "type", enum3);
        setIntField(term342, term342.getClass(), "innovation", -817164822);
        setField(term342, term342.getClass(), "connections", term354);
        setDoubleField(term342, term342.getClass(), "bias", 0.6436713023569729);
        setField(term312, term312.getClass(), "out", term342);
        setFloatField(term312, term312.getClass(), "weight", 0.13745493F);
        setBooleanField(term312, term312.getClass(), "expressed", false);
        setIntField(term312, term312.getClass(), "innovation", 579005622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIn", argTypes, term312, args);
    }

};


