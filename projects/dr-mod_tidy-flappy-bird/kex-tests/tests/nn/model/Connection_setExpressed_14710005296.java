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
import java.lang.Boolean;

public class Connection_setExpressed_14710005296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1420;
     Object term1478;

    public Connection_setExpressed_14710005296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1481 = Class.forName((String) "nn.model.Type");
        Field term1480 = ((Class) term1481).getDeclaredField((String) "SENSOR");
        ((Field) term1480).setAccessible(true);
        Object enum11 = ((Field) term1480).get((Object) null);
        Object term1435 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1435, term1435.getClass(), "in", null);
        setField(term1435, term1435.getClass(), "out", null);
        setFloatField(term1435, term1435.getClass(), "weight", 0.10577053F);
        setBooleanField(term1435, term1435.getClass(), "expressed", false);
        setIntField(term1435, term1435.getClass(), "innovation", 1072005683);
        Object term1439 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1439, term1439.getClass(), "in", null);
        setField(term1439, term1439.getClass(), "out", null);
        setFloatField(term1439, term1439.getClass(), "weight", 0.0F);
        setBooleanField(term1439, term1439.getClass(), "expressed", false);
        setIntField(term1439, term1439.getClass(), "innovation", 0);
        Object term1443 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1443, term1443.getClass(), "in", null);
        setField(term1443, term1443.getClass(), "out", null);
        setFloatField(term1443, term1443.getClass(), "weight", 0.0F);
        setBooleanField(term1443, term1443.getClass(), "expressed", false);
        setIntField(term1443, term1443.getClass(), "innovation", 0);
        Object term1447 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1447, term1447.getClass(), "in", null);
        setField(term1447, term1447.getClass(), "out", null);
        setFloatField(term1447, term1447.getClass(), "weight", 0.13481021F);
        setBooleanField(term1447, term1447.getClass(), "expressed", true);
        setIntField(term1447, term1447.getClass(), "innovation", 691577392);
        Object term1451 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1451, term1451.getClass(), "in", null);
        setField(term1451, term1451.getClass(), "out", null);
        setFloatField(term1451, term1451.getClass(), "weight", 0.0F);
        setBooleanField(term1451, term1451.getClass(), "expressed", false);
        setIntField(term1451, term1451.getClass(), "innovation", 0);
        ArrayList term1433 = new ArrayList();
        ((ArrayList) term1433).add(term1435);
        ((ArrayList) term1433).add(term1439);
        ((ArrayList) term1433).add(term1439);
        ((ArrayList) term1433).add(term1443);
        ((ArrayList) term1433).add(term1447);
        ((ArrayList) term1433).add(term1435);
        ((ArrayList) term1433).add(term1451);
        Class<? extends Object> term1571 = Class.forName((String) "nn.model.Type");
        Field term1570 = ((Class) term1571).getDeclaredField((String) "OUTPUT");
        ((Field) term1570).setAccessible(true);
        Object enum12 = ((Field) term1570).get((Object) null);
        ArrayList term1470 = new ArrayList();
        term1420 = newInstance(Class.forName("nn.model.Connection"));
        Object term1421 = newInstance(Class.forName("nn.model.Node"));
        Object term1458 = newInstance(Class.forName("nn.model.Node"));
        setField(term1421, term1421.getClass(), "type", enum11);
        setIntField(term1421, term1421.getClass(), "innovation", -1476117762);
        setField(term1421, term1421.getClass(), "connections", term1433);
        setDoubleField(term1421, term1421.getClass(), "bias", 0.5308350402051779);
        setField(term1420, term1420.getClass(), "in", term1421);
        setField(term1458, term1458.getClass(), "type", enum12);
        setIntField(term1458, term1458.getClass(), "innovation", 1861318859);
        setField(term1458, term1458.getClass(), "connections", term1470);
        setDoubleField(term1458, term1458.getClass(), "bias", 0.7154795600170818);
        setField(term1420, term1420.getClass(), "out", term1458);
        setFloatField(term1420, term1420.getClass(), "weight", 0.5840714F);
        setBooleanField(term1420, term1420.getClass(), "expressed", false);
        setIntField(term1420, term1420.getClass(), "innovation", 1474524152);
        term1478 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1478;
        callMethod(klass, "setExpressed", argTypes, term1420, args);
    }

};


