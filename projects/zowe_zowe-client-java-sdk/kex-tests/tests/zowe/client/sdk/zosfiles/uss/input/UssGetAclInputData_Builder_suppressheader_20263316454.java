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
import java.lang.Boolean;

public class UssGetAclInputData_Builder_suppressheader_20263316454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51092;
     Object term51126;

    public UssGetAclInputData_Builder_suppressheader_20263316454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51129 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.GetAclType");
        Field term51128 = ((Class) term51129).getDeclaredField((String) "ACCESS");
        ((Field) term51128).setAccessible(true);
        Object enum148 = ((Field) term51128).get((Object) null);
        term51092 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder"));
        setField(term51092, term51092.getClass(), "type", enum148);
        setField(term51092, term51092.getClass(), "user", "gltJarNuUk");
        setBooleanField(term51092, term51092.getClass(), "usecommas", true);
        setBooleanField(term51092, term51092.getClass(), "suppressheader", true);
        setBooleanField(term51092, term51092.getClass(), "suppressbaseacl", false);
        term51126 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term51126;
        callMethod(klass, "suppressheader", argTypes, term51092, args);
    }

};


