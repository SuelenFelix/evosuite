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

public class UssGetAclInputData_getSuppressHeader_5244136044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39388;

    public UssGetAclInputData_getSuppressHeader_5244136044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39423 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.GetAclType");
        Field term39422 = ((Class) term39423).getDeclaredField((String) "ACCESS");
        ((Field) term39422).setAccessible(true);
        Object enum123 = ((Field) term39422).get((Object) null);
        term39388 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData"));
        setField(term39388, term39388.getClass(), "type", enum123);
        setField(term39388, term39388.getClass(), "user", "QduALnDSVo");
        setBooleanField(term39388, term39388.getClass(), "useCommas", false);
        setBooleanField(term39388, term39388.getClass(), "suppressHeader", false);
        setBooleanField(term39388, term39388.getClass(), "suppressBaseAcl", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuppressHeader", argTypes, term39388, args);
    }

};


