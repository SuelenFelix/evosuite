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

public class UssSetAclInputData_isAbort_11603462731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8080;

    public UssSetAclInputData_isAbort_11603462731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8149 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term8148 = ((Class) term8149).getDeclaredField((String) "CHANGE");
        ((Field) term8148).setAccessible(true);
        Object enum26 = ((Field) term8148).get((Object) null);
        Class<? extends Object> term8389 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term8388 = ((Class) term8389).getDeclaredField((String) "DIR");
        ((Field) term8388).setAccessible(true);
        Object enum27 = ((Field) term8388).get((Object) null);
        term8080 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData"));
        setBooleanField(term8080, term8080.getClass(), "abort", false);
        setField(term8080, term8080.getClass(), "links", enum26);
        setField(term8080, term8080.getClass(), "deleteType", enum27);
        setField(term8080, term8080.getClass(), "set", "gGSMzuGICf");
        setField(term8080, term8080.getClass(), "modify", "hxCBltsObl");
        setField(term8080, term8080.getClass(), "delete", "BndsHwAFMv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAbort", argTypes, term8080, args);
    }

};


