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

public class UssChangeOwnerInputData_getGroup_3211182502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46946;

    public UssChangeOwnerInputData_getGroup_3211182502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47011 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term47010 = ((Class) term47011).getDeclaredField((String) "FOLLOW");
        ((Field) term47010).setAccessible(true);
        Object enum141 = ((Field) term47010).get((Object) null);
        term46946 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData"));
        setField(term46946, term46946.getClass(), "owner", "EdPAvpluZg");
        setField(term46946, term46946.getClass(), "group", "DzHVBMqWtE");
        setBooleanField(term46946, term46946.getClass(), "recursive", false);
        setField(term46946, term46946.getClass(), "links", enum141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroup", argTypes, term46946, args);
    }

};


