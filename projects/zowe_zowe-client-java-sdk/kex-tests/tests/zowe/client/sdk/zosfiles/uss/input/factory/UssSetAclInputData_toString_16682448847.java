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

public class UssSetAclInputData_toString_16682448847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11709;

    public UssSetAclInputData_toString_16682448847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11782 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term11781 = ((Class) term11782).getDeclaredField((String) "SUPPRESS");
        ((Field) term11781).setAccessible(true);
        Object enum38 = ((Field) term11781).get((Object) null);
        Class<? extends Object> term12028 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term12027 = ((Class) term12028).getDeclaredField((String) "DIR");
        ((Field) term12027).setAccessible(true);
        Object enum39 = ((Field) term12027).get((Object) null);
        term11709 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData"));
        setBooleanField(term11709, term11709.getClass(), "abort", false);
        setField(term11709, term11709.getClass(), "links", enum38);
        setField(term11709, term11709.getClass(), "deleteType", enum39);
        setField(term11709, term11709.getClass(), "set", "ieCtQFdkii");
        setField(term11709, term11709.getClass(), "modify", "dEnhdmILtU");
        setField(term11709, term11709.getClass(), "delete", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term11709, args);
    }

};


