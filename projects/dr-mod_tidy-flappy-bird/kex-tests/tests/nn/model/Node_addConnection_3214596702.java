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
     Object term11425;
     Object term11469;

    public Node_addConnection_3214596702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11510 = Class.forName((String) "nn.model.Type");
        Field term11509 = ((Class) term11510).getDeclaredField((String) "SENSOR");
        ((Field) term11509).setAccessible(true);
        Object enum74 = ((Field) term11509).get((Object) null);
        Object term11439 = newInstance(Class.forName("nn.model.Connection"));
        Object term11440 = newInstance(Class.forName("nn.model.Node"));
        Object term11443 = newInstance(Class.forName("nn.model.Node"));
        setField(term11440, term11440.getClass(), "type", null);
        setIntField(term11440, term11440.getClass(), "innovation", 1486351894);
        setField(term11440, term11440.getClass(), "connections", null);
        setDoubleField(term11440, term11440.getClass(), "bias", 0.2030931676384783);
        setField(term11439, term11439.getClass(), "in", term11440);
        setField(term11443, term11443.getClass(), "type", null);
        setIntField(term11443, term11443.getClass(), "innovation", -1477091217);
        setField(term11443, term11443.getClass(), "connections", null);
        setDoubleField(term11443, term11443.getClass(), "bias", 0.4586817610515208);
        setField(term11439, term11439.getClass(), "out", term11443);
        setFloatField(term11439, term11439.getClass(), "weight", 0.18721223F);
        setBooleanField(term11439, term11439.getClass(), "expressed", true);
        setIntField(term11439, term11439.getClass(), "innovation", -1908164516);
        Object term11449 = newInstance(Class.forName("nn.model.Connection"));
        Object term11450 = newInstance(Class.forName("nn.model.Node"));
        setField(term11450, term11450.getClass(), "type", enum74);
        setIntField(term11450, term11450.getClass(), "innovation", -1020664075);
        setField(term11450, term11450.getClass(), "connections", null);
        setDoubleField(term11450, term11450.getClass(), "bias", 0.16703018107140954);
        setField(term11449, term11449.getClass(), "in", term11450);
        setField(term11449, term11449.getClass(), "out", term11443);
        setFloatField(term11449, term11449.getClass(), "weight", 0.70041996F);
        setBooleanField(term11449, term11449.getClass(), "expressed", true);
        setIntField(term11449, term11449.getClass(), "innovation", 459471826);
        Object term11456 = newInstance(Class.forName("nn.model.Connection"));
        Object term11457 = newInstance(Class.forName("nn.model.Node"));
        Object term11460 = newInstance(Class.forName("nn.model.Node"));
        setField(term11457, term11457.getClass(), "type", null);
        setIntField(term11457, term11457.getClass(), "innovation", 0);
        setField(term11457, term11457.getClass(), "connections", null);
        setDoubleField(term11457, term11457.getClass(), "bias", 0.0);
        setField(term11456, term11456.getClass(), "in", term11457);
        setField(term11460, term11460.getClass(), "type", null);
        setIntField(term11460, term11460.getClass(), "innovation", 0);
        setField(term11460, term11460.getClass(), "connections", null);
        setDoubleField(term11460, term11460.getClass(), "bias", 0.0);
        setField(term11456, term11456.getClass(), "out", term11460);
        setFloatField(term11456, term11456.getClass(), "weight", 0.13699532F);
        setBooleanField(term11456, term11456.getClass(), "expressed", false);
        setIntField(term11456, term11456.getClass(), "innovation", -1412100145);
        ArrayList term11437 = new ArrayList();
        ((ArrayList) term11437).add(term11439);
        ((ArrayList) term11437).add(term11449);
        ((ArrayList) term11437).add(term11456);
        term11425 = newInstance(Class.forName("nn.model.Node"));
        setField(term11425, term11425.getClass(), "type", enum74);
        setIntField(term11425, term11425.getClass(), "innovation", -161850441);
        setField(term11425, term11425.getClass(), "connections", term11437);
        setDoubleField(term11425, term11425.getClass(), "bias", 0.5220991694127869);
        Class<? extends Object> term11600 = Class.forName((String) "nn.model.Type");
        Field term11599 = ((Class) term11600).getDeclaredField((String) "HIDDEN");
        ((Field) term11599).setAccessible(true);
        Object enum75 = ((Field) term11599).get((Object) null);
        Object term11484 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11484, term11484.getClass(), "in", null);
        setField(term11484, term11484.getClass(), "out", null);
        setFloatField(term11484, term11484.getClass(), "weight", 0.035881937F);
        setBooleanField(term11484, term11484.getClass(), "expressed", true);
        setIntField(term11484, term11484.getClass(), "innovation", 61954667);
        Object term11488 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11488, term11488.getClass(), "in", null);
        setField(term11488, term11488.getClass(), "out", null);
        setFloatField(term11488, term11488.getClass(), "weight", 0.21312559F);
        setBooleanField(term11488, term11488.getClass(), "expressed", false);
        setIntField(term11488, term11488.getClass(), "innovation", -1442923471);
        Object term11492 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11492, term11492.getClass(), "in", null);
        setField(term11492, term11492.getClass(), "out", null);
        setFloatField(term11492, term11492.getClass(), "weight", 0.4308216F);
        setBooleanField(term11492, term11492.getClass(), "expressed", false);
        setIntField(term11492, term11492.getClass(), "innovation", 72160200);
        ArrayList term11482 = new ArrayList();
        ((ArrayList) term11482).add(term11484);
        ((ArrayList) term11482).add(term11488);
        ((ArrayList) term11482).add(term11492);
        ((ArrayList) term11482).add(term11492);
        ArrayList term11501 = new ArrayList();
        ((ArrayList) term11501).add(term11484);
        term11469 = newInstance(Class.forName("nn.model.Connection"));
        Object term11470 = newInstance(Class.forName("nn.model.Node"));
        Object term11499 = newInstance(Class.forName("nn.model.Node"));
        setField(term11470, term11470.getClass(), "type", enum75);
        setIntField(term11470, term11470.getClass(), "innovation", -1343269854);
        setField(term11470, term11470.getClass(), "connections", term11482);
        setDoubleField(term11470, term11470.getClass(), "bias", 0.5424105805193429);
        setField(term11469, term11469.getClass(), "in", term11470);
        setField(term11499, term11499.getClass(), "type", enum74);
        setIntField(term11499, term11499.getClass(), "innovation", -919022885);
        setField(term11499, term11499.getClass(), "connections", term11501);
        setDoubleField(term11499, term11499.getClass(), "bias", 0.961202697260254);
        setField(term11469, term11469.getClass(), "out", term11499);
        setFloatField(term11469, term11469.getClass(), "weight", 0.16553938F);
        setBooleanField(term11469, term11469.getClass(), "expressed", false);
        setIntField(term11469, term11469.getClass(), "innovation", -1836286878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Connection");
        Object[] args = new Object[1];
        args[0] = term11469;
        callMethod(klass, "addConnection", argTypes, term11425, args);
    }

};


