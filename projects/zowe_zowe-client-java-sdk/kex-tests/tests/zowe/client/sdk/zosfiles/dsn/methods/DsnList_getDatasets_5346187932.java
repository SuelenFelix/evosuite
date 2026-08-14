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

public class DsnList_getDatasets_5346187932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358;
     Object term371;

    public DsnList_getDatasets_5346187932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnList"));
        setField(term358, term358.getClass(), "connection", null);
        setField(term358, term358.getClass(), "request", null);
        Class<? extends Object> term498 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term497 = ((Class) term498).getDeclaredField((String) "BASE");
        ((Field) term497).setAccessible(true);
        Object enum0 = ((Field) term497).get((Object) null);
        term371 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData"));
        setField(term371, term371.getClass(), "volume", "ZiaGIbnzTs");
        setField(term371, term371.getClass(), "attribute", enum0);
        setField(term371, term371.getClass(), "maxLength", "tbcdzjIfER");
        setField(term371, term371.getClass(), "start", "HyxfbSQYBe");
        setField(term371, term371.getClass(), "recall", "pCTimMblYc");
        setField(term371, term371.getClass(), "pattern", "hNxWaHcfhY");
        setField(term371, term371.getClass(), "responseTimeout", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        Object[] args = new Object[2];
        args[0] = "aJlieCFVtF";
        args[1] = term371;
        callMethod(klass, "getDatasets", argTypes, term358, args);
    }

};


