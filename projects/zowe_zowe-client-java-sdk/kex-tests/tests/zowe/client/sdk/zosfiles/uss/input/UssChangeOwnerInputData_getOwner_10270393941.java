package zowe.client.sdk.zosfiles.uss.input;

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
import static zowe.client.sdk.zosfiles.uss.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UssChangeOwnerInputData_getOwner_10270393941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46632;

    public UssChangeOwnerInputData_getOwner_10270393941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46701 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term46700 = ((Class) term46701).getDeclaredField((String) "SUPPRESS");
        ((Field) term46700).setAccessible(true);
        Object enum140 = ((Field) term46700).get((Object) null);
        term46632 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData"));
        setField(term46632, term46632.getClass(), "owner", "vLerpqavFM");
        setField(term46632, term46632.getClass(), "group", "qnvxzwuGKX");
        setBooleanField(term46632, term46632.getClass(), "recursive", true);
        setField(term46632, term46632.getClass(), "links", enum140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwner", argTypes, term46632, args);
    }

};


