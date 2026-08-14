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

public class UssChangeModeInputData_getMode_19211014441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54686;

    public UssChangeModeInputData_getMode_19211014441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54729 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term54728 = ((Class) term54729).getDeclaredField((String) "FOLLOW");
        ((Field) term54728).setAccessible(true);
        Object enum152 = ((Field) term54728).get((Object) null);
        term54686 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData"));
        setField(term54686, term54686.getClass(), "mode", "vLTbaoAxBm");
        setBooleanField(term54686, term54686.getClass(), "recursive", true);
        setField(term54686, term54686.getClass(), "links", enum152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMode", argTypes, term54686, args);
    }

};


