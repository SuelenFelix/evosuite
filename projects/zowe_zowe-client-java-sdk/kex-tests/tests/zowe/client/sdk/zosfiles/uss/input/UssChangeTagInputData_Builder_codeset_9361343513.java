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

public class UssChangeTagInputData_Builder_codeset_9361343513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16115;

    public UssChangeTagInputData_Builder_codeset_9361343513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16192 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term16191 = ((Class) term16192).getDeclaredField((String) "LIST");
        ((Field) term16191).setAccessible(true);
        Object enum47 = ((Field) term16191).get((Object) null);
        Class<? extends Object> term16461 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term16460 = ((Class) term16461).getDeclaredField((String) "TEXT");
        ((Field) term16460).setAccessible(true);
        Object enum48 = ((Field) term16460).get((Object) null);
        Class<? extends Object> term16730 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term16729 = ((Class) term16730).getDeclaredField((String) "SUPPRESS");
        ((Field) term16729).setAccessible(true);
        Object enum49 = ((Field) term16729).get((Object) null);
        term16115 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder"));
        setField(term16115, term16115.getClass(), "action", enum47);
        setField(term16115, term16115.getClass(), "type", enum48);
        setField(term16115, term16115.getClass(), "codeset", "sEccwbJKYE");
        setBooleanField(term16115, term16115.getClass(), "recursive", false);
        setField(term16115, term16115.getClass(), "links", enum49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWRooQKkdW";
        callMethod(klass, "codeset", argTypes, term16115, args);
    }

};


