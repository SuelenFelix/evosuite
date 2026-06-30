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

public class Connection_getInnovation_14314057857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1660;

    public Connection_getInnovation_14314057857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1727 = Class.forName((String) "nn.model.Type");
        Field term1726 = ((Class) term1727).getDeclaredField((String) "OUTPUT");
        ((Field) term1726).setAccessible(true);
        Object enum13 = ((Field) term1726).get((Object) null);
        Object term1675 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1675, term1675.getClass(), "in", null);
        setField(term1675, term1675.getClass(), "out", null);
        setFloatField(term1675, term1675.getClass(), "weight", 0.9571234F);
        setBooleanField(term1675, term1675.getClass(), "expressed", true);
        setIntField(term1675, term1675.getClass(), "innovation", -2015048153);
        Object term1679 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1679, term1679.getClass(), "in", null);
        setField(term1679, term1679.getClass(), "out", null);
        setFloatField(term1679, term1679.getClass(), "weight", 0.0F);
        setBooleanField(term1679, term1679.getClass(), "expressed", false);
        setIntField(term1679, term1679.getClass(), "innovation", 0);
        Object term1683 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1683, term1683.getClass(), "in", null);
        setField(term1683, term1683.getClass(), "out", null);
        setFloatField(term1683, term1683.getClass(), "weight", 0.0F);
        setBooleanField(term1683, term1683.getClass(), "expressed", false);
        setIntField(term1683, term1683.getClass(), "innovation", 0);
        Object term1687 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1687, term1687.getClass(), "in", null);
        setField(term1687, term1687.getClass(), "out", null);
        setFloatField(term1687, term1687.getClass(), "weight", 0.10667074F);
        setBooleanField(term1687, term1687.getClass(), "expressed", false);
        setIntField(term1687, term1687.getClass(), "innovation", 1202361360);
        Object term1691 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1691, term1691.getClass(), "in", null);
        setField(term1691, term1691.getClass(), "out", null);
        setFloatField(term1691, term1691.getClass(), "weight", 0.0F);
        setBooleanField(term1691, term1691.getClass(), "expressed", false);
        setIntField(term1691, term1691.getClass(), "innovation", 0);
        Object term1695 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1695, term1695.getClass(), "in", null);
        setField(term1695, term1695.getClass(), "out", null);
        setFloatField(term1695, term1695.getClass(), "weight", 0.0F);
        setBooleanField(term1695, term1695.getClass(), "expressed", false);
        setIntField(term1695, term1695.getClass(), "innovation", 0);
        ArrayList term1673 = new ArrayList();
        ((ArrayList) term1673).add(term1675);
        ((ArrayList) term1673).add(term1679);
        ((ArrayList) term1673).add(term1683);
        ((ArrayList) term1673).add(term1687);
        ((ArrayList) term1673).add(term1691);
        ((ArrayList) term1673).add(term1695);
        Class<? extends Object> term1817 = Class.forName((String) "nn.model.Type");
        Field term1816 = ((Class) term1817).getDeclaredField((String) "SENSOR");
        ((Field) term1816).setAccessible(true);
        Object enum14 = ((Field) term1816).get((Object) null);
        Object term1716 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1716, term1716.getClass(), "in", null);
        setField(term1716, term1716.getClass(), "out", null);
        setFloatField(term1716, term1716.getClass(), "weight", 0.478669F);
        setBooleanField(term1716, term1716.getClass(), "expressed", false);
        setIntField(term1716, term1716.getClass(), "innovation", -2015854073);
        ArrayList term1714 = new ArrayList();
        ((ArrayList) term1714).add(term1687);
        ((ArrayList) term1714).add(term1716);
        ((ArrayList) term1714).add(term1716);
        ((ArrayList) term1714).add(term1675);
        ((ArrayList) term1714).add(term1691);
        term1660 = newInstance(Class.forName("nn.model.Connection"));
        Object term1661 = newInstance(Class.forName("nn.model.Node"));
        Object term1702 = newInstance(Class.forName("nn.model.Node"));
        setField(term1661, term1661.getClass(), "type", enum13);
        setIntField(term1661, term1661.getClass(), "innovation", 568954359);
        setField(term1661, term1661.getClass(), "connections", term1673);
        setDoubleField(term1661, term1661.getClass(), "bias", 0.29874017652881824);
        setField(term1660, term1660.getClass(), "in", term1661);
        setField(term1702, term1702.getClass(), "type", enum14);
        setIntField(term1702, term1702.getClass(), "innovation", 53410913);
        setField(term1702, term1702.getClass(), "connections", term1714);
        setDoubleField(term1702, term1702.getClass(), "bias", 0.0027299293098262956);
        setField(term1660, term1660.getClass(), "out", term1702);
        setFloatField(term1660, term1660.getClass(), "weight", 0.114929974F);
        setBooleanField(term1660, term1660.getClass(), "expressed", false);
        setIntField(term1660, term1660.getClass(), "innovation", -2063457669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInnovation", argTypes, term1660, args);
    }

};


