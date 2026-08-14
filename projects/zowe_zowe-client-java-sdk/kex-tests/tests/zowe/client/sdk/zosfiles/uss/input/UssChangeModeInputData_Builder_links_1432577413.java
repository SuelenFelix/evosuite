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

public class UssChangeModeInputData_Builder_links_1432577413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29118;
     Object enum91;

    public UssChangeModeInputData_Builder_links_1432577413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29161 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term29160 = ((Class) term29161).getDeclaredField((String) "CHANGE");
        ((Field) term29160).setAccessible(true);
        enum91 = ((Field) term29160).get((Object) null);
        term29118 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData$Builder"));
        setField(term29118, term29118.getClass(), "mode", "yVMkkQhvmN");
        setBooleanField(term29118, term29118.getClass(), "recursive", false);
        setField(term29118, term29118.getClass(), "links", enum91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.LinkType");
        Object[] args = new Object[1];
        args[0] = enum91;
        callMethod(klass, "links", argTypes, term29118, args);
    }

};


