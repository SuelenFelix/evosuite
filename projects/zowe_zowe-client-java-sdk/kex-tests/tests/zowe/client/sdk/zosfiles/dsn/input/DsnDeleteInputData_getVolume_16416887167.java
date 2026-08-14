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

public class DsnDeleteInputData_getVolume_16416887167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16789;

    public DsnDeleteInputData_getVolume_16416887167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16838 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.DeleteType");
        Field term16837 = ((Class) term16838).getDeclaredField((String) "DATASET");
        ((Field) term16837).setAccessible(true);
        Object enum10 = ((Field) term16837).get((Object) null);
        term16789 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDeleteInputData"));
        setField(term16789, term16789.getClass(), "type", enum10);
        setField(term16789, term16789.getClass(), "datasetName", "NZdTuwSCIM");
        setField(term16789, term16789.getClass(), "memberName", "dDHcmzPAmP");
        setField(term16789, term16789.getClass(), "volume", "HEaTkWYBgv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDeleteInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolume", argTypes, term16789, args);
    }

};


