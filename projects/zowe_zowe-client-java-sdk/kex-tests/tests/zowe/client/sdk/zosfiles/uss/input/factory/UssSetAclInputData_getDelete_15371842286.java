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

public class UssSetAclInputData_getDelete_15371842286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11100;

    public UssSetAclInputData_getDelete_15371842286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11175 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term11174 = ((Class) term11175).getDeclaredField((String) "SUPPRESS");
        ((Field) term11174).setAccessible(true);
        Object enum36 = ((Field) term11174).get((Object) null);
        Class<? extends Object> term11421 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term11420 = ((Class) term11421).getDeclaredField((String) "FILE");
        ((Field) term11420).setAccessible(true);
        Object enum37 = ((Field) term11420).get((Object) null);
        term11100 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData"));
        setBooleanField(term11100, term11100.getClass(), "abort", true);
        setField(term11100, term11100.getClass(), "links", enum36);
        setField(term11100, term11100.getClass(), "deleteType", enum37);
        setField(term11100, term11100.getClass(), "set", "MLqYREekMl");
        setField(term11100, term11100.getClass(), "modify", "ytSBIKXogI");
        setField(term11100, term11100.getClass(), "delete", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDelete", argTypes, term11100, args);
    }

};


