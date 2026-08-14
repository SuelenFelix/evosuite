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

public class UssChangeModeInputData_init_13884940560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54404;

    public UssChangeModeInputData_init_13884940560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54447 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term54446 = ((Class) term54447).getDeclaredField((String) "CHANGE");
        ((Field) term54446).setAccessible(true);
        Object enum151 = ((Field) term54446).get((Object) null);
        term54404 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData$Builder"));
        setField(term54404, term54404.getClass(), "mode", "GeddnXjHGy");
        setBooleanField(term54404, term54404.getClass(), "recursive", false);
        setField(term54404, term54404.getClass(), "links", enum151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term54404;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


