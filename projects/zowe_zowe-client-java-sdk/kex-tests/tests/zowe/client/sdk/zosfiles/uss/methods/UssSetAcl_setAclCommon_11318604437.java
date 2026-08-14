package zowe.client.sdk.zosfiles.uss.methods;

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
import static zowe.client.sdk.zosfiles.uss.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UssSetAcl_setAclCommon_11318604437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3355;
     Object term3368;

    public UssSetAcl_setAclCommon_11318604437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3355 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssSetAcl"));
        setField(term3355, term3355.getClass(), "connection", null);
        setField(term3355, term3355.getClass(), "request", null);
        Class<? extends Object> term3447 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term3446 = ((Class) term3447).getDeclaredField((String) "CHANGE");
        ((Field) term3446).setAccessible(true);
        Object enum7 = ((Field) term3446).get((Object) null);
        Class<? extends Object> term3687 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term3686 = ((Class) term3687).getDeclaredField((String) "DIR");
        ((Field) term3686).setAccessible(true);
        Object enum8 = ((Field) term3686).get((Object) null);
        term3368 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData"));
        setBooleanField(term3368, term3368.getClass(), "abort", true);
        setField(term3368, term3368.getClass(), "links", enum7);
        setField(term3368, term3368.getClass(), "deleteType", enum8);
        setField(term3368, term3368.getClass(), "set", "tShwQLRGNe");
        setField(term3368, term3368.getClass(), "modify", "LvtrsXUliU");
        setField(term3368, term3368.getClass(), "delete", "xLbjWUgOIL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssSetAcl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData");
        Object[] args = new Object[2];
        args[0] = "GzFkzHGYFt";
        args[1] = term3368;
        callMethod(klass, "setAclCommon", argTypes, term3355, args);
    }

};


