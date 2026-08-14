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

public class UssGetAclInputData_Builder_build_13103412386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51669;

    public UssGetAclInputData_Builder_build_13103412386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51704 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.GetAclType");
        Field term51703 = ((Class) term51704).getDeclaredField((String) "ACCESS");
        ((Field) term51703).setAccessible(true);
        Object enum150 = ((Field) term51703).get((Object) null);
        term51669 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder"));
        setField(term51669, term51669.getClass(), "type", enum150);
        setField(term51669, term51669.getClass(), "user", "sOdkipUKRu");
        setBooleanField(term51669, term51669.getClass(), "usecommas", true);
        setBooleanField(term51669, term51669.getClass(), "suppressheader", true);
        setBooleanField(term51669, term51669.getClass(), "suppressbaseacl", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term51669, args);
    }

};


