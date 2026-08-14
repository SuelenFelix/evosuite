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

public class UssChangeModeInputData_Builder_mode_3681004491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28520;

    public UssChangeModeInputData_Builder_mode_3681004491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28575 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term28574 = ((Class) term28575).getDeclaredField((String) "FOLLOW");
        ((Field) term28574).setAccessible(true);
        Object enum89 = ((Field) term28574).get((Object) null);
        term28520 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData$Builder"));
        setField(term28520, term28520.getClass(), "mode", "PznxWXsZME");
        setBooleanField(term28520, term28520.getClass(), "recursive", false);
        setField(term28520, term28520.getClass(), "links", enum89);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZzIujlwVsw";
        callMethod(klass, "mode", argTypes, term28520, args);
    }

};


