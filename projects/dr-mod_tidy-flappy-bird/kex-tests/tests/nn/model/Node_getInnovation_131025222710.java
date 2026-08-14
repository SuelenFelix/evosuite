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

public class Node_getInnovation_131025222710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18256;

    public Node_getInnovation_131025222710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18274 = Class.forName((String) "nn.model.Type");
        Field term18273 = ((Class) term18274).getDeclaredField((String) "HIDDEN");
        ((Field) term18273).setAccessible(true);
        Object enum114 = ((Field) term18273).get((Object) null);
        ArrayList term18268 = new ArrayList();
        term18256 = newInstance(Class.forName("nn.model.Node"));
        setField(term18256, term18256.getClass(), "type", enum114);
        setIntField(term18256, term18256.getClass(), "innovation", 1370082921);
        setField(term18256, term18256.getClass(), "connections", term18268);
        setDoubleField(term18256, term18256.getClass(), "bias", 0.4214941757931592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInnovation", argTypes, term18256, args);
    }

};


