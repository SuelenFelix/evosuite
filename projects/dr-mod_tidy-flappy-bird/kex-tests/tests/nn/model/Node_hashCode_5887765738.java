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

public class Node_hashCode_5887765738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12371;

    public Node_hashCode_5887765738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12426 = Class.forName((String) "nn.model.Type");
        Field term12425 = ((Class) term12426).getDeclaredField((String) "OUTPUT");
        ((Field) term12425).setAccessible(true);
        Object enum81 = ((Field) term12425).get((Object) null);
        Object term12385 = newInstance(Class.forName("nn.model.Connection"));
        Object term12386 = newInstance(Class.forName("nn.model.Node"));
        Object term12389 = newInstance(Class.forName("nn.model.Node"));
        setField(term12386, term12386.getClass(), "type", enum81);
        setIntField(term12386, term12386.getClass(), "innovation", 1471031478);
        setField(term12386, term12386.getClass(), "connections", null);
        setDoubleField(term12386, term12386.getClass(), "bias", 0.20219858593718787);
        setField(term12385, term12385.getClass(), "in", term12386);
        setField(term12389, term12389.getClass(), "type", null);
        setIntField(term12389, term12389.getClass(), "innovation", 1989014880);
        setField(term12389, term12389.getClass(), "connections", null);
        setDoubleField(term12389, term12389.getClass(), "bias", 0.18636713236319624);
        setField(term12385, term12385.getClass(), "out", term12389);
        setFloatField(term12385, term12385.getClass(), "weight", 0.12337214F);
        setBooleanField(term12385, term12385.getClass(), "expressed", true);
        setIntField(term12385, term12385.getClass(), "innovation", -801175078);
        Object term12395 = newInstance(Class.forName("nn.model.Connection"));
        Object term12396 = newInstance(Class.forName("nn.model.Node"));
        Object term12399 = newInstance(Class.forName("nn.model.Node"));
        setField(term12396, term12396.getClass(), "type", enum81);
        setIntField(term12396, term12396.getClass(), "innovation", -334716487);
        setField(term12396, term12396.getClass(), "connections", null);
        setDoubleField(term12396, term12396.getClass(), "bias", 0.16581764143035682);
        setField(term12395, term12395.getClass(), "in", term12396);
        setField(term12399, term12399.getClass(), "type", null);
        setIntField(term12399, term12399.getClass(), "innovation", 0);
        setField(term12399, term12399.getClass(), "connections", null);
        setDoubleField(term12399, term12399.getClass(), "bias", 0.0);
        setField(term12395, term12395.getClass(), "out", term12399);
        setFloatField(term12395, term12395.getClass(), "weight", 0.05259031F);
        setBooleanField(term12395, term12395.getClass(), "expressed", true);
        setIntField(term12395, term12395.getClass(), "innovation", 950783153);
        Object term12405 = newInstance(Class.forName("nn.model.Connection"));
        Object term12406 = newInstance(Class.forName("nn.model.Node"));
        setField(term12406, term12406.getClass(), "type", null);
        setIntField(term12406, term12406.getClass(), "innovation", 0);
        setField(term12406, term12406.getClass(), "connections", null);
        setDoubleField(term12406, term12406.getClass(), "bias", 0.0);
        setField(term12405, term12405.getClass(), "in", term12406);
        setField(term12405, term12405.getClass(), "out", term12399);
        setFloatField(term12405, term12405.getClass(), "weight", 0.10126144F);
        setBooleanField(term12405, term12405.getClass(), "expressed", true);
        setIntField(term12405, term12405.getClass(), "innovation", 1818274550);
        Object term12412 = newInstance(Class.forName("nn.model.Connection"));
        Object term12413 = newInstance(Class.forName("nn.model.Node"));
        Object term12416 = newInstance(Class.forName("nn.model.Node"));
        setField(term12413, term12413.getClass(), "type", null);
        setIntField(term12413, term12413.getClass(), "innovation", 0);
        setField(term12413, term12413.getClass(), "connections", null);
        setDoubleField(term12413, term12413.getClass(), "bias", 0.0);
        setField(term12412, term12412.getClass(), "in", term12413);
        setField(term12416, term12416.getClass(), "type", null);
        setIntField(term12416, term12416.getClass(), "innovation", -1739012814);
        setField(term12416, term12416.getClass(), "connections", null);
        setDoubleField(term12416, term12416.getClass(), "bias", 0.8712455774005332);
        setField(term12412, term12412.getClass(), "out", term12416);
        setFloatField(term12412, term12412.getClass(), "weight", 0.5029736F);
        setBooleanField(term12412, term12412.getClass(), "expressed", false);
        setIntField(term12412, term12412.getClass(), "innovation", 2095699770);
        ArrayList term12383 = new ArrayList();
        ((ArrayList) term12383).add(term12385);
        ((ArrayList) term12383).add(term12395);
        ((ArrayList) term12383).add(term12405);
        ((ArrayList) term12383).add(term12405);
        ((ArrayList) term12383).add(term12412);
        term12371 = newInstance(Class.forName("nn.model.Node"));
        setField(term12371, term12371.getClass(), "type", enum81);
        setIntField(term12371, term12371.getClass(), "innovation", -1540486514);
        setField(term12371, term12371.getClass(), "connections", term12383);
        setDoubleField(term12371, term12371.getClass(), "bias", 0.0015033902879237893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12371, args);
    }

};


