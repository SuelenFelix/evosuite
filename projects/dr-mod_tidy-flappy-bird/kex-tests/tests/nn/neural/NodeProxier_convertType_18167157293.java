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

public class NodeProxier_convertType_18167157293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314;
     Object enum2;

    public NodeProxier_convertType_18167157293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term315 = new HashMap();
        term314 = newInstance(Class.forName("nn.neural.NodeProxier"));
        setField(term314, term314.getClass(), "matchNodes", term315);
        Class<? extends Object> term331 = Class.forName((String) "nn.model.Type");
        Field term330 = ((Class) term331).getDeclaredField((String) "SENSOR");
        ((Field) term330).setAccessible(true);
        enum2 = ((Field) term330).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.NodeProxier");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Type");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "convertType", argTypes, term314, args);
    }

};


