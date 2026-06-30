package nn.actions;

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
import static nn.actions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class GenomeDiff_init_8972387760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term61;

    public GenomeDiff_init_8972387760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term95 = Class.forName((String) "nn.model.Type");
        Field term94 = ((Class) term95).getDeclaredField((String) "HIDDEN");
        ((Field) term94).setAccessible(true);
        Object enum0 = ((Field) term94).get((Object) null);
        ArrayList term9 = new ArrayList();
        ((ArrayList) term9).add((Object)null);
        ((ArrayList) term9).add((Object)null);
        ((ArrayList) term9).add((Object)null);
        ((ArrayList) term9).add((Object)null);
        ((ArrayList) term9).add((Object)null);
        ((ArrayList) term9).add((Object)null);
        ((ArrayList) term9).add((Object)null);
        ((ArrayList) term9).add((Object)null);
        ((ArrayList) term9).add((Object)null);
        Class<? extends Object> term185 = Class.forName((String) "nn.model.Type");
        Field term184 = ((Class) term185).getDeclaredField((String) "SENSOR");
        ((Field) term184).setAccessible(true);
        Object enum1 = ((Field) term184).get((Object) null);
        ArrayList term17 = new ArrayList();
        ((ArrayList) term17).add((Object)null);
        ((ArrayList) term17).add((Object)null);
        ((ArrayList) term17).add((Object)null);
        Object term4 = newInstance(Class.forName("nn.model.Connection"));
        Object term5 = newInstance(Class.forName("nn.model.Node"));
        Object term13 = newInstance(Class.forName("nn.model.Node"));
        setField(term5, term5.getClass(), "type", enum0);
        setIntField(term5, term5.getClass(), "innovation", 568599855);
        setField(term5, term5.getClass(), "connections", term9);
        setDoubleField(term5, term5.getClass(), "bias", 0.6076495596892013);
        setField(term4, term4.getClass(), "in", term5);
        setField(term13, term13.getClass(), "type", enum1);
        setIntField(term13, term13.getClass(), "innovation", -883034806);
        setField(term13, term13.getClass(), "connections", term17);
        setDoubleField(term13, term13.getClass(), "bias", 0.37773193782763337);
        setField(term4, term4.getClass(), "out", term13);
        setFloatField(term4, term4.getClass(), "weight", 0.5523636F);
        setBooleanField(term4, term4.getClass(), "expressed", true);
        setIntField(term4, term4.getClass(), "innovation", 1585847225);
        Object term25 = newInstance(Class.forName("nn.model.Connection"));
        Object term26 = newInstance(Class.forName("nn.model.Node"));
        Object term29 = newInstance(Class.forName("nn.model.Node"));
        setField(term26, term26.getClass(), "type", enum0);
        setIntField(term26, term26.getClass(), "innovation", 597278769);
        setField(term26, term26.getClass(), "connections", null);
        setDoubleField(term26, term26.getClass(), "bias", 0.6436713023569729);
        setField(term25, term25.getClass(), "in", term26);
        setField(term29, term29.getClass(), "type", enum0);
        setIntField(term29, term29.getClass(), "innovation", -1275173084);
        setField(term29, term29.getClass(), "connections", null);
        setDoubleField(term29, term29.getClass(), "bias", 0.7332741045694002);
        setField(term25, term25.getClass(), "out", term29);
        setFloatField(term25, term25.getClass(), "weight", 0.6880585F);
        setBooleanField(term25, term25.getClass(), "expressed", true);
        setIntField(term25, term25.getClass(), "innovation", -244121226);
        Object term36 = newInstance(Class.forName("nn.model.Connection"));
        setField(term36, term36.getClass(), "in", null);
        setField(term36, term36.getClass(), "out", null);
        setFloatField(term36, term36.getClass(), "weight", 0.13906479F);
        setBooleanField(term36, term36.getClass(), "expressed", false);
        setIntField(term36, term36.getClass(), "innovation", -817164822);
        term1 = new LinkedList();
        ((LinkedList) term1).add(term4);
        ((LinkedList) term1).add(term25);
        ((LinkedList) term1).add(term36);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        term61 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.GenomeDiff");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term61;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


