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

public class UssChangeOwnerInputData_toString_17573812025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47868;

    public UssChangeOwnerInputData_toString_17573812025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47933 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term47932 = ((Class) term47933).getDeclaredField((String) "FOLLOW");
        ((Field) term47932).setAccessible(true);
        Object enum144 = ((Field) term47932).get((Object) null);
        term47868 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData"));
        setField(term47868, term47868.getClass(), "owner", "NTWMiBEaDF");
        setField(term47868, term47868.getClass(), "group", "SPBstwKFVr");
        setBooleanField(term47868, term47868.getClass(), "recursive", true);
        setField(term47868, term47868.getClass(), "links", enum144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term47868, args);
    }

};


