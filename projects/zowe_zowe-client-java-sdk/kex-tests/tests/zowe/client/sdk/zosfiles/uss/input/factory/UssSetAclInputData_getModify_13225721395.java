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

public class UssSetAclInputData_getModify_13225721395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10501;

    public UssSetAclInputData_getModify_13225721395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10572 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term10571 = ((Class) term10572).getDeclaredField((String) "FOLLOW");
        ((Field) term10571).setAccessible(true);
        Object enum34 = ((Field) term10571).get((Object) null);
        Class<? extends Object> term10812 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term10811 = ((Class) term10812).getDeclaredField((String) "FILE");
        ((Field) term10811).setAccessible(true);
        Object enum35 = ((Field) term10811).get((Object) null);
        term10501 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData"));
        setBooleanField(term10501, term10501.getClass(), "abort", true);
        setField(term10501, term10501.getClass(), "links", enum34);
        setField(term10501, term10501.getClass(), "deleteType", enum35);
        setField(term10501, term10501.getClass(), "set", "onpbIeEKoi");
        setField(term10501, term10501.getClass(), "modify", "YRHGsAkhxb");
        setField(term10501, term10501.getClass(), "delete", "ffYhPOzlUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModify", argTypes, term10501, args);
    }

};


