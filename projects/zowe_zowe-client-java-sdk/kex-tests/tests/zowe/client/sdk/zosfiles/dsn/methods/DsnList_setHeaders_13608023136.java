package zowe.client.sdk.zosfiles.dsn.methods;

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
import static zowe.client.sdk.zosfiles.dsn.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedHashMap;

public class DsnList_setHeaders_13608023136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1708;
     Object term1709;
     Object term1789;

    public DsnList_setHeaders_13608023136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1708 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnList"));
        setField(term1708, term1708.getClass(), "connection", null);
        setField(term1708, term1708.getClass(), "request", null);
        Class<? extends Object> term1833 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term1832 = ((Class) term1833).getDeclaredField((String) "VOL");
        ((Field) term1832).setAccessible(true);
        Object enum3 = ((Field) term1832).get((Object) null);
        term1709 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData"));
        setField(term1709, term1709.getClass(), "volume", "nyiiPDVjAc");
        setField(term1709, term1709.getClass(), "attribute", enum3);
        setField(term1709, term1709.getClass(), "maxLength", "aKnKipADSo");
        setField(term1709, term1709.getClass(), "start", "wSQxaModmm");
        setField(term1709, term1709.getClass(), "recall", "UlajhuVLaP");
        setField(term1709, term1709.getClass(), "pattern", "gGSMzuGICf");
        setField(term1709, term1709.getClass(), "responseTimeout", "hxCBltsObl");
        term1789 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term1709;
        args[1] = term1789;
        callMethod(klass, "setHeaders", argTypes, term1708, args);
    }

};


