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

public class Node_addConnection_3214596702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11422;
     Object term11466;

    public Node_addConnection_3214596702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11507 = Class.forName((String) "nn.model.Type");
        Field term11506 = ((Class) term11507).getDeclaredField((String) "SENSOR");
        ((Field) term11506).setAccessible(true);
        Object enum74 = ((Field) term11506).get((Object) null);
        Object term11436 = newInstance(Class.forName("nn.model.Connection"));
        Object term11437 = newInstance(Class.forName("nn.model.Node"));
        Object term11440 = newInstance(Class.forName("nn.model.Node"));
        setField(term11437, term11437.getClass(), "type", null);
        setIntField(term11437, term11437.getClass(), "innovation", 1486351894);
        setField(term11437, term11437.getClass(), "connections", null);
        setDoubleField(term11437, term11437.getClass(), "bias", 0.2030931676384783);
        setField(term11436, term11436.getClass(), "in", term11437);
        setField(term11440, term11440.getClass(), "type", null);
        setIntField(term11440, term11440.getClass(), "innovation", -1477091217);
        setField(term11440, term11440.getClass(), "connections", null);
        setDoubleField(term11440, term11440.getClass(), "bias", 0.4586817610515208);
        setField(term11436, term11436.getClass(), "out", term11440);
        setFloatField(term11436, term11436.getClass(), "weight", 0.18721223F);
        setBooleanField(term11436, term11436.getClass(), "expressed", true);
        setIntField(term11436, term11436.getClass(), "innovation", -1908164516);
        Object term11446 = newInstance(Class.forName("nn.model.Connection"));
        Object term11447 = newInstance(Class.forName("nn.model.Node"));
        setField(term11447, term11447.getClass(), "type", enum74);
        setIntField(term11447, term11447.getClass(), "innovation", -1020664075);
        setField(term11447, term11447.getClass(), "connections", null);
        setDoubleField(term11447, term11447.getClass(), "bias", 0.16703018107140954);
        setField(term11446, term11446.getClass(), "in", term11447);
        setField(term11446, term11446.getClass(), "out", term11440);
        setFloatField(term11446, term11446.getClass(), "weight", 0.70041996F);
        setBooleanField(term11446, term11446.getClass(), "expressed", true);
        setIntField(term11446, term11446.getClass(), "innovation", 459471826);
        Object term11453 = newInstance(Class.forName("nn.model.Connection"));
        Object term11454 = newInstance(Class.forName("nn.model.Node"));
        Object term11457 = newInstance(Class.forName("nn.model.Node"));
        setField(term11454, term11454.getClass(), "type", null);
        setIntField(term11454, term11454.getClass(), "innovation", 0);
        setField(term11454, term11454.getClass(), "connections", null);
        setDoubleField(term11454, term11454.getClass(), "bias", 0.0);
        setField(term11453, term11453.getClass(), "in", term11454);
        setField(term11457, term11457.getClass(), "type", null);
        setIntField(term11457, term11457.getClass(), "innovation", 0);
        setField(term11457, term11457.getClass(), "connections", null);
        setDoubleField(term11457, term11457.getClass(), "bias", 0.0);
        setField(term11453, term11453.getClass(), "out", term11457);
        setFloatField(term11453, term11453.getClass(), "weight", 0.13699532F);
        setBooleanField(term11453, term11453.getClass(), "expressed", false);
        setIntField(term11453, term11453.getClass(), "innovation", -1412100145);
        ArrayList term11434 = new ArrayList();
        ((ArrayList) term11434).add(term11436);
        ((ArrayList) term11434).add(term11446);
        ((ArrayList) term11434).add(term11453);
        term11422 = newInstance(Class.forName("nn.model.Node"));
        setField(term11422, term11422.getClass(), "type", enum74);
        setIntField(term11422, term11422.getClass(), "innovation", -161850441);
        setField(term11422, term11422.getClass(), "connections", term11434);
        setDoubleField(term11422, term11422.getClass(), "bias", 0.5220991694127869);
        Class<? extends Object> term11597 = Class.forName((String) "nn.model.Type");
        Field term11596 = ((Class) term11597).getDeclaredField((String) "HIDDEN");
        ((Field) term11596).setAccessible(true);
        Object enum75 = ((Field) term11596).get((Object) null);
        Object term11481 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11481, term11481.getClass(), "in", null);
        setField(term11481, term11481.getClass(), "out", null);
        setFloatField(term11481, term11481.getClass(), "weight", 0.035881937F);
        setBooleanField(term11481, term11481.getClass(), "expressed", true);
        setIntField(term11481, term11481.getClass(), "innovation", 61954667);
        Object term11485 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11485, term11485.getClass(), "in", null);
        setField(term11485, term11485.getClass(), "out", null);
        setFloatField(term11485, term11485.getClass(), "weight", 0.21312559F);
        setBooleanField(term11485, term11485.getClass(), "expressed", false);
        setIntField(term11485, term11485.getClass(), "innovation", -1442923471);
        Object term11489 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11489, term11489.getClass(), "in", null);
        setField(term11489, term11489.getClass(), "out", null);
        setFloatField(term11489, term11489.getClass(), "weight", 0.4308216F);
        setBooleanField(term11489, term11489.getClass(), "expressed", false);
        setIntField(term11489, term11489.getClass(), "innovation", 72160200);
        ArrayList term11479 = new ArrayList();
        ((ArrayList) term11479).add(term11481);
        ((ArrayList) term11479).add(term11485);
        ((ArrayList) term11479).add(term11489);
        ((ArrayList) term11479).add(term11489);
        ArrayList term11498 = new ArrayList();
        ((ArrayList) term11498).add(term11481);
        term11466 = newInstance(Class.forName("nn.model.Connection"));
        Object term11467 = newInstance(Class.forName("nn.model.Node"));
        Object term11496 = newInstance(Class.forName("nn.model.Node"));
        setField(term11467, term11467.getClass(), "type", enum75);
        setIntField(term11467, term11467.getClass(), "innovation", -1343269854);
        setField(term11467, term11467.getClass(), "connections", term11479);
        setDoubleField(term11467, term11467.getClass(), "bias", 0.5424105805193429);
        setField(term11466, term11466.getClass(), "in", term11467);
        setField(term11496, term11496.getClass(), "type", enum74);
        setIntField(term11496, term11496.getClass(), "innovation", -919022885);
        setField(term11496, term11496.getClass(), "connections", term11498);
        setDoubleField(term11496, term11496.getClass(), "bias", 0.961202697260254);
        setField(term11466, term11466.getClass(), "out", term11496);
        setFloatField(term11466, term11466.getClass(), "weight", 0.16553938F);
        setBooleanField(term11466, term11466.getClass(), "expressed", false);
        setIntField(term11466, term11466.getClass(), "innovation", -1836286878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Connection");
        Object[] args = new Object[1];
        args[0] = term11466;
        callMethod(klass, "addConnection", argTypes, term11422, args);
    }

};


