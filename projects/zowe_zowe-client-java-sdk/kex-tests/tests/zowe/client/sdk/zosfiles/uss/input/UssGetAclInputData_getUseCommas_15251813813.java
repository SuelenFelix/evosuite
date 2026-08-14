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

public class UssGetAclInputData_getUseCommas_15251813813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39104;

    public UssGetAclInputData_getUseCommas_15251813813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39135 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.GetAclType");
        Field term39134 = ((Class) term39135).getDeclaredField((String) "FILE");
        ((Field) term39134).setAccessible(true);
        Object enum122 = ((Field) term39134).get((Object) null);
        term39104 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData"));
        setField(term39104, term39104.getClass(), "type", enum122);
        setField(term39104, term39104.getClass(), "user", "hOncybyCAH");
        setBooleanField(term39104, term39104.getClass(), "useCommas", false);
        setBooleanField(term39104, term39104.getClass(), "suppressHeader", false);
        setBooleanField(term39104, term39104.getClass(), "suppressBaseAcl", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUseCommas", argTypes, term39104, args);
    }

};


