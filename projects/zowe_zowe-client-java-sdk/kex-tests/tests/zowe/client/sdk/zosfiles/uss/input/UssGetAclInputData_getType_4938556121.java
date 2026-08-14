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

public class UssGetAclInputData_getType_4938556121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38541;

    public UssGetAclInputData_getType_4938556121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38572 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.GetAclType");
        Field term38571 = ((Class) term38572).getDeclaredField((String) "FILE");
        ((Field) term38571).setAccessible(true);
        Object enum120 = ((Field) term38571).get((Object) null);
        term38541 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData"));
        setField(term38541, term38541.getClass(), "type", enum120);
        setField(term38541, term38541.getClass(), "user", "RMsXuyzKJV");
        setBooleanField(term38541, term38541.getClass(), "useCommas", false);
        setBooleanField(term38541, term38541.getClass(), "suppressHeader", false);
        setBooleanField(term38541, term38541.getClass(), "suppressBaseAcl", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term38541, args);
    }

};


