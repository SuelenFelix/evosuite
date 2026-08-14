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
     Object term11965;

    public Node_getType_16420505854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12028 = Class.forName((String) "nn.model.Type");
        Field term12027 = ((Class) term12028).getDeclaredField((String) "HIDDEN");
        ((Field) term12027).setAccessible(true);
        Object enum78 = ((Field) term12027).get((Object) null);
        Object term11979 = newInstance(Class.forName("nn.model.Connection"));
        Object term11980 = newInstance(Class.forName("nn.model.Node"));
        Object term11983 = newInstance(Class.forName("nn.model.Node"));
        setField(term11980, term11980.getClass(), "type", null);
        setIntField(term11980, term11980.getClass(), "innovation", 1782011477);
        setField(term11980, term11980.getClass(), "connections", null);
        setDoubleField(term11980, term11980.getClass(), "bias", 0.08953548266482225);
        setField(term11979, term11979.getClass(), "in", term11980);
        setField(term11983, term11983.getClass(), "type", null);
        setIntField(term11983, term11983.getClass(), "innovation", 0);
        setField(term11983, term11983.getClass(), "connections", null);
        setDoubleField(term11983, term11983.getClass(), "bias", 0.0);
        setField(term11979, term11979.getClass(), "out", term11983);
        setFloatField(term11979, term11979.getClass(), "weight", 0.56460565F);
        setBooleanField(term11979, term11979.getClass(), "expressed", false);
        setIntField(term11979, term11979.getClass(), "innovation", -1111307978);
        Object term11989 = newInstance(Class.forName("nn.model.Connection"));
        Object term11990 = newInstance(Class.forName("nn.model.Node"));
        setField(term11989, term11989.getClass(), "in", term11983);
        setField(term11990, term11990.getClass(), "type", null);
        setIntField(term11990, term11990.getClass(), "innovation", 0);
        setField(term11990, term11990.getClass(), "connections", null);
        setDoubleField(term11990, term11990.getClass(), "bias", 0.0);
        setField(term11989, term11989.getClass(), "out", term11990);
        setFloatField(term11989, term11989.getClass(), "weight", 0.9997719F);
        setBooleanField(term11989, term11989.getClass(), "expressed", false);
        setIntField(term11989, term11989.getClass(), "innovation", -297957951);
        Object term11996 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11996, term11996.getClass(), "in", term11980);
        setField(term11996, term11996.getClass(), "out", term11980);
        setFloatField(term11996, term11996.getClass(), "weight", 0.594225F);
        setBooleanField(term11996, term11996.getClass(), "expressed", false);
        setIntField(term11996, term11996.getClass(), "innovation", -1298688401);
        Object term12000 = newInstance(Class.forName("nn.model.Connection"));
        Object term12001 = newInstance(Class.forName("nn.model.Node"));
        Object term12004 = newInstance(Class.forName("nn.model.Node"));
        setField(term12001, term12001.getClass(), "type", null);
        setIntField(term12001, term12001.getClass(), "innovation", 0);
        setField(term12001, term12001.getClass(), "connections", null);
        setDoubleField(term12001, term12001.getClass(), "bias", 0.0);
        setField(term12000, term12000.getClass(), "in", term12001);
        setField(term12004, term12004.getClass(), "type", null);
        setIntField(term12004, term12004.getClass(), "innovation", 0);
        setField(term12004, term12004.getClass(), "connections", null);
        setDoubleField(term12004, term12004.getClass(), "bias", 0.0);
        setField(term12000, term12000.getClass(), "out", term12004);
        setFloatField(term12000, term12000.getClass(), "weight", 0.925983F);
        setBooleanField(term12000, term12000.getClass(), "expressed", true);
        setIntField(term12000, term12000.getClass(), "innovation", 575249858);
        Object term12010 = newInstance(Class.forName("nn.model.Connection"));
        Object term12011 = newInstance(Class.forName("nn.model.Node"));
        setField(term12011, term12011.getClass(), "type", null);
        setIntField(term12011, term12011.getClass(), "innovation", 2129957018);
        setField(term12011, term12011.getClass(), "connections", null);
        setDoubleField(term12011, term12011.getClass(), "bias", 0.44610818581404355);
        setField(term12010, term12010.getClass(), "in", term12011);
        setField(term12010, term12010.getClass(), "out", term12011);
        setFloatField(term12010, term12010.getClass(), "weight", 0.77058387F);
        setBooleanField(term12010, term12010.getClass(), "expressed", false);
        setIntField(term12010, term12010.getClass(), "innovation", 1953620444);
        Object term12017 = newInstance(Class.forName("nn.model.Connection"));
        Object term12018 = newInstance(Class.forName("nn.model.Node"));
        setField(term12018, term12018.getClass(), "type", null);
        setIntField(term12018, term12018.getClass(), "innovation", 0);
        setField(term12018, term12018.getClass(), "connections", null);
        setDoubleField(term12018, term12018.getClass(), "bias", 0.0);
        setField(term12017, term12017.getClass(), "in", term12018);
        setField(term12017, term12017.getClass(), "out", term11983);
        setFloatField(term12017, term12017.getClass(), "weight", 0.6688843F);
        setBooleanField(term12017, term12017.getClass(), "expressed", false);
        setIntField(term12017, term12017.getClass(), "innovation", -1816920588);
        ArrayList term11977 = new ArrayList();
        ((ArrayList) term11977).add(term11979);
        ((ArrayList) term11977).add(term11989);
        ((ArrayList) term11977).add(term11989);
        ((ArrayList) term11977).add(term11996);
        ((ArrayList) term11977).add(term12000);
        ((ArrayList) term11977).add(term12010);
        ((ArrayList) term11977).add(term12017);
        term11965 = newInstance(Class.forName("nn.model.Node"));
        setField(term11965, term11965.getClass(), "type", enum78);
        setIntField(term11965, term11965.getClass(), "innovation", -2065157320);
        setField(term11965, term11965.getClass(), "connections", term11977);
        setDoubleField(term11965, term11965.getClass(), "bias", 0.5019274780721351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term11965, args);
    }

};


