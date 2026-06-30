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
     Object term11968;

    public Node_getType_16420505854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12031 = Class.forName((String) "nn.model.Type");
        Field term12030 = ((Class) term12031).getDeclaredField((String) "HIDDEN");
        ((Field) term12030).setAccessible(true);
        Object enum78 = ((Field) term12030).get((Object) null);
        Object term11982 = newInstance(Class.forName("nn.model.Connection"));
        Object term11983 = newInstance(Class.forName("nn.model.Node"));
        Object term11986 = newInstance(Class.forName("nn.model.Node"));
        setField(term11983, term11983.getClass(), "type", null);
        setIntField(term11983, term11983.getClass(), "innovation", 1782011477);
        setField(term11983, term11983.getClass(), "connections", null);
        setDoubleField(term11983, term11983.getClass(), "bias", 0.08953548266482225);
        setField(term11982, term11982.getClass(), "in", term11983);
        setField(term11986, term11986.getClass(), "type", null);
        setIntField(term11986, term11986.getClass(), "innovation", 0);
        setField(term11986, term11986.getClass(), "connections", null);
        setDoubleField(term11986, term11986.getClass(), "bias", 0.0);
        setField(term11982, term11982.getClass(), "out", term11986);
        setFloatField(term11982, term11982.getClass(), "weight", 0.56460565F);
        setBooleanField(term11982, term11982.getClass(), "expressed", false);
        setIntField(term11982, term11982.getClass(), "innovation", -1111307978);
        Object term11992 = newInstance(Class.forName("nn.model.Connection"));
        Object term11993 = newInstance(Class.forName("nn.model.Node"));
        setField(term11992, term11992.getClass(), "in", term11986);
        setField(term11993, term11993.getClass(), "type", null);
        setIntField(term11993, term11993.getClass(), "innovation", 0);
        setField(term11993, term11993.getClass(), "connections", null);
        setDoubleField(term11993, term11993.getClass(), "bias", 0.0);
        setField(term11992, term11992.getClass(), "out", term11993);
        setFloatField(term11992, term11992.getClass(), "weight", 0.9997719F);
        setBooleanField(term11992, term11992.getClass(), "expressed", false);
        setIntField(term11992, term11992.getClass(), "innovation", -297957951);
        Object term11999 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11999, term11999.getClass(), "in", term11983);
        setField(term11999, term11999.getClass(), "out", term11983);
        setFloatField(term11999, term11999.getClass(), "weight", 0.594225F);
        setBooleanField(term11999, term11999.getClass(), "expressed", false);
        setIntField(term11999, term11999.getClass(), "innovation", -1298688401);
        Object term12003 = newInstance(Class.forName("nn.model.Connection"));
        Object term12004 = newInstance(Class.forName("nn.model.Node"));
        Object term12007 = newInstance(Class.forName("nn.model.Node"));
        setField(term12004, term12004.getClass(), "type", null);
        setIntField(term12004, term12004.getClass(), "innovation", 0);
        setField(term12004, term12004.getClass(), "connections", null);
        setDoubleField(term12004, term12004.getClass(), "bias", 0.0);
        setField(term12003, term12003.getClass(), "in", term12004);
        setField(term12007, term12007.getClass(), "type", null);
        setIntField(term12007, term12007.getClass(), "innovation", 0);
        setField(term12007, term12007.getClass(), "connections", null);
        setDoubleField(term12007, term12007.getClass(), "bias", 0.0);
        setField(term12003, term12003.getClass(), "out", term12007);
        setFloatField(term12003, term12003.getClass(), "weight", 0.925983F);
        setBooleanField(term12003, term12003.getClass(), "expressed", true);
        setIntField(term12003, term12003.getClass(), "innovation", 575249858);
        Object term12013 = newInstance(Class.forName("nn.model.Connection"));
        Object term12014 = newInstance(Class.forName("nn.model.Node"));
        setField(term12014, term12014.getClass(), "type", null);
        setIntField(term12014, term12014.getClass(), "innovation", 2129957018);
        setField(term12014, term12014.getClass(), "connections", null);
        setDoubleField(term12014, term12014.getClass(), "bias", 0.44610818581404355);
        setField(term12013, term12013.getClass(), "in", term12014);
        setField(term12013, term12013.getClass(), "out", term12014);
        setFloatField(term12013, term12013.getClass(), "weight", 0.77058387F);
        setBooleanField(term12013, term12013.getClass(), "expressed", false);
        setIntField(term12013, term12013.getClass(), "innovation", 1953620444);
        Object term12020 = newInstance(Class.forName("nn.model.Connection"));
        Object term12021 = newInstance(Class.forName("nn.model.Node"));
        setField(term12021, term12021.getClass(), "type", null);
        setIntField(term12021, term12021.getClass(), "innovation", 0);
        setField(term12021, term12021.getClass(), "connections", null);
        setDoubleField(term12021, term12021.getClass(), "bias", 0.0);
        setField(term12020, term12020.getClass(), "in", term12021);
        setField(term12020, term12020.getClass(), "out", term11986);
        setFloatField(term12020, term12020.getClass(), "weight", 0.6688843F);
        setBooleanField(term12020, term12020.getClass(), "expressed", false);
        setIntField(term12020, term12020.getClass(), "innovation", -1816920588);
        ArrayList term11980 = new ArrayList();
        ((ArrayList) term11980).add(term11982);
        ((ArrayList) term11980).add(term11992);
        ((ArrayList) term11980).add(term11992);
        ((ArrayList) term11980).add(term11999);
        ((ArrayList) term11980).add(term12003);
        ((ArrayList) term11980).add(term12013);
        ((ArrayList) term11980).add(term12020);
        term11968 = newInstance(Class.forName("nn.model.Node"));
        setField(term11968, term11968.getClass(), "type", enum78);
        setIntField(term11968, term11968.getClass(), "innovation", -2065157320);
        setField(term11968, term11968.getClass(), "connections", term11980);
        setDoubleField(term11968, term11968.getClass(), "bias", 0.5019274780721351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term11968, args);
    }

};


