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

public class UssGetAclInputData_toString_18717715236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39961;

    public UssGetAclInputData_toString_18717715236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39992 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.GetAclType");
        Field term39991 = ((Class) term39992).getDeclaredField((String) "FILE");
        ((Field) term39991).setAccessible(true);
        Object enum125 = ((Field) term39991).get((Object) null);
        term39961 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData"));
        setField(term39961, term39961.getClass(), "type", enum125);
        setField(term39961, term39961.getClass(), "user", "NnpwZBUTvx");
        setBooleanField(term39961, term39961.getClass(), "useCommas", true);
        setBooleanField(term39961, term39961.getClass(), "suppressHeader", true);
        setBooleanField(term39961, term39961.getClass(), "suppressBaseAcl", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term39961, args);
    }

};


