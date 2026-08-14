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

public class UssSetAclInputData_Builder_setDeleteType_11767792883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1602;
     Object enum7;

    public UssSetAclInputData_Builder_setDeleteType_11767792883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1689 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term1688 = ((Class) term1689).getDeclaredField((String) "CHANGE");
        ((Field) term1688).setAccessible(true);
        Object enum5 = ((Field) term1688).get((Object) null);
        Class<? extends Object> term1929 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term1928 = ((Class) term1929).getDeclaredField((String) "DIR");
        ((Field) term1928).setAccessible(true);
        Object enum6 = ((Field) term1928).get((Object) null);
        term1602 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder"));
        setBooleanField(term1602, term1602.getClass(), "abort", false);
        setField(term1602, term1602.getClass(), "links", enum5);
        setField(term1602, term1602.getClass(), "deleteType", enum6);
        setField(term1602, term1602.getClass(), "set", "SzjVpOQTyS");
        setField(term1602, term1602.getClass(), "modify", "MjGYSRKTNF");
        setField(term1602, term1602.getClass(), "delete", "hRNSzYYIrc");
        Class<? extends Object> term2215 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term2214 = ((Class) term2215).getDeclaredField((String) "ACCESS");
        ((Field) term2214).setAccessible(true);
        enum7 = ((Field) term2214).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Object[] args = new Object[1];
        args[0] = enum7;
        callMethod(klass, "setDeleteType", argTypes, term1602, args);
    }

};


