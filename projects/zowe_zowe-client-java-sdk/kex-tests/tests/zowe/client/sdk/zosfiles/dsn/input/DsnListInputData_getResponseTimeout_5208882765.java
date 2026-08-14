package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DsnListInputData_getResponseTimeout_5208882765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24298;

    public DsnListInputData_getResponseTimeout_5208882765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24389 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term24388 = ((Class) term24389).getDeclaredField((String) "VOL");
        ((Field) term24388).setAccessible(true);
        Object enum25 = ((Field) term24388).get((Object) null);
        term24298 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData"));
        setField(term24298, term24298.getClass(), "volume", "HqitWglYWX");
        setField(term24298, term24298.getClass(), "attribute", enum25);
        setField(term24298, term24298.getClass(), "maxLength", "pOuFRlHmbK");
        setField(term24298, term24298.getClass(), "start", "WrzdBkinqV");
        setField(term24298, term24298.getClass(), "recall", "vydWXHfFTw");
        setField(term24298, term24298.getClass(), "pattern", "DRhkpDneCC");
        setField(term24298, term24298.getClass(), "responseTimeout", "vuIJRrypuA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResponseTimeout", argTypes, term24298, args);
    }

};


