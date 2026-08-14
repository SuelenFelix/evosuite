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

public class DsnDeleteInputData_getType_17233037174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15768;

    public DsnDeleteInputData_getType_17233037174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15821 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.DeleteType");
        Field term15820 = ((Class) term15821).getDeclaredField((String) "UNCATALOGED");
        ((Field) term15820).setAccessible(true);
        Object enum7 = ((Field) term15820).get((Object) null);
        term15768 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDeleteInputData"));
        setField(term15768, term15768.getClass(), "type", enum7);
        setField(term15768, term15768.getClass(), "datasetName", "LXnDNrMsqT");
        setField(term15768, term15768.getClass(), "memberName", "ZLQamJFBmu");
        setField(term15768, term15768.getClass(), "volume", "ZWcOCwKNvd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDeleteInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term15768, args);
    }

};


