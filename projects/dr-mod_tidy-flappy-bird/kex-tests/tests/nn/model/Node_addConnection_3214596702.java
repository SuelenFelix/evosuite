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
     Object term11410;
     Object term11454;

    public Node_addConnection_3214596702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11495 = Class.forName((String) "nn.model.Type");
        Field term11494 = ((Class) term11495).getDeclaredField((String) "SENSOR");
        ((Field) term11494).setAccessible(true);
        Object enum74 = ((Field) term11494).get((Object) null);
        Object term11424 = newInstance(Class.forName("nn.model.Connection"));
        Object term11425 = newInstance(Class.forName("nn.model.Node"));
        Object term11428 = newInstance(Class.forName("nn.model.Node"));
        setField(term11425, term11425.getClass(), "type", null);
        setIntField(term11425, term11425.getClass(), "innovation", 1486351894);
        setField(term11425, term11425.getClass(), "connections", null);
        setDoubleField(term11425, term11425.getClass(), "bias", 0.2030931676384783);
        setField(term11424, term11424.getClass(), "in", term11425);
        setField(term11428, term11428.getClass(), "type", null);
        setIntField(term11428, term11428.getClass(), "innovation", -1477091217);
        setField(term11428, term11428.getClass(), "connections", null);
        setDoubleField(term11428, term11428.getClass(), "bias", 0.4586817610515208);
        setField(term11424, term11424.getClass(), "out", term11428);
        setFloatField(term11424, term11424.getClass(), "weight", 0.18721223F);
        setBooleanField(term11424, term11424.getClass(), "expressed", true);
        setIntField(term11424, term11424.getClass(), "innovation", -1908164516);
        Object term11434 = newInstance(Class.forName("nn.model.Connection"));
        Object term11435 = newInstance(Class.forName("nn.model.Node"));
        setField(term11435, term11435.getClass(), "type", enum74);
        setIntField(term11435, term11435.getClass(), "innovation", -1020664075);
        setField(term11435, term11435.getClass(), "connections", null);
        setDoubleField(term11435, term11435.getClass(), "bias", 0.16703018107140954);
        setField(term11434, term11434.getClass(), "in", term11435);
        setField(term11434, term11434.getClass(), "out", term11428);
        setFloatField(term11434, term11434.getClass(), "weight", 0.70041996F);
        setBooleanField(term11434, term11434.getClass(), "expressed", true);
        setIntField(term11434, term11434.getClass(), "innovation", 459471826);
        Object term11441 = newInstance(Class.forName("nn.model.Connection"));
        Object term11442 = newInstance(Class.forName("nn.model.Node"));
        Object term11445 = newInstance(Class.forName("nn.model.Node"));
        setField(term11442, term11442.getClass(), "type", null);
        setIntField(term11442, term11442.getClass(), "innovation", 0);
        setField(term11442, term11442.getClass(), "connections", null);
        setDoubleField(term11442, term11442.getClass(), "bias", 0.0);
        setField(term11441, term11441.getClass(), "in", term11442);
        setField(term11445, term11445.getClass(), "type", null);
        setIntField(term11445, term11445.getClass(), "innovation", 0);
        setField(term11445, term11445.getClass(), "connections", null);
        setDoubleField(term11445, term11445.getClass(), "bias", 0.0);
        setField(term11441, term11441.getClass(), "out", term11445);
        setFloatField(term11441, term11441.getClass(), "weight", 0.13699532F);
        setBooleanField(term11441, term11441.getClass(), "expressed", false);
        setIntField(term11441, term11441.getClass(), "innovation", -1412100145);
        ArrayList term11422 = new ArrayList();
        ((ArrayList) term11422).add(term11424);
        ((ArrayList) term11422).add(term11434);
        ((ArrayList) term11422).add(term11441);
        term11410 = newInstance(Class.forName("nn.model.Node"));
        setField(term11410, term11410.getClass(), "type", enum74);
        setIntField(term11410, term11410.getClass(), "innovation", -161850441);
        setField(term11410, term11410.getClass(), "connections", term11422);
        setDoubleField(term11410, term11410.getClass(), "bias", 0.5220991694127869);
        Class<? extends Object> term11585 = Class.forName((String) "nn.model.Type");
        Field term11584 = ((Class) term11585).getDeclaredField((String) "HIDDEN");
        ((Field) term11584).setAccessible(true);
        Object enum75 = ((Field) term11584).get((Object) null);
        Object term11469 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11469, term11469.getClass(), "in", null);
        setField(term11469, term11469.getClass(), "out", null);
        setFloatField(term11469, term11469.getClass(), "weight", 0.035881937F);
        setBooleanField(term11469, term11469.getClass(), "expressed", true);
        setIntField(term11469, term11469.getClass(), "innovation", 61954667);
        Object term11473 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11473, term11473.getClass(), "in", null);
        setField(term11473, term11473.getClass(), "out", null);
        setFloatField(term11473, term11473.getClass(), "weight", 0.21312559F);
        setBooleanField(term11473, term11473.getClass(), "expressed", false);
        setIntField(term11473, term11473.getClass(), "innovation", -1442923471);
        Object term11477 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11477, term11477.getClass(), "in", null);
        setField(term11477, term11477.getClass(), "out", null);
        setFloatField(term11477, term11477.getClass(), "weight", 0.4308216F);
        setBooleanField(term11477, term11477.getClass(), "expressed", false);
        setIntField(term11477, term11477.getClass(), "innovation", 72160200);
        ArrayList term11467 = new ArrayList();
        ((ArrayList) term11467).add(term11469);
        ((ArrayList) term11467).add(term11473);
        ((ArrayList) term11467).add(term11477);
        ((ArrayList) term11467).add(term11477);
        ArrayList term11486 = new ArrayList();
        ((ArrayList) term11486).add(term11469);
        term11454 = newInstance(Class.forName("nn.model.Connection"));
        Object term11455 = newInstance(Class.forName("nn.model.Node"));
        Object term11484 = newInstance(Class.forName("nn.model.Node"));
        setField(term11455, term11455.getClass(), "type", enum75);
        setIntField(term11455, term11455.getClass(), "innovation", -1343269854);
        setField(term11455, term11455.getClass(), "connections", term11467);
        setDoubleField(term11455, term11455.getClass(), "bias", 0.5424105805193429);
        setField(term11454, term11454.getClass(), "in", term11455);
        setField(term11484, term11484.getClass(), "type", enum74);
        setIntField(term11484, term11484.getClass(), "innovation", -919022885);
        setField(term11484, term11484.getClass(), "connections", term11486);
        setDoubleField(term11484, term11484.getClass(), "bias", 0.961202697260254);
        setField(term11454, term11454.getClass(), "out", term11484);
        setFloatField(term11454, term11454.getClass(), "weight", 0.16553938F);
        setBooleanField(term11454, term11454.getClass(), "expressed", false);
        setIntField(term11454, term11454.getClass(), "innovation", -1836286878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Connection");
        Object[] args = new Object[1];
        args[0] = term11454;
        callMethod(klass, "addConnection", argTypes, term11410, args);
    }

};


