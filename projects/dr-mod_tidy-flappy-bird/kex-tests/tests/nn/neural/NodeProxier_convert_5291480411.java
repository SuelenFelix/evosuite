package nn.neural;

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
import static nn.neural.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class NodeProxier_convert_5291480411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term7;

    public NodeProxier_convert_5291480411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        term1 = newInstance(Class.forName("nn.neural.NodeProxier"));
        setField(term1, term1.getClass(), "matchNodes", term2);
        Class<? extends Object> term95 = Class.forName((String) "nn.model.Type");
        Field term94 = ((Class) term95).getDeclaredField((String) "OUTPUT");
        ((Field) term94).setAccessible(true);
        Object enum0 = ((Field) term94).get((Object) null);
        Object term21 = newInstance(Class.forName("nn.model.Connection"));
        Object term22 = newInstance(Class.forName("nn.model.Node"));
        Object term25 = newInstance(Class.forName("nn.model.Node"));
        setField(term22, term22.getClass(), "type", null);
        setIntField(term22, term22.getClass(), "innovation", 1162663216);
        setField(term22, term22.getClass(), "connections", null);
        setDoubleField(term22, term22.getClass(), "bias", 0.28570734989730284);
        setField(term21, term21.getClass(), "in", term22);
        setField(term25, term25.getClass(), "type", null);
        setIntField(term25, term25.getClass(), "innovation", 391863371);
        setField(term25, term25.getClass(), "connections", null);
        setDoubleField(term25, term25.getClass(), "bias", 0.5523635872663106);
        setField(term21, term21.getClass(), "out", term25);
        setFloatField(term21, term21.getClass(), "weight", 0.6880585F);
        setBooleanField(term21, term21.getClass(), "expressed", true);
        setIntField(term21, term21.getClass(), "innovation", 597278769);
        Object term31 = newInstance(Class.forName("nn.model.Connection"));
        Object term32 = newInstance(Class.forName("nn.model.Node"));
        Object term35 = newInstance(Class.forName("nn.model.Node"));
        setField(term32, term32.getClass(), "type", null);
        setIntField(term32, term32.getClass(), "innovation", 0);
        setField(term32, term32.getClass(), "connections", null);
        setDoubleField(term32, term32.getClass(), "bias", 0.0);
        setField(term31, term31.getClass(), "in", term32);
        setField(term35, term35.getClass(), "type", null);
        setIntField(term35, term35.getClass(), "innovation", 0);
        setField(term35, term35.getClass(), "connections", null);
        setDoubleField(term35, term35.getClass(), "bias", 0.0);
        setField(term31, term31.getClass(), "out", term35);
        setFloatField(term31, term31.getClass(), "weight", 0.13238746F);
        setBooleanField(term31, term31.getClass(), "expressed", false);
        setIntField(term31, term31.getClass(), "innovation", -616727354);
        Object term41 = newInstance(Class.forName("nn.model.Connection"));
        Object term42 = newInstance(Class.forName("nn.model.Node"));
        Object term45 = newInstance(Class.forName("nn.model.Node"));
        setField(term42, term42.getClass(), "type", enum0);
        setIntField(term42, term42.getClass(), "innovation", 1484323161);
        setField(term42, term42.getClass(), "connections", null);
        setDoubleField(term42, term42.getClass(), "bias", 0.544608645520025);
        setField(term41, term41.getClass(), "in", term42);
        setField(term45, term45.getClass(), "type", null);
        setIntField(term45, term45.getClass(), "innovation", -1922583790);
        setField(term45, term45.getClass(), "connections", null);
        setDoubleField(term45, term45.getClass(), "bias", 0.13238746331190498);
        setField(term41, term41.getClass(), "out", term45);
        setFloatField(term41, term41.getClass(), "weight", 0.2857073F);
        setBooleanField(term41, term41.getClass(), "expressed", false);
        setIntField(term41, term41.getClass(), "innovation", 1585847225);
        Object term51 = newInstance(Class.forName("nn.model.Connection"));
        Object term52 = newInstance(Class.forName("nn.model.Node"));
        Object term55 = newInstance(Class.forName("nn.model.Node"));
        setField(term52, term52.getClass(), "type", enum0);
        setIntField(term52, term52.getClass(), "innovation", -1955890973);
        setField(term52, term52.getClass(), "connections", null);
        setDoubleField(term52, term52.getClass(), "bias", 0.3455959125047594);
        setField(term51, term51.getClass(), "in", term52);
        setField(term55, term55.getClass(), "type", null);
        setIntField(term55, term55.getClass(), "innovation", 0);
        setField(term55, term55.getClass(), "connections", null);
        setDoubleField(term55, term55.getClass(), "bias", 0.0);
        setField(term51, term51.getClass(), "out", term55);
        setFloatField(term51, term51.getClass(), "weight", 0.3455959F);
        setBooleanField(term51, term51.getClass(), "expressed", false);
        setIntField(term51, term51.getClass(), "innovation", 1227103734);
        ArrayList term19 = new ArrayList();
        ((ArrayList) term19).add(term21);
        ((ArrayList) term19).add(term31);
        ((ArrayList) term19).add(term31);
        ((ArrayList) term19).add(term41);
        ((ArrayList) term19).add(term51);
        term7 = newInstance(Class.forName("nn.model.Node"));
        setField(term7, term7.getClass(), "type", enum0);
        setIntField(term7, term7.getClass(), "innovation", 568599855);
        setField(term7, term7.getClass(), "connections", term19);
        setDoubleField(term7, term7.getClass(), "bias", 0.40176586625454525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.NodeProxier");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Node");
        Object[] args = new Object[1];
        args[0] = term7;
        callMethod(klass, "convert", argTypes, term1, args);
    }

};


