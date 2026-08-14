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
import java.lang.Boolean;

public class UssChangeModeInputData_Builder_recursive_1810894912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28824;
     Object term28860;

    public UssChangeModeInputData_Builder_recursive_1810894912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28873 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term28872 = ((Class) term28873).getDeclaredField((String) "SUPPRESS");
        ((Field) term28872).setAccessible(true);
        Object enum90 = ((Field) term28872).get((Object) null);
        term28824 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData$Builder"));
        setField(term28824, term28824.getClass(), "mode", "LWyEaeIyAo");
        setBooleanField(term28824, term28824.getClass(), "recursive", true);
        setField(term28824, term28824.getClass(), "links", enum90);
        term28860 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term28860;
        callMethod(klass, "recursive", argTypes, term28824, args);
    }

};


