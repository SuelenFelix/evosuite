package zowe.client.sdk.zosfiles.uss.input.factory;

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
import static zowe.client.sdk.zosfiles.uss.input.factory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UssSetAclInputData_getDeleteType_7598188703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9288;

    public UssSetAclInputData_getDeleteType_7598188703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9361 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term9360 = ((Class) term9361).getDeclaredField((String) "SUPPRESS");
        ((Field) term9360).setAccessible(true);
        Object enum30 = ((Field) term9360).get((Object) null);
        Class<? extends Object> term9607 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term9606 = ((Class) term9607).getDeclaredField((String) "DIR");
        ((Field) term9606).setAccessible(true);
        Object enum31 = ((Field) term9606).get((Object) null);
        term9288 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData"));
        setBooleanField(term9288, term9288.getClass(), "abort", true);
        setField(term9288, term9288.getClass(), "links", enum30);
        setField(term9288, term9288.getClass(), "deleteType", enum31);
        setField(term9288, term9288.getClass(), "set", "xLbjWUgOIL");
        setField(term9288, term9288.getClass(), "modify", "jDtqGUpnZN");
        setField(term9288, term9288.getClass(), "delete", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeleteType", argTypes, term9288, args);
    }

};


