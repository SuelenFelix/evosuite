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

public class UssGetAclInputData_getSuppressBaseAcl_14036766345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39682;

    public UssGetAclInputData_getSuppressBaseAcl_14036766345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39711 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.GetAclType");
        Field term39710 = ((Class) term39711).getDeclaredField((String) "DIR");
        ((Field) term39710).setAccessible(true);
        Object enum124 = ((Field) term39710).get((Object) null);
        term39682 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData"));
        setField(term39682, term39682.getClass(), "type", enum124);
        setField(term39682, term39682.getClass(), "user", "izPpKDErnQ");
        setBooleanField(term39682, term39682.getClass(), "useCommas", true);
        setBooleanField(term39682, term39682.getClass(), "suppressHeader", false);
        setBooleanField(term39682, term39682.getClass(), "suppressBaseAcl", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuppressBaseAcl", argTypes, term39682, args);
    }

};


