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
     Object term18363;

    public Node_toSomeSgring_173069254411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18422 = Class.forName((String) "nn.model.Type");
        Field term18421 = ((Class) term18422).getDeclaredField((String) "HIDDEN");
        ((Field) term18421).setAccessible(true);
        Object enum115 = ((Field) term18421).get((Object) null);
        Object term18377 = newInstance(Class.forName("nn.model.Connection"));
        Object term18378 = newInstance(Class.forName("nn.model.Node"));
        Object term18381 = newInstance(Class.forName("nn.model.Node"));
        setField(term18378, term18378.getClass(), "type", null);
        setIntField(term18378, term18378.getClass(), "innovation", -1707655562);
        setField(term18378, term18378.getClass(), "connections", null);
        setDoubleField(term18378, term18378.getClass(), "bias", 0.9009620538952149);
        setField(term18377, term18377.getClass(), "in", term18378);
        setField(term18381, term18381.getClass(), "type", enum115);
        setIntField(term18381, term18381.getClass(), "innovation", 1525815085);
        setField(term18381, term18381.getClass(), "connections", null);
        setDoubleField(term18381, term18381.getClass(), "bias", 0.09598300824663397);
        setField(term18377, term18377.getClass(), "out", term18381);
        setFloatField(term18377, term18377.getClass(), "weight", 0.75266284F);
        setBooleanField(term18377, term18377.getClass(), "expressed", false);
        setIntField(term18377, term18377.getClass(), "innovation", 1785476260);
        Object term18387 = newInstance(Class.forName("nn.model.Connection"));
        Object term18388 = newInstance(Class.forName("nn.model.Node"));
        Object term18391 = newInstance(Class.forName("nn.model.Node"));
        setField(term18388, term18388.getClass(), "type", null);
        setIntField(term18388, term18388.getClass(), "innovation", -655035002);
        setField(term18388, term18388.getClass(), "connections", null);
        setDoubleField(term18388, term18388.getClass(), "bias", 0.9091029161718786);
        setField(term18387, term18387.getClass(), "in", term18388);
        setField(term18391, term18391.getClass(), "type", null);
        setIntField(term18391, term18391.getClass(), "innovation", 2114761003);
        setField(term18391, term18391.getClass(), "connections", null);
        setDoubleField(term18391, term18391.getClass(), "bias", 0.3488342586091009);
        setField(term18387, term18387.getClass(), "out", term18391);
        setFloatField(term18387, term18387.getClass(), "weight", 0.01555711F);
        setBooleanField(term18387, term18387.getClass(), "expressed", false);
        setIntField(term18387, term18387.getClass(), "innovation", 622731276);
        Object term18397 = newInstance(Class.forName("nn.model.Connection"));
        Object term18398 = newInstance(Class.forName("nn.model.Node"));
        Object term18401 = newInstance(Class.forName("nn.model.Node"));
        setField(term18398, term18398.getClass(), "type", null);
        setIntField(term18398, term18398.getClass(), "innovation", 0);
        setField(term18398, term18398.getClass(), "connections", null);
        setDoubleField(term18398, term18398.getClass(), "bias", 0.0);
        setField(term18397, term18397.getClass(), "in", term18398);
        setField(term18401, term18401.getClass(), "type", null);
        setIntField(term18401, term18401.getClass(), "innovation", 0);
        setField(term18401, term18401.getClass(), "connections", null);
        setDoubleField(term18401, term18401.getClass(), "bias", 0.0);
        setField(term18397, term18397.getClass(), "out", term18401);
        setFloatField(term18397, term18397.getClass(), "weight", 0.66095555F);
        setBooleanField(term18397, term18397.getClass(), "expressed", false);
        setIntField(term18397, term18397.getClass(), "innovation", 380526008);
        Object term18407 = newInstance(Class.forName("nn.model.Connection"));
        Object term18408 = newInstance(Class.forName("nn.model.Node"));
        setField(term18408, term18408.getClass(), "type", null);
        setIntField(term18408, term18408.getClass(), "innovation", -456566581);
        setField(term18408, term18408.getClass(), "connections", null);
        setDoubleField(term18408, term18408.getClass(), "bias", 0.07084009583074191);
        setField(term18407, term18407.getClass(), "in", term18408);
        setField(term18407, term18407.getClass(), "out", term18388);
        setFloatField(term18407, term18407.getClass(), "weight", 0.20773286F);
        setBooleanField(term18407, term18407.getClass(), "expressed", true);
        setIntField(term18407, term18407.getClass(), "innovation", -1542216721);
        Object term18414 = newInstance(Class.forName("nn.model.Connection"));
        setField(term18414, term18414.getClass(), "in", term18378);
        setField(term18414, term18414.getClass(), "out", term18378);
        setFloatField(term18414, term18414.getClass(), "weight", 0.45531428F);
        setBooleanField(term18414, term18414.getClass(), "expressed", true);
        setIntField(term18414, term18414.getClass(), "innovation", -311300330);
        ArrayList term18375 = new ArrayList();
        ((ArrayList) term18375).add(term18377);
        ((ArrayList) term18375).add(term18387);
        ((ArrayList) term18375).add(term18397);
        ((ArrayList) term18375).add(term18407);
        ((ArrayList) term18375).add(term18414);
        term18363 = newInstance(Class.forName("nn.model.Node"));
        setField(term18363, term18363.getClass(), "type", enum115);
        setIntField(term18363, term18363.getClass(), "innovation", 1966881264);
        setField(term18363, term18363.getClass(), "connections", term18375);
        setDoubleField(term18363, term18363.getClass(), "bias", 0.3485608451860187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toSomeSgring", argTypes, term18363, args);
    }

};


