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

public class Node_toSomeSgring_173069254411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18347;

    public Node_toSomeSgring_173069254411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18406 = Class.forName((String) "nn.model.Type");
        Field term18405 = ((Class) term18406).getDeclaredField((String) "HIDDEN");
        ((Field) term18405).setAccessible(true);
        Object enum115 = ((Field) term18405).get((Object) null);
        Object term18361 = newInstance(Class.forName("nn.model.Connection"));
        Object term18362 = newInstance(Class.forName("nn.model.Node"));
        Object term18365 = newInstance(Class.forName("nn.model.Node"));
        setField(term18362, term18362.getClass(), "type", null);
        setIntField(term18362, term18362.getClass(), "innovation", -1707655562);
        setField(term18362, term18362.getClass(), "connections", null);
        setDoubleField(term18362, term18362.getClass(), "bias", 0.9009620538952149);
        setField(term18361, term18361.getClass(), "in", term18362);
        setField(term18365, term18365.getClass(), "type", enum115);
        setIntField(term18365, term18365.getClass(), "innovation", 1525815085);
        setField(term18365, term18365.getClass(), "connections", null);
        setDoubleField(term18365, term18365.getClass(), "bias", 0.09598300824663397);
        setField(term18361, term18361.getClass(), "out", term18365);
        setFloatField(term18361, term18361.getClass(), "weight", 0.75266284F);
        setBooleanField(term18361, term18361.getClass(), "expressed", false);
        setIntField(term18361, term18361.getClass(), "innovation", 1785476260);
        Object term18371 = newInstance(Class.forName("nn.model.Connection"));
        Object term18372 = newInstance(Class.forName("nn.model.Node"));
        Object term18375 = newInstance(Class.forName("nn.model.Node"));
        setField(term18372, term18372.getClass(), "type", null);
        setIntField(term18372, term18372.getClass(), "innovation", -655035002);
        setField(term18372, term18372.getClass(), "connections", null);
        setDoubleField(term18372, term18372.getClass(), "bias", 0.9091029161718786);
        setField(term18371, term18371.getClass(), "in", term18372);
        setField(term18375, term18375.getClass(), "type", null);
        setIntField(term18375, term18375.getClass(), "innovation", 2114761003);
        setField(term18375, term18375.getClass(), "connections", null);
        setDoubleField(term18375, term18375.getClass(), "bias", 0.3488342586091009);
        setField(term18371, term18371.getClass(), "out", term18375);
        setFloatField(term18371, term18371.getClass(), "weight", 0.01555711F);
        setBooleanField(term18371, term18371.getClass(), "expressed", false);
        setIntField(term18371, term18371.getClass(), "innovation", 622731276);
        Object term18381 = newInstance(Class.forName("nn.model.Connection"));
        Object term18382 = newInstance(Class.forName("nn.model.Node"));
        Object term18385 = newInstance(Class.forName("nn.model.Node"));
        setField(term18382, term18382.getClass(), "type", null);
        setIntField(term18382, term18382.getClass(), "innovation", 0);
        setField(term18382, term18382.getClass(), "connections", null);
        setDoubleField(term18382, term18382.getClass(), "bias", 0.0);
        setField(term18381, term18381.getClass(), "in", term18382);
        setField(term18385, term18385.getClass(), "type", null);
        setIntField(term18385, term18385.getClass(), "innovation", 0);
        setField(term18385, term18385.getClass(), "connections", null);
        setDoubleField(term18385, term18385.getClass(), "bias", 0.0);
        setField(term18381, term18381.getClass(), "out", term18385);
        setFloatField(term18381, term18381.getClass(), "weight", 0.66095555F);
        setBooleanField(term18381, term18381.getClass(), "expressed", false);
        setIntField(term18381, term18381.getClass(), "innovation", 380526008);
        Object term18391 = newInstance(Class.forName("nn.model.Connection"));
        Object term18392 = newInstance(Class.forName("nn.model.Node"));
        setField(term18392, term18392.getClass(), "type", null);
        setIntField(term18392, term18392.getClass(), "innovation", -456566581);
        setField(term18392, term18392.getClass(), "connections", null);
        setDoubleField(term18392, term18392.getClass(), "bias", 0.07084009583074191);
        setField(term18391, term18391.getClass(), "in", term18392);
        setField(term18391, term18391.getClass(), "out", term18372);
        setFloatField(term18391, term18391.getClass(), "weight", 0.20773286F);
        setBooleanField(term18391, term18391.getClass(), "expressed", true);
        setIntField(term18391, term18391.getClass(), "innovation", -1542216721);
        Object term18398 = newInstance(Class.forName("nn.model.Connection"));
        setField(term18398, term18398.getClass(), "in", term18362);
        setField(term18398, term18398.getClass(), "out", term18362);
        setFloatField(term18398, term18398.getClass(), "weight", 0.45531428F);
        setBooleanField(term18398, term18398.getClass(), "expressed", true);
        setIntField(term18398, term18398.getClass(), "innovation", -311300330);
        ArrayList term18359 = new ArrayList();
        ((ArrayList) term18359).add(term18361);
        ((ArrayList) term18359).add(term18371);
        ((ArrayList) term18359).add(term18381);
        ((ArrayList) term18359).add(term18391);
        ((ArrayList) term18359).add(term18398);
        term18347 = newInstance(Class.forName("nn.model.Node"));
        setField(term18347, term18347.getClass(), "type", enum115);
        setIntField(term18347, term18347.getClass(), "innovation", 1966881264);
        setField(term18347, term18347.getClass(), "connections", term18359);
        setDoubleField(term18347, term18347.getClass(), "bias", 0.3485608451860187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toSomeSgring", argTypes, term18347, args);
    }

};


