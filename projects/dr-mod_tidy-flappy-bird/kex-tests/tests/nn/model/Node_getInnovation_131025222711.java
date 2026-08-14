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

public class Node_getInnovation_131025222711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12654;

    public Node_getInnovation_131025222711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12724 = Class.forName((String) "nn.model.Type");
        Field term12723 = ((Class) term12724).getDeclaredField((String) "OUTPUT");
        ((Field) term12723).setAccessible(true);
        Object enum83 = ((Field) term12723).get((Object) null);
        Object term12668 = newInstance(Class.forName("nn.model.Connection"));
        Object term12669 = newInstance(Class.forName("nn.model.Node"));
        Object term12672 = newInstance(Class.forName("nn.model.Node"));
        setField(term12669, term12669.getClass(), "type", null);
        setIntField(term12669, term12669.getClass(), "innovation", -1822211508);
        setField(term12669, term12669.getClass(), "connections", null);
        setDoubleField(term12669, term12669.getClass(), "bias", 0.6961639879171184);
        setField(term12668, term12668.getClass(), "in", term12669);
        setField(term12672, term12672.getClass(), "type", null);
        setIntField(term12672, term12672.getClass(), "innovation", 0);
        setField(term12672, term12672.getClass(), "connections", null);
        setDoubleField(term12672, term12672.getClass(), "bias", 0.0);
        setField(term12668, term12668.getClass(), "out", term12672);
        setFloatField(term12668, term12668.getClass(), "weight", 0.5959743F);
        setBooleanField(term12668, term12668.getClass(), "expressed", true);
        setIntField(term12668, term12668.getClass(), "innovation", 1491468856);
        Object term12678 = newInstance(Class.forName("nn.model.Connection"));
        Object term12679 = newInstance(Class.forName("nn.model.Node"));
        setField(term12678, term12678.getClass(), "in", term12672);
        setField(term12679, term12679.getClass(), "type", null);
        setIntField(term12679, term12679.getClass(), "innovation", 0);
        setField(term12679, term12679.getClass(), "connections", null);
        setDoubleField(term12679, term12679.getClass(), "bias", 0.0);
        setField(term12678, term12678.getClass(), "out", term12679);
        setFloatField(term12678, term12678.getClass(), "weight", 0.7368078F);
        setBooleanField(term12678, term12678.getClass(), "expressed", false);
        setIntField(term12678, term12678.getClass(), "innovation", -1099664830);
        Object term12685 = newInstance(Class.forName("nn.model.Connection"));
        Object term12686 = newInstance(Class.forName("nn.model.Node"));
        Object term12689 = newInstance(Class.forName("nn.model.Node"));
        setField(term12686, term12686.getClass(), "type", null);
        setIntField(term12686, term12686.getClass(), "innovation", -773608881);
        setField(term12686, term12686.getClass(), "connections", null);
        setDoubleField(term12686, term12686.getClass(), "bias", 0.17377837668919804);
        setField(term12685, term12685.getClass(), "in", term12686);
        setField(term12689, term12689.getClass(), "type", null);
        setIntField(term12689, term12689.getClass(), "innovation", 1485047282);
        setField(term12689, term12689.getClass(), "connections", null);
        setDoubleField(term12689, term12689.getClass(), "bias", 0.8733388286648099);
        setField(term12685, term12685.getClass(), "out", term12689);
        setFloatField(term12685, term12685.getClass(), "weight", 0.6530844F);
        setBooleanField(term12685, term12685.getClass(), "expressed", true);
        setIntField(term12685, term12685.getClass(), "innovation", -640763660);
        Object term12695 = newInstance(Class.forName("nn.model.Connection"));
        Object term12696 = newInstance(Class.forName("nn.model.Node"));
        setField(term12696, term12696.getClass(), "type", null);
        setIntField(term12696, term12696.getClass(), "innovation", 0);
        setField(term12696, term12696.getClass(), "connections", null);
        setDoubleField(term12696, term12696.getClass(), "bias", 0.0);
        setField(term12695, term12695.getClass(), "in", term12696);
        setField(term12695, term12695.getClass(), "out", term12679);
        setFloatField(term12695, term12695.getClass(), "weight", 0.31543463F);
        setBooleanField(term12695, term12695.getClass(), "expressed", false);
        setIntField(term12695, term12695.getClass(), "innovation", -1642688455);
        Object term12702 = newInstance(Class.forName("nn.model.Connection"));
        Object term12703 = newInstance(Class.forName("nn.model.Node"));
        setField(term12703, term12703.getClass(), "type", enum83);
        setIntField(term12703, term12703.getClass(), "innovation", -177243872);
        setField(term12703, term12703.getClass(), "connections", null);
        setDoubleField(term12703, term12703.getClass(), "bias", 0.10735086460638021);
        setField(term12702, term12702.getClass(), "in", term12703);
        setField(term12702, term12702.getClass(), "out", term12689);
        setFloatField(term12702, term12702.getClass(), "weight", 0.6799679F);
        setBooleanField(term12702, term12702.getClass(), "expressed", true);
        setIntField(term12702, term12702.getClass(), "innovation", -2004575734);
        Object term12709 = newInstance(Class.forName("nn.model.Connection"));
        Object term12710 = newInstance(Class.forName("nn.model.Node"));
        setField(term12709, term12709.getClass(), "in", term12679);
        setField(term12710, term12710.getClass(), "type", null);
        setIntField(term12710, term12710.getClass(), "innovation", 0);
        setField(term12710, term12710.getClass(), "connections", null);
        setDoubleField(term12710, term12710.getClass(), "bias", 0.0);
        setField(term12709, term12709.getClass(), "out", term12710);
        setFloatField(term12709, term12709.getClass(), "weight", 0.020103633F);
        setBooleanField(term12709, term12709.getClass(), "expressed", true);
        setIntField(term12709, term12709.getClass(), "innovation", 2123688338);
        Object term12716 = newInstance(Class.forName("nn.model.Connection"));
        setField(term12716, term12716.getClass(), "in", term12669);
        setField(term12716, term12716.getClass(), "out", term12669);
        setFloatField(term12716, term12716.getClass(), "weight", 0.6407471F);
        setBooleanField(term12716, term12716.getClass(), "expressed", true);
        setIntField(term12716, term12716.getClass(), "innovation", -1189468129);
        ArrayList term12666 = new ArrayList();
        ((ArrayList) term12666).add(term12668);
        ((ArrayList) term12666).add(term12678);
        ((ArrayList) term12666).add(term12685);
        ((ArrayList) term12666).add(term12695);
        ((ArrayList) term12666).add(term12695);
        ((ArrayList) term12666).add(term12702);
        ((ArrayList) term12666).add(term12709);
        ((ArrayList) term12666).add(term12709);
        ((ArrayList) term12666).add(term12716);
        term12654 = newInstance(Class.forName("nn.model.Node"));
        setField(term12654, term12654.getClass(), "type", enum83);
        setIntField(term12654, term12654.getClass(), "innovation", 1774728742);
        setField(term12654, term12654.getClass(), "connections", term12666);
        setDoubleField(term12654, term12654.getClass(), "bias", 0.04086594399817722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInnovation", argTypes, term12654, args);
    }

};


