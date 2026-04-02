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
     Object term18357;

    public Node_toSomeSgring_173069254411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18416 = Class.forName((String) "nn.model.Type");
        Field term18415 = ((Class) term18416).getDeclaredField((String) "HIDDEN");
        ((Field) term18415).setAccessible(true);
        Object enum115 = ((Field) term18415).get((Object) null);
        Object term18371 = newInstance(Class.forName("nn.model.Connection"));
        Object term18372 = newInstance(Class.forName("nn.model.Node"));
        Object term18375 = newInstance(Class.forName("nn.model.Node"));
        setField(term18372, term18372.getClass(), "type", null);
        setIntField(term18372, term18372.getClass(), "innovation", -1707655562);
        setField(term18372, term18372.getClass(), "connections", null);
        setDoubleField(term18372, term18372.getClass(), "bias", 0.9009620538952149);
        setField(term18371, term18371.getClass(), "in", term18372);
        setField(term18375, term18375.getClass(), "type", enum115);
        setIntField(term18375, term18375.getClass(), "innovation", 1525815085);
        setField(term18375, term18375.getClass(), "connections", null);
        setDoubleField(term18375, term18375.getClass(), "bias", 0.09598300824663397);
        setField(term18371, term18371.getClass(), "out", term18375);
        setFloatField(term18371, term18371.getClass(), "weight", 0.75266284F);
        setBooleanField(term18371, term18371.getClass(), "expressed", false);
        setIntField(term18371, term18371.getClass(), "innovation", 1785476260);
        Object term18381 = newInstance(Class.forName("nn.model.Connection"));
        Object term18382 = newInstance(Class.forName("nn.model.Node"));
        Object term18385 = newInstance(Class.forName("nn.model.Node"));
        setField(term18382, term18382.getClass(), "type", null);
        setIntField(term18382, term18382.getClass(), "innovation", -655035002);
        setField(term18382, term18382.getClass(), "connections", null);
        setDoubleField(term18382, term18382.getClass(), "bias", 0.9091029161718786);
        setField(term18381, term18381.getClass(), "in", term18382);
        setField(term18385, term18385.getClass(), "type", null);
        setIntField(term18385, term18385.getClass(), "innovation", 2114761003);
        setField(term18385, term18385.getClass(), "connections", null);
        setDoubleField(term18385, term18385.getClass(), "bias", 0.3488342586091009);
        setField(term18381, term18381.getClass(), "out", term18385);
        setFloatField(term18381, term18381.getClass(), "weight", 0.01555711F);
        setBooleanField(term18381, term18381.getClass(), "expressed", false);
        setIntField(term18381, term18381.getClass(), "innovation", 622731276);
        Object term18391 = newInstance(Class.forName("nn.model.Connection"));
        Object term18392 = newInstance(Class.forName("nn.model.Node"));
        Object term18395 = newInstance(Class.forName("nn.model.Node"));
        setField(term18392, term18392.getClass(), "type", null);
        setIntField(term18392, term18392.getClass(), "innovation", 0);
        setField(term18392, term18392.getClass(), "connections", null);
        setDoubleField(term18392, term18392.getClass(), "bias", 0.0);
        setField(term18391, term18391.getClass(), "in", term18392);
        setField(term18395, term18395.getClass(), "type", null);
        setIntField(term18395, term18395.getClass(), "innovation", 0);
        setField(term18395, term18395.getClass(), "connections", null);
        setDoubleField(term18395, term18395.getClass(), "bias", 0.0);
        setField(term18391, term18391.getClass(), "out", term18395);
        setFloatField(term18391, term18391.getClass(), "weight", 0.66095555F);
        setBooleanField(term18391, term18391.getClass(), "expressed", false);
        setIntField(term18391, term18391.getClass(), "innovation", 380526008);
        Object term18401 = newInstance(Class.forName("nn.model.Connection"));
        Object term18402 = newInstance(Class.forName("nn.model.Node"));
        setField(term18402, term18402.getClass(), "type", null);
        setIntField(term18402, term18402.getClass(), "innovation", -456566581);
        setField(term18402, term18402.getClass(), "connections", null);
        setDoubleField(term18402, term18402.getClass(), "bias", 0.07084009583074191);
        setField(term18401, term18401.getClass(), "in", term18402);
        setField(term18401, term18401.getClass(), "out", term18382);
        setFloatField(term18401, term18401.getClass(), "weight", 0.20773286F);
        setBooleanField(term18401, term18401.getClass(), "expressed", true);
        setIntField(term18401, term18401.getClass(), "innovation", -1542216721);
        Object term18408 = newInstance(Class.forName("nn.model.Connection"));
        setField(term18408, term18408.getClass(), "in", term18372);
        setField(term18408, term18408.getClass(), "out", term18372);
        setFloatField(term18408, term18408.getClass(), "weight", 0.45531428F);
        setBooleanField(term18408, term18408.getClass(), "expressed", true);
        setIntField(term18408, term18408.getClass(), "innovation", -311300330);
        ArrayList term18369 = new ArrayList();
        ((ArrayList) term18369).add(term18371);
        ((ArrayList) term18369).add(term18381);
        ((ArrayList) term18369).add(term18391);
        ((ArrayList) term18369).add(term18401);
        ((ArrayList) term18369).add(term18408);
        term18357 = newInstance(Class.forName("nn.model.Node"));
        setField(term18357, term18357.getClass(), "type", enum115);
        setIntField(term18357, term18357.getClass(), "innovation", 1966881264);
        setField(term18357, term18357.getClass(), "connections", term18369);
        setDoubleField(term18357, term18357.getClass(), "bias", 0.3485608451860187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toSomeSgring", argTypes, term18357, args);
    }

};


