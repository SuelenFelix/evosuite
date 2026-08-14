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

public class UssChangeOwner_changeCommon_2153583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4485;
     Object term4498;

    public UssChangeOwner_changeCommon_2153583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4485 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssChangeOwner"));
        setField(term4485, term4485.getClass(), "connection", null);
        setField(term4485, term4485.getClass(), "request", null);
        Class<? extends Object> term4573 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term4572 = ((Class) term4573).getDeclaredField((String) "CHANGE");
        ((Field) term4572).setAccessible(true);
        Object enum10 = ((Field) term4572).get((Object) null);
        term4498 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData"));
        setField(term4498, term4498.getClass(), "owner", "ieCtQFdkii");
        setField(term4498, term4498.getClass(), "group", "dEnhdmILtU");
        setBooleanField(term4498, term4498.getClass(), "recursive", false);
        setField(term4498, term4498.getClass(), "links", enum10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssChangeOwner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData");
        Object[] args = new Object[2];
        args[0] = "nHXjMycHlU";
        args[1] = term4498;
        callMethod(klass, "changeCommon", argTypes, term4485, args);
    }

};


