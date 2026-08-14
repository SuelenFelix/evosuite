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

public class UssChangeMode_change_19468784392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3978;
     Object term3991;

    public UssChangeMode_change_19468784392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3978 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssChangeMode"));
        setField(term3978, term3978.getClass(), "connection", null);
        setField(term3978, term3978.getClass(), "request", null);
        Class<? extends Object> term4048 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term4047 = ((Class) term4048).getDeclaredField((String) "SUPPRESS");
        ((Field) term4047).setAccessible(true);
        Object enum9 = ((Field) term4047).get((Object) null);
        term3991 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData"));
        setField(term3991, term3991.getClass(), "mode", "nGKItKLYNC");
        setBooleanField(term3991, term3991.getClass(), "recursive", true);
        setField(term3991, term3991.getClass(), "links", enum9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssChangeMode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData");
        Object[] args = new Object[2];
        args[0] = "jDtqGUpnZN";
        args[1] = term3991;
        callMethod(klass, "change", argTypes, term3978, args);
    }

};


