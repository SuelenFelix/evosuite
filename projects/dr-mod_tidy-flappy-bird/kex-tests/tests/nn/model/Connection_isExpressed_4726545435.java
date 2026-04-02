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

public class Connection_isExpressed_4726545435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1178;

    public Connection_isExpressed_4726545435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1241 = Class.forName((String) "nn.model.Type");
        Field term1240 = ((Class) term1241).getDeclaredField((String) "SENSOR");
        ((Field) term1240).setAccessible(true);
        Object enum9 = ((Field) term1240).get((Object) null);
        Object term1193 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1193, term1193.getClass(), "in", null);
        setField(term1193, term1193.getClass(), "out", null);
        setFloatField(term1193, term1193.getClass(), "weight", 0.7633268F);
        setBooleanField(term1193, term1193.getClass(), "expressed", true);
        setIntField(term1193, term1193.getClass(), "innovation", -663691365);
        Object term1197 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1197, term1197.getClass(), "in", null);
        setField(term1197, term1197.getClass(), "out", null);
        setFloatField(term1197, term1197.getClass(), "weight", 0.0F);
        setBooleanField(term1197, term1197.getClass(), "expressed", false);
        setIntField(term1197, term1197.getClass(), "innovation", 0);
        Object term1201 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1201, term1201.getClass(), "in", null);
        setField(term1201, term1201.getClass(), "out", null);
        setFloatField(term1201, term1201.getClass(), "weight", 0.80973893F);
        setBooleanField(term1201, term1201.getClass(), "expressed", false);
        setIntField(term1201, term1201.getClass(), "innovation", -268815336);
        Object term1205 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1205, term1205.getClass(), "in", null);
        setField(term1205, term1205.getClass(), "out", null);
        setFloatField(term1205, term1205.getClass(), "weight", 0.0F);
        setBooleanField(term1205, term1205.getClass(), "expressed", false);
        setIntField(term1205, term1205.getClass(), "innovation", 0);
        ArrayList term1191 = new ArrayList();
        ((ArrayList) term1191).add(term1193);
        ((ArrayList) term1191).add(term1197);
        ((ArrayList) term1191).add(term1201);
        ((ArrayList) term1191).add(term1205);
        Class<? extends Object> term1331 = Class.forName((String) "nn.model.Type");
        Field term1330 = ((Class) term1331).getDeclaredField((String) "OUTPUT");
        ((Field) term1330).setAccessible(true);
        Object enum10 = ((Field) term1330).get((Object) null);
        Object term1226 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1226, term1226.getClass(), "in", null);
        setField(term1226, term1226.getClass(), "out", null);
        setFloatField(term1226, term1226.getClass(), "weight", 0.0F);
        setBooleanField(term1226, term1226.getClass(), "expressed", false);
        setIntField(term1226, term1226.getClass(), "innovation", 0);
        Object term1230 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1230, term1230.getClass(), "in", null);
        setField(term1230, term1230.getClass(), "out", null);
        setFloatField(term1230, term1230.getClass(), "weight", 0.0F);
        setBooleanField(term1230, term1230.getClass(), "expressed", false);
        setIntField(term1230, term1230.getClass(), "innovation", 0);
        ArrayList term1224 = new ArrayList();
        ((ArrayList) term1224).add(term1226);
        ((ArrayList) term1224).add(term1193);
        ((ArrayList) term1224).add(term1230);
        ((ArrayList) term1224).add(term1226);
        ((ArrayList) term1224).add(term1226);
        ((ArrayList) term1224).add(term1197);
        term1178 = newInstance(Class.forName("nn.model.Connection"));
        Object term1179 = newInstance(Class.forName("nn.model.Node"));
        Object term1212 = newInstance(Class.forName("nn.model.Node"));
        setField(term1179, term1179.getClass(), "type", enum9);
        setIntField(term1179, term1179.getClass(), "innovation", 941650513);
        setField(term1179, term1179.getClass(), "connections", term1191);
        setDoubleField(term1179, term1179.getClass(), "bias", 0.2109867221632754);
        setField(term1178, term1178.getClass(), "in", term1179);
        setField(term1212, term1212.getClass(), "type", enum10);
        setIntField(term1212, term1212.getClass(), "innovation", 339854490);
        setField(term1212, term1212.getClass(), "connections", term1224);
        setDoubleField(term1212, term1212.getClass(), "bias", 0.3227335400819148);
        setField(term1178, term1178.getClass(), "out", term1212);
        setFloatField(term1178, term1178.getClass(), "weight", 0.541592F);
        setBooleanField(term1178, term1178.getClass(), "expressed", true);
        setIntField(term1178, term1178.getClass(), "innovation", -615654495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isExpressed", argTypes, term1178, args);
    }

};


