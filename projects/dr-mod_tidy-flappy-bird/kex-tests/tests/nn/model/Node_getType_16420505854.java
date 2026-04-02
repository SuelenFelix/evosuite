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

public class Node_getType_16420505854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11953;

    public Node_getType_16420505854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12016 = Class.forName((String) "nn.model.Type");
        Field term12015 = ((Class) term12016).getDeclaredField((String) "HIDDEN");
        ((Field) term12015).setAccessible(true);
        Object enum78 = ((Field) term12015).get((Object) null);
        Object term11967 = newInstance(Class.forName("nn.model.Connection"));
        Object term11968 = newInstance(Class.forName("nn.model.Node"));
        Object term11971 = newInstance(Class.forName("nn.model.Node"));
        setField(term11968, term11968.getClass(), "type", null);
        setIntField(term11968, term11968.getClass(), "innovation", 1782011477);
        setField(term11968, term11968.getClass(), "connections", null);
        setDoubleField(term11968, term11968.getClass(), "bias", 0.08953548266482225);
        setField(term11967, term11967.getClass(), "in", term11968);
        setField(term11971, term11971.getClass(), "type", null);
        setIntField(term11971, term11971.getClass(), "innovation", 0);
        setField(term11971, term11971.getClass(), "connections", null);
        setDoubleField(term11971, term11971.getClass(), "bias", 0.0);
        setField(term11967, term11967.getClass(), "out", term11971);
        setFloatField(term11967, term11967.getClass(), "weight", 0.56460565F);
        setBooleanField(term11967, term11967.getClass(), "expressed", false);
        setIntField(term11967, term11967.getClass(), "innovation", -1111307978);
        Object term11977 = newInstance(Class.forName("nn.model.Connection"));
        Object term11978 = newInstance(Class.forName("nn.model.Node"));
        setField(term11977, term11977.getClass(), "in", term11971);
        setField(term11978, term11978.getClass(), "type", null);
        setIntField(term11978, term11978.getClass(), "innovation", 0);
        setField(term11978, term11978.getClass(), "connections", null);
        setDoubleField(term11978, term11978.getClass(), "bias", 0.0);
        setField(term11977, term11977.getClass(), "out", term11978);
        setFloatField(term11977, term11977.getClass(), "weight", 0.9997719F);
        setBooleanField(term11977, term11977.getClass(), "expressed", false);
        setIntField(term11977, term11977.getClass(), "innovation", -297957951);
        Object term11984 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11984, term11984.getClass(), "in", term11968);
        setField(term11984, term11984.getClass(), "out", term11968);
        setFloatField(term11984, term11984.getClass(), "weight", 0.594225F);
        setBooleanField(term11984, term11984.getClass(), "expressed", false);
        setIntField(term11984, term11984.getClass(), "innovation", -1298688401);
        Object term11988 = newInstance(Class.forName("nn.model.Connection"));
        Object term11989 = newInstance(Class.forName("nn.model.Node"));
        Object term11992 = newInstance(Class.forName("nn.model.Node"));
        setField(term11989, term11989.getClass(), "type", null);
        setIntField(term11989, term11989.getClass(), "innovation", 0);
        setField(term11989, term11989.getClass(), "connections", null);
        setDoubleField(term11989, term11989.getClass(), "bias", 0.0);
        setField(term11988, term11988.getClass(), "in", term11989);
        setField(term11992, term11992.getClass(), "type", null);
        setIntField(term11992, term11992.getClass(), "innovation", 0);
        setField(term11992, term11992.getClass(), "connections", null);
        setDoubleField(term11992, term11992.getClass(), "bias", 0.0);
        setField(term11988, term11988.getClass(), "out", term11992);
        setFloatField(term11988, term11988.getClass(), "weight", 0.925983F);
        setBooleanField(term11988, term11988.getClass(), "expressed", true);
        setIntField(term11988, term11988.getClass(), "innovation", 575249858);
        Object term11998 = newInstance(Class.forName("nn.model.Connection"));
        Object term11999 = newInstance(Class.forName("nn.model.Node"));
        setField(term11999, term11999.getClass(), "type", null);
        setIntField(term11999, term11999.getClass(), "innovation", 2129957018);
        setField(term11999, term11999.getClass(), "connections", null);
        setDoubleField(term11999, term11999.getClass(), "bias", 0.44610818581404355);
        setField(term11998, term11998.getClass(), "in", term11999);
        setField(term11998, term11998.getClass(), "out", term11999);
        setFloatField(term11998, term11998.getClass(), "weight", 0.77058387F);
        setBooleanField(term11998, term11998.getClass(), "expressed", false);
        setIntField(term11998, term11998.getClass(), "innovation", 1953620444);
        Object term12005 = newInstance(Class.forName("nn.model.Connection"));
        Object term12006 = newInstance(Class.forName("nn.model.Node"));
        setField(term12006, term12006.getClass(), "type", null);
        setIntField(term12006, term12006.getClass(), "innovation", 0);
        setField(term12006, term12006.getClass(), "connections", null);
        setDoubleField(term12006, term12006.getClass(), "bias", 0.0);
        setField(term12005, term12005.getClass(), "in", term12006);
        setField(term12005, term12005.getClass(), "out", term11971);
        setFloatField(term12005, term12005.getClass(), "weight", 0.6688843F);
        setBooleanField(term12005, term12005.getClass(), "expressed", false);
        setIntField(term12005, term12005.getClass(), "innovation", -1816920588);
        ArrayList term11965 = new ArrayList();
        ((ArrayList) term11965).add(term11967);
        ((ArrayList) term11965).add(term11977);
        ((ArrayList) term11965).add(term11977);
        ((ArrayList) term11965).add(term11984);
        ((ArrayList) term11965).add(term11988);
        ((ArrayList) term11965).add(term11998);
        ((ArrayList) term11965).add(term12005);
        term11953 = newInstance(Class.forName("nn.model.Node"));
        setField(term11953, term11953.getClass(), "type", enum78);
        setIntField(term11953, term11953.getClass(), "innovation", -2065157320);
        setField(term11953, term11953.getClass(), "connections", term11965);
        setDoubleField(term11953, term11953.getClass(), "bias", 0.5019274780721351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term11953, args);
    }

};


