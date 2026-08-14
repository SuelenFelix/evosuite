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

public class UssChangeOwnerInputData_init_19917488200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46318;

    public UssChangeOwnerInputData_init_19917488200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46387 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term46386 = ((Class) term46387).getDeclaredField((String) "SUPPRESS");
        ((Field) term46386).setAccessible(true);
        Object enum139 = ((Field) term46386).get((Object) null);
        term46318 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData$Builder"));
        setField(term46318, term46318.getClass(), "owner", "yUGCjlqgJE");
        setField(term46318, term46318.getClass(), "group", "PXdVZyoJyC");
        setBooleanField(term46318, term46318.getClass(), "recursive", false);
        setField(term46318, term46318.getClass(), "links", enum139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term46318;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


